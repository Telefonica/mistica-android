package com.telefonica.mistica.tokens.common

import com.telefonica.mistica.tokens.TokensGenerator

class GetColorResourceName(
    private val getColorNameWithAlpha: GetColorNameWithAlpha = GetColorNameWithAlpha(),
) {
    operator fun invoke(
        colorSpecification: String,
        brandName: String,
    ): String {
        val baseColorName = TokensGenerator.COLOR_NAME_REGEX.find(colorSpecification)?.groups?.get(1)?.value
        var colorResourceName = "${brandName}_color_${baseColorName}"
        if (colorSpecification.contains("rgba(")) {
            val alpha = TokensGenerator.ALPHA_REGEX.find(colorSpecification)?.groups?.get(1)?.value?.toDouble()
            if (alpha != null && baseColorName != null) {
                colorResourceName = getColorNameWithAlpha(brandName, baseColorName, alpha)
            }
        }
        return colorResourceName
    }
}
