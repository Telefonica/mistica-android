package com.telefonica.mistica.compose.badge

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.BadgedBox
import androidx.compose.material.Icon
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onRoot
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.R
import com.telefonica.mistica.compose.theme.MisticaTheme
import com.telefonica.mistica.compose.theme.brand.MovistarBrand
import com.telefonica.mistica.testutils.ScreenshotsTest
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner

@RunWith(RobolectricTestRunner::class)
class BadgeTest: ScreenshotsTest() {
    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun `check non numeric badge screenshot`() {
        `when some badge`("")

        `then screenshot is OK`()
    }

    @Test
    fun checkNumericBadgeScreenshotOneDigit() {
        `when some badge`(ONE_DIGIT_CONTENT)

        `then screenshot is OK`()
    }

    @Test
    fun checkNumericBadgeScreenshotTwoDigits() {
        `when some badge`(TWO_DIGITS_CONTENT)

        `then screenshot is OK`()
    }

    private fun `when some badge`(value: String) {
        composeTestRule.setContent {
            MisticaTheme(brand = MovistarBrand) {
                Box(modifier = Modifier.padding(24.dp)) {
                    BadgedBox(
                        badge = {
                            Badge(
                                content = value
                            )
                        }
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.icn_creditcard),
                            contentDescription = "credit card"
                        )
                    }
                }
            }
        }
    }

    private fun `then screenshot is OK`() {
        compareScreenshot(composeTestRule.onRoot())
    }

    companion object {
        private const val ONE_DIGIT_CONTENT = "9"
        private const val TWO_DIGITS_CONTENT = "99"
    }
}