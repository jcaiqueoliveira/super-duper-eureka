package com.kanda.labs.design

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import app.cash.paparazzi.DeviceConfig
import app.cash.paparazzi.Paparazzi
import com.kanda.labs.design.component.SuccessScreen
import org.junit.Rule
import org.junit.Test

public class SuccessScreenTest {

    @get:Rule
    public val paparazziRule: Paparazzi = Paparazzi(
        deviceConfig = DeviceConfig.PIXEL_3.copy(softButtons = false),
        theme = "android:Theme.Material.Light.NoActionBar"
    )

    @Test
    public fun `test success screen`() {
        paparazziRule.snapshot {
            AppTheme(darkTheme = false) {
                Column(modifier = Modifier.fillMaxSize()) {
                    SuccessScreen(
                        title = "Title!",
                        description = "Description",
                        textAction = "Action",
                        onClick = {}
                    )
                }
            }
        }
    }
}