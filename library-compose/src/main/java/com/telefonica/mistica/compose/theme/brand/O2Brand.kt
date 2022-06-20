package com.telefonica.mistica.compose.theme.brand

import androidx.compose.ui.graphics.Color
import com.telefonica.mistica.R
import com.telefonica.mistica.compose.theme.color.MisticaColors

object O2Brand : Brand {

    override val compatibilityTheme: Int
        get() = R.style.MisticaTheme_O2

    override val lightColors = MisticaColors(
        appBarBackground = O2PaletteColor.o2_color_white,
        background = O2PaletteColor.o2_color_white,
        backgroundAlternative = O2PaletteColor.o2_color_grey_1,
        backgroundBrand = O2PaletteColor.o2_color_blue_primary,
        backgroundContainer = O2PaletteColor.o2_color_white,
        backgroundFeedbackBottom = O2PaletteColor.o2_color_blue_primary,
        backgroundOverlay = O2PaletteColor.o2_color_grey_6_60_alpha,
        backgroundSkeleton = O2PaletteColor.o2_color_grey_1,
        backgroundSkeletonInverse = O2PaletteColor.o2_color_white_20_alpha,
        badge = O2PaletteColor.o2_color_pepper_dark,
        border = O2PaletteColor.o2_color_grey_3,
        borderDark = O2PaletteColor.o2_color_grey_5,
        borderLight = O2PaletteColor.o2_color_grey_1,
        borderSelected = O2PaletteColor.o2_color_blue_primary,
        brand = O2PaletteColor.o2_color_blue_primary,
        brandHigh = O2PaletteColor.o2_color_blue_primary_dark,
        buttonDangerBackground = O2PaletteColor.o2_color_pepper,
        buttonDangerBackgroundSelected = O2PaletteColor.o2_color_pepper_dark,
        buttonLinkBackgroundSelected = O2PaletteColor.o2_color_blue_light_10,
        buttonLinkBackgroundSelectedInverse = O2PaletteColor.o2_color_white_20_alpha,
        buttonPrimaryBackground = O2PaletteColor.o2_color_blue_primary,
        buttonPrimaryBackgroundInverse = O2PaletteColor.o2_color_white,
        buttonPrimaryBackgroundSelected = O2PaletteColor.o2_color_blue_primary_dark,
        buttonPrimaryBackgroundSelectedInverse = O2PaletteColor.o2_color_blue_primary_light_50,
        buttonSecondaryBackground = O2PaletteColor.o2_color_blue_primary,
        buttonSecondaryBackgroundSelected = O2PaletteColor.o2_color_blue_primary_dark,
        buttonSecondaryBorderInverse = O2PaletteColor.o2_color_white,
        buttonSecondaryBorderSelectedInverse = O2PaletteColor.o2_color_blue_primary_light_50,
        carouselIndicatorActiveColor = O2PaletteColor.o2_color_blue_primary,
        carouselIndicatorInactiveColor = O2PaletteColor.o2_color_grey_3,
        control = O2PaletteColor.o2_color_grey_3,
        controlActive = O2PaletteColor.o2_color_blue_primary,
        controlError = O2PaletteColor.o2_color_pepper,
        divider = O2PaletteColor.o2_color_grey_2,
        dividerInverse = O2PaletteColor.o2_color_white_20_alpha,
        error = O2PaletteColor.o2_color_pepper,
        feedbackErrorBackground = O2PaletteColor.o2_color_pepper,
        feedbackInfoBackground = O2PaletteColor.o2_color_grey_6,
        gradientBackgroundFirst = O2PaletteColor.o2_color_blue_primary,
        gradientBackgroundFourth = O2PaletteColor.o2_color_blue_primary,
        gradientBackgroundSecond = O2PaletteColor.o2_color_blue_primary,
        gradientBackgroundThird = O2PaletteColor.o2_color_blue_primary,
        highlight = O2PaletteColor.o2_color_pink,
        inverse = O2PaletteColor.o2_color_white,
        loadingBar = O2PaletteColor.o2_color_blue_primary,
        loadingBarBackground = O2PaletteColor.o2_color_grey_1,
        loginLoadingGradientFirst = O2PaletteColor.o2_color_blue_primary,
        loginLoadingGradientFourth = O2PaletteColor.o2_color_blue_primary,
        loginLoadingGradientSecond = O2PaletteColor.o2_color_blue_primary,
        loginLoadingGradientThird = O2PaletteColor.o2_color_blue_primary,
        navigationBarBackground = O2PaletteColor.o2_color_blue_primary,
        navigationBarDivider = O2PaletteColor.o2_color_blue_primary,
        neutralHigh = O2PaletteColor.o2_color_grey_6,
        neutralLow = O2PaletteColor.o2_color_grey_1,
        neutralMedium = O2PaletteColor.o2_color_grey_5,
        promo = O2PaletteColor.o2_color_purple,
        skeletonWave = O2PaletteColor.o2_color_grey_2,
        success = O2PaletteColor.o2_color_green,
        brandLow = O2PaletteColor.o2_color_blue_primary_10,
        errorLow = O2PaletteColor.o2_color_pepper_10,
        promoLow = O2PaletteColor.o2_color_purple_10,
        successLow = O2PaletteColor.o2_color_green_10,
        warningLow = O2PaletteColor.o2_color_orange_10,
        textAppBar = O2PaletteColor.o2_color_grey_4,
        textAppBarSelected = O2PaletteColor.o2_color_blue_primary,
        textButtonPrimary = O2PaletteColor.o2_color_white,
        textButtonPrimaryInverse = O2PaletteColor.o2_color_blue_primary,
        textButtonPrimaryInverseSelected = O2PaletteColor.o2_color_blue_primary_dark,
        textButtonSecondary = O2PaletteColor.o2_color_blue_primary,
        textButtonSecondaryInverse = O2PaletteColor.o2_color_white,
        textButtonSecondaryInverseSelected = O2PaletteColor.o2_color_white,
        textButtonSecondarySelected = O2PaletteColor.o2_color_blue_primary_dark,
        textDisabled = O2PaletteColor.o2_color_grey_3,
        textLink = O2PaletteColor.o2_color_blue_primary,
        textLinkDanger = O2PaletteColor.o2_color_pepper,
        textLinkDangerDisabled = O2PaletteColor.o2_color_pepper_light30,
        textLinkDisabled = O2PaletteColor.o2_color_blue_primary_light_50,
        textLinkInverse = O2PaletteColor.o2_color_white,
        textLinkSnackbar = O2PaletteColor.o2_color_blue_primary_light_50,
        textNavigationBarPrimary = O2PaletteColor.o2_color_white,
        textNavigationBarSecondary = O2PaletteColor.o2_color_blue_primary_light_50,
        textPrimary = O2PaletteColor.o2_color_grey_6,
        textPrimaryInverse = O2PaletteColor.o2_color_white,
        textSecondary = O2PaletteColor.o2_color_grey_5,
        textSecondaryInverse = O2PaletteColor.o2_color_white,
        errorHigh = O2PaletteColor.o2_color_pepper_60,
        promoHigh = O2PaletteColor.o2_color_purple,
        successHigh = O2PaletteColor.o2_color_green_80,
        warningHigh = O2PaletteColor.o2_color_orange_75,
        warning = O2PaletteColor.o2_color_orange,
    )

