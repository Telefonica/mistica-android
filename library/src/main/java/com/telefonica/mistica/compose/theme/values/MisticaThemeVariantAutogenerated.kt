// Code generated automatically, DO NOT EDIT manually. Use Import design tokens GitHub Action.
package com.telefonica.mistica.compose.theme.values

import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.runtime.structuralEqualityPolicy

public class MisticaThemeVariant(
  successFeedbackThemeVariant: ThemeVariant = ThemeVariant.DEFAULT,
  brandLoadingScreenThemeVariant: ThemeVariant = ThemeVariant.DEFAULT,
) {
  public var successFeedbackThemeVariant: ThemeVariant by
      mutableStateOf(successFeedbackThemeVariant, structuralEqualityPolicy())
    internal set

  public var brandLoadingScreenThemeVariant: ThemeVariant by
      mutableStateOf(brandLoadingScreenThemeVariant, structuralEqualityPolicy())
    internal set

  public fun updateWith(other: MisticaThemeVariant) {
    successFeedbackThemeVariant = other.successFeedbackThemeVariant
    brandLoadingScreenThemeVariant = other.brandLoadingScreenThemeVariant
  }
}

internal val LocalMisticaThemeVariant: ProvidableCompositionLocal<MisticaThemeVariant> =
    staticCompositionLocalOf { MisticaThemeVariant() }
