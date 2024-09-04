package com.telefonica.mistica.compose.theme.brand

import com.telefonica.mistica.R
import com.telefonica.mistica.compose.theme.brushes.MisticaBrushes
import com.telefonica.mistica.compose.theme.values.MisticaRadius

object TelefonicaBrand : Brand {

    override val compatibilityTheme: Int
        get() = R.style.MisticaTheme_Telefonica

    override val lightColors = TelefonicaBrandColors.lightColors

    override val darkColors = TelefonicaBrandColors.darkColors

    override val lightBrushes: MisticaBrushes = TelefonicaBrandBrushes.lightBrushes

    override val darkBrushes: MisticaBrushes = TelefonicaBrandBrushes.darkBrushes

    override val preset5FontWeight = TelefonicaBrandFontWeights.text5FontWeight

    override val preset6FontWeight = TelefonicaBrandFontWeights.text6FontWeight

    override val preset7FontWeight = TelefonicaBrandFontWeights.text7FontWeight

    override val preset8FontWeight = TelefonicaBrandFontWeights.text8FontWeight

    override val preset9FontWeight = TelefonicaBrandFontWeights.text9FontWeight

    override val preset10FontWeight = TelefonicaBrandFontWeights.text10FontWeight

    override val cardTitleFontWeight = TelefonicaBrandFontWeights.cardTitleFontWeight

    override val buttonFontWeight = TelefonicaBrandFontWeights.buttonFontWeight

    override val linkFontWeight = TelefonicaBrandFontWeights.linkFontWeight

    override val title1FontWeight = TelefonicaBrandFontWeights.title1FontWeight

    override val title2FontWeight = TelefonicaBrandFontWeights.title2FontWeight

    override val title3FontWeight = TelefonicaBrandFontWeights.title3FontWeight

    override val title3FontSize = TelefonicaBrandFontSizes.title3FontSize

    override val indicatorFontWeight = TelefonicaBrandFontWeights.indicatorFontWeight

    override val tabsLabelFontWeight = TelefonicaBrandFontWeights.tabsLabelFontWeight

    override val tabsLabelFontSize = TelefonicaBrandFontSizes.tabsLabelFontSize

    override val radius: MisticaRadius = TelefonicaBrandRadius.radius
}
