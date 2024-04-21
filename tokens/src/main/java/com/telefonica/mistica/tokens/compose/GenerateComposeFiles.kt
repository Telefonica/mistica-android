package com.telefonica.mistica.tokens.compose

import com.squareup.kotlinpoet.ClassName
import com.squareup.moshi.JsonAdapter
import com.telefonica.mistica.tokens.TokensGenerator.Companion.BRANDS
import com.telefonica.mistica.tokens.TokensGenerator.Companion.MISTICA_TOKENS_DIR
import com.telefonica.mistica.tokens.dto.TokensDTO
import com.telefonica.mistica.tokens.dto.getGradientTokensNames
import java.io.File

class GenerateComposeFiles(
    private val generateMisticaColors: GenerateMisticaColors = GenerateMisticaColors(),
    private val generateBrandColors: GenerateBrandColorsAndBrushes = GenerateBrandColorsAndBrushes(),
    private val generateMisticaRadius: GenerateMisticaRadius = GenerateMisticaRadius(),
    private val generateBrandRadius: GenerateBrandRadius = GenerateBrandRadius(),
    private val generateBrandFontWeights: GenerateBrandFontWeights = GenerateBrandFontWeights(),
    private val generateBrandFontSizes: GenerateBrandFontSizes = GenerateBrandFontSizes(),
    private val generateMisticaBrushes: GenerateMisticaBrushes = GenerateMisticaBrushes(),
) {

    operator fun invoke(jsonAdapter: JsonAdapter<TokensDTO>) {
        val brandTokens = BRANDS.map { brand ->
            val json = File("${MISTICA_TOKENS_DIR}/${brand.file}.json").readText()
            val tokens = jsonAdapter.fromJson(json) ?: throw Exception("Invalid JSON")
            tokens to brand
        }

        val gradientTokensNames = brandTokens
            .map { it.first }
            .getGradientTokensNames()

        generateMisticaColors(jsonAdapter, gradientTokensNames)
        generateMisticaBrushes(gradientTokensNames)
        generateMisticaRadius(jsonAdapter)

        brandTokens.forEach { (tokens, brand) ->
            generateBrandColors(tokens, brand.name, gradientTokensNames)
            generateBrandRadius(tokens, brand.name)
            generateBrandFontWeights(tokens, brand.name)
            generateBrandFontSizes(tokens, brand.name)
        }
    }

    companion object {
        const val LIBRARY_CODE_PATH = "../library/src/main/java/"

        const val MISTICA_COLORS = "MisticaColors"
        const val BRAND_PALETTE_COLOR_CLASS_SUFFIX = "PaletteColor"
        val misticaColorsClass = ClassName("com.telefonica.mistica.compose.theme.color", MISTICA_COLORS)
        val colorClass = ClassName("androidx.compose.ui.graphics", "Color")

        const val MISTICA_BRUSHES = "MisticaBrushes"
        const val BRAND_BRUSHES_CLASS_SUFFIX = "BrandBrushes"
        val misticaBrushesClass = ClassName("com.telefonica.mistica.compose.theme.color", MISTICA_BRUSHES)
        val brushClass = ClassName("androidx.compose.ui.graphics", "Brush")
        val solidColorClass = ClassName("androidx.compose.ui.graphics", "SolidColor")
        val linearGradientWithAngleClass = ClassName("com.telefonica.mistica.compose.theme.color", "LinearGradientWithAngle")

        val misticaRadiusClass = ClassName("com.telefonica.mistica.compose.theme.values", "MisticaRadius")
        val dpClass = ClassName("androidx.compose.ui.unit", "Dp")
        val intClass = ClassName("kotlin", "Int")
    }
}
