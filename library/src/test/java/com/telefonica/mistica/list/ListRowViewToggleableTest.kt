package com.telefonica.mistica.list

import android.os.Build.VERSION_CODES.VANILLA_ICE_CREAM
import android.view.View.IMPORTANT_FOR_ACCESSIBILITY_NO
import android.widget.FrameLayout
import androidx.appcompat.widget.AppCompatCheckBox
import androidx.appcompat.widget.SwitchCompat
import androidx.core.view.ViewCompat
import androidx.test.espresso.Espresso
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.rules.activityScenarioRule
import com.telefonica.mistica.DummyActivity
import com.telefonica.mistica.R
import com.telefonica.mistica.testutils.ScreenshotsTest
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertNotEquals
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@RunWith(RobolectricTestRunner::class)
@Config(sdk = [VANILLA_ICE_CREAM])
internal class ListRowViewToggleableTest : ScreenshotsTest() {
    @get:Rule
    val rule = activityScenarioRule<DummyActivity>()

    @Test
    fun `check ListRowViewWithSwitch xml`() {
        rule.scenario.onActivity { activity ->
            val wrapper: FrameLayout = activity.findViewById(R.id.dummy_activity_wrapper)
            activity.layoutInflater.inflate(R.layout.test_list_row_view_toggleables, wrapper, true)

            compareScreenshot(Espresso.onView(ViewMatchers.withId(R.id.dummy_activity_wrapper)))
        }
    }

    @Test(expected = IllegalArgumentException::class)
    fun `check ListRowViewWithCheckBox adding custom action layout`() {
        rule.scenario.onActivity { activity ->
            val wrapper: FrameLayout = activity.findViewById(R.id.dummy_activity_wrapper)
            activity.layoutInflater.inflate(R.layout.test_list_row_view_toggleables, wrapper, true)

            with(activity.findViewById<ListRowViewWithCheckBox>(R.id.list_row_view_with_checkbox)) {
                setActionLayout(R.layout.list_row_chevron_inverse_action)
            }
        }
    }

    @Test(expected = IllegalStateException::class)
    fun `check ListRowViewWithSwitch getting the custom action layout`() {
        rule.scenario.onActivity { activity ->
            val wrapper: FrameLayout = activity.findViewById(R.id.dummy_activity_wrapper)
            activity.layoutInflater.inflate(R.layout.test_list_row_view_toggleables, wrapper, true)

            with(activity.findViewById<ListRowViewWithSwitch>(R.id.list_row_view_with_switch)) {
                getActionView()
            }
        }
    }

    @Test(expected = IllegalStateException::class)
    fun `check ListRowViewWithCheckBox getting the custom action layout`() {
        rule.scenario.onActivity { activity ->
            val wrapper: FrameLayout = activity.findViewById(R.id.dummy_activity_wrapper)
            activity.layoutInflater.inflate(R.layout.test_list_row_view_toggleables, wrapper, true)

            with(activity.findViewById<ListRowViewWithCheckBox>(R.id.list_row_view_with_checkbox)) {
                getActionView()
            }
        }
    }

    @Test
    fun `check ListRowViewWithSwitch state description`() {
        rule.scenario.onActivity { activity ->
            val wrapper: FrameLayout = activity.findViewById(R.id.dummy_activity_wrapper)
            activity.layoutInflater.inflate(R.layout.test_list_row_view_toggleables, wrapper, true)

            with(activity.findViewById<ListRowViewWithSwitch>(R.id.list_row_view_with_switch)) {
                val switchCompat = getActionContainer().getChildAt(0) as SwitchCompat
                assertEquals(ViewCompat.getStateDescription(switchCompat), ViewCompat.getStateDescription(this))
                changeSwitchState()
                assertEquals(ViewCompat.getStateDescription(switchCompat), ViewCompat.getStateDescription(this))
            }
        }
    }

    @Test
    fun `check ListRowViewWithCheckBox state description`() {
        rule.scenario.onActivity { activity ->
            val wrapper: FrameLayout = activity.findViewById(R.id.dummy_activity_wrapper)
            activity.layoutInflater.inflate(R.layout.test_list_row_view_toggleables, wrapper, true)

            with(activity.findViewById<ListRowViewWithCheckBox>(R.id.list_row_view_with_checkbox)) {
                val checkboxCompat = getActionContainer().getChildAt(0) as AppCompatCheckBox
                assertEquals(ViewCompat.getStateDescription(checkboxCompat), ViewCompat.getStateDescription(this))
                changeCheckBoxState()
                assertEquals(ViewCompat.getStateDescription(checkboxCompat), ViewCompat.getStateDescription(this))
            }
        }
    }

    @Test
    fun `check ListRowViewWithSwitch action disabled`() {
        rule.scenario.onActivity { activity ->
            val wrapper: FrameLayout = activity.findViewById(R.id.dummy_activity_wrapper)
            activity.layoutInflater.inflate(R.layout.test_list_row_view_toggleables, wrapper, true)

            with(activity.findViewById<ListRowViewWithSwitch>(R.id.list_row_view_with_switch)) {
                val switchCompat = getActionContainer().getChildAt(0) as SwitchCompat
                assertFalse(switchCompat.isClickable)
                assertEquals(IMPORTANT_FOR_ACCESSIBILITY_NO, switchCompat.importantForAccessibility)
            }
        }
    }

    @Test
    fun `check ListRowViewWithCheckBox action disabled`() {
        rule.scenario.onActivity { activity ->
            val wrapper: FrameLayout = activity.findViewById(R.id.dummy_activity_wrapper)
            activity.layoutInflater.inflate(R.layout.test_list_row_view_toggleables, wrapper, true)

            with(activity.findViewById<ListRowViewWithCheckBox>(R.id.list_row_view_with_checkbox)) {
                val checkboxCompat = getActionContainer().getChildAt(0) as AppCompatCheckBox
                assertFalse(checkboxCompat.isClickable)
                assertEquals(IMPORTANT_FOR_ACCESSIBILITY_NO, checkboxCompat.importantForAccessibility)
            }
        }
    }

    @Test
    fun `check ListRowViewWithSwitch changeSwitchAction`() {
        rule.scenario.onActivity { activity ->
            val wrapper: FrameLayout = activity.findViewById(R.id.dummy_activity_wrapper)
            activity.layoutInflater.inflate(R.layout.test_list_row_view_toggleables, wrapper, true)

            with(activity.findViewById<ListRowViewWithSwitch>(R.id.list_row_view_with_switch)) {
                val switchCompat = getActionContainer().getChildAt(0) as SwitchCompat
                val initialState = switchCompat.isChecked
                changeSwitchState()
                assertNotEquals(initialState, switchCompat.isChecked)
            }
        }
    }

    @Test
    fun `check ListRowViewWithCheckBox changeSwitchAction`() {
        rule.scenario.onActivity { activity ->
            val wrapper: FrameLayout = activity.findViewById(R.id.dummy_activity_wrapper)
            activity.layoutInflater.inflate(R.layout.test_list_row_view_toggleables, wrapper, true)

            with(activity.findViewById<ListRowViewWithCheckBox>(R.id.list_row_view_with_checkbox)) {
                val switchCompat = getActionContainer().getChildAt(0) as AppCompatCheckBox
                val initialState = switchCompat.isChecked
                changeCheckBoxState()
                assertNotEquals(initialState, switchCompat.isChecked)
            }
        }
    }

    private fun ListRowView.getActionContainer() = this.findViewById<FrameLayout>(R.id.row_action_container)
}
