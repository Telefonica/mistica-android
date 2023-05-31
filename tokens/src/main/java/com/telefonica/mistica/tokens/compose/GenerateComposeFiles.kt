package com.telefonica.mistica.tokens.compose

import com.squareup.kotlinpoet.ClassName
import com.squareup.moshi.JsonAdapter
import com.telefonica.mistica.tokens.TokensGenerator.Companion.BRANDS
import com.telefonica.mistica.tokens.TokensGenerator.Companion.MISTICA_TOKENS_DIR
import com.telefonica.mistica.tokens.dto.TokensDTO
import java.io.File

class GenerateComposeFiles(
    private val generateMisticaColors: GenerateMisticaColors = GenerateMisticaColors(),
    private val generateBrandColors: GenerateBrandColors = GenerateBrandColors(),
    private val generateMisticaRadius: GenerateMisticaRadius = GenerateMisticaRadius(),
    private val generateBrandRadius: GenerateBrandRadius = GenerateBrandRadius(),
) {

    operator fun invoke(jsonAdapter: JsonAdapter<TokensDTO>) {
        generateMisticaColors(jsonAdapter)
        generateMisticaRadius(jsonAdapter)

        BRANDS.forEach { brand ->
            val json = File("${MISTICA_TOKENS_DIR}/$brand.json").readText()
            val tokens = jsonAdapter.fromJson(json)
            if (tokens == null) {
                throw Exception("Invalid JSON")
            } else {
                generateBrandColors(tokens, brand)
                generateBrandRadius(tokens, brand)
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
