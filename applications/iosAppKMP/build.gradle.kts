plugins {
    id(libs.plugins.multiplatform.get().pluginId)
    alias(libs.plugins.compose)
    id(libs.plugins.cocoapods.get().pluginId)
}

kotlin {

    cocoapods {
        version = "1.0.0"
        summary = "Compose application framework"
        homepage = "empty"
        ios.deploymentTarget = "11.0"
        podfile = project.file("../iosApp/Podfile")
        framework {
            baseName = "ChallengeApp"
            isStatic = true
        }
    }

    ios()
    iosSimulatorArm64()

    sourceSets {
        val iosMain by getting {
            dependencies {
                implementation(project(":challengeApp"))
            }
        }

        val iosSimulatorArm64Main by getting {
            dependsOn(iosMain)
        }
    }
}
