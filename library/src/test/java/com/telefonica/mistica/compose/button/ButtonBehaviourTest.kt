package com.telefonica.mistica.compose.button

import android.os.Build.VERSION_CODES.UPSIDE_DOWN_CAKE
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.testutils.TestTheme
import org.junit.Assert.assertTrue
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@RunWith(RobolectricTestRunner::class)
@Config(sdk = [UPSIDE_DOWN_CAKE])
internal class ButtonBehaviourTest {
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
            TestTheme {
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