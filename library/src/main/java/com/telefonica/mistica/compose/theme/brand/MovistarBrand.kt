package com.telefonica.mistica.compose.theme.brand

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import com.telefonica.mistica.R
import com.telefonica.mistica.compose.theme.color.MisticaColors

object MovistarBrand : Brand {

    override val compatibilityTheme: Int
        get() = R.style.MisticaTheme_Movistar

    override val lightColors = MisticaColors(
        appBarBackground = MovistarPaletteColor.movistar_color_white,
        background = MovistarPaletteColor.movistar_color_white,
        backgroundAlternative = MovistarPaletteColor.movistar_color_grey_1,
        backgroundBrand = MovistarPaletteColor.movistar_color_blue,
        backgroundBrandSecondary = MovistarPaletteColor.movistar_color_blue_dark,
        backgroundContainer = MovistarPaletteColor.movistar_color_white,
        backgroundFeedbackBottom = MovistarPaletteColor.movistar_color_blue,
        backgroundOverlay = MovistarPaletteColor.movistar_color_blue_dark_60_alpha,
        backgroundSkeleton = MovistarPaletteColor.movistar_color_grey_1,
        backgroundSkeletonInverse = MovistarPaletteColor.movistar_color_white_20_alpha,
        badge = MovistarPaletteColor.movistar_color_pepper_55,
        border = MovistarPaletteColor.movistar_color_grey_3,
        borderHigh = MovistarPaletteColor.movistar_color_darkModeGrey4,
        borderLow = MovistarPaletteColor.movistar_color_grey_1,
        borderSelected = MovistarPaletteColor.movistar_color_blue,
        brand = MovistarPaletteColor.movistar_color_blue,
        brandHigh = MovistarPaletteColor.movistar_color_blue_55,
        buttonDangerBackground = MovistarPaletteColor.movistar_color_pepper,
        buttonDangerBackgroundSelected = MovistarPaletteColor.movistar_color_pepper_55,
        buttonLinkBackgroundSelected = MovistarPaletteColor.movistar_color_blue_10,
        buttonLinkBackgroundInverseSelected = MovistarPaletteColor.movistar_color_white_20_alpha,
        buttonPrimaryBackground = MovistarPaletteColor.movistar_color_blue,
        buttonPrimaryBackgroundInverse = MovistarPaletteColor.movistar_color_white,
        buttonPrimaryBackgroundSelected = MovistarPaletteColor.movistar_color_blue_55,
        buttonPrimaryBackgroundInverseSelected = MovistarPaletteColor.movistar_color_blue_30,
        buttonSecondaryBorder = MovistarPaletteColor.movistar_color_blue,
        buttonSecondaryBackgroundSelected = MovistarPaletteColor.movistar_color_blue_10,
        buttonSecondaryBackgroundSelectedInverse = MovistarPaletteColor.movistar_color_white_20_alpha,
        buttonSecondaryBorderInverse = MovistarPaletteColor.movistar_color_white,
        buttonSecondaryBorderInverseSelected = MovistarPaletteColor.movistar_color_white,
        carouselIndicatorActiveColor = MovistarPaletteColor.movistar_color_blue,
        carouselIndicatorInactiveColor = MovistarPaletteColor.movistar_color_grey_3,
        control = MovistarPaletteColor.movistar_color_grey_3,
        controlActive = MovistarPaletteColor.movistar_color_blue,
        controlError = MovistarPaletteColor.movistar_color_pepper,
        divider = MovistarPaletteColor.movistar_color_grey_2,
        dividerInverse = MovistarPaletteColor.movistar_color_white_20_alpha,
        error = MovistarPaletteColor.movistar_color_pepper,
        feedbackErrorBackground = MovistarPaletteColor.movistar_color_pepper,
        feedbackInfoBackground = MovistarPaletteColor.movistar_color_blue_dark,
        gradientBackgroundFirst = MovistarPaletteColor.movistar_color_blue,
        gradientBackgroundFourth = MovistarPaletteColor.movistar_color_blue,
        gradientBackgroundSecond = MovistarPaletteColor.movistar_color_blue,
        gradientBackgroundThird = MovistarPaletteColor.movistar_color_blue,
        highlight = MovistarPaletteColor.movistar_color_pink,
        inverse = MovistarPaletteColor.movistar_color_white,
        loadingBar = MovistarPaletteColor.movistar_color_blue_30,
        loadingBarBackground = MovistarPaletteColor.movistar_color_blue_55,
        loginLoadingGradientFirst = MovistarPaletteColor.movistar_color_blue_55,
        loginLoadingGradientFourth = MovistarPaletteColor.movistar_color_blue_55,
        loginLoadingGradientSecond = MovistarPaletteColor.movistar_color_blue_55,
        loginLoadingGradientThird = MovistarPaletteColor.movistar_color_blue_55,
        navigationBarBackground = MovistarPaletteColor.movistar_color_blue,
        navigationBarDivider = MovistarPaletteColor.movistar_color_blue,
        neutralHigh = MovistarPaletteColor.movistar_color_blue_dark,
        neutralLow = MovistarPaletteColor.movistar_color_grey_1,
        neutralMedium = MovistarPaletteColor.movistar_color_grey_5,
        neutralMediumInverse = MovistarPaletteColor.movistar_color_grey_5,
        promo = MovistarPaletteColor.movistar_color_purple,
        skeletonWave = MovistarPaletteColor.movistar_color_grey_2,
        success = MovistarPaletteColor.movistar_color_green,
        brandLow = MovistarPaletteColor.movistar_color_blue_10,
        errorLow = MovistarPaletteColor.movistar_color_pepper_10,
        promoLow = MovistarPaletteColor.movistar_color_purple_10,
        successLow = MovistarPaletteColor.movistar_color_green_10,
        warningLow = MovistarPaletteColor.movistar_color_egg_10,
        textAppBar = MovistarPaletteColor.movistar_color_grey_4,
        textAppBarSelected = MovistarPaletteColor.movistar_color_blue,
        textButtonPrimary = MovistarPaletteColor.movistar_color_white,
        textButtonPrimaryInverse = MovistarPaletteColor.movistar_color_blue,
        textButtonPrimaryInverseSelected = MovistarPaletteColor.movistar_color_blue,
        textButtonSecondary = MovistarPaletteColor.movistar_color_blue,
        textButtonSecondaryInverse = MovistarPaletteColor.movistar_color_white,
        textButtonSecondaryInverseSelected = MovistarPaletteColor.movistar_color_white,
        textButtonSecondarySelected = MovistarPaletteColor.movistar_color_blue_55,
        textLink = MovistarPaletteColor.movistar_color_blue,
        textLinkDanger = MovistarPaletteColor.movistar_color_pepper,
        textLinkInverse = MovistarPaletteColor.movistar_color_white,
        textLinkSnackbar = MovistarPaletteColor.movistar_color_blue_30,
        textNavigationBarPrimary = MovistarPaletteColor.movistar_color_white,
        textNavigationBarSecondary = MovistarPaletteColor.movistar_color_blue_20,
        textPrimary = MovistarPaletteColor.movistar_color_blue_dark,
        textPrimaryInverse = MovistarPaletteColor.movistar_color_white,
        textSecondary = MovistarPaletteColor.movistar_color_grey_5,
        textSecondaryInverse = MovistarPaletteColor.movistar_color_blue_10,
        errorHigh = MovistarPaletteColor.movistar_color_pepper_70,
        errorHighInverse = MovistarPaletteColor.movistar_color_pepper_70,
        promoHigh = MovistarPaletteColor.movistar_color_purple_70,
        promoHighInverse = MovistarPaletteColor.movistar_color_purple_70,
        successHigh = MovistarPaletteColor.movistar_color_green_70,
        successHighInverse = MovistarPaletteColor.movistar_color_green_70,
        warningHigh = MovistarPaletteColor.movistar_color_egg_80,
        warningHighInverse = MovistarPaletteColor.movistar_color_egg_80,
        warning = MovistarPaletteColor.movistar_color_egg,
    )

