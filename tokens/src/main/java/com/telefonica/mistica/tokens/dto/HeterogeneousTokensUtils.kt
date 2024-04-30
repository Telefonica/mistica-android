package com.telefonica.mistica.tokens.dto

fun List<TokensDTO>.getHeterogeneousTokensNames(): List<String> =
    flatMap { tokens ->
        tokens.light.filter { it.value is BrushDTO.GradientDTO }
            .plus(tokens.dark.filter { it.value is BrushDTO.GradientDTO })
            .keys
    }.toSet().toList()

fun Map<String, BrushDTO>.removeHeterogeneousTokens(
    heterogeneousTokensNames: List<String>
): Map<String, BrushDTO.SolidColorDTO> =
    filterNot { heterogeneousTokensNames.contains(it.key) }
        .mapValues { it.value as BrushDTO.SolidColorDTO }

fun Map<String, BrushDTO>.getHeterogeneousTokens(
    heterogeneousTokensNames: List<String>
): Map<String, BrushDTO> =
    filter { heterogeneousTokensNames.contains(it.key) }