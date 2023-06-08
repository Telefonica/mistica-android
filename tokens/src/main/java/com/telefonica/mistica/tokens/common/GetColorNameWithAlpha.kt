package com.telefonica.mistica.tokens.common

class GetColorNameWithAlpha {

    operator fun invoke(
        brandName: String,
        colorDescription: String,
        alpha: Double,
    ) = "${brandName}_color_${colorDescription}_${(alpha * 100).toInt()}_alpha"
}
