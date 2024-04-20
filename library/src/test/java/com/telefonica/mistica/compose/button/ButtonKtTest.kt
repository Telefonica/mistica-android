package com.telefonica.mistica.compose.button

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Surface
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
internal class ButtonKtTest(private val brand: Brand, private val style: ButtonStyle, private val icon: Boolean, private val darkTheme: Boolean):
    ScreenshotsTest() {
    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun `check the button screenshot`() {
        `when Button`(brand, style, icon, darkTheme)

        `then screenshot is OK`(brand, style, icon, darkTheme)
    }

    private fun `when Button`(brand: Brand = MovistarBrand, style: ButtonStyle, icon: Boolean, darkTheme: Boolean) {
        composeTestRule.setContent {
            MisticaTheme(brand = brand, darkTheme = darkTheme) {
                Surface(
                    modifier = Modifier.let {
                        if (style.isInverse()) {
                            it.background(brushes.backgroundBrand)
                        } else {
                            it.background(colors.background)
                        }
                    },
                ) {
                    Button(
                        text = "textValue",
                        buttonStyle = style,
                        icon = android.R.drawable.ic_lock_power_off.takeIf { icon },
                        onClickListener = { },
                        modifier = Modifier.padding(16.dp)
                    )
                }
            }
        }
    }

    private fun `then screenshot is OK`(brand: Brand, style: ButtonStyle, icon: Boolean, darkTheme: Boolean) {
        val iconSuffix = if (icon) {
            "icon"
        } else {
            null
        }
        compareScreenshot(composeTestRule.onRoot(), "Button", style.toString(), brand, darkTheme, iconSuffix)
    }

    companion object {
        @JvmStatic
        @ParameterizedRobolectricTestRunner.Parameters(name = "Button {1} {0} icon={2} darkTheme={3}")
        fun brands(): List<Array<Any>> {
            val allBrands = TestUtils.getAllBrands()
            val buttonStyles = ButtonStyle.entries
            val icons = listOf(false, true)
            val darkTheme = listOf(false, true)
            return allBrands.flatMap { brand ->
                buttonStyles.flatMap { buttonStyle ->
                    icons.flatMap { hasIcon ->
                        darkTheme.map { darkTheme ->
                            arrayOf(brand, buttonStyle, hasIcon, darkTheme)
                        }
                    }
                }
            }
        }
    }
}
