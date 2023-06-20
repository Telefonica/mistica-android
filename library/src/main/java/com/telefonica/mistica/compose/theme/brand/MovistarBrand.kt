package com.telefonica.mistica.compose.theme.brand

import com.telefonica.mistica.R
import com.telefonica.mistica.compose.theme.values.MisticaValues
import com.telefonica.mistica.compose.title.TitleStyle

object MovistarBrand : Brand {

    override val compatibilityTheme: Int
        get() = R.style.MisticaTheme_Movistar

    override val lightColors = MovistarBrandColors.lightColors

    override val darkColors = MovistarBrandColors.darkColors

    override val preset5FontWeight = MovistarBrandFontWeights.text5FontWeight

    override val preset6FontWeight = MovistarBrandFontWeights.text6FontWeight

    override val preset7FontWeight = MovistarBrandFontWeights.text7FontWeight

    override val preset8FontWeight = MovistarBrandFontWeights.text8FontWeight

    override val cardTitleFontWeight = MovistarBrandFontWeights.cardTitleFontWeight

    override val buttonFontWeight = MovistarBrandFontWeights.buttonFontWeight

    override val linkFontWeight = MovistarBrandFontWeights.linkFontWeight

    override val title1FontWeight = MovistarBrandFontWeights.title1FontWeight

    override val indicatorFontWeight = MovistarBrandFontWeights.indicatorFontWeight

    override val values: MisticaValues
        get() = super.values.copy(titleStyle = TitleStyle.TITLE_2)

    override val radius = MovistarBrandRadius.radius
}
