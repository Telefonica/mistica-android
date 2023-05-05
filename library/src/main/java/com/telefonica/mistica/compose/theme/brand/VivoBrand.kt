package com.telefonica.mistica.compose.theme.brand

import androidx.compose.ui.graphics.Color
import com.telefonica.mistica.R
import com.telefonica.mistica.compose.theme.color.MisticaColors

object VivoBrand : Brand {

    override val compatibilityTheme: Int
        get() = R.style.MisticaTheme_Vivo

    override val lightColors = MisticaColors(
        appBarBackground = VivoPaletteColor.vivo_color_white,
        background = VivoPaletteColor.vivo_color_white,
        backgroundAlternative = VivoPaletteColor.vivo_color_grey_1,
        backgroundBrand = VivoPaletteColor.vivo_color_purple,
        backgroundBrandSecondary = VivoPaletteColor.vivo_color_purple,
        backgroundContainer = VivoPaletteColor.vivo_color_white,
        backgroundFeedbackBottom = VivoPaletteColor.vivo_color_purple,
        backgroundOverlay = VivoPaletteColor.vivo_color_grey_6_60_alpha,
        backgroundSkeleton = VivoPaletteColor.vivo_color_grey_1,
        backgroundSkeletonInverse = VivoPaletteColor.vivo_color_white_20_alpha,
        badge = VivoPaletteColor.vivo_color_pepper_dark,
        border = VivoPaletteColor.vivo_color_grey_3,
        borderHigh = VivoPaletteColor.vivo_color_grey_5,
        borderLow = VivoPaletteColor.vivo_color_grey_1,
        borderSelected = VivoPaletteColor.vivo_color_purple,
        brand = VivoPaletteColor.vivo_color_purple,
        brandHigh = VivoPaletteColor.vivo_color_purple_dark,
        buttonDangerBackground = VivoPaletteColor.vivo_color_pepper,
        buttonDangerBackgroundSelected = VivoPaletteColor.vivo_color_pepper_dark,
        buttonLinkBackgroundSelected = VivoPaletteColor.vivo_color_purple_light10,
        buttonLinkBackgroundInverseSelected = VivoPaletteColor.vivo_color_white_20_alpha,
        buttonPrimaryBackground = VivoPaletteColor.vivo_color_purple,
        buttonPrimaryBackgroundInverse = VivoPaletteColor.vivo_color_white,
        buttonPrimaryBackgroundSelected = VivoPaletteColor.vivo_color_purple_dark,
        buttonPrimaryBackgroundInverseSelected = VivoPaletteColor.vivo_color_purple_light50,
        buttonSecondaryBorder = VivoPaletteColor.vivo_color_purple,
        buttonSecondaryBackgroundSelected = VivoPaletteColor.vivo_color_purple_dark,
        buttonSecondaryBackgroundSelectedInverse = VivoPaletteColor.vivo_color_white_15_alpha,
        buttonSecondaryBorderInverse = VivoPaletteColor.vivo_color_white,
        buttonSecondaryBorderInverseSelected = VivoPaletteColor.vivo_color_purple_light50,
        carouselIndicatorActiveColor = VivoPaletteColor.vivo_color_purple,
        carouselIndicatorInactiveColor = VivoPaletteColor.vivo_color_grey_3,
        control = VivoPaletteColor.vivo_color_grey_3,
        controlActive = VivoPaletteColor.vivo_color_purple,
        controlError = VivoPaletteColor.vivo_color_pepper,
        divider = VivoPaletteColor.vivo_color_grey_2,
        dividerInverse = VivoPaletteColor.vivo_color_white_20_alpha,
        error = VivoPaletteColor.vivo_color_pepper,
        feedbackErrorBackground = VivoPaletteColor.vivo_color_pepper,
        feedbackInfoBackground = VivoPaletteColor.vivo_color_grey_6,
        gradientBackgroundFirst = VivoPaletteColor.vivo_color_purple,
        gradientBackgroundFourth = VivoPaletteColor.vivo_color_purple,
        gradientBackgroundSecond = VivoPaletteColor.vivo_color_purple,
        gradientBackgroundThird = VivoPaletteColor.vivo_color_purple,
        highlight = VivoPaletteColor.vivo_color_pink,
        inverse = VivoPaletteColor.vivo_color_white,
        loadingBar = VivoPaletteColor.vivo_color_pink,
        loadingBarBackground = VivoPaletteColor.vivo_color_pepper_light30,
        loginLoadingGradientFirst = VivoPaletteColor.vivo_color_purple,
        loginLoadingGradientFourth = VivoPaletteColor.vivo_color_purple,
        loginLoadingGradientSecond = VivoPaletteColor.vivo_color_purple,
        loginLoadingGradientThird = VivoPaletteColor.vivo_color_purple,
        navigationBarBackground = VivoPaletteColor.vivo_color_purple,
        navigationBarDivider = VivoPaletteColor.vivo_color_purple,
        neutralHigh = VivoPaletteColor.vivo_color_grey_6,
        neutralLow = VivoPaletteColor.vivo_color_grey_1,
        neutralMedium = VivoPaletteColor.vivo_color_grey_5,
        neutralMediumInverse = VivoPaletteColor.vivo_color_grey_5,
        promo = VivoPaletteColor.vivo_color_purple,
        skeletonWave = VivoPaletteColor.vivo_color_grey_2,
        success = VivoPaletteColor.vivo_color_green,
        brandLow = VivoPaletteColor.vivo_color_purple_light10,
        errorLow = VivoPaletteColor.vivo_color_pepper_light10,
        promoLow = VivoPaletteColor.vivo_color_purple_light10,
        successLow = VivoPaletteColor.vivo_color_green_light10,
        warningLow = VivoPaletteColor.vivo_color_orange_light10,
        textAppBar = VivoPaletteColor.vivo_color_grey_4,
        textAppBarSelected = VivoPaletteColor.vivo_color_purple,
        textButtonPrimary = VivoPaletteColor.vivo_color_white,
        textButtonPrimaryInverse = VivoPaletteColor.vivo_color_purple,
        textButtonPrimaryInverseSelected = VivoPaletteColor.vivo_color_purple,
        textButtonSecondary = VivoPaletteColor.vivo_color_purple,
        textButtonSecondaryInverse = VivoPaletteColor.vivo_color_white,
        textButtonSecondaryInverseSelected = VivoPaletteColor.vivo_color_white,
        textButtonSecondarySelected = VivoPaletteColor.vivo_color_purple_dark,
        textLink = VivoPaletteColor.vivo_color_purple,
        textLinkDanger = VivoPaletteColor.vivo_color_pepper,
        textLinkInverse = VivoPaletteColor.vivo_color_white,
        textLinkSnackbar = VivoPaletteColor.vivo_color_purple_light50,
        textNavigationBarPrimary = VivoPaletteColor.vivo_color_white,
        textNavigationBarSecondary = VivoPaletteColor.vivo_color_purple_light50,
        textPrimary = VivoPaletteColor.vivo_color_grey_6,
        textPrimaryInverse = VivoPaletteColor.vivo_color_white,
        textSecondary = VivoPaletteColor.vivo_color_grey_5,
        textSecondaryInverse = VivoPaletteColor.vivo_color_purple_light20,
        errorHigh = VivoPaletteColor.vivo_color_pepper_dark_80,
        errorHighInverse = VivoPaletteColor.vivo_color_pepper_dark_80,
        promoHigh = VivoPaletteColor.vivo_color_purple,
        promoHighInverse = VivoPaletteColor.vivo_color_purple,
        successHigh = VivoPaletteColor.vivo_color_green_dark,
        successHighInverse = VivoPaletteColor.vivo_color_green_dark,
        warningHigh = VivoPaletteColor.vivo_color_orange_dark,
        warningHighInverse = VivoPaletteColor.vivo_color_orange_dark,
        warning = VivoPaletteColor.vivo_color_orange,
        closeButtonOverlayColor = VivoPaletteColor.vivo_color_purple_light20_25_alpha
    )

