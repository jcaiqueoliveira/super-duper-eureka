import com.kanda.labs.common.App
import org.jetbrains.skiko.wasm.onWasmReady

fun main() {
    onWasmReady {
        BrowserViewportWindow("Challenge-app") {
            App()
        }
    }
}
