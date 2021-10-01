package com.telefonica.mistica.compose.theme

import androidx.compose.runtime.Composable
import com.google.android.material.composethemeadapter.MdcTheme

@Composable
fun MisticaTheme(
    content: @Composable () -> Unit
) {
    MdcTheme {
        content()
    }
}