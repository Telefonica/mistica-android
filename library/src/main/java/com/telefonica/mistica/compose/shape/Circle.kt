package com.telefonica.mistica.compose.shape

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.theme.MisticaTheme

@Composable
fun Circle(
    modifier: Modifier = Modifier,
    color: Color = MisticaTheme.colors.neutralLow,
    size: Dp = 40.dp,
    content: @Composable (() -> Unit),
) {
    Box(
        modifier = modifier
            .size(size)
            .clip(CircleShape)
            .background(color)
            .wrapContentSize(align = Alignment.Center)
    ) {
        content()
    }
}
