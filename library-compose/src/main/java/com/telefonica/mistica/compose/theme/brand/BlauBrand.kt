package com.telefonica.mistica.compose.theme.brand

import androidx.compose.ui.graphics.Color
import com.telefonica.mistica.R
import com.telefonica.mistica.compose.theme.color.MisticaColors

object BlauBrand : Brand {

    override val compatibilityTheme: Int
        get() = R.style.MisticaTheme_Blau

    override val lightColors = MisticaColors(
        appBarBackground = BlauPaletteColor.blau_color_white,
        background = BlauPaletteColor.blau_color_white,
        backgroundAlternative = BlauPaletteColor.blau_color_blue_primary20,
        backgroundBrand = BlauPaletteColor.blau_color_blue_primary,
        backgroundContainer = BlauPaletteColor.blau_color_white,
        backgroundFeedbackBottom = BlauPaletteColor.blau_color_blue_primary,
        backgroundOverlay = BlauPaletteColor.blau_color_blue_secondary_75_alpha,
        backgroundSkeleton = BlauPaletteColor.blau_color_grey_2,
        backgroundSkeletonInverse = BlauPaletteColor.blau_color_white,
        badge = BlauPaletteColor.blau_color_red,
        border = BlauPaletteColor.blau_color_grey_2,
        borderDark = BlauPaletteColor.blau_color_grey_5,
        borderLight = BlauPaletteColor.blau_color_grey_1,
        borderSelected = BlauPaletteColor.blau_color_blue_secondary60,
        brand = BlauPaletteColor.blau_color_blue_primary,
        brandHigh = BlauPaletteColor.blau_color_blue_secondary,
        buttonDangerBackground = BlauPaletteColor.blau_color_red,
        buttonDangerBackgroundDisabled = BlauPaletteColor.blau_color_red_20,
        buttonDangerBackgroundSelected = BlauPaletteColor.blau_color_red_70,
        buttonLinkBackgroundSelected = BlauPaletteColor.blau_color_purple_10,
        buttonLinkBackgroundSelectedInverse = BlauPaletteColor.blau_color_white_30_alpha,
        buttonPrimaryBackground = BlauPaletteColor.blau_color_blue_secondary,
        buttonPrimaryBackgroundDisabled = BlauPaletteColor.blau_color_blue_secondary20,
        buttonPrimaryBackgroundDisabledInverse = BlauPaletteColor.blau_color_blue_primary30,
        buttonPrimaryBackgroundInverse = BlauPaletteColor.blau_color_white,
        buttonPrimaryBackgroundSelected = BlauPaletteColor.blau_color_blue_secondary60,
        buttonPrimaryBackgroundSelectedInverse = BlauPaletteColor.blau_color_blue_primary30,
        buttonSecondaryBackground = BlauPaletteColor.blau_color_blue_secondary,
        buttonSecondaryBackgroundDisabled = BlauPaletteColor.blau_color_blue_secondary20,
        buttonSecondaryBackgroundSelected = BlauPaletteColor.blau_color_blue_secondary60,
        buttonSecondaryBorderDisabledInverse = BlauPaletteColor.blau_color_blue_secondary20,
        buttonSecondaryBorderInverse = BlauPaletteColor.blau_color_white,
        buttonSecondaryBorderSelectedInverse = BlauPaletteColor.blau_color_blue_primary30,
        carouselIndicatorActiveColor = BlauPaletteColor.blau_color_blue_secondary,
        carouselIndicatorInactiveColor = BlauPaletteColor.blau_color_grey_2,
        control = BlauPaletteColor.blau_color_grey_2,
        controlActive = BlauPaletteColor.blau_color_blue_secondary,
        controlError = BlauPaletteColor.blau_color_red,
        divider = BlauPaletteColor.blau_color_grey_2,
        dividerInverse = BlauPaletteColor.blau_color_white_20_alpha,
        error = BlauPaletteColor.blau_color_red,
        feedbackErrorBackground = BlauPaletteColor.blau_color_red,
        feedbackInfoBackground = BlauPaletteColor.blau_color_grey_6,
        gradientBackgroundFirst = BlauPaletteColor.blau_color_blue_primary,
        gradientBackgroundFourth = BlauPaletteColor.blau_color_blue_primary,
        gradientBackgroundSecond = BlauPaletteColor.blau_color_blue_primary,
        gradientBackgroundThird = BlauPaletteColor.blau_color_blue_primary,
        highlight = BlauPaletteColor.blau_color_blue_primary,
        inverse = BlauPaletteColor.blau_color_white,
        loadingBar = BlauPaletteColor.blau_color_blue_secondary,
        loadingBarBackground = BlauPaletteColor.blau_color_blue_secondary10,
        loginLoadingGradientFirst = BlauPaletteColor.blau_color_blue_primary,
        loginLoadingGradientFourth = BlauPaletteColor.blau_color_blue_primary,
        loginLoadingGradientSecond = BlauPaletteColor.blau_color_blue_primary,
        loginLoadingGradientThird = BlauPaletteColor.blau_color_blue_primary,
        navigationBarBackground = BlauPaletteColor.blau_color_blue_primary,
        navigationBarDivider = BlauPaletteColor.blau_color_blue_primary,
        neutralHigh = BlauPaletteColor.blau_color_grey_6,
        neutralLow = BlauPaletteColor.blau_color_grey_2,
        neutralMedium = BlauPaletteColor.blau_color_grey_5,
        promo = BlauPaletteColor.blau_color_purple,
        skeletonWave = BlauPaletteColor.blau_color_grey_2,
        success = BlauPaletteColor.blau_color_green,
        brandLow = BlauPaletteColor.blau_color_blue_secondary10,
        errorLow = BlauPaletteColor.blau_color_red_10,
        promoLow = BlauPaletteColor.blau_color_purple_10,
        successLow = BlauPaletteColor.blau_color_green_10,
        warningLow = BlauPaletteColor.blau_color_yellow_10,
        textAppBar = BlauPaletteColor.blau_color_grey_5,
        textAppBarSelected = BlauPaletteColor.blau_color_blue_secondary60,
        textButtonPrimary = BlauPaletteColor.blau_color_white,
        textButtonPrimaryDisabled = BlauPaletteColor.blau_color_white,
        textButtonPrimaryInverse = BlauPaletteColor.blau_color_blue_secondary,
        textButtonPrimaryInverseDisabled = BlauPaletteColor.blau_color_blue_primary10,
        textButtonPrimaryInverseSelected = BlauPaletteColor.blau_color_blue_secondary60,
        textButtonSecondary = BlauPaletteColor.blau_color_blue_secondary,
        textButtonSecondaryDisabled = BlauPaletteColor.blau_color_blue_secondary20,
        textButtonSecondaryInverse = BlauPaletteColor.blau_color_white,
        textButtonSecondaryInverseDisabled = BlauPaletteColor.blau_color_blue_secondary20,
        textButtonSecondaryInverseSelected = BlauPaletteColor.blau_color_white,
        textButtonSecondarySelected = BlauPaletteColor.blau_color_blue_secondary60,
        textDisabled = BlauPaletteColor.blau_color_grey_3,
        textLink = BlauPaletteColor.blau_color_purple,
        textLinkDanger = BlauPaletteColor.blau_color_red,
        textLinkDangerDisabled = BlauPaletteColor.blau_color_red_20,
        textLinkDisabled = BlauPaletteColor.blau_color_purple_30,
        textLinkInverse = BlauPaletteColor.blau_color_white,
        textLinkSnackbar = BlauPaletteColor.blau_color_purple_30,
        textNavigationBarPrimary = BlauPaletteColor.blau_color_white,
        textNavigationBarSecondary = BlauPaletteColor.blau_color_blue_secondary20,
        textPrimary = BlauPaletteColor.blau_color_grey_6,
        textPrimaryInverse = BlauPaletteColor.blau_color_white,
        textSecondary = BlauPaletteColor.blau_color_grey_5,
        textSecondaryInverse = BlauPaletteColor.blau_color_white,
        errorHigh = BlauPaletteColor.blau_color_red_70,
        promoHigh = BlauPaletteColor.blau_color_purple,
        successHigh = BlauPaletteColor.blau_color_green_70,
        warningHigh = BlauPaletteColor.blau_color_yellow_70,
        warning = BlauPaletteColor.blau_color_yellow,
    )

