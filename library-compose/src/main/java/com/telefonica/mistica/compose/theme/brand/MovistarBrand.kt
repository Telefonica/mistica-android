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
        backgroundContainer = MovistarPaletteColor.movistar_color_white,
        backgroundFeedbackBottom = MovistarPaletteColor.movistar_color_blue,
        backgroundOverlay = MovistarPaletteColor.movistar_color_grey_6_60_alpha,
        backgroundSkeleton = MovistarPaletteColor.movistar_color_grey_1,
        backgroundSkeletonInverse = MovistarPaletteColor.movistar_color_blue_dark,
        badge = MovistarPaletteColor.movistar_color_pepper_dark,
        border = MovistarPaletteColor.movistar_color_grey_3,
        borderDark = MovistarPaletteColor.movistar_color_grey_5,
        borderLight = MovistarPaletteColor.movistar_color_grey_1,
        borderSelected = MovistarPaletteColor.movistar_color_blue,
        brand = MovistarPaletteColor.movistar_color_blue,
        brandHigh = MovistarPaletteColor.movistar_color_blue_dark,
        buttonDangerBackground = MovistarPaletteColor.movistar_color_pepper,
        buttonDangerBackgroundSelected = MovistarPaletteColor.movistar_color_pepper_dark,
        buttonLinkBackgroundSelected = MovistarPaletteColor.movistar_color_blue_light10,
        buttonLinkBackgroundSelectedInverse = MovistarPaletteColor.movistar_color_white_20_alpha,
        buttonPrimaryBackground = MovistarPaletteColor.movistar_color_blue,
        buttonPrimaryBackgroundInverse = MovistarPaletteColor.movistar_color_white,
        buttonPrimaryBackgroundSelected = MovistarPaletteColor.movistar_color_blue_55,
        buttonPrimaryBackgroundSelectedInverse = MovistarPaletteColor.movistar_color_blue_light50,
        buttonSecondaryBackground = MovistarPaletteColor.movistar_color_blue,
        buttonSecondaryBackgroundSelected = MovistarPaletteColor.movistar_color_blue_55,
        buttonSecondaryBorderInverse = MovistarPaletteColor.movistar_color_white,
        buttonSecondaryBorderSelectedInverse = MovistarPaletteColor.movistar_color_blue_light50,
        carouselIndicatorActiveColor = MovistarPaletteColor.movistar_color_blue,
        carouselIndicatorInactiveColor = MovistarPaletteColor.movistar_color_grey_3,
        control = MovistarPaletteColor.movistar_color_grey_3,
        controlActive = MovistarPaletteColor.movistar_color_blue,
        controlError = MovistarPaletteColor.movistar_color_pepper,
        divider = MovistarPaletteColor.movistar_color_grey_2,
        dividerInverse = MovistarPaletteColor.movistar_color_blue_dark,
        error = MovistarPaletteColor.movistar_color_pepper,
        feedbackErrorBackground = MovistarPaletteColor.movistar_color_pepper,
        feedbackInfoBackground = MovistarPaletteColor.movistar_color_grey_6,
        gradientBackgroundFirst = MovistarPaletteColor.movistar_color_blue,
        gradientBackgroundFourth = MovistarPaletteColor.movistar_color_blue,
        gradientBackgroundSecond = MovistarPaletteColor.movistar_color_blue,
        gradientBackgroundThird = MovistarPaletteColor.movistar_color_blue,
        highlight = MovistarPaletteColor.movistar_color_pink,
        inverse = MovistarPaletteColor.movistar_color_white,
        loadingBar = MovistarPaletteColor.movistar_color_blue_light50,
        loadingBarBackground = MovistarPaletteColor.movistar_color_blue_dark,
        loginLoadingGradientFirst = MovistarPaletteColor.movistar_color_blue_dark,
        loginLoadingGradientFourth = MovistarPaletteColor.movistar_color_blue_dark,
        loginLoadingGradientSecond = MovistarPaletteColor.movistar_color_blue_dark,
        loginLoadingGradientThird = MovistarPaletteColor.movistar_color_blue_dark,
        navigationBarBackground = MovistarPaletteColor.movistar_color_blue,
        navigationBarDivider = MovistarPaletteColor.movistar_color_blue,
        neutralHigh = MovistarPaletteColor.movistar_color_grey_6,
        neutralLow = MovistarPaletteColor.movistar_color_grey_1,
        neutralMedium = MovistarPaletteColor.movistar_color_grey_5,
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
        textDisabled = MovistarPaletteColor.movistar_color_grey_3,
        textLink = MovistarPaletteColor.movistar_color_blue,
        textLinkDanger = MovistarPaletteColor.movistar_color_pepper,
        textLinkDangerDisabled = MovistarPaletteColor.movistar_color_pepper_light30,
        textLinkDisabled = MovistarPaletteColor.movistar_color_blue_light50,
        textLinkInverse = MovistarPaletteColor.movistar_color_white,
        textLinkSnackbar = MovistarPaletteColor.movistar_color_blue_light50,
        textNavigationBarPrimary = MovistarPaletteColor.movistar_color_white,
        textNavigationBarSecondary = MovistarPaletteColor.movistar_color_blue_light30,
        textPrimary = MovistarPaletteColor.movistar_color_grey_6,
        textPrimaryInverse = MovistarPaletteColor.movistar_color_white,
        textSecondary = MovistarPaletteColor.movistar_color_grey_5,
        textSecondaryInverse = MovistarPaletteColor.movistar_color_white,
        errorHigh = MovistarPaletteColor.movistar_color_pepper_70,
        promoHigh = MovistarPaletteColor.movistar_color_purple_70,
        successHigh = MovistarPaletteColor.movistar_color_green_70,
        warningHigh = MovistarPaletteColor.movistar_color_egg_80,
        warning = MovistarPaletteColor.movistar_color_egg,
    )

    override val darkColors =
        lightColors.copy(
            appBarBackground = MovistarPaletteColor.movistar_color_darkModeGrey,
            background = MovistarPaletteColor.movistar_color_darkModeBlack,
            backgroundAlternative = MovistarPaletteColor.movistar_color_darkModeGrey,
            backgroundBrand = MovistarPaletteColor.movistar_color_darkModeBlack,
            backgroundContainer = MovistarPaletteColor.movistar_color_darkModeGrey,
            backgroundFeedbackBottom = MovistarPaletteColor.movistar_color_darkModeBlack,
            backgroundOverlay = MovistarPaletteColor.movistar_color_darkModeGrey_80_alpha,
            backgroundSkeleton = MovistarPaletteColor.movistar_color_grey_6,
            backgroundSkeletonInverse = MovistarPaletteColor.movistar_color_grey_6,
            border = MovistarPaletteColor.movistar_color_darkModeGrey,
            borderLight = MovistarPaletteColor.movistar_color_darkModeBlack,
            brandHigh = MovistarPaletteColor.movistar_color_grey_6,
            buttonLinkBackgroundSelected = MovistarPaletteColor.movistar_color_white_5_alpha,
            buttonLinkBackgroundSelectedInverse = MovistarPaletteColor.movistar_color_white_5_alpha,
            buttonPrimaryBackgroundInverse = MovistarPaletteColor.movistar_color_blue,
            buttonPrimaryBackgroundSelectedInverse = MovistarPaletteColor.movistar_color_blue_55,
            buttonSecondaryBorderInverse = MovistarPaletteColor.movistar_color_blue,
            buttonSecondaryBorderSelectedInverse = MovistarPaletteColor.movistar_color_blue_55,
            carouselIndicatorActiveColor = MovistarPaletteColor.movistar_color_blue,
            carouselIndicatorInactiveColor = MovistarPaletteColor.movistar_color_grey_3,
            control = MovistarPaletteColor.movistar_color_grey_6,
            divider = MovistarPaletteColor.movistar_color_white_5_alpha,
            dividerInverse = MovistarPaletteColor.movistar_color_white_5_alpha,
            inverse = MovistarPaletteColor.movistar_color_grey_2,
            loadingBar = MovistarPaletteColor.movistar_color_blue,
            loadingBarBackground = MovistarPaletteColor.movistar_color_grey_6,
            loginLoadingGradientFirst = MovistarPaletteColor.movistar_color_grey_6,
            loginLoadingGradientFourth = MovistarPaletteColor.movistar_color_grey_6,
            loginLoadingGradientSecond = MovistarPaletteColor.movistar_color_grey_6,
            loginLoadingGradientThird = MovistarPaletteColor.movistar_color_grey_6,
            navigationBarBackground = MovistarPaletteColor.movistar_color_darkModeBlack,
            navigationBarDivider = MovistarPaletteColor.movistar_color_darkModeBlack,
            neutralHigh = MovistarPaletteColor.movistar_color_grey_2,
            neutralLow = MovistarPaletteColor.movistar_color_grey_6,
            skeletonWave = MovistarPaletteColor.movistar_color_grey_5_30_alpha,
            brandLow = MovistarPaletteColor.movistar_color_darkModeGrey,
            errorLow = MovistarPaletteColor.movistar_color_darkModeGrey,
            promoLow = MovistarPaletteColor.movistar_color_darkModeGrey,
            successLow = MovistarPaletteColor.movistar_color_darkModeGrey,
            warningLow = MovistarPaletteColor.movistar_color_darkModeGrey,
            textAppBar = MovistarPaletteColor.movistar_color_grey_5,
            textAppBarSelected = MovistarPaletteColor.movistar_color_grey_2,
            textButtonPrimary = MovistarPaletteColor.movistar_color_grey_2,
            textButtonPrimaryInverse = MovistarPaletteColor.movistar_color_grey_2,
            textButtonPrimaryInverseSelected = MovistarPaletteColor.movistar_color_grey_2,
            textButtonSecondary = MovistarPaletteColor.movistar_color_grey_2,
            textButtonSecondaryInverse = MovistarPaletteColor.movistar_color_grey_2,
            textButtonSecondaryInverseSelected = MovistarPaletteColor.movistar_color_green_dark,
            textDisabled = MovistarPaletteColor.movistar_color_grey_5,
            textLinkDangerDisabled = MovistarPaletteColor.movistar_color_grey_5,
            textLinkDisabled = MovistarPaletteColor.movistar_color_grey_6,
            textLinkInverse = MovistarPaletteColor.movistar_color_blue,
            textNavigationBarPrimary = MovistarPaletteColor.movistar_color_grey_2,
            textNavigationBarSecondary = MovistarPaletteColor.movistar_color_grey_4,
            textPrimary = MovistarPaletteColor.movistar_color_grey_2,
            textPrimaryInverse = MovistarPaletteColor.movistar_color_grey_2,
            textSecondary = MovistarPaletteColor.movistar_color_grey_4,
            textSecondaryInverse = MovistarPaletteColor.movistar_color_grey_4,
            errorHigh = MovistarPaletteColor.movistar_color_pepper_40,
            promoHigh = MovistarPaletteColor.movistar_color_purple_40,
            successHigh = MovistarPaletteColor.movistar_color_green_40,
            warningHigh = MovistarPaletteColor.movistar_color_egg_40,
        )

    override val preset5FontWeight: FontWeight
        get() = FontWeight.Medium

    override val preset6FontWeight: FontWeight
        get() = FontWeight.Medium

    override val preset7FontWeight: FontWeight
        get() = FontWeight.Medium

    override val preset8FontWeight: FontWeight
        get() = FontWeight.Medium
}

