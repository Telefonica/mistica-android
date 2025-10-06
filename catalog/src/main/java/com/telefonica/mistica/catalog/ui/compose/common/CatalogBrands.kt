package com.telefonica.mistica.catalog.ui.compose.common

import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import com.telefonica.mistica.catalog.R
import com.telefonica.mistica.compose.theme.brand.Brand
import com.telefonica.mistica.compose.theme.brand.MovistarBrand
import com.telefonica.mistica.compose.theme.brand.MovistarNewBrand
import com.telefonica.mistica.compose.theme.brand.O2NewBrand
import com.telefonica.mistica.compose.theme.brand.TelefonicaBrand
import com.telefonica.mistica.compose.theme.brand.TuBrand
import com.telefonica.mistica.compose.theme.brand.VivoNewBrand
import com.telefonica.mistica.compose.theme.brushes.MisticaBrushes
import com.telefonica.mistica.compose.theme.color.MisticaColors
import com.telefonica.mistica.compose.theme.values.MisticaRadius
import com.telefonica.mistica.compose.theme.values.MisticaThemeVariant

abstract class CatalogBrand(
    baseBrand: Brand,
    val theme: Int,
) : Brand {
    override val compatibilityTheme: Int = theme
    override val lightColors: MisticaColors = baseBrand.lightColors
    override val darkColors: MisticaColors = baseBrand.darkColors
    override val lightBrushes: MisticaBrushes = baseBrand.lightBrushes
    override val darkBrushes: MisticaBrushes = baseBrand.darkBrushes
    override val preset5FontWeight: FontWeight = baseBrand.preset5FontWeight
    override val preset6FontWeight: FontWeight = baseBrand.preset6FontWeight
    override val preset7FontWeight: FontWeight = baseBrand.preset7FontWeight
    override val preset8FontWeight: FontWeight = baseBrand.preset8FontWeight
    override val preset9FontWeight: FontWeight = baseBrand.preset9FontWeight
    override val preset10FontWeight: FontWeight = baseBrand.preset10FontWeight
    override val cardTitleFontWeight: FontWeight = baseBrand.cardTitleFontWeight
    override val rowTitleFontWeight: FontWeight = baseBrand.rowTitleFontWeight
    override val buttonFontWeight: FontWeight = baseBrand.buttonFontWeight
    override val linkFontWeight: FontWeight = baseBrand.linkFontWeight
    override val title1FontWeight: FontWeight = baseBrand.title1FontWeight
    override val title2FontWeight: FontWeight = baseBrand.title2FontWeight
    override val title3FontWeight: FontWeight = baseBrand.title3FontWeight
    override val title3FontSize: TextUnit = baseBrand.title3FontSize
    override val indicatorFontWeight: FontWeight = baseBrand.indicatorFontWeight
    override val tabsLabelFontWeight: FontWeight = baseBrand.tabsLabelFontWeight
    override val tabsLabelFontSize: TextUnit = baseBrand.tabsLabelFontSize
    override val radius: MisticaRadius = baseBrand.radius
    override val themeVariant: MisticaThemeVariant = baseBrand.themeVariant
    override val fontFamily: FontFamily = baseBrand.fontFamily
}

object CatalogMovistarBrand : CatalogBrand(MovistarBrand, R.style.CatalogMovistar) {
    override val fontFamily: FontFamily
        get() = FontFamily(
            Font(R.font.onair_light, FontWeight.Light),
            Font(R.font.onair_regular, FontWeight.Normal),
            Font(R.font.onair_medium, FontWeight.Medium),
        )
}

object CatalogMovistarNewBrand : CatalogBrand(MovistarNewBrand, R.style.CatalogMovistarNew) {
    override val fontFamily: FontFamily
        get() = FontFamily(
            Font(R.font.movistar_sans_light, FontWeight.Light),
            Font(R.font.movistar_sans_regular, FontWeight.Normal),
            Font(R.font.movistar_sans_medium, FontWeight.Medium),
        )
}

object CatalogO2NewBrand : CatalogBrand(O2NewBrand, R.style.CatalogO2New) {
    override val fontFamily: FontFamily
        get() = FontFamily(
            Font(R.font.onair_light, FontWeight.Light),
            Font(R.font.onair_regular, FontWeight.Normal),
            Font(R.font.onair_medium, FontWeight.Medium),
        )
}

object CatalogVivoNewBrand : CatalogBrand(VivoNewBrand, R.style.CatalogVivoNew) {
    override val fontFamily: FontFamily
        get() = FontFamily(
            Font(R.font.vivo_type_light, FontWeight.Light),
            Font(R.font.vivo_type_regular, FontWeight.Normal),
            Font(R.font.vivo_type_medium, FontWeight.Medium),
        )
}

object CatalogTelefonicaBrand : CatalogBrand(TelefonicaBrand, R.style.CatalogTelefonica) {
    override val fontFamily: FontFamily
        get() = FontFamily(
            Font(R.font.telefonica_sans_light, FontWeight.Light),
            Font(R.font.telefonica_sans_regular, FontWeight.Normal),
            Font(R.font.telefonica_sans_medium, FontWeight.Medium),
        )
}

object CatalogBlauBrand : CatalogBrand(TelefonicaBrand, R.style.CatalogBlau)

object CatalogTuBrand : CatalogBrand(TuBrand, R.style.CatalogTu) {
    override val fontFamily: FontFamily
        get() = FontFamily(
            Font(R.font.telefonica_sans_light, FontWeight.Light),
            Font(R.font.telefonica_sans_regular, FontWeight.Normal),
            Font(R.font.telefonica_sans_medium, FontWeight.Medium),
        )
}

