package com.telefonica.mistica.compose.input

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onRoot
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.link.MultiLink
import com.telefonica.mistica.compose.link.TextLink
import com.telefonica.mistica.compose.theme.MisticaTheme
import com.telefonica.mistica.compose.theme.brand.Brand
import com.telefonica.mistica.testutils.ScreenshotsTest
import com.telefonica.mistica.testutils.TestUtils
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.ParameterizedRobolectricTestRunner.Parameters

@RunWith(ParameterizedRobolectricTestRunner::class)
class CheckBoxInputTest(
    private val brand: Brand,
    private val checked: Boolean,
    private val isEnabled: Boolean,
    private val errorText: String?,
    private val darkTheme: Boolean,
) : ScreenshotsTest() {
    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun `CheckBoxInput compose screenshot`() {
        composeTestRule.setContent {
            MisticaTheme(brand = brand, darkTheme = darkTheme) {
                Surface(
                    color = MisticaTheme.colors.background
                ) {
                    CheckBoxInput(
                        modifier = Modifier.padding(16.dp),
                        text = "Some text with terms and conditions",
                        links = listOf(
                            MultiLink(linkedText = "terms and conditions", onLinkTapped = {})
                        ),
                        checked = checked,
                        onCheckedChange = {},
                        errorText = errorText,
                        enabled = isEnabled,
                    )
                }
            }
        }

        val screenshotSuffix = StringBuilder()
        if (errorText != null) {
            screenshotSuffix.append("_errorText")
        }
        if (!isEnabled) {
            screenshotSuffix.append("_disabled")
        }

        if (checked) {
            screenshotSuffix.append("_checked")
        } else {
            screenshotSuffix.append("_unchecked")
        }

        compareScreenshot(
            node = composeTestRule.onRoot(),
            component = "CheckBoxInput",
            style = null,
            brand = brand,
            darkTheme = darkTheme,
            extra = screenshotSuffix.toString()
        )
    }

    companion object {
        @Suppress("UNUSED")
        @JvmStatic
        @Parameters
        fun brands(): List<Array<Any?>> {
            val brands = TestUtils.getAllBrands()
            val enabled = arrayOf(false, true)
            val checked = arrayOf(false, true)
            val errorTexts = arrayOf(null, "Some error text")
            val darkTheme = arrayOf(false, true)

            return brands.flatMap { brand ->
                enabled.flatMap { isEnabled ->
                    checked.flatMap { isChecked ->
                        errorTexts.flatMap { errorText ->
                            darkTheme.map { darkTheme ->
                                arrayOf(brand, isEnabled, isChecked, errorText, darkTheme)
                            }
                        }
                    }
                }
            }
        }
    }
}