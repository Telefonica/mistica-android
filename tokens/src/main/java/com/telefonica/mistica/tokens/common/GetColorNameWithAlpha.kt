package com.telefonica.mistica.tokens.common

class GetColorNameWithAlpha {

    operator fun invoke(
        brandName: String,
        colorName: String,
        alpha: Double,
    ) = "${brandName}_color_${colorName}_${(alpha * 100).toInt()}_alpha"
}
