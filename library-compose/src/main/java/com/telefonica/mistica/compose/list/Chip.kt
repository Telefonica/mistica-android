package com.telefonica.mistica.compose.list

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.theme.MisticaTheme

@Composable
fun Chip(
    name: String = "Chip",
    color: Color = MisticaTheme.colors.badge,
) {
    Surface(
        shape = RoundedCornerShape(4.dp),
        color = color,
    ) {
        Text(
            text = name.uppercase(),
            style = MisticaTheme.typography.preset1Medium,
            color = Color.White,
            modifier = Modifier.padding(
                horizontal = 8.dp,
            ),
        )
    }
}
