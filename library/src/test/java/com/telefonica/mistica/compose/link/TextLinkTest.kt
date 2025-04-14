package com.telefonica.mistica.compose.link

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.Modifier
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onRoot
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.theme.MisticaTheme
import com.telefonica.mistica.compose.theme.brand.MovistarBrand
import com.telefonica.mistica.testutils.ScreenshotsTest
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner

@RunWith(RobolectricTestRunner::class)
class TextLinkTest: ScreenshotsTest() {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun `check single TextLink`() {
        checkSingleTextLink()
    }

    @Test
    fun `check single TextLink dark`() {
        checkSingleTextLink(darkTheme = true)
    }

    @Test
    fun `check multi TextLink`() {
        checkMultiTextLink()
    }

    @Test
    fun `check multi TextLink dark`() {
        checkMultiTextLink(darkTheme = true)
    }

    private fun checkSingleTextLink(darkTheme: Boolean = false) {
        composeTestRule.setContent {
            MisticaTheme(brand = MovistarBrand) {
                Box(modifier = Modifier.padding(24.dp)) {
                    TextLink(
                        originalText = "TextLink",
                        link = SingleLink {},
                    )
                }
            }
        }
        compareScreenshot(node = composeTestRule.onRoot(), darkTheme = darkTheme)
    }

    private fun checkMultiTextLink(darkTheme: Boolean = false) {
        composeTestRule.setContent {
            MisticaTheme(brand = MovistarBrand) {
                Box(modifier = Modifier.padding(24.dp)) {
                    TextLink(
                        originalText = "This a text showing first link and second link",
                        links = listOf(
                            MultiLink(linkedText = "first link", onLinkTapped = {}),
                            MultiLink(linkedText = "second link", onLinkTapped = {}),
                        )
                    )
                }
            }
        }
        compareScreenshot(node = composeTestRule.onRoot(), darkTheme = darkTheme)
    }
}
