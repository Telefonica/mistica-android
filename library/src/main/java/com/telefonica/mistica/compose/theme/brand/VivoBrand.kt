package com.telefonica.mistica.compose.theme.brand

import com.telefonica.mistica.R

object VivoBrand : Brand {

    override val compatibilityTheme: Int
        get() = R.style.MisticaTheme_Vivo

    override val lightColors = VivoBrandColors.lightColors

    override val darkColors = VivoBrandColors.darkColors
}
