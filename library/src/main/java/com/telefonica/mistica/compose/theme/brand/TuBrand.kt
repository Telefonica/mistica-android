package com.telefonica.mistica.compose.theme.brand

import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import com.telefonica.mistica.R
import com.telefonica.mistica.compose.theme.brushes.MisticaBrushes
import com.telefonica.mistica.compose.theme.color.MisticaColors
import com.telefonica.mistica.compose.theme.values.MisticaRadius

object TuBrand : Brand {
    override val compatibilityTheme: Int
        get() = R.style.MisticaTheme_Tu

    override val lightColors: MisticaColors = TuBrandColors.lightColors

    override val darkColors: MisticaColors = TuBrandColors.darkColors

    override val lightBrushes: MisticaBrushes = TuBrandBrushes.lightBrushes

    override val darkBrushes: MisticaBrushes = TuBrandBrushes.darkBrushes

    override val preset5FontWeight: FontWeight = TuBrandFontWeights.text5FontWeight

    override val preset6FontWeight: FontWeight = TuBrandFontWeights.text6FontWeight

    override val preset7FontWeight: FontWeight = TuBrandFontWeights.text7FontWeight

    override val preset8FontWeight: FontWeight = TuBrandFontWeights.text8FontWeight

    override val preset9FontWeight: FontWeight = TuBrandFontWeights.text9FontWeight

    override val preset10FontWeight: FontWeight = TuBrandFontWeights.text10FontWeight

    override val cardTitleFontWeight: FontWeight = TuBrandFontWeights.cardTitleFontWeight

    override val buttonFontWeight: FontWeight = TuBrandFontWeights.buttonFontWeight

    override val linkFontWeight: FontWeight = TuBrandFontWeights.linkFontWeight

    override val title1FontWeight: FontWeight = TuBrandFontWeights.title1FontWeight

    override val indicatorFontWeight: FontWeight = TuBrandFontWeights.indicatorFontWeight

    override val tabsLabelFontWeight: FontWeight = TuBrandFontWeights.tabsLabelFontWeight

    override val tabsLabelFontSize: TextUnit = TuBrandFontSizes.tabsLabelFontSize

    override val radius: MisticaRadius = TuBrandRadius.radius
}