    override val darkColors = lightColors.copy(
        appBarBackground = O2PaletteColor.o2_color_darkModeGrey,
        background = O2PaletteColor.o2_color_darkModeBlack,
        backgroundAlternative = O2PaletteColor.o2_color_darkModeGrey,
        backgroundBrand = O2PaletteColor.o2_color_darkModeBlack,
        backgroundContainer = O2PaletteColor.o2_color_darkModeGrey,
        backgroundFeedbackBottom = O2PaletteColor.o2_color_darkModeBlack,
        backgroundOverlay = O2PaletteColor.o2_color_darkModeGrey_80_alpha,
        backgroundSkeleton = O2PaletteColor.o2_color_darkModeGrey6,
        backgroundSkeletonInverse = O2PaletteColor.o2_color_darkModeGrey6,
        border = O2PaletteColor.o2_color_darkModeGrey,
        borderLight = O2PaletteColor.o2_color_darkModeGrey,
        borderSelected = O2PaletteColor.o2_color_darkModeO2BluePrimary,
        brand = O2PaletteColor.o2_color_blue_primary_light_50,
        brandHigh = O2PaletteColor.o2_color_darkModeGrey6,
        buttonLinkBackgroundSelected = O2PaletteColor.o2_color_darkModeGrey,
        buttonLinkBackgroundSelectedInverse = O2PaletteColor.o2_color_white_5_alpha,
        buttonPrimaryBackground = O2PaletteColor.o2_color_darkModeO2BluePrimary,
        buttonPrimaryBackgroundInverse = O2PaletteColor.o2_color_darkModeO2BluePrimary,
        buttonPrimaryBackgroundSelected = O2PaletteColor.o2_color_darkModeO2BluePrimaryDark,
        buttonPrimaryBackgroundSelectedInverse = O2PaletteColor.o2_color_darkModeO2BluePrimaryDark,
        buttonSecondaryBackground = O2PaletteColor.o2_color_darkModeO2BluePrimary,
        buttonSecondaryBackgroundSelected = O2PaletteColor.o2_color_darkModeO2BluePrimaryDark,
        buttonSecondaryBorderInverse = O2PaletteColor.o2_color_darkModeO2BluePrimary,
        buttonSecondaryBorderSelectedInverse = O2PaletteColor.o2_color_darkModeO2BluePrimaryDark,
        carouselIndicatorActiveColor = O2PaletteColor.o2_color_blue_primary_light_50,
        carouselIndicatorInactiveColor = O2PaletteColor.o2_color_darkModeGrey6,
        control = O2PaletteColor.o2_color_darkModeGrey6,
        controlActive = O2PaletteColor.o2_color_blue_primary_light_50,
        divider = O2PaletteColor.o2_color_white_5_alpha,
        dividerInverse = O2PaletteColor.o2_color_white_5_alpha,
        feedbackInfoBackground = O2PaletteColor.o2_color_darkModeGrey6,
        inverse = O2PaletteColor.o2_color_grey_2,
        loadingBar = O2PaletteColor.o2_color_darkModeO2BluePrimary,
        loadingBarBackground = O2PaletteColor.o2_color_darkModeGrey6,
        navigationBarBackground = O2PaletteColor.o2_color_darkModeBlack,
        navigationBarDivider = O2PaletteColor.o2_color_darkModeBlack,
        neutralHigh = O2PaletteColor.o2_color_grey_2,
        neutralLow = O2PaletteColor.o2_color_darkModeGrey6,
        skeletonWave = O2PaletteColor.o2_color_grey_5_30_alpha,
        brandLow = O2PaletteColor.o2_color_darkModeGrey,
        errorLow = O2PaletteColor.o2_color_darkModeGrey,
        promoLow = O2PaletteColor.o2_color_darkModeGrey,
        successLow = O2PaletteColor.o2_color_darkModeGrey,
        warningLow = O2PaletteColor.o2_color_darkModeGrey,
        textAppBar = O2PaletteColor.o2_color_grey_5,
        textAppBarSelected = O2PaletteColor.o2_color_grey_2,
        textButtonPrimary = O2PaletteColor.o2_color_grey_2,
        textButtonPrimaryInverse = O2PaletteColor.o2_color_grey_2,
        textButtonPrimaryInverseSelected = O2PaletteColor.o2_color_grey_2,
        textButtonSecondary = O2PaletteColor.o2_color_grey_2,
        textButtonSecondaryInverse = O2PaletteColor.o2_color_grey_2,
        textButtonSecondaryInverseSelected = O2PaletteColor.o2_color_grey_4,
        textButtonSecondarySelected = O2PaletteColor.o2_color_grey_4,
        textDisabled = O2PaletteColor.o2_color_grey_5,
        textLink = O2PaletteColor.o2_color_blue_primary_light_50,
        textLinkDangerDisabled = O2PaletteColor.o2_color_grey_5,
        textLinkDisabled = O2PaletteColor.o2_color_darkModeGrey6,
        textLinkInverse = O2PaletteColor.o2_color_blue_primary_light_50,
        textNavigationBarPrimary = O2PaletteColor.o2_color_grey_2,
        textNavigationBarSecondary = O2PaletteColor.o2_color_grey_4,
        textPrimary = O2PaletteColor.o2_color_grey_2,
        textPrimaryInverse = O2PaletteColor.o2_color_grey_2,
        textSecondary = O2PaletteColor.o2_color_grey_4,
        textSecondaryInverse = O2PaletteColor.o2_color_grey_4,
        errorHigh = O2PaletteColor.o2_color_pepper_40,
        promoHigh = O2PaletteColor.o2_color_purple_30,
        successHigh = O2PaletteColor.o2_color_green_40,
        warningHigh = O2PaletteColor.o2_color_orange_40,
    )
}

