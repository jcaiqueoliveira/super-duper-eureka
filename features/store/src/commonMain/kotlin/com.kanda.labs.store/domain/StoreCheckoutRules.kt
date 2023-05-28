package com.kanda.labs.store.domain

public fun mapToProductItem(
    code: String,
    name: String,
    price: Double
): ProductItem {
    return when (code) {
        "VOUCHER" -> Voucher(name, price)
        "MUG" -> Mug(name, price)
        "TSHIRT" -> TShirt(name, price)
        else -> GenericProduct(name, price)
    }
}

public abstract class ProductItem(
    public open val name: String,
    public open val price: Double,
) {
    public abstract fun totalToPay(quantity: Int): Double
}

public data class GenericProduct(
    override val name: String,
    override val price: Double,
) : ProductItem(name, price) {
    override fun totalToPay(quantity: Int): Double = quantity * price
}

public data class Mug(
    override val name: String,
    override val price: Double,
) : ProductItem(name, price) {

    override fun totalToPay(quantity: Int): Double = quantity * price
}

public data class Voucher(
    override val name: String,
    override val price: Double,
) : ProductItem(name, price) {

    override fun totalToPay(quantity: Int): Double {
        val quantityToPay = quantity / 2 + quantity % 2
        return price * quantityToPay
    }
}

public data class TShirt(
    override val name: String,
    override val price: Double,
) : ProductItem(name, price) {
    override fun totalToPay(quantity: Int): Double {
        return if (quantity >= 3) quantity * 19.00 else quantity * price
    }
}