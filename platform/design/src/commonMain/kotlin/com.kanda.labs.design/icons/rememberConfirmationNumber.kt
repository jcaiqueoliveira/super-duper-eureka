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
public fun rememberConfirmationNumber(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "confirmation_number",
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
                moveTo(4f, 20f)
                quadToRelative(-0.825f, 0f, -1.412f, -0.587f)
                quadTo(2f, 18.825f, 2f, 18f)
                verticalLineToRelative(-4f)
                quadToRelative(0.825f, 0f, 1.413f, -0.588f)
                quadTo(4f, 12.825f, 4f, 12f)
                reflectiveQuadToRelative(-0.587f, -1.413f)
                quadTo(2.825f, 10f, 2f, 10f)
                verticalLineTo(6f)
                quadToRelative(0f, -0.825f, 0.588f, -1.412f)
                quadTo(3.175f, 4f, 4f, 4f)
                horizontalLineToRelative(16f)
                quadToRelative(0.825f, 0f, 1.413f, 0.588f)
                quadTo(22f, 5.175f, 22f, 6f)
                verticalLineToRelative(4f)
                quadToRelative(-0.825f, 0f, -1.413f, 0.587f)
                quadTo(20f, 11.175f, 20f, 12f)
                quadToRelative(0f, 0.825f, 0.587f, 1.412f)
                quadTo(21.175f, 14f, 22f, 14f)
                verticalLineToRelative(4f)
                quadToRelative(0f, 0.825f, -0.587f, 1.413f)
                quadTo(20.825f, 20f, 20f, 20f)
                close()
                moveToRelative(0f, -2f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-2.55f)
                quadToRelative(-0.925f, -0.55f, -1.462f, -1.462f)
                quadTo(18f, 13.075f, 18f, 12f)
                reflectiveQuadToRelative(0.538f, -1.988f)
                quadTo(19.075f, 9.1f, 20f, 8.55f)
                verticalLineTo(6f)
                horizontalLineTo(4f)
                verticalLineToRelative(2.55f)
                quadToRelative(0.925f, 0.55f, 1.463f, 1.462f)
                quadTo(6f, 10.925f, 6f, 12f)
                reflectiveQuadToRelative(-0.537f, 1.988f)
                quadTo(4.925f, 14.9f, 4f, 15.45f)
                close()
                moveToRelative(8f, -1f)
                quadToRelative(0.425f, 0f, 0.713f, -0.288f)
                quadTo(13f, 16.425f, 13f, 16f)
                reflectiveQuadToRelative(-0.287f, -0.713f)
                quadTo(12.425f, 15f, 12f, 15f)
                reflectiveQuadToRelative(-0.712f, 0.287f)
                quadTo(11f, 15.575f, 11f, 16f)
                reflectiveQuadToRelative(0.288f, 0.712f)
                quadTo(11.575f, 17f, 12f, 17f)
                close()
                moveToRelative(0f, -4f)
                quadToRelative(0.425f, 0f, 0.713f, -0.288f)
                quadTo(13f, 12.425f, 13f, 12f)
                reflectiveQuadToRelative(-0.287f, -0.713f)
                quadTo(12.425f, 11f, 12f, 11f)
                reflectiveQuadToRelative(-0.712f, 0.287f)
                quadTo(11f, 11.575f, 11f, 12f)
                reflectiveQuadToRelative(0.288f, 0.712f)
                quadTo(11.575f, 13f, 12f, 13f)
                close()
                moveToRelative(0f, -4f)
                quadToRelative(0.425f, 0f, 0.713f, -0.288f)
                quadTo(13f, 8.425f, 13f, 8f)
                reflectiveQuadToRelative(-0.287f, -0.713f)
                quadTo(12.425f, 7f, 12f, 7f)
                reflectiveQuadToRelative(-0.712f, 0.287f)
                quadTo(11f, 7.575f, 11f, 8f)
                reflectiveQuadToRelative(0.288f, 0.712f)
                quadTo(11.575f, 9f, 12f, 9f)
                close()
                moveToRelative(0f, 3f)
                close()
            }
        }.build()
    }
}