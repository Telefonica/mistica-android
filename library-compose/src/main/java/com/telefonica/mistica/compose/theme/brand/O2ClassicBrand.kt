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
        backgroundAlternative = O2ClassicPaletteColor.o2_classic_color_grey_1,
        backgroundBrand = O2ClassicPaletteColor.o2_classic_color_blue,
        backgroundContainer = O2ClassicPaletteColor.o2_classic_color_white,
        backgroundFeedbackBottom = O2ClassicPaletteColor.o2_classic_gradient_fourth,
        backgroundOverlay = O2ClassicPaletteColor.o2_classic_color_grey_6_60_alpha,
        backgroundSkeleton = O2ClassicPaletteColor.o2_classic_color_grey_1,
        backgroundSkeletonInverse = O2ClassicPaletteColor.o2_classic_color_white_20_alpha,
        badge = O2ClassicPaletteColor.o2_classic_color_pepper_55,
        border = O2ClassicPaletteColor.o2_classic_color_grey_3,
        borderDark = O2ClassicPaletteColor.o2_classic_color_grey_5,
        borderLight = O2ClassicPaletteColor.o2_classic_color_grey_1,
        borderSelected = O2ClassicPaletteColor.o2_classic_color_gem,
        brand = O2ClassicPaletteColor.o2_classic_color_blue,
        brandHigh = O2ClassicPaletteColor.o2_classic_color_blue_55,
        buttonDangerBackground = O2ClassicPaletteColor.o2_classic_color_pepper,
        buttonDangerBackgroundSelected = O2ClassicPaletteColor.o2_classic_color_pepper_55,
        buttonLinkBackgroundSelected = O2ClassicPaletteColor.o2_classic_color_sky_blue_light_10,
        buttonLinkBackgroundSelectedInverse = O2ClassicPaletteColor.o2_classic_color_white_20_alpha,
        buttonPrimaryBackground = O2ClassicPaletteColor.o2_classic_color_sky_blue,
        buttonPrimaryBackgroundInverse = O2ClassicPaletteColor.o2_classic_color_white,
        buttonPrimaryBackgroundSelected = O2ClassicPaletteColor.o2_classic_color_sky_blue_55,
        buttonPrimaryBackgroundSelectedInverse = O2ClassicPaletteColor.o2_classic_color_sky_blue_light_45,
        buttonSecondaryBackground = O2ClassicPaletteColor.o2_classic_color_sky_blue,
        buttonSecondaryBackgroundSelected = O2ClassicPaletteColor.o2_classic_color_sky_blue_55,
        buttonSecondaryBorderInverse = O2ClassicPaletteColor.o2_classic_color_white,
        buttonSecondaryBorderSelectedInverse = O2ClassicPaletteColor.o2_classic_color_sky_blue_light_45,
        carouselIndicatorActiveColor = O2ClassicPaletteColor.o2_classic_color_gem,
        carouselIndicatorInactiveColor = O2ClassicPaletteColor.o2_classic_color_grey_3,
        control = O2ClassicPaletteColor.o2_classic_color_grey_3,
        controlActive = O2ClassicPaletteColor.o2_classic_color_gem,
        controlError = O2ClassicPaletteColor.o2_classic_color_pepper,
        divider = O2ClassicPaletteColor.o2_classic_color_grey_2,
        dividerInverse = O2ClassicPaletteColor.o2_classic_color_white_20_alpha,
        error = O2ClassicPaletteColor.o2_classic_color_pepper,
        feedbackErrorBackground = O2ClassicPaletteColor.o2_classic_color_pepper,
        feedbackInfoBackground = O2ClassicPaletteColor.o2_classic_color_grey_6,
        gradientBackgroundFirst = O2ClassicPaletteColor.o2_classic_gradient_first,
        gradientBackgroundFourth = O2ClassicPaletteColor.o2_classic_gradient_fourth,
        gradientBackgroundSecond = O2ClassicPaletteColor.o2_classic_gradient_second,
        gradientBackgroundThird = O2ClassicPaletteColor.o2_classic_gradient_third,
        highlight = O2ClassicPaletteColor.o2_classic_color_pink,
        inverse = O2ClassicPaletteColor.o2_classic_color_white,
        loadingBar = O2ClassicPaletteColor.o2_classic_color_gem,
        loadingBarBackground = O2ClassicPaletteColor.o2_classic_color_gem_light_30,
        loginLoadingGradientFirst = O2ClassicPaletteColor.o2_classic_gradient_first,
        loginLoadingGradientFourth = O2ClassicPaletteColor.o2_classic_gradient_fourth,
        loginLoadingGradientSecond = O2ClassicPaletteColor.o2_classic_gradient_second,
        loginLoadingGradientThird = O2ClassicPaletteColor.o2_classic_gradient_third,
        navigationBarBackground = O2ClassicPaletteColor.o2_classic_color_blue,
        navigationBarDivider = O2ClassicPaletteColor.o2_classic_color_blue,
        neutralHigh = O2ClassicPaletteColor.o2_classic_color_grey_6,
        neutralLow = O2ClassicPaletteColor.o2_classic_color_grey_1,
        neutralMedium = O2ClassicPaletteColor.o2_classic_color_grey_5,
        promo = O2ClassicPaletteColor.o2_classic_color_pink,
        skeletonWave = O2ClassicPaletteColor.o2_classic_color_grey_2,
        success = O2ClassicPaletteColor.o2_classic_color_green,
        brandLow = O2ClassicPaletteColor.o2_classic_color_blue_10,
        errorLow = O2ClassicPaletteColor.o2_classic_color_pepper_10,
        promoLow = O2ClassicPaletteColor.o2_classic_color_pink_10,
        successLow = O2ClassicPaletteColor.o2_classic_color_green_10,
        warningLow = O2ClassicPaletteColor.o2_classic_color_orange_10,
        textAppBar = O2ClassicPaletteColor.o2_classic_color_grey_4,
        textAppBarSelected = O2ClassicPaletteColor.o2_classic_color_blue,
        textButtonPrimary = O2ClassicPaletteColor.o2_classic_color_white,
        textButtonPrimaryInverse = O2ClassicPaletteColor.o2_classic_color_sky_blue,
        textButtonPrimaryInverseSelected = O2ClassicPaletteColor.o2_classic_color_sky_blue,
        textButtonSecondary = O2ClassicPaletteColor.o2_classic_color_sky_blue,
        textButtonSecondaryInverse = O2ClassicPaletteColor.o2_classic_color_white,
        textButtonSecondaryInverseSelected = O2ClassicPaletteColor.o2_classic_color_white,
        textButtonSecondarySelected = O2ClassicPaletteColor.o2_classic_color_sky_blue_55,
        textDisabled = O2ClassicPaletteColor.o2_classic_color_grey_3,
        textLink = O2ClassicPaletteColor.o2_classic_color_sky_blue,
        textLinkDanger = O2ClassicPaletteColor.o2_classic_color_pepper,
        textLinkDangerDisabled = O2ClassicPaletteColor.o2_classic_color_pepper_20,
        textLinkDisabled = O2ClassicPaletteColor.o2_classic_color_sky_blue_light,
        textLinkInverse = O2ClassicPaletteColor.o2_classic_color_white,
        textLinkSnackbar = O2ClassicPaletteColor.o2_classic_color_sky_blue_light,
        textNavigationBarPrimary = O2ClassicPaletteColor.o2_classic_color_white,
        textNavigationBarSecondary = O2ClassicPaletteColor.o2_classic_color_sky_blue_light_45,
        textPrimary = O2ClassicPaletteColor.o2_classic_color_grey_6,
        textPrimaryInverse = O2ClassicPaletteColor.o2_classic_color_white,
        textSecondary = O2ClassicPaletteColor.o2_classic_color_grey_5,
        textSecondaryInverse = O2ClassicPaletteColor.o2_classic_color_white,
        errorHigh = O2ClassicPaletteColor.o2_classic_color_pepper_70,
        promoHigh = O2ClassicPaletteColor.o2_classic_color_pink_60,
        successHigh = O2ClassicPaletteColor.o2_classic_color_green_75,
        warningHigh = O2ClassicPaletteColor.o2_classic_color_orange_80,
        warning = O2ClassicPaletteColor.o2_classic_color_orange,
    )

    override val darkColors = lightColors.copy(
        appBarBackground = O2ClassicPaletteColor.o2_classic_color_darkModeGrey,
        background = O2ClassicPaletteColor.o2_classic_color_darkModeBlack,
        backgroundAlternative = O2ClassicPaletteColor.o2_classic_color_darkModeGrey,
        backgroundBrand = O2ClassicPaletteColor.o2_classic_color_darkModeBlack,
        backgroundContainer = O2ClassicPaletteColor.o2_classic_color_darkModeGrey,
        backgroundFeedbackBottom = O2ClassicPaletteColor.o2_classic_color_darkModeBlack,
        backgroundOverlay = O2ClassicPaletteColor.o2_classic_color_darkModeGrey_80_alpha,
        backgroundSkeleton = O2ClassicPaletteColor.o2_classic_color_darkModeGrey6,
        backgroundSkeletonInverse = O2ClassicPaletteColor.o2_classic_color_darkModeGrey6,
        border = O2ClassicPaletteColor.o2_classic_color_darkModeGrey,
        borderLight = O2ClassicPaletteColor.o2_classic_color_darkModeBlack,
        brand = O2ClassicPaletteColor.o2_classic_color_sky_blue,
        brandHigh = O2ClassicPaletteColor.o2_classic_color_darkModeGrey6,
        buttonLinkBackgroundSelected = O2ClassicPaletteColor.o2_classic_color_white_5_alpha,
        buttonLinkBackgroundSelectedInverse = O2ClassicPaletteColor.o2_classic_color_darkModeGrey,
        buttonPrimaryBackgroundInverse = O2ClassicPaletteColor.o2_classic_color_sky_blue,
        buttonPrimaryBackgroundSelectedInverse = O2ClassicPaletteColor.o2_classic_color_sky_blue_55,
        buttonSecondaryBorderInverse = O2ClassicPaletteColor.o2_classic_color_sky_blue,
        buttonSecondaryBorderSelectedInverse = O2ClassicPaletteColor.o2_classic_color_sky_blue_55,
        carouselIndicatorActiveColor = O2ClassicPaletteColor.o2_classic_color_gem,
        carouselIndicatorInactiveColor = O2ClassicPaletteColor.o2_classic_color_darkModeGrey6,
        control = O2ClassicPaletteColor.o2_classic_color_darkModeGrey6,
        divider = O2ClassicPaletteColor.o2_classic_color_white_5_alpha,
        dividerInverse = O2ClassicPaletteColor.o2_classic_color_white_5_alpha,
        feedbackInfoBackground = O2ClassicPaletteColor.o2_classic_color_darkModeGrey6,
        inverse = O2ClassicPaletteColor.o2_classic_color_grey_2,
        navigationBarBackground = O2ClassicPaletteColor.o2_classic_color_darkModeBlack,
        navigationBarDivider = O2ClassicPaletteColor.o2_classic_color_darkModeBlack,
        neutralHigh = O2ClassicPaletteColor.o2_classic_color_grey_2,
        neutralLow = O2ClassicPaletteColor.o2_classic_color_darkModeGrey6,
        skeletonWave = O2ClassicPaletteColor.o2_classic_color_grey_5_30_alpha,
        brandLow = O2ClassicPaletteColor.o2_classic_color_darkModeGrey,
        errorLow = O2ClassicPaletteColor.o2_classic_color_darkModeGrey,
        promoLow = O2ClassicPaletteColor.o2_classic_color_darkModeGrey,
        successLow = O2ClassicPaletteColor.o2_classic_color_darkModeGrey,
        warningLow = O2ClassicPaletteColor.o2_classic_color_darkModeGrey,
        textAppBar = O2ClassicPaletteColor.o2_classic_color_grey_5,
        textAppBarSelected = O2ClassicPaletteColor.o2_classic_color_grey_2,
        textButtonPrimary = O2ClassicPaletteColor.o2_classic_color_grey_2,
        textButtonPrimaryInverse = O2ClassicPaletteColor.o2_classic_color_grey_2,
        textButtonPrimaryInverseSelected = O2ClassicPaletteColor.o2_classic_color_grey_2,
        textButtonSecondary = O2ClassicPaletteColor.o2_classic_color_grey_2,
        textButtonSecondaryInverse = O2ClassicPaletteColor.o2_classic_color_grey_2,
        textButtonSecondaryInverseSelected = O2ClassicPaletteColor.o2_classic_color_grey_4,
        textButtonSecondarySelected = O2ClassicPaletteColor.o2_classic_color_grey_4,
        textDisabled = O2ClassicPaletteColor.o2_classic_color_grey_5,
        textLink = O2ClassicPaletteColor.o2_classic_color_sky_blue_light,
        textLinkDangerDisabled = O2ClassicPaletteColor.o2_classic_color_grey_6,
        textLinkDisabled = O2ClassicPaletteColor.o2_classic_color_darkModeGrey6,
        textLinkInverse = O2ClassicPaletteColor.o2_classic_color_sky_blue_light,
        textNavigationBarPrimary = O2ClassicPaletteColor.o2_classic_color_grey_2,
        textNavigationBarSecondary = O2ClassicPaletteColor.o2_classic_color_grey_4,
        textPrimary = O2ClassicPaletteColor.o2_classic_color_grey_2,
        textPrimaryInverse = O2ClassicPaletteColor.o2_classic_color_grey_2,
        textSecondary = O2ClassicPaletteColor.o2_classic_color_grey_4,
        textSecondaryInverse = O2ClassicPaletteColor.o2_classic_color_grey_4,
        errorHigh = O2ClassicPaletteColor.o2_classic_color_pepper_40,
        promoHigh = O2ClassicPaletteColor.o2_classic_color_pink_40,
        successHigh = O2ClassicPaletteColor.o2_classic_color_green_40,
        warningHigh = O2ClassicPaletteColor.o2_classic_color_orange_40,
    )
}

