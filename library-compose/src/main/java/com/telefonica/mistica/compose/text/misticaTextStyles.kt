package com.telefonica.mistica.compose.text

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

object MisticaTextStyle {

    val defaultStyle = TextStyle(letterSpacing = 0.sp)

    val preset8 = defaultStyle.copy(
        fontSize = 32.sp,
        lineHeight = 40.sp,
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Light,
    )

    val preset7 = defaultStyle.copy(
        fontSize = 28.sp,
        lineHeight = 32.sp,
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Light,
    )

    val preset6 = defaultStyle.copy(
        fontSize = 24.sp,
        lineHeight = 32.sp,
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Light,
    )

    val preset5 = defaultStyle.copy(
        fontSize = 22.sp,
        lineHeight = 24.sp,
        fontFamily = FontFamily.SansSerif,
        fontWeight = FontWeight.Normal,
    )

    val preset4 = defaultStyle.copy(
        fontSize = 18.sp,
        lineHeight = 24.sp,
        fontFamily = FontFamily.SansSerif,
    )

    val preset4Light = preset4.copy(fontWeight = FontWeight.Light)

    val preset4Medium = preset4.copy(fontWeight = FontWeight.Medium)

    val preset3 = defaultStyle.copy(
        fontSize = 16.sp,
        lineHeight = 24.sp,
        fontFamily = FontFamily.SansSerif,
    )

    val preset3Light = preset3.copy(fontWeight = FontWeight.Light)

    val preset3Medium = preset3.copy(fontWeight = FontWeight.Medium)

    val preset2 = defaultStyle.copy(
        fontSize = 14.sp,
        lineHeight = 20.sp,
        fontFamily = FontFamily.SansSerif,
    )

    val preset2Medium = preset2.copy(fontWeight = FontWeight.Medium)

    val preset1 = defaultStyle.copy(
        fontSize = 12.sp,
        lineHeight = 16.sp,
        fontFamily = FontFamily.SansSerif,
    )

    val preset1Medium = preset1.copy(fontWeight = FontWeight.Medium)

    val system = defaultStyle.copy(
        fontSize = 10.sp,
        lineHeight = 14.sp,
        fontFamily = FontFamily.SansSerif,
    )
}
