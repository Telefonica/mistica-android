// Code generated automatically, DO NOT EDIT manually. Use Import design tokens GitHub Action.
package com.telefonica.mistica.compose.theme.brushes

import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor

public class MisticaBrushes {
  public var cardContentOverlay: Brush by mutableStateOf(SolidColor(Color.Unspecified),
      structuralEqualityPolicy())

  public var backgroundBrand: Brush by mutableStateOf(SolidColor(Color.Unspecified),
      structuralEqualityPolicy())

  public var backgroundContainerBrand: Brush by mutableStateOf(SolidColor(Color.Unspecified),
      structuralEqualityPolicy())

  public fun updateBrushesFrom(other: MisticaBrushes) {
    cardContentOverlay = other.cardContentOverlay
    backgroundBrand = other.backgroundBrand
    backgroundContainerBrand = other.backgroundContainerBrand
  }
}

internal val LocalMisticaBrushes: ProvidableCompositionLocal<MisticaBrushes> =
    staticCompositionLocalOf { MisticaBrushes() }
