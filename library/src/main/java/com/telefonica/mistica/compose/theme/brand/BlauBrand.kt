package com.telefonica.mistica.compose.theme.brand

import com.telefonica.mistica.R

object BlauBrand : Brand {

    override val compatibilityTheme: Int
        get() = R.style.MisticaTheme_Blau

    override val lightColors = BlauBrandColors.lightColors

    override val darkColors = BlauBrandColors.darkColors

    override val preset5FontWeight = BlauBrandFontWeights.text5FontWeight

    override val preset6FontWeight = BlauBrandFontWeights.text6FontWeight

    override val preset7FontWeight = BlauBrandFontWeights.text7FontWeight

    override val preset8FontWeight = BlauBrandFontWeights.text8FontWeight

    override val radius = BlauBrandRadius.radius
}
