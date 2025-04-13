package com.telefonica.mistica.link

import android.widget.FrameLayout
import androidx.test.espresso.Espresso
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.rules.activityScenarioRule
import com.telefonica.mistica.DummyActivity
import com.telefonica.mistica.R
import com.telefonica.mistica.testutils.ScreenshotsTest
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@RunWith(RobolectricTestRunner::class)
class TextLinkTest : ScreenshotsTest() {

    @get:Rule
    val rule = activityScenarioRule<DummyActivity>()

    @Test
    fun `check single TextLink`() {
        checkSingleTextLink()
    }

    @Config(qualifiers = "+night")
    @Test
    fun `check single TextLink dark`() {
        checkSingleTextLink()
    }

    @Test
    fun `check multi TextLink`() {
        checkMultiTextLink()
    }

    @Config(qualifiers = "+night")
    @Test
    fun `check multi TextLink dark`() {
        checkMultiTextLink()
    }

    private fun checkSingleTextLink() {
        rule.scenario.onActivity { activity ->
            val wrapper: FrameLayout = activity.findViewById(R.id.dummy_activity_wrapper)
            val textLink = TextLink(activity)
            textLink.text = "TextLink"
            textLink.setSingleTextLink(SingleLink.DefaultSingleLink {})
            wrapper.addView(textLink)

            compareScreenshot(Espresso.onView(ViewMatchers.withId(R.id.dummy_activity_wrapper)))
        }
    }

    private fun checkMultiTextLink() {
        rule.scenario.onActivity { activity ->
            val wrapper: FrameLayout = activity.findViewById(R.id.dummy_activity_wrapper)
            val textLink = TextLink(activity)
            textLink.setMultiLinkText(
                originalText = "This a text showing first link and second link",
                links = listOf(
                    MultiLink.DefaultMultiLink(linkedText = "first link", onLinkTapped = {}),
                    MultiLink.DefaultMultiLink(linkedText = "second link", onLinkTapped = {}),
                )
            )
            wrapper.addView(textLink)

            compareScreenshot(Espresso.onView(ViewMatchers.withId(R.id.dummy_activity_wrapper)))
        }
    }
}