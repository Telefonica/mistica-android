package com.telefonica.mistica.compose.theme.brand

import androidx.compose.ui.graphics.Color
import com.telefonica.mistica.R
import com.telefonica.mistica.compose.theme.color.MisticaColors

object TelefonicaBrand : Brand {

    override val compatibilityTheme: Int
        get() = R.style.MisticaTheme_Telefonica

    override val lightColors = MisticaColors(
        appBarBackground = TelefonicaPaletteColor.telefonica_color_white,
        background = TelefonicaPaletteColor.telefonica_color_white,
        backgroundAlternative = TelefonicaPaletteColor.telefonica_color_grey_1,
        backgroundBrand = TelefonicaPaletteColor.telefonica_color_blue,
        backgroundContainer = TelefonicaPaletteColor.telefonica_color_white,
        backgroundFeedbackBottom = TelefonicaPaletteColor.telefonica_color_blue,
        backgroundOverlay = TelefonicaPaletteColor.telefonica_color_grey_6_80_alpha,
        backgroundSkeleton = TelefonicaPaletteColor.telefonica_color_grey_1,
        backgroundSkeletonInverse = TelefonicaPaletteColor.telefonica_color_blue_70,
        badge = TelefonicaPaletteColor.telefonica_color_coral_80,
        border = TelefonicaPaletteColor.telefonica_color_grey_2,
        borderDark = TelefonicaPaletteColor.telefonica_color_grey_5,
        borderLight = TelefonicaPaletteColor.telefonica_color_grey_1,
        borderSelected = TelefonicaPaletteColor.telefonica_color_blue,
        brand = TelefonicaPaletteColor.telefonica_color_blue,
        brandHigh = TelefonicaPaletteColor.telefonica_color_blue_70,
        buttonDangerBackground = TelefonicaPaletteColor.telefonica_color_coral,
        buttonDangerBackgroundSelected = TelefonicaPaletteColor.telefonica_color_coral_80,
        buttonLinkBackgroundSelected = TelefonicaPaletteColor.telefonica_color_grey_1,
        buttonLinkBackgroundSelectedInverse = TelefonicaPaletteColor.telefonica_color_white_20_alpha,
        buttonPrimaryBackground = TelefonicaPaletteColor.telefonica_color_blue,
        buttonPrimaryBackgroundInverse = TelefonicaPaletteColor.telefonica_color_white,
        buttonPrimaryBackgroundSelected = TelefonicaPaletteColor.telefonica_color_blue_70,
        buttonPrimaryBackgroundSelectedInverse = TelefonicaPaletteColor.telefonica_color_blue_30,
        buttonSecondaryBackground = TelefonicaPaletteColor.telefonica_color_blue,
        buttonSecondaryBackgroundSelected = TelefonicaPaletteColor.telefonica_color_blue_70,
        buttonSecondaryBorderInverse = TelefonicaPaletteColor.telefonica_color_white,
        buttonSecondaryBorderSelectedInverse = TelefonicaPaletteColor.telefonica_color_blue_30,
        carouselIndicatorActiveColor = TelefonicaPaletteColor.telefonica_color_blue,
        carouselIndicatorInactiveColor = TelefonicaPaletteColor.telefonica_color_grey_3,
        control = TelefonicaPaletteColor.telefonica_color_grey_3,
        controlActive = TelefonicaPaletteColor.telefonica_color_blue,
        controlError = TelefonicaPaletteColor.telefonica_color_coral,
        divider = TelefonicaPaletteColor.telefonica_color_grey_2,
        dividerInverse = TelefonicaPaletteColor.telefonica_color_white,
        error = TelefonicaPaletteColor.telefonica_color_coral,
        feedbackErrorBackground = TelefonicaPaletteColor.telefonica_color_coral,
        feedbackInfoBackground = TelefonicaPaletteColor.telefonica_color_grey_9,
        gradientBackgroundFirst = TelefonicaPaletteColor.telefonica_color_blue,
        gradientBackgroundFourth = TelefonicaPaletteColor.telefonica_color_blue,
        gradientBackgroundSecond = TelefonicaPaletteColor.telefonica_color_blue,
        gradientBackgroundThird = TelefonicaPaletteColor.telefonica_color_blue,
        highlight = TelefonicaPaletteColor.telefonica_color_coral_40,
        inverse = TelefonicaPaletteColor.telefonica_color_white,
        loadingBar = TelefonicaPaletteColor.telefonica_color_blue_30,
        loadingBarBackground = TelefonicaPaletteColor.telefonica_color_blue_70,
        loginLoadingGradientFirst = TelefonicaPaletteColor.telefonica_color_blue_70,
        loginLoadingGradientFourth = TelefonicaPaletteColor.telefonica_color_blue_70,
        loginLoadingGradientSecond = TelefonicaPaletteColor.telefonica_color_blue_70,
        loginLoadingGradientThird = TelefonicaPaletteColor.telefonica_color_blue_70,
        navigationBarBackground = TelefonicaPaletteColor.telefonica_color_blue,
        navigationBarDivider = TelefonicaPaletteColor.telefonica_color_blue,
        neutralHigh = TelefonicaPaletteColor.telefonica_color_grey_9,
        neutralLow = TelefonicaPaletteColor.telefonica_color_grey_1,
        neutralMedium = TelefonicaPaletteColor.telefonica_color_grey_5,
        promo = TelefonicaPaletteColor.telefonica_color_orchid,
        skeletonWave = TelefonicaPaletteColor.telefonica_color_grey_2,
        success = TelefonicaPaletteColor.telefonica_color_turquoise,
        brandLow = TelefonicaPaletteColor.telefonica_color_grey_1,
        errorLow = TelefonicaPaletteColor.telefonica_color_coral_10,
        promoLow = TelefonicaPaletteColor.telefonica_color_orchid_10,
        successLow = TelefonicaPaletteColor.telefonica_color_turquoise_10,
        warningLow = TelefonicaPaletteColor.telefonica_color_ambar_10,
        textAppBar = TelefonicaPaletteColor.telefonica_color_grey_4,
        textAppBarSelected = TelefonicaPaletteColor.telefonica_color_blue,
        textButtonPrimary = TelefonicaPaletteColor.telefonica_color_white,
        textButtonPrimaryInverse = TelefonicaPaletteColor.telefonica_color_blue,
        textButtonPrimaryInverseSelected = TelefonicaPaletteColor.telefonica_color_blue,
        textButtonSecondary = TelefonicaPaletteColor.telefonica_color_blue,
        textButtonSecondaryInverse = TelefonicaPaletteColor.telefonica_color_white,
        textButtonSecondaryInverseSelected = TelefonicaPaletteColor.telefonica_color_white,
        textButtonSecondarySelected = TelefonicaPaletteColor.telefonica_color_blue_70,
        textLink = TelefonicaPaletteColor.telefonica_color_blue,
        textLinkDanger = TelefonicaPaletteColor.telefonica_color_coral,
        textLinkInverse = TelefonicaPaletteColor.telefonica_color_white,
        textLinkSnackbar = TelefonicaPaletteColor.telefonica_color_blue_30,
        textNavigationBarPrimary = TelefonicaPaletteColor.telefonica_color_white,
        textNavigationBarSecondary = TelefonicaPaletteColor.telefonica_color_grey_1,
        textPrimary = TelefonicaPaletteColor.telefonica_color_grey_9,
        textPrimaryInverse = TelefonicaPaletteColor.telefonica_color_white,
        textSecondary = TelefonicaPaletteColor.telefonica_color_grey_5,
        textSecondaryInverse = TelefonicaPaletteColor.telefonica_color_white,
        errorHigh = TelefonicaPaletteColor.telefonica_color_coral_70,
        promoHigh = TelefonicaPaletteColor.telefonica_color_orchid_70,
        successHigh = TelefonicaPaletteColor.telefonica_color_turquoise_70,
        warningHigh = TelefonicaPaletteColor.telefonica_color_ambar_70,
        warning = TelefonicaPaletteColor.telefonica_color_ambar,
    )

