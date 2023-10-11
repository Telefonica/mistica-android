package com.telefonica.mistica.input

import android.util.Log
import android.view.LayoutInflater
import android.widget.FrameLayout
import android.widget.ScrollView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.activityScenarioRule
import com.telefonica.mistica.DummyActivity
import com.telefonica.mistica.R
import com.telefonica.mistica.testutils.ScreenshotsTest
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.shadows.ShadowLog

@RunWith(RobolectricTestRunner::class)
internal class TextInputTest: ScreenshotsTest() {
    @get:Rule
    val rule = activityScenarioRule<DummyActivity>()

    @Before
    @Throws(Exception::class)
    fun setUp() {
        ShadowLog.stream = System.out
    }

    @Test
    fun `check TextInput`() {
        rule.scenario.onActivity { activity ->
            val wrapper: FrameLayout = activity.findViewById(R.id.dummy_activity_wrapper)
            val textInput = TextInput(activity)
            wrapper.addView(textInput)
            textInput.text = "Hello android devs!"

            compareScreenshot(onView(ViewMatchers.withId(R.id.dummy_activity_wrapper)))
        }
    }
}
