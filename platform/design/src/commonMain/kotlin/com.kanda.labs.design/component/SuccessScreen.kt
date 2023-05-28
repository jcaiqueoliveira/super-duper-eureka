package com.kanda.labs.design.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.kanda.labs.design.AppTheme
import com.kanda.labs.design.icons.rememberRocketLaunch
import com.kanda.labs.design.tokens.Spacers
import com.kanda.labs.design.typography.AppTypography

@Composable
public fun SuccessScreen(
    title: String,
    description: String,
    textAction: String,
    onClick: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(AppTheme.colors.backgroundInversePrimary),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            modifier = Modifier.size(60.dp),
            imageVector = rememberRocketLaunch(),
            tint = AppTheme.colors.contentInversePrimary,
            contentDescription = null
        )

        Text(
            modifier = Modifier.padding(top = Spacers.medium),
            text = title,
            typography = AppTypography.Titles.h3,
            contentColor = AppTheme.colors.contentInversePrimary
        )
        Text(
            modifier = Modifier.padding(top = Spacers.xSmall),
            text = description,
            typography = AppTypography.Paragraph.large,
            contentColor = AppTheme.colors.contentInversePrimary
        )
        Column(modifier = Modifier.padding(top = Spacers.large).size(150.dp)) {
            Button(
                text = textAction,
                background = AppTheme.colors.backgroundPrimary,
                contentColor = AppTheme.colors.contentPrimary,
                onClick = onClick
            )
        }
    }
}