package com.telefonica.mistica.list

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

@RunWith(RobolectricTestRunner::class)
internal class ListRowViewTest: ScreenshotsTest() {
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
}