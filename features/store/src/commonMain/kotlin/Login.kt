import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
public fun HomeStore() {

    Column(modifier = Modifier.fillMaxSize()) {

        Text(
            text = "Hello world",
            style = MaterialTheme.typography.h4,
            modifier = Modifier.padding(16.dp)
        )
    }
}