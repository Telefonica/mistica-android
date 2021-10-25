package com.telefonica.mistica.compose.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import com.telefonica.mistica.compose.theme.color.LocalMisticaColors
import com.telefonica.mistica.compose.theme.color.MisticaColors
import com.telefonica.mistica.compose.theme.text.LocalMisticaTypography
import com.telefonica.mistica.compose.theme.text.MisticaTypography

@Composable
fun MisticaTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    content()
}

object MisticaTheme {

    val colors: MisticaColors
        @Composable
        @ReadOnlyComposable
        get() = LocalMisticaColors.current

    val typography: MisticaTypography
        @Composable
        @ReadOnlyComposable
        get() = LocalMisticaTypography.current
}