    override val darkColors =
        lightColors.copy(
            appBarBackground = MovistarPaletteColor.movistar_color_darkModeGrey,
            background = MovistarPaletteColor.movistar_color_darkModeBlack,
            backgroundAlternative = MovistarPaletteColor.movistar_color_darkModeGrey,
            backgroundBrand = MovistarPaletteColor.movistar_color_darkModeBlack,
            backgroundBrandSecondary = MovistarPaletteColor.movistar_color_darkModeBlack,
            backgroundContainer = MovistarPaletteColor.movistar_color_darkModeGrey,
            backgroundFeedbackBottom = MovistarPaletteColor.movistar_color_darkModeBlack,
            backgroundOverlay = MovistarPaletteColor.movistar_color_darkModeGrey_80_alpha,
            backgroundSkeleton = MovistarPaletteColor.movistar_color_blue_dark,
            backgroundSkeletonInverse = MovistarPaletteColor.movistar_color_blue_dark,
            border = MovistarPaletteColor.movistar_color_darkModeGrey,
            borderLow = MovistarPaletteColor.movistar_color_darkModeBlack,
            brandHigh = MovistarPaletteColor.movistar_color_darkModeGrey,
            buttonLinkBackgroundSelected = MovistarPaletteColor.movistar_color_white_8_alpha,
            buttonLinkBackgroundInverseSelected = MovistarPaletteColor.movistar_color_white_8_alpha,
            buttonPrimaryBackgroundInverse = MovistarPaletteColor.movistar_color_blue,
            buttonPrimaryBackgroundInverseSelected = MovistarPaletteColor.movistar_color_blue_55,
            buttonSecondaryBorderInverse = MovistarPaletteColor.movistar_color_white,
            buttonSecondaryBorderInverseSelected = MovistarPaletteColor.movistar_color_white,
            buttonSecondaryBackgroundSelectedInverse = MovistarPaletteColor.movistar_color_white_15_alpha,
            carouselIndicatorActiveColor = MovistarPaletteColor.movistar_color_blue,
            carouselIndicatorInactiveColor = MovistarPaletteColor.movistar_color_grey_3,
            control = MovistarPaletteColor.movistar_color_darkModeGrey6,
            divider = MovistarPaletteColor.movistar_color_white_5_alpha,
            dividerInverse = MovistarPaletteColor.movistar_color_white_5_alpha,
            inverse = MovistarPaletteColor.movistar_color_darkModeGrey2,
            loadingBar = MovistarPaletteColor.movistar_color_blue,
            loadingBarBackground = MovistarPaletteColor.movistar_color_darkModeGrey6,
            loginLoadingGradientFirst = MovistarPaletteColor.movistar_color_grey_6,
            loginLoadingGradientFourth = MovistarPaletteColor.movistar_color_grey_6,
            loginLoadingGradientSecond = MovistarPaletteColor.movistar_color_grey_6,
            loginLoadingGradientThird = MovistarPaletteColor.movistar_color_grey_6,
            navigationBarBackground = MovistarPaletteColor.movistar_color_darkModeBlack,
            navigationBarDivider = MovistarPaletteColor.movistar_color_darkModeBlack,
            neutralHigh = MovistarPaletteColor.movistar_color_darkModeGrey2,
            neutralMedium = MovistarPaletteColor.movistar_color_darkModeGrey5,
            neutralMediumInverse = MovistarPaletteColor.movistar_color_grey_5,
            neutralLow = MovistarPaletteColor.movistar_color_blue_dark,
            skeletonWave = MovistarPaletteColor.movistar_color_blue_dark,
            brandLow = MovistarPaletteColor.movistar_color_blue_dark,
            errorLow = MovistarPaletteColor.movistar_color_blue_dark,
            promoLow = MovistarPaletteColor.movistar_color_blue_dark,
            successLow = MovistarPaletteColor.movistar_color_blue_dark,
            warningLow = MovistarPaletteColor.movistar_color_blue_dark,
            textAppBar = MovistarPaletteColor.movistar_color_darkModeGrey5,
            textAppBarSelected = MovistarPaletteColor.movistar_color_darkModeGrey2,
            textButtonPrimary = MovistarPaletteColor.movistar_color_darkModeGrey2,
            textButtonPrimaryInverse = MovistarPaletteColor.movistar_color_darkModeGrey2,
            textButtonPrimaryInverseSelected = MovistarPaletteColor.movistar_color_darkModeGrey2,
            textButtonSecondary = MovistarPaletteColor.movistar_color_darkModeGrey2,
            textButtonSecondarySelected = MovistarPaletteColor.movistar_color_darkModeGrey4,
            textButtonSecondaryInverse = MovistarPaletteColor.movistar_color_darkModeGrey2,
            textButtonSecondaryInverseSelected = MovistarPaletteColor.movistar_color_darkModeGrey4,
            textLinkInverse = MovistarPaletteColor.movistar_color_blue,
            textNavigationBarPrimary = MovistarPaletteColor.movistar_color_darkModeGrey2,
            textNavigationBarSecondary = MovistarPaletteColor.movistar_color_darkModeGrey4,
            textPrimary = MovistarPaletteColor.movistar_color_darkModeGrey2,
            textPrimaryInverse = MovistarPaletteColor.movistar_color_darkModeGrey2,
            textSecondary = MovistarPaletteColor.movistar_color_darkModeGrey4,
            textSecondaryInverse = MovistarPaletteColor.movistar_color_darkModeGrey4,
            errorHigh = MovistarPaletteColor.movistar_color_pepper_40,
            errorHighInverse = MovistarPaletteColor.movistar_color_pepper_70,
            promoHigh = MovistarPaletteColor.movistar_color_purple_40,
            promoHighInverse = MovistarPaletteColor.movistar_color_purple_70,
            successHigh = MovistarPaletteColor.movistar_color_green_40,
            successHighInverse = MovistarPaletteColor.movistar_color_green_70,
            warningHigh = MovistarPaletteColor.movistar_color_egg_40,
            warningHighInverse = MovistarPaletteColor.movistar_color_egg_80,
        )

