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
public fun rememberCoffee(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "coffee",
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
                moveTo(11f, 18f)
                quadToRelative(-2.9f, 0f, -4.95f, -2.05f)
                quadTo(4f, 13.9f, 4f, 11f)
                verticalLineTo(5f)
                quadToRelative(0f, -0.825f, 0.588f, -1.413f)
                quadTo(5.175f, 3f, 6f, 3f)
                horizontalLineToRelative(12.5f)
                quadToRelative(1.45f, 0f, 2.475f, 1.025f)
                quadTo(22f, 5.05f, 22f, 6.5f)
                quadToRelative(0f, 1.45f, -1.025f, 2.475f)
                quadTo(19.95f, 10f, 18.5f, 10f)
                horizontalLineTo(18f)
                verticalLineToRelative(1f)
                quadToRelative(0f, 2.9f, -2.05f, 4.95f)
                quadTo(13.9f, 18f, 11f, 18f)
                close()
                moveTo(6f, 8f)
                horizontalLineToRelative(10f)
                verticalLineTo(5f)
                horizontalLineTo(6f)
                close()
                moveToRelative(5f, 8f)
                quadToRelative(2.075f, 0f, 3.538f, -1.463f)
                quadTo(16f, 13.075f, 16f, 11f)
                verticalLineToRelative(-1f)
                horizontalLineTo(6f)
                verticalLineToRelative(1f)
                quadToRelative(0f, 2.075f, 1.463f, 3.537f)
                quadTo(8.925f, 16f, 11f, 16f)
                close()
                moveToRelative(7f, -8f)
                horizontalLineToRelative(0.5f)
                quadToRelative(0.625f, 0f, 1.062f, -0.438f)
                quadTo(20f, 7.125f, 20f, 6.5f)
                reflectiveQuadToRelative(-0.438f, -1.062f)
                quadTo(19.125f, 5f, 18.5f, 5f)
                horizontalLineTo(18f)
                close()
                moveTo(5f, 21f)
                quadToRelative(-0.425f, 0f, -0.713f, -0.288f)
                quadTo(4f, 20.425f, 4f, 20f)
                reflectiveQuadToRelative(0.287f, -0.712f)
                quadTo(4.575f, 19f, 5f, 19f)
                horizontalLineToRelative(14f)
                quadToRelative(0.425f, 0f, 0.712f, 0.288f)
                quadToRelative(0.288f, 0.287f, 0.288f, 0.712f)
                reflectiveQuadToRelative(-0.288f, 0.712f)
                quadTo(19.425f, 21f, 19f, 21f)
                close()
                moveToRelative(6f, -11f)
                close()
            }
        }.build()
    }
}