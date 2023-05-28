package com.kanda.labs.store.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import com.kanda.labs.design.AppTheme
import com.kanda.labs.design.component.SuccessScreen

internal object SuccessScreen : Screen {

    @Composable
    public override fun Content() {
        Column(
            modifier = Modifier.fillMaxSize().background(AppTheme.colors.backgroundInversePrimary)
        ) {
            val navigator = LocalNavigator.currentOrThrow
            SuccessScreen(
                title = "Congratulation!",
                description = "Your items will be delivered to you today",
                textAction = "Got it!",
                onClick = navigator::pop
            )
        }
    }
}