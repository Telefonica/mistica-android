package com.telefonica.mistica.list

import android.widget.FrameLayout
import android.widget.TextView
import androidx.test.espresso.Espresso
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.rules.activityScenarioRule
import com.telefonica.mistica.DummyActivity
import com.telefonica.mistica.R
import com.telefonica.mistica.testutils.ScreenshotsTest
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner

@RunWith(RobolectricTestRunner::class)
internal class ListRowViewTest : ScreenshotsTest() {
    @get:Rule
    val rule = activityScenarioRule<DummyActivity>()

    @Test
    fun `check ListRowView xml`() {
        rule.scenario.onActivity { activity ->
            val wrapper: FrameLayout = activity.findViewById(R.id.dummy_activity_wrapper)
            activity.layoutInflater.inflate(R.layout.test_list_row_view, wrapper, true)

            compareScreenshot(Espresso.onView(ViewMatchers.withId(R.id.dummy_activity_wrapper)))
        }
    }

    @Test
    fun `check ListRowView xml onClick`() {
        rule.scenario.onActivity { activity ->
            var clicks = 0
            val wrapper: FrameLayout = activity.findViewById(R.id.dummy_activity_wrapper)
            activity.layoutInflater.inflate(R.layout.test_list_row_view, wrapper, true)

            with(activity.findViewById<ListRowView>(R.id.list_row_view_32)) {
                setOnClickListener { clicks++ }
                performClick()
            }

            assertEquals(1, clicks)
        }
    }

    @Test
    fun `check ListRowView with accessibility heading is heading`() {
        rule.scenario.onActivity { activity ->
            val wrapper: FrameLayout = activity.findViewById(R.id.dummy_activity_wrapper)
            activity.layoutInflater.inflate(R.layout.test_list_row_view, wrapper, true)

            with(activity.findViewById<ListRowView>(R.id.list_row_view_title_heading)) {
                assertTrue(hasTitleHeading())
            }
        }
    }

    @Test
    fun `check ListRowView without accessibility heading is NOT heading`() {
        rule.scenario.onActivity { activity ->
            val wrapper: FrameLayout = activity.findViewById(R.id.dummy_activity_wrapper)
            activity.layoutInflater.inflate(R.layout.test_list_row_view, wrapper, true)

            with(activity.findViewById<ListRowView>(R.id.list_row_view_32)) {
                assertFalse(hasTitleHeading())
            }
        }
    }

    private fun ListRowView.hasTitleHeading() = this.findViewById<TextView>(R.id.row_title_text).isAccessibilityHeading
}