    override val darkColors = lightColors.copy(
        appBarBackground = BlauPaletteColor.blau_color_darkModeGrey,
        background = BlauPaletteColor.blau_color_darkModeBlack,
        backgroundAlternative = BlauPaletteColor.blau_color_darkModeGrey,
        backgroundBrand = BlauPaletteColor.blau_color_darkModeBlack,
        backgroundContainer = BlauPaletteColor.blau_color_darkModeGrey,
        backgroundFeedbackBottom = BlauPaletteColor.blau_color_darkModeBlack,
        backgroundOverlay = BlauPaletteColor.blau_color_darkModeGrey_80_alpha,
        backgroundSkeleton = BlauPaletteColor.blau_color_darkModeGrey,
        backgroundSkeletonInverse = BlauPaletteColor.blau_color_darkModeGrey,
        border = BlauPaletteColor.blau_color_darkModeGrey,
        borderLight = BlauPaletteColor.blau_color_darkModeBlack,
        brand = BlauPaletteColor.blau_color_blue_primary,
        brandHigh = BlauPaletteColor.blau_color_grey_5,
        buttonDangerBackgroundDisabled = BlauPaletteColor.blau_color_darkModeGrey,
        buttonLinkBackgroundSelected = BlauPaletteColor.blau_color_purple_30_alpha,
        buttonLinkBackgroundSelectedInverse = BlauPaletteColor.blau_color_purple_30_alpha,
        buttonPrimaryBackgroundDisabled = BlauPaletteColor.blau_color_darkModeGrey,
        buttonPrimaryBackgroundDisabledInverse = BlauPaletteColor.blau_color_darkModeGrey,
        buttonPrimaryBackgroundInverse = BlauPaletteColor.blau_color_blue_primary,
        buttonPrimaryBackgroundSelectedInverse = BlauPaletteColor.blau_color_blue_secondary60,
        buttonSecondaryBackgroundDisabled = BlauPaletteColor.blau_color_darkModeGrey,
        buttonSecondaryBorderDisabledInverse = BlauPaletteColor.blau_color_darkModeGrey,
        buttonSecondaryBorderInverse = BlauPaletteColor.blau_color_blue_primary,
        buttonSecondaryBorderSelectedInverse = BlauPaletteColor.blau_color_blue_secondary60,
        carouselIndicatorActiveColor = BlauPaletteColor.blau_color_blue_secondary,
        carouselIndicatorInactiveColor = BlauPaletteColor.blau_color_grey_5,
        control = BlauPaletteColor.blau_color_grey_5,
        divider = BlauPaletteColor.blau_color_white_5_alpha,
        dividerInverse = BlauPaletteColor.blau_color_white_5_alpha,
        feedbackInfoBackground = BlauPaletteColor.blau_color_darkModeGrey,
        inverse = BlauPaletteColor.blau_color_grey_2,
        loadingBar = BlauPaletteColor.blau_color_blue_primary,
        loadingBarBackground = BlauPaletteColor.blau_color_darkModeGrey,
        navigationBarBackground = BlauPaletteColor.blau_color_darkModeBlack,
        navigationBarDivider = BlauPaletteColor.blau_color_darkModeBlack,
        neutralHigh = BlauPaletteColor.blau_color_grey_2,
        neutralLow = BlauPaletteColor.blau_color_darkModeGrey,
        neutralMedium = BlauPaletteColor.blau_color_grey_5,
        skeletonWave = BlauPaletteColor.blau_color_grey_5,
        brandLow = BlauPaletteColor.blau_color_darkModeGrey,
        errorLow = BlauPaletteColor.blau_color_darkModeGrey,
        promoLow = BlauPaletteColor.blau_color_darkModeGrey,
        successLow = BlauPaletteColor.blau_color_darkModeGrey,
        warningLow = BlauPaletteColor.blau_color_darkModeGrey,
        textAppBar = BlauPaletteColor.blau_color_grey_5,
        textAppBarSelected = BlauPaletteColor.blau_color_grey_2,
        textButtonPrimary = BlauPaletteColor.blau_color_grey_2,
        textButtonPrimaryDisabled = BlauPaletteColor.blau_color_grey_5,
        textButtonPrimaryInverse = BlauPaletteColor.blau_color_grey_2,
        textButtonPrimaryInverseDisabled = BlauPaletteColor.blau_color_grey_5,
        textButtonPrimaryInverseSelected = BlauPaletteColor.blau_color_grey_2,
        textButtonSecondary = BlauPaletteColor.blau_color_grey_2,
        textButtonSecondaryDisabled = BlauPaletteColor.blau_color_grey_5,
        textButtonSecondaryInverse = BlauPaletteColor.blau_color_grey_2,
        textButtonSecondaryInverseDisabled = BlauPaletteColor.blau_color_grey_5,
        textButtonSecondaryInverseSelected = BlauPaletteColor.blau_color_blue_secondary60,
        textButtonSecondarySelected = BlauPaletteColor.blau_color_blue_secondary60,
        textDisabled = BlauPaletteColor.blau_color_grey_5,
        textLink = BlauPaletteColor.blau_color_purple,
        textLinkDangerDisabled = BlauPaletteColor.blau_color_grey_5,
        textLinkDisabled = BlauPaletteColor.blau_color_grey_5,
        textNavigationBarPrimary = BlauPaletteColor.blau_color_grey_2,
        textNavigationBarSecondary = BlauPaletteColor.blau_color_grey_4,
        textPrimary = BlauPaletteColor.blau_color_grey_2,
        textPrimaryInverse = BlauPaletteColor.blau_color_grey_2,
        textSecondary = BlauPaletteColor.blau_color_grey_4,
        textSecondaryInverse = BlauPaletteColor.blau_color_grey_4,
        errorHigh = BlauPaletteColor.blau_color_red_40,
        promoHigh = BlauPaletteColor.blau_color_purple_30,
        successHigh = BlauPaletteColor.blau_color_green_30,
        warningHigh = BlauPaletteColor.blau_color_yellow_40,
    )
}

