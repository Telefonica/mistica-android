package com.telefonica.mistica.compose.button

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test

internal class ButtonKtTest {
    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun buttonDisplaysText() {
        composeTestRule.setContent {
            Button(text = "Text", loadingText = "", enabled = true, isLoading = false) {}
        }

        composeTestRule.onNodeWithText("Text").assertIsDisplayed()
    }

    @Test
    fun loadingButtonDisplaysLoadingText() {
        composeTestRule.setContent {
            Button(text = "Text", loadingText = "Loading", enabled = true, isLoading = true) {}
        }

        composeTestRule.onNodeWithText("Loading").assertIsDisplayed()
    }

    @Test
    fun enabledButtonIsClickable() {
        var clicks = 0
        val onClickListener: () -> Unit = { clicks++ }
        composeTestRule.setContent {
            Button(
                text = "Text",
                loadingText = "",
                enabled = true,
                isLoading = false,
                onClickListener = onClickListener,
            )
        }

        composeTestRule.onNodeWithText("Text").performClick()

        assertEquals(1, clicks)
    }

    @Test
    fun disabledButtonIsNotClickable() {
        var clicks = 0
        val onClickListener: () -> Unit = { clicks++ }
        composeTestRule.setContent {
            Button(
                text = "Text",
                loadingText = "",
                enabled = false,
                isLoading = false,
                onClickListener = onClickListener,
            )
        }

        composeTestRule.onNodeWithText("Text").performClick()

        assertEquals(0, clicks)
    }
}
