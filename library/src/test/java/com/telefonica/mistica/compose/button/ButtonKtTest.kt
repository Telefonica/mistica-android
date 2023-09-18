package com.telefonica.mistica.compose.button

import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.onRoot
import androidx.compose.ui.test.performClick
import androidx.compose.ui.unit.dp
import com.github.takahirom.roborazzi.RobolectricDeviceQualifiers
import com.github.takahirom.roborazzi.captureRoboImage
import com.telefonica.mistica.compose.theme.MisticaTheme
import com.telefonica.mistica.compose.theme.brand.BlauBrand
import com.telefonica.mistica.compose.theme.brand.Brand
import com.telefonica.mistica.compose.theme.brand.MovistarBrand
import com.telefonica.mistica.compose.theme.brand.O2Brand
import com.telefonica.mistica.compose.theme.brand.TelefonicaBrand
import com.telefonica.mistica.compose.theme.brand.VivoBrand
import com.telefonica.mistica.testutils.ScreenshotUtils
import org.junit.Assert.assertTrue
import org.junit.Rule
import org.junit.Test
import org.junit.experimental.runners.Enclosed
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@RunWith(Enclosed::class)
internal class ButtonKtTest {

    @RunWith(ParameterizedRobolectricTestRunner::class)
    @Config(qualifiers = RobolectricDeviceQualifiers.Pixel5)
    internal class ButtonKtTestParametrized(private val brand: Brand) {
        @get:Rule
        val composeTestRule = createComposeRule()

        @Test
        fun `check the button screenshot`() = test {
            `when Button`(brand)

            `then screenshot is OK`(brand)
        }

        @Test
        fun `check the button is clicked`() = test {
            `given Button`()

            `when the button is clicked`()

            `then the onClickListener has been invoked`()
        }

        private fun TestScope.`given Button`() {
            `when Button`()
        }

        private fun TestScope.`when Button`(brand: Brand = MovistarBrand) {
            composeTestRule.setContent {
                MisticaTheme(brand = brand) {
                    Button(
                        text = textValue,
                        onClickListener = onClickListener,
                        modifier = Modifier.padding(16.dp)
                    )
                }
            }
        }

        private fun TestScope.`when the button is clicked`() {
            composeTestRule.onNodeWithText(textValue).performClick()
        }

        private fun `then screenshot is OK`(brand: Brand) {
            composeTestRule.onRoot()
                .captureRoboImage(ScreenshotUtils.getScreenshotName(brand))
        }

        private fun TestScope.`then the onClickListener has been invoked`() {
            assertTrue(clicked)
        }

        private fun test(block: TestScope.() -> Unit) {
            TestScope().block()
        }

        private class TestScope {
            val textValue = "textValue"
            var clicked = false
            val onClickListener: () -> Unit = { clicked = true }
        }

        companion object {
            @JvmStatic
            @ParameterizedRobolectricTestRunner.Parameters(name = "Input: {0}")
            fun brands() = listOf(
                arrayOf(MovistarBrand),
                arrayOf(VivoBrand),
                arrayOf(O2Brand),
                arrayOf(BlauBrand),
                arrayOf(TelefonicaBrand),
            )
        }
    }

    @RunWith(RobolectricTestRunner::class)
    internal class ButtonKtTestNotParametrized {
        @get:Rule
        val composeTestRule = createComposeRule()

        @Test
        fun `check the button is clicked`() = test {
            `given Button`()

            `when the button is clicked`()

            `then the onClickListener has been invoked`()
        }

        private fun TestScope.`given Button`() {
            `when Button`()
        }

        private fun TestScope.`when Button`() {
            composeTestRule.setContent {
                MisticaTheme(brand = MovistarBrand) {
                    Button(
                        text = textValue,
                        onClickListener = onClickListener,
                        modifier = Modifier.padding(16.dp)
                    )
                }
            }
        }

        private fun TestScope.`when the button is clicked`() {
            composeTestRule.onNodeWithText(textValue).performClick()
        }

        private fun TestScope.`then the onClickListener has been invoked`() {
            assertTrue(clicked)
        }

        private fun test(block: TestScope.() -> Unit) {
            TestScope().block()
        }

        private class TestScope {
            val textValue = "textValue"
            var clicked = false
            val onClickListener: () -> Unit = { clicked = true }
        }
    }
}
