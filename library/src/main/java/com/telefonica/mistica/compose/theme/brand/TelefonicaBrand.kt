package com.telefonica.mistica.compose.theme.brand

import androidx.compose.ui.unit.dp
import com.telefonica.mistica.R
import com.telefonica.mistica.compose.theme.values.MisticaValues

object TelefonicaBrand : Brand {

    override val compatibilityTheme: Int
        get() = R.style.MisticaTheme_Telefonica

    override val lightColors = TelefonicaBrandColors.lightColors

    override val darkColors = TelefonicaBrandColors.darkColors

    override val values: MisticaValues
        get() = super.values.copy(
            buttonBorderRadius = 999.dp,
            inputBorderRadius = 0.dp,
            containerBorderRadius = 0.dp,
            legacyDisplayBorderRadius = 0.dp,
            popupBorderRadius = 0.dp,
            checkboxBorderRadius = 0.dp,
            barBorderRadius = 0.dp,
        )
}
