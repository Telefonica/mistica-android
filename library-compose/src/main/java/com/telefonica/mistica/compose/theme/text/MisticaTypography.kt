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
    private val base = TextStyle(
        letterSpacing = 0.sp,
        fontFamily = fontFamily,
    )

    val preset8 = base.copy(
        fontSize = 32.sp,
        lineHeight = 40.sp,
        fontWeight = FontWeight.Light,
    )

    val preset7 = base.copy(
        fontSize = 28.sp,
        lineHeight = 32.sp,
        fontWeight = FontWeight.Light,
    )

    val preset6 = base.copy(
        fontSize = 24.sp,
        lineHeight = 32.sp,
        fontWeight = FontWeight.Light,
    )

    val preset5 = base.copy(
        fontSize = 22.sp,
        lineHeight = 24.sp,
        fontWeight = FontWeight.Normal,
    )

    val preset4 = base.copy(
        fontSize = 18.sp,
        lineHeight = 24.sp,
        fontFamily = FontFamily.SansSerif,
    )

    val preset4Light = preset4.copy(
        fontWeight = FontWeight.Light
    )

    val preset4Medium = preset4.copy(
        fontWeight = FontWeight.Medium
    )

    val preset3 = base.copy(
        fontSize = 16.sp,
        lineHeight = 24.sp,
    )

    val preset3Light = preset3.copy(
        fontWeight = FontWeight.Light
    )

    val preset3Medium = preset3.copy(
        fontWeight = FontWeight.Medium
    )

    val preset2 = base.copy(
        fontSize = 14.sp,
        lineHeight = 20.sp,
    )

    val preset2Medium = preset2.copy(
        fontWeight = FontWeight.Medium
    )

    val preset1 = base.copy(
        fontSize = 12.sp,
        lineHeight = 16.sp,
    )

    val preset1Medium = preset1.copy(
        fontWeight = FontWeight.Medium
    )

    val system = base.copy(
        fontSize = 10.sp,
        lineHeight = 14.sp,
    )
}

internal val LocalMisticaTypography = staticCompositionLocalOf { MisticaTypography() }
