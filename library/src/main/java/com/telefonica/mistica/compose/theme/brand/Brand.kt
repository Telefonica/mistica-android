package com.telefonica.mistica.compose.theme.brand

import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.theme.color.MisticaColors
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
            buttonBorderRadius = 4.dp,
            inputBorderRadius = 8.dp,
            containerBorderRadius = 8.dp,
            legacyDisplayBorderRadius = 16.dp,
            popupBorderRadius = 8.dp,
            checkboxBorderRadius = 2.dp,
            indicatorBorderRadius = 999.dp,
            sheetBorderRadius = 8.dp,
            barBorderRadius = 999.dp
        )
}

enum class BrandType { BLAU, MOVISTAR, O2, TELEFONICA, VIVO }
