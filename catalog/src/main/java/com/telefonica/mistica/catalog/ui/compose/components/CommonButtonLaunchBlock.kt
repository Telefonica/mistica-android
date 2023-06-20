package com.telefonica.mistica.catalog.ui.compose.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.button.Button

@Composable
fun CommmonButtonLaunchBlock(
    modifier: Modifier,
    onLaunchClassic: () -> Unit,
    onLaunchCompose: () -> Unit,
){
    Column(
        modifier = modifier
            .background(Color.White)
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Spacer(modifier = Modifier.height(20.dp))
        Row {
            Button(
                text = "Show Classic",
                onClickListener = onLaunchClassic
            )
            Spacer(modifier = Modifier.width(20.dp))
            Button(
                text = "Show Compose",
                onClickListener = onLaunchCompose
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
    }
}