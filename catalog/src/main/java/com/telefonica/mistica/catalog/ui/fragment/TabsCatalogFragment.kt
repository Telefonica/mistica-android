package com.telefonica.mistica.catalog.ui.fragment

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.content.res.AppCompatResources
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout.OnTabSelectedListener
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.Tab
import com.telefonica.mistica.button.Button
import com.telefonica.mistica.catalog.R
import com.telefonica.mistica.input.CheckBoxInput
import com.telefonica.mistica.input.TextInput

class TabsCatalogFragment : Fragment() {

    private lateinit var tabs: TabLayout
    private lateinit var viewPager: ViewPager2
    private lateinit var inputText: TextInput
    private lateinit var iconCheckbox: CheckBoxInput
    private lateinit var pagerAdapter: SimplePagerAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View =
        inflater.inflate(R.layout.screen_tabs_catalog, container, false)

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(root: View, savedInstanceState: Bundle?) {
        super.onViewCreated(root, savedInstanceState)

        pagerAdapter = SimplePagerAdapter()
        inputText = root.findViewById(R.id.tab_label)
        iconCheckbox = root.findViewById(R.id.tab_icon)
        viewPager = root.findViewById<ViewPager2>(R.id.view_pager).also {
            it.adapter = pagerAdapter
            it.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
                override fun onPageSelected(position: Int) {
                    tabs.selectTab(tabs.getTabAt(position))
                }
            })
        }
        tabs = root.findViewById<TabLayout>(R.id.content_tabs).also {
            it.addOnTabSelectedListener(object : OnTabSelectedListener {
                override fun onTabSelected(tab: Tab) {
                    viewPager.currentItem = tab.position
                }

                override fun onTabUnselected(tab: Tab) {}
                override fun onTabReselected(tab: Tab) {}
            })
        }

        root.findViewById<Button>(R.id.add_tab_button).setOnClickListener {
            addTab(inputText.text, iconCheckbox.isChecked())
        }
        root.findViewById<Button>(R.id.remove_tab_button).setOnClickListener {
            if (tabs.tabCount >= 1) {
                tabs.removeTabAt(tabs.tabCount - 1)
                pagerAdapter.removeTab()
            }
        }

        addTab("Sample tab", false)
        addTab("Sample with icon", true)
    }

    private fun addTab(text: String?, checked: Boolean) {
        if (text.isNullOrEmpty()) return
        val tab = tabs.newTab().setText(text)
        if (checked) tab.icon = context?.let { AppCompatResources.getDrawable(it, R.drawable.ic_tab) }
        tabs.addTab(tab)
        pagerAdapter.addTab(text)
    }

    inner class SimplePagerAdapter : RecyclerView.Adapter<SimplePagerAdapter.SimpleViewHolder>() {

        private val labels: ArrayList<CharSequence> = ArrayList()

        fun addTab(label: String) {
            labels.add(label)
            notifyDataSetChanged()
        }

        fun removeTab() {
            labels.removeAt(labels.size - 1)
            notifyDataSetChanged()
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
            SimpleViewHolder(
                LayoutInflater.from(parent.context).inflate(R.layout.tab_item, parent, false)
            )

        override fun getItemCount() = labels.count()

        @SuppressLint("SetTextI18n")
        override fun onBindViewHolder(holder: SimpleViewHolder, position: Int) {
            (holder.view as TextView).also {
                it.text = "Page ${labels[position]}"
            }
        }

        inner class SimpleViewHolder(val view: View) : RecyclerView.ViewHolder(view)
    }
}
