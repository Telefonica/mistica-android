package com.telefonica.mistica.tokens.common

import com.telefonica.mistica.tokens.dto.ColorDTO
import com.telefonica.mistica.tokens.dto.GlobalDTO
import com.telefonica.mistica.tokens.dto.PaletteDTO
import com.telefonica.mistica.tokens.dto.TextDTO
import com.telefonica.mistica.tokens.dto.TokensDTO
import org.junit.Assert.assertTrue
import org.junit.Test

class GetColorsWithAlphaTest {

    private val sut = GetColorsWithAlpha()

    @Test
    fun `Test get colors with alpha`() {
        val result = sut.invoke(TOKENS, BRAND)

        assertTrue(result.size == 4)
        assertTrue(result.contains("blau_color_grey5_10_alpha" to "#1A808285"))
        assertTrue(result.contains("blau_color_blauBlueSecondary_75_alpha" to "#BF0072BC"))
        assertTrue(result.contains("blau_color_blauPurple_30_alpha" to "#4D7814B3"))
        assertTrue(result.contains("blau_color_white_15_alpha" to "#26FFFFFF"))
    }

    private companion object {
        const val BRAND = "blau"
        val TOKENS = TokensDTO(
            light = mapOf(
                "backgroundContainerAlternativeHover" to ColorDTO(
                    value = "rgba({palette.grey5}, 0.1)",
                    type = "color",
                    description = "grey5"
                ),
                "backgroundOverlay" to ColorDTO(
                    value = "rgba({palette.blauBlueSecondary}, 0.75)",
                    type = "color",
                    description = "blauBlueSecondary"
                ),
                "backgroundContainerBrand" to ColorDTO(
                    value = "{palette.blauBluePrimary}",
                    type = "color",
                    description = "blauBluePrimary"
                )
            ),
            dark = mapOf(
                "textButtonSecondarySelected" to ColorDTO(
                    value = "{palette.grey2}",
                    type = "color",
                    description = "grey2"
                ),
                "buttonLinkBackgroundSelected" to ColorDTO(
                    value = "rgba({palette.blauPurple}, 0.3)",
                    type = "color",
                    description = "blauPurple"
                ),
                "buttonSecondaryBackgroundHover" to ColorDTO(
                    value = "rgba({palette.white}, 0.15)",
                    type = "color",
                    description = "white"
                )
            ),
            radius = emptyMap(),
            text = TextDTO(
                weight = emptyMap(),
                size = emptyMap()
            ),
            global = GlobalDTO(
                palette = mapOf(
                    "grey5" to PaletteDTO(
                        value = "#808285",
                        type = "color"
                    ),
                    "blauBlueSecondary" to PaletteDTO(
                        value = "#0072BC",
                        type = "color"
                    ),
                    "blauBluePrimary" to PaletteDTO(
                        value = "#00B6F1",
                        type = "color"
                    ),
                    "grey2" to PaletteDTO(
                        value = "#E7E7E7",
                        type = "color"
                    ),
                    "blauPurple" to PaletteDTO(
                        value = "#7814B3",
                        type = "color"
                    ),
                    "white" to PaletteDTO(
                        value = "#FFFFFF",
                        type = "color"
                    )
                )
            )
        )
    }
}
