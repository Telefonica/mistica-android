package com.telefonica.mistica.compose.theme.brand

import androidx.compose.ui.graphics.Color
import com.telefonica.mistica.R
import com.telefonica.mistica.compose.theme.color.MisticaColors

object O2ClassicBrand : Brand {

    override val compatibilityTheme: Int
        get() = R.style.MisticaTheme_O2Classic

    override val lightColors = MisticaColors(
        appBarBackground = O2ClassicPaletteColor.o2_classic_color_white,
        background = O2ClassicPaletteColor.o2_classic_color_white,
        backgroundContainer = O2ClassicPaletteColor.o2_classic_color_white,
        backgroundBrand = O2ClassicPaletteColor.o2_classic_color_blue,
        backgroundOverlay = O2ClassicPaletteColor.o2_classic_color_grey_6_60_alpha,
        backgroundSkeleton = O2ClassicPaletteColor.o2_classic_color_grey_1,
        backgroundSkeletonInverse = O2ClassicPaletteColor.o2_classic_color_white_20_alpha,
        navigationBarBackground = O2ClassicPaletteColor.o2_classic_color_blue,
        backgroundAlternative = O2ClassicPaletteColor.o2_classic_color_grey_1,
        backgroundFeedbackBottom = O2ClassicPaletteColor.o2_classic_gradient_fourth,
        skeletonWave = O2ClassicPaletteColor.o2_classic_color_grey_2,
        borderLight = O2ClassicPaletteColor.o2_classic_color_grey_1,
        border = O2ClassicPaletteColor.o2_classic_color_grey_3,
        borderDark = O2ClassicPaletteColor.o2_classic_color_grey_5,
        borderSelected = O2ClassicPaletteColor.o2_classic_color_gem,
        buttonDangerBackground = O2ClassicPaletteColor.o2_classic_color_pepper,
        buttonDangerBackgroundDisabled = O2ClassicPaletteColor.o2_classic_color_pepper_light_30,
        buttonDangerBackgroundSelected = O2ClassicPaletteColor.o2_classic_color_pepper_dark,
        buttonLinkBackgroundSelected = O2ClassicPaletteColor.o2_classic_color_sky_blue_light_10,
        buttonLinkBackgroundSelectedInverse = O2ClassicPaletteColor.o2_classic_color_white_20_alpha,
        buttonPrimaryBackground = O2ClassicPaletteColor.o2_classic_color_sky_blue,
        buttonPrimaryBackgroundDisabled = O2ClassicPaletteColor.o2_classic_color_sky_blue_light_50,
        buttonPrimaryBackgroundDisabledInverse = O2ClassicPaletteColor.o2_classic_color_sky_blue_light_50,
        buttonPrimaryBackgroundInverse = O2ClassicPaletteColor.o2_classic_color_white,
        buttonPrimaryBackgroundSelected = O2ClassicPaletteColor.o2_classic_color_sky_blue_dark,
        buttonPrimaryBackgroundSelectedInverse = O2ClassicPaletteColor.o2_classic_color_sky_blue_light_50,
        buttonSecondaryBackground = O2ClassicPaletteColor.o2_classic_color_sky_blue,
        buttonSecondaryBackgroundDisabled = O2ClassicPaletteColor.o2_classic_color_sky_blue_light_50,
        buttonSecondaryBackgroundSelected = O2ClassicPaletteColor.o2_classic_color_sky_blue_dark,
        buttonSecondaryBorderDisabledInverse = O2ClassicPaletteColor.o2_classic_color_sky_blue_light_50,
        buttonSecondaryBorderInverse = O2ClassicPaletteColor.o2_classic_color_white,
        buttonSecondaryBorderSelectedInverse = O2ClassicPaletteColor.o2_classic_color_sky_blue_light_50,
        textButtonPrimary = O2ClassicPaletteColor.o2_classic_color_white,
        textButtonPrimaryDisabled = O2ClassicPaletteColor.o2_classic_color_white,
        textButtonPrimaryInverse = O2ClassicPaletteColor.o2_classic_color_sky_blue,
        textButtonPrimaryInverseDisabled = O2ClassicPaletteColor.o2_classic_color_sky_blue_light_30,
        textButtonPrimaryInverseSelected = O2ClassicPaletteColor.o2_classic_color_sky_blue,
        textButtonSecondary = O2ClassicPaletteColor.o2_classic_color_sky_blue,
        textButtonSecondaryDisabled = O2ClassicPaletteColor.o2_classic_color_sky_blue_light_50,
        textButtonSecondarySelected = O2ClassicPaletteColor.o2_classic_color_sky_blue_dark,
        textButtonSecondaryInverse = O2ClassicPaletteColor.o2_classic_color_white,
        textButtonSecondaryInverseDisabled = O2ClassicPaletteColor.o2_classic_color_sky_blue_light_50,
        textButtonSecondaryInverseSelected = O2ClassicPaletteColor.o2_classic_color_white,
        textLink = O2ClassicPaletteColor.o2_classic_color_sky_blue,
        textLinkInverse = O2ClassicPaletteColor.o2_classic_color_white,
        textLinkDanger = O2ClassicPaletteColor.o2_classic_color_pepper,
        textLinkDangerDisabled = O2ClassicPaletteColor.o2_classic_color_pepper_light_30,
        textLinkDisabled = O2ClassicPaletteColor.o2_classic_color_sky_blue_light,
        textLinkSnackbar = O2ClassicPaletteColor.o2_classic_color_sky_blue_light,
        control = O2ClassicPaletteColor.o2_classic_color_grey_3,
        controlActive = O2ClassicPaletteColor.o2_classic_color_gem,
        controlError = O2ClassicPaletteColor.o2_classic_color_pepper,
        loadingBar = O2ClassicPaletteColor.o2_classic_color_gem,
        loadingBarBackground = O2ClassicPaletteColor.o2_classic_color_gem_light_30,
        divider = O2ClassicPaletteColor.o2_classic_color_grey_2,
        dividerInverse = O2ClassicPaletteColor.o2_classic_color_white_20_alpha,
        navigationBarDivider = O2ClassicPaletteColor.o2_classic_color_blue,
        badge = O2ClassicPaletteColor.o2_classic_color_pepper_dark,
        feedbackErrorBackground = O2ClassicPaletteColor.o2_classic_color_pepper,
        feedbackInfoBackground = O2ClassicPaletteColor.o2_classic_color_grey_6,
        brand = O2ClassicPaletteColor.o2_classic_color_blue,
        brandDark = O2ClassicPaletteColor.o2_classic_color_blue_dark,
        inverse = O2ClassicPaletteColor.o2_classic_color_white,
        neutralHigh = O2ClassicPaletteColor.o2_classic_color_grey_6,
        neutralMedium = O2ClassicPaletteColor.o2_classic_color_grey_5,
        neutralLow = O2ClassicPaletteColor.o2_classic_color_grey_3,
        promo = O2ClassicPaletteColor.o2_classic_color_pink,
        highlight = O2ClassicPaletteColor.o2_classic_color_pink,
        textPrimary = O2ClassicPaletteColor.o2_classic_color_grey_6,
        textPrimaryInverse = O2ClassicPaletteColor.o2_classic_color_white,
        textSecondary = O2ClassicPaletteColor.o2_classic_color_grey_5,
        textSecondaryInverse = O2ClassicPaletteColor.o2_classic_color_white,
        textDisabled = O2ClassicPaletteColor.o2_classic_color_grey_3,
        textAmount = O2ClassicPaletteColor.o2_classic_color_sky_blue,
        error = O2ClassicPaletteColor.o2_classic_color_pepper,
        success = O2ClassicPaletteColor.o2_classic_color_green,
        warning = O2ClassicPaletteColor.o2_classic_color_orange,
        textNavigationBarPrimary = O2ClassicPaletteColor.o2_classic_color_white,
        textNavigationBarSecondary = O2ClassicPaletteColor.o2_classic_color_sky_blue_light_50,
        textAppBar = O2ClassicPaletteColor.o2_classic_color_grey_4,
        textAppBarSelected = O2ClassicPaletteColor.o2_classic_color_blue,
        gradientBackgroundFirst = O2ClassicPaletteColor.o2_classic_gradient_first,
        gradientBackgroundSecond = O2ClassicPaletteColor.o2_classic_gradient_second,
        gradientBackgroundThird = O2ClassicPaletteColor.o2_classic_gradient_third,
        gradientBackgroundFourth = O2ClassicPaletteColor.o2_classic_gradient_fourth,
        loginLoadingGradientFirst = O2ClassicPaletteColor.o2_classic_gradient_first,
        loginLoadingGradientSecond = O2ClassicPaletteColor.o2_classic_gradient_second,
        loginLoadingGradientThird = O2ClassicPaletteColor.o2_classic_gradient_third,
        loginLoadingGradientFourth = O2ClassicPaletteColor.o2_classic_gradient_fourth,
    )

