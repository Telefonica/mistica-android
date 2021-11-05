package com.telefonica.mistica.compose.theme.brand

import androidx.compose.ui.graphics.Color
import com.telefonica.mistica.compose.R
import com.telefonica.mistica.compose.theme.color.MisticaColors

object MovistarBrand : Brand {

    override val compatibilityTheme: Int
        get() = R.style.MisticaTheme_Movistar

    override val lightColors = MisticaColors(
        appBarBackground = MovistarPaletteColor.movistar_color_white,
        background = MovistarPaletteColor.movistar_color_white,
        backgroundContainer = MovistarPaletteColor.movistar_color_white,
        backgroundBrand = MovistarPaletteColor.movistar_color_blue,
        backgroundOverlay = MovistarPaletteColor.movistar_color_grey_6_60_alpha,
        backgroundSkeleton = MovistarPaletteColor.movistar_color_grey_1,
        backgroundSkeletonInverse = MovistarPaletteColor.movistar_color_blue_dark,
        navigationBarBackground = MovistarPaletteColor.movistar_color_blue,
        backgroundAlternative = MovistarPaletteColor.movistar_color_grey_1,
        backgroundFeedbackBottom = MovistarPaletteColor.movistar_color_blue,
        skeletonWave = MovistarPaletteColor.movistar_color_grey_2,
        borderLight = MovistarPaletteColor.movistar_color_grey_1,
        border = MovistarPaletteColor.movistar_color_grey_3,
        borderDark = MovistarPaletteColor.movistar_color_grey_5,
        borderSelected = MovistarPaletteColor.movistar_color_green,
        buttonDangerBackground = MovistarPaletteColor.movistar_color_pepper,
        buttonDangerBackgroundDisabled = MovistarPaletteColor.movistar_color_pepper_light30,
        buttonDangerBackgroundSelected = MovistarPaletteColor.movistar_color_pepper_dark,
        buttonLinkBackgroundSelected = MovistarPaletteColor.movistar_color_blue_light10,
        buttonLinkBackgroundSelectedInverse = MovistarPaletteColor.movistar_color_white_20_alpha,
        buttonPrimaryBackground = MovistarPaletteColor.movistar_color_green,
        buttonPrimaryBackgroundDisabled = MovistarPaletteColor.movistar_color_green_light50,
        buttonPrimaryBackgroundDisabledInverse = MovistarPaletteColor.movistar_color_blue_light50,
        buttonPrimaryBackgroundInverse = MovistarPaletteColor.movistar_color_white,
        buttonPrimaryBackgroundSelected = MovistarPaletteColor.movistar_color_green_dark,
        buttonPrimaryBackgroundSelectedInverse = MovistarPaletteColor.movistar_color_blue_light50,
        buttonSecondaryBackground = MovistarPaletteColor.movistar_color_green,
        buttonSecondaryBackgroundDisabled = MovistarPaletteColor.movistar_color_green_light50,
        buttonSecondaryBackgroundSelected = MovistarPaletteColor.movistar_color_green_dark,
        buttonSecondaryBorderDisabledInverse = MovistarPaletteColor.movistar_color_blue_light50,
        buttonSecondaryBorderInverse = MovistarPaletteColor.movistar_color_white,
        buttonSecondaryBorderSelectedInverse = MovistarPaletteColor.movistar_color_blue_light50,
        textButtonPrimary = MovistarPaletteColor.movistar_color_white,
        textButtonPrimaryDisabled = MovistarPaletteColor.movistar_color_white,
        textButtonPrimaryInverse = MovistarPaletteColor.movistar_color_blue,
        textButtonPrimaryInverseDisabled = MovistarPaletteColor.movistar_color_blue_light30,
        textButtonPrimaryInverseSelected = MovistarPaletteColor.movistar_color_blue,
        textButtonSecondary = MovistarPaletteColor.movistar_color_green,
        textButtonSecondaryDisabled = MovistarPaletteColor.movistar_color_green_light50,
        textButtonSecondarySelected = MovistarPaletteColor.movistar_color_green_dark,
        textButtonSecondaryInverse = MovistarPaletteColor.movistar_color_white,
        textButtonSecondaryInverseDisabled = MovistarPaletteColor.movistar_color_blue_light50,
        textButtonSecondaryInverseSelected = MovistarPaletteColor.movistar_color_white,
        textLink = MovistarPaletteColor.movistar_color_blue,
        textLinkInverse = MovistarPaletteColor.movistar_color_white,
        textLinkDanger = MovistarPaletteColor.movistar_color_pepper,
        textLinkDangerDisabled = MovistarPaletteColor.movistar_color_pepper_light30,
        textLinkDisabled = MovistarPaletteColor.movistar_color_blue_light50,
        textLinkSnackbar = MovistarPaletteColor.movistar_color_blue_light50,
        control = MovistarPaletteColor.movistar_color_grey_3,
        controlActive = MovistarPaletteColor.movistar_color_blue,
        controlError = MovistarPaletteColor.movistar_color_pepper,
        loadingBar = MovistarPaletteColor.movistar_color_blue_light50,
        loadingBarBackground = MovistarPaletteColor.movistar_color_blue_dark,
        divider = MovistarPaletteColor.movistar_color_grey_2,
        dividerInverse = MovistarPaletteColor.movistar_color_blue_dark,
        navigationBarDivider = MovistarPaletteColor.movistar_color_blue,
        badge = MovistarPaletteColor.movistar_color_pepper_dark,
        feedbackErrorBackground = MovistarPaletteColor.movistar_color_pepper,
        feedbackInfoBackground = MovistarPaletteColor.movistar_color_grey_6,
        brand = MovistarPaletteColor.movistar_color_blue,
        brandDark = MovistarPaletteColor.movistar_color_blue_dark,
        inverse = MovistarPaletteColor.movistar_color_white,
        neutralHigh = MovistarPaletteColor.movistar_color_grey_6,
        neutralLow = MovistarPaletteColor.movistar_color_grey_3,
        neutralMedium = MovistarPaletteColor.movistar_color_grey_5,
        promo = MovistarPaletteColor.movistar_color_purple,
        highlight = MovistarPaletteColor.movistar_color_pink,
        textPrimary = MovistarPaletteColor.movistar_color_grey_6,
        textPrimaryInverse = MovistarPaletteColor.movistar_color_white,
        textSecondary = MovistarPaletteColor.movistar_color_grey_5,
        textSecondaryInverse = MovistarPaletteColor.movistar_color_white,
        textDisabled = MovistarPaletteColor.movistar_color_grey_3,
        textAmount = MovistarPaletteColor.movistar_color_blue,
        error = MovistarPaletteColor.movistar_color_pepper,
        success = MovistarPaletteColor.movistar_color_green,
        warning = MovistarPaletteColor.movistar_color_egg,
        textNavigationBarPrimary = MovistarPaletteColor.movistar_color_white,
        textNavigationBarSecondary = MovistarPaletteColor.movistar_color_blue_light30,
        textAppBar = MovistarPaletteColor.movistar_color_grey_4,
        textAppBarSelected = MovistarPaletteColor.movistar_color_blue,
        gradientBackgroundFirst = MovistarPaletteColor.movistar_color_blue,
        gradientBackgroundSecond = MovistarPaletteColor.movistar_color_blue,
        gradientBackgroundThird = MovistarPaletteColor.movistar_color_blue,
        gradientBackgroundFourth = MovistarPaletteColor.movistar_color_blue,
        loginLoadingGradientFirst = MovistarPaletteColor.movistar_color_blue_dark,
        loginLoadingGradientSecond = MovistarPaletteColor.movistar_color_blue_dark,
        loginLoadingGradientThird = MovistarPaletteColor.movistar_color_blue_dark,
        loginLoadingGradientFourth = MovistarPaletteColor.movistar_color_blue_dark,
    )