private object O2ClassicPaletteColor {
    val o2_classic_color_blue = Color(0xFF032B5A)
    val o2_classic_color_blue_10 = Color(0xFFE6EAEE)
    val o2_classic_color_blue_30 = Color(0xFF8195AC)
    val o2_classic_color_blue_45 = Color(0xFF6C8BAF)
    val o2_classic_color_blue_55 = Color(0xFF04264E)
    val o2_classic_color_sky_blue = Color(0xFF0090D0)
    val o2_classic_color_sky_blue_55 = Color(0xFF057DB2)
    val o2_classic_color_sky_blue_light = Color(0xFF65B4E4)
    val o2_classic_color_sky_blue_light_45 = Color(0xFF80C7E7)
    val o2_classic_color_sky_blue_light_20 = Color(0xFFD0E8F6)
    val o2_classic_color_sky_blue_light_10 = Color(0xFFE9F5FB)
    val o2_classic_color_deep_sky_blue = Color(0xFF7FD4FE)

    val o2_classic_color_gem = Color(0xFF01B7B4)
    val o2_classic_color_gem_dark = Color(0xFF099E9B)
    val o2_classic_color_gem_light_30 = Color(0xFF99E2E1)

    val o2_classic_color_yellow = Color(0xFFFFCC00)

    val o2_classic_color_green = Color(0xFF84B50F)
    val o2_classic_color_green_10 = Color(0xFFF3F8E7)
    val o2_classic_color_green_40 = Color(0xFFA9CB57)
    val o2_classic_color_green_75 = Color(0xFF4D621D)

