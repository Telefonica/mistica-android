// Code generated automatically, DO NOT EDIT manually. Use Import design tokens GitHub Action.
package com.telefonica.mistica.compose.theme.color

import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor

public class MisticaBrushes(
  cardContentOverlay: Brush = SolidColor(Color.Unspecified),
  backgroundBrand: Brush = SolidColor(Color.Unspecified),
  backgroundContainerBrand: Brush = SolidColor(Color.Unspecified),
) {
  public var cardContentOverlay: Brush by mutableStateOf(cardContentOverlay,
      structuralEqualityPolicy())
    internal set

  public var backgroundBrand: Brush by mutableStateOf(backgroundBrand, structuralEqualityPolicy())
    internal set

  public var backgroundContainerBrand: Brush by mutableStateOf(backgroundContainerBrand,
      structuralEqualityPolicy())
    internal set

  public fun copy(
    cardContentOverlay: Brush = this.cardContentOverlay,
    backgroundBrand: Brush = this.backgroundBrand,
    backgroundContainerBrand: Brush = this.backgroundContainerBrand,
  ): MisticaBrushes = MisticaBrushes(cardContentOverlay = cardContentOverlay, backgroundBrand =
      backgroundBrand, backgroundContainerBrand = backgroundContainerBrand)

  public fun updateBrushesFrom(other: MisticaBrushes) {
    cardContentOverlay = other.cardContentOverlay
    backgroundBrand = other.backgroundBrand
    backgroundContainerBrand = other.backgroundContainerBrand
  }
}

internal val LocalMisticaBrushes: ProvidableCompositionLocal<MisticaBrushes> =
    staticCompositionLocalOf { MisticaBrushes() }
