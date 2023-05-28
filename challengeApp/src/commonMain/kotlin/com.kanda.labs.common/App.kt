package com.kanda.labs.common

import androidx.compose.runtime.Composable
import com.kanda.labs.design.AppTheme
import com.kanda.labs.store.view.HomeStore

@Composable
public fun App(): Unit = AppTheme {
    HomeStore()
}