package com.telefonica.mistica.compose.theme.brand

import com.telefonica.mistica.R
import com.telefonica.mistica.compose.theme.brushes.MisticaBrushes

object BlauBrand : Brand {

    override val compatibilityTheme: Int
        get() = R.style.MisticaTheme_Blau

    override val lightColors = BlauBrandColors.lightColors

    override val darkColors = BlauBrandColors.darkColors

    override val lightBrushes: MisticaBrushes = BlauBrandBrushes.lightBrushes

    override val darkBrushes: MisticaBrushes = BlauBrandBrushes.darkBrushes

    override val preset5FontWeight = BlauBrandFontWeights.text5FontWeight

    override val preset6FontWeight = BlauBrandFontWeights.text6FontWeight

    override val preset7FontWeight = BlauBrandFontWeights.text7FontWeight

    override val preset8FontWeight = BlauBrandFontWeights.text8FontWeight

    override val preset9FontWeight = BlauBrandFontWeights.text9FontWeight

    override val preset10FontWeight = BlauBrandFontWeights.text10FontWeight

    override val cardTitleFontWeight = BlauBrandFontWeights.cardTitleFontWeight

    override val buttonFontWeight = BlauBrandFontWeights.buttonFontWeight

    override val linkFontWeight = BlauBrandFontWeights.linkFontWeight

    override val title1FontWeight = BlauBrandFontWeights.title1FontWeight

    override val title2FontWeight = BlauBrandFontWeights.title2FontWeight

    override val title3FontWeight = BlauBrandFontWeights.title3FontWeight

    override val title3FontSize = BlauBrandFontSizes.title3FontSize

    override val indicatorFontWeight = BlauBrandFontWeights.indicatorFontWeight

    override val tabsLabelFontWeight = BlauBrandFontWeights.tabsLabelFontWeight

    override val tabsLabelFontSize = BlauBrandFontSizes.tabsLabelFontSize

    override val radius = BlauBrandRadius.radius

    override val themeVariant = BlauBrandThemeVariant.themeVariant

}