    override val darkColors = lightColors.copy(
        appBarBackground = O2ClassicPaletteColor.o2_classic_color_darkModeGrey,
        background = O2ClassicPaletteColor.o2_classic_color_darkModeBlack,
        backgroundContainer = O2ClassicPaletteColor.o2_classic_color_darkModeGrey,
        backgroundBrand = O2ClassicPaletteColor.o2_classic_color_darkModeBlack,
        backgroundOverlay = O2ClassicPaletteColor.o2_classic_color_darkModeGrey_80_alpha,
        backgroundSkeleton = O2ClassicPaletteColor.o2_classic_color_darkModeGrey6,
        backgroundSkeletonInverse = O2ClassicPaletteColor.o2_classic_color_darkModeGrey6,
        navigationBarBackground = O2ClassicPaletteColor.o2_classic_color_darkModeBlack,
        backgroundAlternative = O2ClassicPaletteColor.o2_classic_color_darkModeGrey,
        backgroundFeedbackBottom = O2ClassicPaletteColor.o2_classic_color_darkModeBlack,
        skeletonWave = O2ClassicPaletteColor.o2_classic_color_grey_5_30_alpha,
        borderLight = O2ClassicPaletteColor.o2_classic_color_darkModeBlack,
        border = O2ClassicPaletteColor.o2_classic_color_darkModeGrey,
        buttonDangerBackgroundDisabled = O2ClassicPaletteColor.o2_classic_color_darkModeGrey,
        buttonLinkBackgroundSelected = O2ClassicPaletteColor.o2_classic_color_white_5_alpha,
        buttonLinkBackgroundSelectedInverse = O2ClassicPaletteColor.o2_classic_color_darkModeGrey,
        buttonPrimaryBackgroundDisabled = O2ClassicPaletteColor.o2_classic_color_darkModeGrey,
        buttonPrimaryBackgroundDisabledInverse = O2ClassicPaletteColor.o2_classic_color_darkModeGrey,
        buttonPrimaryBackgroundInverse = O2ClassicPaletteColor.o2_classic_color_sky_blue,
        buttonPrimaryBackgroundSelectedInverse = O2ClassicPaletteColor.o2_classic_color_sky_blue_dark,
        buttonSecondaryBackgroundDisabled = O2ClassicPaletteColor.o2_classic_color_darkModeGrey,
        buttonSecondaryBorderDisabledInverse = O2ClassicPaletteColor.o2_classic_color_darkModeGrey,
        buttonSecondaryBorderInverse = O2ClassicPaletteColor.o2_classic_color_sky_blue,
        buttonSecondaryBorderSelectedInverse = O2ClassicPaletteColor.o2_classic_color_sky_blue_dark,
        textButtonPrimary = O2ClassicPaletteColor.o2_classic_color_grey_2,
        textButtonPrimaryDisabled = O2ClassicPaletteColor.o2_classic_color_grey_5,
        textButtonPrimaryInverse = O2ClassicPaletteColor.o2_classic_color_grey_2,
        textButtonPrimaryInverseDisabled = O2ClassicPaletteColor.o2_classic_color_grey_5,
        textButtonPrimaryInverseSelected = O2ClassicPaletteColor.o2_classic_color_grey_2,
        textButtonSecondary = O2ClassicPaletteColor.o2_classic_color_grey_2,
        textButtonSecondaryDisabled = O2ClassicPaletteColor.o2_classic_color_grey_5,
        textButtonSecondarySelected = O2ClassicPaletteColor.o2_classic_color_grey_4,
        textButtonSecondaryInverse = O2ClassicPaletteColor.o2_classic_color_grey_2,
        textButtonSecondaryInverseDisabled = O2ClassicPaletteColor.o2_classic_color_grey_5,
        textButtonSecondaryInverseSelected = O2ClassicPaletteColor.o2_classic_color_grey_4,
        textLink = O2ClassicPaletteColor.o2_classic_color_sky_blue_light,
        textLinkInverse = O2ClassicPaletteColor.o2_classic_color_sky_blue_light,
        textLinkDangerDisabled = O2ClassicPaletteColor.o2_classic_color_grey_6,
        textLinkDisabled = O2ClassicPaletteColor.o2_classic_color_darkModeGrey6,
        control = O2ClassicPaletteColor.o2_classic_color_darkModeGrey6,
        divider = O2ClassicPaletteColor.o2_classic_color_white_5_alpha,
        dividerInverse = O2ClassicPaletteColor.o2_classic_color_white_5_alpha,
        navigationBarDivider = O2ClassicPaletteColor.o2_classic_color_darkModeBlack,
        feedbackInfoBackground = O2ClassicPaletteColor.o2_classic_color_darkModeGrey6,
        brand = O2ClassicPaletteColor.o2_classic_color_sky_blue,
        brandDark = O2ClassicPaletteColor.o2_classic_color_darkModeGrey6,
        inverse = O2ClassicPaletteColor.o2_classic_color_grey_2,
        neutralHigh = O2ClassicPaletteColor.o2_classic_color_grey_2,
        neutralLow = O2ClassicPaletteColor.o2_classic_color_darkModeGrey6,
        textPrimary = O2ClassicPaletteColor.o2_classic_color_grey_2,
        textPrimaryInverse = O2ClassicPaletteColor.o2_classic_color_grey_2,
        textSecondary = O2ClassicPaletteColor.o2_classic_color_grey_4,
        textSecondaryInverse = O2ClassicPaletteColor.o2_classic_color_grey_4,
        textDisabled = O2ClassicPaletteColor.o2_classic_color_grey_5,
        textAmount = O2ClassicPaletteColor.o2_classic_color_sky_blue_light_50,
        textNavigationBarPrimary = O2ClassicPaletteColor.o2_classic_color_grey_2,
        textNavigationBarSecondary = O2ClassicPaletteColor.o2_classic_color_grey_4,
        textAppBar = O2ClassicPaletteColor.o2_classic_color_grey_5,
        textAppBarSelected = O2ClassicPaletteColor.o2_classic_color_grey_2,
    )
}

