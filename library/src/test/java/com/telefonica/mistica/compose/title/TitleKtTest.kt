package com.telefonica.mistica.compose.title

import androidx.compose.ui.test.assert
import androidx.compose.ui.test.isHeading
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import com.telefonica.mistica.compose.theme.MisticaTheme
import com.telefonica.mistica.compose.theme.brand.MovistarBrand
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner

@RunWith(RobolectricTestRunner::class)
internal class TitleKtTest {
    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun `check the title is not set with accessibility heading by default`() = test {
        `given Title`()

        composeTestRule.onNodeWithText(textValue).assert(!isHeading())
    }

    @Test
    fun `check the title is set with accessibility heading when isHeading is set`() = test {
        `given Title`(isHeading = true)

        composeTestRule.onNodeWithText(textValue).assert(isHeading())
    }

    private fun TestScope.`given Title`(isHeading: Boolean = false) {
        `when Title`(isHeading)
    }

    private fun TestScope.`when Title`(isHeading: Boolean = false) {
        composeTestRule.setContent {
            MisticaTheme(brand = MovistarBrand) {
                Title(
                    text = textValue,
                    isTitleHeading = isHeading
                )
            }
        }
    }

    private fun test(block: TestScope.() -> Unit) {
        TestScope().block()
    }

    private class TestScope {
        val textValue = "textValue"
    }

}