    override val darkColors = lightColors.copy(
        appBarBackground = VivoPaletteColor.vivo_color_darkModeGrey,
        background = VivoPaletteColor.vivo_color_darkModeBlack,
        backgroundAlternative = VivoPaletteColor.vivo_color_darkModeGrey,
        backgroundBrand = VivoPaletteColor.vivo_color_darkModeBlack,
        backgroundBrandSecondary = VivoPaletteColor.vivo_color_darkModeBlack,
        backgroundContainer = VivoPaletteColor.vivo_color_darkModeGrey,
        backgroundFeedbackBottom = VivoPaletteColor.vivo_color_darkModeBlack,
        backgroundOverlay = VivoPaletteColor.vivo_color_darkModeGrey_80_alpha,
        backgroundSkeleton = VivoPaletteColor.vivo_color_darkModeGrey6,
        backgroundSkeletonInverse = VivoPaletteColor.vivo_color_darkModeGrey6,
        border = VivoPaletteColor.vivo_color_darkModeGrey,
        borderLow = VivoPaletteColor.vivo_color_darkModeBlack,
        borderSelected = VivoPaletteColor.vivo_color_purple_light80,
        brand = VivoPaletteColor.vivo_color_purple_light80,
        brandHigh = VivoPaletteColor.vivo_color_darkModeGrey6,
        buttonLinkBackgroundSelected = VivoPaletteColor.vivo_color_white_5_alpha,
        buttonLinkBackgroundInverseSelected = VivoPaletteColor.vivo_color_white_5_alpha,
        buttonPrimaryBackground = VivoPaletteColor.vivo_color_purple_light80,
        buttonPrimaryBackgroundInverse = VivoPaletteColor.vivo_color_purple_light80,
        buttonPrimaryBackgroundInverseSelected = VivoPaletteColor.vivo_color_purple_dark,
        buttonSecondaryBorder = VivoPaletteColor.vivo_color_purple_light80,
        buttonSecondaryBorderInverse = VivoPaletteColor.vivo_color_purple_light80,
        buttonSecondaryBorderInverseSelected = VivoPaletteColor.vivo_color_purple_dark,
        carouselIndicatorActiveColor = VivoPaletteColor.vivo_color_purple_light80,
        carouselIndicatorInactiveColor = VivoPaletteColor.vivo_color_darkModeGrey6,
        control = VivoPaletteColor.vivo_color_darkModeGrey6,
        controlActive = VivoPaletteColor.vivo_color_purple_light80,
        divider = VivoPaletteColor.vivo_color_white_5_alpha,
        dividerInverse = VivoPaletteColor.vivo_color_white_5_alpha,
        feedbackInfoBackground = VivoPaletteColor.vivo_color_darkModeGrey6,
        inverse = VivoPaletteColor.vivo_color_grey_2,
        loadingBar = VivoPaletteColor.vivo_color_purple_light80,
        loadingBarBackground = VivoPaletteColor.vivo_color_darkModeGrey6,
        navigationBarBackground = VivoPaletteColor.vivo_color_darkModeBlack,
        navigationBarDivider = VivoPaletteColor.vivo_color_darkModeBlack,
        neutralHigh = VivoPaletteColor.vivo_color_grey_2,
        neutralLow = VivoPaletteColor.vivo_color_darkModeGrey6,
        neutralMedium = VivoPaletteColor.vivo_color_grey_5,
        neutralMediumInverse = VivoPaletteColor.vivo_color_grey_5,
        promo = VivoPaletteColor.vivo_color_purple_light80,
        skeletonWave = VivoPaletteColor.vivo_color_grey_5_30_alpha,
        brandLow = VivoPaletteColor.vivo_color_darkModeGrey,
        errorLow = VivoPaletteColor.vivo_color_darkModeGrey,
        promoLow = VivoPaletteColor.vivo_color_darkModeGrey,
        successLow = VivoPaletteColor.vivo_color_darkModeGrey,
        warningLow = VivoPaletteColor.vivo_color_darkModeGrey,
        textAppBar = VivoPaletteColor.vivo_color_grey_5,
        textAppBarSelected = VivoPaletteColor.vivo_color_grey_2,
        textButtonPrimary = VivoPaletteColor.vivo_color_grey_2,
        textButtonPrimaryInverse = VivoPaletteColor.vivo_color_grey_2,
        textButtonPrimaryInverseSelected = VivoPaletteColor.vivo_color_grey_2,
        textButtonSecondary = VivoPaletteColor.vivo_color_grey_2,
        textButtonSecondaryInverse = VivoPaletteColor.vivo_color_grey_2,
        textButtonSecondaryInverseSelected = VivoPaletteColor.vivo_color_grey_4,
        textButtonSecondarySelected = VivoPaletteColor.vivo_color_grey_4,
        textLink = VivoPaletteColor.vivo_color_purple_light50,
        textLinkInverse = VivoPaletteColor.vivo_color_purple_light50,
        textNavigationBarPrimary = VivoPaletteColor.vivo_color_grey_2,
        textNavigationBarSecondary = VivoPaletteColor.vivo_color_grey_4,
        textPrimary = VivoPaletteColor.vivo_color_grey_2,
        textPrimaryInverse = VivoPaletteColor.vivo_color_grey_2,
        textSecondary = VivoPaletteColor.vivo_color_grey_4,
        textSecondaryInverse = VivoPaletteColor.vivo_color_grey_4,
        errorHigh = VivoPaletteColor.vivo_color_pepper_light40,
        errorHighInverse = VivoPaletteColor.vivo_color_pepper_dark_80,
        promoHigh = VivoPaletteColor.vivo_color_purple_light50,
        promoHighInverse = VivoPaletteColor.vivo_color_purple,
        successHigh = VivoPaletteColor.vivo_color_green_light30,
        successHighInverse = VivoPaletteColor.vivo_color_green_dark,
        warningHigh = VivoPaletteColor.vivo_color_orange_light40,
        warningHighInverse = VivoPaletteColor.vivo_color_orange_dark,
        closeButtonOverlay = VivoPaletteColor.vivo_color_purple_light20_40_alpha
    )
}

