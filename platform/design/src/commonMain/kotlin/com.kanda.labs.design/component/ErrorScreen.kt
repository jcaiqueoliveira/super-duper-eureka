package com.kanda.labs.design.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.kanda.labs.design.AppTheme
import com.kanda.labs.design.icons.rememberWindPower
import com.kanda.labs.design.tokens.Spacers
import com.kanda.labs.design.typography.AppTypography

@Composable
public fun Error(
    modifier: Modifier = Modifier,
    onClick: (() -> Unit)? = null,
) {
    var isLoading by remember { mutableStateOf(false) }
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Icon(
            modifier = Modifier.size(48.dp),
            imageVector = rememberWindPower(),
            contentDescription = null
        )

        Text(
            modifier = Modifier.padding(top = Spacers.medium),
            text = "Something went wrong",
            typography = AppTypography.Titles.h5,
            textAlign = TextAlign.Center,
            contentColor = AppTheme.colors.contentSecondary
        )
        Text(
            modifier = Modifier.padding(top = Spacers.xSmall),
            text = "We had a problem to do your request, try again",
            typography = AppTypography.Paragraph.medium,
            textAlign = TextAlign.Center,
            contentColor = AppTheme.colors.contentSecondary
        )
        Column(modifier = Modifier.width(200.dp)) {
            Button(
                modifier = Modifier.padding(horizontal = Spacers.small)
                    .padding(top = Spacers.small),
                text = "Try again",
                onClick = {
                    onClick?.invoke()
                    isLoading = !isLoading
                },
                isLoading = isLoading
            )
        }
    }
}