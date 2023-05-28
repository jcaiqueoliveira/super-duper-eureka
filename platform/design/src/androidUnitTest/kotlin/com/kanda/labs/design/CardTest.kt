package com.kanda.labs.design

import androidx.compose.foundation.layout.Column
import app.cash.paparazzi.DeviceConfig
import app.cash.paparazzi.Paparazzi
import com.kanda.labs.design.component.Card
import com.kanda.labs.design.icons.rememberCoffee
import org.junit.Rule
import org.junit.Test

public class CardTest {

    @get:Rule
    public val paparazzi: Paparazzi = Paparazzi(
        deviceConfig = DeviceConfig.PIXEL_3.copy(softButtons = false),
        theme = "android:Theme.Material.Light.NoActionBar"
    )

    @Test
    public fun `test card item`() {
        paparazzi.snapshot {
            AppTheme(darkTheme = false) {
                Column {
                    Card(
                        icon = rememberCoffee(),
                        title = "Mug item",
                        supportText = "5.0€"
                    )
                }
            }
        }
    }
}