private object VivoPaletteColor {
    val vivo_color_purple = Color(0xFF660099)
    val vivo_color_purple_dark = Color(0xFF461E5F)
    val vivo_color_purple_light10 = Color(0xFFEFE5F4)
    val vivo_color_purple_light20 = Color(0xFFE0CCEB)
    val vivo_color_purple_light50 = Color(0xFFB280CC)
    val vivo_color_purple_light80 = Color(0xFF8433AD)
    val vivo_color_purple_light90 = Color(0xFF751AA3)

    val vivo_color_green = Color(0xFF99CC33)
    val vivo_color_green_dark = Color(0xFF33A14A)
    val vivo_color_green_light10 = Color(0xFFEDF8E8)
    val vivo_color_green_light30 = Color(0xFF91AE9E)

    val vivo_color_blue = Color(0xFF00ABDB)

    val vivo_color_orange = Color(0xFFFF9900)
    val vivo_color_orange_dark = Color(0xFFFA6324)
    val vivo_color_orange_light10 = Color(0xFFFFEFE1)
    val vivo_color_orange_light40 = Color(0xFFFFB84C)

    val vivo_color_pink = Color(0xFFEB3D7D)

    val vivo_color_pepper = Color(0xFFCC1F59)
    val vivo_color_pepper_dark = Color(0xFFB71D63)
    val vivo_color_pepper_dark_80 = Color(0xFF8F2052)
    val vivo_color_pepper_light10 = Color(0xFFFCE4EF)
    val vivo_color_pepper_light30 = Color(0xFFF7B1CB)
    val vivo_color_pepper_light40 = Color(0xFFDB628B)

