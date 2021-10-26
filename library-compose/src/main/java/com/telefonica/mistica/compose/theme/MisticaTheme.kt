package com.telefonica.mistica.compose.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.remember
import com.telefonica.mistica.compose.theme.brand.Brand
import com.telefonica.mistica.compose.theme.color.LocalMisticaColors
import com.telefonica.mistica.compose.theme.color.MisticaColors
import com.telefonica.mistica.compose.theme.text.LocalMisticaTypography
import com.telefonica.mistica.compose.theme.text.MisticaTypography

@Composable
fun MisticaTheme(
    brand: Brand,
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        brand.lightColors
    } else {
        brand.darkColors
    }
    val rememberedColors = remember {
        colors.copy()
    }.apply { updateColorsFrom(colors) }

    val typography = MisticaTypography(
        fontFamily = brand.fontFamily
    )

    CompositionLocalProvider(
        LocalMisticaColors provides rememberedColors,
        LocalMisticaTypography provides typography,
    ) {
        content()
    }
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


