package com.kanda.labs.design.component

import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import com.kanda.labs.design.AppTheme
import com.kanda.labs.design.typography.AppTypography

@Composable
public fun Text(
    text: String,
    typography: AppTypography,
    modifier: Modifier = Modifier,
    textAlign: TextAlign? = null,
    contentColor: Color = AppTheme.colors.contentPrimary,
    maxLines: Int = Int.MAX_VALUE,
    minLines: Int = 1,
) {
    BasicText(
        text = text,
        modifier = modifier,
        style = typography.style.copy(color = contentColor, textAlign = textAlign),
        overflow = TextOverflow.Ellipsis,
        maxLines = maxLines,
        minLines = minLines
    )
}