package com.kanda.labs.store.view

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.BoxWithConstraintsScope
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import com.kanda.labs.design.AppTheme
import com.kanda.labs.design.component.Button
import com.kanda.labs.design.component.Card
import com.kanda.labs.design.component.Error
import com.kanda.labs.design.component.Text
import com.kanda.labs.design.tokens.Spacers
import com.kanda.labs.design.typography.AppTypography
import kotlinx.coroutines.launch

public object HomeStore : Screen {
    @Composable
    public override fun Content() {
        val store = remember { StorePresenter() }
        val uiState by store.products.collectAsState()
        val scope = rememberCoroutineScope()

        LaunchedEffect(Unit) {
            store.getStoreItems()
        }

        BoxWithConstraints(
            modifier = Modifier.fillMaxSize().background(AppTheme.colors.backgroundPrimary)
        ) {
            when (uiState.hasError) {
                true -> Error(
                    modifier = Modifier.fillMaxSize(),
                    onClick = { scope.launch { store.userActions(Retry) } }
                )

                else -> ContentScreen(
                    uiState,
                    onAction = { scope.launch { store.userActions(it) } }
                )
            }
        }
    }
}

@Composable
private fun Loading() {
    LinearProgressIndicator(
        modifier = Modifier.fillMaxWidth(),
        color = AppTheme.colors.contentPrimary,
        backgroundColor = AppTheme.colors.contentInversePrimary
    )
}

@Composable
private fun BoxWithConstraintsScope.ContentScreen(
    uiState: StoreUiState,
    onAction: (UserActions) -> Unit
) {
    val grid = if (maxWidth > 400.dp) 3 else 2
    if (maxWidth < 400.dp) {
        Column(modifier = Modifier.fillMaxSize()) {
            Title()
            AnimatedVisibility(uiState.isLoading) {
                Loading()
            }
            ListProducts(
                modifier = Modifier.weight(1f),
                gridItems = grid,
                uiState.products,
                onAction = { action -> onAction(action) }
            )
            AnimatedVisibility(uiState.products.isNotEmpty()) {
                Checkout(
                    modifier = Modifier.fillMaxWidth().padding(top = Spacers.xSmall),
                    total = uiState.totalToPay,
                    errorMessageCheckout = uiState.checkoutErrorMessage,
                    onClick = { onAction(Buy) }
                )
            }
        }
    } else {
        Column {
            Title()
            Row {
                ListProducts(
                    modifier = Modifier.weight(1f),
                    gridItems = grid,
                    uiState.products,
                    onAction = { action -> onAction(action) }
                )
                AnimatedVisibility(
                    modifier = Modifier.weight(0.4f),
                    visible = uiState.products.isNotEmpty()
                ) {
                    Checkout(
                        total = uiState.totalToPay,
                        errorMessageCheckout = uiState.checkoutErrorMessage,
                        onClick = { onAction(Buy) }
                    )
                }
            }
        }
    }
}

@Composable
private fun Title() {
    Text(
        modifier = Modifier.padding(Spacers.small),
        text = "Cabify Store",
        typography = AppTypography.Titles.h4,
        contentColor = AppTheme.colors.contentSecondary
    )
}

@Composable
private fun ListProducts(
    modifier: Modifier,
    gridItems: Int,
    products: List<StorePresentation>,
    onAction: (UserActions) -> Unit
) {
    LazyVerticalGrid(
        modifier = modifier.padding(horizontal = Spacers.small),
        columns = GridCells.Fixed(gridItems),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(products) { item ->
            Card(
                icon = item.icon(),
                title = item.product.name,
                supportText = item.formattedPrice,
                count = item.quantity,
                primaryClick = { onAction(AddItem(item.code)) },
                secondaryClick = { onAction(RemoveItem(item.code)) }
            )
        }
    }
}

@Composable
private fun Checkout(
    modifier: Modifier = Modifier,
    total: String,
    errorMessageCheckout: String = "",
    onClick: (() -> Unit)? = null
) {
    val checkoutShape = RoundedCornerShape(topStart = Spacers.medium, topEnd = Spacers.medium)
    Column(
        modifier = modifier
            .clip(checkoutShape)
            .border(
                border = BorderStroke(1.dp, color = AppTheme.colors.border),
                shape = checkoutShape
            ),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        AnimatedVisibility(errorMessageCheckout.isNotEmpty()) {
            Text(
                modifier = Modifier.padding(Spacers.xSmall),
                text = errorMessageCheckout,
                contentColor = AppTheme.colors.warning,
                typography = AppTypography.Titles.h6
            )
        }
        Row(
            modifier = Modifier.fillMaxWidth().padding(Spacers.small),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                modifier = Modifier.weight(1f),
                text = "Total to pay",
                contentColor = AppTheme.colors.contentSecondary,
                typography = AppTypography.Titles.h7
            )
            Text(
                modifier = Modifier.weight(1f),
                text = total,
                contentColor = AppTheme.colors.contentPrimary,
                textAlign = TextAlign.End,
                typography = AppTypography.Titles.h7
            )
        }
        Button(
            modifier = Modifier
                .padding(horizontal = Spacers.small)
                .padding(bottom = Spacers.small),
            text = "Buy",
            onClick = onClick
        )
    }
}