package com.telefonica.mistica.tokens.compose

import com.squareup.kotlinpoet.ClassName
import com.squareup.moshi.JsonAdapter
import com.telefonica.mistica.tokens.TokensGenerator.Companion.BRANDS
import com.telefonica.mistica.tokens.TokensGenerator.Companion.MISTICA_TOKENS_DIR
import com.telefonica.mistica.tokens.TokensGenerator.Companion.VIVO_NEW_OVERRIDE
import com.telefonica.mistica.tokens.dto.TokensDTO
import java.io.File

class GenerateComposeFiles(
    private val generateMisticaColors: GenerateMisticaColors = GenerateMisticaColors(),
    private val generateBrandColors: GenerateBrandColors = GenerateBrandColors(),
    private val generateMisticaRadius: GenerateMisticaRadius = GenerateMisticaRadius(),
    private val generateBrandRadius: GenerateBrandRadius = GenerateBrandRadius(),
    private val generateBrandFontWeights: GenerateBrandFontWeights = GenerateBrandFontWeights(),
    private val generateBrandFontSizes: GenerateBrandFontSizes = GenerateBrandFontSizes(),
) {

    operator fun invoke(jsonAdapter: JsonAdapter<TokensDTO>) {
        generateMisticaColors(jsonAdapter)
        generateMisticaRadius(jsonAdapter)

        BRANDS
            .filter { it.name != VIVO_NEW_OVERRIDE } //TODO: ANDROID-13833 Remove this when VIVO_NEW is main style.
            .forEach { brand ->
                val json = File("${MISTICA_TOKENS_DIR}/${brand.file}.json").readText()
                val tokens = jsonAdapter.fromJson(json)
                if (tokens == null) {
                    throw Exception("Invalid JSON")
                } else {
                    generateBrandColors(tokens, brand.name)
                    generateBrandRadius(tokens, brand.name)
                    generateBrandFontWeights(tokens, brand.name)
                    generateBrandFontSizes(tokens, brand.name)
                }
            }
    }

    companion object {
        const val LIBRARY_CODE_PATH = "../library/src/main/java/"
        const val MISTICA_COLORS = "MisticaColors"
        val misticaColorsClass = ClassName("com.telefonica.mistica.compose.theme.color", MISTICA_COLORS)
        val colorClass = ClassName("androidx.compose.ui.graphics", "Color")
        val misticaRadiusClass = ClassName("com.telefonica.mistica.compose.theme.values", "MisticaRadius")
        val dpClass = ClassName("androidx.compose.ui.unit", "Dp")
        val intClass = ClassName("kotlin", "Int")
    }
}
