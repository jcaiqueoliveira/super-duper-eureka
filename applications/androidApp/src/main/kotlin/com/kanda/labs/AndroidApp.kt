package com.kanda.labs

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger

public class AndroidApp : Application() {
    override fun onCreate() {
        super.onCreate()
    }
}