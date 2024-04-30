package com.telefonica.mistica.tokens.dto

data class TokensDTO(
    val light: Map<String, BrushDTO>,
    val dark: Map<String, BrushDTO>,
    val radius: Map<String, RadiusDTO>,
    val text: TextDTO,
    val global: GlobalDTO,
)

sealed class BrushDTO(
    val type: String,
    val description: String,
) {
    class SolidColorDTO(
        val value: String,
        description: String,
    ) : BrushDTO(COLOR_TYPE, description)

    class GradientDTO(
        val value: GradientSpecificationDTO,
        description: String,
    ) : BrushDTO(GRADIENT_TYPE, description) {

        class GradientSpecificationDTO(
            val angle: Int,
            val colors: List<GradientColorDTO>
        )

        class GradientColorDTO(
            val value: String,
            val stop: Float,
        )
    }

    companion object {
        const val TYPE_FIELD_NAME = "type"
        const val COLOR_TYPE = "color"
        const val GRADIENT_TYPE = "linear-gradient"
    }
}

data class RadiusDTO(
    val value: String,
    val type: String,
)

data class TextDTO(
    val weight: Map<String, TextWeightDTO>,
    val size: Map<String, TextSizeDTO>,
)

data class TextWeightDTO(
    val value: String,
    val type: String,
)

data class TextSizeDTO(
    val value: SizeValueDTO,
    val type: String,
)

data class SizeValueDTO(
    val mobile: Int,
    val desktop: Int,
)

data class GlobalDTO(
    val palette: Map<String, PaletteDTO>,
)

data class PaletteDTO(
    val value: String,
    val type: String,
)
