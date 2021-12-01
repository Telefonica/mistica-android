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
        backgroundContainer = TelefonicaPaletteColor.telefonica_color_white,
        backgroundBrand = TelefonicaPaletteColor.telefonica_color_blue,
        backgroundOverlay = TelefonicaPaletteColor.telefonica_color_grey_6_60_alpha,
        backgroundSkeleton = TelefonicaPaletteColor.telefonica_color_grey_1,
        backgroundSkeletonInverse = TelefonicaPaletteColor.telefonica_color_blue_dark,
        navigationBarBackground = TelefonicaPaletteColor.telefonica_color_blue,
        backgroundAlternative = TelefonicaPaletteColor.telefonica_color_grey_1,
        backgroundFeedbackBottom = TelefonicaPaletteColor.telefonica_color_blue,
        skeletonWave = TelefonicaPaletteColor.telefonica_color_grey_2,
        borderLight = TelefonicaPaletteColor.telefonica_color_grey_1,
        border = TelefonicaPaletteColor.telefonica_color_grey_2,
        borderDark = TelefonicaPaletteColor.telefonica_color_grey_5,
        borderSelected = TelefonicaPaletteColor.telefonica_color_blue,
        buttonDangerBackground = TelefonicaPaletteColor.telefonica_color_coral,
        buttonDangerBackgroundDisabled = TelefonicaPaletteColor.telefonica_color_grey_2,
        buttonDangerBackgroundSelected = TelefonicaPaletteColor.telefonica_color_coral_dark,
        buttonLinkBackgroundSelected = TelefonicaPaletteColor.telefonica_color_grey_1,
        buttonLinkBackgroundSelectedInverse = TelefonicaPaletteColor.telefonica_color_white_20_alpha,
        buttonPrimaryBackground = TelefonicaPaletteColor.telefonica_color_blue,
        buttonPrimaryBackgroundDisabled = TelefonicaPaletteColor.telefonica_color_grey_2,
        buttonPrimaryBackgroundDisabledInverse = TelefonicaPaletteColor.telefonica_color_blue_light50,
        buttonPrimaryBackgroundInverse = TelefonicaPaletteColor.telefonica_color_white,
        buttonPrimaryBackgroundSelected = TelefonicaPaletteColor.telefonica_color_blue_dark,
        buttonPrimaryBackgroundSelectedInverse = TelefonicaPaletteColor.telefonica_color_blue_light50,
        buttonSecondaryBackground = TelefonicaPaletteColor.telefonica_color_blue,
        buttonSecondaryBackgroundDisabled = TelefonicaPaletteColor.telefonica_color_grey_2,
        buttonSecondaryBackgroundSelected = TelefonicaPaletteColor.telefonica_color_blue_dark,
        buttonSecondaryBorderDisabledInverse = TelefonicaPaletteColor.telefonica_color_blue_light50,
        buttonSecondaryBorderInverse = TelefonicaPaletteColor.telefonica_color_white,
        buttonSecondaryBorderSelectedInverse = TelefonicaPaletteColor.telefonica_color_blue_light50,
        textButtonPrimary = TelefonicaPaletteColor.telefonica_color_white,
        textButtonPrimaryDisabled = TelefonicaPaletteColor.telefonica_color_white,
        textButtonPrimaryInverse = TelefonicaPaletteColor.telefonica_color_blue,
        textButtonPrimaryInverseDisabled = TelefonicaPaletteColor.telefonica_color_blue_light30,
        textButtonPrimaryInverseSelected = TelefonicaPaletteColor.telefonica_color_blue,
        textButtonSecondary = TelefonicaPaletteColor.telefonica_color_blue,
        textButtonSecondaryDisabled = TelefonicaPaletteColor.telefonica_color_grey_2,
        textButtonSecondarySelected = TelefonicaPaletteColor.telefonica_color_blue_dark,
        textButtonSecondaryInverse = TelefonicaPaletteColor.telefonica_color_white,
        textButtonSecondaryInverseDisabled = TelefonicaPaletteColor.telefonica_color_blue_light50,
        textButtonSecondaryInverseSelected = TelefonicaPaletteColor.telefonica_color_white,
        textLink = TelefonicaPaletteColor.telefonica_color_blue,
        textLinkInverse = TelefonicaPaletteColor.telefonica_color_white,
        textLinkDanger = TelefonicaPaletteColor.telefonica_color_coral,
        textLinkDangerDisabled = TelefonicaPaletteColor.telefonica_color_grey_2,
        textLinkDisabled = TelefonicaPaletteColor.telefonica_color_grey_2,
        textLinkSnackbar = TelefonicaPaletteColor.telefonica_color_blue_light50,
        control = TelefonicaPaletteColor.telefonica_color_grey_3,
        controlActive = TelefonicaPaletteColor.telefonica_color_blue,
        controlError = TelefonicaPaletteColor.telefonica_color_coral,
        loadingBar = TelefonicaPaletteColor.telefonica_color_blue_light50,
        loadingBarBackground = TelefonicaPaletteColor.telefonica_color_blue_dark,
        divider = TelefonicaPaletteColor.telefonica_color_grey_2,
        dividerInverse = TelefonicaPaletteColor.telefonica_color_white,
        navigationBarDivider = TelefonicaPaletteColor.telefonica_color_blue,
        badge = TelefonicaPaletteColor.telefonica_color_coral_dark,
        feedbackErrorBackground = TelefonicaPaletteColor.telefonica_color_coral,
        feedbackInfoBackground = TelefonicaPaletteColor.telefonica_color_grey_9,
        brand = TelefonicaPaletteColor.telefonica_color_blue,
        brandDark = TelefonicaPaletteColor.telefonica_color_blue_dark,
        inverse = TelefonicaPaletteColor.telefonica_color_white,
        neutralHigh = TelefonicaPaletteColor.telefonica_color_grey_9,
        neutralLow = TelefonicaPaletteColor.telefonica_color_grey_1,
        neutralMedium = TelefonicaPaletteColor.telefonica_color_grey_5,
        promo = TelefonicaPaletteColor.telefonica_color_orchid,
        highlight = TelefonicaPaletteColor.telefonica_color_coral_light,
        textPrimary = TelefonicaPaletteColor.telefonica_color_grey_9,
        textPrimaryInverse = TelefonicaPaletteColor.telefonica_color_white,
        textSecondary = TelefonicaPaletteColor.telefonica_color_grey_5,
        textSecondaryInverse = TelefonicaPaletteColor.telefonica_color_white,
        textDisabled = TelefonicaPaletteColor.telefonica_color_grey_3,
        textAmount = TelefonicaPaletteColor.telefonica_color_blue,
        error = TelefonicaPaletteColor.telefonica_color_coral,
        success = TelefonicaPaletteColor.telefonica_color_turquoise,
        warning = TelefonicaPaletteColor.telefonica_color_ambar,
        textNavigationBarPrimary = TelefonicaPaletteColor.telefonica_color_white,
        textNavigationBarSecondary = TelefonicaPaletteColor.telefonica_color_grey_1,
        textAppBar = TelefonicaPaletteColor.telefonica_color_grey_4,
        textAppBarSelected = TelefonicaPaletteColor.telefonica_color_blue,
        gradientBackgroundFirst = TelefonicaPaletteColor.telefonica_color_blue,
        gradientBackgroundSecond = TelefonicaPaletteColor.telefonica_color_blue,
        gradientBackgroundThird = TelefonicaPaletteColor.telefonica_color_blue,
        gradientBackgroundFourth = TelefonicaPaletteColor.telefonica_color_blue,
        loginLoadingGradientFirst = TelefonicaPaletteColor.telefonica_color_blue_dark,
        loginLoadingGradientSecond = TelefonicaPaletteColor.telefonica_color_blue_dark,
        loginLoadingGradientThird = TelefonicaPaletteColor.telefonica_color_blue_dark,
        loginLoadingGradientFourth = TelefonicaPaletteColor.telefonica_color_blue_dark,
        tagBackgroundSuccess = TelefonicaPaletteColor.telefonica_color_turquoise_10,
        tagBackgroundWarning = TelefonicaPaletteColor.telefonica_color_ambar_10,
        tagBackgroundError = TelefonicaPaletteColor.telefonica_color_coral_10,
        tagBackgroundPromo = TelefonicaPaletteColor.telefonica_color_orchid_10,
        tagBackgroundActive = TelefonicaPaletteColor.telefonica_color_grey_1,
        tagBackgroundInactive = TelefonicaPaletteColor.telefonica_color_grey_1,
        textTagSuccess = TelefonicaPaletteColor.telefonica_color_turquoise_70,
        textTagWarning = TelefonicaPaletteColor.telefonica_color_ambar_70,
        textTagError = TelefonicaPaletteColor.telefonica_color_coral_70,
        textTagPromo = TelefonicaPaletteColor.telefonica_color_orchid_70,
        textTagActive = TelefonicaPaletteColor.telefonica_color_blue,
        textTagInactive = TelefonicaPaletteColor.telefonica_color_grey_6,
    )

    override val darkColors = MisticaColors(
        appBarBackground = TelefonicaPaletteColor.telefonica_color_darkModeGrey,
        background = TelefonicaPaletteColor.telefonica_color_darkModeBlack,
        backgroundContainer = TelefonicaPaletteColor.telefonica_color_darkModeGrey,
        backgroundBrand = TelefonicaPaletteColor.telefonica_color_darkModeBlack,
        backgroundOverlay = TelefonicaPaletteColor.telefonica_color_darkModeGrey_80_alpha,
        backgroundSkeleton = TelefonicaPaletteColor.telefonica_color_grey_6,
        backgroundSkeletonInverse = TelefonicaPaletteColor.telefonica_color_grey_6,
        navigationBarBackground = TelefonicaPaletteColor.telefonica_color_darkModeBlack,
        backgroundAlternative = TelefonicaPaletteColor.telefonica_color_darkModeGrey,
        backgroundFeedbackBottom = TelefonicaPaletteColor.telefonica_color_darkModeBlack,
        skeletonWave = TelefonicaPaletteColor.telefonica_color_grey_5,
        borderLight = TelefonicaPaletteColor.telefonica_color_darkModeBlack,
        border = TelefonicaPaletteColor.telefonica_color_darkModeGrey,
        borderDark = TelefonicaPaletteColor.telefonica_color_grey_5,
        borderSelected = TelefonicaPaletteColor.telefonica_color_blue,
        buttonDangerBackground = TelefonicaPaletteColor.telefonica_color_coral,
        buttonDangerBackgroundDisabled = TelefonicaPaletteColor.telefonica_color_darkModeGrey,
        buttonDangerBackgroundSelected = TelefonicaPaletteColor.telefonica_color_coral_dark,
        buttonLinkBackgroundSelected = TelefonicaPaletteColor.telefonica_color_white_5_alpha,
        buttonLinkBackgroundSelectedInverse = TelefonicaPaletteColor.telefonica_color_white_5_alpha,
        buttonPrimaryBackground = TelefonicaPaletteColor.telefonica_color_blue,
        buttonPrimaryBackgroundDisabled = TelefonicaPaletteColor.telefonica_color_darkModeGrey,
        buttonPrimaryBackgroundDisabledInverse = TelefonicaPaletteColor.telefonica_color_darkModeGrey,
        buttonPrimaryBackgroundInverse = TelefonicaPaletteColor.telefonica_color_blue,
        buttonPrimaryBackgroundSelected = TelefonicaPaletteColor.telefonica_color_blue_dark,
        buttonPrimaryBackgroundSelectedInverse = TelefonicaPaletteColor.telefonica_color_blue_dark,
        buttonSecondaryBackground = TelefonicaPaletteColor.telefonica_color_blue,
        buttonSecondaryBackgroundDisabled = TelefonicaPaletteColor.telefonica_color_darkModeGrey,
        buttonSecondaryBackgroundSelected = TelefonicaPaletteColor.telefonica_color_blue_dark,
        buttonSecondaryBorderDisabledInverse = TelefonicaPaletteColor.telefonica_color_darkModeGrey,
        buttonSecondaryBorderInverse = TelefonicaPaletteColor.telefonica_color_blue,
        buttonSecondaryBorderSelectedInverse = TelefonicaPaletteColor.telefonica_color_blue_dark,
        textButtonPrimary = TelefonicaPaletteColor.telefonica_color_grey_2,
        textButtonPrimaryDisabled = TelefonicaPaletteColor.telefonica_color_grey_5,
        textButtonPrimaryInverse = TelefonicaPaletteColor.telefonica_color_grey_2,
        textButtonPrimaryInverseDisabled = TelefonicaPaletteColor.telefonica_color_grey_5,
        textButtonPrimaryInverseSelected = TelefonicaPaletteColor.telefonica_color_grey_2,
        textButtonSecondary = TelefonicaPaletteColor.telefonica_color_grey_2,
        textButtonSecondaryDisabled = TelefonicaPaletteColor.telefonica_color_grey_5,
        textButtonSecondarySelected = TelefonicaPaletteColor.telefonica_color_blue_dark,
        textButtonSecondaryInverse = TelefonicaPaletteColor.telefonica_color_grey_2,
        textButtonSecondaryInverseDisabled = TelefonicaPaletteColor.telefonica_color_grey_5,
        textButtonSecondaryInverseSelected = TelefonicaPaletteColor.telefonica_color_blue_dark,
        textLink = TelefonicaPaletteColor.telefonica_color_blue,
        textLinkInverse = TelefonicaPaletteColor.telefonica_color_blue,
        textLinkDanger = TelefonicaPaletteColor.telefonica_color_coral,
        textLinkDangerDisabled = TelefonicaPaletteColor.telefonica_color_grey_5,
        textLinkDisabled = TelefonicaPaletteColor.telefonica_color_grey_6,
        textLinkSnackbar = TelefonicaPaletteColor.telefonica_color_blue_light50,
        control = TelefonicaPaletteColor.telefonica_color_grey_6,
        controlActive = TelefonicaPaletteColor.telefonica_color_blue,
        controlError = TelefonicaPaletteColor.telefonica_color_coral,
        loadingBar = TelefonicaPaletteColor.telefonica_color_blue,
        loadingBarBackground = TelefonicaPaletteColor.telefonica_color_grey_6,
        divider = TelefonicaPaletteColor.telefonica_color_white_5_alpha,
        dividerInverse = TelefonicaPaletteColor.telefonica_color_white_5_alpha,
        navigationBarDivider = TelefonicaPaletteColor.telefonica_color_darkModeBlack,
        badge = TelefonicaPaletteColor.telefonica_color_coral_dark,
        feedbackErrorBackground = TelefonicaPaletteColor.telefonica_color_coral,
        feedbackInfoBackground = TelefonicaPaletteColor.telefonica_color_grey_8,
        brand = TelefonicaPaletteColor.telefonica_color_blue,
        brandDark = TelefonicaPaletteColor.telefonica_color_grey_6,
        inverse = TelefonicaPaletteColor.telefonica_color_grey_2,
        neutralHigh = TelefonicaPaletteColor.telefonica_color_grey_2,
        neutralLow = TelefonicaPaletteColor.telefonica_color_grey_6,
        neutralMedium = TelefonicaPaletteColor.telefonica_color_grey_5,
        promo = TelefonicaPaletteColor.telefonica_color_orchid,
        highlight = TelefonicaPaletteColor.telefonica_color_coral_light,
        textPrimary = TelefonicaPaletteColor.telefonica_color_grey_2,
        textPrimaryInverse = TelefonicaPaletteColor.telefonica_color_grey_2,
        textSecondary = TelefonicaPaletteColor.telefonica_color_grey_4,
        textSecondaryInverse = TelefonicaPaletteColor.telefonica_color_grey_4,
        textDisabled = TelefonicaPaletteColor.telefonica_color_grey_5,
        textAmount = TelefonicaPaletteColor.telefonica_color_blue_light50,
        error = TelefonicaPaletteColor.telefonica_color_coral,
        success = TelefonicaPaletteColor.telefonica_color_turquoise,
        warning = TelefonicaPaletteColor.telefonica_color_ambar,
        textNavigationBarPrimary = TelefonicaPaletteColor.telefonica_color_grey_2,
        textNavigationBarSecondary = TelefonicaPaletteColor.telefonica_color_grey_4,
        textAppBar = TelefonicaPaletteColor.telefonica_color_grey_5,
        textAppBarSelected = TelefonicaPaletteColor.telefonica_color_grey_2,
        gradientBackgroundFirst = TelefonicaPaletteColor.telefonica_color_blue,
        gradientBackgroundSecond = TelefonicaPaletteColor.telefonica_color_blue,
        gradientBackgroundThird = TelefonicaPaletteColor.telefonica_color_blue,
        gradientBackgroundFourth = TelefonicaPaletteColor.telefonica_color_blue,
        loginLoadingGradientFirst = TelefonicaPaletteColor.telefonica_color_grey_6,
        loginLoadingGradientSecond = TelefonicaPaletteColor.telefonica_color_grey_6,
        loginLoadingGradientThird = TelefonicaPaletteColor.telefonica_color_grey_6,
        loginLoadingGradientFourth = TelefonicaPaletteColor.telefonica_color_grey_6,
        tagBackgroundSuccess = TelefonicaPaletteColor.telefonica_color_white_5_alpha,
        tagBackgroundWarning = TelefonicaPaletteColor.telefonica_color_white_5_alpha,
        tagBackgroundError = TelefonicaPaletteColor.telefonica_color_white_5_alpha,
        tagBackgroundPromo = TelefonicaPaletteColor.telefonica_color_white_5_alpha,
        tagBackgroundActive = TelefonicaPaletteColor.telefonica_color_white_5_alpha,
        tagBackgroundInactive = TelefonicaPaletteColor.telefonica_color_white_5_alpha,
        textTagSuccess = TelefonicaPaletteColor.telefonica_color_turquoise_40,
        textTagWarning = TelefonicaPaletteColor.telefonica_color_ambar_40,
        textTagError = TelefonicaPaletteColor.telefonica_color_coral_40,
        textTagPromo = TelefonicaPaletteColor.telefonica_color_orchid_40,
        textTagActive = TelefonicaPaletteColor.telefonica_color_blue_30,
        textTagInactive = TelefonicaPaletteColor.telefonica_color_grey_4,
    )
}

