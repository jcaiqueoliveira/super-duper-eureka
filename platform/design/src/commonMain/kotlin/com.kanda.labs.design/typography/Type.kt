package com.kanda.labs.design.typography

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.FontWeight.Companion.W400
import androidx.compose.ui.text.font.FontWeight.Companion.W500
import androidx.compose.ui.unit.sp

private val Default = FontFamily.Default

public val Typography: Typography = Typography(
    h1 = AppTypography.Titles.h1.style,
    h2 = AppTypography.Titles.h2.style,
    h3 = AppTypography.Titles.h3.style,
    h4 = AppTypography.Titles.h4.style,
    h5 = AppTypography.Titles.h5.style,
    h6 = AppTypography.Titles.h6.style,
    subtitle1 = AppTypography.Text.medium.style,
    subtitle2 = AppTypography.Text.small.style,
    body1 = AppTypography.Text.medium.style,
    body2 = AppTypography.Text.small.style,
    button = AppTypography.Text.small.style,
    caption = AppTypography.Text.xSmall.style,
    overline = AppTypography.Text.xSmall.style
)

public class AppTypography private constructor(
    public val style: TextStyle
) {

    public sealed class Titles {

        public companion object {
            private val default: TextStyle = TextStyle(
                fontFamily = Default,
                fontWeight = FontWeight.W700
            )
            public val h1: AppTypography = AppTypography(
                default.copy(fontSize = 40.sp, lineHeight = 52.sp)
            )

            public val h2: AppTypography = AppTypography(
                default.copy(fontSize = 36.sp, lineHeight = 44.sp)
            )

            public val h3: AppTypography = AppTypography(
                default.copy(fontSize = 32.sp, lineHeight = 40.sp)
            )

            public val h4: AppTypography = AppTypography(
                default.copy(fontSize = 28.sp, lineHeight = 36.sp)
            )

            public val h5: AppTypography = AppTypography(
                default.copy(fontSize = 24.sp, lineHeight = 32.sp)
            )

            public val h6: AppTypography = AppTypography(
                default.copy(fontSize = 20.sp, lineHeight = 28.sp)
            )

            public val values: List<AppTypography> = listOf(h1, h2, h3, h4, h5, h6)
        }
    }

    public sealed class Text {
        public companion object {
            public val default: TextStyle = TextStyle(fontFamily = Default, fontWeight = W500)

            public val xSmall: AppTypography = AppTypography(
                default.copy(fontSize = 12.sp, lineHeight = 16.sp)
            )

            public val small: AppTypography = AppTypography(
                default.copy(fontSize = 14.sp, lineHeight = 16.sp)
            )

            public val medium: AppTypography = AppTypography(
                default.copy(fontSize = 16.sp, lineHeight = 20.sp)
            )

            public val large: AppTypography = AppTypography(
                TextStyle(fontSize = 18.sp, lineHeight = 24.sp)
            )

            public val values: List<AppTypography> = listOf(
                xSmall, small, medium, large
            )
        }
    }

    public sealed class Paragraph {
        public companion object {
            public val default: TextStyle = TextStyle(fontFamily = Default, fontWeight = W400)

            public val xSmall: AppTypography = AppTypography(
                default.copy(fontSize = 12.sp, lineHeight = 20.sp)
            )

            public val small: AppTypography = AppTypography(
                default.copy(fontSize = 14.sp, lineHeight = 20.sp)
            )

            public val medium: AppTypography = AppTypography(
                default.copy(fontSize = 16.sp, lineHeight = 24.sp)
            )

            public val large: AppTypography = AppTypography(
                TextStyle(fontSize = 18.sp, lineHeight = 28.sp)
            )
            public val values: List<AppTypography> = listOf(
                xSmall, small, medium, large
            )
        }
    }
}