    override val preset5FontWeight: FontWeight
        get() = FontWeight.Bold

    override val preset6FontWeight: FontWeight
        get() = FontWeight.Bold

    override val preset7FontWeight: FontWeight
        get() = FontWeight.Bold

    override val preset8FontWeight: FontWeight
        get() = FontWeight.Bold
}

private object MovistarPaletteColor {
    val movistar_color_blue = Color(0xFF019DF4)
    val movistar_color_blue_10 = Color(0xFFE6F5FD)
    val movistar_color_blue_30 = Color(0xFF80CEF9)
    val movistar_color_blue_40 = Color(0xFF4DBAF7)
    val movistar_color_blue_55 = Color(0xFF008EDD)
    val movistar_color_blue_20 = Color(0xFFB3E1FB)

    val movistar_color_blue_dark = Color(0xFF0B2739)
    val movistar_color_blue_dark_60_alpha = Color(0x990B2739)

    val movistar_color_green = Color(0xFF5CB615)
    val movistar_color_green_10 = Color(0xFFEFF8E8)
    val movistar_color_green_20 = Color(0xFFCEE9B9)
    val movistar_color_green_30 = Color(0xFFADDA8A)
    val movistar_color_green_40 = Color(0xFF8DCC5B)
    val movistar_color_green_60 = Color(0xFF499110)
    val movistar_color_green_70 = Color(0xFF407F0F)
    val movistar_color_green_30_40_alpha = Color(0x66ADDA8A)

