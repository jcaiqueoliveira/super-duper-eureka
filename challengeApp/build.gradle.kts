plugins {
    id(libs.plugins.multiplatform.get().pluginId)
    alias(libs.plugins.compose)
    id(libs.plugins.android.library.get().pluginId)
    alias(libs.plugins.kotlinx.serialization)
}
setupKMP()
kotlin {

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(project(":features:store"))
                implementation(project(":platform:core"))
                implementation(project(":platform:design"))
                implementation(compose.runtime)
                implementation(compose.foundation)
                implementation(compose.material)
                implementation(libs.voyager.navigator)
            }
        }

        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }

        val androidMain by getting {
            dependencies {
                implementation(libs.kotlinx.coroutines.android)
                implementation(libs.ktor.client.okhttp)
            }
        }

        val jsMain by getting
        val iosMain by getting {
            dependencies {
                implementation(libs.ktor.client.darwin)
            }
        }

        val iosSimulatorArm64Test by getting
        val iosTest by getting {
            iosSimulatorArm64Test.dependsOn(this)
        }
    }
}

android {
    namespace = "com.kanda.labs.shared"

    sourceSets["main"].apply {
        res.srcDirs("src/androidMain/resources")
    }
}