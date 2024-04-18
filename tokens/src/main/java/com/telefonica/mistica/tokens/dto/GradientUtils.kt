package com.telefonica.mistica.tokens.dto

fun List<TokensDTO>.getGradientTokensNames(): Set<String> =
    flatMap { tokens ->
        tokens.light.filter { it.value is BrushDTO.GradientDTO }
            .plus(tokens.dark.filter { it.value is BrushDTO.GradientDTO })
            .keys
    }.toSet()

fun Map<String, BrushDTO>.removeGradientTokens(
    gradientTokensNames: Set<String>
): Map<String, BrushDTO.SolidColorDTO> =
    filterNot { gradientTokensNames.contains(it.key) }
        .mapValues { it.value as BrushDTO.SolidColorDTO }

fun Map<String, BrushDTO>.getGradientTokens(
    gradientTokensNames: Set<String>
): Map<String, BrushDTO> =
    filter { gradientTokensNames.contains(it.key) }