package com.telefonica.mistica.compose.input

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onRoot
import androidx.compose.ui.test.performClick
import com.github.takahirom.roborazzi.captureRoboImage
import com.telefonica.mistica.compose.theme.MisticaTheme
import com.telefonica.mistica.compose.theme.brand.MovistarBrand
import com.telefonica.mistica.testutils.ScreenshotUtils
import com.telefonica.mistica.testutils.ScreenshotsTest
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner

@RunWith(RobolectricTestRunner::class)
internal class PasswordInputKtTest: ScreenshotsTest() {
    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun `check the password is initially not visible`() = test {
        `when PasswordInput`()

        `then screenshot is OK`()
    }

    @Test
    fun `check the password is visible after the visibility button is clicked`() = test {
        `given PasswordInput`()

        `when the visibility button is clicked`()

        `then screenshot is OK`()
    }

    @Test
    fun `check the password is not visible after toggling twice the visibility button`() = test {
        `given PasswordInput`()

        `when the visibility button is clicked`(times = 2)

        `then screenshot is OK`()
    }

    private fun TestScope.`given PasswordInput`() {
        `when PasswordInput`()
    }

    private fun TestScope.`when PasswordInput`() {
        composeTestRule.setContent {
            MisticaTheme(brand = MovistarBrand) {
                PasswordInput(
                    value = textValue,
                    onValueChange = onValueChanged,
                    label = "label",
                )
            }
        }
    }

    private fun `when the visibility button is clicked`(times: Int = 1) {
        repeat(times) {
            composeTestRule.onNodeWithTag(TextInputTestTags.PASSWORD_VISIBILITY_TOGGLE).performClick()
        }
    }

    private fun `then screenshot is OK`() {
        composeTestRule.onRoot()
            .captureRoboImage(ScreenshotUtils.getScreenshotName())
    }

    private fun test(block: TestScope.() -> Unit) {
        TestScope().block()
    }

    private class TestScope {
        val textValue = "textValue"
        var valueChanged = false
        val onValueChanged: (String) -> Unit = { valueChanged = true }
    }
}
