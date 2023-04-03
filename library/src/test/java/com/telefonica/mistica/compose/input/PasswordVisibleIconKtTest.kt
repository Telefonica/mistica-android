package com.telefonica.mistica.compose.input

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performClick
import org.junit.Assert.assertTrue
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner

@RunWith(RobolectricTestRunner::class)
internal class PasswordVisibleIconKtTest {
    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun `when clicked, the onIconClicked method is invoked`() = test {
        `given PasswordVisibleIcon`()

        `when the icon is clicked`()

        `then the lambda has been invoked`()
    }

    private fun TestScope.`given PasswordVisibleIcon`() {
        composeTestRule.setContent {
            PasswordVisibleIcon(
                passwordVisible = true,
                onIconClicked = onIconClicked,
            )
        }
    }

    private fun `when the icon is clicked`() {
        composeTestRule.onNodeWithTag(TOGGLE_VISIBILITY_TEST_TAG).performClick()
    }

    private fun TestScope.`then the lambda has been invoked`() {
        assertTrue(iconClicked)
    }

    private fun test(block: TestScope.() -> Unit) {
        TestScope().block()
    }

    private class TestScope {
        var iconClicked = false
        val onIconClicked: (Boolean) -> Unit = { iconClicked = true }
    }
}
