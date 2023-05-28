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
public fun rememberRocketLaunch(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "rocket_launch",
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
                moveTo(7.1f, 11.35f)
                quadToRelative(0.35f, -0.7f, 0.725f, -1.35f)
                quadToRelative(0.375f, -0.65f, 0.825f, -1.3f)
                lineToRelative(-1.4f, -0.275f)
                lineToRelative(-2.1f, 2.1f)
                close()
                moveToRelative(12.05f, -6.875f)
                quadToRelative(-1.75f, 0.05f, -3.737f, 1.025f)
                quadToRelative(-1.988f, 0.975f, -3.613f, 2.6f)
                quadToRelative(-1.05f, 1.05f, -1.875f, 2.25f)
                reflectiveQuadTo(8.7f, 12.6f)
                lineToRelative(2.85f, 2.825f)
                quadToRelative(1.05f, -0.4f, 2.25f, -1.225f)
                quadToRelative(1.2f, -0.825f, 2.25f, -1.875f)
                quadToRelative(1.625f, -1.625f, 2.6f, -3.6f)
                quadTo(19.625f, 6.75f, 19.675f, 5f)
                quadToRelative(0f, -0.1f, -0.037f, -0.2f)
                quadToRelative(-0.038f, -0.1f, -0.113f, -0.175f)
                quadToRelative(-0.075f, -0.075f, -0.175f, -0.113f)
                quadToRelative(-0.1f, -0.037f, -0.2f, -0.037f)
                close()
                moveToRelative(-5.5f, 6f)
                quadToRelative(-0.575f, -0.575f, -0.575f, -1.413f)
                quadToRelative(0f, -0.837f, 0.575f, -1.412f)
                reflectiveQuadToRelative(1.425f, -0.575f)
                quadToRelative(0.85f, 0f, 1.425f, 0.575f)
                quadToRelative(0.575f, 0.575f, 0.575f, 1.412f)
                quadToRelative(0f, 0.838f, -0.575f, 1.413f)
                quadToRelative(-0.575f, 0.575f, -1.425f, 0.575f)
                quadToRelative(-0.85f, 0f, -1.425f, -0.575f)
                close()
                moveToRelative(-0.85f, 6.55f)
                lineTo(13.625f, 19f)
                lineToRelative(2.1f, -2.1f)
                lineToRelative(-0.275f, -1.4f)
                quadToRelative(-0.65f, 0.45f, -1.3f, 0.812f)
                quadToRelative(-0.65f, 0.363f, -1.35f, 0.713f)
                close()
                moveToRelative(8.775f, -13.35f)
                quadToRelative(0.2f, 2.75f, -0.9f, 5.362f)
                quadToRelative(-1.1f, 2.613f, -3.475f, 4.988f)
                lineToRelative(0.5f, 2.475f)
                quadToRelative(0.1f, 0.5f, -0.05f, 0.975f)
                quadToRelative(-0.15f, 0.475f, -0.5f, 0.825f)
                lineTo(14f, 21.45f)
                quadToRelative(-0.375f, 0.375f, -0.9f, 0.287f)
                quadToRelative(-0.525f, -0.087f, -0.725f, -0.587f)
                lineToRelative(-1.525f, -3.575f)
                lineTo(6.575f, 13.3f)
                lineTo(3f, 11.775f)
                quadToRelative(-0.5f, -0.2f, -0.6f, -0.725f)
                quadToRelative(-0.1f, -0.525f, 0.275f, -0.9f)
                lineTo(5.825f, 7f)
                quadToRelative(0.35f, -0.35f, 0.838f, -0.5f)
                quadToRelative(0.487f, -0.15f, 0.987f, -0.05f)
                lineToRelative(2.475f, 0.5f)
                quadToRelative(2.375f, -2.375f, 4.988f, -3.475f)
                quadToRelative(2.612f, -1.1f, 5.362f, -0.9f)
                quadToRelative(0.2f, 0.025f, 0.4f, 0.112f)
                quadToRelative(0.2f, 0.088f, 0.35f, 0.238f)
                quadToRelative(0.15f, 0.15f, 0.237f, 0.35f)
                quadToRelative(0.088f, 0.2f, 0.113f, 0.4f)
                close()
                moveToRelative(-17.65f, 12.3f)
                quadToRelative(0.875f, -0.875f, 2.137f, -0.888f)
                quadToRelative(1.263f, -0.012f, 2.138f, 0.863f)
                reflectiveQuadToRelative(0.862f, 2.137f)
                quadToRelative(-0.012f, 1.263f, -0.887f, 2.138f)
                quadToRelative(-0.625f, 0.625f, -2.087f, 1.075f)
                quadToRelative(-1.463f, 0.45f, -4.038f, 0.8f)
                quadToRelative(0.35f, -2.575f, 0.8f, -4.038f)
                quadToRelative(0.45f, -1.462f, 1.075f, -2.087f)
                close()
                moveToRelative(1.425f, 1.4f)
                quadToRelative(-0.25f, 0.25f, -0.5f, 0.913f)
                quadToRelative(-0.25f, 0.662f, -0.35f, 1.337f)
                quadToRelative(0.675f, -0.1f, 1.338f, -0.337f)
                quadToRelative(0.662f, -0.238f, 0.912f, -0.488f)
                quadToRelative(0.3f, -0.3f, 0.325f, -0.725f)
                quadToRelative(0.025f, -0.425f, -0.275f, -0.725f)
                quadToRelative(-0.3f, -0.3f, -0.725f, -0.288f)
                quadToRelative(-0.425f, 0.013f, -0.725f, 0.313f)
                close()
            }
        }.build()
    }
}