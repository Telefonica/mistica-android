package com.telefonica.mistica.tokens.common

import com.telefonica.mistica.tokens.dto.BrushDTO
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
                "backgroundContainerAlternativeHover" to BrushDTO.SolidColorDTO(
                    value = "rgba({palette.grey5}, 0.1)",
                    description = "anyDescription"
                ),
                "backgroundOverlay" to BrushDTO.SolidColorDTO(
                    value = "rgba({palette.blauBlueSecondary}, 0.75)",
                    description = "anyDescription"
                ),
                "backgroundContainerBrand" to BrushDTO.SolidColorDTO(
                    value = "{palette.blauBluePrimary}",
                    description = "anyDescription"
                )
            ),
            dark = mapOf(
                "textButtonSecondarySelected" to BrushDTO.SolidColorDTO(
                    value = "{palette.grey2}",
                    description = "anyDescription"
                ),
                "buttonLinkBackgroundSelected" to BrushDTO.SolidColorDTO(
                    value = "rgba({palette.blauPurple}, 0.3)",
                    description = "anyDescription"
                ),
                "buttonSecondaryBackgroundHover" to BrushDTO.SolidColorDTO(
                    value = "rgba({palette.white}, 0.15)",
                    description = "anyDescription"
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
