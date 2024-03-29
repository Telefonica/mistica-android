package com.telefonica.mistica.compose.theme.brand

import com.telefonica.mistica.R

object VivoBrand : Brand {

    override val compatibilityTheme: Int
        get() = R.style.MisticaTheme_Vivo

    override val lightColors = VivoBrandColors.lightColors

    override val darkColors = VivoBrandColors.darkColors

    override val preset5FontWeight = VivoBrandFontWeights.text5FontWeight

    override val preset6FontWeight = VivoBrandFontWeights.text6FontWeight

    override val preset7FontWeight = VivoBrandFontWeights.text7FontWeight

    override val preset8FontWeight = VivoBrandFontWeights.text8FontWeight

    override val preset9FontWeight = VivoBrandFontWeights.text9FontWeight

    override val preset10FontWeight = VivoBrandFontWeights.text10FontWeight

    override val cardTitleFontWeight = VivoBrandFontWeights.cardTitleFontWeight

    override val buttonFontWeight = VivoBrandFontWeights.buttonFontWeight

    override val linkFontWeight = VivoBrandFontWeights.linkFontWeight

    override val title1FontWeight = VivoBrandFontWeights.title1FontWeight

    override val indicatorFontWeight = VivoBrandFontWeights.indicatorFontWeight

    override val tabsLabelFontWeight = VivoBrandFontWeights.tabsLabelFontWeight

    override val tabsLabelFontSize = VivoBrandFontSizes.tabsLabelFontSize

    override val radius = VivoBrandRadius.radius
}
