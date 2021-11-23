package com.telefonica.mistica.compose.list

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.theme.MisticaTheme
import com.telefonica.mistica.compose.theme.brand.MovistarBrand
import com.telefonica.mistica.compose.theme.brand.VivoBrand

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
            modifier = modifier,
        ) {
            Text(
                text = content,
                color = MisticaTheme.colors.textPrimaryInverse,
            )
        }
    }
}

@ExperimentalMaterialApi
@Preview(showBackground = true)
@Composable
fun BadgePreview() {
    MisticaTheme(brand = MovistarBrand) {
        Column(
            horizontalAlignment = Alignment.End,
            modifier = Modifier.padding(16.dp)
        ) {
            Badge(content = "2")
            Spacer(modifier = Modifier.height(8.dp))
            Badge(content = "")
            Spacer(modifier = Modifier.height(8.dp))
            Badge()
        }
    }
}