    val o2_classic_color_pepper = Color(0xFFFF374A)
    val o2_classic_color_pepper_10 = Color(0xFFFFEBED)
    val o2_classic_color_pepper_20 = Color(0xFFFFC3C8)
    val o2_classic_color_pepper_40 = Color(0xFFFF7380)
    val o2_classic_color_pepper_55 = Color(0xFFD73241)
    val o2_classic_color_pepper_70 = Color(0xFFB22634)

    val o2_classic_color_orange = Color(0xFFFF7F41)
    val o2_classic_color_orange_10 = Color(0xFFFFF2EC)
    val o2_classic_color_orange_40 = Color(0xFFFFA57A)
    val o2_classic_color_orange_80 = Color(0xFF73391D)
    val o2_classic_color_orange_light = Color(0xFFFFD6C2)

    val o2_classic_color_coral = Color(0xFFFF706E)

    val o2_classic_color_pink = Color(0xFFEB3C7D)
    val o2_classic_color_pink_10 = Color(0xFFFDEBF2)
    val o2_classic_color_pink_40 = Color(0xFFF59DBE)
    val o2_classic_color_pink_60 = Color(0xFFBC3064)

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
    val o2_classic_color_sky_blue_light_20_25_alpha = Color(0x40D0E8F6)
    val o2_classic_color_sky_blue_light_45_25_alpha = Color(0x4080C7E7)
    val o2_classic_color_blue_55_40_alpha = Color(0x6604264E)

    // Dark mode
    val o2_classic_color_darkModeBlack = Color(0xFF191919)
    val o2_classic_color_darkModeGrey = Color(0xFF242424)
    val o2_classic_color_darkModeGrey_80_alpha = Color(0xCC242424)
    val o2_classic_color_darkModeGrey6 = Color(0xFF313235)
}
