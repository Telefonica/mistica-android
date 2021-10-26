package com.telefonica.mistica.compose.theme.brand

import androidx.compose.ui.text.font.FontFamily
import com.telefonica.mistica.compose.theme.color.MisticaColors

sealed class Brand(
    internal val lightColors: MisticaColors,
    internal val darkColors: MisticaColors,
    internal val fontFamily: FontFamily = FontFamily.SansSerif,
)
