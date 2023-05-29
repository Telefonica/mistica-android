package com.telefonica.mistica.tokens.compose

import com.squareup.moshi.JsonAdapter
import com.telefonica.mistica.tokens.GenerateTokens.Companion.BRANDS
import com.telefonica.mistica.tokens.GenerateTokens.Companion.MISTICA_TOKENS_DIR
import com.telefonica.mistica.tokens.dto.TokensDTO
import java.io.File

class GenerateCompose {

    operator fun invoke(jsonAdapter: JsonAdapter<TokensDTO>) {
        GenerateMisticaColors().invoke(jsonAdapter)

        BRANDS.forEach { brand ->
            val json = File("${MISTICA_TOKENS_DIR}/$brand.json").readText()
            val tokens = jsonAdapter.fromJson(json)
            if (tokens == null) {
                throw Exception("Invalid JSON")
            } else {
                GenerateBrandColors().invoke(tokens, brand)
            }
        }
    }

    companion object {
        const val LIBRARY_CODE_PATH = "../library/src/main/java/"
        const val MISTICA_COLORS = "MisticaColors"
    }
}
