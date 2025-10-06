package com.telefonica.mistica.catalog.ui.compose.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.theme.MisticaTheme

@Composable
fun Texts() {
    Column(
        modifier = Modifier.padding(16.dp).fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(
            text = "Preset 10",
            style = MisticaTheme.typography.preset10
        )
        Text(
            text = "Preset 9",
            style = MisticaTheme.typography.preset9
        )
        Text(
            text = "Preset 8",
            style = MisticaTheme.typography.preset8
        )
        Text(
            text = "Preset 7",
            style = MisticaTheme.typography.preset7
        )
        Text(
            text = "Preset 6",
            style = MisticaTheme.typography.preset6
        )
        Text(
            text = "Preset 5",
            style = MisticaTheme.typography.preset5
        )
        Text(
            text = "Preset 4",
            style = MisticaTheme.typography.preset4
        )
        Text(
            text = "Preset 4 (Light)",
            style = MisticaTheme.typography.preset4Light
        )
        Text(
            text = "Preset 4 (Medium)",
            style = MisticaTheme.typography.preset4Medium
        )
        Text(
            text = "Preset 4 (Card Title)",
            style = MisticaTheme.typography.presetCardTitle
        )
        Text(
            text = "Preset 3",
            style = MisticaTheme.typography.preset3
        )
        Text(
            text = "Preset 3 (Light)",
            style = MisticaTheme.typography.preset3Light
        )
        Text(
            text = "Preset 3 (Medium)",
            style = MisticaTheme.typography.preset3Medium
        )
        Text(
            text = "Preset 3 (Row Title)",
            style = MisticaTheme.typography.presetRowTitle
        )
        Text(
            text = "Preset 2",
            style = MisticaTheme.typography.preset2
        )
        Text(
            text = "Preset 2 (Medium)",
            style = MisticaTheme.typography.preset2Medium
        )
        Text(
            text = "Preset 1",
            style = MisticaTheme.typography.preset1
        )
        Text(
            text = "Preset 1 (Medium)",
            style = MisticaTheme.typography.preset1Medium
        )
        Text(
            text = "System",
            style = MisticaTheme.typography.system
        )
    }
}
