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
            GenerateBrandColors().invoke(tokens)
        }
    }

    private fun getColors(tokens: TokensDTO) = tokens.light.keys.toList() + GRADIENT_COLORS

    companion object {
        const val LIBRARY_CODE_PATH = "../library/src/main/java/"
        const val MISTICA_COLORS = "MisticaColors"
        private val GRADIENT_COLORS = listOf(
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