private object TelefonicaPaletteColor {
    val telefonica_color_blue = Color(0xFF0066FF)
    val telefonica_color_blue_30 = Color(0xFF80B3FF)

    val telefonica_color_blue_dark = Color(0xFF0356C9)
    val telefonica_color_blue_light50 = Color(0xFF80B2FF)
    val telefonica_color_blue_light30 = Color(0xFFB3D1FF)
    val telefonica_color_blue_light10 = Color(0xFFEBF3FF)

    val telefonica_color_green = Color(0xFF5CB615)
    val telefonica_color_green_dark = Color(0xFF499110)
    val telefonica_color_green_light50 = Color(0xFFADDA8A)
    val telefonica_color_green_light50_40_alpha = Color(0x66ADDA8A)
    val telefonica_color_green_light30 = Color(0xFFCEE9B9)

    val telefonica_color_pepper = Color(0xFFFF374A)
    val telefonica_color_pepper_dark = Color(0xFFD73241)
    val telefonica_color_pepper_light30 = Color(0xFFFFC3C8)

    val telefonica_color_egg = Color(0xFFF28D15)
    val telefonica_color_egg_light = Color(0xFFF8D2B3)

    val telefonica_color_ambar = Color(0xFFEAC344)
    val telefonica_color_ambar_10 = Color(0xFFFDF9EC)
    val telefonica_color_ambar_40 = Color(0xFFF0D57C)
    val telefonica_color_ambar_70 = Color(0xFF69581F)
    val telefonica_color_ambar_light = Color(0xFFF5E98A)
    val telefonica_color_ambar_dark = Color(0xFFAD842D)

