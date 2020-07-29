package com.telefonica.mistica.catalog.ui.fragment

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.telefonica.mistica.R
import com.telefonica.mistica.list.ListRowView
import com.telefonica.mistica.list.layout.configureWithBoxedLayout
import com.telefonica.mistica.list.layout.configureWithFullWidthLayout

class ListsCatalogFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        return inflater.inflate(R.layout.screen_fragment_lists_catalog, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val list: RecyclerView = view.findViewById(R.id.list)
        list.configureWithFullWidthLayout()
        list.adapter = ListAdapter(boxed = false)

        val boxedList: RecyclerView = view.findViewById(R.id.boxed_list)
        boxedList.configureWithBoxedLayout()
        boxedList.adapter = ListAdapter(boxed = true)
    }

    @Suppress("MagicNumber")
    class ListAdapter(private val boxed: Boolean) : RecyclerView.Adapter<ListViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder =
            ListViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.screen_fragment_lists_catalog_item, parent, false) as ListRowView)

        override fun getItemCount(): Int = 23

        override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
            val rowView: ListRowView = holder.rowView
            rowView.setBoxed(boxed)
            when (position) {
                0 -> rowView.configureView()
                1 -> rowView.configureView(
                    withAction = true
                )
                2 -> rowView.configureView(
                    withAction = true,
                    withBadgeCount = 0
                )
                3 -> rowView.configureView(
                    withAction = true,
                    withBadgeCount = 1
                )
                4 -> rowView.configureView(
                    withLongDescription = false
                )
                5 -> rowView.configureView(
                    withLongDescription = false,
                    withAction = true
                )
                6 -> rowView.configureView(
                    withAsset = true
                )
                7 -> rowView.configureView(
                    withAsset = true,
                    withAction = true
                )
                8 -> rowView.configureView(
                    withAsset = true,
                    withAction = true,
                    withBadgeCount = 0
                )
                9 -> rowView.configureView(
                    withAsset = true,
                    withAction = true,
                    withBadgeCount = 5
                )
                10 -> rowView.configureView(
                    withLongDescription = false,
                    withAsset = true
                )
                11 -> rowView.configureView(
                    withLongDescription = false,
                    withAsset = true,
                    withAction = true
                )
                12 -> rowView.configureView(
                    withAsset = true,
                    withSmallAsset = true
                )
                13 -> rowView.configureView(
                    withAsset = true,
                    withSmallAsset = true,
                    withAction = true
                )
                14 -> rowView.configureView(
                    withAsset = true,
                    withSmallAsset = true,
                    withAction = true,
                    withBadgeCount = 0
                )
                15 -> rowView.configureView(
                    withAsset = true,
                    withSmallAsset = true,
                    withAction = true,
                    withBadgeCount = 10
                )
                16 -> rowView.configureView(
                    withLongTitle = true,
                    withLongDescription = true
                )
                17 -> rowView.configureView(
                    withLongTitle = true,
                    withLongDescription = true,
                    withAsset = true
                )
                18 -> rowView.configureView(
                    withLongTitle = true,
                    withLongDescription = true,
                    withAsset = true,
                    withAction = true
                )
                19 -> rowView.configureView(
                    withAsset = true,
                    withAction = true,
                    withHeadline = true
                )
                20 -> rowView.configureView(
                    withAsset = true,
                    withAction = true,
                    withSubtitle = true
                )
                21 -> rowView.configureView(
                    withAsset = true,
                    withAction = true,
                    withSubtitle = true,
                    withHeadline = true
                )
                22 -> rowView.configureView(
                    withAsset = true,
                    withLongDescription = false,
                    withAction = true,
                    withSubtitle = true,
                    withHeadline = true
                )
            }
        }

        @SuppressLint("SetTextI18n")
        private fun ListRowView.configureView(
            withLongTitle: Boolean = false,
            withLongDescription: Boolean? = null,
            withAsset: Boolean = false,
            withSmallAsset: Boolean = false,
            withAction: Boolean = false,
            withBadgeCount: Int = ListRowView.BADGE_GONE,
            withHeadline: Boolean = false,
            withSubtitle: Boolean = false
        ) {
            if (withHeadline) {
                setHeadlineLayout(R.layout.list_row_text_headline)
                (getHeadline()!! as TextView).text = "Headline"
            } else {
                setHeadlineLayout(ListRowView.HEADLINE_NONE)
            }

            setTitle(if (withLongTitle) "Title long enough to need 2 lines to show it, just for testing purposes." else "Title")
            setSubtitle(if (withSubtitle) "Any Subtitle" else null)
            setDescription(
                withLongDescription?.let { long ->
                    if (long) {
                        "Description long enough to need 2 lines to show it, just for testing purposes."
                    } else {
                        "Description"
                    }
                }
            )
            setAssetResource(if (withAsset) android.R.drawable.btn_star else null)
            setSmallAsset(withSmallAsset)
            if (withAction) {
                setActionLayout(R.layout.list_row_chevron_action)
                setOnClickListener { Toast.makeText(context, "Click!", Toast.LENGTH_SHORT).show() }
            } else {
                setActionLayout(ListRowView.ACTION_NONE)
                isClickable = false
            }
            setBadgeCount(withBadgeCount)
        }
    }

    class ListViewHolder(val rowView: ListRowView) : RecyclerView.ViewHolder(rowView)
}
