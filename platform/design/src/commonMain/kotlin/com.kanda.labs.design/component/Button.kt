package com.kanda.labs.design.component

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.kanda.labs.design.AppTheme
import com.kanda.labs.design.tokens.AppShapes
import com.kanda.labs.design.tokens.Spacers
import com.kanda.labs.design.typography.AppTypography

@Composable
public fun Button(
    modifier: Modifier = Modifier,
    text: String,
    onClick: (() -> Unit)? = null,
    isLoading: Boolean = false,
) {
    Box(
        modifier
            .fillMaxWidth()
            .clip(AppShapes.medium)
            .background(AppTheme.colors.backgroundInversePrimary)
            .height(default.height)
            .then(if (onClick != null && !isLoading) Modifier.clickable { onClick() } else Modifier),
        contentAlignment = Alignment.Center
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            AnimatedVisibility(isLoading) {
                CircularProgressIndicator(
                    modifier = Modifier.padding(end = Spacers.xSmall).size(20.dp),
                    color = AppTheme.colors.contentInversePrimary,
                    strokeWidth = 2.dp,
                    backgroundColor = AppTheme.colors.backgroundInversePrimary
                )
            }
            Text(
                text = text,
                typography = default.typography,
                textAlign = TextAlign.Center,
                maxLines = 1,
                contentColor = AppTheme.colors.contentInversePrimary
            )
        }
    }
}

private data class ButtonSize(
    val height: Dp,
    val typography: AppTypography,
)

private val default: ButtonSize = ButtonSize(
    height = 56.dp,
    typography = AppTypography.Text.medium
)