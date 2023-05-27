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
public fun rememberRemove(): ImageVector {
    return remember {
        ImageVector.Builder(
            name = "remove",
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
                moveTo(6f, 13f)
                quadToRelative(-0.425f, 0f, -0.713f, -0.288f)
                quadTo(5f, 12.425f, 5f, 12f)
                reflectiveQuadToRelative(0.287f, -0.713f)
                quadTo(5.575f, 11f, 6f, 11f)
                horizontalLineToRelative(12f)
                quadToRelative(0.425f, 0f, 0.712f, 0.287f)
                quadToRelative(0.288f, 0.288f, 0.288f, 0.713f)
                reflectiveQuadToRelative(-0.288f, 0.712f)
                quadTo(18.425f, 13f, 18f, 13f)
                close()
            }
        }.build()
    }
}