plugins {
    id(libs.plugins.multiplatform.get().pluginId).apply(false)
    alias(libs.plugins.compose).apply(false)
    id(libs.plugins.cocoapods.get().pluginId).apply(false)
    id(libs.plugins.android.application.get().pluginId).apply(false)
    alias(libs.plugins.libres).apply(false)
    alias(libs.plugins.buildConfig).apply(false)
    alias(libs.plugins.kotlinx.serialization).apply(false)
}
