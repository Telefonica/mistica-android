package com.telefonica.mistica.tokens.xml

class GetDrawableResourceName {
    operator fun invoke(
        brandName: String,
        tokenName: String,
        isDark: Boolean,
    ): String = "autogenerated_${brandName}_${isDarkInfix(isDark)}_${tokenName}".lowercase()

    private fun isDarkInfix(isDark: Boolean) =
        if (isDark) "dark" else "light"

}