    override val darkColors =
        lightColors.copy(
            appBarBackground = MovistarPaletteColor.movistar_color_darkModeGrey,
            background = MovistarPaletteColor.movistar_color_darkModeBlack,
            backgroundContainer = MovistarPaletteColor.movistar_color_darkModeGrey,
            backgroundBrand = MovistarPaletteColor.movistar_color_darkModeBlack,
            backgroundOverlay = MovistarPaletteColor.movistar_color_darkModeGrey_80_alpha,
            backgroundSkeleton = MovistarPaletteColor.movistar_color_grey_6,
            backgroundSkeletonInverse = MovistarPaletteColor.movistar_color_grey_6,
            navigationBarBackground = MovistarPaletteColor.movistar_color_darkModeBlack,
            backgroundAlternative = MovistarPaletteColor.movistar_color_darkModeGrey,
            backgroundFeedbackBottom = MovistarPaletteColor.movistar_color_darkModeBlack,
            skeletonWave = MovistarPaletteColor.movistar_color_grey_5_30_alpha,
            borderLight = MovistarPaletteColor.movistar_color_darkModeBlack,
            border = MovistarPaletteColor.movistar_color_darkModeGrey,
            buttonDangerBackgroundDisabled = MovistarPaletteColor.movistar_color_darkModeGrey,
            buttonLinkBackgroundSelected = MovistarPaletteColor.movistar_color_white_5_alpha,
            buttonLinkBackgroundSelectedInverse = MovistarPaletteColor.movistar_color_white_5_alpha,
            buttonPrimaryBackgroundDisabled = MovistarPaletteColor.movistar_color_darkModeGrey,
            buttonPrimaryBackgroundDisabledInverse = MovistarPaletteColor.movistar_color_darkModeGrey,
            buttonPrimaryBackgroundInverse = MovistarPaletteColor.movistar_color_green,
            buttonPrimaryBackgroundSelectedInverse = MovistarPaletteColor.movistar_color_green_dark,
            buttonSecondaryBackgroundDisabled = MovistarPaletteColor.movistar_color_darkModeGrey,
            buttonSecondaryBorderDisabledInverse = MovistarPaletteColor.movistar_color_darkModeGrey,
            buttonSecondaryBorderInverse = MovistarPaletteColor.movistar_color_green,
            buttonSecondaryBorderSelectedInverse = MovistarPaletteColor.movistar_color_green_dark,
            textButtonPrimary = MovistarPaletteColor.movistar_color_grey_2,
            textButtonPrimaryDisabled = MovistarPaletteColor.movistar_color_grey_5,
            textButtonPrimaryInverse = MovistarPaletteColor.movistar_color_grey_2,
            textButtonPrimaryInverseDisabled = MovistarPaletteColor.movistar_color_grey_5,
            textButtonPrimaryInverseSelected = MovistarPaletteColor.movistar_color_grey_2,
            textButtonSecondary = MovistarPaletteColor.movistar_color_grey_2,
            textButtonSecondaryDisabled = MovistarPaletteColor.movistar_color_grey_5,
            textButtonSecondaryInverse = MovistarPaletteColor.movistar_color_grey_2,
            textButtonSecondaryInverseDisabled = MovistarPaletteColor.movistar_color_grey_5,
            textButtonSecondaryInverseSelected = MovistarPaletteColor.movistar_color_green_dark,
            textLinkInverse = MovistarPaletteColor.movistar_color_blue,
            textLinkDangerDisabled = MovistarPaletteColor.movistar_color_grey_5,
            textLinkDisabled = MovistarPaletteColor.movistar_color_grey_6,
            control = MovistarPaletteColor.movistar_color_grey_6,
            loadingBar = MovistarPaletteColor.movistar_color_blue,
            loadingBarBackground = MovistarPaletteColor.movistar_color_grey_6,
            divider = MovistarPaletteColor.movistar_color_white_5_alpha,
            dividerInverse = MovistarPaletteColor.movistar_color_white_5_alpha,
            navigationBarDivider = MovistarPaletteColor.movistar_color_darkModeBlack,
            brandDark = MovistarPaletteColor.movistar_color_grey_6,
            inverse = MovistarPaletteColor.movistar_color_grey_2,
            neutralHigh = MovistarPaletteColor.movistar_color_grey_2,
            neutralLow = MovistarPaletteColor.movistar_color_grey_6,
            textPrimary = MovistarPaletteColor.movistar_color_grey_2,
            textPrimaryInverse = MovistarPaletteColor.movistar_color_grey_2,
            textSecondary = MovistarPaletteColor.movistar_color_grey_4,
            textSecondaryInverse = MovistarPaletteColor.movistar_color_grey_4,
            textDisabled = MovistarPaletteColor.movistar_color_grey_5,
            textAmount = MovistarPaletteColor.movistar_color_blue_light50,
            textNavigationBarPrimary = MovistarPaletteColor.movistar_color_grey_2,
            textNavigationBarSecondary = MovistarPaletteColor.movistar_color_grey_4,
            textAppBar = MovistarPaletteColor.movistar_color_grey_5,
            textAppBarSelected = MovistarPaletteColor.movistar_color_grey_2,
            loginLoadingGradientFirst = MovistarPaletteColor.movistar_color_grey_6,
            loginLoadingGradientSecond = MovistarPaletteColor.movistar_color_grey_6,
            loginLoadingGradientThird = MovistarPaletteColor.movistar_color_grey_6,
            loginLoadingGradientFourth = MovistarPaletteColor.movistar_color_grey_6,
        )
}

