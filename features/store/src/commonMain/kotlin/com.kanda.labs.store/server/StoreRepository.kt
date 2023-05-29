package com.kanda.labs.store.server

import com.kanda.labs.store.server.Endpoints.PRODUCT
import createHttpClient
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get

public interface StoreService {
    public suspend fun getStoreItems(): List<StoreResponse>
}

internal class StoreRepository(
    private val client: HttpClient = createHttpClient()
) : StoreService {

    public override suspend fun getStoreItems(): List<StoreResponse> {
        val responsePlainText = client.get(PRODUCT).body<StoreResponseRaw>()
        return responsePlainText.products
    }
}