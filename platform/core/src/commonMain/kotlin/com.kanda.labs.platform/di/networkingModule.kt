import com.kanda.labs.platform.getKtorClient
import io.ktor.client.HttpClient
import io.ktor.client.engine.HttpClientEngine
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.defaultRequest
import io.ktor.client.plugins.logging.LogLevel
import io.ktor.client.plugins.logging.Logger
import io.ktor.client.plugins.logging.Logging
import io.ktor.client.plugins.logging.SIMPLE
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json

internal fun createJson(): Json = Json {
    isLenient = true
    ignoreUnknownKeys = true
    prettyPrint = true
    encodeDefaults = true
}

public fun createHttpClient(
    httpClientEngine: HttpClientEngine = getKtorClient(),
    enableNetworkLogs: Boolean = true
): HttpClient = HttpClient(httpClientEngine) {
    install(ContentNegotiation) {
        json()
    }
    defaultRequest {
        url("https://gist.githubusercontent.com/")
    }
    if (enableNetworkLogs) {
        install(Logging) {
            logger = Logger.SIMPLE
            level = LogLevel.INFO
        }
    }
}