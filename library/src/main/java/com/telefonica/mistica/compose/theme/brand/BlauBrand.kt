package com.telefonica.mistica.compose.theme.brand

import com.telefonica.mistica.R

object BlauBrand : Brand {

    override val compatibilityTheme: Int
        get() = R.style.MisticaTheme_Blau

    override val lightColors = BlauBrandColors.lightColors

    override val darkColors = BlauBrandColors.darkColors
}
