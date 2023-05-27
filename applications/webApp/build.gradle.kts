plugins {
    id(libs.plugins.multiplatform.get().pluginId)
    alias(libs.plugins.compose)
}

kotlin {
    js(IR) {
        browser()
        binaries.executable()
    }

    sourceSets {
        val jsMain by getting {
            dependencies {
                implementation(project(":challengeApp"))
                implementation(compose.html.core)
            }
        }
    }
}

compose.experimental {
    web.application {}
}