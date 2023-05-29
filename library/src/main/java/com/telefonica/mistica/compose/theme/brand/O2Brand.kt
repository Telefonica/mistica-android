package com.telefonica.mistica.compose.theme.brand

import com.telefonica.mistica.R

object O2Brand : Brand {

    override val compatibilityTheme: Int
        get() = R.style.MisticaTheme_O2

    override val lightColors = O2BrandColors.lightColors

    override val darkColors = O2BrandColors.darkColors
}
