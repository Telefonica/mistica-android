package com.telefonica.mistica.compose.theme.brand

import com.telefonica.mistica.R
import com.telefonica.mistica.compose.theme.brushes.MisticaBrushes
import com.telefonica.mistica.compose.theme.values.MisticaValues
import com.telefonica.mistica.compose.title.TitleStyle

object MovistarNewBrand : Brand {

    override val compatibilityTheme: Int
        get() = R.style.MisticaTheme_Movistar

    override val lightColors = MovistarBrandColors.lightColors

    override val darkColors = MovistarBrandColors.darkColors

    override val lightBrushes: MisticaBrushes = MovistarBrandBrushes.lightBrushes

    override val darkBrushes: MisticaBrushes = MovistarBrandBrushes.darkBrushes

    override val preset5FontWeight = MovistarBrandFontWeights.text5FontWeight

    override val preset6FontWeight = MovistarBrandFontWeights.text6FontWeight

    override val preset7FontWeight = MovistarBrandFontWeights.text7FontWeight

    override val preset8FontWeight = MovistarBrandFontWeights.text8FontWeight

    override val preset9FontWeight = MovistarBrandFontWeights.text9FontWeight

    override val preset10FontWeight = MovistarBrandFontWeights.text10FontWeight

    override val cardTitleFontWeight = MovistarBrandFontWeights.cardTitleFontWeight

    override val buttonFontWeight = MovistarBrandFontWeights.buttonFontWeight

    override val linkFontWeight = MovistarBrandFontWeights.linkFontWeight

    override val title1FontWeight = MovistarBrandFontWeights.title1FontWeight

    override val title2FontWeight = MovistarBrandFontWeights.title2FontWeight

    override val title3FontWeight = MovistarBrandFontWeights.title3FontWeight

    override val title3FontSize = MovistarBrandFontSizes.title3FontSize

    override val indicatorFontWeight = MovistarBrandFontWeights.indicatorFontWeight

    override val tabsLabelFontWeight = MovistarBrandFontWeights.tabsLabelFontWeight

    override val tabsLabelFontSize = MovistarBrandFontSizes.tabsLabelFontSize

    override val values: MisticaValues
        get() = super.values.copy(titleStyle = TitleStyle.TITLE_3)

    override val radius = MovistarBrandRadius.radius

    override val themeVariant = MovistarBrandThemeVariant.themeVariant

}
