package com.kanda.labs.store.view

import com.kanda.labs.store.server.StoreResponse
import com.kanda.labs.store.server.StoreService

internal object FakeRepository : StoreService {

    public override suspend fun getStoreItems(): List<StoreResponse> {
        return listOf(
            StoreResponse(code = "VOUCHER", name = "Voucher Item", price = 5.0),
            StoreResponse(code = "TSHIRT", name = "TShirt Item", price = 20.0),
            StoreResponse(code = "MUG", name = "Mug Item", price = 7.5)
        )
    }
}