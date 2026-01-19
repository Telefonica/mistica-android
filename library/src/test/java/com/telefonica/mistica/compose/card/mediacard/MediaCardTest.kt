package com.telefonica.mistica.compose.card.mediacard

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onRoot
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.R
import com.telefonica.mistica.compose.card.Action
import com.telefonica.mistica.compose.card.mediacard.MediaCardImage.MediaCardImageResource
import com.telefonica.mistica.compose.tag.Tag
import com.telefonica.mistica.compose.theme.MisticaTheme
import com.telefonica.mistica.compose.theme.brand.MovistarBrand
import com.telefonica.mistica.tag.TagView
import com.telefonica.mistica.testutils.ScreenshotsTest
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.ParameterizedRobolectricTestRunner

@RunWith(ParameterizedRobolectricTestRunner::class)
internal class MediaCardTest(
    private val darkTheme: Boolean,
    private val primaryButtonText: String,
    private val linkButtonText: String,
    private val imagePosition: MediaCardImagePosition
) : ScreenshotsTest() {
    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun `check mediacard screenshot`() {
        `when mediaCard`(
            darkTheme = darkTheme,
            primaryButtonText = primaryButtonText,
            linkButtonText = linkButtonText,
            imagePosition = imagePosition,
        )
        `then screenshot is OK`(darkTheme, primaryButtonText, linkButtonText, imagePosition)
    }

    private fun `when mediaCard`(
        darkTheme: Boolean = false,
        primaryButtonText: String = "",
        linkButtonText: String = "",
        imagePosition: MediaCardImagePosition = MediaCardImagePosition.Top,
        customContent: @Composable () -> Unit = {},
    ) {
        composeTestRule.setContent {
            MisticaTheme(brand = MovistarBrand, darkTheme = darkTheme) {
                MediaCard(
                    modifier = Modifier
                        .padding(24.dp)
                        .fillMaxWidth(),
                    image = MediaCardImageResource(R.drawable.mistica_placeholder),
                    tag = Tag("Tag").withStyle(TagView.TYPE_PROMO),
                    preTitle = "pre title",
                    title = "Title",
                    subtitle = "Media Card subtitle",
                    description = "Media Card description",
                    primaryButton = if (primaryButtonText.isNotEmpty()) Action(primaryButtonText) { } else null,
                    linkButton = if (linkButtonText.isNotEmpty()) Action(linkButtonText) { } else null,
                    imagePosition = imagePosition,
                    customContent = customContent,
                )
            }
        }
    }

    private fun `then screenshot is OK`(
        darkTheme: Boolean = false,
        primaryButtonText: String = "",
        linkButtonText: String = "",
        imagePosition: MediaCardImagePosition = MediaCardImagePosition.Top,
    ) {
        val extra: String? = mutableListOf<String>().apply {
            primaryButtonText.takeIf { it.isNotEmpty() }?.let { add("withPrimaryButton") }
            linkButtonText.takeIf { it.isNotEmpty() }?.let { add("withLinkButton") }
            add("image${imagePosition.name}")
        }.takeIf {
            it.isNotEmpty()
        }?.joinToString(separator = "_")

        compareScreenshot(
            node = composeTestRule.onRoot(),
            component = "MediaCard",
            darkTheme = darkTheme,
            extra = extra
        )
    }

    companion object {
        @JvmStatic
        @ParameterizedRobolectricTestRunner.Parameters(name = "MediaCard darkTheme={0} primary={1} link={2} position={3}")
        fun params(): List<Array<Any?>> {
            val darkThemes = listOf(false, true)
            val primaryButtons = listOf("", "Primary")
            val linkButtons = listOf("", "Link")
            val positions = MediaCardImagePosition.entries
            return darkThemes.flatMap { darkTheme ->
                primaryButtons.flatMap { primary ->
                    linkButtons.flatMap { link ->
                        positions.map { pos ->
                            arrayOf(darkTheme, primary, link, pos)
                        }
                    }
                }
            }
        }
    }
}