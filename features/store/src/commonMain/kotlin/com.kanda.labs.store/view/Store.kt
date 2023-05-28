package com.kanda.labs.store.view

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import com.kanda.labs.design.icons.rememberCoffee
import com.kanda.labs.design.icons.rememberConfirmationNumber
import com.kanda.labs.design.icons.rememberFilterVintage
import com.kanda.labs.store.domain.ProductItem
import com.kanda.labs.store.domain.mapToProductItem
import com.kanda.labs.store.server.StoreRepository
import com.kanda.labs.store.server.StoreResponse
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

internal class Store(private val repository: StoreRepository = StoreRepository()) {

    private val _products = MutableStateFlow(StoreUiState())
    val products = _products.asStateFlow()

    private val product: MutableMap<String, StorePresentation> = mutableMapOf()

    suspend fun getStoreItems() {

        val state = try {
            val response = repository.getStoreItems()
            val presentation = mapToPresentation(response).toMutableList()
            presentation.forEach {
                product[it.code] = it
            }
            StoreUiState(
                isLoading = false,
                hasError = false,
                products = presentation
            )
        } catch (e: Exception) {
            StoreUiState(
                isLoading = false,
                hasError = true
            )
        }
        _products.emit(state)
    }

    private fun calculateTotalToPay(): Double {
        return product.values.sumOf { it.product.totalToPay(it.quantity) }
    }

    fun userActions(actions: UserActions) {
        var hasCheckoutError = false
        when (actions) {
            is AddItem -> {
                product[actions.code]?.let { item ->
                    product[actions.code] = item.copy(quantity = item.quantity + 1)
                }
            }

            is RemoveItem -> {
                product[actions.code]?.let { item ->
                    if (item.quantity > 0) {
                        product[actions.code] = item.copy(quantity = item.quantity - 1)
                    }
                }
            }

            is Buy -> {
                val totalToPay = calculateTotalToPay()

                if (totalToPay == 0.0) {
                    hasCheckoutError = true
                }
            }
        }

        _products.update { state ->
            state.copy(
                products = product.values.toList(),
                totalToPay = "${calculateTotalToPay()}€",
                checkoutErrorMessage = if (hasCheckoutError) "Please select at least one item" else ""
            )
        }
    }

    private fun mapToPresentation(response: List<StoreResponse>): List<StorePresentation> {
        return response.map { product ->
            StorePresentation(
                product = mapToProductItem(
                    code = product.code,
                    price = product.price,
                    name = product.name
                ),
                code = product.code,
                formattedPrice = "${product.price}€",
                quantity = 0
            )
        }
    }
}

internal sealed interface UserActions
internal data class AddItem(val code: String) : UserActions
internal data class RemoveItem(val code: String) : UserActions
internal object Buy : UserActions

internal data class StoreUiState(
    val isLoading: Boolean = true,
    val hasError: Boolean = false,
    val products: List<StorePresentation> = emptyList(),
    val totalToPay: String = "0",
    val checkoutErrorMessage: String = ""
)

internal data class StorePresentation(
    val code: String,
    val product: ProductItem,
    val formattedPrice: String,
    val quantity: Int = 0
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