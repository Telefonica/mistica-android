package com.telefonica.mistica.compose.theme.brand

import com.telefonica.mistica.R

object VivoNewBrand : Brand {

    override val compatibilityTheme: Int
        get() = R.style.MisticaTheme_VivoNew

    override val lightColors = VivoNewBrandColors.lightColors

    override val darkColors = VivoNewBrandColors.darkColors

    override val preset5FontWeight = VivoNewBrandFontWeights.text5FontWeight

    override val preset6FontWeight = VivoNewBrandFontWeights.text6FontWeight

    override val preset7FontWeight = VivoNewBrandFontWeights.text7FontWeight

    override val preset8FontWeight = VivoNewBrandFontWeights.text8FontWeight

    override val cardTitleFontWeight = VivoNewBrandFontWeights.cardTitleFontWeight

    override val buttonFontWeight = VivoNewBrandFontWeights.buttonFontWeight

    override val linkFontWeight = VivoNewBrandFontWeights.linkFontWeight

    override val title1FontWeight = VivoNewBrandFontWeights.title1FontWeight

    override val indicatorFontWeight = VivoNewBrandFontWeights.indicatorFontWeight

    override val radius = VivoNewBrandRadius.radius
}
