package com.kanda.labs.design.tokens

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Shapes
import androidx.compose.ui.unit.dp

public val AppShapes: Shapes = Shapes(
    small = AppRoundedCorner.small,
    medium = AppRoundedCorner.large,
    large = AppRoundedCorner.xLarge
)

public object AppRoundedCorner {
    public val small: CornerBasedShape = RoundedCornerShape(4.dp)
    public val medium: CornerBasedShape = RoundedCornerShape(8.dp)
    public val large: CornerBasedShape = RoundedCornerShape(12.dp)
    public val xLarge: CornerBasedShape = RoundedCornerShape(16.dp)
    public val circle: CornerBasedShape = CircleShape
}