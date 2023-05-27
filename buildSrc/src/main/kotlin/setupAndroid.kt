import com.android.build.gradle.BaseExtension
import com.android.build.gradle.LibraryExtension
import org.gradle.api.JavaVersion
import org.gradle.api.Project
import org.gradle.api.artifacts.VersionCatalogsExtension
import org.gradle.api.plugins.ExtensionAware
import org.gradle.kotlin.dsl.configure
import org.gradle.kotlin.dsl.creating
import org.gradle.kotlin.dsl.findByType
import org.gradle.kotlin.dsl.get
import org.gradle.kotlin.dsl.getByType
import org.gradle.kotlin.dsl.getValue
import org.gradle.kotlin.dsl.getting
import org.gradle.kotlin.dsl.invoke
import org.gradle.kotlin.dsl.withType
import org.jetbrains.kotlin.gradle.dsl.KotlinJvmOptions
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

private fun BaseExtension.setupAndroid() {
    compileSdkVersion(33)
    defaultConfig {
        minSdk = 26
        targetSdk = 33

        versionCode = 1
        versionName = "0.0.1"
    }
}

fun Project.setupAndroidModule() {
    val androidExtension: BaseExtension = extensions.findByType<LibraryExtension>()
        ?: extensions.findByType<com.android.build.gradle.AppExtension>()
        ?: error("Could not found Android application or library plugin applied on module $name")

    val libs = extensions.getByType<VersionCatalogsExtension>().named("libs")
    val composeCompilerVersion = libs.findVersion("composeCompilerAndroid").get().requiredVersion

    androidExtension.apply {
        setupAndroid()

        buildFeatures.apply {
            compose = true
        }

        composeOptions {
            kotlinCompilerExtensionVersion = composeCompilerVersion
        }

        compileOptions {
            sourceCompatibility = JavaVersion.VERSION_1_8
            targetCompatibility = JavaVersion.VERSION_1_8
        }

        testOptions {
            unitTests.all {
                it.useJUnitPlatform()
            }
        }

        (this as ExtensionAware).extensions.configure<KotlinJvmOptions> {
            configureKotlinJvmOptions()
        }
    }
}

fun Project.setupKMP() {
    plugins.withType<org.jetbrains.kotlin.gradle.plugin.KotlinBasePluginWrapper> {
        extensions.configure<KotlinMultiplatformExtension> {
            explicitApi()

            // app target
            android()
            js(IR) {
                browser()
            }
            ios()
            iosSimulatorArm64()

            sourceSets {
                val commonMain by getting
                val commonTest by getting
                val jvmMain by creating {
                    dependsOn(commonMain)
                }
                val jvmTest by creating {
                    dependsOn(commonTest)
                }

                val androidMain by getting {
                    dependsOn(jvmMain)
                }
                val iosMain by getting
                val iosSimulatorArm64Main by getting {
                    dependsOn(iosMain)
                }
            }
        }

        findAndroidExtension().apply {
            setupAndroid()
            sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")
        }

        tasks.withType<KotlinCompile> {
            kotlinOptions.configureKotlinJvmOptions()
        }
    }
}

private fun KotlinJvmOptions.configureKotlinJvmOptions() {
    jvmTarget = JavaVersion.VERSION_1_8.toString()

    freeCompilerArgs += "-Xexplicit-api=strict"
}

private fun Project.findAndroidExtension(): BaseExtension =
    extensions.findByType<LibraryExtension>()
        ?: extensions.findByType<com.android.build.gradle.AppExtension>()
        ?: error("Could not found Android application or library plugin applied on module $name")