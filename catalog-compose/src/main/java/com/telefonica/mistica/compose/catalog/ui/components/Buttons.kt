package com.telefonica.mistica.compose.catalog.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.button.ProgressButton
import com.telefonica.mistica.compose.button.ProgressButtonStyle
import com.telefonica.mistica.compose.theme.MisticaTheme
import com.telefonica.mistica.compose.theme.text.MisticaTypography
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
            style = MisticaTheme.typography.Preset6
        )
        Divider(thickness = 1.dp)

        Column(
            verticalArrangement = Arrangement.spacedBy(8.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {

            ProgressButtonStyle.values()
                .filter { !it.name.contains("INVERSE") }
                .forEach {
                ProgressButton(
                    text = "Progress button - ${it.name}",
                    loadingText = "Loading",
                    buttonStyle = it,
                    onClickListener = {
                        it.startLoading()
                        GlobalScope.launch {
                            delay(1000)
                            MainScope().launch { it.stopLoading() }
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
                style = MisticaTheme.typography.Preset6,
                color = Color.White
            )


            ProgressButtonStyle.values()
                .filter { it.name.contains("INVERSE") }
                .forEach {
                ProgressButton(
                    text = "Progress button - ${it.name}",
                    loadingText = "Loading",
                    buttonStyle = it,
                    onClickListener = {
                        it.startLoading()
                        GlobalScope.launch {
                            delay(1000)
                            MainScope().launch { it.stopLoading() }
                        }
                    })
            }
        }


    }
}
