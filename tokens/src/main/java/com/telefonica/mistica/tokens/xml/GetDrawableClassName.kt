package com.telefonica.mistica.tokens.xml

import com.telefonica.mistica.tokens.xml.GenerateXMLFiles.Companion.capitalizeString

class GetDrawableClassName {
    operator fun invoke(tokenName: String, brandName: String, isDark: Boolean): String =
        "${brandName.capitalizeString()}${getDarkInfix(isDark)}${tokenName.capitalizeString()}"

    private fun getDarkInfix(isDark: Boolean): String =
        if (isDark) "Dark" else "Light"
}