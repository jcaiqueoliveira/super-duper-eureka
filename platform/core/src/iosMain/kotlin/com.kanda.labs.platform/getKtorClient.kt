package com.kanda.labs.platform

import io.ktor.client.engine.HttpClientEngine
import io.ktor.client.engine.darwin.Darwin

internal actual fun getKtorClient(): HttpClientEngine = Darwin.create()