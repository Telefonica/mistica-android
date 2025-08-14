package com.telefonica.mistica.compose.list

import android.os.Build.VERSION_CODES.UPSIDE_DOWN_CAKE
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
import com.telefonica.mistica.compose.theme.MisticaTheme
import com.telefonica.mistica.compose.theme.brand.MovistarBrand
import com.telefonica.mistica.testutils.ScreenshotsTest
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@RunWith(RobolectricTestRunner::class)
@Config(sdk = [UPSIDE_DOWN_CAKE])
internal class ListRowItemWithSwitchTest : ScreenshotsTest() {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun `check ListRowItemWithSwitch Off`() {
        `given a ListRowItemWithSwitch`(checked = false)

        `then is NOT checked`()
        `then screenshot is OK`()
    }

    @Test
    fun `check ListRowItemWithSwitch On`() {
        `given a ListRowItemWithSwitch`(checked = true)

        `then is checked`()
        `then screenshot is OK`()
    }

    @Test
    fun `check ListRowItemWithSwitch state change`() {
        `given ListRowItemWithSwitch`(checked = false)
        `then is NOT checked`()

        `when toggling the state`()

        `then is checked`()
    }

    private fun `given ListRowItemWithSwitch`(checked: Boolean = false) =
        `given a ListRowItemWithSwitch`(checked)

    private fun `given a ListRowItemWithSwitch`(checked: Boolean = false) {
        composeTestRule.setContent {
            var isChecked by remember { mutableStateOf(checked) }
            MisticaTheme(brand = MovistarBrand) {
                ListRowItemWithSwitch(
                    listRowIcon = null,
                    headline = Tag("Promo"),
                    title = "title",
                    subtitle = "Subtitle",
                    description = "Description",
                    checked = isChecked,
                    onCheckedChange = { isChecked = it},
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
