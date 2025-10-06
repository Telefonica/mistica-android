package com.telefonica.mistica.compose.list

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.test.assertIsOff
import androidx.compose.ui.test.assertIsOn
import androidx.compose.ui.test.isToggleable
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onRoot
import androidx.compose.ui.test.performClick
import com.telefonica.mistica.compose.tag.Tag
import com.telefonica.mistica.testutils.ScreenshotsTest
import com.telefonica.mistica.testutils.TestTheme
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner

@RunWith(RobolectricTestRunner::class)
internal class ListRowItemWithCheckBoxTest : ScreenshotsTest() {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun `check ListRowItemWithCheckBox Off`() {
        `given a ListRowItemWithCheckBox`(checked = false)

        `then is NOT checked`()
        `then screenshot is OK`()
    }

    @Test
    fun `check ListRowItemWithCheckBox On`() {
        `given a ListRowItemWithCheckBox`(checked = true)

        `then is checked`()
        `then screenshot is OK`()
    }

    @Test
    fun `check ListRowItemWithCheckBox state change`() {
        `given ListRowItemWithCheckBox`(checked = false)
        `then is NOT checked`()

        `when toggling the state`()

        `then is checked`()
    }

    private fun `given ListRowItemWithCheckBox`(checked: Boolean = false) =
        `given a ListRowItemWithCheckBox`(checked)

    private fun `given a ListRowItemWithCheckBox`(checked: Boolean = false) {
        composeTestRule.setContent {
            var isChecked by remember { mutableStateOf(checked) }
            TestTheme {
                ListRowItemWithCheckBox(
                    listRowIcon = null,
                    headline = Tag("Promo"),
                    title = "title",
                    subtitle = "Subtitle",
                    description = "Description",
                    checked = isChecked,
                    onCheckedChange = { isChecked = it },
                )
            }
        }
    }

    private fun `when toggling the state`() {
        composeTestRule.onNode(isToggleable()).performClick()
    }

    private fun `then screenshot is OK`() {
        compareScreenshot(composeTestRule.onRoot())
    }

    private fun `then is NOT checked`() {
        composeTestRule.onNode(isToggleable()).assertIsOff()
    }

    private fun `then is checked`() {
        composeTestRule.onNode(isToggleable()).assertIsOn()
    }
}
