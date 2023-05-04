package com.telefonica.mistica.compose.theme.values

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.unit.Dp
import com.telefonica.mistica.compose.title.TitleStyle

class MisticaValues(
    titleStyle: TitleStyle = TitleStyle.TITLE_1,
    buttonBorderRadius: Dp = Dp.Unspecified,
    inputBorderRadius: Dp = Dp.Unspecified,
    containerBorderRadius: Dp = Dp.Unspecified,
    legacyDisplayBorderRadius: Dp = Dp.Unspecified,
    popupBorderRadius: Dp = Dp.Unspecified,
    checkboxBorderRadius: Dp = Dp.Unspecified,
    indicatorBorderRadius: Dp = Dp.Unspecified,
    sheetBorderRadius: Dp = Dp.Unspecified,
    barBorderRadius: Dp = Dp.Unspecified,
) {

    var titleStyle by mutableStateOf(titleStyle, structuralEqualityPolicy())
        private set
    var buttonBorderRadius by mutableStateOf(buttonBorderRadius, structuralEqualityPolicy())
        private set
    var inputBorderRadius by mutableStateOf(inputBorderRadius, structuralEqualityPolicy())
        private set
    var containerBorderRadius by mutableStateOf(containerBorderRadius, structuralEqualityPolicy())
        private set
    var legacyDisplayBorderRadius by mutableStateOf(legacyDisplayBorderRadius, structuralEqualityPolicy())
        private set
    var popupBorderRadius by mutableStateOf(popupBorderRadius, structuralEqualityPolicy())
        private set
    var checkboxBorderRadius by mutableStateOf(checkboxBorderRadius, structuralEqualityPolicy())
        private set
    var indicatorBorderRadius by mutableStateOf(indicatorBorderRadius, structuralEqualityPolicy())
        private set
    var sheetBorderRadius by mutableStateOf(sheetBorderRadius, structuralEqualityPolicy())
        private set
    var barBorderRadius by mutableStateOf(barBorderRadius, structuralEqualityPolicy())
        private set

    fun copy(
        titleStyle: TitleStyle = this.titleStyle,
        buttonBorderRadius: Dp = this.buttonBorderRadius,
        inputBorderRadius: Dp = this.inputBorderRadius,
        containerBorderRadius: Dp = this.containerBorderRadius,
        legacyDisplayBorderRadius: Dp = this.legacyDisplayBorderRadius,
        popupBorderRadius: Dp = this.popupBorderRadius,
        checkboxBorderRadius: Dp = this.checkboxBorderRadius,
        indicatorBorderRadius: Dp = this.indicatorBorderRadius,
        sheetBorderRadius: Dp = this.sheetBorderRadius,
        barBorderRadius: Dp = this.barBorderRadius,
    ) = MisticaValues(
        titleStyle,
        buttonBorderRadius,
        inputBorderRadius,
        containerBorderRadius,
        legacyDisplayBorderRadius,
        popupBorderRadius,
        checkboxBorderRadius,
        indicatorBorderRadius,
        sheetBorderRadius,
        barBorderRadius
    )

    fun updateWith(
        other: MisticaValues,
    ) {
        titleStyle = other.titleStyle
        buttonBorderRadius = other.buttonBorderRadius
        inputBorderRadius = other.inputBorderRadius
        containerBorderRadius = other.containerBorderRadius
        legacyDisplayBorderRadius = other.legacyDisplayBorderRadius
        popupBorderRadius = other.popupBorderRadius
        checkboxBorderRadius = other.checkboxBorderRadius
        indicatorBorderRadius = other.indicatorBorderRadius
        sheetBorderRadius = other.sheetBorderRadius
        barBorderRadius = other.barBorderRadius
    }
}

internal val LocalMisticaValues = staticCompositionLocalOf { MisticaValues() }