private object O2PaletteColor {
    val o2_color_blue_primary = Color(0xFF0019A5)
    val o2_color_blue_primary_10 = Color(0xFFE5E8F6)
    val o2_color_blue_primary_15 = Color(0xFFCCD1ED)
    val o2_color_blue_primary_dark = Color(0xFF000066)
    val o2_color_blue_primary_light_50 = Color(0xFF808CD2)
    val o2_color_blue_primary_light_10 = Color(0xFFCCD1ED)

    val o2_color_blue_mid = Color(0xFF007BB2)
    val o2_color_blue_mid_dark = Color(0xFF006795)
    val o2_color_blue_light = Color(0xFF41B6E6)
    val o2_color_blue_light_60 = Color(0xFF8DD3F0)
    val o2_color_blue_light_30 = Color(0xFFC6E9F7)
    val o2_color_blue_light_10 = Color(0xFFECF7FC)

    val o2_color_teal = Color(0xFF01B7B4)
    val o2_color_teal_dark = Color(0xFF099E9B)
    val o2_color_teal_light = Color(0xFFB1E4E3)

    val o2_color_green = Color(0xFF91C90E)
    val o2_color_green_10 = Color(0xFFF4FAE7)
    val o2_color_green_40 = Color(0xFFB2D956)
    val o2_color_green_80 = Color(0xFF415A06)
    val o2_color_green_light = Color(0xFFDEEEB7)

