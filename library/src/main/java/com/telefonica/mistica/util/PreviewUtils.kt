package com.telefonica.mistica.util

import androidx.compose.runtime.Composable
import com.telefonica.mistica.compose.theme.MisticaTheme
import com.telefonica.mistica.compose.theme.brand.TelefonicaBrand

@Composable
fun PreviewTheme(content: @Composable () -> Unit) {
    MisticaTheme(brand = TelefonicaBrand) {
        content()
    }
}