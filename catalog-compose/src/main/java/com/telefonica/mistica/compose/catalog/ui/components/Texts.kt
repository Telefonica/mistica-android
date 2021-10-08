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
            style = MisticaTextStyle.Preset8
        )
        Text(
            text = "Preset 7",
            style = MisticaTextStyle.Preset7)
        Text(
            text = "Preset 6",
            style = MisticaTextStyle.Preset6
        )
        Text(
            text = "Preset 5",
            style = MisticaTextStyle.Preset5
        )
        Text(
            text = "Preset 4",
            style = MisticaTextStyle.Preset4
        )
        Text(
            text = "Preset 4 (Light)",
            style = MisticaTextStyle.Preset4Light
        )
        Text(
            text = "Preset 4 (Medium)",
            style = MisticaTextStyle.Preset4Medium
        )
        Text(
            text = "Preset 3",
            style = MisticaTextStyle.Preset3
        )
        Text(
            text = "Preset 3 (Light)",
            style = MisticaTextStyle.Preset3Light
        )
        Text(
            text = "Preset 3 (Medium)",
            style = MisticaTextStyle.Preset3Medium
        )
        Text(
            text = "Preset 2",
            style = MisticaTextStyle.Preset2
        )
        Text(
            text = "Preset 2 (Medium)",
            style = MisticaTextStyle.Preset2Medium
        )
        Text(
            text = "Preset 1",
            style = MisticaTextStyle.Preset1
        )
        Text(
            text = "Preset 1 (Medium)",
            style = MisticaTextStyle.Preset1Medium
        )
        Text(
            text = "System",
            style = MisticaTextStyle.Pystem
        )
    }
}