    val vivo_color_grey_1 = Color(0xFFF6F6F6)
    val vivo_color_grey_2 = Color(0xFFEEEEEE)
    val vivo_color_grey_3 = Color(0xFFDDDDDD)
    val vivo_color_grey_4 = Color(0xFF999999)
    val vivo_color_grey_5 = Color(0xFF666666)
    val vivo_color_grey_6 = Color(0xFF000000)
    val vivo_color_white = Color(0xFFFFFFFF)

    // Android specific palette for colors with custom alpha
    val vivo_color_blue_30_alpha = Color(0x4D00ABDB)
    val vivo_color_white_5_alpha = Color(0x0DFFFFFF)
    val vivo_color_white_15_alpha = Color(0x26FFFFFF)
    val vivo_color_white_20_alpha = Color(0x33FFFFFF)
    val vivo_color_white_50_alpha = Color(0x80FFFFFF)
    val vivo_color_grey_5_30_alpha = Color(0x4D666666)
    val vivo_color_grey_6_30_alpha = Color(0x4D000000)
    val vivo_color_grey_6_40_alpha = Color(0x66000000)
    val vivo_color_grey_6_50_alpha = Color(0x80000000)
    val vivo_color_grey_6_60_alpha = Color(0x99000000)
    val vivo_color_grey_6_80_alpha = Color(0xCC000000)
    val vivo_color_purple_light20_25_alpha = Color(0x40E0CCEB)
    val vivo_color_purple_light20_40_alpha = Color(0x66E0CCEB)
    val vivo_color_purple_light50_25_alpha = Color(0x40B280CC)
    val vivo_color_purple_dark_80_alpha = Color(0xCC461E5F)

    // Dark mode
    val vivo_color_darkModeBlack = Color(0xFF191919)
    val vivo_color_darkModeGrey = Color(0xFF242424)
    val vivo_color_darkModeGrey_80_alpha = Color(0xCC242424)
    val vivo_color_darkModeGrey6 = Color(0xFF313235)
}