    override val darkColors = MisticaColors(
        appBarBackground = TelefonicaPaletteColor.telefonica_color_darkModeGrey,
        background = TelefonicaPaletteColor.telefonica_color_darkModeBlack,
        backgroundAlternative = TelefonicaPaletteColor.telefonica_color_darkModeGrey,
        backgroundBrand = TelefonicaPaletteColor.telefonica_color_darkModeBlack,
        backgroundContainer = TelefonicaPaletteColor.telefonica_color_darkModeGrey,
        backgroundFeedbackBottom = TelefonicaPaletteColor.telefonica_color_darkModeBlack,
        backgroundOverlay = TelefonicaPaletteColor.telefonica_color_darkModeGrey_80_alpha,
        backgroundSkeleton = TelefonicaPaletteColor.telefonica_color_grey_6,
        backgroundSkeletonInverse = TelefonicaPaletteColor.telefonica_color_grey_6,
        badge = TelefonicaPaletteColor.telefonica_color_coral_80,
        border = TelefonicaPaletteColor.telefonica_color_darkModeGrey,
        borderDark = TelefonicaPaletteColor.telefonica_color_grey_5,
        borderLight = TelefonicaPaletteColor.telefonica_color_darkModeBlack,
        borderSelected = TelefonicaPaletteColor.telefonica_color_blue,
        brand = TelefonicaPaletteColor.telefonica_color_blue,
        brandHigh = TelefonicaPaletteColor.telefonica_color_grey_6,
        buttonDangerBackground = TelefonicaPaletteColor.telefonica_color_coral,
        buttonDangerBackgroundSelected = TelefonicaPaletteColor.telefonica_color_coral_80,
        buttonLinkBackgroundSelected = TelefonicaPaletteColor.telefonica_color_white_5_alpha,
        buttonLinkBackgroundSelectedInverse = TelefonicaPaletteColor.telefonica_color_white_5_alpha,
        buttonPrimaryBackground = TelefonicaPaletteColor.telefonica_color_blue,
        buttonPrimaryBackgroundInverse = TelefonicaPaletteColor.telefonica_color_blue,
        buttonPrimaryBackgroundSelected = TelefonicaPaletteColor.telefonica_color_blue_70,
        buttonPrimaryBackgroundSelectedInverse = TelefonicaPaletteColor.telefonica_color_blue_70,
        buttonSecondaryBackground = TelefonicaPaletteColor.telefonica_color_blue,
        buttonSecondaryBackgroundSelected = TelefonicaPaletteColor.telefonica_color_blue_70,
        buttonSecondaryBorderInverse = TelefonicaPaletteColor.telefonica_color_blue,
        buttonSecondaryBorderSelectedInverse = TelefonicaPaletteColor.telefonica_color_blue_70,
        carouselIndicatorActiveColor = TelefonicaPaletteColor.telefonica_color_blue,
        carouselIndicatorInactiveColor = TelefonicaPaletteColor.telefonica_color_grey_6,
        control = TelefonicaPaletteColor.telefonica_color_grey_6,
        controlActive = TelefonicaPaletteColor.telefonica_color_blue,
        controlError = TelefonicaPaletteColor.telefonica_color_coral,
        divider = TelefonicaPaletteColor.telefonica_color_white_5_alpha,
        dividerInverse = TelefonicaPaletteColor.telefonica_color_white_5_alpha,
        error = TelefonicaPaletteColor.telefonica_color_coral,
        feedbackErrorBackground = TelefonicaPaletteColor.telefonica_color_coral,
        feedbackInfoBackground = TelefonicaPaletteColor.telefonica_color_grey_8,
        gradientBackgroundFirst = TelefonicaPaletteColor.telefonica_color_blue,
        gradientBackgroundFourth = TelefonicaPaletteColor.telefonica_color_blue,
        gradientBackgroundSecond = TelefonicaPaletteColor.telefonica_color_blue,
        gradientBackgroundThird = TelefonicaPaletteColor.telefonica_color_blue,
        highlight = TelefonicaPaletteColor.telefonica_color_coral_40,
        inverse = TelefonicaPaletteColor.telefonica_color_grey_2,
        loadingBar = TelefonicaPaletteColor.telefonica_color_blue,
        loadingBarBackground = TelefonicaPaletteColor.telefonica_color_grey_6,
        loginLoadingGradientFirst = TelefonicaPaletteColor.telefonica_color_grey_6,
        loginLoadingGradientFourth = TelefonicaPaletteColor.telefonica_color_grey_6,
        loginLoadingGradientSecond = TelefonicaPaletteColor.telefonica_color_grey_6,
        loginLoadingGradientThird = TelefonicaPaletteColor.telefonica_color_grey_6,
        navigationBarBackground = TelefonicaPaletteColor.telefonica_color_darkModeBlack,
        navigationBarDivider = TelefonicaPaletteColor.telefonica_color_darkModeBlack,
        neutralHigh = TelefonicaPaletteColor.telefonica_color_grey_2,
        neutralLow = TelefonicaPaletteColor.telefonica_color_darkModeGrey6,
        neutralMedium = TelefonicaPaletteColor.telefonica_color_grey_5,
        promo = TelefonicaPaletteColor.telefonica_color_orchid,
        skeletonWave = TelefonicaPaletteColor.telefonica_color_grey_5,
        success = TelefonicaPaletteColor.telefonica_color_turquoise,
        brandLow = TelefonicaPaletteColor.telefonica_color_darkModeGrey,
        errorLow = TelefonicaPaletteColor.telefonica_color_darkModeGrey,
        promoLow = TelefonicaPaletteColor.telefonica_color_darkModeGrey,
        successLow = TelefonicaPaletteColor.telefonica_color_darkModeGrey,
        warningLow = TelefonicaPaletteColor.telefonica_color_darkModeGrey,
        textAppBar = TelefonicaPaletteColor.telefonica_color_grey_5,
        textAppBarSelected = TelefonicaPaletteColor.telefonica_color_grey_2,
        textButtonPrimary = TelefonicaPaletteColor.telefonica_color_grey_2,
        textButtonPrimaryInverse = TelefonicaPaletteColor.telefonica_color_grey_2,
        textButtonPrimaryInverseSelected = TelefonicaPaletteColor.telefonica_color_grey_2,
        textButtonSecondary = TelefonicaPaletteColor.telefonica_color_grey_2,
        textButtonSecondaryInverse = TelefonicaPaletteColor.telefonica_color_grey_2,
        textButtonSecondaryInverseSelected = TelefonicaPaletteColor.telefonica_color_blue_70,
        textButtonSecondarySelected = TelefonicaPaletteColor.telefonica_color_blue_70,
        textDisabled = TelefonicaPaletteColor.telefonica_color_grey_5,
        textLink = TelefonicaPaletteColor.telefonica_color_blue,
        textLinkDanger = TelefonicaPaletteColor.telefonica_color_coral,
        textLinkDisabled = TelefonicaPaletteColor.telefonica_color_grey_6,
        textLinkInverse = TelefonicaPaletteColor.telefonica_color_blue,
        textNavigationBarPrimary = TelefonicaPaletteColor.telefonica_color_grey_2,
        textNavigationBarSecondary = TelefonicaPaletteColor.telefonica_color_grey_4,
        textPrimary = TelefonicaPaletteColor.telefonica_color_grey_2,
        textPrimaryInverse = TelefonicaPaletteColor.telefonica_color_grey_2,
        textSecondary = TelefonicaPaletteColor.telefonica_color_grey_4,
        textSecondaryInverse = TelefonicaPaletteColor.telefonica_color_grey_4,
        errorHigh = TelefonicaPaletteColor.telefonica_color_coral_40,
        promoHigh = TelefonicaPaletteColor.telefonica_color_orchid_40,
        successHigh = TelefonicaPaletteColor.telefonica_color_turquoise_40,
        warningHigh = TelefonicaPaletteColor.telefonica_color_ambar_40,
        warning = TelefonicaPaletteColor.telefonica_color_ambar,
    )
}

