package com.telefonica.mistica.catalog.ui.compose.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.catalog.R
import com.telefonica.mistica.compose.button.Button
import com.telefonica.mistica.compose.button.ButtonStyle
import com.telefonica.mistica.compose.theme.MisticaTheme
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun Buttons() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Buttons(
            modifier = Modifier
                .background(MisticaTheme.colors.background),
            filter = { !it.name.contains("INVERSE") }
        )
        Buttons(
            modifier = Modifier
                .background(MisticaTheme.colors.backgroundBrand),
            filter = { it.name.contains("INVERSE") }
        )
    }
}

@Composable
private fun Buttons(
    modifier: Modifier = Modifier,
    filter: (ButtonStyle) -> Boolean,
) {
    Column(
        modifier = modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Spacer(
            modifier = Modifier.height(16.dp)
        )

        val scope = rememberCoroutineScope()
        ButtonStyle.values()
            .filter(filter)
            .forEach {
                CatalogButton(
                    name = it.name.lowercase().replaceFirstChar(Char::titlecase),
                    style = it,
                    isLoading = false,
                )

                CatalogButton(
                    name = it.name.lowercase().replaceFirstChar(Char::titlecase),
                    style = it,
                    isLoading = false,
                    icon = R.drawable.icn_creditcard
                )

                var isLoading by remember(it.name) { mutableStateOf(false) }
                CatalogButton(
                    name = "${it.name} Progress".lowercase().replaceFirstChar(Char::titlecase),
                    style = it,
                    isLoading = isLoading,
                    loadingText = "Loading",
                    onClickListener = {
                        isLoading = true
                        scope.launch {
                            delay(1000)
                            MainScope().launch { isLoading = false }
                        }
                    }
                )

                CatalogButton(
                    name = "${it.name} Disabled".lowercase().replaceFirstChar(Char::titlecase),
                    style = it,
                    enabled = false,
                    isLoading = false,
                )
            }
    }
}

@Composable
private fun CatalogButton(
    name: String,
    style: ButtonStyle,
    enabled: Boolean = true,
    isLoading: Boolean,
    loadingText: String = "",
    onClickListener: () -> Unit = {},
    @DrawableRes icon: Int? = null,
) {
    Button(
        text = name,
        loadingText = loadingText,
        buttonStyle = style,
        isLoading = isLoading,
        enabled = enabled,
        icon = icon,
        onClickListener = onClickListener,
    )
}
