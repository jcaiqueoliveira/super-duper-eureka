package com.kanda.labs.design.icons

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

@Composable
public fun rememberWindPower(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "wind_power",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 1.0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 1f,
                pathFillType = PathFillType.NonZero
            ) {
                moveTo(10f, 23f)
                quadToRelative(0f, -0.825f, 0.588f, -1.413f)
                quadTo(11.175f, 21f, 12f, 21f)
                verticalLineToRelative(-5.2f)
                quadToRelative(-0.3f, -0.125f, -0.562f, -0.288f)
                quadToRelative(-0.263f, -0.162f, -0.488f, -0.362f)
                lineToRelative(-2.2f, 1.4f)
                quadToRelative(-0.35f, 0.2f, -0.762f, 0.262f)
                quadToRelative(-0.413f, 0.063f, -0.838f, -0.062f)
                lineToRelative(-4.5f, -1.275f)
                quadToRelative(-0.725f, -0.2f, -1.188f, -0.813f)
                quadTo(1f, 14.05f, 1f, 13.275f)
                quadToRelative(0f, -0.95f, 0.663f, -1.613f)
                quadTo(2.325f, 11f, 3.275f, 11f)
                horizontalLineTo(10.8f)
                quadToRelative(0.25f, -0.275f, 0.55f, -0.475f)
                quadToRelative(0.3f, -0.2f, 0.65f, -0.325f)
                verticalLineTo(6.775f)
                quadToRelative(0f, -0.425f, 0.163f, -0.8f)
                quadToRelative(0.162f, -0.375f, 0.462f, -0.65f)
                lineToRelative(3.425f, -3.2f)
                quadToRelative(0.575f, -0.55f, 1.338f, -0.625f)
                quadToRelative(0.762f, -0.075f, 1.412f, 0.325f)
                quadToRelative(0.8f, 0.5f, 1.038f, 1.412f)
                quadToRelative(0.237f, 0.913f, -0.263f, 1.713f)
                lineTo(15.6f, 11.525f)
                quadToRelative(0.175f, 0.3f, 0.263f, 0.65f)
                quadToRelative(0.087f, 0.35f, 0.112f, 0.725f)
                lineToRelative(2.7f, 0.65f)
                quadToRelative(0.4f, 0.1f, 0.725f, 0.35f)
                quadToRelative(0.325f, 0.25f, 0.525f, 0.6f)
                lineToRelative(2.275f, 4.1f)
                quadToRelative(0.375f, 0.675f, 0.275f, 1.425f)
                quadToRelative(-0.1f, 0.75f, -0.65f, 1.3f)
                quadToRelative(-0.675f, 0.675f, -1.612f, 0.675f)
                quadToRelative(-0.938f, 0f, -1.613f, -0.675f)
                lineToRelative(-4.6f, -4.6f)
                verticalLineTo(21f)
                quadToRelative(0.825f, 0f, 1.413f, 0.587f)
                quadTo(16f, 22.175f, 16f, 23f)
                close()
                moveToRelative(4f, -16.225f)
                verticalLineTo(10.2f)
                quadToRelative(0.025f, 0f, 0.038f, 0.012f)
                quadToRelative(0.012f, 0.013f, 0.037f, 0.013f)
                lineToRelative(3.8f, -6.325f)
                quadToRelative(0.05f, -0.1f, 0.025f, -0.213f)
                quadToRelative(-0.025f, -0.112f, -0.125f, -0.162f)
                quadToRelative(-0.075f, -0.05f, -0.188f, -0.025f)
                quadToRelative(-0.112f, 0.025f, -0.162f, 0.075f)
                close()
                moveTo(13f, 14f)
                quadToRelative(0.425f, 0f, 0.713f, -0.288f)
                quadTo(14f, 13.425f, 14f, 13f)
                reflectiveQuadToRelative(-0.287f, -0.713f)
                quadTo(13.425f, 12f, 13f, 12f)
                reflectiveQuadToRelative(-0.712f, 0.287f)
                quadTo(12f, 12.575f, 12f, 13f)
                reflectiveQuadToRelative(0.288f, 0.712f)
                quadTo(12.575f, 14f, 13f, 14f)
                close()
                moveToRelative(-5.275f, 0.85f)
                lineToRelative(2.325f, -1.4f)
                quadToRelative(-0.025f, -0.125f, -0.025f, -0.225f)
                verticalLineTo(13f)
                horizontalLineToRelative(-6.75f)
                quadToRelative(-0.125f, 0f, -0.2f, 0.075f)
                quadToRelative(-0.075f, 0.075f, -0.075f, 0.2f)
                quadToRelative(0f, 0.1f, 0.05f, 0.175f)
                quadToRelative(0.05f, 0.075f, 0.15f, 0.1f)
                close()
                moveToRelative(10.475f, 0.625f)
                lineToRelative(-2.85f, -0.65f)
                quadToRelative(-0.05f, 0.05f, -0.1f, 0.125f)
                reflectiveQuadToRelative(-0.1f, 0.125f)
                lineToRelative(4.875f, 4.85f)
                quadToRelative(0.075f, 0.075f, 0.2f, 0.075f)
                reflectiveQuadToRelative(0.2f, -0.075f)
                quadToRelative(0.075f, -0.075f, 0.088f, -0.162f)
                quadToRelative(0.012f, -0.088f, -0.038f, -0.188f)
                close()
                moveTo(13f, 13f)
                close()
                moveToRelative(1.075f, -2.775f)
                close()
                moveToRelative(1.075f, 4.85f)
                close()
                moveTo(10.025f, 13f)
                close()
                moveTo(7f, 21f)
                horizontalLineTo(4f)
                quadToRelative(-0.425f, 0f, -0.712f, -0.288f)
                quadTo(3f, 20.425f, 3f, 20f)
                reflectiveQuadToRelative(0.288f, -0.712f)
                quadTo(3.575f, 19f, 4f, 19f)
                horizontalLineToRelative(3f)
                quadToRelative(0.425f, 0f, 0.713f, 0.288f)
                quadTo(8f, 19.575f, 8f, 20f)
                reflectiveQuadToRelative(-0.287f, 0.712f)
                quadTo(7.425f, 21f, 7f, 21f)
                close()
                moveTo(5f, 9f)
                horizontalLineTo(2f)
                quadToRelative(-0.425f, 0f, -0.712f, -0.288f)
                quadTo(1f, 8.425f, 1f, 8f)
                reflectiveQuadToRelative(0.288f, -0.713f)
                quadTo(1.575f, 7f, 2f, 7f)
                horizontalLineToRelative(3f)
                quadToRelative(0.425f, 0f, 0.713f, 0.287f)
                quadTo(6f, 7.575f, 6f, 8f)
                reflectiveQuadToRelative(-0.287f, 0.712f)
                quadTo(5.425f, 9f, 5f, 9f)
                close()
                moveToRelative(4f, -4f)
                horizontalLineTo(5f)
                quadToRelative(-0.425f, 0f, -0.713f, -0.288f)
                quadTo(4f, 4.425f, 4f, 4f)
                reflectiveQuadToRelative(0.287f, -0.713f)
                quadTo(4.575f, 3f, 5f, 3f)
                horizontalLineToRelative(4f)
                quadToRelative(0.425f, 0f, 0.713f, 0.287f)
                quadTo(10f, 3.575f, 10f, 4f)
                reflectiveQuadToRelative(-0.287f, 0.712f)
                quadTo(9.425f, 5f, 9f, 5f)
                close()
            }
        }.build()
    }
}