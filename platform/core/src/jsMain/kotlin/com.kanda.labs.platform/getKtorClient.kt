package com.kanda.labs.platform

import io.ktor.client.engine.HttpClientEngine
import io.ktor.client.engine.js.Js

public actual fun getKtorClient(): HttpClientEngine = Js.create()