    val telefonica_color_coral = Color(0xFFE66C64)
    val telefonica_color_coral_10 = Color(0xFFFDF0EF)
    val telefonica_color_coral_40 = Color(0xFFE3A19A)
    val telefonica_color_coral_70 = Color(0xFFD50000)
    val telefonica_color_coral_light = Color(0xFFE3A19A)
    val telefonica_color_coral_dark = Color(0xFF912C31)

    val telefonica_color_orchid = Color(0xFFC466EF)
    val telefonica_color_orchid_10 = Color(0xFFF9F0FD)
    val telefonica_color_orchid_40 = Color(0xFFD694F4)
    val telefonica_color_orchid_70 = Color(0xFF8947A7)
    val telefonica_color_orchid_light = Color(0xFFE7C2F8)
    val telefonica_color_orchid_dark = Color(0xFF8A1A93)

    val telefonica_color_turquoise = Color(0xFF59C2C9)
    val telefonica_color_turquoise_10 = Color(0xFFEEF9FA)
    val telefonica_color_turquoise_40 = Color(0xFF8BD4D9)
    val telefonica_color_turquoise_70 = Color(0xFF3E888D)
    val telefonica_color_turquoise_light = Color(0xFF67E0E5)
    val telefonica_color_turquoise_dark = Color(0xFF3E8A8A)

    val telefonica_color_pink = Color(0xFFE63780)
    val telefonica_color_purple = Color(0xFFA13EA1)

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
    val telefonica_color_white_50_alpha = Color(0x80FFFFFF)
    val telefonica_color_grey_5_30_alpha = Color(0x4D86888C)
    val telefonica_color_grey_6_80_alpha = Color(0xCC313235)
    val telefonica_color_grey_6_60_alpha = Color(0x99313235)
    val telefonica_color_grey_6_40_alpha = Color(0x66313235)
    val telefonica_color_grey_6_30_alpha = Color(0x4D313235)
    val telefonica_color_blue_dark_80_alpha = Color(0xCC008EDD)
    val telefonica_color_blue_light30_30_alpha = Color(0x4DB3E1FB)
    val telefonica_color_blue_light50_25_alpha = Color(0x4080CEF9)

    // Dark Mode Color Palette
    val telefonica_color_darkModeBlack = Color(0xFF191919)
    val telefonica_color_darkModeGrey = Color(0xFF242424)
    val telefonica_color_darkModeGrey_80_alpha = Color(0xCC242424)
}
