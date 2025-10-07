package com.telefonica.mistica.compose.theme.brand

import com.telefonica.mistica.R
import com.telefonica.mistica.compose.theme.brushes.MisticaBrushes

object VivoNewBrand : Brand {

    override val compatibilityTheme: Int
        get() = R.style.MisticaTheme_VivoNew

    override val lightColors = VivoNewBrandColors.lightColors

    override val darkColors = VivoNewBrandColors.darkColors

    override val lightBrushes: MisticaBrushes = VivoNewBrandBrushes.lightBrushes

    override val darkBrushes: MisticaBrushes = VivoNewBrandBrushes.darkBrushes

    override val preset5FontWeight = VivoNewBrandFontWeights.text5FontWeight

    override val preset6FontWeight = VivoNewBrandFontWeights.text6FontWeight

    override val preset7FontWeight = VivoNewBrandFontWeights.text7FontWeight

    override val preset8FontWeight = VivoNewBrandFontWeights.text8FontWeight

    override val preset9FontWeight = VivoNewBrandFontWeights.text9FontWeight

    override val preset10FontWeight = VivoNewBrandFontWeights.text10FontWeight

    override val cardTitleFontWeight = VivoNewBrandFontWeights.cardTitleFontWeight

    override val rowTitleFontWeight = VivoNewBrandFontWeights.rowTitleFontWeight

    override val buttonFontWeight = VivoNewBrandFontWeights.buttonFontWeight

    override val linkFontWeight = VivoNewBrandFontWeights.linkFontWeight

    override val title1FontWeight = VivoNewBrandFontWeights.title1FontWeight

    override val title2FontWeight = VivoNewBrandFontWeights.title2FontWeight

    override val title3FontWeight = VivoNewBrandFontWeights.title3FontWeight

    override val title3FontSize = VivoNewBrandFontSizes.title3FontSize

    override val indicatorFontWeight = VivoNewBrandFontWeights.indicatorFontWeight

    override val tabsLabelFontWeight = VivoNewBrandFontWeights.tabsLabelFontWeight

    override val tabsLabelFontSize = VivoNewBrandFontSizes.tabsLabelFontSize

    override val radius = VivoNewBrandRadius.radius

    override val themeVariant = VivoNewBrandThemeVariant.themeVariant

}
