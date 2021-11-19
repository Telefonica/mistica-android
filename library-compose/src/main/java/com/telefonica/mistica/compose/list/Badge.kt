package com.telefonica.mistica.compose.list

import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.BadgeBox
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.theme.MisticaTheme

@ExperimentalMaterialApi
@Composable
fun Badge(
    modifier: Modifier = Modifier,
    content: String?,
) {
    if (content.isNullOrEmpty()) {
        Surface(
            shape = CircleShape,
            color = MisticaTheme.colors.badge,
            modifier = modifier
                .size(8.dp),
        ) { }
    } else {
        BadgeBox(
            badgeContent = {
                Text(
                    text = content,
                    color = Color.White,
                )
            },
            backgroundColor = MisticaTheme.colors.badge,
            modifier = modifier
                .absolutePadding(0.dp, 0.dp, 8.dp, 0.dp)
        ) { }
    }
}

@ExperimentalMaterialApi
@Preview(showBackground = true)
@Composable
fun BadgePreview() {
    Badge(content = "hola")
}