private object BlauPaletteColor {
    val blau_color_blue_primary = Color(0xFF00B6F1)
    val blau_color_blue_primary30 = Color(0xFFB3E9FB)
    val blau_color_blue_primary20 = Color(0xFFE5F6FD)
    val blau_color_blue_primary10 = Color(0xFFF7FDFF)
    val blau_color_blue_secondary = Color(0xFF0072BC)
    val blau_color_blue_secondary60 = Color(0xFF005A99)
    val blau_color_blue_secondary30 = Color(0xFF80B7DF)
    val blau_color_blue_secondary20 = Color(0xFFB2D4EC)
    val blau_color_blue_secondary10 = Color(0xFFE5F1F9)

    val blau_color_purple = Color(0xFF7814B3)
    val blau_color_purple_10 = Color(0xFFF1E7F7)
    val blau_color_purple_30 = Color(0xFFBB89D9)

    val blau_color_yellow = Color(0xFFFFA922)
    val blau_color_yellow_70 = Color(0xFF996614)
    val blau_color_yellow_60 = Color(0xFFF09500)
    val blau_color_yellow_40 = Color(0xFFFFC364)
    val blau_color_yellow_10 = Color(0xFFFFF6E9)

    val blau_color_green = Color(0xFF30D300)
    val blau_color_green_70 = Color(0xFF1D7F00)
    val blau_color_green_30 = Color(0xFF97E980)
    val blau_color_green_10 = Color(0xFFEAFBE5)

