package com.telefonica.mistica.compose.theme.color

import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.graphics.Color

class MisticaColors(
    appBarBackground: Color,
    background: Color,
    backgroundContainer: Color,
    backgroundBrand: Color,
    backgroundOverlay: Color,
    backgroundSkeleton: Color,
    backgroundSkeletonInverse: Color,
    navigationBarBackground: Color,
    backgroundAlternative: Color,
    backgroundFeedbackBottom: Color,
    skeletonWave: Color,
    borderLight: Color,
    border: Color,
    borderDark: Color,
    borderSelected: Color,
    buttonDangerBackground: Color,
    buttonDangerBackgroundDisabled: Color,
    buttonDangerBackgroundSelected: Color,
    buttonLinkBackgroundSelected: Color,
    buttonLinkBackgroundSelectedInverse: Color,
    buttonPrimaryBackground: Color,
    buttonPrimaryBackgroundDisabled: Color,
    buttonPrimaryBackgroundDisabledInverse: Color,
    buttonPrimaryBackgroundInverse: Color,
    buttonPrimaryBackgroundSelected: Color,
    buttonPrimaryBackgroundSelectedInverse: Color,
    buttonSecondaryBackground: Color,
    buttonSecondaryBackgroundDisabled: Color,
    buttonSecondaryBackgroundSelected: Color,
    buttonSecondaryBorderDisabledInverse: Color,
    buttonSecondaryBorderInverse: Color,
    buttonSecondaryBorderSelectedInverse: Color,
    textButtonPrimary: Color,
    textButtonPrimaryDisabled: Color,
    textButtonPrimaryInverse: Color,
    textButtonPrimaryInverseDisabled: Color,
    textButtonPrimaryInverseSelected: Color,
    textButtonSecondary: Color,
    textButtonSecondaryDisabled: Color,
    textButtonSecondarySelected: Color,
    textButtonSecondaryInverse: Color,
    textButtonSecondaryInverseDisabled: Color,
    textButtonSecondaryInverseSelected: Color,
    textLink: Color,
    textLinkInverse: Color,
    textLinkDanger: Color,
    textLinkDangerDisabled: Color,
    textLinkDisabled: Color,
    textLinkSnackbar: Color,
    control: Color,
    controlActive: Color,
    controlError: Color,
    loadingBar: Color,
    loadingBarBackground: Color,
    divider: Color,
    dividerInverse: Color,
    navigationBarDivider: Color,
    badge: Color,
    feedbackErrorBackground: Color,
    feedbackInfoBackground: Color,
    brand: Color,
    brandDark: Color,
    inverse: Color,
    neutralHigh: Color,
    neutralLow: Color,
    neutralMedium: Color,
    promo: Color,
    highlight: Color,
    textPrimary: Color,
    textPrimaryInverse: Color,
    textSecondary: Color,
    textSecondaryInverse: Color,
    textDisabled: Color,
    textAmount: Color,
    error: Color,
    success: Color,
    warning: Color,
    textNavigationBarPrimary: Color,
    textNavigationBarSecondary: Color,
    textAppBar: Color,
    textAppBarSelected: Color,
    gradientBackgroundFirst: Color,
    gradientBackgroundSecond: Color,
    gradientBackgroundThird: Color,
    gradientBackgroundFourth: Color,
    loginLoadingGradientFirst: Color,
    loginLoadingGradientSecond: Color,
    loginLoadingGradientThird: Color,
    loginLoadingGradientFourth: Color,
    isLight: Boolean
) {
    var appBarBackground by mutableStateOf(appBarBackground, structuralEqualityPolicy())
        internal set
    var background by mutableStateOf(background, structuralEqualityPolicy())
        internal set
    var backgroundContainer by mutableStateOf(backgroundContainer, structuralEqualityPolicy())
        internal set
    var backgroundBrand by mutableStateOf(backgroundBrand, structuralEqualityPolicy())
        internal set
    var backgroundOverlay by mutableStateOf(backgroundOverlay, structuralEqualityPolicy())
        internal set
    var backgroundSkeleton by mutableStateOf(backgroundSkeleton, structuralEqualityPolicy())
        internal set
    var backgroundSkeletonInverse by mutableStateOf(backgroundSkeletonInverse, structuralEqualityPolicy())
        internal set
    var navigationBarBackground by mutableStateOf(navigationBarBackground, structuralEqualityPolicy())
        internal set
    var backgroundAlternative by mutableStateOf(backgroundAlternative, structuralEqualityPolicy())
        internal set
    var backgroundFeedbackBottom by mutableStateOf(backgroundFeedbackBottom, structuralEqualityPolicy())
        internal set
    var skeletonWave by mutableStateOf(skeletonWave, structuralEqualityPolicy())
        internal set
    var borderLight by mutableStateOf(borderLight, structuralEqualityPolicy())
        internal set
    var border by mutableStateOf(border, structuralEqualityPolicy())
        internal set
    var borderDark by mutableStateOf(borderDark, structuralEqualityPolicy())
        internal set
    var borderSelected by mutableStateOf(borderSelected, structuralEqualityPolicy())
        internal set
    var buttonDangerBackground by mutableStateOf(buttonDangerBackground, structuralEqualityPolicy())
        internal set
    var buttonDangerBackgroundDisabled by mutableStateOf(buttonDangerBackgroundDisabled, structuralEqualityPolicy())
        internal set
    var buttonDangerBackgroundSelected by mutableStateOf(buttonDangerBackgroundSelected, structuralEqualityPolicy())
        internal set
    var buttonLinkBackgroundSelected by mutableStateOf(buttonLinkBackgroundSelected, structuralEqualityPolicy())
        internal set
    var buttonLinkBackgroundSelectedInverse by mutableStateOf(buttonLinkBackgroundSelectedInverse, structuralEqualityPolicy())
        internal set
    var buttonPrimaryBackground by mutableStateOf(buttonPrimaryBackground, structuralEqualityPolicy())
        internal set
    var buttonPrimaryBackgroundDisabled by mutableStateOf(buttonPrimaryBackgroundDisabled, structuralEqualityPolicy())
        internal set
    var buttonPrimaryBackgroundDisabledInverse by mutableStateOf(buttonPrimaryBackgroundDisabledInverse, structuralEqualityPolicy())
        internal set
    var buttonPrimaryBackgroundInverse by mutableStateOf(buttonPrimaryBackgroundInverse, structuralEqualityPolicy())
        internal set
    var buttonPrimaryBackgroundSelected by mutableStateOf(buttonPrimaryBackgroundSelected, structuralEqualityPolicy())
        internal set
    var buttonPrimaryBackgroundSelectedInverse by mutableStateOf(buttonPrimaryBackgroundSelectedInverse, structuralEqualityPolicy())
        internal set
    var buttonSecondaryBackground by mutableStateOf(buttonSecondaryBackground, structuralEqualityPolicy())
        internal set
    var buttonSecondaryBackgroundDisabled by mutableStateOf(buttonSecondaryBackgroundDisabled, structuralEqualityPolicy())
        internal set
    var buttonSecondaryBackgroundSelected by mutableStateOf(buttonSecondaryBackgroundSelected, structuralEqualityPolicy())
        internal set
    var buttonSecondaryBorderDisabledInverse by mutableStateOf(buttonSecondaryBorderDisabledInverse, structuralEqualityPolicy())
        internal set
    var buttonSecondaryBorderInverse by mutableStateOf(buttonSecondaryBorderInverse, structuralEqualityPolicy())
        internal set
    var buttonSecondaryBorderSelectedInverse by mutableStateOf(buttonSecondaryBorderSelectedInverse, structuralEqualityPolicy())
        internal set
    var textButtonPrimary by mutableStateOf(textButtonPrimary, structuralEqualityPolicy())
        internal set
    var textButtonPrimaryDisabled by mutableStateOf(textButtonPrimaryDisabled, structuralEqualityPolicy())
        internal set
    var textButtonPrimaryInverse by mutableStateOf(textButtonPrimaryInverse, structuralEqualityPolicy())
        internal set
    var textButtonPrimaryInverseDisabled by mutableStateOf(textButtonPrimaryInverseDisabled, structuralEqualityPolicy())
        internal set
    var textButtonPrimaryInverseSelected by mutableStateOf(textButtonPrimaryInverseSelected, structuralEqualityPolicy())
        internal set
    var textButtonSecondary by mutableStateOf(textButtonSecondary, structuralEqualityPolicy())
        internal set
    var textButtonSecondaryDisabled by mutableStateOf(textButtonSecondaryDisabled, structuralEqualityPolicy())
        internal set
    var textButtonSecondarySelected by mutableStateOf(textButtonSecondarySelected, structuralEqualityPolicy())
        internal set
    var textButtonSecondaryInverse by mutableStateOf(textButtonSecondaryInverse, structuralEqualityPolicy())
        internal set
    var textButtonSecondaryInverseDisabled by mutableStateOf(textButtonSecondaryInverseDisabled, structuralEqualityPolicy())
        internal set
    var textButtonSecondaryInverseSelected by mutableStateOf(textButtonSecondaryInverseSelected, structuralEqualityPolicy())
        internal set
    var textLink by mutableStateOf(textLink, structuralEqualityPolicy())
        internal set
    var textLinkInverse by mutableStateOf(textLinkInverse, structuralEqualityPolicy())
        internal set
    var textLinkDanger by mutableStateOf(textLinkDanger, structuralEqualityPolicy())
        internal set
    var textLinkDangerDisabled by mutableStateOf(textLinkDangerDisabled, structuralEqualityPolicy())
        internal set
    var textLinkDisabled by mutableStateOf(textLinkDisabled, structuralEqualityPolicy())
        internal set
    var textLinkSnackbar by mutableStateOf(textLinkSnackbar, structuralEqualityPolicy())
        internal set
    var control by mutableStateOf(control, structuralEqualityPolicy())
        internal set
    var controlActive by mutableStateOf(controlActive, structuralEqualityPolicy())
        internal set
    var controlError by mutableStateOf(controlError, structuralEqualityPolicy())
        internal set
    var loadingBar by mutableStateOf(loadingBar, structuralEqualityPolicy())
        internal set
    var loadingBarBackground by mutableStateOf(loadingBarBackground, structuralEqualityPolicy())
        internal set
    var divider by mutableStateOf(divider, structuralEqualityPolicy())
        internal set
    var dividerInverse by mutableStateOf(dividerInverse, structuralEqualityPolicy())
        internal set
    var navigationBarDivider by mutableStateOf(navigationBarDivider, structuralEqualityPolicy())
        internal set
    var badge by mutableStateOf(badge, structuralEqualityPolicy())
        internal set
    var feedbackErrorBackground by mutableStateOf(feedbackErrorBackground, structuralEqualityPolicy())
        internal set
    var feedbackInfoBackground by mutableStateOf(feedbackInfoBackground, structuralEqualityPolicy())
        internal set
    var brand by mutableStateOf(brand, structuralEqualityPolicy())
        internal set
    var brandDark by mutableStateOf(brandDark, structuralEqualityPolicy())
        internal set
    var inverse by mutableStateOf(inverse, structuralEqualityPolicy())
        internal set
    var neutralHigh by mutableStateOf(neutralHigh, structuralEqualityPolicy())
        internal set
    var neutralLow by mutableStateOf(neutralLow, structuralEqualityPolicy())
        internal set
    var neutralMedium by mutableStateOf(neutralMedium, structuralEqualityPolicy())
        internal set
    var promo by mutableStateOf(promo, structuralEqualityPolicy())
        internal set
    var highlight by mutableStateOf(highlight, structuralEqualityPolicy())
        internal set
    var textPrimary by mutableStateOf(textPrimary, structuralEqualityPolicy())
        internal set
    var textPrimaryInverse by mutableStateOf(textPrimaryInverse, structuralEqualityPolicy())
        internal set
    var textSecondary by mutableStateOf(textSecondary, structuralEqualityPolicy())
        internal set
    var textSecondaryInverse by mutableStateOf(textSecondaryInverse, structuralEqualityPolicy())
        internal set
    var textDisabled by mutableStateOf(textDisabled, structuralEqualityPolicy())
        internal set
    var textAmount by mutableStateOf(textAmount, structuralEqualityPolicy())
        internal set
    var error by mutableStateOf(error, structuralEqualityPolicy())
        internal set
    var success by mutableStateOf(success, structuralEqualityPolicy())
        internal set
    var warning by mutableStateOf(warning, structuralEqualityPolicy())
        internal set
    var textNavigationBarPrimary by mutableStateOf(textNavigationBarPrimary, structuralEqualityPolicy())
        internal set
    var textNavigationBarSecondary by mutableStateOf(textNavigationBarSecondary, structuralEqualityPolicy())
        internal set
    var textAppBar by mutableStateOf(textAppBar, structuralEqualityPolicy())
        internal set
    var textAppBarSelected by mutableStateOf(textAppBarSelected, structuralEqualityPolicy())
        internal set
    var gradientBackgroundFirst by mutableStateOf(gradientBackgroundFirst, structuralEqualityPolicy())
        internal set
    var gradientBackgroundSecond by mutableStateOf(gradientBackgroundSecond, structuralEqualityPolicy())
        internal set
    var gradientBackgroundThird by mutableStateOf(gradientBackgroundThird, structuralEqualityPolicy())
        internal set
    var gradientBackgroundFourth by mutableStateOf(gradientBackgroundFourth, structuralEqualityPolicy())
        internal set
    var loginLoadingGradientFirst by mutableStateOf(loginLoadingGradientFirst, structuralEqualityPolicy())
        internal set
    var loginLoadingGradientSecond by mutableStateOf(loginLoadingGradientSecond, structuralEqualityPolicy())
        internal set
    var loginLoadingGradientThird by mutableStateOf(loginLoadingGradientThird, structuralEqualityPolicy())
        internal set
    var loginLoadingGradientFourth by mutableStateOf(loginLoadingGradientFourth, structuralEqualityPolicy())
        internal set

    var isLight by mutableStateOf(isLight, structuralEqualityPolicy())
        internal set

    fun copy(
        appBarBackground: Color = this.appBarBackground,
        background: Color = this.background,
        backgroundContainer: Color = this.backgroundContainer,
        backgroundBrand: Color = this.backgroundBrand,
        backgroundOverlay: Color = this.backgroundOverlay,
        backgroundSkeleton: Color = this.backgroundSkeleton,
        backgroundSkeletonInverse: Color = this.backgroundSkeletonInverse,
        navigationBarBackground: Color = this.navigationBarBackground,
        backgroundAlternative: Color = this.backgroundAlternative,
        backgroundFeedbackBottom: Color = this.backgroundFeedbackBottom,
        skeletonWave: Color = this.skeletonWave,
        borderLight: Color = this.borderLight,
        border: Color = this.border,
        borderDark: Color = this.borderDark,
        borderSelected: Color = this.borderSelected,
        buttonDangerBackground: Color = this.buttonDangerBackground,
        buttonDangerBackgroundDisabled: Color = this.buttonDangerBackgroundDisabled,
        buttonDangerBackgroundSelected: Color = this.buttonDangerBackgroundSelected,
        buttonLinkBackgroundSelected: Color = this.buttonLinkBackgroundSelected,
        buttonLinkBackgroundSelectedInverse: Color = this.buttonLinkBackgroundSelectedInverse,
        buttonPrimaryBackground: Color = this.buttonPrimaryBackground,
        buttonPrimaryBackgroundDisabled: Color = this.buttonPrimaryBackgroundDisabled,
        buttonPrimaryBackgroundDisabledInverse: Color = this.buttonPrimaryBackgroundDisabledInverse,
        buttonPrimaryBackgroundInverse: Color = this.buttonPrimaryBackgroundInverse,
        buttonPrimaryBackgroundSelected: Color = this.buttonPrimaryBackgroundSelected,
        buttonPrimaryBackgroundSelectedInverse: Color = this.buttonPrimaryBackgroundSelectedInverse,
        buttonSecondaryBackground: Color = this.buttonSecondaryBackground,
        buttonSecondaryBackgroundDisabled: Color = this.buttonSecondaryBackgroundDisabled,
        buttonSecondaryBackgroundSelected: Color = this.buttonSecondaryBackgroundSelected,
        buttonSecondaryBorderDisabledInverse: Color = this.buttonSecondaryBorderDisabledInverse,
        buttonSecondaryBorderInverse: Color = this.buttonSecondaryBorderInverse,
        buttonSecondaryBorderSelectedInverse: Color = this.buttonSecondaryBorderSelectedInverse,
        textButtonPrimary: Color = this.textButtonPrimary,
        textButtonPrimaryDisabled: Color = this.textButtonPrimaryDisabled,
        textButtonPrimaryInverse: Color = this.textButtonPrimaryInverse,
        textButtonPrimaryInverseDisabled: Color = this.textButtonPrimaryInverseDisabled,
        textButtonPrimaryInverseSelected: Color = this.textButtonPrimaryInverseSelected,
        textButtonSecondary: Color = this.textButtonSecondary,
        textButtonSecondaryDisabled: Color = this.textButtonSecondaryDisabled,
        textButtonSecondarySelected: Color = this.textButtonSecondarySelected,
        textButtonSecondaryInverse: Color = this.textButtonSecondaryInverse,
        textButtonSecondaryInverseDisabled: Color = this.textButtonSecondaryInverseDisabled,
        textButtonSecondaryInverseSelected: Color = this.textButtonSecondaryInverseSelected,
        textLink: Color = this.textLink,
        textLinkInverse: Color = this.textLinkInverse,
        textLinkDanger: Color = this.textLinkDanger,
        textLinkDangerDisabled: Color = this.textLinkDangerDisabled,
        textLinkDisabled: Color = this.textLinkDisabled,
        textLinkSnackbar: Color = this.textLinkSnackbar,
        control: Color = this.control,
        controlActive: Color = this.controlActive,
        controlError: Color = this.controlError,
        loadingBar: Color = this.loadingBar,
        loadingBarBackground: Color = this.loadingBarBackground,
        divider: Color = this.divider,
        dividerInverse: Color = this.dividerInverse,
        navigationBarDivider: Color = this.navigationBarDivider,
        badge: Color = this.badge,
        feedbackErrorBackground: Color = this.feedbackErrorBackground,
        feedbackInfoBackground: Color = this.feedbackInfoBackground,
        brand: Color = this.brand,
        brandDark: Color = this.brandDark,
        inverse: Color = this.inverse,
        neutralHigh: Color = this.neutralHigh,
        neutralLow: Color = this.neutralLow,
        neutralMedium: Color = this.neutralMedium,
        promo: Color = this.promo,
        highlight: Color = this.highlight,
        textPrimary: Color = this.textPrimary,
        textPrimaryInverse: Color = this.textPrimaryInverse,
        textSecondary: Color = this.textSecondary,
        textSecondaryInverse: Color = this.textSecondaryInverse,
        textDisabled: Color = this.textDisabled,
        textAmount: Color = this.textAmount,
        error: Color = this.error,
        success: Color = this.success,
        warning: Color = this.warning,
        textNavigationBarPrimary: Color = this.textNavigationBarPrimary,
        textNavigationBarSecondary: Color = this.textNavigationBarSecondary,
        textAppBar: Color = this.textAppBar,
        textAppBarSelected: Color = this.textAppBarSelected,
        gradientBackgroundFirst: Color = this.gradientBackgroundFirst,
        gradientBackgroundSecond: Color = this.gradientBackgroundSecond,
        gradientBackgroundThird: Color = this.gradientBackgroundThird,
        gradientBackgroundFourth: Color = this.gradientBackgroundFourth,
        loginLoadingGradientFirst: Color = this.loginLoadingGradientFirst,
        loginLoadingGradientSecond: Color = this.loginLoadingGradientSecond,
        loginLoadingGradientThird: Color = this.loginLoadingGradientThird,
        loginLoadingGradientFourth: Color = this.loginLoadingGradientFourth,
        isLight: Boolean = this.isLight,
    ): MisticaColors = MisticaColors(
        appBarBackground,
        background,
        backgroundContainer,
        backgroundBrand,
        backgroundOverlay,
        backgroundSkeleton,
        backgroundSkeletonInverse,
        navigationBarBackground,
        backgroundAlternative,
        backgroundFeedbackBottom,
        skeletonWave,
        borderLight,
        border,
        borderDark,
        borderSelected,
        buttonDangerBackground,
        buttonDangerBackgroundDisabled,
        buttonDangerBackgroundSelected,
        buttonLinkBackgroundSelected,
        buttonLinkBackgroundSelectedInverse,
        buttonPrimaryBackground,
        buttonPrimaryBackgroundDisabled,
        buttonPrimaryBackgroundDisabledInverse,
        buttonPrimaryBackgroundInverse,
        buttonPrimaryBackgroundSelected,
        buttonPrimaryBackgroundSelectedInverse,
        buttonSecondaryBackground,
        buttonSecondaryBackgroundDisabled,
        buttonSecondaryBackgroundSelected,
        buttonSecondaryBorderDisabledInverse,
        buttonSecondaryBorderInverse,
        buttonSecondaryBorderSelectedInverse,
        textButtonPrimary,
        textButtonPrimaryDisabled,
        textButtonPrimaryInverse,
        textButtonPrimaryInverseDisabled,
        textButtonPrimaryInverseSelected,
        textButtonSecondary,
        textButtonSecondaryDisabled,
        textButtonSecondarySelected,
        textButtonSecondaryInverse,
        textButtonSecondaryInverseDisabled,
        textButtonSecondaryInverseSelected,
        textLink,
        textLinkInverse,
        textLinkDanger,
        textLinkDangerDisabled,
        textLinkDisabled,
        textLinkSnackbar,
        control,
        controlActive,
        controlError,
        loadingBar,
        loadingBarBackground,
        divider,
        dividerInverse,
        navigationBarDivider,
        badge,
        feedbackErrorBackground,
        feedbackInfoBackground,
        brand,
        brandDark,
        inverse,
        neutralHigh,
        neutralLow,
        neutralMedium,
        promo,
        highlight,
        textPrimary,
        textPrimaryInverse,
        textSecondary,
        textSecondaryInverse,
        textDisabled,
        textAmount,
        error,
        success,
        warning,
        textNavigationBarPrimary,
        textNavigationBarSecondary,
        textAppBar,
        textAppBarSelected,
        gradientBackgroundFirst,
        gradientBackgroundSecond,
        gradientBackgroundThird,
        gradientBackgroundFourth,
        loginLoadingGradientFirst,
        loginLoadingGradientSecond,
        loginLoadingGradientThird,
        loginLoadingGradientFourth,
        isLight,
    )
}

internal val LocalMisticaColors: ProvidableCompositionLocal<MisticaColors> = null!! //TODO dpastor
