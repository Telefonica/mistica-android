package com.telefonica.mistica.compose.button

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onRoot
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.theme.MisticaTheme
import com.telefonica.mistica.compose.theme.MisticaTheme.brushes
import com.telefonica.mistica.compose.theme.MisticaTheme.colors
import com.telefonica.mistica.compose.theme.brand.Brand
import com.telefonica.mistica.compose.theme.brand.MovistarBrand
import com.telefonica.mistica.testutils.ScreenshotsTest
import com.telefonica.mistica.testutils.TestUtils
import com.telefonica.mistica.testutils.TestUtils.isInverse
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner

@RunWith(ParameterizedRobolectricTestRunner::class)
internal class ButtonKtTest(
    private val brand: Brand,
    private val style: ButtonStyle,
    private val icon: Boolean,
    private val darkTheme: Boolean,
    private val loadingText: String,
) :
    ScreenshotsTest() {
    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun `check the button screenshot`() {
        `when Button`(brand, style, icon, darkTheme, loadingText)

        `then screenshot is OK`(brand, style, icon, darkTheme, loadingText)
    }

    private fun `when Button`(
        brand: Brand = MovistarBrand,
        style: ButtonStyle,
        icon: Boolean,
        darkTheme: Boolean,
        loadingText: String,
    ) {
        composeTestRule.setContent {
            MisticaTheme(brand = brand, darkTheme = darkTheme) {
                Box(
                    modifier = Modifier.let {
                        if (style.isInverse()) {
                            it.background(brushes.backgroundBrand)
                        } else {
                            it.background(colors.background)
                        }
                    },
                ) {
                    Button(
                        text = BUTTON_TEXT,
                        loadingText = loadingText,
                        buttonStyle = style,
                        icon = android.R.drawable.ic_lock_power_off.takeIf { icon },
                        onClickListener = { },
                        modifier = Modifier.padding(16.dp)
                    )
                }
            }
        }
    }

    private fun `then screenshot is OK`(
        brand: Brand,
        style: ButtonStyle,
        icon: Boolean,
        darkTheme: Boolean,
        loadingText: String,
    ) {
        val extra: String? = mutableListOf<String>().apply {
            icon.takeIf { it }?.let { add("icon") }
            loadingText.takeIf { it.isNotEmpty() }?.let { add("loadingText") }
        }.takeIf {
            it.isNotEmpty()
        }?.joinToString(separator = "_")

        compareScreenshot(
            node = composeTestRule.onRoot(),
            component = "Button",
            style = style.toString(),
            brand = brand,
            darkTheme = darkTheme,
            extra = extra
        )
    }

    companion object {
        @JvmStatic
        @ParameterizedRobolectricTestRunner.Parameters(name = "Button {1} {0} icon={2} darkTheme={3}")
        fun brands(): List<Array<Any>> {
            val allBrands = TestUtils.getAllBrands()
            val buttonStyles = ButtonStyle.entries
            val icons = listOf(false, true)
            val darkTheme = listOf(false, true)
            val loadingText = listOf("", BUTTON_TEXT)
            return allBrands.flatMap { brand ->
                buttonStyles.flatMap { buttonStyle ->
                    icons.flatMap { hasIcon ->
                        darkTheme.flatMap { darkTheme ->
                            loadingText.map { loadingText ->
                                arrayOf(brand, buttonStyle, hasIcon, darkTheme, loadingText)
                            }
                        }
                    }
                }
            }
        }

        private const val BUTTON_TEXT = "textValue"
    }
}
