package com.telefonica.mistica.compose.list

import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.theme.MisticaTheme

@ExperimentalMaterialApi
@Composable
fun Badge(
    modifier: Modifier = Modifier,
    content: String? = null,
) {
    if (content.isNullOrEmpty()) {
        Surface(
            shape = CircleShape,
            color = MisticaTheme.colors.badge,
            modifier = modifier
                .size(8.dp),
        ) { }
    } else {
        androidx.compose.material.Badge(
            backgroundColor = MisticaTheme.colors.badge,
        ) {
            Text(
                text = content,
                color = Color.White,
            )
        }
    }
}