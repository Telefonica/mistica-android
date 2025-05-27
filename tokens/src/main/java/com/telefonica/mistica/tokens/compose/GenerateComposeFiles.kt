package com.telefonica.mistica.tokens.compose

import com.squareup.kotlinpoet.ClassName
import com.squareup.moshi.JsonAdapter
import com.telefonica.mistica.tokens.TokensGenerator.Companion.BRANDS
import com.telefonica.mistica.tokens.TokensGenerator.Companion.MISTICA_TOKENS_DIR
import com.telefonica.mistica.tokens.dto.TokensDTO
import com.telefonica.mistica.tokens.dto.getHeterogeneousTokensNames
import java.io.File

class GenerateComposeFiles(
    private val generateMisticaColors: GenerateMisticaColors = GenerateMisticaColors(),
    private val generateBrandColors: GenerateBrandColorsAndBrushes = GenerateBrandColorsAndBrushes(),
    private val generateMisticaRadius: GenerateMisticaRadius = GenerateMisticaRadius(),
    private val generateBrandRadius: GenerateBrandRadius = GenerateBrandRadius(),
    private val tenerateMisticaThemeVariant: GenerateMisticaThemeVariant = GenerateMisticaThemeVariant(),
    private val generateBrandThemeVariant: GenerateBrandThemeVariant = GenerateBrandThemeVariant(),
    private val generateBrandFontWeights: GenerateBrandFontWeights = GenerateBrandFontWeights(),
    private val generateBrandFontSizes: GenerateBrandFontSizes = GenerateBrandFontSizes(),
    private val generateMisticaBrushes: GenerateMisticaBrushes = GenerateMisticaBrushes(),
) {

    operator fun invoke(jsonAdapter: JsonAdapter<TokensDTO>) {
        val brandTokens = BRANDS.map { brand ->
            val json = File("${MISTICA_TOKENS_DIR}/${brand.file}.json").readText()
            val tokens = jsonAdapter.fromJson(json) ?: throw Exception("Invalid JSON in file: ${brand.file}")
            tokens to brand
        }

        val heterogeneousTokensNames = brandTokens
            .map { it.first }
            .getHeterogeneousTokensNames()

        generateMisticaColors(jsonAdapter, heterogeneousTokensNames)
        generateMisticaBrushes(heterogeneousTokensNames)
        generateMisticaRadius(jsonAdapter)
        tenerateMisticaThemeVariant(jsonAdapter)

        brandTokens.forEach { (tokens, brand) ->
            generateBrandColors(tokens, brand.name, heterogeneousTokensNames)
            generateBrandRadius(tokens, brand.name)
            generateBrandThemeVariant(tokens, brand.name)
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

        val MISTICA_BRUSHES_CLASS = ClassName("com.telefonica.mistica.compose.theme.brushes", MISTICA_BRUSHES)
        val BRUSH_CLASS = ClassName("androidx.compose.ui.graphics", "Brush")
        val SOLID_COLOR_CLASS = ClassName("androidx.compose.ui.graphics", "SolidColor")
        val LINEAR_GRADIENT_WITH_ANGLE_CLASS = ClassName("com.telefonica.mistica.compose.theme.brushes", "LinearGradientWithAngle")

        val misticaRadiusClass = ClassName("com.telefonica.mistica.compose.theme.values", "MisticaRadius")
        val misticaThemeVariantClass = ClassName("com.telefonica.mistica.compose.theme.values", "MisticaThemeVariant")
        val dpClass = ClassName("androidx.compose.ui.unit", "Dp")
        val intClass = ClassName("kotlin", "Int")
        val stringClass = ClassName("kotlin", "String")
    }
}