    val movistar_color_pepper = Color(0xFFFF374A)
    val movistar_color_pepper_10 = Color(0xFFFFEBED)
    val movistar_color_pepper_20 = Color(0xFFFFC3C8)
    val movistar_color_pepper_40 = Color(0xFFFF7380)
    val movistar_color_pepper_55 = Color(0xFFD73241)
    val movistar_color_pepper_70 = Color(0xFFB22634)

    val movistar_color_egg = Color(0xFFF28D15)
    val movistar_color_egg_10 = Color(0xFFFEF4E8)
    val movistar_color_egg_40 = Color(0xFFF6AF5B)
    val movistar_color_egg_80 = Color(0xFF6D3F09)

    val movistar_color_pink = Color(0xFFE63780)

    val movistar_color_purple = Color(0xFFA13EA1)
    val movistar_color_purple_10 = Color(0xFFF6ECF6)
    val movistar_color_purple_40 = Color(0xFFBD78BD)
    val movistar_color_purple_70 = Color(0xFF712B71)

    val movistar_color_grey_1 = Color(0xFFF6F6F6)
    val movistar_color_grey_2 = Color(0xFFEEEEEE)
    val movistar_color_grey_3 = Color(0xFFDDDDDD)
    val movistar_color_grey_4 = Color(0xFF999999)
    val movistar_color_grey_5 = Color(0xFF86888C)
    val movistar_color_grey_6 = Color(0xFF313235)
    val movistar_color_white = Color(0xFFFFFFFF)

    // Android specific palette for colors with custom alpha
    val movistar_color_white_5_alpha = Color(0x0DFFFFFF)
    val movistar_color_white_8_alpha = Color(0x14FFFFFF)
    val movistar_color_white_15_alpha = Color(0x26FFFFFF)
    val movistar_color_white_20_alpha = Color(0x33FFFFFF)
    val movistar_color_white_50_alpha = Color(0x80FFFFFF)
    val movistar_color_grey_5_30_alpha = Color(0x4D86888C)
    val movistar_color_grey_6_80_alpha = Color(0xCC313235)
    val movistar_color_grey_6_60_alpha = Color(0x99313235)
    val movistar_color_grey_6_40_alpha = Color(0x66313235)
    val movistar_color_grey_6_30_alpha = Color(0x4D313235)
    val movistar_color_blue_55_80_alpha = Color(0xCC008EDD)
    val movistar_color_blue_20_30_alpha = Color(0x4DB3E1FB)
    val movistar_color_blue_30_25_alpha = Color(0x4080CEF9)

    // Dark Mode Color Palette
    val movistar_color_darkModeBlack = Color(0xFF061824)
    val movistar_color_darkModeGrey = Color(0xFF081F2E)
    val movistar_color_darkModeGrey2 = Color(0xFFEAEBEE)
    val movistar_color_darkModeGrey3 = Color(0xFFCED4D7)
    val movistar_color_darkModeGrey4 = Color(0xFF85939C)
    val movistar_color_darkModeGrey5 = Color(0xFF6D7D88)
    val movistar_color_darkModeGrey6 = Color(0xFF3C5261)
    val movistar_color_darkModeGrey_80_alpha = Color(0xCC242424)
}
