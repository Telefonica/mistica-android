package com.telefonica.mistica.compose.theme.text

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Immutable
class MisticaTypography(
    fontFamily: FontFamily = FontFamily.SansSerif,
) {
    private val Base = TextStyle(
        letterSpacing = 0.sp,
        fontFamily = fontFamily,
    )

    val Preset8 = Base.copy(
        fontSize = 32.sp,
        lineHeight = 40.sp,
        fontWeight = FontWeight.Light,
    )

    val Preset7 = Base.copy(
        fontSize = 28.sp,
        lineHeight = 32.sp,
        fontWeight = FontWeight.Light,
    )

    val Preset6 = Base.copy(
        fontSize = 24.sp,
        lineHeight = 32.sp,
        fontWeight = FontWeight.Light,
    )

    val Preset5 = Base.copy(
        fontSize = 22.sp,
        lineHeight = 24.sp,
        fontWeight = FontWeight.Normal,
    )

    val Preset4 = Base.copy(
        fontSize = 18.sp,
        lineHeight = 24.sp,
        fontFamily = FontFamily.SansSerif,
    )

    val Preset4Light = Preset4.copy(
        fontWeight = FontWeight.Light
    )

    val Preset4Medium = Preset4.copy(
        fontWeight = FontWeight.Medium
    )

    val Preset3 = Base.copy(
        fontSize = 16.sp,
        lineHeight = 24.sp,
    )

    val Preset3Light = Preset3.copy(
        fontWeight = FontWeight.Light
    )

    val Preset3Medium = Preset3.copy(
        fontWeight = FontWeight.Medium
    )

    val Preset2 = Base.copy(
        fontSize = 14.sp,
        lineHeight = 20.sp,
    )

    val Preset2Medium = Preset2.copy(
        fontWeight = FontWeight.Medium
    )

    val Preset1 = Base.copy(
        fontSize = 12.sp,
        lineHeight = 16.sp,
    )

    val Preset1Medium = Preset1.copy(
        fontWeight = FontWeight.Medium
    )

    val System = Base.copy(
        fontSize = 10.sp,
        lineHeight = 14.sp,
    )
}

internal val LocalMisticaTypography = staticCompositionLocalOf { MisticaTypography() }
