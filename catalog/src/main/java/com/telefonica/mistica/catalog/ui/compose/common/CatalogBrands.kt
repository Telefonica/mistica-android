package com.telefonica.mistica.catalog.ui.compose.common

import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import com.telefonica.mistica.catalog.R
import com.telefonica.mistica.compose.theme.brand.Brand
import com.telefonica.mistica.compose.theme.brand.MovistarBrand
import com.telefonica.mistica.compose.theme.brand.O2Brand
import com.telefonica.mistica.compose.theme.brand.O2NewBrand
import com.telefonica.mistica.compose.theme.brand.TelefonicaBrand
import com.telefonica.mistica.compose.theme.brand.TuBrand
import com.telefonica.mistica.compose.theme.brand.VivoBrand
import com.telefonica.mistica.compose.theme.brand.VivoNewBrand
import com.telefonica.mistica.compose.theme.brushes.MisticaBrushes
import com.telefonica.mistica.compose.theme.color.MisticaColors
import com.telefonica.mistica.compose.theme.values.MisticaRadius

object CatalogMovistarBrand : Brand {
    override val compatibilityTheme: Int
        get() = R.style.MisticaTheme_Movistar
    override val lightColors: MisticaColors = MovistarBrand.lightColors
    override val darkColors: MisticaColors = MovistarBrand.darkColors
    override val lightBrushes: MisticaBrushes = MovistarBrand.lightBrushes
    override val darkBrushes: MisticaBrushes = MovistarBrand.darkBrushes
    override val preset5FontWeight: FontWeight = MovistarBrand.preset5FontWeight
    override val preset6FontWeight: FontWeight = MovistarBrand.preset6FontWeight
    override val preset7FontWeight: FontWeight = MovistarBrand.preset7FontWeight
    override val preset8FontWeight: FontWeight = MovistarBrand.preset8FontWeight
    override val preset9FontWeight: FontWeight = MovistarBrand.preset9FontWeight
    override val preset10FontWeight: FontWeight = MovistarBrand.preset10FontWeight
    override val cardTitleFontWeight: FontWeight = MovistarBrand.cardTitleFontWeight
    override val buttonFontWeight: FontWeight = MovistarBrand.buttonFontWeight
    override val linkFontWeight: FontWeight = MovistarBrand.linkFontWeight
    override val title1FontWeight: FontWeight = MovistarBrand.title1FontWeight
    override val title2FontWeight: FontWeight = MovistarBrand.title2FontWeight
    override val title3FontWeight: FontWeight = MovistarBrand.title3FontWeight
    override val title3FontSize: TextUnit = MovistarBrand.title3FontSize
    override val indicatorFontWeight: FontWeight = MovistarBrand.indicatorFontWeight
    override val tabsLabelFontWeight: FontWeight = MovistarBrand.tabsLabelFontWeight
    override val tabsLabelFontSize: TextUnit = MovistarBrand.tabsLabelFontSize
    override val radius: MisticaRadius = MovistarBrand.radius
    override val fontFamily: FontFamily
        get() = FontFamily(
            Font(R.font.onair_light, FontWeight.Light),
            Font(R.font.onair_regular, FontWeight.Normal),
            Font(R.font.onair_medium, FontWeight.Medium),
        )


}

