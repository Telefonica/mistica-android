package com.telefonica.mistica.tokens

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import com.telefonica.mistica.tokens.dto.TokensDTO
import java.io.File

class GetTokens {

    fun invoke() {
        val moshi: Moshi = Moshi.Builder()
            .addLast(KotlinJsonAdapterFactory())
            .build()
        val json = File("$MISTICA_TOKENS_DIR/movistar.json").readText()
        val jsonAdapter: JsonAdapter<TokensDTO> = moshi.adapter(TokensDTO::class.java)
        val tokens = jsonAdapter.fromJson(json)
        println(tokens)
    }

    private companion object {
        const val MISTICA_TOKENS_DIR = "../.github/mistica-design/tokens"
    }
}
