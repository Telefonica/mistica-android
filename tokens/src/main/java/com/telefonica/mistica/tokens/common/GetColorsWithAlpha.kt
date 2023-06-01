package com.telefonica.mistica.tokens.common

import com.telefonica.mistica.tokens.TokensGenerator
import com.telefonica.mistica.tokens.dto.ColorDTO
import com.telefonica.mistica.tokens.dto.TokensDTO
import java.util.Locale
import kotlin.math.roundToInt

class GetColorsWithAlpha(
    private val getColorNameWithAlpha: GetColorNameWithAlpha = GetColorNameWithAlpha(),
) {

    operator fun invoke(tokens: TokensDTO, brand: String): List<Pair<String, String>> {
        val colorsWithAlpha = mutableSetOf<Pair<String, String>>()
        tokens.light.values.forEach { color ->
            val colorWithAlpha = getAlphaColor(color, tokens, brand)
            if (colorWithAlpha != null) {
                colorsWithAlpha.add(colorWithAlpha)
            }
        }

        tokens.dark.values.forEach { color ->
            val colorWithAlpha = getAlphaColor(color, tokens, brand)
            if (colorWithAlpha != null) {
                colorsWithAlpha.add(colorWithAlpha)
            }
        }

        return colorsWithAlpha.toList()
    }

    private fun getAlphaColor(
        color: ColorDTO,
        tokens: TokensDTO,
        brand: String,
    ): Pair<String, String>? {
        if (color.value.contains("rgba(")) {
            val alpha = TokensGenerator.ALPHA_REGEX.find(color.value)?.value?.toDouble()

            val colorValue = tokens.global.palette[color.description]?.value
            if (alpha != null && colorValue != null) {
                val alphaHex = alpha.toHex()
                val colorName = getColorNameWithAlpha(brand, color.description, alpha)
                val colorWithAlpha = "#$alphaHex${colorValue.removePrefix("#")}"
                return colorName to colorWithAlpha
            }
        }
        return null
    }

    private fun Double.toHex(): String {
        val i = (this * 100).roundToInt() / 100.0
        val alpha = (i * 255).roundToInt()
        return Integer.toHexString(alpha)
            .uppercase(Locale.getDefault())
            .padStart(2, '0')
    }
}
