package com.telefonica.mistica.compose.theme.brand

import com.telefonica.mistica.R
import com.telefonica.mistica.compose.theme.brushes.MisticaBrushes

object O2NewBrand : Brand {

    override val compatibilityTheme: Int
        get() = R.style.MisticaTheme_O2New

    override val lightColors = O2NewBrandColors.lightColors

    override val darkColors = O2NewBrandColors.darkColors

    override val lightBrushes: MisticaBrushes = O2NewBrandBrushes.lightBrushes

    override val darkBrushes: MisticaBrushes = O2NewBrandBrushes.darkBrushes

    override val preset5FontWeight = O2NewBrandFontWeights.text5FontWeight

    override val preset6FontWeight = O2NewBrandFontWeights.text6FontWeight

    override val preset7FontWeight = O2NewBrandFontWeights.text7FontWeight

    override val preset8FontWeight = O2NewBrandFontWeights.text8FontWeight

    override val preset9FontWeight = O2NewBrandFontWeights.text9FontWeight

    override val preset10FontWeight = O2NewBrandFontWeights.text10FontWeight

    override val cardTitleFontWeight = O2NewBrandFontWeights.cardTitleFontWeight

    override val buttonFontWeight = O2NewBrandFontWeights.buttonFontWeight

    override val linkFontWeight = O2NewBrandFontWeights.linkFontWeight

    override val title1FontWeight = O2NewBrandFontWeights.title1FontWeight

    override val indicatorFontWeight = O2NewBrandFontWeights.indicatorFontWeight

    override val tabsLabelFontWeight = O2NewBrandFontWeights.tabsLabelFontWeight

    override val tabsLabelFontSize = O2NewBrandFontSizes.tabsLabelFontSize

    override val radius = O2NewBrandRadius.radius
}
