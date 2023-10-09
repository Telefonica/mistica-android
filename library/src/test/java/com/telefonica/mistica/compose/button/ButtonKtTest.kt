package com.telefonica.mistica.compose.button

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onRoot
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.theme.MisticaTheme
import com.telefonica.mistica.compose.theme.brand.BlauBrand
import com.telefonica.mistica.compose.theme.brand.Brand
import com.telefonica.mistica.compose.theme.brand.MovistarBrand
import com.telefonica.mistica.compose.theme.brand.O2Brand
import com.telefonica.mistica.compose.theme.brand.TelefonicaBrand
import com.telefonica.mistica.compose.theme.brand.VivoBrand
import com.telefonica.mistica.testutils.ScreenshotsTest
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner

@RunWith(ParameterizedRobolectricTestRunner::class)
internal class ButtonKtTest(private val brand: Brand, private val darkTheme: Boolean): ScreenshotsTest() {
    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun `check the button screenshot`() {
        `when Button`(brand, darkTheme)

        `then screenshot is OK`(brand, darkTheme)
    }

    private fun `when Button`(brand: Brand = MovistarBrand, darkTheme: Boolean) {
        composeTestRule.setContent {
            MisticaTheme(brand = brand, darkTheme = darkTheme) {
                Surface {
                    Button(
                        text = "textValue",
                        onClickListener = { },
                        modifier = Modifier.padding(16.dp)
                    )
                }
            }
        }
    }

    private fun `then screenshot is OK`(brand: Brand, darkTheme: Boolean) {
        compareScreenshot(composeTestRule.onRoot(), brand, darkTheme)
    }

    companion object {
        @JvmStatic
        @ParameterizedRobolectricTestRunner.Parameters(name = "Input: {0}")
        fun brands() = listOf(
            arrayOf(MovistarBrand, false),
            arrayOf(VivoBrand, false),
            arrayOf(O2Brand, false),
            arrayOf(BlauBrand, false),
            arrayOf(TelefonicaBrand, false),
            arrayOf(MovistarBrand, true),
            arrayOf(VivoBrand, true),
            arrayOf(O2Brand, true),
            arrayOf(BlauBrand, true),
            arrayOf(TelefonicaBrand, true),
        )
    }
}
