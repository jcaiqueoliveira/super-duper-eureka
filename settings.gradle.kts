rootProject.name = "challenge-app"
include(":challengeApp")
include(":applications:androidApp")
include(":applications:webApp")
include(":applications:iosAppKMP")
include(":features:store")
include(":platform:core")
include(":platform:design")
pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}
