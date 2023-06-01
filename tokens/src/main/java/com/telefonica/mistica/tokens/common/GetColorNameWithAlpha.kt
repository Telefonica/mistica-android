package com.telefonica.mistica.tokens.common

class GetColorNameWithAlpha {

    operator fun invoke(
        brand: String,
        colorDescription: String,
        alpha: Double,
    ) = "${brand}_color_${colorDescription}_${(alpha * 100).toInt()}_alpha"
}