    val o2_color_yellow = Color(0xFFFEDB00)
    val o2_color_yellow_light = Color(0xFFFEF6C3)

    val o2_color_orange = Color(0xFFFF7F41)
    val o2_color_orange_10 = Color(0xFFFFF2EC)
    val o2_color_orange_40 = Color(0xFFFFA57A)
    val o2_color_orange_75 = Color(0xFFA6522A)
    val o2_color_orange_light = Color(0xFFFFD6C2)

    val o2_color_coral = Color(0xFFFF706E)

    val o2_color_pink = Color(0xFFCB31A0)

    val o2_color_purple = Color(0xFF953698)
    val o2_color_purple_10 = Color(0xFFF4EAF5)
    val o2_color_purple_30 = Color(0xFFCA9ACB)

    val o2_color_pepper = Color(0xFFFF374A)
    val o2_color_pepper_10 = Color(0xFFFEEBED)
    val o2_color_pepper_40 = Color(0xFFFF7380)
    val o2_color_pepper_60 = Color(0xFFC32B3D)
    val o2_color_pepper_dark = Color(0xFFD73241)
    val o2_color_pepper_light30 = Color(0xFFFFC3C8)

    val o2_color_grey_1 = Color(0xFFF6F6F6)
    val o2_color_grey_2 = Color(0xFFEEEEEE)
    val o2_color_grey_3 = Color(0xFFDDDDDD)
    val o2_color_grey_4 = Color(0xFF999999)
    val o2_color_grey_5 = Color(0xFF707070)
    val o2_color_grey_6 = Color(0xFF000033)
    val o2_color_white = Color(0xFFFFFFFF)

    // Android specific palette for colors with custom alpha
    val o2_color_white_5_alpha = Color(0x0DFFFFFF)
    val o2_color_white_20_alpha = Color(0x33FFFFFF)
    val o2_color_white_50_alpha = Color(0x80FFFFFF)
    val o2_color_grey_6_5_alpha = Color(0x0D000033)
    val o2_color_grey_5_30_alpha = Color(0x4D707070)
    val o2_color_grey_6_30_alpha = Color(0x4D000033)
    val o2_color_grey_6_40_alpha = Color(0x66000033)
    val o2_color_grey_6_60_alpha = Color(0x99000033)
    val o2_color_grey_6_80_alpha = Color(0xCC000033)
    val o2_color_blue_mid_30_alpha = Color(0x4D007BB2)
    val o2_color_sky_blue_light_60_25_alpha = Color(0x40A3D2EF)
    val o2_color_sky_blue_light_30_25_alpha = Color(0x40D0E8F6)
    val o2_color_blue_primary_dark_40_alpha = Color(0x66000066)
    val o2_color_blue_primary_40_alpha = Color(0x66000066)

    // Dark mode
    val o2_color_darkModeBlack = Color(0xFF191919)
    val o2_color_darkModeGrey = Color(0xFF242424)
    val o2_color_darkModeGrey_80_alpha = Color(0xCC242424)
    val o2_color_darkModeGrey6 = Color(0xFF313235)
    val o2_color_darkModeO2BluePrimary = Color(0xFF0020D6)
    val o2_color_darkModeO2BluePrimaryDark = Color(0xFF000099)
}