object MovistarProminentBrand: Brand {

    override val compatibilityTheme: Int
        get() = R.style.MisticaTheme_Movistar_Prominent

    override val lightColors = MovistarBrand.lightColors.copy(
        brand = MovistarPaletteColor.movistar_prominent_color_blue,
        backgroundBrand = MovistarPaletteColor.movistar_prominent_color_blue,
        navigationBarBackground = MovistarPaletteColor.movistar_prominent_color_blue,
        brandDark = MovistarPaletteColor.movistar_prominent_color_blue_dark,
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
}

private object MovistarPaletteColor {
    val movistar_color_blue = Color(0xFF019DF4)
    val movistar_color_blue_dark = Color(0xFF008EDD)
    val movistar_color_blue_light50 = Color(0xFF80CEF9)
    val movistar_color_blue_light30 = Color(0xFFB3E1FB)
    val movistar_color_blue_light10 = Color(0xFFE6F5FD)
    val movistar_color_green = Color(0xFF5CB615)
    val movistar_color_green_dark = Color(0xFF499110)
    val movistar_color_green_light50 = Color(0xFFADDA8A)
    val movistar_color_green_light50_40_alpha = Color(0x66ADDA8A)
    val movistar_color_green_light30 = Color(0xFFCEE9B9)
    val movistar_color_pepper = Color(0xFFFF374A)
    val movistar_color_pepper_dark = Color(0xFFD73241)
    val movistar_color_pepper_light30 = Color(0xFFFFC3C8)
    val movistar_color_egg = Color(0xFFF28D15)
    val movistar_color_egg_light = Color(0xFFF8D2B3)
    val movistar_color_pink = Color(0xFFE63780)
    val movistar_color_purple = Color(0xFFA13EA1)
    val movistar_color_grey_1 = Color(0xFFF6F6F6)
    val movistar_color_grey_2 = Color(0xFFEEEEEE)
    val movistar_color_grey_3 = Color(0xFFDDDDDD)
    val movistar_color_grey_4 = Color(0xFF999999)
    val movistar_color_grey_5 = Color(0xFF86888C)
    val movistar_color_grey_6 = Color(0xFF313235)
    val movistar_color_white = Color(0xFFFFFFFF)

    // Prominent Color Palette
    val movistar_prominent_color_blue = Color(0xFF0B2739)
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
