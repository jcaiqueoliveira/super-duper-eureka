package com.kanda.labs.store.view

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import com.kanda.labs.design.icons.rememberCoffee
import com.kanda.labs.design.icons.rememberConfirmationNumber
import com.kanda.labs.design.icons.rememberFilterVintage
import com.kanda.labs.store.server.StoreRepository
import com.kanda.labs.store.server.StoreResponse
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

internal class Store(private val repository: StoreRepository = StoreRepository()) {

    private val _products = MutableStateFlow(StoreUiState())
    val products = _products.asStateFlow()

    suspend fun getStoreItems() {

        val state = try {
            val response = repository.getStoreItems()
            StoreUiState(
                isLoading = false,
                hasError = false,
                products = mapToPresentation(response)
            )
        } catch (e: Exception) {
            StoreUiState(
                isLoading = false,
                hasError = true
            )
        }
        _products.emit(state)
    }

    private fun mapToPresentation(response: List<StoreResponse>): List<ProductPresentation> {
        return response.map { product ->
            ProductPresentation(
                name = product.name,
                code = product.code,
                price = product.price,
                formattedPrice = "$${product.price}",
                quantity = 0
            )
        }
    }
}

internal data class StoreUiState(
    val isLoading: Boolean = true,
    val hasError: Boolean = false,
    val products: List<ProductPresentation> = emptyList()
)

internal data class ProductPresentation(
    val name: String,
    val quantity: Int,
    val code: String,
    val price: Double,
    val formattedPrice: String
) {
    @Composable
    fun icon() = getIconByCode(code)
}

@Composable
internal fun getIconByCode(code: String): ImageVector {
    return when (code) {
        "VOUCHER" -> rememberConfirmationNumber()
        "MUG" -> rememberCoffee()
        else -> rememberFilterVintage()
    }
}