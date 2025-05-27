// Code generated automatically, DO NOT EDIT manually. Use Import design tokens GitHub Action.
package com.telefonica.mistica.compose.theme.values

import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.runtime.structuralEqualityPolicy
import kotlin.String

public class MisticaThemeVariant(
  successFeedbackThemeVariant: String = "default",
  brandLoadingScreenThemeVariant: String = "default",
) {
  public var successFeedbackThemeVariant: String by mutableStateOf(successFeedbackThemeVariant,
      structuralEqualityPolicy())
    internal set

  public var brandLoadingScreenThemeVariant: String by
      mutableStateOf(brandLoadingScreenThemeVariant, structuralEqualityPolicy())
    internal set

  public fun updateWith(other: MisticaThemeVariant) {
    successFeedbackThemeVariant = other.successFeedbackThemeVariant
    brandLoadingScreenThemeVariant = other.brandLoadingScreenThemeVariant
  }
}

internal val LocalMisticaThemeVariant: ProvidableCompositionLocal<MisticaThemeVariant> =
    staticCompositionLocalOf { MisticaThemeVariant() }
