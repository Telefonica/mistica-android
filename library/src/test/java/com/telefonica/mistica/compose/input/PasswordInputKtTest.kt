package com.telefonica.mistica.compose.input

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner

@RunWith(RobolectricTestRunner::class)
internal class PasswordInputKtTest {
    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun `check the password is initially not visible`() = test {
        `when PasswordInput`()

        `then the password is not visible`()
    }

    @Test
    fun `check the password is visible after the visibility button is clicked`() = test {
        `given PasswordInput`()

        `when the visibility button is clicked`()

        `then the password is visible`()
    }

    @Test
    fun `check the password is not visible after toggling twice the visibility button`() = test {
        `given PasswordInput`()

        `when the visibility button is clicked`(times = 2)

        `then the password is not visible`()
    }

    private fun TestScope.`given PasswordInput`() {
        `when PasswordInput`()
    }

    private fun TestScope.`when PasswordInput`() {
        composeTestRule.setContent {
            PasswordInput(
                value = textValue,
                onValueChange = onValueChanged,
                label = "label",
            )
        }
    }

    private fun `when the visibility button is clicked`(times: Int = 1) {
        repeat(times) {
            composeTestRule.onNodeWithTag(TOGGLE_VISIBILITY_TEST_TAG).performClick()
        }
    }

    private fun TestScope.`then the password is not visible`() {
        composeTestRule.onNodeWithText(textValue).assertDoesNotExist()
    }

    private fun TestScope.`then the password is visible`() {
        composeTestRule.onNodeWithText(textValue).assertIsDisplayed()
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
