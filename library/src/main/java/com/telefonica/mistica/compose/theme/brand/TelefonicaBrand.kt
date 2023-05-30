package com.telefonica.mistica.compose.theme.brand

import com.telefonica.mistica.R
import com.telefonica.mistica.compose.theme.values.MisticaRadius

object TelefonicaBrand : Brand {

    override val compatibilityTheme: Int
        get() = R.style.MisticaTheme_Telefonica

    override val lightColors = TelefonicaBrandColors.lightColors

    override val darkColors = TelefonicaBrandColors.darkColors

    override val radius: MisticaRadius = TelefonicaBrandRadius.radius
}
