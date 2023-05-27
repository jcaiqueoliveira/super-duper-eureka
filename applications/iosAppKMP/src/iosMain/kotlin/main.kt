import androidx.compose.ui.window.ComposeUIViewController
import com.kanda.labs.common.App
import platform.UIKit.UIViewController

fun MainViewController(): UIViewController {
    return ComposeUIViewController { App() }
}