package com.telefonica.mistica.tokens.dto

data class TokensDTO(
    val light: Map<String, ColorDTO>,
    val dark: Map<String, ColorDTO>,
    val radius: Map<String, RadiusDTO>,
    val text: TextDTO,
    val global: GlobalDTO,
)

data class ColorDTO(
    val value: String,
    val type: String,
    val description: String,
)

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
