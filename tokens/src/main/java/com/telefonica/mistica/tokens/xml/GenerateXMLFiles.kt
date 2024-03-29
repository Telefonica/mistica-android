package com.telefonica.mistica.tokens.xml

import com.squareup.moshi.JsonAdapter
import com.telefonica.mistica.tokens.Brand
import com.telefonica.mistica.tokens.TokensGenerator.Companion.ALPHA_REGEX
import com.telefonica.mistica.tokens.TokensGenerator.Companion.AUTOGENERATED_COMMENT
import com.telefonica.mistica.tokens.TokensGenerator.Companion.BOLD
import com.telefonica.mistica.tokens.TokensGenerator.Companion.BRANDS
import com.telefonica.mistica.tokens.TokensGenerator.Companion.CIRCLE_RADIUS
import com.telefonica.mistica.tokens.TokensGenerator.Companion.LIGHT
import com.telefonica.mistica.tokens.TokensGenerator.Companion.MEDIUM
import com.telefonica.mistica.tokens.TokensGenerator.Companion.MISTICA_TOKENS_DIR
import com.telefonica.mistica.tokens.TokensGenerator.Companion.REGULAR
import com.telefonica.mistica.tokens.common.GetBorderRadiusName
import com.telefonica.mistica.tokens.common.GetColorNameWithAlpha
import com.telefonica.mistica.tokens.common.GetColorsWithAlpha
import com.telefonica.mistica.tokens.dto.ColorDTO
import com.telefonica.mistica.tokens.dto.TokensDTO
import org.redundent.kotlin.xml.Node
import org.redundent.kotlin.xml.PrintOptions
import org.redundent.kotlin.xml.XmlVersion
import org.redundent.kotlin.xml.xml
import java.io.File

/**
 * Generates the `themes_xxx_autogenerated.xml` files for each brand.
 */
