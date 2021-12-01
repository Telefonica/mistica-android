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
        backgroundContainer = O2PaletteColor.o2_color_white,
        backgroundBrand = O2PaletteColor.o2_color_blue_primary,
        backgroundOverlay = O2PaletteColor.o2_color_grey_6_60_alpha,
        backgroundSkeleton = O2PaletteColor.o2_color_grey_1,
        backgroundSkeletonInverse = O2PaletteColor.o2_color_white_20_alpha,
        navigationBarBackground = O2PaletteColor.o2_color_blue_primary,
        backgroundAlternative = O2PaletteColor.o2_color_grey_1,
        backgroundFeedbackBottom = O2PaletteColor.o2_color_blue_primary,
        skeletonWave = O2PaletteColor.o2_color_grey_2,
        borderLight = O2PaletteColor.o2_color_grey_1,
        border = O2PaletteColor.o2_color_grey_3,
        borderDark = O2PaletteColor.o2_color_grey_5,
        borderSelected = O2PaletteColor.o2_color_blue_primary,
        buttonDangerBackground = O2PaletteColor.o2_color_pepper,
        buttonDangerBackgroundDisabled = O2PaletteColor.o2_color_pepper_light30,
        buttonDangerBackgroundSelected = O2PaletteColor.o2_color_pepper_dark,
        buttonLinkBackgroundSelected = O2PaletteColor.o2_color_blue_light_10,
        buttonLinkBackgroundSelectedInverse = O2PaletteColor.o2_color_white_20_alpha,
        buttonPrimaryBackground = O2PaletteColor.o2_color_blue_primary,
        buttonPrimaryBackgroundDisabled = O2PaletteColor.o2_color_blue_primary_light_10,
        buttonPrimaryBackgroundDisabledInverse = O2PaletteColor.o2_color_blue_primary_light_50,
        buttonPrimaryBackgroundInverse = O2PaletteColor.o2_color_white,
        buttonPrimaryBackgroundSelected = O2PaletteColor.o2_color_blue_primary_dark,
        buttonPrimaryBackgroundSelectedInverse = O2PaletteColor.o2_color_blue_primary_light_50,
        buttonSecondaryBackground = O2PaletteColor.o2_color_blue_primary,
        buttonSecondaryBackgroundDisabled = O2PaletteColor.o2_color_blue_primary_light_10,
        buttonSecondaryBackgroundSelected = O2PaletteColor.o2_color_blue_primary_dark,
        buttonSecondaryBorderDisabledInverse = O2PaletteColor.o2_color_blue_primary_light_50,
        buttonSecondaryBorderInverse = O2PaletteColor.o2_color_white,
        buttonSecondaryBorderSelectedInverse = O2PaletteColor.o2_color_blue_primary_light_50,
        textButtonPrimary = O2PaletteColor.o2_color_white,
        textButtonPrimaryDisabled = O2PaletteColor.o2_color_white,
        textButtonPrimaryInverse = O2PaletteColor.o2_color_blue_primary,
        textButtonPrimaryInverseDisabled = O2PaletteColor.o2_color_blue_primary_light_10,
        textButtonPrimaryInverseSelected = O2PaletteColor.o2_color_blue_primary_dark,
        textButtonSecondary = O2PaletteColor.o2_color_blue_primary,
        textButtonSecondaryDisabled = O2PaletteColor.o2_color_blue_primary_light_10,
        textButtonSecondarySelected = O2PaletteColor.o2_color_blue_primary_dark,
        textButtonSecondaryInverse = O2PaletteColor.o2_color_white,
        textButtonSecondaryInverseDisabled = O2PaletteColor.o2_color_blue_primary_light_50,
        textButtonSecondaryInverseSelected = O2PaletteColor.o2_color_white,
        textLink = O2PaletteColor.o2_color_blue_primary,
        textLinkInverse = O2PaletteColor.o2_color_white,
        textLinkDanger = O2PaletteColor.o2_color_pepper,
        textLinkDangerDisabled = O2PaletteColor.o2_color_pepper_light30,
        textLinkDisabled = O2PaletteColor.o2_color_blue_primary_light_50,
        textLinkSnackbar = O2PaletteColor.o2_color_blue_primary_light_50,
        control = O2PaletteColor.o2_color_grey_3,
        controlActive = O2PaletteColor.o2_color_blue_primary,
        controlError = O2PaletteColor.o2_color_pepper,
        loadingBar = O2PaletteColor.o2_color_blue_primary,
        loadingBarBackground = O2PaletteColor.o2_color_grey_1,
        divider = O2PaletteColor.o2_color_grey_2,
        dividerInverse = O2PaletteColor.o2_color_white_20_alpha,
        navigationBarDivider = O2PaletteColor.o2_color_blue_primary,
        badge = O2PaletteColor.o2_color_pepper_dark,
        feedbackErrorBackground = O2PaletteColor.o2_color_pepper,
        feedbackInfoBackground = O2PaletteColor.o2_color_grey_6,
        brand = O2PaletteColor.o2_color_blue_primary,
        brandDark = O2PaletteColor.o2_color_blue_primary_dark,
        inverse = O2PaletteColor.o2_color_white,
        neutralHigh = O2PaletteColor.o2_color_grey_6,
        neutralMedium = O2PaletteColor.o2_color_grey_5,
        neutralLow = O2PaletteColor.o2_color_grey_3,
        promo = O2PaletteColor.o2_color_purple,
        highlight = O2PaletteColor.o2_color_pink,
        textPrimary = O2PaletteColor.o2_color_grey_6,
        textPrimaryInverse = O2PaletteColor.o2_color_white,
        textSecondary = O2PaletteColor.o2_color_grey_5,
        textSecondaryInverse = O2PaletteColor.o2_color_white,
        textDisabled = O2PaletteColor.o2_color_grey_3,
        textAmount = O2PaletteColor.o2_color_blue_primary,
        error = O2PaletteColor.o2_color_pepper,
        success = O2PaletteColor.o2_color_green,
        warning = O2PaletteColor.o2_color_orange,
        textNavigationBarPrimary = O2PaletteColor.o2_color_white,
        textNavigationBarSecondary = O2PaletteColor.o2_color_blue_primary_light_50,
        textAppBar = O2PaletteColor.o2_color_grey_4,
        textAppBarSelected = O2PaletteColor.o2_color_blue_primary,
        gradientBackgroundFirst = O2PaletteColor.o2_color_blue_primary,
        gradientBackgroundSecond = O2PaletteColor.o2_color_blue_primary,
        gradientBackgroundThird = O2PaletteColor.o2_color_blue_primary,
        gradientBackgroundFourth = O2PaletteColor.o2_color_blue_primary,
        loginLoadingGradientFirst = O2PaletteColor.o2_color_blue_primary,
        loginLoadingGradientSecond = O2PaletteColor.o2_color_blue_primary,
        loginLoadingGradientThird = O2PaletteColor.o2_color_blue_primary,
        loginLoadingGradientFourth = O2PaletteColor.o2_color_blue_primary,
        tagBackgroundSuccess = O2PaletteColor.o2_color_green_10,
        tagBackgroundWarning = O2PaletteColor.o2_color_orange_10,
        tagBackgroundError = O2PaletteColor.o2_color_pepper_10,
        tagBackgroundPromo = O2PaletteColor.o2_color_purple_10,
        tagBackgroundActive = O2PaletteColor.o2_color_blue_primary_10,
        tagBackgroundInactive = O2PaletteColor.o2_color_grey_1,
        textTagSuccess = O2PaletteColor.o2_color_green_80,
        textTagWarning = O2PaletteColor.o2_color_orange_75,
        textTagError = O2PaletteColor.o2_color_pepper_60,
        textTagPromo = O2PaletteColor.o2_color_purple,
        textTagActive = O2PaletteColor.o2_color_blue_primary,
        textTagInactive = O2PaletteColor.o2_color_grey_5,
    )

    override val darkColors = lightColors.copy(
        appBarBackground = O2PaletteColor.o2_color_darkModeGrey,
        background = O2PaletteColor.o2_color_darkModeBlack,
        backgroundContainer = O2PaletteColor.o2_color_darkModeGrey,
        backgroundBrand = O2PaletteColor.o2_color_darkModeBlack,
        backgroundOverlay = O2PaletteColor.o2_color_darkModeGrey_80_alpha,
        backgroundSkeleton = O2PaletteColor.o2_color_darkModeGrey6,
        backgroundSkeletonInverse = O2PaletteColor.o2_color_darkModeGrey6,
        navigationBarBackground = O2PaletteColor.o2_color_darkModeBlack,
        backgroundAlternative = O2PaletteColor.o2_color_darkModeGrey,
        backgroundFeedbackBottom = O2PaletteColor.o2_color_darkModeBlack,
        skeletonWave = O2PaletteColor.o2_color_grey_5_30_alpha,
        borderLight = O2PaletteColor.o2_color_darkModeGrey,
        border = O2PaletteColor.o2_color_darkModeGrey,
        borderSelected = O2PaletteColor.o2_color_darkModeO2BluePrimary,
        buttonDangerBackgroundDisabled = O2PaletteColor.o2_color_darkModeGrey,
        buttonLinkBackgroundSelected = O2PaletteColor.o2_color_darkModeGrey,
        buttonLinkBackgroundSelectedInverse = O2PaletteColor.o2_color_white_5_alpha,
        buttonPrimaryBackground = O2PaletteColor.o2_color_darkModeO2BluePrimary,
        buttonPrimaryBackgroundDisabled = O2PaletteColor.o2_color_darkModeGrey,
        buttonPrimaryBackgroundDisabledInverse = O2PaletteColor.o2_color_darkModeGrey,
        buttonPrimaryBackgroundInverse = O2PaletteColor.o2_color_darkModeO2BluePrimary,
        buttonPrimaryBackgroundSelected = O2PaletteColor.o2_color_darkModeO2BluePrimaryDark,
        buttonPrimaryBackgroundSelectedInverse = O2PaletteColor.o2_color_darkModeO2BluePrimaryDark,
        buttonSecondaryBackground = O2PaletteColor.o2_color_darkModeO2BluePrimary,
        buttonSecondaryBackgroundDisabled = O2PaletteColor.o2_color_darkModeGrey,
        buttonSecondaryBackgroundSelected = O2PaletteColor.o2_color_darkModeO2BluePrimaryDark,
        buttonSecondaryBorderDisabledInverse = O2PaletteColor.o2_color_darkModeGrey,
        buttonSecondaryBorderInverse = O2PaletteColor.o2_color_darkModeO2BluePrimary,
        buttonSecondaryBorderSelectedInverse = O2PaletteColor.o2_color_darkModeO2BluePrimaryDark,
        textButtonPrimary = O2PaletteColor.o2_color_grey_2,
        textButtonPrimaryDisabled = O2PaletteColor.o2_color_grey_5,
        textButtonPrimaryInverse = O2PaletteColor.o2_color_grey_2,
        textButtonPrimaryInverseDisabled = O2PaletteColor.o2_color_grey_5,
        textButtonPrimaryInverseSelected = O2PaletteColor.o2_color_grey_2,
        textButtonSecondary = O2PaletteColor.o2_color_grey_2,
        textButtonSecondaryDisabled = O2PaletteColor.o2_color_grey_5,
        textButtonSecondarySelected = O2PaletteColor.o2_color_grey_4,
        textButtonSecondaryInverse = O2PaletteColor.o2_color_grey_2,
        textButtonSecondaryInverseDisabled = O2PaletteColor.o2_color_grey_5,
        textButtonSecondaryInverseSelected = O2PaletteColor.o2_color_grey_4,
        textLink = O2PaletteColor.o2_color_blue_primary_light_50,
        textLinkInverse = O2PaletteColor.o2_color_blue_primary_light_50,
        textLinkDangerDisabled = O2PaletteColor.o2_color_grey_5,
        textLinkDisabled = O2PaletteColor.o2_color_darkModeGrey6,
        control = O2PaletteColor.o2_color_darkModeGrey6,
        controlActive = O2PaletteColor.o2_color_blue_primary_light_50,
        loadingBar = O2PaletteColor.o2_color_darkModeO2BluePrimary,
        loadingBarBackground = O2PaletteColor.o2_color_darkModeGrey6,
        divider = O2PaletteColor.o2_color_white_5_alpha,
        dividerInverse = O2PaletteColor.o2_color_white_5_alpha,
        navigationBarDivider = O2PaletteColor.o2_color_darkModeBlack,
        feedbackInfoBackground = O2PaletteColor.o2_color_darkModeGrey6,
        brand = O2PaletteColor.o2_color_blue_primary_light_50,
        brandDark = O2PaletteColor.o2_color_darkModeGrey6,
        inverse = O2PaletteColor.o2_color_grey_2,
        neutralHigh = O2PaletteColor.o2_color_grey_2,
        neutralLow = O2PaletteColor.o2_color_darkModeGrey6,
        textPrimary = O2PaletteColor.o2_color_grey_2,
        textPrimaryInverse = O2PaletteColor.o2_color_grey_2,
        textSecondary = O2PaletteColor.o2_color_grey_4,
        textSecondaryInverse = O2PaletteColor.o2_color_grey_4,
        textDisabled = O2PaletteColor.o2_color_grey_5,
        textAmount = O2PaletteColor.o2_color_blue_primary_light_10,
        textNavigationBarPrimary = O2PaletteColor.o2_color_grey_2,
        textNavigationBarSecondary = O2PaletteColor.o2_color_grey_4,
        textAppBar = O2PaletteColor.o2_color_grey_5,
        textAppBarSelected = O2PaletteColor.o2_color_grey_2,
        tagBackgroundSuccess = O2PaletteColor.o2_color_white_5_alpha,
        tagBackgroundWarning = O2PaletteColor.o2_color_white_5_alpha,
        tagBackgroundError = O2PaletteColor.o2_color_white_5_alpha,
        tagBackgroundPromo = O2PaletteColor.o2_color_white_5_alpha,
        tagBackgroundActive = O2PaletteColor.o2_color_white_5_alpha,
        tagBackgroundInactive = O2PaletteColor.o2_color_white_5_alpha,
        textTagSuccess = O2PaletteColor.o2_color_green_40,
        textTagWarning = O2PaletteColor.o2_color_orange_40,
        textTagError = O2PaletteColor.o2_color_pepper_40,
        textTagPromo = O2PaletteColor.o2_color_purple_30,
        textTagActive = O2PaletteColor.o2_color_blue_primary_15,
        textTagInactive = O2PaletteColor.o2_color_grey_4,
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
