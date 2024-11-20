package com.telefonica.mistica.compose.card.postercard

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
internal fun PosterCardTopContent(modifier: Modifier = Modifier){
    Row(
        modifier = modifier
            .fillMaxWidth()
            .background(color = Color.Gray)
            .padding(top = 16.dp, start = 16.dp, end = 16.dp, bottom = 40.dp)
    ) {
        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.Green)
                .height(30.dp)
        )
    }
}