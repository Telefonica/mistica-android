package com.telefonica.mistica.compose.catalog.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.theme.MisticaTheme
import com.telefonica.mistica.compose.button.Button
import com.telefonica.mistica.compose.button.ButtonStyle
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun Buttons() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        Text(
            text = "Progress buttons",
            style = MisticaTheme.typography.preset6
        )
        Divider(thickness = 1.dp)

        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            ButtonStyle.values()
                .filter { !it.name.contains("INVERSE") }
                .forEach {
                    var isLoading by remember(it.name) { mutableStateOf(false) }
                    Button(
                        text = "Progress button - ${it.name}",
                        loadingText = "Loading",
                        buttonStyle = it,
                        isLoading = isLoading,
                        onClickListener = {
                            isLoading = true
                            GlobalScope.launch {
                                delay(1000)
                                MainScope().launch { isLoading = false }
                            }
                        })
            }
        }

        Divider(thickness = 1.dp)

        Column(
            modifier = Modifier
                .background(MaterialTheme.colors.primary),
            verticalArrangement = Arrangement.spacedBy(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(
                text = "(Inverse)",
                style = MisticaTheme.typography.preset6,
                color = Color.White
            )

            ButtonStyle.values()
                .filter { it.name.contains("INVERSE") }
                .forEach {
                    var isLoading by remember(it.name) { mutableStateOf(false) }
                    Button(
                        text = "Progress button - ${it.name}",
                        loadingText = "Loading",
                        buttonStyle = it,
                        isLoading = isLoading,
                        onClickListener = {
                            isLoading = true
                            GlobalScope.launch {
                                delay(1000)
                                MainScope().launch { isLoading = false }
                            }
                        })
            }
        }


    }
}
