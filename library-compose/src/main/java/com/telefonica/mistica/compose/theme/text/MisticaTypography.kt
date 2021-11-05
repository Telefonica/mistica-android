package com.telefonica.mistica.compose.theme.text

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

class MisticaTypography(
    private var fontFamily: FontFamily = FontFamily.SansSerif,
) {
    var preset8 by mutableStateOf(buildPreset8(), structuralEqualityPolicy())
        private set

    var preset7 by mutableStateOf(buildPreset7(), structuralEqualityPolicy())
        private set

    var preset6 by mutableStateOf(buildPreset6(), structuralEqualityPolicy())
        private set

    var preset5 by mutableStateOf(buildPreset5(), structuralEqualityPolicy())
        private set

    var preset4 by mutableStateOf(buildPreset4(), structuralEqualityPolicy())
        private set

    var preset4Light by mutableStateOf(buildPreset4Light(), structuralEqualityPolicy())
        private set

    var preset4Medium by mutableStateOf(buildPreset4Medium(), structuralEqualityPolicy())
        private set

    var preset3 by mutableStateOf(buildPreset3(), structuralEqualityPolicy())
        private set

    var preset3Light by mutableStateOf(buildPreset3Light(), structuralEqualityPolicy())
        private set

    var preset3Medium by mutableStateOf(buildPreset3Medium(), structuralEqualityPolicy())
        private set

    var preset2 by mutableStateOf(buildPreset2(), structuralEqualityPolicy())
        private set

    var preset2Medium by mutableStateOf(buildPreset2Medium(), structuralEqualityPolicy())
        private set

    var preset1 by mutableStateOf(buildPreset1(), structuralEqualityPolicy())
        private set

    var preset1Medium by mutableStateOf(buildPreset1Medium(), structuralEqualityPolicy())
        private set

    var system by mutableStateOf(buildSystem(), structuralEqualityPolicy())
        private set

    private fun buildBaseStyle(): TextStyle =
        TextStyle(
            letterSpacing = 0.sp,
            fontFamily = fontFamily,
        )

    private fun buildPreset8() =
        buildBaseStyle().copy(
            fontSize = 32.sp,
            lineHeight = 40.sp,
            fontWeight = FontWeight.Light,
        )

    private fun buildPreset7() =
        buildBaseStyle().copy(
            fontSize = 28.sp,
            lineHeight = 32.sp,
            fontWeight = FontWeight.Light,
        )

    private fun buildPreset6() =
        buildBaseStyle().copy(
            fontSize = 24.sp,
            lineHeight = 32.sp,
            fontWeight = FontWeight.Light,
        )

    private fun buildPreset5() =
        buildBaseStyle().copy(
            fontSize = 22.sp,
            lineHeight = 24.sp,
            fontWeight = FontWeight.Normal,
        )

    private fun buildPreset4() =
        buildBaseStyle().copy(
            fontSize = 18.sp,
            lineHeight = 24.sp,
            fontWeight = FontWeight.Normal,
        )

    private fun buildPreset4Light() =
        buildPreset4().copy(
            fontWeight = FontWeight.Light
        )

    private fun buildPreset4Medium() =
        buildPreset4().copy(
            fontWeight = FontWeight.Medium
        )

    private fun buildPreset3() =
        buildBaseStyle().copy(
            fontSize = 16.sp,
            lineHeight = 24.sp,
            fontWeight = FontWeight.Normal,
        )

    private fun buildPreset3Light() =
        buildPreset3().copy(
            fontWeight = FontWeight.Light
        )

    private fun buildPreset3Medium() =
        buildPreset3().copy(
            fontWeight = FontWeight.Medium
        )

    private fun buildPreset2() =
        buildBaseStyle().copy(
            fontSize = 14.sp,
            lineHeight = 20.sp,
            fontWeight = FontWeight.Normal,
        )

    private fun buildPreset2Medium() =
        buildPreset2().copy(
            fontWeight = FontWeight.Medium
        )

    private fun buildPreset1() =
        buildBaseStyle().copy(
            fontSize = 12.sp,
            lineHeight = 16.sp,
            fontWeight = FontWeight.Normal,
        )

    private fun buildPreset1Medium() =
        buildPreset1().copy(
            fontWeight = FontWeight.Medium
        )

    private fun buildSystem() =
        buildBaseStyle().copy(
            fontSize = 10.sp,
            lineHeight = 14.sp,
            fontWeight = FontWeight.Normal,
        )

    fun updateWith(
        fontFamily: FontFamily
    ) {
        this.fontFamily = fontFamily
        preset8 = buildPreset8()
        preset7 = buildPreset7()
        preset6 = buildPreset6()
        preset5 = buildPreset5()
        preset4 = buildPreset4()
        preset4Light = buildPreset4Light()
        preset4Medium = buildPreset4Medium()
        preset3 = buildPreset3()
        preset3Light = buildPreset3Light()
        preset3Medium = buildPreset3Medium()
        preset2 = buildPreset2()
        preset2Medium = buildPreset2Medium()
        preset1 = buildPreset1()
        preset1Medium = buildPreset1Medium()
        system = buildSystem()
    }
}

internal val LocalMisticaTypography = staticCompositionLocalOf { MisticaTypography() }
