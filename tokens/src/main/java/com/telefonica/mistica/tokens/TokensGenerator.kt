package com.telefonica.mistica.tokens

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import com.telefonica.mistica.tokens.compose.GenerateComposeFiles
import com.telefonica.mistica.tokens.dto.TokensDTO
import com.telefonica.mistica.tokens.xml.GenerateXMLFiles

class TokensGenerator(
    private val generateXMLFiles: GenerateXMLFiles = GenerateXMLFiles(),
    private val generateComposeFiles: GenerateComposeFiles = GenerateComposeFiles(),
) {

    fun generate() {
        val moshi: Moshi = Moshi.Builder()
            .addLast(KotlinJsonAdapterFactory())
            .build()
        val jsonAdapter: JsonAdapter<TokensDTO> = moshi.adapter(TokensDTO::class.java)

        generateXMLFiles(jsonAdapter)
        generateComposeFiles(jsonAdapter)
    }

    companion object {
        val BRANDS = listOf("blau", "movistar", "o2", "telefonica", "vivo")
        val ALPHA_REGEX = "0\\.\\d{1,2}".toRegex()
        const val AUTOGENERATED_COMMENT = "Code generated automatically, DO NOT EDIT manually. Use Import design tokens GitHub Action."
        const val MISTICA_TOKENS_DIR = "../.github/mistica-design/tokens"
    }
}