package com.kanda.labs.platform

import io.ktor.client.HttpClient
import io.ktor.client.engine.HttpClientEngine
import io.ktor.client.engine.okhttp.OkHttp

internal actual fun getKtorClient(): HttpClientEngine = HttpClient(OkHttp).engine