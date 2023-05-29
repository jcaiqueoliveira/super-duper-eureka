plugins {
    id(libs.plugins.android.application.get().pluginId)
    id(libs.plugins.kotlin.android.get().pluginId)
}

setupAndroidModule()

android {
    namespace = "com.kanda.labs"
    defaultConfig {
        applicationId = "com.kanda.labs.androidApp"
    }
}

dependencies {
    implementation(project(":challengeApp"))
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.activityCompose)
    implementation(libs.compose.uitooling)
}