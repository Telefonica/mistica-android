package com.telefonica.mistica.title

import android.os.Build.VERSION_CODES.VANILLA_ICE_CREAM
import android.widget.FrameLayout
import androidx.test.ext.junit.rules.activityScenarioRule
import com.telefonica.mistica.DummyActivity
import com.telefonica.mistica.R
import com.telefonica.mistica.testutils.ScreenshotsTest
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@RunWith(RobolectricTestRunner::class)
@Config(sdk = [VANILLA_ICE_CREAM])
internal class TitleViewTest: ScreenshotsTest() {
    @get:Rule
    val rule = activityScenarioRule<DummyActivity>()

    @Test
    fun `check TitleView has accessibility heading when setTitleHeading is invoked`() {
        checkTitleView {
            setTitle("Title")
            setTitleHeading()

            assertTrue(this.getTitleTextView().isAccessibilityHeading)
        }
    }

    @Test
    fun `check TitleView has NOT accessibility heading when setTitleHeading is not invoked`() {
        checkTitleView {
            setTitle("Title")

            assertFalse(this.getTitleTextView().isAccessibilityHeading)
        }
    }

    @Config(qualifiers = "+night")
    @Test
    fun `check TextInput dark`() {
        checkTitleView()
    }

    private fun checkTitleView(onTitleView: TitleView.() -> Unit = {}) {
        rule.scenario.onActivity { activity ->
            val wrapper: FrameLayout = activity.findViewById(R.id.dummy_activity_wrapper)
            val titleView = TitleView(activity)
            wrapper.addView(titleView)
            titleView.onTitleView()
        }
    }
}
