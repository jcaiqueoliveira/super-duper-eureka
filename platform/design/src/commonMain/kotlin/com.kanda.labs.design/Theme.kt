package com.kanda.labs.design

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.Colors
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import com.kanda.labs.design.tokens.AppColorTokens
import com.kanda.labs.design.tokens.AppRoundedCorner
import com.kanda.labs.design.tokens.AppShapes
import com.kanda.labs.design.tokens.darkTokens
import com.kanda.labs.design.tokens.lightTokens
import com.kanda.labs.design.typography.Typography

@Composable
public fun AppTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) darkTokens else lightTokens

    ProvideAppColors(colors) {
        MaterialTheme(
            colors = debugColors(darkTheme),
            typography = Typography,
            shapes = AppShapes,
            content = content
        )
    }
}

public object AppTheme {
    public val colors: AppColorTokens
        @Composable
        get() = LocalAppColors.current

    public val shapes: AppRoundedCorner
        @Composable
        get() = LocalAppShapes.current
}

@Composable
public fun ProvideAppColors(
    colors: AppColorTokens,
    content: @Composable () -> Unit
) {

    CompositionLocalProvider(
        LocalAppColors provides colors,
        LocalAppShapes provides AppRoundedCorner,
        content = content
    )
}

private fun debugColors(
    darkTheme: Boolean,
    debugColor: Color = Color.Magenta
) = Colors(
    primary = debugColor,
    primaryVariant = debugColor,
    secondary = debugColor,
    secondaryVariant = debugColor,
    background = debugColor,
    surface = debugColor,
    error = debugColor,
    onPrimary = debugColor,
    onSecondary = debugColor,
    onBackground = debugColor,
    onSurface = debugColor,
    onError = debugColor,
    isLight = !darkTheme
)

private val LocalAppColors = staticCompositionLocalOf<AppColorTokens> {
    error("No ColorsTokens provided")
}

private val LocalAppShapes = staticCompositionLocalOf<AppRoundedCorner> {
    error("No Shapes provided")
}