package com.telefonica.mistica.compose.input

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onRoot
import androidx.compose.ui.test.performClick
import com.telefonica.mistica.compose.theme.MisticaTheme
import com.telefonica.mistica.compose.theme.brand.MovistarBrand
import com.telefonica.mistica.testutils.ScreenshotsTest
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.kotlin.mock
import org.mockito.kotlin.verify
import org.robolectric.RobolectricTestRunner

@RunWith(RobolectricTestRunner::class)
class SearchInputTest : ScreenshotsTest() {

    private val onValueChangeMock: (String) -> Unit = mock()

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun `empty SearchInput`() {
        givenSomeSearchInput(value = "")

        thenScreenshotIsOk()
    }

    @Test
    fun `non empty SearchInput`() {
        givenSomeSearchInput(value = "Something")

        thenScreenshotIsOk()
    }

    @Test
    fun `disabled SearchInput`() {
        givenSomeSearchInput(value = "", enabled = false)

        thenScreenshotIsOk()
    }

    @Test
    fun `SearchInput is cleared when clicking on clear search button`() {
        givenSomeSearchInput(value = "Something")

        whenClickingOnClearSearch()

        thenValueIsNowEmptyString()
    }

    private fun givenSomeSearchInput(value: String, enabled: Boolean = true) {
        composeTestRule.setContent {
            MisticaTheme(brand = MovistarBrand) {
                SearchInput(
                    value = value,
                    onValueChange = onValueChangeMock,
                    label = "Search something",
                    enabled = enabled
                )
            }
        }
    }

    private fun whenClickingOnClearSearch() {
        composeTestRule.onNodeWithTag(TextInputTestTags.CLEAR_SEARCH_BUTTON).performClick()
    }

    private fun thenScreenshotIsOk() {
        compareScreenshot(composeTestRule.onRoot())
    }

    private fun thenValueIsNowEmptyString() {
        verify(onValueChangeMock).invoke("")
    }
}
