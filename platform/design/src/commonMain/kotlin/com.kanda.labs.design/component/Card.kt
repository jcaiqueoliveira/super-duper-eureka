package com.kanda.labs.design.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.kanda.labs.design.AppTheme
import com.kanda.labs.design.tokens.AppColor
import com.kanda.labs.design.tokens.AppRoundedCorner
import com.kanda.labs.design.tokens.Spacers
import com.kanda.labs.design.typography.AppTypography
import compose.icons.FeatherIcons
import compose.icons.feathericons.Minus
import compose.icons.feathericons.Plus

@Composable
public fun Card(
    modifier: Modifier = Modifier,
    icon: ImageVector,
    title: String,
    supportText: String,
    badge: String? = null
) {
    Column(
        modifier = modifier
            .clip(AppRoundedCorner.large)
            .border(
                border = BorderStroke(
                    width = 1.5.dp,
                    color = AppTheme.colors.border
                ),
                shape = AppRoundedCorner.large
            )
            .background(AppTheme.colors.backgroundPrimary)
            .padding(Spacers.small),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            modifier = Modifier.padding(top = Spacers.small).size(36.dp),
            imageVector = icon,
            contentDescription = null,
            tint = AppTheme.colors.backgroundInversePrimary
        )
        Row(
            modifier = Modifier.fillMaxWidth().padding(top = Spacers.medium),
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
            modifier = Modifier.fillMaxWidth().padding(top = Spacers.medium),
            horizontalArrangement = Arrangement.End,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                modifier = Modifier
                    .size(36.dp)
                    .clip(CircleShape)
                    .background(AppTheme.colors.backgroundPrimary)
                    .padding(Spacers.xSmall),
                imageVector = FeatherIcons.Minus,
                tint = AppTheme.colors.backgroundInversePrimary,
                contentDescription = null
            )
            Icon(
                modifier = Modifier
                    .size(36.dp)
                    .clip(CircleShape)
                    .background(AppTheme.colors.backgroundInversePrimary)
                    .padding(Spacers.xSmall),
                imageVector = FeatherIcons.Plus,
                tint = AppColor.n50,
                contentDescription = null
            )
        }
    }
}