object MovistarProminentBrand : Brand {

    override val compatibilityTheme: Int
        get() = R.style.MisticaTheme_Movistar_Prominent

    override val lightColors = MovistarBrand.lightColors.copy(
        brand = MovistarPaletteColor.movistar_prominent_color_blue,
        backgroundBrand = MovistarPaletteColor.movistar_prominent_color_blue,
        navigationBarBackground = MovistarPaletteColor.movistar_prominent_color_blue,
        brandHigh = MovistarPaletteColor.movistar_prominent_color_blue_dark,
        dividerInverse = MovistarPaletteColor.movistar_prominent_color_blue_dark,
        gradientBackgroundFirst = MovistarPaletteColor.movistar_prominent_color_blue,
        gradientBackgroundSecond = MovistarPaletteColor.movistar_prominent_color_blue,
        gradientBackgroundThird = MovistarPaletteColor.movistar_prominent_color_blue,
        gradientBackgroundFourth = MovistarPaletteColor.movistar_prominent_color_blue,
        loginLoadingGradientFirst = MovistarPaletteColor.movistar_prominent_color_blue_dark,
        loginLoadingGradientSecond = MovistarPaletteColor.movistar_prominent_color_blue_dark,
        loginLoadingGradientThird = MovistarPaletteColor.movistar_prominent_color_blue_dark,
        loginLoadingGradientFourth = MovistarPaletteColor.movistar_prominent_color_blue_dark,
    )