private object TelefonicaPaletteColor {
    val telefonica_color_blue = Color(0xFF0066FF)
    val telefonica_color_blue_30 = Color(0xFF80B3FF)
    val telefonica_color_blue_70 = Color(0xFF0356C9)

    val telefonica_color_ambar = Color(0xFFEAC344)
    val telefonica_color_ambar_10 = Color(0xFFFDF9EC)
    val telefonica_color_ambar_40 = Color(0xFFF0D57C)
    val telefonica_color_ambar_70 = Color(0xFF69581F)

    val telefonica_color_coral = Color(0xFFE66C64)
    val telefonica_color_coral_10 = Color(0xFFFDF0EF)
    val telefonica_color_coral_40 = Color(0xFFE3A19A)
    val telefonica_color_coral_70 = Color(0xFFD50000)
    val telefonica_color_coral_80 = Color(0xFF912C31)

    val telefonica_color_orchid = Color(0xFFC466EF)
    val telefonica_color_orchid_10 = Color(0xFFF9F0FD)
    val telefonica_color_orchid_40 = Color(0xFFD694F4)
    val telefonica_color_orchid_70 = Color(0xFF8947A7)

    val telefonica_color_turquoise = Color(0xFF59C2C9)
    val telefonica_color_turquoise_10 = Color(0xFFEEF9FA)
    val telefonica_color_turquoise_40 = Color(0xFF8BD4D9)
    val telefonica_color_turquoise_70 = Color(0xFF3E888D)

