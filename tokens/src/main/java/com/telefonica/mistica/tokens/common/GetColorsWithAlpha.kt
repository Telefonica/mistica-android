package com.telefonica.mistica.tokens.common

import com.telefonica.mistica.tokens.TokensGenerator
import com.telefonica.mistica.tokens.dto.BrushDTO
import com.telefonica.mistica.tokens.dto.TokensDTO
import java.util.Locale
import kotlin.math.roundToInt

class GetColorsWithAlpha(
    private val getColorNameWithAlpha: GetColorNameWithAlpha = GetColorNameWithAlpha(),
) {

    operator fun invoke(tokens: TokensDTO, brandName: String): List<Pair<String, String>> {
        val colorsWithAlpha = mutableMapOf<String, String>()
        tokens.light.values.forEach { color ->
            val colorWithAlpha = getAlphaColors(color, tokens, brandName)
            colorsWithAlpha.putAll(colorWithAlpha)
        }

        tokens.dark.values.forEach { color ->
            val colorWithAlpha = getAlphaColors(color, tokens, brandName)
            colorsWithAlpha.putAll(colorWithAlpha)
        }

        return colorsWithAlpha.toList()
    }

    private fun getAlphaColors(
        color: BrushDTO,
        tokens: TokensDTO,
        brandName: String,
    ): Map<String, String> {
        val values = when (color) {
            is BrushDTO.GradientDTO -> color.value.colors.map { it.value }
            is BrushDTO.SolidColorDTO -> listOf(color.value)
        }
        return values
            .filter { it.contains("rgba(") }
            .mapNotNull { value ->
                val alpha = TokensGenerator.ALPHA_REGEX.find(value)?.value?.toDouble()
                val colorValue = tokens.global.palette[color.description]?.value
                if (alpha != null && colorValue != null) {
                    val alphaHex = alpha.toHex()
                    val colorName = getColorNameWithAlpha(brandName, color.description, alpha)
                    val colorWithAlpha = "#$alphaHex${colorValue.removePrefix("#")}"
                    colorName to colorWithAlpha
                } else {
                    null
                }
            }.toMap()
    }

    private fun Double.toHex(): String {
        val i = (this * 100).roundToInt() / 100.0
        val alpha = (i * 255).roundToInt()
        return Integer.toHexString(alpha)
            .uppercase(Locale.getDefault())
            .padStart(2, '0')
    }
}
