package com.kanda.labs.common

import androidx.compose.runtime.Composable
import cafe.adriel.voyager.navigator.Navigator
import com.kanda.labs.design.AppTheme
import com.kanda.labs.store.view.HomeStoreScreen

@Composable
public fun App(): Unit = AppTheme {
    Navigator(HomeStoreScreen)
}