class GenerateXMLFiles(
    private val getColorsWithAlpha: GetColorsWithAlpha = GetColorsWithAlpha(),
    private val getColorNameWithAlpha: GetColorNameWithAlpha = GetColorNameWithAlpha(),
    private val generateAttributesFile: GenerateAttributesFile = GenerateAttributesFile(),
    private val getBorderRadiusName: GetBorderRadiusName = GetBorderRadiusName(),
) {

    operator fun invoke(jsonAdapter: JsonAdapter<TokensDTO>) {
        generateAttributesFile(jsonAdapter)

        BRANDS.forEach { brand ->
            val json = File("${MISTICA_TOKENS_DIR}/${brand.file}.json").readText()
            val tokens = jsonAdapter.fromJson(json)
            if (tokens == null) {
                throw Exception("Invalid JSON")
            } else {
                generateColorsFiles(tokens, brand)
                generateLightThemesFiles(tokens, brand)
                generateDarkThemesFiles(tokens, brand)
            }
        }
    }

    private fun generateColorsFiles(tokens: TokensDTO, brand: Brand) {
        val colorsWithAlpha = getColorsWithAlpha(tokens, brand.name)
        val colorsXml = xml("resources", "utf-8", XmlVersion.V10) {
            comment(AUTOGENERATED_COMMENT)

            tokens.global.palette.forEach { color ->
                val colorName = "${brand.name}_color_${color.key}"

                "color" {
                    attribute("name", colorName)
                    -color.value.value
                }
            }

            colorsWithAlpha.forEach { colorWithAlpha ->
                "color" {
                    attribute("name", colorWithAlpha.first)
                    -colorWithAlpha.second
                }
            }
        }

        File("$VALUES_DIR/${COLORS_FILE.format(brand.name)}").writeText(colorsXml.toString(PrintOptions(singleLineTextElements = true)))
    }

    private fun generateLightThemesFiles(tokens: TokensDTO, brand: Brand) {

        fun Node.generateTheme(themeName: String) {
            "style" {
                attribute("name", themeName)
                attribute("parent", "${themeName}_Customizations")
            }

            "style" {
                attribute("name", "${themeName}_Base")
                mapColors(tokens.light, brand)
                borderRadius(tokens)
                presetFonts(tokens)
                presetStyles(tokens)
                presetSizes(tokens)
            }
        }

        val lightThemesXml = xml("resources", "utf-8", XmlVersion.V10) {
            comment(AUTOGENERATED_COMMENT)

            val brandName = brand.name.capitalizeString()

            generateTheme("MisticaTheme.$brandName")

            if (brand.createDuplicateWithoutInheritMistica) {
                generateTheme("${brandName}Override")
            }
        }

        File("$VALUES_DIR/${THEMES_FILE.format(brand.name)}").writeText(lightThemesXml.toString(PrintOptions(singleLineTextElements = true)))
    }

    private fun Node.borderRadius(tokens: TokensDTO) {
        comment("Border radius")
        tokens.radius.forEach { (key, radius) ->
            val value = if (radius.value == CIRCLE_RADIUS) "50%" else "${radius.value}dp"

            "item" {
                attribute("name", getBorderRadiusName(key))
                -value
            }
        }
    }

    private fun Node.presetFonts(tokens: TokensDTO) {
        comment("Preset fonts")
        tokens.text.weight.forEach { (key, text) ->
            val value = when (text.value) {
                LIGHT -> "?font_family_light"
                REGULAR -> "?font_family_regular"
                MEDIUM -> "?font_family_medium"
                BOLD -> "?font_family_regular"
                else -> throw Exception("Invalid text weight")
            }

            "item" {
                attribute("name", "$key$FONT_SUFFIX")
                -value
            }
        }
    }

    private fun Node.presetStyles(tokens: TokensDTO) {
        comment("Preset styles")
        tokens.text.weight.forEach { (key, text) ->
            val value = when (text.value) {
                LIGHT, REGULAR, MEDIUM -> "normal"
                BOLD -> "bold"
                else -> throw Exception("Invalid text weight")
            }

            "item" {
                attribute("name", "$key$TEXT_STYLE_SUFFIX")
                -value
            }
        }
    }

    private fun Node.presetSizes(tokens: TokensDTO) {
        comment("Preset sizes")
        tokens.text.size.forEach { (key, size) ->
            val value = "${size.value.mobile}sp"

            "item" {
                attribute("name", "$key$TEXT_SIZE_SUFFIX")
                -value
            }
        }
    }

    private fun generateDarkThemesFiles(tokens: TokensDTO, brand: Brand) {

        fun Node.generateTheme(themeName: String) {
            "style" {
                attribute("name", themeName)
                attribute("parent", "${themeName}_Customizations")
                mapColors(tokens.dark, brand)
            }
        }

        val darkThemesXml = xml("resources", "utf-8", XmlVersion.V10) {
            comment(AUTOGENERATED_COMMENT)

            val brandName = brand.name.capitalizeString()

            generateTheme("MisticaTheme.$brandName")

            if (brand.createDuplicateWithoutInheritMistica) {
                generateTheme("${brandName}Override")
            }
        }

        File("$VALUES_NIGHT_DIR/${THEMES_FILE.format(brand.name)}").writeText(darkThemesXml.toString(PrintOptions(singleLineTextElements = true)))
    }

    private fun Node.mapColors(colors: Map<String, ColorDTO>, brand: Brand) {
        colors.forEach { color ->
            val colorName = if (color.key == "controlActivated") {
                "colorControlActive"
            } else {
                "color${color.key.capitalizeString()}"
            }

            if (color.value.value.contains("rgba(")) {
                val alpha = ALPHA_REGEX.find(color.value.value)?.value?.toDouble()
                if (alpha != null) {
                    val colorValue = getColorNameWithAlpha(brand.name, color.value.description, alpha)
                    "item" {
                        attribute("name", colorName)
                        -"@color/$colorValue"
                    }
                }
            } else {
                "item" {
                    attribute("name", colorName)
                    -"@color/${brand.name}_color_${color.value.description}"
                }
            }
        }
    }

    companion object {
        const val VALUES_DIR = "../library/src/main/res/values"
        private const val VALUES_NIGHT_DIR = "../library/src/main/res/values-night"
        private const val COLORS_FILE = "colors_%s_autogenerated.xml"
        private const val THEMES_FILE = "themes_%s_autogenerated.xml"
        const val ATTRS_FILE = "attrs_autogenerated.xml"
        const val TEXT_STYLE_SUFFIX = "TextStyle"
        const val TEXT_SIZE_SUFFIX = "TextSize"
        const val FONT_SUFFIX = "Font"

        fun String.capitalizeString(): String =
            this.replaceFirstChar { if (it.isLowerCase()) it.titlecase() else it.toString() }
    }
}
