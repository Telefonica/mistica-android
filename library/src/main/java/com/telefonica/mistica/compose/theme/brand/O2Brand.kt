package com.telefonica.mistica.compose.theme.brand

import com.telefonica.mistica.R
import com.telefonica.mistica.compose.theme.brushes.MisticaBrushes

object O2Brand : Brand {

    override val compatibilityTheme: Int
        get() = R.style.MisticaTheme_O2

    override val lightColors = O2BrandColors.lightColors

    override val darkColors = O2BrandColors.darkColors

    override val lightBrushes: MisticaBrushes = O2BrandBrushes.lightBrushes

    override val darkBrushes: MisticaBrushes = O2BrandBrushes.darkBrushes

    override val preset5FontWeight = O2BrandFontWeights.text5FontWeight

    override val preset6FontWeight = O2BrandFontWeights.text6FontWeight

    override val preset7FontWeight = O2BrandFontWeights.text7FontWeight

    override val preset8FontWeight = O2BrandFontWeights.text8FontWeight

    override val preset9FontWeight = O2BrandFontWeights.text9FontWeight

    override val preset10FontWeight = O2BrandFontWeights.text10FontWeight

    override val cardTitleFontWeight = O2BrandFontWeights.cardTitleFontWeight

    override val buttonFontWeight = O2BrandFontWeights.buttonFontWeight

    override val linkFontWeight = O2BrandFontWeights.linkFontWeight

    override val title1FontWeight = O2BrandFontWeights.title1FontWeight

    override val title2FontWeight = O2BrandFontWeights.title2FontWeight

    override val title3FontWeight = O2BrandFontWeights.title3FontWeight

    override val title3FontSize = O2BrandFontSizes.title3FontSize

    override val indicatorFontWeight = O2BrandFontWeights.indicatorFontWeight

    override val tabsLabelFontWeight = O2BrandFontWeights.tabsLabelFontWeight

    override val tabsLabelFontSize = O2BrandFontSizes.tabsLabelFontSize

    override val radius = O2BrandRadius.radius

    override val themeVariant = O2BrandThemeVariant.themeVariant

}