object CatalogO2Brand : Brand {
    override val compatibilityTheme: Int
        get() = R.style.MisticaTheme_O2
    override val lightColors: MisticaColors = O2Brand.lightColors
    override val darkColors: MisticaColors = O2Brand.darkColors
    override val lightBrushes: MisticaBrushes = O2Brand.lightBrushes
    override val darkBrushes: MisticaBrushes = O2Brand.darkBrushes
    override val preset5FontWeight: FontWeight = O2Brand.preset5FontWeight
    override val preset6FontWeight: FontWeight = O2Brand.preset6FontWeight
    override val preset7FontWeight: FontWeight = O2Brand.preset7FontWeight
    override val preset8FontWeight: FontWeight = O2Brand.preset8FontWeight
    override val preset9FontWeight: FontWeight = O2Brand.preset9FontWeight
    override val preset10FontWeight: FontWeight = O2Brand.preset10FontWeight
    override val cardTitleFontWeight: FontWeight = O2Brand.cardTitleFontWeight
    override val buttonFontWeight: FontWeight = O2Brand.buttonFontWeight
    override val linkFontWeight: FontWeight = O2Brand.linkFontWeight
    override val title1FontWeight: FontWeight = O2Brand.title1FontWeight
    override val title2FontWeight: FontWeight = O2Brand.title2FontWeight
    override val title3FontWeight: FontWeight = O2Brand.title3FontWeight
    override val title3FontSize: TextUnit = O2Brand.title3FontSize
    override val indicatorFontWeight: FontWeight = O2Brand.indicatorFontWeight
    override val tabsLabelFontWeight: FontWeight = O2Brand.tabsLabelFontWeight
    override val tabsLabelFontSize: TextUnit = O2Brand.tabsLabelFontSize
    override val radius: MisticaRadius = O2Brand.radius
    override val fontFamily: FontFamily
        get() = FontFamily(
            Font(R.font.onair_light, FontWeight.Light),
            Font(R.font.onair_regular, FontWeight.Normal),
            Font(R.font.onair_medium, FontWeight.Medium),
        )

}

object CatalogVivoBrand : Brand {
    override val compatibilityTheme: Int
        get() = R.style.MisticaTheme_Vivo
    override val lightColors: MisticaColors = VivoBrand.lightColors
    override val darkColors: MisticaColors = VivoBrand.darkColors
    override val lightBrushes: MisticaBrushes = VivoBrand.lightBrushes
    override val darkBrushes: MisticaBrushes = VivoBrand.darkBrushes
    override val preset5FontWeight: FontWeight = VivoBrand.preset5FontWeight
    override val preset6FontWeight: FontWeight = VivoBrand.preset6FontWeight
    override val preset7FontWeight: FontWeight = VivoBrand.preset7FontWeight
    override val preset8FontWeight: FontWeight = VivoBrand.preset8FontWeight
    override val preset9FontWeight: FontWeight = VivoBrand.preset9FontWeight
    override val preset10FontWeight: FontWeight = VivoBrand.preset10FontWeight
    override val cardTitleFontWeight: FontWeight = VivoBrand.cardTitleFontWeight
    override val buttonFontWeight: FontWeight = VivoBrand.buttonFontWeight
    override val linkFontWeight: FontWeight = VivoBrand.linkFontWeight
    override val title1FontWeight: FontWeight = VivoBrand.title1FontWeight
    override val title2FontWeight: FontWeight = VivoBrand.title2FontWeight
    override val title3FontWeight: FontWeight = VivoBrand.title3FontWeight
    override val title3FontSize: TextUnit = VivoBrand.title3FontSize
    override val indicatorFontWeight: FontWeight = VivoBrand.indicatorFontWeight
    override val tabsLabelFontWeight: FontWeight = VivoBrand.tabsLabelFontWeight
    override val tabsLabelFontSize: TextUnit = VivoBrand.tabsLabelFontSize
    override val radius: MisticaRadius = VivoBrand.radius
    override val fontFamily: FontFamily
        get() = FontFamily(
            Font(R.font.vivo_type_light, FontWeight.Light),
            Font(R.font.vivo_type_regular, FontWeight.Normal),
            Font(R.font.vivo_type_medium, FontWeight.Medium),
        )

}