    override val darkColors: MisticaColors = MovistarBrand.darkColors

    override val preset5FontWeight: FontWeight
        get() = MovistarBrand.preset5FontWeight

    override val preset6FontWeight: FontWeight
        get() = MovistarBrand.preset6FontWeight

    override val preset7FontWeight: FontWeight
        get() = MovistarBrand.preset7FontWeight

    override val preset8FontWeight: FontWeight
        get() = MovistarBrand.preset8FontWeight
}

private object MovistarPaletteColor {
    val movistar_color_blue = Color(0xFF019DF4)
    val movistar_color_blue_10 = Color(0xFFE6F5FD)
    val movistar_color_blue_40 = Color(0xFF4DBAF7)
    val movistar_color_blue_55 = Color(0xFF008EDD)
    val movistar_color_blue_dark = Color(0xFF008EDD)
    val movistar_color_blue_light50 = Color(0xFF80CEF9)
    val movistar_color_blue_light30 = Color(0xFFB3E1FB)
    val movistar_color_blue_light10 = Color(0xFFE6F5FD)

    val movistar_color_green = Color(0xFF5CB615)
    val movistar_color_green_10 = Color(0xFFEFF8E8)
    val movistar_color_green_40 = Color(0xFF8DCC5B)
    val movistar_color_green_70 = Color(0xFF407F0F)
    val movistar_color_green_dark = Color(0xFF499110)
    val movistar_color_green_light50 = Color(0xFFADDA8A)
    val movistar_color_green_light50_40_alpha = Color(0x66ADDA8A)
    val movistar_color_green_light30 = Color(0xFFCEE9B9)

