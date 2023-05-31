package com.telefonica.mistica.compose.theme.brand

import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import com.telefonica.mistica.compose.theme.color.MisticaColors
import com.telefonica.mistica.compose.theme.values.MisticaRadius
import com.telefonica.mistica.compose.theme.values.MisticaValues
import com.telefonica.mistica.compose.title.TitleStyle

interface Brand {
    val compatibilityTheme: Int
    val lightColors: MisticaColors
    val darkColors: MisticaColors
    val fontFamily: FontFamily
        get() = FontFamily.SansSerif
    val preset5FontWeight: FontWeight
        get() = FontWeight.Light
    val preset6FontWeight: FontWeight
        get() = FontWeight.Light
    val preset7FontWeight: FontWeight
        get() = FontWeight.Light
    val preset8FontWeight: FontWeight
        get() = FontWeight.Light
    val values: MisticaValues
        get() = MisticaValues(
            titleStyle = TitleStyle.TITLE_1,
        )
    val radius: MisticaRadius
}

enum class BrandType { BLAU, MOVISTAR, O2, TELEFONICA, VIVO }
