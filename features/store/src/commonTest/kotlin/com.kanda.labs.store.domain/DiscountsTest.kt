package com.kanda.labs.store.domain

import kotlin.test.Test
import kotlin.test.asserter

public class DiscountsTest {

    @Test
    public fun applyDiscountFor3OrMoreTShirt() {
        val tShirtProduct = TShirt(
            name = "Tshirt",
            price = 20.0
        )
        val total = tShirtProduct.totalToPay(quantity = 3)
        asserter.assertTrue(null, actual = total == 57.0)
    }

    @Test
    public fun applyDiscountForEach2Voucher() {
        val tShirtProduct = Voucher(
            name = "Voucher",
            price = 5.0
        )
        val total = tShirtProduct.totalToPay(quantity = 3)
        asserter.assertTrue(null, actual = total == 10.0)
    }

    @Test
    public fun doNotApplyAnyDiscountForMugs() {
        val tShirtProduct = Mug(
            name = "Mug",
            price = 7.5
        )
        val total = tShirtProduct.totalToPay(quantity = 4)
        asserter.assertTrue(null, actual = total == 30.0)
    }
}