package com.kanda.labs.design.component

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.kanda.labs.design.AppTheme
import com.kanda.labs.design.icons.rememberAdd
import com.kanda.labs.design.icons.rememberRemove
import com.kanda.labs.design.tokens.AppColor
import com.kanda.labs.design.tokens.AppRoundedCorner
import com.kanda.labs.design.tokens.Spacers
import com.kanda.labs.design.typography.AppTypography

@Composable
public fun Card(
    modifier: Modifier = Modifier,
    icon: ImageVector,
    title: String,
    supportText: String,
    count: Int = 0,
    primaryClick: (() -> Unit)? = null,
    secondaryClick: (() -> Unit)? = null
) {

    Box(
        modifier = modifier
            .clip(AppRoundedCorner.large)
            .border(
                border = BorderStroke(
                    width = 1.5.dp, color = AppTheme.colors.border
                ),
                shape = AppRoundedCorner.large
            )
            .background(AppTheme.colors.contentInversePrimary)
            .padding(Spacers.small),
    ) {
        AnimatedVisibility(count > 0, modifier = Modifier.align(Alignment.TopEnd)) {
            Box(
                modifier = Modifier
                    .size(24.dp)
                    .clip(CircleShape)
                    .background(AppTheme.colors.backgroundInversePrimary)
                    .align(Alignment.TopEnd)
            ) {
                Text(
                    modifier = Modifier.align(Alignment.Center),
                    text = count.toString(),
                    typography = AppTypography.Text.small,
                    textAlign = TextAlign.Center,
                    contentColor = AppTheme.colors.contentInversePrimary
                )
            }
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(
                modifier = Modifier
                    .padding(top = Spacers.small)
                    .size(56.dp)
                    .clip(CircleShape)
                    .background(Color.White)
                    .padding(8.dp),
                imageVector = icon,
                contentDescription = null,
                tint = if(AppTheme.colors.isLight) AppTheme.colors.backgroundInversePrimary else AppTheme.colors.backgroundPrimary
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = Spacers.medium),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    modifier = Modifier.weight(1.2f),
                    text = title,
                    textAlign = TextAlign.Start,
                    typography = AppTypography.Titles.h7,
                    contentColor = AppTheme.colors.contentSecondary,
                    maxLines = 2
                )
                Text(
                    modifier = Modifier.weight(0.6f),
                    text = supportText,
                    textAlign = TextAlign.End,
                    typography = AppTypography.Text.small,
                    maxLines = 1
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = Spacers.medium),
                horizontalArrangement = Arrangement.End,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    modifier = Modifier
                        .size(48.dp)
                        .padding(4.dp)
                        .clip(CircleShape)
                        .background(AppTheme.colors.border)
                        .padding(Spacers.xSmall)
                        .then(
                            if (secondaryClick != null) Modifier.clickable { secondaryClick() } else Modifier
                        ),
                    imageVector = rememberRemove(),
                    tint = if(AppTheme.colors.isLight) AppTheme.colors.backgroundInversePrimary else AppTheme.colors.contentInversePrimary,
                    contentDescription = null
                )
                Icon(
                    modifier = Modifier
                        .size(48.dp)
                        .padding(4.dp)
                        .clip(CircleShape)
                        .background(AppTheme.colors.backgroundInversePrimary)
                        .padding(Spacers.xSmall)
                        .then(
                            if (primaryClick != null) Modifier.clickable { primaryClick() } else Modifier
                        ),
                    imageVector = rememberAdd(),
                    tint = AppTheme.colors.contentInversePrimary,
                    contentDescription = null
                )
            }
        }
    }
}