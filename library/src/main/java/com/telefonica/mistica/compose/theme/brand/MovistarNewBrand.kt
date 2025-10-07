package com.telefonica.mistica.compose.theme.brand

import com.telefonica.mistica.R
import com.telefonica.mistica.compose.theme.brushes.MisticaBrushes
import com.telefonica.mistica.compose.theme.values.MisticaValues
import com.telefonica.mistica.compose.title.TitleStyle

object MovistarNewBrand : Brand {

    override val compatibilityTheme: Int
        get() = R.style.MisticaTheme_MovistarNew

    override val lightColors = MovistarNewBrandColors.lightColors

    override val darkColors = MovistarNewBrandColors.darkColors

    override val lightBrushes: MisticaBrushes = MovistarNewBrandBrushes.lightBrushes

    override val darkBrushes: MisticaBrushes = MovistarNewBrandBrushes.darkBrushes

    override val preset5FontWeight = MovistarNewBrandFontWeights.text5FontWeight

    override val preset6FontWeight = MovistarNewBrandFontWeights.text6FontWeight

    override val preset7FontWeight = MovistarNewBrandFontWeights.text7FontWeight

    override val preset8FontWeight = MovistarNewBrandFontWeights.text8FontWeight

    override val preset9FontWeight = MovistarNewBrandFontWeights.text9FontWeight

    override val preset10FontWeight = MovistarNewBrandFontWeights.text10FontWeight

    override val cardTitleFontWeight = MovistarNewBrandFontWeights.cardTitleFontWeight

    override val rowTitleFontWeight = MovistarNewBrandFontWeights.rowTitleFontWeight

    override val buttonFontWeight = MovistarNewBrandFontWeights.buttonFontWeight

    override val linkFontWeight = MovistarNewBrandFontWeights.linkFontWeight

    override val title1FontWeight = MovistarNewBrandFontWeights.title1FontWeight

    override val title2FontWeight = MovistarNewBrandFontWeights.title2FontWeight

    override val title3FontWeight = MovistarNewBrandFontWeights.title3FontWeight

    override val title3FontSize = MovistarNewBrandFontSizes.title3FontSize

    override val indicatorFontWeight = MovistarNewBrandFontWeights.indicatorFontWeight

    override val tabsLabelFontWeight = MovistarNewBrandFontWeights.tabsLabelFontWeight

    override val tabsLabelFontSize = MovistarNewBrandFontSizes.tabsLabelFontSize

    override val values: MisticaValues
        get() = super.values.copy(titleStyle = TitleStyle.TITLE_3)

    override val radius = MovistarNewBrandRadius.radius

    override val themeVariant = MovistarNewBrandThemeVariant.themeVariant

}
