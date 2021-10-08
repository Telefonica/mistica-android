package com.telefonica.mistica.compose.text

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

object MisticaTextStyle {

    val Default = TextStyle(letterSpacing = 0.sp)

    val Preset8 = Default.copy(
        fontSize = 32.sp,
        lineHeight = 40.sp,
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Light,
    )

    val Preset7 = Default.copy(
        fontSize = 28.sp,
        lineHeight = 32.sp,
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Light,
    )

    val Preset6 = Default.copy(
        fontSize = 24.sp,
        lineHeight = 32.sp,
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Light,
    )

    val Preset5 = Default.copy(
        fontSize = 22.sp,
        lineHeight = 24.sp,
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Normal,
    )

    val Preset4 = Default.copy(
        fontSize = 18.sp,
        lineHeight = 24.sp,
        fontFamily = FontFamily.SansSerif,
    )

    val Preset4Light = Preset4.copy(fontWeight = FontWeight.Light)

    val Preset4Medium = Preset4.copy(fontWeight = FontWeight.Medium)

    val Preset3 = Default.copy(
        fontSize = 16.sp,
        lineHeight = 24.sp,
        fontFamily = FontFamily.SansSerif,
    )

    val Preset3Light = Preset3.copy(fontWeight = FontWeight.Light)

    val Preset3Medium = Preset3.copy(fontWeight = FontWeight.Medium)

    val Preset2 = Default.copy(
        fontSize = 14.sp,
        lineHeight = 20.sp,
        fontFamily = FontFamily.SansSerif,
    )

    val Preset2Medium = Preset2.copy(fontWeight = FontWeight.Medium)

    val Preset1 = Default.copy(
        fontSize = 12.sp,
        lineHeight = 16.sp,
        fontFamily = FontFamily.SansSerif,
    )

    val Preset1Medium = Preset1.copy(fontWeight = FontWeight.Medium)

    val Pystem = Default.copy(
        fontSize = 10.sp,
        lineHeight = 14.sp,
        fontFamily = FontFamily.SansSerif,
    )
}