    val telefonica_color_grey_1 = Color(0xFFF2F4FF)
    val telefonica_color_grey_2 = Color(0xFFD1D5E4)
    val telefonica_color_grey_3 = Color(0xFFB0B6CA)
    val telefonica_color_grey_4 = Color(0xFF8F97AF)
    val telefonica_color_grey_5 = Color(0xFF6E7894)
    val telefonica_color_grey_6 = Color(0xFF58617A)
    val telefonica_color_grey_7 = Color(0xFF414B61)
    val telefonica_color_grey_8 = Color(0xFF2B3447)
    val telefonica_color_grey_9 = Color(0xFF031A34)

    val telefonica_color_white = Color(0xFFFFFFFF)

    // Android specific palette for colors with custom alpha
    val telefonica_color_white_5_alpha = Color(0x0DFFFFFF)
    val telefonica_color_white_20_alpha = Color(0x33FFFFFF)
    val telefonica_color_grey_6_80_alpha = Color(0xCC58617A)

    // Dark Mode Color Palette
    val telefonica_color_darkModeBlack = Color(0xFF191919)
    val telefonica_color_darkModeGrey = Color(0xFF242424)
    val telefonica_color_darkModeGrey6 = Color(0xFF313235)
    val telefonica_color_darkModeGrey_80_alpha = Color(0xCC242424)
}
