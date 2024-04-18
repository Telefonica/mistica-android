package com.telefonica.mistica.tokens.dto

fun List<TokensDTO>.getGradientTokensNames(): List<String> =
    flatMap { tokens ->
        tokens.light.filter { it.value is BrushDTO.GradientDTO }
            .plus(tokens.dark.filter { it.value is BrushDTO.GradientDTO })
            .keys
    }.toSet().toList()

fun Map<String, BrushDTO>.removeGradientTokens(
    gradientTokensNames: List<String>
): Map<String, BrushDTO.SolidColorDTO> =
    filterNot { gradientTokensNames.contains(it.key) }
        .mapValues { it.value as BrushDTO.SolidColorDTO }

fun Map<String, BrushDTO>.getGradientTokens(
    gradientTokensNames: List<String>
): Map<String, BrushDTO> =
    filter { gradientTokensNames.contains(it.key) }