package com.telefonica.mistica.compose.theme.brand

import androidx.compose.ui.text.font.FontWeight
import com.telefonica.mistica.R
import com.telefonica.mistica.compose.theme.values.MisticaValues
import com.telefonica.mistica.compose.title.TitleStyle

object MovistarBrand : Brand {

    override val compatibilityTheme: Int
        get() = R.style.MisticaTheme_Movistar

    override val lightColors = MovistarBrandColors.lightColors

    override val darkColors = MovistarBrandColors.darkColors

    override val preset5FontWeight: FontWeight
        get() = FontWeight.Bold

    override val preset6FontWeight: FontWeight
        get() = FontWeight.Bold

    override val preset7FontWeight: FontWeight
        get() = FontWeight.Bold

    override val preset8FontWeight: FontWeight
        get() = FontWeight.Bold

    override val values: MisticaValues
        get() = super.values.copy(titleStyle = TitleStyle.TITLE_2)
}
