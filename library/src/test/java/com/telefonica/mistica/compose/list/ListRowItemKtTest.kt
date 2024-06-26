package com.telefonica.mistica.compose.list

import androidx.compose.foundation.clickable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.test.assert
import androidx.compose.ui.test.hasTestTag
import androidx.compose.ui.test.hasText
import androidx.compose.ui.test.isHeading
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onRoot
import androidx.compose.ui.test.performClick
import com.telefonica.mistica.R
import com.telefonica.mistica.compose.shape.Chevron
import com.telefonica.mistica.compose.tag.Tag
import com.telefonica.mistica.compose.theme.MisticaTheme
import com.telefonica.mistica.compose.theme.brand.MovistarBrand
import com.telefonica.mistica.list.model.ImageDimensions
import com.telefonica.mistica.testutils.ScreenshotsTest
import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner

private const val LIST_ROW_ITEM_ASSET_TAG = "listRowItemAssetTag"

@RunWith(RobolectricTestRunner::class)
internal class ListRowItemKtTest : ScreenshotsTest() {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun `check ListRowItem with 64x64 asset`() {
        `when ListRowItem with asset`(ImageDimensions(width = 64, height = 64))

        `then screenshot is OK`()
    }

    @Test
    fun `check ListRowItem with 32x32 asset`() {
        `when ListRowItem with asset`(ImageDimensions(width = 32, height = 32))

        `then screenshot is OK`()
    }

    @Test
    fun `check ListRowItem with clickable asset`() {
        var clicked = 0
        val onAssetClick: () -> Unit = {
            clicked++
        }
        `when ListRowItem with asset`(
            dimensions = ImageDimensions(width = 44, height = 44),
            onAssetClick = onAssetClick,
        )
        composeTestRule.onNode(hasTestTag(LIST_ROW_ITEM_ASSET_TAG)).performClick()

        assertEquals(1, clicked)
    }

    @Test
    fun `check ListRowItem with accessibility heading is heading`() {
        val titleText = "Title With Heading"
        `when ListRowItem with title`(
            title = titleText,
            isTitleHeading = true,
        )
        composeTestRule.onNode(hasText(titleText))
            .assert(isHeading())
    }

    @Test
    fun `check ListRowItem without accessibility heading is NOT heading`() {
        val titleText = "Title NO Heading"
        `when ListRowItem with title`(
            title = titleText,
            isTitleHeading = false,
        )
        composeTestRule.onNode(hasText(titleText))
            .assert(!isHeading())
    }

    private fun `when ListRowItem with asset`(dimensions: ImageDimensions, onAssetClick: () -> Unit = {}) {
        composeTestRule.setContent {
            MisticaTheme(brand = MovistarBrand) {
                ListRowItem(
                    listRowIcon = ListRowIcon.ImageAsset(
                        painter = painterResource(id = R.drawable.placeholder),
                        dimensions = ImageDimensions(width = dimensions.width, height = dimensions.height),
                        modifier = Modifier
                            .testTag(LIST_ROW_ITEM_ASSET_TAG)
                            .clickable { onAssetClick() },
                    ),
                    headline = Tag("Promo"),
                    isBadgeVisible = true,
                    title = "Title",
                    subtitle = "Subtitle",
                    description = "Description",
                    trailing = { Chevron() },
                )
            }
        }
    }

    private fun `when ListRowItem with title`(title: String, isTitleHeading: Boolean) {
        composeTestRule.setContent {
            MisticaTheme(brand = MovistarBrand) {
                ListRowItem(
                    listRowIcon = null,
                    headline = Tag("Promo"),
                    isBadgeVisible = true,
                    title = title,
                    isTitleHeading = isTitleHeading,
                    subtitle = "Subtitle",
                    description = "Description",
                )
            }
        }
    }

    private fun `then screenshot is OK`() {
        compareScreenshot(composeTestRule.onRoot())
    }
}
