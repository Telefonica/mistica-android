package com.telefonica.mistica.compose.theme.brand

import androidx.compose.ui.text.font.FontFamily
import com.telefonica.mistica.compose.theme.color.MisticaColors

interface Brand {
    val compatibilityTheme: Int
    val lightColors: MisticaColors
    val darkColors: MisticaColors
    val fontFamily: FontFamily
        get() = FontFamily.SansSerif
}
