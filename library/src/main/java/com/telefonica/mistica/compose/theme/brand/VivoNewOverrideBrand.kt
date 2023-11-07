package com.telefonica.mistica.compose.theme.brand

import com.telefonica.mistica.R

object VivoNewOverrideBrand : Brand {

    override val compatibilityTheme: Int
        get() = R.style.VivoNewOverride

    override val lightColors = VivoNewOverrideBrandColors.lightColors

    override val darkColors = VivoNewOverrideBrandColors.darkColors

    override val preset5FontWeight = VivoNewOverrideBrandFontWeights.text5FontWeight

    override val preset6FontWeight = VivoNewOverrideBrandFontWeights.text6FontWeight

    override val preset7FontWeight = VivoNewOverrideBrandFontWeights.text7FontWeight

    override val preset8FontWeight = VivoNewOverrideBrandFontWeights.text8FontWeight

    override val cardTitleFontWeight = VivoNewOverrideBrandFontWeights.cardTitleFontWeight

    override val buttonFontWeight = VivoNewOverrideBrandFontWeights.buttonFontWeight

    override val linkFontWeight = VivoNewOverrideBrandFontWeights.linkFontWeight

    override val title1FontWeight = VivoNewOverrideBrandFontWeights.title1FontWeight

    override val indicatorFontWeight = VivoNewOverrideBrandFontWeights.indicatorFontWeight

    override val tabsLabelFontWeight = VivoNewOverrideBrandFontWeights.tabsLabelFontWeight

    override val tabsLabelFontSize = VivoNewOverrideBrandFontSizes.tabsLabelFontSize

    override val radius = VivoNewOverrideBrandRadius.radius
}
