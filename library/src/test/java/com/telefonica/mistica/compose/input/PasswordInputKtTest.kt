package com.telefonica.mistica.compose.input

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onRoot
import androidx.compose.ui.test.performClick
import com.github.takahirom.roborazzi.ExperimentalRoborazziApi
import com.github.takahirom.roborazzi.InternalRoborazziApi
import com.github.takahirom.roborazzi.RoborazziContext
import com.github.takahirom.roborazzi.captureRoboImage
import com.telefonica.mistica.compose.theme.MisticaTheme
import com.telefonica.mistica.compose.theme.brand.MovistarBrand
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.GraphicsMode

@RunWith(RobolectricTestRunner::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
internal class PasswordInputKtTest {
    @get:Rule
    val composeTestRule = createComposeRule()

    init {
        setScreenshotFolder()
    }

    @OptIn(InternalRoborazziApi::class, ExperimentalRoborazziApi::class)
    private fun setScreenshotFolder() {
        RoborazziContext.setRuleOverrideOutputDirectory("screenshots")
    }

    @Test
    fun checkThePasswordIsInitiallyNotVisible() = test {
        `when PasswordInput`()

        `then screenshot is OK`()
        //`then the password is not visible`()
    }

    @Test
    fun checkThePasswordIsVisibleAfterTheVisibilityButtonIsClicked() = test {
        `given PasswordInput`()

        `when the visibility button is clicked`()

        `then screenshot is OK`()
        //`then the password is visible`()
    }

    @Test
    fun checkThePasswordIsNotVisibleAfterTogglingTwiceTheVisibilityButton() = test {
        `given PasswordInput`()

        `when the visibility button is clicked`(times = 2)

        `then screenshot is OK`()
        //`then the password is not visible`()
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

/*
    private fun TestScope.`then the password is not visible`() {
        composeTestRule.onNodeWithText(textValue).assertDoesNotExist()
    }

    private fun TestScope.`then the password is visible`() {
        composeTestRule.onNodeWithText(textValue).assertIsDisplayed()
    }
*/

    private fun `then screenshot is OK`() {
        composeTestRule.onRoot()
            .captureRoboImage()
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
