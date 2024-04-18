package com.telefonica.mistica.tokens.compose

import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.joinToCode
import com.telefonica.mistica.tokens.TokensGenerator
import com.telefonica.mistica.tokens.common.GetColorNameWithAlpha
import com.telefonica.mistica.tokens.compose.GenerateComposeFiles.Companion.angledLinearGradientClass
import com.telefonica.mistica.tokens.compose.GenerateComposeFiles.Companion.misticaBrushesClass
import com.telefonica.mistica.tokens.compose.GenerateComposeFiles.Companion.solidColorClass
import com.telefonica.mistica.tokens.dto.BrushDTO
import com.telefonica.mistica.tokens.dto.TokensDTO
import com.telefonica.mistica.tokens.dto.getGradientTokens
import com.telefonica.mistica.tokens.xml.GenerateXMLFiles.Companion.capitalizeString

class GenerateBrandBrushes(
    private val getColorNameWithAlpha: GetColorNameWithAlpha = GetColorNameWithAlpha(),
) {

    operator fun invoke(tokens: TokensDTO, brandName: String, gradientTokensNames: List<String>): TypeSpec {
        val paletteClassName = "${brandName.capitalizeString()}PaletteColor"

        val lightProperty = PropertySpec.builder("lightBrushes", misticaBrushesClass)
            .initializer(getBrushesConstructor(brandName, tokens.light.getGradientTokens(gradientTokensNames), paletteClassName))
            .build()

        val darkProperty = PropertySpec.builder("darkBrushes", misticaBrushesClass)
            .initializer(getBrushesConstructor(brandName, tokens.dark.getGradientTokens(gradientTokensNames), paletteClassName))
            .build()

        return TypeSpec.objectBuilder("${brandName.capitalizeString()}BrandBrushes")
            .addProperty(lightProperty)
            .addProperty(darkProperty)
            .build()
    }

    private fun getBrushesConstructor(
        brandName: String,
        brushes: Map<String, BrushDTO>,
        paletteClassName: String,
    ): CodeBlock {
        val assignments = brushes.map { (key, brush) ->
            when (brush) {
                is BrushDTO.SolidColorDTO -> {
                    val colorValue = getColorValue(brush.value, brush.description, brandName, paletteClassName)
                    CodeBlock.of("$key = %T($colorValue)", solidColorClass)
                }
                is BrushDTO.GradientDTO -> {
                    val angle = brush.value.angle
                    val colorStops = brush.value.colors.map { color ->
                        "${color.stop}F to ${getColorValue(color.value, brush.description, brandName, paletteClassName)}"
                    }.joinToString(",\n")
                    CodeBlock.of("$key = %T(\n⇥angleInDegrees = %LF,\ncolorStops = listOf(\n⇥%L⇤\n)⇤)", angledLinearGradientClass, angle, colorStops)
                }
            }
        }
        return CodeBlock.of("%T(\n%L\n)", misticaBrushesClass, assignments.joinToCode(separator = ",\n"))
    }

    private fun getColorValue(
        color: String,
        description: String,
        brandName: String,
        paletteClassName: String
    ): String {
        var colorValue = "${brandName}_color_${description}"
        if (color.contains("rgba(")) {
            val alpha = TokensGenerator.ALPHA_REGEX.find(color)?.value?.toDouble()
            if (alpha != null) {
                colorValue = getColorNameWithAlpha(brandName, description, alpha)
            }
        }
        return "$paletteClassName.$colorValue"
    }
}
