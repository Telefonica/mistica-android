// Code generated automatically, DO NOT EDIT manually. Use Import design tokens GitHub Action.
package com.telefonica.mistica.compose.theme.color

import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.graphics.Color

public class MisticaColors(
  background: Color = Color.Unspecified,
  backgroundAlternative: Color = Color.Unspecified,
  backgroundBrand: Color = Color.Unspecified,
  backgroundBrandSecondary: Color = Color.Unspecified,
  backgroundContainer: Color = Color.Unspecified,
  backgroundContainerHover: Color = Color.Unspecified,
  backgroundContainerPressed: Color = Color.Unspecified,
  backgroundContainerBrand: Color = Color.Unspecified,
  backgroundContainerBrandHover: Color = Color.Unspecified,
  backgroundContainerBrandPressed: Color = Color.Unspecified,
  backgroundContainerBrandOverInverse: Color = Color.Unspecified,
  backgroundContainerBrandOverInverseHover: Color = Color.Unspecified,
  backgroundContainerBrandOverInversePressed: Color = Color.Unspecified,
  backgroundContainerAlternative: Color = Color.Unspecified,
  backgroundContainerAlternativeHover: Color = Color.Unspecified,
  backgroundContainerAlternativePressed: Color = Color.Unspecified,
  backgroundOverlay: Color = Color.Unspecified,
  backgroundSkeleton: Color = Color.Unspecified,
  backgroundSkeletonInverse: Color = Color.Unspecified,
  backgroundFeedbackBottom: Color = Color.Unspecified,
  appBarBackground: Color = Color.Unspecified,
  navigationBarBackground: Color = Color.Unspecified,
  skeletonWave: Color = Color.Unspecified,
  borderLow: Color = Color.Unspecified,
  border: Color = Color.Unspecified,
  borderHigh: Color = Color.Unspecified,
  borderSelected: Color = Color.Unspecified,
  buttonDangerBackground: Color = Color.Unspecified,
  buttonDangerBackgroundSelected: Color = Color.Unspecified,
  buttonDangerBackgroundHover: Color = Color.Unspecified,
  buttonLinkBackgroundSelected: Color = Color.Unspecified,
  buttonLinkBackgroundInverseSelected: Color = Color.Unspecified,
  buttonPrimaryBackground: Color = Color.Unspecified,
  buttonPrimaryBackgroundInverse: Color = Color.Unspecified,
  buttonPrimaryBackgroundSelected: Color = Color.Unspecified,
  buttonPrimaryBackgroundHover: Color = Color.Unspecified,
  buttonPrimaryBackgroundInverseSelected: Color = Color.Unspecified,
  buttonSecondaryBorder: Color = Color.Unspecified,
  buttonSecondaryBorderSelected: Color = Color.Unspecified,
  buttonSecondaryBackgroundHover: Color = Color.Unspecified,
  buttonSecondaryBackgroundSelected: Color = Color.Unspecified,
  buttonSecondaryBorderInverse: Color = Color.Unspecified,
  buttonSecondaryBorderInverseSelected: Color = Color.Unspecified,
  buttonSecondaryBackgroundInverseHover: Color = Color.Unspecified,
  buttonSecondaryBackgroundInverseSelected: Color = Color.Unspecified,
  textButtonPrimary: Color = Color.Unspecified,
  textButtonPrimaryInverse: Color = Color.Unspecified,
  textButtonPrimaryInverseSelected: Color = Color.Unspecified,
  textButtonSecondary: Color = Color.Unspecified,
  textButtonSecondarySelected: Color = Color.Unspecified,
  textButtonSecondaryInverse: Color = Color.Unspecified,
  textButtonSecondaryInverseSelected: Color = Color.Unspecified,
  textLink: Color = Color.Unspecified,
  textLinkInverse: Color = Color.Unspecified,
  textLinkDanger: Color = Color.Unspecified,
  textLinkSnackbar: Color = Color.Unspecified,
  control: Color = Color.Unspecified,
  controlActivated: Color = Color.Unspecified,
  controlError: Color = Color.Unspecified,
  loadingBar: Color = Color.Unspecified,
  loadingBarBackground: Color = Color.Unspecified,
  toggleAndroidInactive: Color = Color.Unspecified,
  toggleAndroidBackgroundActive: Color = Color.Unspecified,
  iosControlKnob: Color = Color.Unspecified,
  divider: Color = Color.Unspecified,
  dividerInverse: Color = Color.Unspecified,
  navigationBarDivider: Color = Color.Unspecified,
  badge: Color = Color.Unspecified,
  feedbackErrorBackground: Color = Color.Unspecified,
  feedbackInfoBackground: Color = Color.Unspecified,
  brand: Color = Color.Unspecified,
  brandHigh: Color = Color.Unspecified,
  inverse: Color = Color.Unspecified,
  neutralHigh: Color = Color.Unspecified,
  neutralMedium: Color = Color.Unspecified,
  neutralMediumInverse: Color = Color.Unspecified,
  neutralLow: Color = Color.Unspecified,
  neutralLowAlternative: Color = Color.Unspecified,
  textPrimary: Color = Color.Unspecified,
  textPrimaryInverse: Color = Color.Unspecified,
  textSecondary: Color = Color.Unspecified,
  textSecondaryInverse: Color = Color.Unspecified,
  success: Color = Color.Unspecified,
  warning: Color = Color.Unspecified,
  error: Color = Color.Unspecified,
  promo: Color = Color.Unspecified,
  highlight: Color = Color.Unspecified,
  successLow: Color = Color.Unspecified,
  warningLow: Color = Color.Unspecified,
  errorLow: Color = Color.Unspecified,
  promoLow: Color = Color.Unspecified,
  brandLow: Color = Color.Unspecified,
  successHigh: Color = Color.Unspecified,
  warningHigh: Color = Color.Unspecified,
  errorHigh: Color = Color.Unspecified,
  promoHigh: Color = Color.Unspecified,
  successHighInverse: Color = Color.Unspecified,
  warningHighInverse: Color = Color.Unspecified,
  errorHighInverse: Color = Color.Unspecified,
  promoHighInverse: Color = Color.Unspecified,
  textNavigationBarPrimary: Color = Color.Unspecified,
  textNavigationBarSecondary: Color = Color.Unspecified,
  textNavigationSearchBarHint: Color = Color.Unspecified,
  textNavigationSearchBarText: Color = Color.Unspecified,
  textAppBar: Color = Color.Unspecified,
  textAppBarSelected: Color = Color.Unspecified,
  customTabsBackground: Color = Color.Unspecified,
  gradientBackgroundFirst: Color = Color.Unspecified,
  gradientBackgroundSecond: Color = Color.Unspecified,
  gradientBackgroundThird: Color = Color.Unspecified,
  gradientBackgroundFourth: Color = Color.Unspecified,
  loginLoadingGradientFirst: Color = Color.Unspecified,
  loginLoadingGradientSecond: Color = Color.Unspecified,
  loginLoadingGradientThird: Color = Color.Unspecified,
  loginLoadingGradientFourth: Color = Color.Unspecified,
) {
  public var background: Color by mutableStateOf(background, structuralEqualityPolicy())
    internal set

  public var backgroundAlternative: Color by mutableStateOf(backgroundAlternative,
      structuralEqualityPolicy())
    internal set

  public var backgroundBrand: Color by mutableStateOf(backgroundBrand, structuralEqualityPolicy())
    internal set

  public var backgroundBrandSecondary: Color by mutableStateOf(backgroundBrandSecondary,
      structuralEqualityPolicy())
    internal set

  public var backgroundContainer: Color by mutableStateOf(backgroundContainer,
      structuralEqualityPolicy())
    internal set

  public var backgroundContainerHover: Color by mutableStateOf(backgroundContainerHover,
      structuralEqualityPolicy())
    internal set

  public var backgroundContainerPressed: Color by mutableStateOf(backgroundContainerPressed,
      structuralEqualityPolicy())
    internal set

  public var backgroundContainerBrand: Color by mutableStateOf(backgroundContainerBrand,
      structuralEqualityPolicy())
    internal set

  public var backgroundContainerBrandHover: Color by mutableStateOf(backgroundContainerBrandHover,
      structuralEqualityPolicy())
    internal set

  public var backgroundContainerBrandPressed: Color by
      mutableStateOf(backgroundContainerBrandPressed, structuralEqualityPolicy())
    internal set

  public var backgroundContainerBrandOverInverse: Color by
      mutableStateOf(backgroundContainerBrandOverInverse, structuralEqualityPolicy())
    internal set

  public var backgroundContainerBrandOverInverseHover: Color by
      mutableStateOf(backgroundContainerBrandOverInverseHover, structuralEqualityPolicy())
    internal set

  public var backgroundContainerBrandOverInversePressed: Color by
      mutableStateOf(backgroundContainerBrandOverInversePressed, structuralEqualityPolicy())
    internal set

  public var backgroundContainerAlternative: Color by mutableStateOf(backgroundContainerAlternative,
      structuralEqualityPolicy())
    internal set

  public var backgroundContainerAlternativeHover: Color by
      mutableStateOf(backgroundContainerAlternativeHover, structuralEqualityPolicy())
    internal set

  public var backgroundContainerAlternativePressed: Color by
      mutableStateOf(backgroundContainerAlternativePressed, structuralEqualityPolicy())
    internal set

  public var backgroundOverlay: Color by mutableStateOf(backgroundOverlay,
      structuralEqualityPolicy())
    internal set

  public var backgroundSkeleton: Color by mutableStateOf(backgroundSkeleton,
      structuralEqualityPolicy())
    internal set

  public var backgroundSkeletonInverse: Color by mutableStateOf(backgroundSkeletonInverse,
      structuralEqualityPolicy())
    internal set

  public var backgroundFeedbackBottom: Color by mutableStateOf(backgroundFeedbackBottom,
      structuralEqualityPolicy())
    internal set

  public var appBarBackground: Color by mutableStateOf(appBarBackground, structuralEqualityPolicy())
    internal set

  public var navigationBarBackground: Color by mutableStateOf(navigationBarBackground,
      structuralEqualityPolicy())
    internal set

  public var skeletonWave: Color by mutableStateOf(skeletonWave, structuralEqualityPolicy())
    internal set

  public var borderLow: Color by mutableStateOf(borderLow, structuralEqualityPolicy())
    internal set

  public var border: Color by mutableStateOf(border, structuralEqualityPolicy())
    internal set

  public var borderHigh: Color by mutableStateOf(borderHigh, structuralEqualityPolicy())
    internal set

  public var borderSelected: Color by mutableStateOf(borderSelected, structuralEqualityPolicy())
    internal set

  public var buttonDangerBackground: Color by mutableStateOf(buttonDangerBackground,
      structuralEqualityPolicy())
    internal set

  public var buttonDangerBackgroundSelected: Color by mutableStateOf(buttonDangerBackgroundSelected,
      structuralEqualityPolicy())
    internal set

  public var buttonDangerBackgroundHover: Color by mutableStateOf(buttonDangerBackgroundHover,
      structuralEqualityPolicy())
    internal set

  public var buttonLinkBackgroundSelected: Color by mutableStateOf(buttonLinkBackgroundSelected,
      structuralEqualityPolicy())
    internal set

  public var buttonLinkBackgroundInverseSelected: Color by
      mutableStateOf(buttonLinkBackgroundInverseSelected, structuralEqualityPolicy())
    internal set

  public var buttonPrimaryBackground: Color by mutableStateOf(buttonPrimaryBackground,
      structuralEqualityPolicy())
    internal set

  public var buttonPrimaryBackgroundInverse: Color by mutableStateOf(buttonPrimaryBackgroundInverse,
      structuralEqualityPolicy())
    internal set

  public var buttonPrimaryBackgroundSelected: Color by
      mutableStateOf(buttonPrimaryBackgroundSelected, structuralEqualityPolicy())
    internal set

  public var buttonPrimaryBackgroundHover: Color by mutableStateOf(buttonPrimaryBackgroundHover,
      structuralEqualityPolicy())
    internal set

  public var buttonPrimaryBackgroundInverseSelected: Color by
      mutableStateOf(buttonPrimaryBackgroundInverseSelected, structuralEqualityPolicy())
    internal set

  public var buttonSecondaryBorder: Color by mutableStateOf(buttonSecondaryBorder,
      structuralEqualityPolicy())
    internal set

  public var buttonSecondaryBorderSelected: Color by mutableStateOf(buttonSecondaryBorderSelected,
      structuralEqualityPolicy())
    internal set

  public var buttonSecondaryBackgroundHover: Color by mutableStateOf(buttonSecondaryBackgroundHover,
      structuralEqualityPolicy())
    internal set

  public var buttonSecondaryBackgroundSelected: Color by
      mutableStateOf(buttonSecondaryBackgroundSelected, structuralEqualityPolicy())
    internal set

  public var buttonSecondaryBorderInverse: Color by mutableStateOf(buttonSecondaryBorderInverse,
      structuralEqualityPolicy())
    internal set

  public var buttonSecondaryBorderInverseSelected: Color by
      mutableStateOf(buttonSecondaryBorderInverseSelected, structuralEqualityPolicy())
    internal set

  public var buttonSecondaryBackgroundInverseHover: Color by
      mutableStateOf(buttonSecondaryBackgroundInverseHover, structuralEqualityPolicy())
    internal set

  public var buttonSecondaryBackgroundInverseSelected: Color by
      mutableStateOf(buttonSecondaryBackgroundInverseSelected, structuralEqualityPolicy())
    internal set

  public var textButtonPrimary: Color by mutableStateOf(textButtonPrimary,
      structuralEqualityPolicy())
    internal set

  public var textButtonPrimaryInverse: Color by mutableStateOf(textButtonPrimaryInverse,
      structuralEqualityPolicy())
    internal set

  public var textButtonPrimaryInverseSelected: Color by
      mutableStateOf(textButtonPrimaryInverseSelected, structuralEqualityPolicy())
    internal set

  public var textButtonSecondary: Color by mutableStateOf(textButtonSecondary,
      structuralEqualityPolicy())
    internal set

  public var textButtonSecondarySelected: Color by mutableStateOf(textButtonSecondarySelected,
      structuralEqualityPolicy())
    internal set

  public var textButtonSecondaryInverse: Color by mutableStateOf(textButtonSecondaryInverse,
      structuralEqualityPolicy())
    internal set

  public var textButtonSecondaryInverseSelected: Color by
      mutableStateOf(textButtonSecondaryInverseSelected, structuralEqualityPolicy())
    internal set

  public var textLink: Color by mutableStateOf(textLink, structuralEqualityPolicy())
    internal set

  public var textLinkInverse: Color by mutableStateOf(textLinkInverse, structuralEqualityPolicy())
    internal set

  public var textLinkDanger: Color by mutableStateOf(textLinkDanger, structuralEqualityPolicy())
    internal set

  public var textLinkSnackbar: Color by mutableStateOf(textLinkSnackbar, structuralEqualityPolicy())
    internal set

  public var control: Color by mutableStateOf(control, structuralEqualityPolicy())
    internal set

  public var controlActivated: Color by mutableStateOf(controlActivated, structuralEqualityPolicy())
    internal set

  public var controlError: Color by mutableStateOf(controlError, structuralEqualityPolicy())
    internal set

  public var loadingBar: Color by mutableStateOf(loadingBar, structuralEqualityPolicy())
    internal set

  public var loadingBarBackground: Color by mutableStateOf(loadingBarBackground,
      structuralEqualityPolicy())
    internal set

  public var toggleAndroidInactive: Color by mutableStateOf(toggleAndroidInactive,
      structuralEqualityPolicy())
    internal set

  public var toggleAndroidBackgroundActive: Color by mutableStateOf(toggleAndroidBackgroundActive,
      structuralEqualityPolicy())
    internal set

  public var iosControlKnob: Color by mutableStateOf(iosControlKnob, structuralEqualityPolicy())
    internal set

  public var divider: Color by mutableStateOf(divider, structuralEqualityPolicy())
    internal set

  public var dividerInverse: Color by mutableStateOf(dividerInverse, structuralEqualityPolicy())
    internal set

  public var navigationBarDivider: Color by mutableStateOf(navigationBarDivider,
      structuralEqualityPolicy())
    internal set

  public var badge: Color by mutableStateOf(badge, structuralEqualityPolicy())
    internal set

  public var feedbackErrorBackground: Color by mutableStateOf(feedbackErrorBackground,
      structuralEqualityPolicy())
    internal set

  public var feedbackInfoBackground: Color by mutableStateOf(feedbackInfoBackground,
      structuralEqualityPolicy())
    internal set

  public var brand: Color by mutableStateOf(brand, structuralEqualityPolicy())
    internal set

  public var brandHigh: Color by mutableStateOf(brandHigh, structuralEqualityPolicy())
    internal set

  public var inverse: Color by mutableStateOf(inverse, structuralEqualityPolicy())
    internal set

  public var neutralHigh: Color by mutableStateOf(neutralHigh, structuralEqualityPolicy())
    internal set

  public var neutralMedium: Color by mutableStateOf(neutralMedium, structuralEqualityPolicy())
    internal set

  public var neutralMediumInverse: Color by mutableStateOf(neutralMediumInverse,
      structuralEqualityPolicy())
    internal set

  public var neutralLow: Color by mutableStateOf(neutralLow, structuralEqualityPolicy())
    internal set

  public var neutralLowAlternative: Color by mutableStateOf(neutralLowAlternative,
      structuralEqualityPolicy())
    internal set

  public var textPrimary: Color by mutableStateOf(textPrimary, structuralEqualityPolicy())
    internal set

  public var textPrimaryInverse: Color by mutableStateOf(textPrimaryInverse,
      structuralEqualityPolicy())
    internal set

  public var textSecondary: Color by mutableStateOf(textSecondary, structuralEqualityPolicy())
    internal set

  public var textSecondaryInverse: Color by mutableStateOf(textSecondaryInverse,
      structuralEqualityPolicy())
    internal set

  public var success: Color by mutableStateOf(success, structuralEqualityPolicy())
    internal set

  public var warning: Color by mutableStateOf(warning, structuralEqualityPolicy())
    internal set

  public var error: Color by mutableStateOf(error, structuralEqualityPolicy())
    internal set

  public var promo: Color by mutableStateOf(promo, structuralEqualityPolicy())
    internal set

  public var highlight: Color by mutableStateOf(highlight, structuralEqualityPolicy())
    internal set

  public var successLow: Color by mutableStateOf(successLow, structuralEqualityPolicy())
    internal set

  public var warningLow: Color by mutableStateOf(warningLow, structuralEqualityPolicy())
    internal set

  public var errorLow: Color by mutableStateOf(errorLow, structuralEqualityPolicy())
    internal set

  public var promoLow: Color by mutableStateOf(promoLow, structuralEqualityPolicy())
    internal set

  public var brandLow: Color by mutableStateOf(brandLow, structuralEqualityPolicy())
    internal set

  public var successHigh: Color by mutableStateOf(successHigh, structuralEqualityPolicy())
    internal set

  public var warningHigh: Color by mutableStateOf(warningHigh, structuralEqualityPolicy())
    internal set

  public var errorHigh: Color by mutableStateOf(errorHigh, structuralEqualityPolicy())
    internal set

  public var promoHigh: Color by mutableStateOf(promoHigh, structuralEqualityPolicy())
    internal set

  public var successHighInverse: Color by mutableStateOf(successHighInverse,
      structuralEqualityPolicy())
    internal set

  public var warningHighInverse: Color by mutableStateOf(warningHighInverse,
      structuralEqualityPolicy())
    internal set

  public var errorHighInverse: Color by mutableStateOf(errorHighInverse, structuralEqualityPolicy())
    internal set

  public var promoHighInverse: Color by mutableStateOf(promoHighInverse, structuralEqualityPolicy())
    internal set

  public var textNavigationBarPrimary: Color by mutableStateOf(textNavigationBarPrimary,
      structuralEqualityPolicy())
    internal set

  public var textNavigationBarSecondary: Color by mutableStateOf(textNavigationBarSecondary,
      structuralEqualityPolicy())
    internal set

  public var textNavigationSearchBarHint: Color by mutableStateOf(textNavigationSearchBarHint,
      structuralEqualityPolicy())
    internal set

  public var textNavigationSearchBarText: Color by mutableStateOf(textNavigationSearchBarText,
      structuralEqualityPolicy())
    internal set

  public var textAppBar: Color by mutableStateOf(textAppBar, structuralEqualityPolicy())
    internal set

  public var textAppBarSelected: Color by mutableStateOf(textAppBarSelected,
      structuralEqualityPolicy())
    internal set

  public var customTabsBackground: Color by mutableStateOf(customTabsBackground,
      structuralEqualityPolicy())
    internal set

  public var gradientBackgroundFirst: Color by mutableStateOf(gradientBackgroundFirst,
      structuralEqualityPolicy())
    internal set

  public var gradientBackgroundSecond: Color by mutableStateOf(gradientBackgroundSecond,
      structuralEqualityPolicy())
    internal set

  public var gradientBackgroundThird: Color by mutableStateOf(gradientBackgroundThird,
      structuralEqualityPolicy())
    internal set

  public var gradientBackgroundFourth: Color by mutableStateOf(gradientBackgroundFourth,
      structuralEqualityPolicy())
    internal set

  public var loginLoadingGradientFirst: Color by mutableStateOf(loginLoadingGradientFirst,
      structuralEqualityPolicy())
    internal set

  public var loginLoadingGradientSecond: Color by mutableStateOf(loginLoadingGradientSecond,
      structuralEqualityPolicy())
    internal set

  public var loginLoadingGradientThird: Color by mutableStateOf(loginLoadingGradientThird,
      structuralEqualityPolicy())
    internal set

  public var loginLoadingGradientFourth: Color by mutableStateOf(loginLoadingGradientFourth,
      structuralEqualityPolicy())
    internal set

  public fun copy(
    background: Color = this.background,
    backgroundAlternative: Color = this.backgroundAlternative,
    backgroundBrand: Color = this.backgroundBrand,
    backgroundBrandSecondary: Color = this.backgroundBrandSecondary,
    backgroundContainer: Color = this.backgroundContainer,
    backgroundContainerHover: Color = this.backgroundContainerHover,
    backgroundContainerPressed: Color = this.backgroundContainerPressed,
    backgroundContainerBrand: Color = this.backgroundContainerBrand,
    backgroundContainerBrandHover: Color = this.backgroundContainerBrandHover,
    backgroundContainerBrandPressed: Color = this.backgroundContainerBrandPressed,
    backgroundContainerBrandOverInverse: Color = this.backgroundContainerBrandOverInverse,
    backgroundContainerBrandOverInverseHover: Color = this.backgroundContainerBrandOverInverseHover,
    backgroundContainerBrandOverInversePressed: Color =
        this.backgroundContainerBrandOverInversePressed,
    backgroundContainerAlternative: Color = this.backgroundContainerAlternative,
    backgroundContainerAlternativeHover: Color = this.backgroundContainerAlternativeHover,
    backgroundContainerAlternativePressed: Color = this.backgroundContainerAlternativePressed,
    backgroundOverlay: Color = this.backgroundOverlay,
    backgroundSkeleton: Color = this.backgroundSkeleton,
    backgroundSkeletonInverse: Color = this.backgroundSkeletonInverse,
    backgroundFeedbackBottom: Color = this.backgroundFeedbackBottom,
    appBarBackground: Color = this.appBarBackground,
    navigationBarBackground: Color = this.navigationBarBackground,
    skeletonWave: Color = this.skeletonWave,
    borderLow: Color = this.borderLow,
    border: Color = this.border,
    borderHigh: Color = this.borderHigh,
    borderSelected: Color = this.borderSelected,
    buttonDangerBackground: Color = this.buttonDangerBackground,
    buttonDangerBackgroundSelected: Color = this.buttonDangerBackgroundSelected,
    buttonDangerBackgroundHover: Color = this.buttonDangerBackgroundHover,
    buttonLinkBackgroundSelected: Color = this.buttonLinkBackgroundSelected,
    buttonLinkBackgroundInverseSelected: Color = this.buttonLinkBackgroundInverseSelected,
    buttonPrimaryBackground: Color = this.buttonPrimaryBackground,
    buttonPrimaryBackgroundInverse: Color = this.buttonPrimaryBackgroundInverse,
    buttonPrimaryBackgroundSelected: Color = this.buttonPrimaryBackgroundSelected,
    buttonPrimaryBackgroundHover: Color = this.buttonPrimaryBackgroundHover,
    buttonPrimaryBackgroundInverseSelected: Color = this.buttonPrimaryBackgroundInverseSelected,
    buttonSecondaryBorder: Color = this.buttonSecondaryBorder,
    buttonSecondaryBorderSelected: Color = this.buttonSecondaryBorderSelected,
    buttonSecondaryBackgroundHover: Color = this.buttonSecondaryBackgroundHover,
    buttonSecondaryBackgroundSelected: Color = this.buttonSecondaryBackgroundSelected,
    buttonSecondaryBorderInverse: Color = this.buttonSecondaryBorderInverse,
    buttonSecondaryBorderInverseSelected: Color = this.buttonSecondaryBorderInverseSelected,
    buttonSecondaryBackgroundInverseHover: Color = this.buttonSecondaryBackgroundInverseHover,
    buttonSecondaryBackgroundInverseSelected: Color = this.buttonSecondaryBackgroundInverseSelected,
    textButtonPrimary: Color = this.textButtonPrimary,
    textButtonPrimaryInverse: Color = this.textButtonPrimaryInverse,
    textButtonPrimaryInverseSelected: Color = this.textButtonPrimaryInverseSelected,
    textButtonSecondary: Color = this.textButtonSecondary,
    textButtonSecondarySelected: Color = this.textButtonSecondarySelected,
    textButtonSecondaryInverse: Color = this.textButtonSecondaryInverse,
    textButtonSecondaryInverseSelected: Color = this.textButtonSecondaryInverseSelected,
    textLink: Color = this.textLink,
    textLinkInverse: Color = this.textLinkInverse,
    textLinkDanger: Color = this.textLinkDanger,
    textLinkSnackbar: Color = this.textLinkSnackbar,
    control: Color = this.control,
    controlActivated: Color = this.controlActivated,
    controlError: Color = this.controlError,
    loadingBar: Color = this.loadingBar,
    loadingBarBackground: Color = this.loadingBarBackground,
    toggleAndroidInactive: Color = this.toggleAndroidInactive,
    toggleAndroidBackgroundActive: Color = this.toggleAndroidBackgroundActive,
    iosControlKnob: Color = this.iosControlKnob,
    divider: Color = this.divider,
    dividerInverse: Color = this.dividerInverse,
    navigationBarDivider: Color = this.navigationBarDivider,
    badge: Color = this.badge,
    feedbackErrorBackground: Color = this.feedbackErrorBackground,
    feedbackInfoBackground: Color = this.feedbackInfoBackground,
    brand: Color = this.brand,
    brandHigh: Color = this.brandHigh,
    inverse: Color = this.inverse,
    neutralHigh: Color = this.neutralHigh,
    neutralMedium: Color = this.neutralMedium,
    neutralMediumInverse: Color = this.neutralMediumInverse,
    neutralLow: Color = this.neutralLow,
    neutralLowAlternative: Color = this.neutralLowAlternative,
    textPrimary: Color = this.textPrimary,
    textPrimaryInverse: Color = this.textPrimaryInverse,
    textSecondary: Color = this.textSecondary,
    textSecondaryInverse: Color = this.textSecondaryInverse,
    success: Color = this.success,
    warning: Color = this.warning,
    error: Color = this.error,
    promo: Color = this.promo,
    highlight: Color = this.highlight,
    successLow: Color = this.successLow,
    warningLow: Color = this.warningLow,
    errorLow: Color = this.errorLow,
    promoLow: Color = this.promoLow,
    brandLow: Color = this.brandLow,
    successHigh: Color = this.successHigh,
    warningHigh: Color = this.warningHigh,
    errorHigh: Color = this.errorHigh,
    promoHigh: Color = this.promoHigh,
    successHighInverse: Color = this.successHighInverse,
    warningHighInverse: Color = this.warningHighInverse,
    errorHighInverse: Color = this.errorHighInverse,
    promoHighInverse: Color = this.promoHighInverse,
    textNavigationBarPrimary: Color = this.textNavigationBarPrimary,
    textNavigationBarSecondary: Color = this.textNavigationBarSecondary,
    textNavigationSearchBarHint: Color = this.textNavigationSearchBarHint,
    textNavigationSearchBarText: Color = this.textNavigationSearchBarText,
    textAppBar: Color = this.textAppBar,
    textAppBarSelected: Color = this.textAppBarSelected,
    customTabsBackground: Color = this.customTabsBackground,
    gradientBackgroundFirst: Color = this.gradientBackgroundFirst,
    gradientBackgroundSecond: Color = this.gradientBackgroundSecond,
    gradientBackgroundThird: Color = this.gradientBackgroundThird,
    gradientBackgroundFourth: Color = this.gradientBackgroundFourth,
    loginLoadingGradientFirst: Color = this.loginLoadingGradientFirst,
    loginLoadingGradientSecond: Color = this.loginLoadingGradientSecond,
    loginLoadingGradientThird: Color = this.loginLoadingGradientThird,
    loginLoadingGradientFourth: Color = this.loginLoadingGradientFourth,
  ): MisticaColors = MisticaColors(background = background, backgroundAlternative =
      backgroundAlternative, backgroundBrand = backgroundBrand, backgroundBrandSecondary =
      backgroundBrandSecondary, backgroundContainer = backgroundContainer, backgroundContainerHover
      = backgroundContainerHover, backgroundContainerPressed = backgroundContainerPressed,
      backgroundContainerBrand = backgroundContainerBrand, backgroundContainerBrandHover =
      backgroundContainerBrandHover, backgroundContainerBrandPressed =
      backgroundContainerBrandPressed, backgroundContainerBrandOverInverse =
      backgroundContainerBrandOverInverse, backgroundContainerBrandOverInverseHover =
      backgroundContainerBrandOverInverseHover, backgroundContainerBrandOverInversePressed =
      backgroundContainerBrandOverInversePressed, backgroundContainerAlternative =
      backgroundContainerAlternative, backgroundContainerAlternativeHover =
      backgroundContainerAlternativeHover, backgroundContainerAlternativePressed =
      backgroundContainerAlternativePressed, backgroundOverlay = backgroundOverlay,
      backgroundSkeleton = backgroundSkeleton, backgroundSkeletonInverse =
      backgroundSkeletonInverse, backgroundFeedbackBottom = backgroundFeedbackBottom,
      appBarBackground = appBarBackground, navigationBarBackground = navigationBarBackground,
      skeletonWave = skeletonWave, borderLow = borderLow, border = border, borderHigh = borderHigh,
      borderSelected = borderSelected, buttonDangerBackground = buttonDangerBackground,
      buttonDangerBackgroundSelected = buttonDangerBackgroundSelected, buttonDangerBackgroundHover =
      buttonDangerBackgroundHover, buttonLinkBackgroundSelected = buttonLinkBackgroundSelected,
      buttonLinkBackgroundInverseSelected = buttonLinkBackgroundInverseSelected,
      buttonPrimaryBackground = buttonPrimaryBackground, buttonPrimaryBackgroundInverse =
      buttonPrimaryBackgroundInverse, buttonPrimaryBackgroundSelected =
      buttonPrimaryBackgroundSelected, buttonPrimaryBackgroundHover = buttonPrimaryBackgroundHover,
      buttonPrimaryBackgroundInverseSelected = buttonPrimaryBackgroundInverseSelected,
      buttonSecondaryBorder = buttonSecondaryBorder, buttonSecondaryBorderSelected =
      buttonSecondaryBorderSelected, buttonSecondaryBackgroundHover =
      buttonSecondaryBackgroundHover, buttonSecondaryBackgroundSelected =
      buttonSecondaryBackgroundSelected, buttonSecondaryBorderInverse =
      buttonSecondaryBorderInverse, buttonSecondaryBorderInverseSelected =
      buttonSecondaryBorderInverseSelected, buttonSecondaryBackgroundInverseHover =
      buttonSecondaryBackgroundInverseHover, buttonSecondaryBackgroundInverseSelected =
      buttonSecondaryBackgroundInverseSelected, textButtonPrimary = textButtonPrimary,
      textButtonPrimaryInverse = textButtonPrimaryInverse, textButtonPrimaryInverseSelected =
      textButtonPrimaryInverseSelected, textButtonSecondary = textButtonSecondary,
      textButtonSecondarySelected = textButtonSecondarySelected, textButtonSecondaryInverse =
      textButtonSecondaryInverse, textButtonSecondaryInverseSelected =
      textButtonSecondaryInverseSelected, textLink = textLink, textLinkInverse = textLinkInverse,
      textLinkDanger = textLinkDanger, textLinkSnackbar = textLinkSnackbar, control = control,
      controlActivated = controlActivated, controlError = controlError, loadingBar = loadingBar,
      loadingBarBackground = loadingBarBackground, toggleAndroidInactive = toggleAndroidInactive,
      toggleAndroidBackgroundActive = toggleAndroidBackgroundActive, iosControlKnob =
      iosControlKnob, divider = divider, dividerInverse = dividerInverse, navigationBarDivider =
      navigationBarDivider, badge = badge, feedbackErrorBackground = feedbackErrorBackground,
      feedbackInfoBackground = feedbackInfoBackground, brand = brand, brandHigh = brandHigh, inverse
      = inverse, neutralHigh = neutralHigh, neutralMedium = neutralMedium, neutralMediumInverse =
      neutralMediumInverse, neutralLow = neutralLow, neutralLowAlternative = neutralLowAlternative,
      textPrimary = textPrimary, textPrimaryInverse = textPrimaryInverse, textSecondary =
      textSecondary, textSecondaryInverse = textSecondaryInverse, success = success, warning =
      warning, error = error, promo = promo, highlight = highlight, successLow = successLow,
      warningLow = warningLow, errorLow = errorLow, promoLow = promoLow, brandLow = brandLow,
      successHigh = successHigh, warningHigh = warningHigh, errorHigh = errorHigh, promoHigh =
      promoHigh, successHighInverse = successHighInverse, warningHighInverse = warningHighInverse,
      errorHighInverse = errorHighInverse, promoHighInverse = promoHighInverse,
      textNavigationBarPrimary = textNavigationBarPrimary, textNavigationBarSecondary =
      textNavigationBarSecondary, textNavigationSearchBarHint = textNavigationSearchBarHint,
      textNavigationSearchBarText = textNavigationSearchBarText, textAppBar = textAppBar,
      textAppBarSelected = textAppBarSelected, customTabsBackground = customTabsBackground,
      gradientBackgroundFirst = gradientBackgroundFirst, gradientBackgroundSecond =
      gradientBackgroundSecond, gradientBackgroundThird = gradientBackgroundThird,
      gradientBackgroundFourth = gradientBackgroundFourth, loginLoadingGradientFirst =
      loginLoadingGradientFirst, loginLoadingGradientSecond = loginLoadingGradientSecond,
      loginLoadingGradientThird = loginLoadingGradientThird, loginLoadingGradientFourth =
      loginLoadingGradientFourth)

  public fun updateColorsFrom(other: MisticaColors) {
    background = other.background
    backgroundAlternative = other.backgroundAlternative
    backgroundBrand = other.backgroundBrand
    backgroundBrandSecondary = other.backgroundBrandSecondary
    backgroundContainer = other.backgroundContainer
    backgroundContainerHover = other.backgroundContainerHover
    backgroundContainerPressed = other.backgroundContainerPressed
    backgroundContainerBrand = other.backgroundContainerBrand
    backgroundContainerBrandHover = other.backgroundContainerBrandHover
    backgroundContainerBrandPressed = other.backgroundContainerBrandPressed
    backgroundContainerBrandOverInverse = other.backgroundContainerBrandOverInverse
    backgroundContainerBrandOverInverseHover = other.backgroundContainerBrandOverInverseHover
    backgroundContainerBrandOverInversePressed = other.backgroundContainerBrandOverInversePressed
    backgroundContainerAlternative = other.backgroundContainerAlternative
    backgroundContainerAlternativeHover = other.backgroundContainerAlternativeHover
    backgroundContainerAlternativePressed = other.backgroundContainerAlternativePressed
    backgroundOverlay = other.backgroundOverlay
    backgroundSkeleton = other.backgroundSkeleton
    backgroundSkeletonInverse = other.backgroundSkeletonInverse
    backgroundFeedbackBottom = other.backgroundFeedbackBottom
    appBarBackground = other.appBarBackground
    navigationBarBackground = other.navigationBarBackground
    skeletonWave = other.skeletonWave
    borderLow = other.borderLow
    border = other.border
    borderHigh = other.borderHigh
    borderSelected = other.borderSelected
    buttonDangerBackground = other.buttonDangerBackground
    buttonDangerBackgroundSelected = other.buttonDangerBackgroundSelected
    buttonDangerBackgroundHover = other.buttonDangerBackgroundHover
    buttonLinkBackgroundSelected = other.buttonLinkBackgroundSelected
    buttonLinkBackgroundInverseSelected = other.buttonLinkBackgroundInverseSelected
    buttonPrimaryBackground = other.buttonPrimaryBackground
    buttonPrimaryBackgroundInverse = other.buttonPrimaryBackgroundInverse
    buttonPrimaryBackgroundSelected = other.buttonPrimaryBackgroundSelected
    buttonPrimaryBackgroundHover = other.buttonPrimaryBackgroundHover
    buttonPrimaryBackgroundInverseSelected = other.buttonPrimaryBackgroundInverseSelected
    buttonSecondaryBorder = other.buttonSecondaryBorder
    buttonSecondaryBorderSelected = other.buttonSecondaryBorderSelected
    buttonSecondaryBackgroundHover = other.buttonSecondaryBackgroundHover
    buttonSecondaryBackgroundSelected = other.buttonSecondaryBackgroundSelected
    buttonSecondaryBorderInverse = other.buttonSecondaryBorderInverse
    buttonSecondaryBorderInverseSelected = other.buttonSecondaryBorderInverseSelected
    buttonSecondaryBackgroundInverseHover = other.buttonSecondaryBackgroundInverseHover
    buttonSecondaryBackgroundInverseSelected = other.buttonSecondaryBackgroundInverseSelected
    textButtonPrimary = other.textButtonPrimary
    textButtonPrimaryInverse = other.textButtonPrimaryInverse
    textButtonPrimaryInverseSelected = other.textButtonPrimaryInverseSelected
    textButtonSecondary = other.textButtonSecondary
    textButtonSecondarySelected = other.textButtonSecondarySelected
    textButtonSecondaryInverse = other.textButtonSecondaryInverse
    textButtonSecondaryInverseSelected = other.textButtonSecondaryInverseSelected
    textLink = other.textLink
    textLinkInverse = other.textLinkInverse
    textLinkDanger = other.textLinkDanger
    textLinkSnackbar = other.textLinkSnackbar
    control = other.control
    controlActivated = other.controlActivated
    controlError = other.controlError
    loadingBar = other.loadingBar
    loadingBarBackground = other.loadingBarBackground
    toggleAndroidInactive = other.toggleAndroidInactive
    toggleAndroidBackgroundActive = other.toggleAndroidBackgroundActive
    iosControlKnob = other.iosControlKnob
    divider = other.divider
    dividerInverse = other.dividerInverse
    navigationBarDivider = other.navigationBarDivider
    badge = other.badge
    feedbackErrorBackground = other.feedbackErrorBackground
    feedbackInfoBackground = other.feedbackInfoBackground
    brand = other.brand
    brandHigh = other.brandHigh
    inverse = other.inverse
    neutralHigh = other.neutralHigh
    neutralMedium = other.neutralMedium
    neutralMediumInverse = other.neutralMediumInverse
    neutralLow = other.neutralLow
    neutralLowAlternative = other.neutralLowAlternative
    textPrimary = other.textPrimary
    textPrimaryInverse = other.textPrimaryInverse
    textSecondary = other.textSecondary
    textSecondaryInverse = other.textSecondaryInverse
    success = other.success
    warning = other.warning
    error = other.error
    promo = other.promo
    highlight = other.highlight
    successLow = other.successLow
    warningLow = other.warningLow
    errorLow = other.errorLow
    promoLow = other.promoLow
    brandLow = other.brandLow
    successHigh = other.successHigh
    warningHigh = other.warningHigh
    errorHigh = other.errorHigh
    promoHigh = other.promoHigh
    successHighInverse = other.successHighInverse
    warningHighInverse = other.warningHighInverse
    errorHighInverse = other.errorHighInverse
    promoHighInverse = other.promoHighInverse
    textNavigationBarPrimary = other.textNavigationBarPrimary
    textNavigationBarSecondary = other.textNavigationBarSecondary
    textNavigationSearchBarHint = other.textNavigationSearchBarHint
    textNavigationSearchBarText = other.textNavigationSearchBarText
    textAppBar = other.textAppBar
    textAppBarSelected = other.textAppBarSelected
    customTabsBackground = other.customTabsBackground
    gradientBackgroundFirst = other.gradientBackgroundFirst
    gradientBackgroundSecond = other.gradientBackgroundSecond
    gradientBackgroundThird = other.gradientBackgroundThird
    gradientBackgroundFourth = other.gradientBackgroundFourth
    loginLoadingGradientFirst = other.loginLoadingGradientFirst
    loginLoadingGradientSecond = other.loginLoadingGradientSecond
    loginLoadingGradientThird = other.loginLoadingGradientThird
    loginLoadingGradientFourth = other.loginLoadingGradientFourth
  }
}

internal val LocalMisticaColors: ProvidableCompositionLocal<MisticaColors> =
    staticCompositionLocalOf { MisticaColors() }
