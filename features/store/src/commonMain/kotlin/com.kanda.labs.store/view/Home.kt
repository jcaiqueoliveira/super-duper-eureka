package com.kanda.labs.store.view

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import com.kanda.labs.design.AppTheme
import com.kanda.labs.design.component.Button
import com.kanda.labs.design.component.Card
import com.kanda.labs.design.component.Text
import com.kanda.labs.design.tokens.Spacers
import com.kanda.labs.design.typography.AppTypography

public object HomeStore : Screen {
    @Composable
    public override fun Content() {
        val store = remember { Store() }
        val uiState by store.products.collectAsState()
        LaunchedEffect(Unit) {
            store.getStoreItems()
        }
        BoxWithConstraints(modifier = Modifier.fillMaxSize()) {
            val grid = if (maxWidth > 400.dp) 4 else 2
            Surface(
                color = AppTheme.colors.backgroundPrimary,
                modifier = Modifier.fillMaxSize()
            ) {
                Column(modifier = Modifier.fillMaxSize()) {
                    Text(
                        modifier = Modifier.padding(Spacers.small),
                        text = "Cabify Store",
                        typography = AppTypography.Titles.h4,
                        contentColor = AppTheme.colors.contentSecondary
                    )
                    LazyVerticalGrid(
                        modifier = Modifier.weight(1f).padding(horizontal = Spacers.small),
                        columns = GridCells.Fixed(grid),
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        items(uiState.products) { item ->
                            Card(
                                icon = item.icon(),
                                title = item.product.name,
                                supportText = item.formattedPrice,
                                count = item.quantity,
                                primaryClick = { store.userActions(AddItem(item.code)) },
                                secondaryClick = { store.userActions(RemoveItem(item.code)) }
                            )
                        }
                    }
                    AnimatedVisibility(uiState.products.isNotEmpty()) {
                        Checkout(
                            modifier = Modifier.padding(top = Spacers.xSmall),
                            total = uiState.totalToPay,
                            errorMessageCheckout = uiState.checkoutErrorMessage,
                            onClick = { store.userActions(Buy) }
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun Checkout(
    modifier: Modifier,
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
            )
            .fillMaxWidth(),
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