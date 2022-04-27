package com.telefonica.mistica.compose.theme.color

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.graphics.Color
class MisticaColors(
    appBarBackground: Color = Color.Unspecified,
    background: Color = Color.Unspecified,
    backgroundAlternative: Color = Color.Unspecified,
    backgroundBrand: Color = Color.Unspecified,
    backgroundContainer: Color = Color.Unspecified,
    backgroundFeedbackBottom: Color = Color.Unspecified,
    backgroundOverlay: Color = Color.Unspecified,
    backgroundSkeleton: Color = Color.Unspecified,
    backgroundSkeletonInverse: Color = Color.Unspecified,
    badge: Color = Color.Unspecified,
    border: Color = Color.Unspecified,
    borderDark: Color = Color.Unspecified,
    borderLight: Color = Color.Unspecified,
    borderSelected: Color = Color.Unspecified,
    brand: Color = Color.Unspecified,
    brandDark: Color = Color.Unspecified,
    buttonDangerBackground: Color = Color.Unspecified,
    buttonDangerBackgroundDisabled: Color = Color.Unspecified,
    buttonDangerBackgroundSelected: Color = Color.Unspecified,
    buttonLinkBackgroundSelected: Color = Color.Unspecified,
    buttonLinkBackgroundSelectedInverse: Color = Color.Unspecified,
    buttonPrimaryBackground: Color = Color.Unspecified,
    buttonPrimaryBackgroundDisabled: Color = Color.Unspecified,
    buttonPrimaryBackgroundDisabledInverse: Color = Color.Unspecified,
    buttonPrimaryBackgroundInverse: Color = Color.Unspecified,
    buttonPrimaryBackgroundSelected: Color = Color.Unspecified,
    buttonPrimaryBackgroundSelectedInverse: Color = Color.Unspecified,
    buttonSecondaryBackground: Color = Color.Unspecified,
    buttonSecondaryBackgroundDisabled: Color = Color.Unspecified,
    buttonSecondaryBackgroundSelected: Color = Color.Unspecified,
    buttonSecondaryBorderDisabledInverse: Color = Color.Unspecified,
    buttonSecondaryBorderInverse: Color = Color.Unspecified,
    buttonSecondaryBorderSelectedInverse: Color = Color.Unspecified,
    carouselIndicatorActiveColor: Color = Color.Unspecified,
    carouselIndicatorInactiveColor: Color = Color.Unspecified,
    control: Color = Color.Unspecified,
    controlActive: Color = Color.Unspecified,
    controlError: Color = Color.Unspecified,
    divider: Color = Color.Unspecified,
    dividerInverse: Color = Color.Unspecified,
    error: Color = Color.Unspecified,
    feedbackErrorBackground: Color = Color.Unspecified,
    feedbackInfoBackground: Color = Color.Unspecified,
    gradientBackgroundFirst: Color = Color.Unspecified,
    gradientBackgroundFourth: Color = Color.Unspecified,
    gradientBackgroundSecond: Color = Color.Unspecified,
    gradientBackgroundThird: Color = Color.Unspecified,
    highlight: Color = Color.Unspecified,
    inverse: Color = Color.Unspecified,
    loadingBar: Color = Color.Unspecified,
    loadingBarBackground: Color = Color.Unspecified,
    loginLoadingGradientFirst: Color = Color.Unspecified,
    loginLoadingGradientFourth: Color = Color.Unspecified,
    loginLoadingGradientSecond: Color = Color.Unspecified,
    loginLoadingGradientThird: Color = Color.Unspecified,
    navigationBarBackground: Color = Color.Unspecified,
    navigationBarDivider: Color = Color.Unspecified,
    neutralHigh: Color = Color.Unspecified,
    neutralLow: Color = Color.Unspecified,
    neutralMedium: Color = Color.Unspecified,
    promo: Color = Color.Unspecified,
    skeletonWave: Color = Color.Unspecified,
    success: Color = Color.Unspecified,
    tagBackgroundActive: Color = Color.Unspecified,
    tagBackgroundError: Color = Color.Unspecified,
    tagBackgroundInactive: Color = Color.Unspecified,
    tagBackgroundPromo: Color = Color.Unspecified,
    tagBackgroundSuccess: Color = Color.Unspecified,
    tagBackgroundWarning: Color = Color.Unspecified,
    textAppBar: Color = Color.Unspecified,
    textAppBarSelected: Color = Color.Unspecified,
    textButtonPrimary: Color = Color.Unspecified,
    textButtonPrimaryDisabled: Color = Color.Unspecified,
    textButtonPrimaryInverse: Color = Color.Unspecified,
    textButtonPrimaryInverseDisabled: Color = Color.Unspecified,
    textButtonPrimaryInverseSelected: Color = Color.Unspecified,
    textButtonSecondary: Color = Color.Unspecified,
    textButtonSecondaryDisabled: Color = Color.Unspecified,
    textButtonSecondaryInverse: Color = Color.Unspecified,
    textButtonSecondaryInverseDisabled: Color = Color.Unspecified,
    textButtonSecondaryInverseSelected: Color = Color.Unspecified,
    textButtonSecondarySelected: Color = Color.Unspecified,
    textDisabled: Color = Color.Unspecified,
    textLink: Color = Color.Unspecified,
    textLinkDanger: Color = Color.Unspecified,
    textLinkDangerDisabled: Color = Color.Unspecified,
    textLinkDisabled: Color = Color.Unspecified,
    textLinkInverse: Color = Color.Unspecified,
    textLinkSnackbar: Color = Color.Unspecified,
    textNavigationBarPrimary: Color = Color.Unspecified,
    textNavigationBarSecondary: Color = Color.Unspecified,
    textPrimary: Color = Color.Unspecified,
    textPrimaryInverse: Color = Color.Unspecified,
    textSecondary: Color = Color.Unspecified,
    textSecondaryInverse: Color = Color.Unspecified,
    textTagActive: Color = Color.Unspecified,
    textTagError: Color = Color.Unspecified,
    textTagInactive: Color = Color.Unspecified,
    textTagPromo: Color = Color.Unspecified,
    textTagSuccess: Color = Color.Unspecified,
    textTagWarning: Color = Color.Unspecified,
    warning: Color = Color.Unspecified,
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
    var tagBackgroundSuccess by mutableStateOf(tagBackgroundSuccess, structuralEqualityPolicy())
        internal set
    var tagBackgroundWarning by mutableStateOf(tagBackgroundWarning, structuralEqualityPolicy())
        internal set
    var tagBackgroundError by mutableStateOf(tagBackgroundError, structuralEqualityPolicy())
        internal set
    var tagBackgroundPromo by mutableStateOf(tagBackgroundPromo, structuralEqualityPolicy())
        internal set
    var tagBackgroundActive by mutableStateOf(tagBackgroundActive, structuralEqualityPolicy())
        internal set
    var tagBackgroundInactive by mutableStateOf(tagBackgroundInactive, structuralEqualityPolicy())
        internal set
    var textTagSuccess by mutableStateOf(textTagSuccess, structuralEqualityPolicy())
        internal set
    var textTagWarning by mutableStateOf(textTagWarning, structuralEqualityPolicy())
        internal set
    var textTagError by mutableStateOf(textTagError, structuralEqualityPolicy())
        internal set
    var textTagPromo by mutableStateOf(textTagPromo, structuralEqualityPolicy())
        internal set
    var textTagActive by mutableStateOf(textTagActive, structuralEqualityPolicy())
        internal set
    var textTagInactive by mutableStateOf(textTagInactive, structuralEqualityPolicy())
        internal set
    var carouselIndicatorActiveColor by mutableStateOf(carouselIndicatorActiveColor, structuralEqualityPolicy())
        internal set
    var carouselIndicatorInactiveColor by mutableStateOf(carouselIndicatorInactiveColor, structuralEqualityPolicy())
        internal set

    fun copy(
        appBarBackground: Color = this.appBarBackground,
        background: Color = this.background,
        backgroundAlternative: Color = this.backgroundAlternative,
        backgroundBrand: Color = this.backgroundBrand,
        backgroundContainer: Color = this.backgroundContainer,
        backgroundFeedbackBottom: Color = this.backgroundFeedbackBottom,
        backgroundOverlay: Color = this.backgroundOverlay,
        backgroundSkeleton: Color = this.backgroundSkeleton,
        backgroundSkeletonInverse: Color = this.backgroundSkeletonInverse,
        badge: Color = this.badge,
        border: Color = this.border,
        borderDark: Color = this.borderDark,
        borderLight: Color = this.borderLight,
        borderSelected: Color = this.borderSelected,
        brand: Color = this.brand,
        brandDark: Color = this.brandDark,
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
        carouselIndicatorActiveColor: Color = this.carouselIndicatorActiveColor,
        carouselIndicatorInactiveColor: Color = this.carouselIndicatorInactiveColor,
        control: Color = this.control,
        controlActive: Color = this.controlActive,
        controlError: Color = this.controlError,
        divider: Color = this.divider,
        dividerInverse: Color = this.dividerInverse,
        error: Color = this.error,
        feedbackErrorBackground: Color = this.feedbackErrorBackground,
        feedbackInfoBackground: Color = this.feedbackInfoBackground,
        gradientBackgroundFirst: Color = this.gradientBackgroundFirst,
        gradientBackgroundFourth: Color = this.gradientBackgroundFourth,
        gradientBackgroundSecond: Color = this.gradientBackgroundSecond,
        gradientBackgroundThird: Color = this.gradientBackgroundThird,
        highlight: Color = this.highlight,
        inverse: Color = this.inverse,
        loadingBar: Color = this.loadingBar,
        loadingBarBackground: Color = this.loadingBarBackground,
        loginLoadingGradientFirst: Color = this.loginLoadingGradientFirst,
        loginLoadingGradientFourth: Color = this.loginLoadingGradientFourth,
        loginLoadingGradientSecond: Color = this.loginLoadingGradientSecond,
        loginLoadingGradientThird: Color = this.loginLoadingGradientThird,
        navigationBarBackground: Color = this.navigationBarBackground,
        navigationBarDivider: Color = this.navigationBarDivider,
        neutralHigh: Color = this.neutralHigh,
        neutralLow: Color = this.neutralLow,
        neutralMedium: Color = this.neutralMedium,
        promo: Color = this.promo,
        skeletonWave: Color = this.skeletonWave,
        success: Color = this.success,
        tagBackgroundActive: Color = this.tagBackgroundActive,
        tagBackgroundError: Color = this.tagBackgroundError,
        tagBackgroundInactive: Color = this.tagBackgroundInactive,
        tagBackgroundPromo: Color = this.tagBackgroundPromo,
        tagBackgroundSuccess: Color = this.tagBackgroundSuccess,
        tagBackgroundWarning: Color = this.tagBackgroundWarning,
        textAppBar: Color = this.textAppBar,
        textAppBarSelected: Color = this.textAppBarSelected,
        textButtonPrimary: Color = this.textButtonPrimary,
        textButtonPrimaryDisabled: Color = this.textButtonPrimaryDisabled,
        textButtonPrimaryInverse: Color = this.textButtonPrimaryInverse,
        textButtonPrimaryInverseDisabled: Color = this.textButtonPrimaryInverseDisabled,
        textButtonPrimaryInverseSelected: Color = this.textButtonPrimaryInverseSelected,
        textButtonSecondary: Color = this.textButtonSecondary,
        textButtonSecondaryDisabled: Color = this.textButtonSecondaryDisabled,
        textButtonSecondaryInverse: Color = this.textButtonSecondaryInverse,
        textButtonSecondaryInverseDisabled: Color = this.textButtonSecondaryInverseDisabled,
        textButtonSecondaryInverseSelected: Color = this.textButtonSecondaryInverseSelected,
        textButtonSecondarySelected: Color = this.textButtonSecondarySelected,
        textDisabled: Color = this.textDisabled,
        textLink: Color = this.textLink,
        textLinkDanger: Color = this.textLinkDanger,
        textLinkDangerDisabled: Color = this.textLinkDangerDisabled,
        textLinkDisabled: Color = this.textLinkDisabled,
        textLinkInverse: Color = this.textLinkInverse,
        textLinkSnackbar: Color = this.textLinkSnackbar,
        textNavigationBarPrimary: Color = this.textNavigationBarPrimary,
        textNavigationBarSecondary: Color = this.textNavigationBarSecondary,
        textPrimary: Color = this.textPrimary,
        textPrimaryInverse: Color = this.textPrimaryInverse,
        textSecondary: Color = this.textSecondary,
        textSecondaryInverse: Color = this.textSecondaryInverse,
        textTagActive: Color = this.textTagActive,
        textTagError: Color = this.textTagError,
        textTagInactive: Color = this.textTagInactive,
        textTagPromo: Color = this.textTagPromo,
        textTagSuccess: Color = this.textTagSuccess,
        textTagWarning: Color = this.textTagWarning,
        warning: Color = this.warning,
    ): MisticaColors = MisticaColors(
        appBarBackground = appBarBackground,
        background = background,
        backgroundAlternative = backgroundAlternative,
        backgroundBrand = backgroundBrand,
        backgroundContainer = backgroundContainer,
        backgroundFeedbackBottom = backgroundFeedbackBottom,
        backgroundOverlay = backgroundOverlay,
        backgroundSkeleton = backgroundSkeleton,
        backgroundSkeletonInverse = backgroundSkeletonInverse,
        badge = badge,
        border = border,
        borderDark = borderDark,
        borderLight = borderLight,
        borderSelected = borderSelected,
        brand = brand,
        brandDark = brandDark,
        buttonDangerBackground = buttonDangerBackground,
        buttonDangerBackgroundDisabled = buttonDangerBackgroundDisabled,
        buttonDangerBackgroundSelected = buttonDangerBackgroundSelected,
        buttonLinkBackgroundSelected = buttonLinkBackgroundSelected,
        buttonLinkBackgroundSelectedInverse = buttonLinkBackgroundSelectedInverse,
        buttonPrimaryBackground = buttonPrimaryBackground,
        buttonPrimaryBackgroundDisabled = buttonPrimaryBackgroundDisabled,
        buttonPrimaryBackgroundDisabledInverse = buttonPrimaryBackgroundDisabledInverse,
        buttonPrimaryBackgroundInverse = buttonPrimaryBackgroundInverse,
        buttonPrimaryBackgroundSelected = buttonPrimaryBackgroundSelected,
        buttonPrimaryBackgroundSelectedInverse = buttonPrimaryBackgroundSelectedInverse,
        buttonSecondaryBackground = buttonSecondaryBackground,
        buttonSecondaryBackgroundDisabled = buttonSecondaryBackgroundDisabled,
        buttonSecondaryBackgroundSelected = buttonSecondaryBackgroundSelected,
        buttonSecondaryBorderDisabledInverse = buttonSecondaryBorderDisabledInverse,
        buttonSecondaryBorderInverse = buttonSecondaryBorderInverse,
        buttonSecondaryBorderSelectedInverse = buttonSecondaryBorderSelectedInverse,
        carouselIndicatorActiveColor = carouselIndicatorActiveColor,
        carouselIndicatorInactiveColor = carouselIndicatorInactiveColor,
        control = control,
        controlActive = controlActive,
        controlError = controlError,
        divider = divider,
        dividerInverse = dividerInverse,
        error = error,
        feedbackErrorBackground = feedbackErrorBackground,
        feedbackInfoBackground = feedbackInfoBackground,
        gradientBackgroundFirst = gradientBackgroundFirst,
        gradientBackgroundFourth = gradientBackgroundFourth,
        gradientBackgroundSecond = gradientBackgroundSecond,
        gradientBackgroundThird = gradientBackgroundThird,
        highlight = highlight,
        inverse = inverse,
        loadingBar = loadingBar,
        loadingBarBackground = loadingBarBackground,
        loginLoadingGradientFirst = loginLoadingGradientFirst,
        loginLoadingGradientFourth = loginLoadingGradientFourth,
        loginLoadingGradientSecond = loginLoadingGradientSecond,
        loginLoadingGradientThird = loginLoadingGradientThird,
        navigationBarBackground = navigationBarBackground,
        navigationBarDivider = navigationBarDivider,
        neutralHigh = neutralHigh,
        neutralLow = neutralLow,
        neutralMedium = neutralMedium,
        promo = promo,
        skeletonWave = skeletonWave,
        success = success,
        tagBackgroundActive = tagBackgroundActive,
        tagBackgroundError = tagBackgroundError,
        tagBackgroundInactive = tagBackgroundInactive,
        tagBackgroundPromo = tagBackgroundPromo,
        tagBackgroundSuccess = tagBackgroundSuccess,
        tagBackgroundWarning = tagBackgroundWarning,
        textAppBar = textAppBar,
        textAppBarSelected = textAppBarSelected,
        textButtonPrimary = textButtonPrimary,
        textButtonPrimaryDisabled = textButtonPrimaryDisabled,
        textButtonPrimaryInverse = textButtonPrimaryInverse,
        textButtonPrimaryInverseDisabled = textButtonPrimaryInverseDisabled,
        textButtonPrimaryInverseSelected = textButtonPrimaryInverseSelected,
        textButtonSecondary = textButtonSecondary,
        textButtonSecondaryDisabled = textButtonSecondaryDisabled,
        textButtonSecondaryInverse = textButtonSecondaryInverse,
        textButtonSecondaryInverseDisabled = textButtonSecondaryInverseDisabled,
        textButtonSecondaryInverseSelected = textButtonSecondaryInverseSelected,
        textButtonSecondarySelected = textButtonSecondarySelected,
        textDisabled = textDisabled,
        textLink = textLink,
        textLinkDanger = textLinkDanger,
        textLinkDangerDisabled = textLinkDangerDisabled,
        textLinkDisabled = textLinkDisabled,
        textLinkInverse = textLinkInverse,
        textLinkSnackbar = textLinkSnackbar,
        textNavigationBarPrimary = textNavigationBarPrimary,
        textNavigationBarSecondary = textNavigationBarSecondary,
        textPrimary = textPrimary,
        textPrimaryInverse = textPrimaryInverse,
        textSecondary = textSecondary,
        textSecondaryInverse = textSecondaryInverse,
        textTagActive = textTagActive,
        textTagError = textTagError,
        textTagInactive = textTagInactive,
        textTagPromo = textTagPromo,
        textTagSuccess = textTagSuccess,
        textTagWarning = textTagWarning,
        warning = warning,
    )

    internal fun MisticaColors.updateColorsFrom(other: MisticaColors) {
        appBarBackground = other.appBarBackground
        background = other.background
        backgroundAlternative = other.backgroundAlternative
        backgroundBrand = other.backgroundBrand
        backgroundContainer = other.backgroundContainer
        backgroundFeedbackBottom = other.backgroundFeedbackBottom
        backgroundOverlay = other.backgroundOverlay
        backgroundSkeleton = other.backgroundSkeleton
        backgroundSkeletonInverse = other.backgroundSkeletonInverse
        badge = other.badge
        border = other.border
        borderDark = other.borderDark
        borderLight = other.borderLight
        borderSelected = other.borderSelected
        brand = other.brand
        brandDark = other.brandDark
        buttonDangerBackground = other.buttonDangerBackground
        buttonDangerBackgroundDisabled = other.buttonDangerBackgroundDisabled
        buttonDangerBackgroundSelected = other.buttonDangerBackgroundSelected
        buttonLinkBackgroundSelected = other.buttonLinkBackgroundSelected
        buttonLinkBackgroundSelectedInverse = other.buttonLinkBackgroundSelectedInverse
        buttonPrimaryBackground = other.buttonPrimaryBackground
        buttonPrimaryBackgroundDisabled = other.buttonPrimaryBackgroundDisabled
        buttonPrimaryBackgroundDisabledInverse = other.buttonPrimaryBackgroundDisabledInverse
        buttonPrimaryBackgroundInverse = other.buttonPrimaryBackgroundInverse
        buttonPrimaryBackgroundSelected = other.buttonPrimaryBackgroundSelected
        buttonPrimaryBackgroundSelectedInverse = other.buttonPrimaryBackgroundSelectedInverse
        buttonSecondaryBackground = other.buttonSecondaryBackground
        buttonSecondaryBackgroundDisabled = other.buttonSecondaryBackgroundDisabled
        buttonSecondaryBackgroundSelected = other.buttonSecondaryBackgroundSelected
        buttonSecondaryBorderDisabledInverse = other.buttonSecondaryBorderDisabledInverse
        buttonSecondaryBorderInverse = other.buttonSecondaryBorderInverse
        buttonSecondaryBorderSelectedInverse = other.buttonSecondaryBorderSelectedInverse
        carouselIndicatorActiveColor = other.carouselIndicatorActiveColor
        carouselIndicatorInactiveColor = other.carouselIndicatorInactiveColor
        control = other.control
        controlActive = other.controlActive
        controlError = other.controlError
        divider = other.divider
        dividerInverse = other.dividerInverse
        error = other.error
        feedbackErrorBackground = other.feedbackErrorBackground
        feedbackInfoBackground = other.feedbackInfoBackground
        gradientBackgroundFirst = other.gradientBackgroundFirst
        gradientBackgroundFourth = other.gradientBackgroundFourth
        gradientBackgroundSecond = other.gradientBackgroundSecond
        gradientBackgroundThird = other.gradientBackgroundThird
        highlight = other.highlight
        inverse = other.inverse
        loadingBar = other.loadingBar
        loadingBarBackground = other.loadingBarBackground
        loginLoadingGradientFirst = other.loginLoadingGradientFirst
        loginLoadingGradientFourth = other.loginLoadingGradientFourth
        loginLoadingGradientSecond = other.loginLoadingGradientSecond
        loginLoadingGradientThird = other.loginLoadingGradientThird
        navigationBarBackground = other.navigationBarBackground
        navigationBarDivider = other.navigationBarDivider
        neutralHigh = other.neutralHigh
        neutralLow = other.neutralLow
        neutralMedium = other.neutralMedium
        promo = other.promo
        skeletonWave = other.skeletonWave
        success = other.success
        tagBackgroundActive = other.tagBackgroundActive
        tagBackgroundError = other.tagBackgroundError
        tagBackgroundInactive = other.tagBackgroundInactive
        tagBackgroundPromo = other.tagBackgroundPromo
        tagBackgroundSuccess = other.tagBackgroundSuccess
        tagBackgroundWarning = other.tagBackgroundWarning
        textAppBar = other.textAppBar
        textAppBarSelected = other.textAppBarSelected
        textButtonPrimary = other.textButtonPrimary
        textButtonPrimaryDisabled = other.textButtonPrimaryDisabled
        textButtonPrimaryInverse = other.textButtonPrimaryInverse
        textButtonPrimaryInverseDisabled = other.textButtonPrimaryInverseDisabled
        textButtonPrimaryInverseSelected = other.textButtonPrimaryInverseSelected
        textButtonSecondary = other.textButtonSecondary
        textButtonSecondaryDisabled = other.textButtonSecondaryDisabled
        textButtonSecondaryInverse = other.textButtonSecondaryInverse
        textButtonSecondaryInverseDisabled = other.textButtonSecondaryInverseDisabled
        textButtonSecondaryInverseSelected = other.textButtonSecondaryInverseSelected
        textButtonSecondarySelected = other.textButtonSecondarySelected
        textDisabled = other.textDisabled
        textLink = other.textLink
        textLinkDanger = other.textLinkDanger
        textLinkDangerDisabled = other.textLinkDangerDisabled
        textLinkDisabled = other.textLinkDisabled
        textLinkInverse = other.textLinkInverse
        textLinkSnackbar = other.textLinkSnackbar
        textNavigationBarPrimary = other.textNavigationBarPrimary
        textNavigationBarSecondary = other.textNavigationBarSecondary
        textPrimary = other.textPrimary
        textPrimaryInverse = other.textPrimaryInverse
        textSecondary = other.textSecondary
        textSecondaryInverse = other.textSecondaryInverse
        textTagActive = other.textTagActive
        textTagError = other.textTagError
        textTagInactive = other.textTagInactive
        textTagPromo = other.textTagPromo
        textTagSuccess = other.textTagSuccess
        textTagWarning = other.textTagWarning
        warning = other.warning
    }
}

internal val LocalMisticaColors = staticCompositionLocalOf { MisticaColors() }
