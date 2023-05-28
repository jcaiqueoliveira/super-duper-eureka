package com.kanda.labs.store.view

import app.cash.turbine.test
import com.kanda.labs.store.domain.Voucher
import com.kanda.labs.store.server.StoreResponse
import com.kanda.labs.store.server.StoreService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.setMain
import kotlin.test.AfterTest
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertTrue

@OptIn(ExperimentalCoroutinesApi::class)
public class StorePresenterTest {

    @BeforeTest
    public fun setUp() {
        Dispatchers.setMain(StandardTestDispatcher())
    }

    @AfterTest
    public fun after() {
        Dispatchers.resetMain()
    }

    @Test
    public fun startWithLoadingState() {
        runTest {
            val presenter = StorePresenter()

            val item = presenter.products.first()

            assertTrue(
                message = "first item emitted should be loading",
                actual = item.isLoading
            )
        }
    }

    @Test
    public fun showErrorState() {
        runTest {
            val fakeRepository: StoreService = object : StoreService {
                override suspend fun getStoreItems(): List<StoreResponse> {
                    throw Exception("Any error exception")
                }
            }
            val presenter = StorePresenter(fakeRepository)

            presenter.products.test {
                presenter.getStoreItems()
                awaitItem()
                val item = awaitItem()
                assertTrue(
                    message = "item emitted should indicate an error state",
                    actual = item.hasError
                )
            }
        }
    }

    @Test
    public fun showContentState() {
        runTest {
            val presenter = StorePresenter(FakeRepository)
            presenter.products.test {
                presenter.getStoreItems()
                awaitItem()
                val item = awaitItem()
                assertTrue(
                    message = "ui state should contain one product item",
                    actual = item.products.first().product is Voucher
                )
            }
        }
    }

    @Test
    public fun testAddingItems() {
//        Items: VOUCHER, TSHIRT, MUG
//        Total: 32.50€
        runTest {
            val presenter = StorePresenter(FakeRepository)
            presenter.products.test {
                presenter.getStoreItems()
                awaitItem()

                presenter.userActions(AddItem("VOUCHER"))
                presenter.userActions(AddItem("TSHIRT"))
                presenter.userActions(AddItem("MUG"))

                repeat(3) { awaitItem() }

                val item = awaitItem()

                assertTrue(
                    message = "acceptance criteria for single item",
                    actual = item.totalToPay.contains("32.5")
                )
            }
        }
    }

    @Test
    public fun testAddingMultiplesTShirtItems() {
//        Items: TSHIRT, TSHIRT, TSHIRT, VOUCHER, TSHIRT
//        Total: 81.00€
        runTest {
            val presenter = StorePresenter(FakeRepository)
            presenter.products.test {
                presenter.getStoreItems()
                awaitItem()

                presenter.userActions(AddItem("TSHIRT"))
                presenter.userActions(AddItem("TSHIRT"))
                presenter.userActions(AddItem("TSHIRT"))
                presenter.userActions(AddItem("VOUCHER"))
                presenter.userActions(AddItem("TSHIRT"))

                repeat(5) { awaitItem() }

                val item = awaitItem()

                assertTrue(
                    message = "check acceptance criteria for multiples tshirt",
                    actual = item.totalToPay.contains("81.0")
                )
            }
        }
    }

    @Test
    public fun testAddingMultiplesVoucherItems() {
//        Items: VOUCHER, TSHIRT, VOUCHER, VOUCHER, MUG, TSHIRT, TSHIRT
//        Total: 74.50€
        runTest {
            val presenter = StorePresenter(FakeRepository)
            presenter.products.test {
                presenter.getStoreItems()
                awaitItem()

                presenter.userActions(AddItem("VOUCHER"))
                presenter.userActions(AddItem("TSHIRT"))
                presenter.userActions(AddItem("VOUCHER"))
                presenter.userActions(AddItem("VOUCHER"))
                presenter.userActions(AddItem("MUG"))
                presenter.userActions(AddItem("TSHIRT"))
                presenter.userActions(AddItem("TSHIRT"))

                repeat(7) { awaitItem() }

                val item = awaitItem()

                assertTrue(
                    message = "check acceptance criteria for multiples voucher",
                    actual = item.totalToPay.contains("74.5")
                )
            }
        }
    }
}