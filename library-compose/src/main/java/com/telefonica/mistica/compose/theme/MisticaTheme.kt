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
            preset8FontWeight = brand.preset8FontWeight,
            preset7FontWeight = brand.preset7FontWeight,
            preset6FontWeight = brand.preset6FontWeight,
            preset5FontWeight = brand.preset5FontWeight,
        )
    }

    CompositionLocalProvider(
        LocalMisticaColors provides rememberedColors,
        LocalMisticaTypography provides typography,
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
}
