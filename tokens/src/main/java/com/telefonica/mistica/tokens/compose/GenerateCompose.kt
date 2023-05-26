package com.telefonica.mistica.tokens.compose

import com.squareup.moshi.JsonAdapter
import com.telefonica.mistica.tokens.GenerateTokens.Companion.MISTICA_TOKENS_DIR
import com.telefonica.mistica.tokens.dto.TokensDTO
import java.io.File

class GenerateCompose {

    operator fun invoke(jsonAdapter: JsonAdapter<TokensDTO>) {
        val json = File("$MISTICA_TOKENS_DIR/movistar.json").readText()
        val tokens = jsonAdapter.fromJson(json)

        if (tokens == null) {
            throw Exception("Invalid JSON")
        } else {
            GenerateMisticaColors().invoke(getColors(tokens))
        }
    }

    private fun getColors(tokens: TokensDTO) = tokens.light.keys.toList() + GRADIENT_COLORS

    private companion object {
        val GRADIENT_COLORS = listOf(
            "gradientBackgroundFirst",
            "gradientBackgroundSecond",
            "gradientBackgroundThird",
            "gradientBackgroundFourth",
            "loginLoadingGradientFirst",
            "loginLoadingGradientSecond",
            "loginLoadingGradientThird",
            "loginLoadingGradientFourth",
        )
    }
}