private object O2ClassicPaletteColor {
    val o2_classic_color_blue = Color(0xFF032B5A)
    val o2_classic_color_blue_dark = Color(0xFF04264E)
    val o2_classic_color_blue_light_60 = Color(0xFF6C8BAF)
    val o2_classic_color_sky_blue = Color(0xFF0090D0)
    val o2_classic_color_sky_blue_dark = Color(0xFF057DB2)
    val o2_classic_color_sky_blue_light = Color(0xFF65B4E4)
    val o2_classic_color_sky_blue_light_50 = Color(0xFF80C7E7)
    val o2_classic_color_sky_blue_light_30 = Color(0xFFD0E8F6)
    val o2_classic_color_sky_blue_light_10 = Color(0xFFE9F5FB)
    val o2_classic_color_deep_sky_blue = Color(0xFF7FD4FE)

    val o2_classic_color_gem = Color(0xFF01B7B4)
    val o2_classic_color_gem_dark = Color(0xFF099E9B)
    val o2_classic_color_gem_light_30 = Color(0xFF99E2E1)
    val o2_classic_color_yellow = Color(0xFFFFCC00)
    val o2_classic_color_green = Color(0xFF84B50F)
    val o2_classic_color_green_light = Color(0xFFDAE8B7)
    val o2_classic_color_pepper = Color(0xFFFF374A)
    val o2_classic_color_pepper_dark = Color(0xFFD73241)
    val o2_classic_color_pepper_light_30 = Color(0xFFFFC3C8)
    val o2_classic_color_orange = Color(0xFFFF7F41)
    val o2_classic_color_orange_light = Color(0xFFFFD6C2)
    val o2_classic_color_coral = Color(0xFFFF706E)
    val o2_classic_color_pink = Color(0xFFEB3C7D)

