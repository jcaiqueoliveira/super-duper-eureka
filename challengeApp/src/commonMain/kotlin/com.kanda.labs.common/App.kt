package com.kanda.labs.common

import HomeStore
import androidx.compose.runtime.Composable
import com.kanda.labs.design.AppTheme

@Composable
public fun App(): Unit = AppTheme {
    HomeStore()
}