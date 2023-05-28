package com.kanda.labs.store.server

import com.kanda.labs.store.server.Endpoints.PRODUCT
import createHttpClient
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json


internal class StoreRepository(private val client: HttpClient = createHttpClient()) {

    public suspend fun getStoreItems(): List<StoreResponse> {
        val responsePlainText = client.get(PRODUCT).body<String>()
        return Json.decodeFromString<StoreResponseRaw>(responsePlainText).products
    }
}