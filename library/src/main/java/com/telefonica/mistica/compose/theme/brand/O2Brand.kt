package com.telefonica.mistica.compose.theme.brand

import com.telefonica.mistica.R

object O2Brand : Brand {

    override val compatibilityTheme: Int
        get() = R.style.MisticaTheme_O2

    override val lightColors = O2BrandColors.lightColors

    override val darkColors = O2BrandColors.darkColors

    override val preset5FontWeight = O2BrandFontWeights.text5FontWeight

    override val preset6FontWeight = O2BrandFontWeights.text6FontWeight

    override val preset7FontWeight = O2BrandFontWeights.text7FontWeight

    override val preset8FontWeight = O2BrandFontWeights.text8FontWeight

    override val radius = O2BrandRadius.radius
}
