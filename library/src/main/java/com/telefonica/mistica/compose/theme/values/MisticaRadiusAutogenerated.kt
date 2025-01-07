// Code generated automatically, DO NOT EDIT manually. Use Import design tokens GitHub Action.
package com.telefonica.mistica.compose.theme.values

import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.unit.Dp
import kotlin.Int

public class MisticaRadius(
  avatarBorderRadius: Int = 0,
  barBorderRadius: Dp = Dp.Unspecified,
  buttonBorderRadius: Dp = Dp.Unspecified,
  checkboxBorderRadius: Dp = Dp.Unspecified,
  containerBorderRadius: Dp = Dp.Unspecified,
  indicatorBorderRadius: Dp = Dp.Unspecified,
  inputBorderRadius: Dp = Dp.Unspecified,
  legacyDisplayBorderRadius: Dp = Dp.Unspecified,
  popupBorderRadius: Dp = Dp.Unspecified,
  sheetBorderRadius: Dp = Dp.Unspecified,
  mediaSmallBorderRadius: Dp = Dp.Unspecified,
) {
  public var avatarBorderRadius: Int by mutableIntStateOf(avatarBorderRadius)
    internal set

  public var barBorderRadius: Dp by mutableStateOf(barBorderRadius, structuralEqualityPolicy())
    internal set

  public var buttonBorderRadius: Dp by mutableStateOf(buttonBorderRadius,
      structuralEqualityPolicy())
    internal set

  public var checkboxBorderRadius: Dp by mutableStateOf(checkboxBorderRadius,
      structuralEqualityPolicy())
    internal set

  public var containerBorderRadius: Dp by mutableStateOf(containerBorderRadius,
      structuralEqualityPolicy())
    internal set

  public var indicatorBorderRadius: Dp by mutableStateOf(indicatorBorderRadius,
      structuralEqualityPolicy())
    internal set

  public var inputBorderRadius: Dp by mutableStateOf(inputBorderRadius, structuralEqualityPolicy())
    internal set

  public var legacyDisplayBorderRadius: Dp by mutableStateOf(legacyDisplayBorderRadius,
      structuralEqualityPolicy())
    internal set

  public var popupBorderRadius: Dp by mutableStateOf(popupBorderRadius, structuralEqualityPolicy())
    internal set

  public var sheetBorderRadius: Dp by mutableStateOf(sheetBorderRadius, structuralEqualityPolicy())
    internal set

  public var mediaSmallBorderRadius: Dp by mutableStateOf(mediaSmallBorderRadius,
      structuralEqualityPolicy())
    internal set

  public fun updateWith(other: MisticaRadius) {
    avatarBorderRadius = other.avatarBorderRadius
    barBorderRadius = other.barBorderRadius
    buttonBorderRadius = other.buttonBorderRadius
    checkboxBorderRadius = other.checkboxBorderRadius
    containerBorderRadius = other.containerBorderRadius
    indicatorBorderRadius = other.indicatorBorderRadius
    inputBorderRadius = other.inputBorderRadius
    legacyDisplayBorderRadius = other.legacyDisplayBorderRadius
    popupBorderRadius = other.popupBorderRadius
    sheetBorderRadius = other.sheetBorderRadius
    mediaSmallBorderRadius = other.mediaSmallBorderRadius
  }
}

internal val LocalMisticaRadius: ProvidableCompositionLocal<MisticaRadius> =
    staticCompositionLocalOf { MisticaRadius() }
