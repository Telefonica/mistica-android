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
        backgroundContainer = VivoPaletteColor.vivo_color_white,
        backgroundBrand = VivoPaletteColor.vivo_color_purple,
        backgroundOverlay = VivoPaletteColor.vivo_color_grey_6_60_alpha,
        backgroundSkeleton = VivoPaletteColor.vivo_color_grey_1,
        backgroundSkeletonInverse = VivoPaletteColor.vivo_color_white_20_alpha,
        navigationBarBackground = VivoPaletteColor.vivo_color_purple,
        backgroundAlternative = VivoPaletteColor.vivo_color_grey_1,
        backgroundFeedbackBottom = VivoPaletteColor.vivo_color_purple,
        skeletonWave = VivoPaletteColor.vivo_color_grey_2,
        borderLight = VivoPaletteColor.vivo_color_grey_1,
        border = VivoPaletteColor.vivo_color_grey_3,
        borderDark = VivoPaletteColor.vivo_color_grey_5,
        borderSelected = VivoPaletteColor.vivo_color_purple,
        buttonDangerBackground = VivoPaletteColor.vivo_color_pepper,
        buttonDangerBackgroundDisabled = VivoPaletteColor.vivo_color_pepper_light30,
        buttonDangerBackgroundSelected = VivoPaletteColor.vivo_color_pepper_dark,
        buttonLinkBackgroundSelected = VivoPaletteColor.vivo_color_purple_light10,
        buttonLinkBackgroundSelectedInverse = VivoPaletteColor.vivo_color_white_20_alpha,
        buttonPrimaryBackground = VivoPaletteColor.vivo_color_purple,
        buttonPrimaryBackgroundDisabled = VivoPaletteColor.vivo_color_purple_light20,
        buttonPrimaryBackgroundDisabledInverse = VivoPaletteColor.vivo_color_purple_light50,
        buttonPrimaryBackgroundInverse = VivoPaletteColor.vivo_color_white,
        buttonPrimaryBackgroundSelected = VivoPaletteColor.vivo_color_purple_dark,
        buttonPrimaryBackgroundSelectedInverse = VivoPaletteColor.vivo_color_purple_light50,
        buttonSecondaryBackground = VivoPaletteColor.vivo_color_purple,
        buttonSecondaryBackgroundDisabled = VivoPaletteColor.vivo_color_purple_light20,
        buttonSecondaryBackgroundSelected = VivoPaletteColor.vivo_color_purple_dark,
        buttonSecondaryBorderDisabledInverse = VivoPaletteColor.vivo_color_purple_light50,
        buttonSecondaryBorderInverse = VivoPaletteColor.vivo_color_white,
        buttonSecondaryBorderSelectedInverse = VivoPaletteColor.vivo_color_purple_light50,
        textButtonPrimary = VivoPaletteColor.vivo_color_white,
        textButtonPrimaryDisabled = VivoPaletteColor.vivo_color_white,
        textButtonPrimaryInverse = VivoPaletteColor.vivo_color_purple,
        textButtonPrimaryInverseDisabled = VivoPaletteColor.vivo_color_purple_light20,
        textButtonPrimaryInverseSelected = VivoPaletteColor.vivo_color_purple,
        textButtonSecondary = VivoPaletteColor.vivo_color_purple,
        textButtonSecondaryDisabled = VivoPaletteColor.vivo_color_purple_light20,
        textButtonSecondarySelected = VivoPaletteColor.vivo_color_purple_dark,
        textButtonSecondaryInverse = VivoPaletteColor.vivo_color_white,
        textButtonSecondaryInverseDisabled = VivoPaletteColor.vivo_color_purple_light50,
        textButtonSecondaryInverseSelected = VivoPaletteColor.vivo_color_white,
        textLink = VivoPaletteColor.vivo_color_purple,
        textLinkInverse = VivoPaletteColor.vivo_color_white,
        textLinkDanger = VivoPaletteColor.vivo_color_pepper,
        textLinkDangerDisabled = VivoPaletteColor.vivo_color_pepper_light30,
        textLinkDisabled = VivoPaletteColor.vivo_color_purple_light50,
        textLinkSnackbar = VivoPaletteColor.vivo_color_purple_light50,
        control = VivoPaletteColor.vivo_color_grey_3,
        controlActive = VivoPaletteColor.vivo_color_purple,
        controlError = VivoPaletteColor.vivo_color_pepper,
        loadingBar = VivoPaletteColor.vivo_color_pink,
        loadingBarBackground = VivoPaletteColor.vivo_color_pepper_light30,
        divider = VivoPaletteColor.vivo_color_grey_2,
        dividerInverse = VivoPaletteColor.vivo_color_white_20_alpha,
        navigationBarDivider = VivoPaletteColor.vivo_color_purple,
        badge = VivoPaletteColor.vivo_color_pepper_dark,
        feedbackErrorBackground = VivoPaletteColor.vivo_color_pepper,
        feedbackInfoBackground = VivoPaletteColor.vivo_color_grey_6,
        brand = VivoPaletteColor.vivo_color_purple,
        brandDark = VivoPaletteColor.vivo_color_purple_dark,
        inverse = VivoPaletteColor.vivo_color_white,
        neutralHigh = VivoPaletteColor.vivo_color_grey_6,
        neutralMedium = VivoPaletteColor.vivo_color_grey_5,
        neutralLow = VivoPaletteColor.vivo_color_grey_3,
        promo = VivoPaletteColor.vivo_color_purple,
        highlight = VivoPaletteColor.vivo_color_pink,
        textPrimary = VivoPaletteColor.vivo_color_grey_6,
        textPrimaryInverse = VivoPaletteColor.vivo_color_white,
        textSecondary = VivoPaletteColor.vivo_color_grey_5,
        textSecondaryInverse = VivoPaletteColor.vivo_color_white,
        textDisabled = VivoPaletteColor.vivo_color_grey_3,
        textAmount = VivoPaletteColor.vivo_color_purple,
        error = VivoPaletteColor.vivo_color_pepper,
        success = VivoPaletteColor.vivo_color_green,
        warning = VivoPaletteColor.vivo_color_orange,
        textNavigationBarPrimary = VivoPaletteColor.vivo_color_white,
        textNavigationBarSecondary = VivoPaletteColor.vivo_color_purple_light50,
        textAppBar = VivoPaletteColor.vivo_color_grey_4,
        textAppBarSelected = VivoPaletteColor.vivo_color_purple,
        gradientBackgroundFirst = VivoPaletteColor.vivo_color_purple,
        gradientBackgroundSecond = VivoPaletteColor.vivo_color_purple,
        gradientBackgroundThird = VivoPaletteColor.vivo_color_purple,
        gradientBackgroundFourth = VivoPaletteColor.vivo_color_purple,
        loginLoadingGradientFirst = VivoPaletteColor.vivo_color_purple,
        loginLoadingGradientSecond = VivoPaletteColor.vivo_color_purple,
        loginLoadingGradientThird = VivoPaletteColor.vivo_color_purple,
        loginLoadingGradientFourth = VivoPaletteColor.vivo_color_purple,
    )

    override val darkColors = lightColors.copy(
        appBarBackground = VivoPaletteColor.vivo_color_darkModeGrey,
        background = VivoPaletteColor.vivo_color_darkModeBlack,
        backgroundContainer = VivoPaletteColor.vivo_color_darkModeGrey,
        backgroundBrand = VivoPaletteColor.vivo_color_darkModeBlack,
        backgroundOverlay = VivoPaletteColor.vivo_color_darkModeGrey_80_alpha,
        backgroundSkeleton = VivoPaletteColor.vivo_color_darkModeGrey6,
        backgroundSkeletonInverse = VivoPaletteColor.vivo_color_darkModeGrey6,
        navigationBarBackground = VivoPaletteColor.vivo_color_darkModeBlack,
        backgroundAlternative = VivoPaletteColor.vivo_color_darkModeGrey,
        backgroundFeedbackBottom = VivoPaletteColor.vivo_color_darkModeBlack,
        skeletonWave = VivoPaletteColor.vivo_color_grey_5_30_alpha,
        borderLight = VivoPaletteColor.vivo_color_darkModeBlack,
        border = VivoPaletteColor.vivo_color_darkModeGrey,
        borderSelected = VivoPaletteColor.vivo_color_purple_light80,
        buttonDangerBackgroundDisabled = VivoPaletteColor.vivo_color_darkModeGrey,
        buttonLinkBackgroundSelected = VivoPaletteColor.vivo_color_white_5_alpha,
        buttonLinkBackgroundSelectedInverse = VivoPaletteColor.vivo_color_white_5_alpha,
        buttonPrimaryBackground = VivoPaletteColor.vivo_color_purple_light80,
        buttonPrimaryBackgroundDisabled = VivoPaletteColor.vivo_color_darkModeGrey,
        buttonPrimaryBackgroundDisabledInverse = VivoPaletteColor.vivo_color_darkModeGrey,
        buttonPrimaryBackgroundInverse = VivoPaletteColor.vivo_color_purple_light80,
        buttonPrimaryBackgroundSelectedInverse = VivoPaletteColor.vivo_color_purple_dark,
        buttonSecondaryBackground = VivoPaletteColor.vivo_color_purple_light80,
        buttonSecondaryBackgroundDisabled = VivoPaletteColor.vivo_color_darkModeGrey,
        buttonSecondaryBorderDisabledInverse = VivoPaletteColor.vivo_color_darkModeGrey,
        buttonSecondaryBorderInverse = VivoPaletteColor.vivo_color_purple_light80,
        buttonSecondaryBorderSelectedInverse = VivoPaletteColor.vivo_color_purple_dark,
        textButtonPrimary = VivoPaletteColor.vivo_color_grey_2,
        textButtonPrimaryDisabled = VivoPaletteColor.vivo_color_grey_5,
        textButtonPrimaryInverse = VivoPaletteColor.vivo_color_grey_2,
        textButtonPrimaryInverseDisabled = VivoPaletteColor.vivo_color_grey_5,
        textButtonPrimaryInverseSelected = VivoPaletteColor.vivo_color_grey_2,
        textButtonSecondary = VivoPaletteColor.vivo_color_grey_2,
        textButtonSecondaryDisabled = VivoPaletteColor.vivo_color_grey_5,
        textButtonSecondarySelected = VivoPaletteColor.vivo_color_grey_4,
        textButtonSecondaryInverse = VivoPaletteColor.vivo_color_grey_2,
        textButtonSecondaryInverseDisabled = VivoPaletteColor.vivo_color_grey_5,
        textButtonSecondaryInverseSelected = VivoPaletteColor.vivo_color_grey_4,
        textLink = VivoPaletteColor.vivo_color_purple_light50,
        textLinkInverse = VivoPaletteColor.vivo_color_purple_light50,
        textLinkDangerDisabled = VivoPaletteColor.vivo_color_grey_5,
        textLinkDisabled = VivoPaletteColor.vivo_color_darkModeGrey6,
        control = VivoPaletteColor.vivo_color_darkModeGrey6,
        controlActive = VivoPaletteColor.vivo_color_purple_light80,
        loadingBar = VivoPaletteColor.vivo_color_purple_light80,
        loadingBarBackground = VivoPaletteColor.vivo_color_darkModeGrey6,
        divider = VivoPaletteColor.vivo_color_white_5_alpha,
        dividerInverse = VivoPaletteColor.vivo_color_white_5_alpha,
        navigationBarDivider = VivoPaletteColor.vivo_color_darkModeBlack,
        feedbackInfoBackground = VivoPaletteColor.vivo_color_darkModeGrey6,
        brand = VivoPaletteColor.vivo_color_purple_light80,
        brandDark = VivoPaletteColor.vivo_color_darkModeGrey6,
        inverse = VivoPaletteColor.vivo_color_grey_2,
        neutralHigh = VivoPaletteColor.vivo_color_grey_2,
        neutralLow = VivoPaletteColor.vivo_color_darkModeGrey6,
        promo = VivoPaletteColor.vivo_color_purple_light80,
        textPrimary = VivoPaletteColor.vivo_color_grey_2,
        textPrimaryInverse = VivoPaletteColor.vivo_color_grey_2,
        textSecondary = VivoPaletteColor.vivo_color_grey_4,
        textSecondaryInverse = VivoPaletteColor.vivo_color_grey_4,
        textDisabled = VivoPaletteColor.vivo_color_grey_5,
        textAmount = VivoPaletteColor.vivo_color_purple_light50,
        textNavigationBarPrimary = VivoPaletteColor.vivo_color_grey_2,
        textNavigationBarSecondary = VivoPaletteColor.vivo_color_grey_4,
        textAppBar = VivoPaletteColor.vivo_color_grey_5,
        textAppBarSelected = VivoPaletteColor.vivo_color_grey_2,
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
    val vivo_color_green_light40 = Color(0xFFD6EAAD)

    val vivo_color_blue = Color(0xFF00ABDB)

    val vivo_color_orange = Color(0xFFFF9900)
    val vivo_color_orange_dark = Color(0xFFFA6324)
    val vivo_color_orange_light = Color(0xFFFFD699)
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