object CatalogVivoNewBrand : Brand {
    override val compatibilityTheme: Int
        get() = R.style.MisticaTheme_VivoNew
    override val lightColors: MisticaColors = VivoNewBrand.lightColors
    override val darkColors: MisticaColors = VivoNewBrand.darkColors
    override val lightBrushes: MisticaBrushes = VivoNewBrand.lightBrushes
    override val darkBrushes: MisticaBrushes = VivoNewBrand.darkBrushes
    override val preset5FontWeight: FontWeight = VivoNewBrand.preset5FontWeight
    override val preset6FontWeight: FontWeight = VivoNewBrand.preset6FontWeight
    override val preset7FontWeight: FontWeight = VivoNewBrand.preset7FontWeight
    override val preset8FontWeight: FontWeight = VivoNewBrand.preset8FontWeight
    override val preset9FontWeight: FontWeight = VivoNewBrand.preset9FontWeight
    override val preset10FontWeight: FontWeight = VivoNewBrand.preset10FontWeight
    override val cardTitleFontWeight: FontWeight = VivoNewBrand.cardTitleFontWeight
    override val buttonFontWeight: FontWeight = VivoNewBrand.buttonFontWeight
    override val linkFontWeight: FontWeight = VivoNewBrand.linkFontWeight
    override val title1FontWeight: FontWeight = VivoNewBrand.title1FontWeight
    override val title2FontWeight: FontWeight = VivoNewBrand.title2FontWeight
    override val title3FontWeight: FontWeight = VivoNewBrand.title3FontWeight
    override val title3FontSize: TextUnit = VivoNewBrand.title3FontSize
    override val indicatorFontWeight: FontWeight = VivoNewBrand.indicatorFontWeight
    override val tabsLabelFontWeight: FontWeight = VivoNewBrand.tabsLabelFontWeight
    override val tabsLabelFontSize: TextUnit = VivoNewBrand.tabsLabelFontSize
    override val radius: MisticaRadius = VivoNewBrand.radius
    override val fontFamily: FontFamily
        get() = FontFamily(
            Font(R.font.vivo_type_light, FontWeight.Light),
            Font(R.font.vivo_type_regular, FontWeight.Normal),
            Font(R.font.vivo_type_medium, FontWeight.Medium),
        )

}

object CatalogTelefonicaBrand : Brand {
    override val compatibilityTheme: Int
        get() = R.style.MisticaTheme_Telefonica
    override val lightColors: MisticaColors = TelefonicaBrand.lightColors
    override val darkColors: MisticaColors = TelefonicaBrand.darkColors
    override val lightBrushes: MisticaBrushes = TelefonicaBrand.lightBrushes
    override val darkBrushes: MisticaBrushes = TelefonicaBrand.darkBrushes
    override val preset5FontWeight: FontWeight = TelefonicaBrand.preset5FontWeight
    override val preset6FontWeight: FontWeight = TelefonicaBrand.preset6FontWeight
    override val preset7FontWeight: FontWeight = TelefonicaBrand.preset7FontWeight
    override val preset8FontWeight: FontWeight = TelefonicaBrand.preset8FontWeight
    override val preset9FontWeight: FontWeight = TelefonicaBrand.preset9FontWeight
    override val preset10FontWeight: FontWeight = TelefonicaBrand.preset10FontWeight
    override val cardTitleFontWeight: FontWeight = TelefonicaBrand.cardTitleFontWeight
    override val buttonFontWeight: FontWeight = TelefonicaBrand.buttonFontWeight
    override val linkFontWeight: FontWeight = TelefonicaBrand.linkFontWeight
    override val title1FontWeight: FontWeight = TelefonicaBrand.title1FontWeight
    override val title2FontWeight: FontWeight = TelefonicaBrand.title2FontWeight
    override val title3FontWeight: FontWeight = TelefonicaBrand.title3FontWeight
    override val title3FontSize: TextUnit = TelefonicaBrand.title3FontSize
    override val indicatorFontWeight: FontWeight = TelefonicaBrand.indicatorFontWeight
    override val tabsLabelFontWeight: FontWeight = TelefonicaBrand.tabsLabelFontWeight
    override val tabsLabelFontSize: TextUnit = TelefonicaBrand.tabsLabelFontSize
    override val radius: MisticaRadius = TelefonicaBrand.radius
    override val fontFamily: FontFamily
        get() = FontFamily(
            Font(R.font.telefonica_sans_light, FontWeight.Light),
            Font(R.font.telefonica_sans_regular, FontWeight.Normal),
            Font(R.font.telefonica_sans_medium, FontWeight.Medium),
        )

}

