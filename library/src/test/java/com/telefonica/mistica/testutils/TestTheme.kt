package com.telefonica.mistica.testutils

import androidx.compose.runtime.Composable
import com.telefonica.mistica.compose.theme.MisticaTheme
import com.telefonica.mistica.compose.theme.brand.MovistarBrand

@Composable
fun TestTheme(content: @Composable () -> Unit) {
    MisticaTheme(brand = MovistarBrand) {
        content()
    }
}