    val blau_color_red = Color(0xFFF64417)
    val blau_color_red_70 = Color(0xFFC93712)
    val blau_color_red_40 = Color(0xFFF97C5D)
    val blau_color_red_30 = Color(0xFFFA9E87)
    val blau_color_red_20 = Color(0xFFFCC7B9)
    val blau_color_red_10 = Color(0xFFFEECE8)

    val blau_color_grey_1 = Color(0xFFF5F9FA)
    val blau_color_grey_2 = Color(0xFFE7E7E7)
    val blau_color_grey_3 = Color(0xFFB8B8B8)
    val blau_color_grey_4 = Color(0xFFA0A0A0)
    val blau_color_grey_5 = Color(0xFF808285)
    val blau_color_grey_6 = Color(0xFF000000)
    val blau_color_white = Color(0xFFFFFFFF)

    // Android specific palette for colors with custom alpha
    val blau_color_blue_secondary_75_alpha = Color(0xBF0072BC)
    val blau_color_white_30_alpha = Color(0x4DFFFFFF)
    val blau_color_white_20_alpha = Color(0x33FFFFFF)
    val blau_color_white_5_alpha = Color(0x0DFFFFFF)
    val blau_color_purple_30_alpha = Color(0x4D7814B3)

    // Dark Mode Color Palette
    val blau_color_darkModeBlack = Color(0xFF191919)
    val blau_color_darkModeGrey = Color(0xFF242424)
    val blau_color_darkModeGrey_80_alpha = Color(0xCC242424)
}