    val o2_classic_gradient_first = Color(0xFF102550)
    val o2_classic_gradient_second = Color(0xFF0B4680)
    val o2_classic_gradient_third = Color(0xFF0D71AD)
    val o2_classic_gradient_fourth = Color(0xFF449ED0)

    val o2_classic_color_grey_1 = Color(0xFFF6F6F6)
    val o2_classic_color_grey_2 = Color(0xFFEEEEEE)
    val o2_classic_color_grey_3 = Color(0xFFDDDDDD)
    val o2_classic_color_grey_4 = Color(0xFF999999)
    val o2_classic_color_grey_5 = Color(0xFF757575)
    val o2_classic_color_grey_6 = Color(0xFF000033)
    val o2_classic_color_white = Color(0xFFFFFFFF)

    // Android specific palette for colors with custom alpha
    val o2_classic_color_white_5_alpha = Color(0x0DFFFFFF)
    val o2_classic_color_white_20_alpha = Color(0x33FFFFFF)
    val o2_classic_color_white_50_alpha = Color(0x80FFFFFF)
    val o2_classic_color_grey_5_30_alpha = Color(0x4D757575)
    val o2_classic_color_grey_6_5_alpha = Color(0x0D000033)
    val o2_classic_color_grey_6_30_alpha = Color(0x4D000033)
    val o2_classic_color_grey_6_40_alpha = Color(0x66000033)
    val o2_classic_color_grey_6_60_alpha = Color(0x99000033)
    val o2_classic_color_grey_6_80_alpha = Color(0xCC000033)
    val o2_classic_color_sky_blue_30_alpha = Color(0x4D0090D0)
    val o2_classic_color_sky_blue_light_30_alpha = Color(0x4D65B4E4)
    val o2_classic_color_sky_blue_light_40_alpha = Color(0x6665B4E4)
    val o2_classic_color_sky_blue_light_30_25_alpha = Color(0x40D0E8F6)
    val o2_classic_color_sky_blue_light_50_25_alpha = Color(0x4080C7E7)
    val o2_classic_color_blue_dark_40_alpha = Color(0x6604264E)

    // Dark mode
    val o2_classic_color_darkModeBlack = Color(0xFF191919)
    val o2_classic_color_darkModeGrey = Color(0xFF242424)
    val o2_classic_color_darkModeGrey_80_alpha = Color(0xCC242424)
    val o2_classic_color_darkModeGrey6 = Color(0xFF313235)
}
