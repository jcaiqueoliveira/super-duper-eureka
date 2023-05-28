package com.kanda.labs.design

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import app.cash.paparazzi.DeviceConfig
import app.cash.paparazzi.Paparazzi
import com.kanda.labs.design.component.Error
import org.junit.Rule
import org.junit.Test

public class ErrorScreenTest {

    @get:Rule
    public val paparazzi: Paparazzi = Paparazzi(
        deviceConfig = DeviceConfig.PIXEL_3.copy(softButtons = false),
        theme = "android:Theme.Material.Light.NoActionBar"
    )

    @Test
    public fun `test error screen`() {
        paparazzi.snapshot {
            AppTheme(darkTheme = false) {
                Column(modifier = Modifier.fillMaxSize()) {
                    Error()
                }
            }
        }
    }
}