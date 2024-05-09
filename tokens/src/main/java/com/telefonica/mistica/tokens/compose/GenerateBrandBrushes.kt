package com.telefonica.mistica.tokens.compose

import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.joinToCode
import com.telefonica.mistica.tokens.common.GetColorResourceName
import com.telefonica.mistica.tokens.compose.GenerateComposeFiles.Companion.BRAND_BRUSHES_CLASS_SUFFIX
import com.telefonica.mistica.tokens.compose.GenerateComposeFiles.Companion.BRAND_PALETTE_COLOR_CLASS_SUFFIX
import com.telefonica.mistica.tokens.compose.GenerateComposeFiles.Companion.LINEAR_GRADIENT_WITH_ANGLE_CLASS
import com.telefonica.mistica.tokens.compose.GenerateComposeFiles.Companion.MISTICA_BRUSHES_CLASS
import com.telefonica.mistica.tokens.compose.GenerateComposeFiles.Companion.SOLID_COLOR_CLASS
import com.telefonica.mistica.tokens.dto.BrushDTO
import com.telefonica.mistica.tokens.dto.TokensDTO
import com.telefonica.mistica.tokens.dto.getHeterogeneousTokens
import com.telefonica.mistica.tokens.xml.GenerateXMLFiles.Companion.capitalizeString

class GenerateBrandBrushes(
    private val getColorResourceName: GetColorResourceName = GetColorResourceName(),
) {

    operator fun invoke(tokens: TokensDTO, brandName: String, heterogeneousTokensNames: List<String>): TypeSpec {
        val paletteClassName = "${brandName.capitalizeString()}$BRAND_PALETTE_COLOR_CLASS_SUFFIX"

        val lightProperty = PropertySpec.builder("lightBrushes", MISTICA_BRUSHES_CLASS)
            .initializer(
                getBrushesInitializer(brandName, tokens.light.getHeterogeneousTokens(heterogeneousTokensNames), paletteClassName)
            ).build()

        val darkProperty = PropertySpec.builder("darkBrushes", MISTICA_BRUSHES_CLASS)
            .initializer(
                getBrushesInitializer(brandName, tokens.dark.getHeterogeneousTokens(heterogeneousTokensNames), paletteClassName)
            ).build()

        return TypeSpec.objectBuilder("${brandName.capitalizeString()}$BRAND_BRUSHES_CLASS_SUFFIX")
            .addProperty(lightProperty)
            .addProperty(darkProperty)
            .build()
    }

    private fun getBrushesInitializer(
        brandName: String,
        brushes: Map<String, BrushDTO>,
        paletteClassName: String,
    ): CodeBlock {
        val assignments = brushes.map { (key, brush) ->
            when (brush) {
                is BrushDTO.SolidColorDTO -> {
                    val colorReference = getColorResourceReference(brush.value, brandName, paletteClassName)
                    CodeBlock.of("$key = %T($colorReference)", SOLID_COLOR_CLASS)
                }

                is BrushDTO.GradientDTO -> {
                    val angle = brush.value.angle
                    val colorStops = brush.value.colors.map { color ->
                        "${color.stop}F to ${getColorResourceReference(color.value, brandName, paletteClassName)}"
                    }.joinToString(",\n")
                    CodeBlock.of(
                        "$key = %T(\n⇥angleInDegrees = %LF,\ncolorStops = listOf(\n⇥%L⇤\n)⇤)",
                        LINEAR_GRADIENT_WITH_ANGLE_CLASS,
                        angle,
                        colorStops,
                    )
                }
            }
        }
        return CodeBlock.of("%T().apply {\n%L\n}", MISTICA_BRUSHES_CLASS, assignments.joinToCode(separator = "\n"))
    }

    private fun getColorResourceReference(
        colorSpecification: String,
        brandName: String,
        paletteClassName: String,
    ): String =
        "$paletteClassName.${getColorResourceName(colorSpecification, brandName)}"

}
