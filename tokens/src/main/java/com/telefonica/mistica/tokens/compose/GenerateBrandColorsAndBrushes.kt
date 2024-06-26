package com.telefonica.mistica.tokens.compose

import com.squareup.kotlinpoet.FileSpec
import com.squareup.kotlinpoet.KModifier
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import com.telefonica.mistica.tokens.TokensGenerator
import com.telefonica.mistica.tokens.common.GetColorResourceName
import com.telefonica.mistica.tokens.common.GetColorsWithAlpha
import com.telefonica.mistica.tokens.compose.GenerateComposeFiles.Companion.BRAND_PALETTE_COLOR_CLASS_SUFFIX
import com.telefonica.mistica.tokens.compose.GenerateComposeFiles.Companion.colorClass
import com.telefonica.mistica.tokens.compose.GenerateComposeFiles.Companion.misticaColorsClass
import com.telefonica.mistica.tokens.dto.BrushDTO
import com.telefonica.mistica.tokens.dto.TokensDTO
import com.telefonica.mistica.tokens.dto.removeHeterogeneousTokens
import com.telefonica.mistica.tokens.xml.GenerateXMLFiles.Companion.capitalizeString
import java.io.File

/**
 * Generates the XXXBrandColorsAutogenerated.kt file for each brand.
 */
class GenerateBrandColorsAndBrushes(
    private val getColorsWithAlpha: GetColorsWithAlpha = GetColorsWithAlpha(),
    private val getColorResourceName: GetColorResourceName = GetColorResourceName(),
    private val generateBrandBrushes: GenerateBrandBrushes = GenerateBrandBrushes(),
) {

    operator fun invoke(tokens: TokensDTO, brandName: String, heterogeneousTokensNames: List<String>) {
        val paletteClassName = "${brandName.capitalizeString()}$BRAND_PALETTE_COLOR_CLASS_SUFFIX"

        val lightProperty = PropertySpec.builder("lightColors", misticaColorsClass)
            .initializer(getColorsInitializer(brandName, tokens.light.removeHeterogeneousTokens(heterogeneousTokensNames), paletteClassName))
            .build()

        val darkProperty = PropertySpec.builder("darkColors", misticaColorsClass)
            .initializer(getColorsInitializer(brandName, tokens.dark.removeHeterogeneousTokens(heterogeneousTokensNames), paletteClassName))
            .build()

        val colorsObject = TypeSpec.objectBuilder("${brandName.capitalizeString()}BrandColors")
            .addProperty(lightProperty)
            .addProperty(darkProperty)
            .build()

        val paletteObject = TypeSpec.objectBuilder(paletteClassName)
            .addModifiers(KModifier.PRIVATE)
            .addProperties(getPaletteProperties(tokens, brandName))
            .build()

        val file = FileSpec.builder("com.telefonica.mistica.compose.theme.brand", "${brandName.capitalizeString()}BrandColorsAutogenerated")
            .addFileComment(TokensGenerator.AUTOGENERATED_COMMENT)
            .addType(colorsObject)
            .addType(generateBrandBrushes(tokens, brandName, heterogeneousTokensNames))
            .addType(paletteObject)
            .build()

        file.writeTo(File(GenerateComposeFiles.LIBRARY_CODE_PATH))
    }

    private fun getColorsInitializer(
        brandName: String,
        colors: Map<String, BrushDTO.SolidColorDTO>,
        paletteClassName: String,
    ): String {
        var statement = "${GenerateComposeFiles.MISTICA_COLORS}().apply {\n"

        colors.forEach { (key, color) ->
            val colorResourceName = getColorResourceName(color.value, brandName)
            statement += "$key = $paletteClassName.$colorResourceName\n"
        }

        return "$statement}"
    }

    private fun getPaletteProperties(
        tokens: TokensDTO,
        brandName: String,
    ): MutableList<PropertySpec> {
        val properties = mutableListOf<PropertySpec>()

        tokens.global.palette.forEach { (key, color) ->
            val colorName = "${brandName}_color_${key}"

            val property = PropertySpec.builder(colorName, colorClass)
                .initializer("%T(%L)", colorClass, color.value.toHexColor())
                .build()
            properties.add(property)
        }

        getColorsWithAlpha(tokens, brandName).forEach { colorWithAlpha ->
            val property = PropertySpec.builder(colorWithAlpha.first, colorClass)
                .initializer("%T(%L)", colorClass, colorWithAlpha.second.toHexColor())
                .build()
            properties.add(property)
        }
        return properties
    }

    private fun String.toHexColor(): String {
        if (this.length == 7) {
            return "0xFF${this.substring(1)}"
        }

        return "0x${this.substring(1)}"
    }
}
