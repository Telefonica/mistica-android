package com.telefonica.mistica.compose.catalog.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.telefonica.mistica.compose.text.MisticaTextStyle

@Composable
fun Texts() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = "Preset 8",
            style = MisticaTextStyle.preset8
        )
        Text(
            text = "Preset 7",
            style = MisticaTextStyle.preset7)
        Text(
            text = "Preset 6",
            style = MisticaTextStyle.preset6
        )
        Text(
            text = "Preset 5",
            style = MisticaTextStyle.preset5
        )
        Text(
            text = "Preset 4",
            style = MisticaTextStyle.preset4
        )
        Text(
            text = "Preset 4 (Light)",
            style = MisticaTextStyle.preset4Light
        )
        Text(
            text = "Preset 4 (Medium)",
            style = MisticaTextStyle.preset4Medium
        )
        Text(
            text = "Preset 3",
            style = MisticaTextStyle.preset3
        )
        Text(
            text = "Preset 3 (Light)",
            style = MisticaTextStyle.preset3Light
        )
        Text(
            text = "Preset 3 (Medium)",
            style = MisticaTextStyle.preset3Medium
        )
        Text(
            text = "Preset 2",
            style = MisticaTextStyle.preset2
        )
        Text(
            text = "Preset 2 (Medium)",
            style = MisticaTextStyle.preset2Medium
        )
        Text(
            text = "Preset 1",
            style = MisticaTextStyle.preset1
        )
        Text(
            text = "Preset 1 (Medium)",
            style = MisticaTextStyle.preset1Medium
        )
        Text(
            text = "System",
            style = MisticaTextStyle.system
        )
    }
}