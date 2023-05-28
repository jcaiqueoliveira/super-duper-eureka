package com.kanda.labs.store.server

import kotlinx.serialization.Serializable

@Serializable
public data class StoreResponse(
    val code: String,
    val name: String,
    val price: Double,
)

@Serializable
public data class StoreResponseRaw(
    val products: List<StoreResponse>
)