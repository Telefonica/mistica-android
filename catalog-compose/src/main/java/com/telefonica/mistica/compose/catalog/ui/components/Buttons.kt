package com.telefonica.mistica.compose.catalog.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
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
    filter: (ButtonStyle) -> Boolean
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
        ,
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
                    name = it.name,
                    style = it,
                    isLoading = false,
                )

                var isLoading by remember(it.name) { mutableStateOf(false) }
                CatalogButton(
                    name = "${it.name} Progress",
                    style = it,
                    isLoading = isLoading,
                    onClickListener = {
                        isLoading = true
                        scope.launch {
                            delay(1000)
                            MainScope().launch { isLoading = false }
                        }
                    }
                )

                CatalogButton(
                    name = "${it.name} Disabled",
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
    onClickListener: () -> Unit = {}
) {
    Button(
        modifier = Modifier
            .padding(horizontal = 16.dp),
        text = name,
        loadingText = loadingText,
        buttonStyle = style,
        isLoading = isLoading,
        enabled = enabled,
        onClickListener = onClickListener
    )
}