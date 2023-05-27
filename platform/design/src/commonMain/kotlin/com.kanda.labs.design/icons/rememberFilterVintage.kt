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
public fun rememberFilterVintage(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "filter_vintage",
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
                moveTo(12.05f, 22f)
                quadToRelative(-1.425f, 0f, -2.525f, -0.9f)
                quadToRelative(-1.1f, -0.9f, -1.375f, -2.3f)
                quadToRelative(-1.325f, 0.425f, -2.675f, -0.05f)
                quadToRelative(-1.35f, -0.475f, -2.075f, -1.65f)
                quadToRelative(-0.75f, -1.2f, -0.55f, -2.662f)
                quadToRelative(0.2f, -1.463f, 1.3f, -2.438f)
                quadToRelative(-1.05f, -0.95f, -1.262f, -2.35f)
                quadToRelative(-0.213f, -1.4f, 0.462f, -2.6f)
                quadToRelative(0.675f, -1.2f, 2.038f, -1.738f)
                quadTo(6.75f, 4.775f, 8.1f, 5.2f)
                quadToRelative(0.275f, -1.4f, 1.375f, -2.3f)
                quadTo(10.575f, 2f, 12f, 2f)
                quadToRelative(1.425f, 0f, 2.525f, 0.9f)
                quadToRelative(1.1f, 0.9f, 1.375f, 2.3f)
                quadToRelative(1.4f, -0.425f, 2.713f, 0.075f)
                quadToRelative(1.312f, 0.5f, 2.037f, 1.775f)
                quadToRelative(0.675f, 1.25f, 0.488f, 2.612f)
                quadTo(20.95f, 11.025f, 19.85f, 12f)
                quadToRelative(1.1f, 0.975f, 1.313f, 2.412f)
                quadToRelative(0.212f, 1.438f, -0.463f, 2.688f)
                quadToRelative(-0.725f, 1.275f, -2.037f, 1.7f)
                quadToRelative(-1.313f, 0.425f, -2.713f, 0f)
                quadToRelative(-0.275f, 1.4f, -1.375f, 2.3f)
                quadToRelative(-1.1f, 0.9f, -2.525f, 0.9f)
                close()
                moveToRelative(0f, -2f)
                quadToRelative(1.175f, 0f, 1.762f, -1.012f)
                quadTo(14.4f, 17.975f, 13.8f, 17f)
                lineToRelative(-0.7f, -1.15f)
                quadToRelative(-0.275f, 0.075f, -0.525f, 0.112f)
                quadToRelative(-0.25f, 0.038f, -0.525f, 0.038f)
                quadToRelative(-0.25f, 0f, -0.512f, -0.038f)
                quadToRelative(-0.263f, -0.037f, -0.538f, -0.112f)
                lineTo(10.3f, 17f)
                quadToRelative(-0.6f, 0.975f, -0.012f, 1.988f)
                quadTo(10.875f, 20f, 12.05f, 20f)
                close()
                moveToRelative(-7f, -4f)
                quadToRelative(0.6f, 1.025f, 1.762f, 1.025f)
                quadToRelative(1.163f, 0f, 1.738f, -1.025f)
                lineToRelative(0.65f, -1.15f)
                quadToRelative(-0.2f, -0.2f, -0.375f, -0.425f)
                quadToRelative(-0.175f, -0.225f, -0.3f, -0.475f)
                quadToRelative(-0.125f, -0.225f, -0.225f, -0.462f)
                quadToRelative(-0.1f, -0.238f, -0.175f, -0.488f)
                horizontalLineTo(6.8f)
                quadToRelative(-1.175f, 0f, -1.75f, 0.988f)
                quadToRelative(-0.575f, 0.987f, 0f, 2.012f)
                close()
                moveToRelative(10.4f, 0f)
                quadToRelative(0.575f, 1.025f, 1.738f, 1.025f)
                quadToRelative(1.162f, 0f, 1.762f, -1.025f)
                quadToRelative(0.575f, -1.025f, 0f, -2.012f)
                quadTo(18.375f, 13f, 17.2f, 13f)
                horizontalLineToRelative(-1.325f)
                quadToRelative(-0.05f, 0.25f, -0.162f, 0.488f)
                quadToRelative(-0.113f, 0.237f, -0.238f, 0.462f)
                quadToRelative(-0.125f, 0.25f, -0.3f, 0.475f)
                quadToRelative(-0.175f, 0.225f, -0.375f, 0.425f)
                close()
                moveTo(12f, 12f)
                close()
                moveToRelative(-3.875f, -1f)
                quadToRelative(0.075f, -0.275f, 0.187f, -0.538f)
                quadToRelative(0.113f, -0.262f, 0.238f, -0.487f)
                quadToRelative(0.125f, -0.225f, 0.288f, -0.425f)
                quadToRelative(0.162f, -0.2f, 0.362f, -0.4f)
                lineTo(8.55f, 8f)
                quadToRelative(-0.575f, -1.025f, -1.738f, -1.025f)
                quadTo(5.65f, 6.975f, 5.05f, 8f)
                quadToRelative(-0.575f, 1.025f, 0f, 2.012f)
                quadTo(5.625f, 11f, 6.8f, 11f)
                close()
                moveToRelative(9.075f, 0f)
                quadToRelative(1.175f, 0f, 1.75f, -0.988f)
                quadToRelative(0.575f, -0.987f, 0f, -2.012f)
                quadToRelative(-0.6f, -1.025f, -1.762f, -1.025f)
                quadToRelative(-1.163f, 0f, -1.738f, 1.025f)
                lineToRelative(-0.65f, 1.15f)
                quadToRelative(0.2f, 0.2f, 0.363f, 0.4f)
                quadToRelative(0.162f, 0.2f, 0.287f, 0.425f)
                quadToRelative(0.125f, 0.225f, 0.238f, 0.487f)
                quadToRelative(0.112f, 0.263f, 0.187f, 0.538f)
                close()
                moveToRelative(-6.275f, -2.85f)
                quadToRelative(0.275f, -0.075f, 0.538f, -0.113f)
                quadTo(11.725f, 8f, 12f, 8f)
                reflectiveQuadToRelative(0.538f, 0.037f)
                quadToRelative(0.262f, 0.038f, 0.537f, 0.113f)
                lineTo(13.75f, 7f)
                quadToRelative(0.575f, -0.975f, 0f, -1.988f)
                quadTo(13.175f, 4f, 12f, 4f)
                reflectiveQuadToRelative(-1.75f, 1f)
                quadToRelative(-0.575f, 1f, 0f, 2f)
                close()
                moveToRelative(0f, 0f)
                quadToRelative(0.275f, -0.075f, 0.538f, -0.113f)
                quadTo(11.725f, 8f, 12f, 8f)
                reflectiveQuadToRelative(0.538f, 0.037f)
                quadToRelative(0.262f, 0.038f, 0.537f, 0.113f)
                quadToRelative(-0.275f, -0.075f, -0.537f, -0.113f)
                quadTo(12.275f, 8f, 12f, 8f)
                reflectiveQuadToRelative(-0.537f, 0.037f)
                quadToRelative(-0.263f, 0.038f, -0.538f, 0.113f)
                close()
                moveToRelative(-2.4f, 5.8f)
                quadToRelative(-0.125f, -0.225f, -0.225f, -0.462f)
                quadToRelative(-0.1f, -0.238f, -0.175f, -0.488f)
                quadToRelative(0.075f, 0.25f, 0.175f, 0.488f)
                quadToRelative(0.1f, 0.237f, 0.225f, 0.462f)
                quadToRelative(0.125f, 0.25f, 0.3f, 0.475f)
                quadToRelative(0.175f, 0.225f, 0.375f, 0.425f)
                quadToRelative(-0.2f, -0.2f, -0.375f, -0.425f)
                quadToRelative(-0.175f, -0.225f, -0.3f, -0.475f)
                close()
                moveToRelative(-0.4f, -2.95f)
                quadToRelative(0.075f, -0.275f, 0.187f, -0.538f)
                quadToRelative(0.113f, -0.262f, 0.238f, -0.487f)
                quadToRelative(0.125f, -0.225f, 0.288f, -0.425f)
                quadToRelative(0.162f, -0.2f, 0.362f, -0.4f)
                quadToRelative(-0.2f, 0.2f, -0.362f, 0.4f)
                quadToRelative(-0.163f, 0.2f, -0.288f, 0.425f)
                quadToRelative(-0.125f, 0.225f, -0.238f, 0.487f)
                quadToRelative(-0.112f, 0.263f, -0.187f, 0.538f)
                close()
                moveToRelative(3.925f, 5f)
                quadToRelative(-0.25f, 0f, -0.512f, -0.038f)
                quadToRelative(-0.263f, -0.037f, -0.538f, -0.112f)
                quadToRelative(0.275f, 0.075f, 0.538f, 0.112f)
                quadToRelative(0.262f, 0.038f, 0.512f, 0.038f)
                quadToRelative(0.275f, 0f, 0.525f, -0.038f)
                quadToRelative(0.25f, -0.037f, 0.525f, -0.112f)
                quadToRelative(-0.275f, 0.075f, -0.525f, 0.112f)
                quadToRelative(-0.25f, 0.038f, -0.525f, 0.038f)
                close()
                moveToRelative(2.75f, -1.15f)
                quadToRelative(0.2f, -0.2f, 0.375f, -0.425f)
                quadToRelative(0.175f, -0.225f, 0.3f, -0.475f)
                quadToRelative(0.125f, -0.225f, 0.238f, -0.462f)
                quadToRelative(0.112f, -0.238f, 0.162f, -0.488f)
                quadToRelative(-0.05f, 0.25f, -0.162f, 0.488f)
                quadToRelative(-0.113f, 0.237f, -0.238f, 0.462f)
                quadToRelative(-0.125f, 0.25f, -0.3f, 0.475f)
                quadToRelative(-0.175f, 0.225f, -0.375f, 0.425f)
                close()
                moveTo(15.875f, 11f)
                quadToRelative(-0.075f, -0.275f, -0.187f, -0.538f)
                quadToRelative(-0.113f, -0.262f, -0.238f, -0.487f)
                quadToRelative(-0.125f, -0.225f, -0.287f, -0.425f)
                quadToRelative(-0.163f, -0.2f, -0.363f, -0.4f)
                quadToRelative(0.2f, 0.2f, 0.363f, 0.4f)
                quadToRelative(0.162f, 0.2f, 0.287f, 0.425f)
                quadToRelative(0.125f, 0.225f, 0.238f, 0.487f)
                quadToRelative(0.112f, 0.263f, 0.187f, 0.538f)
                close()
                moveTo(12f, 14f)
                quadToRelative(0.825f, 0f, 1.413f, -0.588f)
                quadTo(14f, 12.825f, 14f, 12f)
                reflectiveQuadToRelative(-0.587f, -1.413f)
                quadTo(12.825f, 10f, 12f, 10f)
                quadToRelative(-0.825f, 0f, -1.412f, 0.587f)
                quadTo(10f, 11.175f, 10f, 12f)
                quadToRelative(0f, 0.825f, 0.588f, 1.412f)
                quadTo(11.175f, 14f, 12f, 14f)
                close()
                moveToRelative(0f, -2f)
                close()
            }
        }.build()
    }
}