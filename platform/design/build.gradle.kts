plugins {
    id(libs.plugins.multiplatform.get().pluginId)
    alias(libs.plugins.compose)
    id(libs.plugins.android.library.get().pluginId)
    alias(libs.plugins.paparazzi.plugin)
}
setupKMP()
kotlin {

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(compose.runtime)
                implementation(compose.foundation)
                implementation(compose.material)
                implementation(libs.composeImageLoader)
                implementation(libs.composeIcons.featherIcons)
                implementation(libs.multiplatformSettings)
            }
        }

        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }

        val androidMain by getting
        val androidUnitTest by getting
        val jsMain by getting
        val iosMain by getting

        val iosSimulatorArm64Test by getting
        val iosTest by getting {
            iosSimulatorArm64Test.dependsOn(this)
        }
    }
}

android {
    namespace = "com.kanda.labs.platform.design"

    sourceSets["main"].apply {
        res.srcDirs("src/androidMain/resources")
    }
    packagingOptions {
        resources.excludes.add("META-INF/**")
    }
}