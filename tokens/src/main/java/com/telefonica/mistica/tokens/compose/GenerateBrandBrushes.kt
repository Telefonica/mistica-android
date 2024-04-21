package com.telefonica.mistica.tokens.compose

import com.squareup.kotlinpoet.CodeBlock
import com.squareup.kotlinpoet.PropertySpec
import com.squareup.kotlinpoet.TypeSpec
import com.squareup.kotlinpoet.joinToCode
import com.telefonica.mistica.tokens.common.GetColorResourceName
import com.telefonica.mistica.tokens.compose.GenerateComposeFiles.Companion.BRAND_BRUSHES_CLASS_SUFFIX
import com.telefonica.mistica.tokens.compose.GenerateComposeFiles.Companion.BRAND_PALETTE_COLOR_CLASS_SUFFIX
import com.telefonica.mistica.tokens.compose.GenerateComposeFiles.Companion.linearGradientWithAngleClass
import com.telefonica.mistica.tokens.compose.GenerateComposeFiles.Companion.misticaBrushesClass
import com.telefonica.mistica.tokens.compose.GenerateComposeFiles.Companion.solidColorClass
import com.telefonica.mistica.tokens.dto.BrushDTO
import com.telefonica.mistica.tokens.dto.TokensDTO
import com.telefonica.mistica.tokens.dto.getGradientTokens
import com.telefonica.mistica.tokens.xml.GenerateXMLFiles.Companion.capitalizeString

class GenerateBrandBrushes(
    private val getColorResourceName: GetColorResourceName = GetColorResourceName(),
) {

    operator fun invoke(tokens: TokensDTO, brandName: String, gradientTokensNames: List<String>): TypeSpec {
        val paletteClassName = "${brandName.capitalizeString()}$BRAND_PALETTE_COLOR_CLASS_SUFFIX"

        val lightProperty = PropertySpec.builder(LIGHT_BRUSHES_PROPERTY_NAME, misticaBrushesClass)
            .initializer(getBrushesConstructor(brandName, tokens.light.getGradientTokens(gradientTokensNames), paletteClassName))
            .build()

        val darkProperty = PropertySpec.builder(DARK_BRUSHES_PROPERTY_NAME, misticaBrushesClass)
            .initializer(getBrushesConstructor(brandName, tokens.dark.getGradientTokens(gradientTokensNames), paletteClassName))
            .build()

        return TypeSpec.objectBuilder("${brandName.capitalizeString()}$BRAND_BRUSHES_CLASS_SUFFIX")
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
                    val colorReference = getColorResourceReference(brush.value, brandName, paletteClassName)
                    CodeBlock.of("$key = %T($colorReference)", solidColorClass)
                }

                is BrushDTO.GradientDTO -> {
                    val angle = brush.value.angle
                    val colorStops = brush.value.colors.map { color ->
                        "${color.stop}F to ${getColorResourceReference(color.value, brandName, paletteClassName)}"
                    }.joinToString(",\n")
                    CodeBlock.of(
                        "$key = %T(\n⇥angleInDegrees = %LF,\ncolorStops = listOf(\n⇥%L⇤\n)⇤)",
                        linearGradientWithAngleClass,
                        angle,
                        colorStops,
                    )
                }
            }
        }
        return CodeBlock.of("%T(\n%L\n)", misticaBrushesClass, assignments.joinToCode(separator = ",\n"))
    }

    private fun getColorResourceReference(
        colorSpecification: String,
        brandName: String,
        paletteClassName: String,
    ): String =
        "$paletteClassName.${getColorResourceName(colorSpecification, brandName)}"

    private companion object {
        const val LIGHT_BRUSHES_PROPERTY_NAME = "lightBrushes"
        const val DARK_BRUSHES_PROPERTY_NAME = "darkBrushes"
    }
}
