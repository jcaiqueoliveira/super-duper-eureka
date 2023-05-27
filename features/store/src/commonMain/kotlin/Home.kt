import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.kanda.labs.design.AppTheme
import com.kanda.labs.design.component.Card
import com.kanda.labs.design.component.Text
import com.kanda.labs.design.icons.rememberCoffee
import com.kanda.labs.design.icons.rememberConfirmationNumber
import com.kanda.labs.design.icons.rememberFilterVintage
import com.kanda.labs.design.tokens.Spacers
import com.kanda.labs.design.typography.AppTypography

@Composable
public fun HomeStore() {

    Column(modifier = Modifier.fillMaxSize().padding(Spacers.small)) {
        Text(
            modifier = Modifier.padding(bottom = Spacers.small),
            text = "Cabify Store",
            typography = AppTypography.Titles.h4,
            contentColor = AppTheme.colors.contentSecondary
        )
        Row {
            Card(
                modifier = Modifier.weight(1f).padding(end = 4.dp),
                icon = rememberFilterVintage(),
                title = "Cabify T-Shirt",
                supportText = "$42,00",
                count = 2
            )

            Card(
                modifier = Modifier.weight(1f).padding(start = 4.dp),
                icon = rememberCoffee(),
                title = "Cabify Coffee Mug",
                supportText = "$42,00"
            )
        }
        Card(
            modifier = Modifier.fillMaxWidth(0.5f).padding(end = 4.dp, top = 8.dp),
            icon = rememberConfirmationNumber(),
            title = "Cabify Voucher",
            supportText = "$42,00"
        )
    }
}