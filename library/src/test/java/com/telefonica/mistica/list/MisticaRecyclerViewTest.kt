package com.telefonica.mistica.list

import android.os.Build.VERSION_CODES.UPSIDE_DOWN_CAKE
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.recyclerview.widget.RecyclerView
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
@Config(sdk = [UPSIDE_DOWN_CAKE])
internal class MisticaRecyclerViewTest: ScreenshotsTest() {
    @get:Rule
    val rule = activityScenarioRule<DummyActivity>()

    @Test
    fun `check MisticaRecyclerView xml hides last divider`() {
        rule.scenario.onActivity { activity ->
            val wrapper: FrameLayout = activity.findViewById(R.id.dummy_activity_wrapper)
            val view = activity.layoutInflater.inflate(R.layout.test_mistica_recycler_view, wrapper, false)
            activity.setContentView(view)

            val list: MisticaRecyclerView = view.findViewById(R.id.test_list)
            list.adapter = ClickableListAdapter()
            compareScreenshot(Espresso.onView(ViewMatchers.withId(R.id.test_recycler_view)))
        }
    }

    class ListViewHolder(val rowView: ListRowView) : RecyclerView.ViewHolder(rowView)
    class ClickableListAdapter : RecyclerView.Adapter<ListViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
            return ListViewHolder(
                LayoutInflater.from(parent.context).inflate(
                    R.layout.sheet_list_row_selectable_item,
                    parent,
                    false
                ) as ListRowView
            )
        }

        override fun getItemCount(): Int = 2

        override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
            holder.rowView.setTitle("Row $position")
        }
    }

}

