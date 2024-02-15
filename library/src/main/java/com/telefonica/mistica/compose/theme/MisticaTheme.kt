package com.telefonica.mistica.compose.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Shapes
import androidx.compose.material.Typography
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.theme.brand.Brand
import com.telefonica.mistica.compose.theme.color.LocalMisticaColors
import com.telefonica.mistica.compose.theme.color.MisticaColors
import com.telefonica.mistica.compose.theme.text.LocalMisticaTypography
import com.telefonica.mistica.compose.theme.text.MisticaTypography
import com.telefonica.mistica.compose.theme.values.LocalMisticaRadius
import com.telefonica.mistica.compose.theme.values.LocalMisticaValues
import com.telefonica.mistica.compose.theme.values.MisticaRadius
import com.telefonica.mistica.compose.theme.values.MisticaValues

@Composable
fun MisticaTheme(
    brand: Brand,
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    val context = LocalContext.current
    LaunchedEffect(key1 = brand) {
        context.setTheme(brand.compatibilityTheme)
    }

    val colors = if (darkTheme) {
        brand.darkColors
    } else {
        brand.lightColors
    }

    val rememberedColors = remember {
        MisticaColors()
    }.apply { updateColorsFrom(colors) }

    val typography = remember {
        MisticaTypography(
            defaultTextColor = rememberedColors.textPrimary
        )
    }.apply {
        updateWith(
            fontFamily = brand.fontFamily,
            preset10FontWeight = brand.preset10FontWeight,
            preset9FontWeight = brand.preset9FontWeight,
            preset8FontWeight = brand.preset8FontWeight,
            preset7FontWeight = brand.preset7FontWeight,
            preset6FontWeight = brand.preset6FontWeight,
            preset5FontWeight = brand.preset5FontWeight,
            presetCardTitleFontWeight = brand.cardTitleFontWeight,
            presetButtonFontWeight = brand.buttonFontWeight,
            presetSmallButtonFontWeight = brand.buttonFontWeight,
            presetLinkFontWeight = brand.linkFontWeight,
            presetTitle1FontWeight = brand.title1FontWeight,
            presetIndicatorFontWeight = brand.indicatorFontWeight,
            presetTabsLabelFontWeight = brand.tabsLabelFontWeight,
            presetTabsLabelFontSize = brand.tabsLabelFontSize,
        )
    }

    val values = remember {
        MisticaValues()
    }.apply {
        updateWith(brand.values)
    }

    val radius = remember {
        MisticaRadius()
    }.apply {
        updateWith(brand.radius)
    }

    CompositionLocalProvider(
        LocalMisticaColors provides rememberedColors,
        LocalMisticaTypography provides typography,
        LocalMisticaValues provides values,
        LocalMisticaRadius provides radius
    ) {
        MaterialTheme(
            colors = if (darkTheme) {
                darkColors()
            } else {
                lightColors()
            }.copy(
                primary = LocalMisticaColors.current.brand,
                primaryVariant = LocalMisticaColors.current.brand,
                secondary = LocalMisticaColors.current.brand,
                secondaryVariant = LocalMisticaColors.current.brand,
                background = LocalMisticaColors.current.background,
                error = LocalMisticaColors.current.error,

                ),
            typography = Typography(
                body1 = LocalMisticaTypography.current.preset3
            ),
            shapes = Shapes(
                small = RoundedCornerShape(4.dp),
                medium = RoundedCornerShape(4.dp),
                large = RoundedCornerShape(0.dp),
            )
        ) {
            content()
        }
    }
}

object MisticaTheme {

    val colors: MisticaColors
        @Composable
        @ReadOnlyComposable
        get() = LocalMisticaColors.current

    val typography: MisticaTypography
        @Composable
        @ReadOnlyComposable
        get() = LocalMisticaTypography.current

    val values: MisticaValues
        @Composable
        @ReadOnlyComposable
        get() = LocalMisticaValues.current

    val radius: MisticaRadius
        @Composable
        @ReadOnlyComposable
        get() = LocalMisticaRadius.current
}