object CatalogTuBrand : Brand {
    override val compatibilityTheme: Int
        get() = R.style.MisticaTheme_Tu
    override val lightColors: MisticaColors = TuBrand.lightColors
    override val darkColors: MisticaColors = TuBrand.darkColors
    override val lightBrushes: MisticaBrushes = TuBrand.lightBrushes
    override val darkBrushes: MisticaBrushes = TuBrand.darkBrushes
    override val preset5FontWeight: FontWeight = TuBrand.preset5FontWeight//FontWeight.Bold
    override val preset6FontWeight: FontWeight = TuBrand.preset6FontWeight
    override val preset7FontWeight: FontWeight = TuBrand.preset7FontWeight
    override val preset8FontWeight: FontWeight = TuBrand.preset8FontWeight
    override val preset9FontWeight: FontWeight = TuBrand.preset9FontWeight
    override val preset10FontWeight: FontWeight = TuBrand.preset10FontWeight
    override val cardTitleFontWeight: FontWeight = TuBrand.cardTitleFontWeight
    override val buttonFontWeight: FontWeight = TuBrand.buttonFontWeight
    override val linkFontWeight: FontWeight = TuBrand.linkFontWeight
    override val title1FontWeight: FontWeight = TuBrand.title1FontWeight
    override val title2FontWeight: FontWeight = TuBrand.title2FontWeight
    override val title3FontWeight: FontWeight = TuBrand.title3FontWeight
    override val title3FontSize: TextUnit = TuBrand.title3FontSize
    override val indicatorFontWeight: FontWeight = TuBrand.indicatorFontWeight
    override val tabsLabelFontWeight: FontWeight = TuBrand.tabsLabelFontWeight
    override val tabsLabelFontSize: TextUnit = TuBrand.tabsLabelFontSize
    override val radius: MisticaRadius = TuBrand.radius
    override val fontFamily: FontFamily
        get() = FontFamily(
            Font(R.font.telefonica_sans_light, FontWeight.Light),
            Font(R.font.telefonica_sans_regular, FontWeight.Normal),
            Font(R.font.telefonica_sans_medium, FontWeight.Medium),
        )

}

object CatalogO2NewBrand : Brand {
    override val compatibilityTheme: Int
        get() = R.style.MisticaTheme_O2New
    override val lightColors: MisticaColors = O2NewBrand.lightColors
    override val darkColors: MisticaColors = O2NewBrand.darkColors
    override val lightBrushes: MisticaBrushes = O2NewBrand.lightBrushes
    override val darkBrushes: MisticaBrushes = O2NewBrand.darkBrushes
    override val preset5FontWeight: FontWeight = O2NewBrand.preset5FontWeight
    override val preset6FontWeight: FontWeight = O2NewBrand.preset6FontWeight
    override val preset7FontWeight: FontWeight = O2NewBrand.preset7FontWeight
    override val preset8FontWeight: FontWeight = O2NewBrand.preset8FontWeight
    override val preset9FontWeight: FontWeight = O2NewBrand.preset9FontWeight
    override val preset10FontWeight: FontWeight = O2NewBrand.preset10FontWeight
    override val cardTitleFontWeight: FontWeight = O2NewBrand.cardTitleFontWeight
    override val buttonFontWeight: FontWeight = O2NewBrand.buttonFontWeight
    override val linkFontWeight: FontWeight = O2NewBrand.linkFontWeight
    override val title1FontWeight: FontWeight = O2NewBrand.title1FontWeight
    override val title2FontWeight: FontWeight = O2NewBrand.title2FontWeight
    override val title3FontWeight: FontWeight = O2NewBrand.title3FontWeight
    override val title3FontSize: TextUnit = O2NewBrand.title3FontSize
    override val indicatorFontWeight: FontWeight = O2NewBrand.indicatorFontWeight
    override val tabsLabelFontWeight: FontWeight = O2NewBrand.tabsLabelFontWeight
    override val tabsLabelFontSize: TextUnit = O2NewBrand.tabsLabelFontSize
    override val radius: MisticaRadius = O2NewBrand.radius
    override val fontFamily: FontFamily
        get() = FontFamily(
            Font(R.font.onair_light, FontWeight.Light),
            Font(R.font.onair_regular, FontWeight.Normal),
            Font(R.font.onair_medium, FontWeight.Medium),
        )

}