    val movistar_color_pepper = Color(0xFFFF374A)
    val movistar_color_pepper_10 = Color(0xFFFFEBED)
    val movistar_color_pepper_40 = Color(0xFFFF7380)
    val movistar_color_pepper_70 = Color(0xFFB22634)
    val movistar_color_pepper_dark = Color(0xFFD73241)
    val movistar_color_pepper_light30 = Color(0xFFFFC3C8)

    val movistar_color_egg = Color(0xFFF28D15)
    val movistar_color_egg_10 = Color(0xFFFEF4E8)
    val movistar_color_egg_40 = Color(0xFFF6AF5B)
    val movistar_color_egg_80 = Color(0xFF6D3F09)
    val movistar_color_egg_light = Color(0xFFF8D2B3)

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

    // Prominent Color Palette
    val movistar_prominent_color_blue = Color(0xFF0B2739)
    val movistar_prominent_color_blue_10 = Color(0xFFE6F5FD)
    val movistar_prominent_color_blue_40 = Color(0xFF4DBAF7)
    val movistar_prominent_color_blue_dark = Color(0xFF081F2D)
    val movistar_prominent_color_blue_light_20 = Color(0xFFCED3D7)
    val movistar_prominent_color_blue_light_50 = Color(0xFF85939C)
    val movistar_prominent_color_blue_light_70 = Color(0xFF546874)

    // Android specific palette for colors with custom alpha
    val movistar_color_white_5_alpha = Color(0x0DFFFFFF)
    val movistar_color_white_20_alpha = Color(0x33FFFFFF)
    val movistar_color_white_50_alpha = Color(0x80FFFFFF)
    val movistar_color_grey_5_30_alpha = Color(0x4D86888C)
    val movistar_color_grey_6_80_alpha = Color(0xCC313235)
    val movistar_color_grey_6_60_alpha = Color(0x99313235)
    val movistar_color_grey_6_40_alpha = Color(0x66313235)
    val movistar_color_grey_6_30_alpha = Color(0x4D313235)
    val movistar_color_blue_dark_80_alpha = Color(0xCC008EDD)
    val movistar_color_blue_light30_30_alpha = Color(0x4DB3E1FB)
    val movistar_color_blue_light50_25_alpha = Color(0x4080CEF9)

    // Dark Mode Color Palette
    val movistar_color_darkModeBlack = Color(0xFF191919)
    val movistar_color_darkModeGrey = Color(0xFF242424)
    val movistar_color_darkModeGrey_80_alpha = Color(0xCC242424)
}
