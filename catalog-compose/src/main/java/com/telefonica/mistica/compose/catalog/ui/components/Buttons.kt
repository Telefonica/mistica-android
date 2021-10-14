package com.telefonica.mistica.compose.catalog.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.telefonica.mistica.compose.button.Button
import com.telefonica.mistica.compose.button.ProgressButton
import com.telefonica.mistica.compose.button.ProgressButtonStyle
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun Buttons() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Button(buttonText = "Primary")

        ProgressButton(
            text = "Progress button",
            loadingText = "Loading",
            onClickListener = {
                it.startLoading()
                GlobalScope.launch {
                    delay(1000)
                    MainScope().launch { it.stopLoading() }
                }
            })

        ProgressButton(
            text = "Progress button",
            loadingText = "Loading",
            buttonStyle = ProgressButtonStyle.DANGER,
            onClickListener = {
                it.startLoading()
                GlobalScope.launch {
                    delay(1000)
                    MainScope().launch { it.stopLoading() }
                }
            })
    }
}