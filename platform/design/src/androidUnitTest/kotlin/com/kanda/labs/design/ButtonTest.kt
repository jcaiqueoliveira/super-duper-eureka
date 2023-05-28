package com.kanda.labs.design

import androidx.compose.foundation.layout.Column
import app.cash.paparazzi.DeviceConfig
import app.cash.paparazzi.Paparazzi
import com.kanda.labs.design.component.Button
import org.junit.Rule
import org.junit.Test

public class ButtonTest {

    @get:Rule
    public val paparazziRule: Paparazzi = Paparazzi(
        deviceConfig = DeviceConfig.PIXEL_3.copy(softButtons = false),
        theme = "android:Theme.Material.Light.NoActionBar"
    )

    @Test
    public fun `test primary button`() {
        paparazziRule.snapshot {
            AppTheme(darkTheme = false) {
                Column {
                    Button(text = "Test button")
                }
            }
        }
    }

    @Test
    public fun `test loading button`() {
        paparazziRule.snapshot {
            AppTheme(darkTheme = false) {
                Column {
                    Button(
                        text = "Test button",
                        isLoading = true
                    )
                }
            }
        }
    }
}