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
import com.telefonica.mistica.catalog.R
import com.telefonica.mistica.list.ListRowView
import com.telefonica.mistica.list.ListRowView.AssetType
import com.telefonica.mistica.list.ListRowView.Companion.TYPE_IMAGE
import com.telefonica.mistica.list.ListRowView.Companion.TYPE_LARGE_ICON
import com.telefonica.mistica.list.ListRowView.Companion.TYPE_SMALL_ICON
import com.telefonica.mistica.list.MisticaRecyclerView

class ListsCatalogFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        return inflater.inflate(R.layout.screen_fragment_lists_catalog, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val list: MisticaRecyclerView = view.findViewById(R.id.list)
        list.adapter = ListAdapter(backgroundType = ListRowView.BackgroundType.TYPE_NORMAL)

        val boxedList: MisticaRecyclerView = view.findViewById(R.id.boxed_list)
        boxedList.adapter = ListAdapter(backgroundType = ListRowView.BackgroundType.TYPE_BOXED)

        val boxedInverseList: MisticaRecyclerView = view.findViewById(R.id.boxed_inverse_list)
        boxedInverseList.adapter = ListAdapter(backgroundType = ListRowView.BackgroundType.TYPE_BOXED_INVERSE)
    }

    @Suppress("MagicNumber")
    class ListAdapter(
        @ListRowView.BackgroundType private val backgroundType: Int,
    ) : RecyclerView.Adapter<ListViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder =
            ListViewHolder(
                LayoutInflater.from(parent.context).inflate(
                    R.layout.screen_fragment_lists_catalog_item,
                    parent,
                    false
                ) as ListRowView
            )

        override fun getItemCount(): Int = 25

        override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
            val rowView: ListRowView = holder.rowView
            rowView.setBackgroundType(backgroundType)
            val withInverseBackground = backgroundType == ListRowView.BackgroundType.TYPE_BOXED_INVERSE
            when (position) {
                0 -> rowView.configureView(
                    withInverseBackground = withInverseBackground,
                )
                1 -> rowView.configureView(
                    withAction = true,
                    withInverseBackground = withInverseBackground,
                )
                2 -> rowView.configureView(
                    withAction = true,
                    withBadge = true,
                    withBadgeDescription = "You have unread messages",
                    withInverseBackground = withInverseBackground,
                )
                3 -> rowView.configureView(
                    withAction = true,
                    withBadgeNumeric = 1,
                    withInverseBackground = withInverseBackground,
                )
                4 -> rowView.configureView(
                    withLongDescription = false,
                    withInverseBackground = withInverseBackground,
                )
                5 -> rowView.configureView(
                    withLongDescription = false,
                    withAction = true,
                    withInverseBackground = withInverseBackground,
                )
                6 -> rowView.configureView(
                    withAsset = true,
                    withAssetType = TYPE_LARGE_ICON,
                    withInverseBackground = withInverseBackground,
                )
                7 -> rowView.configureView(
                    withAsset = true,
                    withAssetType = TYPE_LARGE_ICON,
                    withAction = true,
                    withInverseBackground = withInverseBackground,
                )
                8 -> rowView.configureView(
                    withAsset = true,
                    withAssetType = TYPE_LARGE_ICON,
                    withAction = true,
                    withBadge = true,
                    withInverseBackground = withInverseBackground,
                )
                9 -> rowView.configureView(
                    withAsset = true,
                    withAssetType = TYPE_LARGE_ICON,
                    withAction = true,
                    withBadgeNumeric = 5,
                    withBadgeDescription = "5 new messages",
                    withInverseBackground = withInverseBackground,
                )
                10 -> rowView.configureView(
                    withLongDescription = false,
                    withAsset = true,
                    withAssetType = TYPE_LARGE_ICON,
                    withInverseBackground = withInverseBackground,
                )
                11 -> rowView.configureView(
                    withLongDescription = false,
                    withAsset = true,
                    withAssetType = TYPE_LARGE_ICON,
                    withAction = true,
                    withInverseBackground = withInverseBackground,
                )
                12 -> rowView.configureView(
                    withAsset = true,
                    withAssetType = TYPE_SMALL_ICON,
                    withInverseBackground = withInverseBackground,
                )
                13 -> rowView.configureView(
                    withAsset = true,
                    withAssetType = TYPE_SMALL_ICON,
                    withAction = true,
                    withInverseBackground = withInverseBackground,
                )
                14 -> rowView.configureView(
                    withAsset = true,
                    withAssetType = TYPE_SMALL_ICON,
                    withAction = true,
                    withBadge = true,
                    withInverseBackground = withInverseBackground,
                )
                15 -> rowView.configureView(
                    withAsset = true,
                    withAssetType = TYPE_SMALL_ICON,
                    withAction = true,
                    withBadgeNumeric = 10,
                    withInverseBackground = withInverseBackground,
                )
                16 -> rowView.configureView(
                    withLongTitle = true,
                    withLongDescription = true,
                    withInverseBackground = withInverseBackground,
                )
                17 -> rowView.configureView(
                    withLongTitle = true,
                    withLongDescription = true,
                    withAsset = true,
                    withAssetType = TYPE_LARGE_ICON,
                    withInverseBackground = withInverseBackground,
                )
                18 -> rowView.configureView(
                    withLongTitle = true,
                    withLongDescription = true,
                    withAsset = true,
                    withAssetType = TYPE_LARGE_ICON,
                    withAction = true,
                    withInverseBackground = withInverseBackground,
                )
                19 -> rowView.configureView(
                    withAsset = true,
                    withAssetType = TYPE_LARGE_ICON,
                    withAction = true,
                    withHeadline = true,
                    withInverseBackground = withInverseBackground,
                )
                20 -> rowView.configureView(
                    withAsset = true,
                    withAssetType = TYPE_LARGE_ICON,
                    withAction = true,
                    withSubtitle = true,
                    withInverseBackground = withInverseBackground,
                )
                21 -> rowView.configureView(
                    withAsset = true,
                    withAssetType = TYPE_LARGE_ICON,
                    withAction = true,
                    withSubtitle = true,
                    withHeadline = true,
                    withInverseBackground = withInverseBackground,
                )
                22 -> rowView.configureView(
                    withAsset = true,
                    withAssetType = TYPE_LARGE_ICON,
                    withLongDescription = false,
                    withAction = true,
                    withSubtitle = true,
                    withHeadline = true,
                    withInverseBackground = withInverseBackground,
                )
                23 -> rowView.configureView(
                    withAsset = true,
                    withAssetType = TYPE_IMAGE,
                    withLongDescription = false,
                    withInverseBackground = withInverseBackground,
                )
                24 -> rowView.configureView(
                    withAsset = true,
                    withAssetType = TYPE_IMAGE,
                    withInverseBackground = withInverseBackground,
                )
            }
        }

        @SuppressLint("SetTextI18n")
        private fun ListRowView.configureView(
            withLongTitle: Boolean = false,
            withLongDescription: Boolean? = null,
            withAsset: Boolean = false,
            @AssetType withAssetType: Int = TYPE_SMALL_ICON,
            withAction: Boolean = false,
            withBadge: Boolean = false,
            withBadgeNumeric: Int = 0,
            withHeadline: Boolean = false,
            withSubtitle: Boolean = false,
            withBadgeDescription: String? = null,
            withInverseBackground: Boolean,
        ) {
            if (withHeadline) {
                setHeadlineLayout(
                    if (withInverseBackground) {
                        R.layout.list_row_text_headline_inverse
                    } else {
                        R.layout.list_row_text_headline
                    }
                )
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

            setAssetType(withAssetType)
            setAssetResource(getAssetResource(withAsset, withAssetType))

            if (withAction) {
                setActionLayout(
                    if (withInverseBackground) {
                        R.layout.list_row_chevron_inverse_action
                    } else {
                        R.layout.list_row_chevron_action
                    }
                )
                setOnClickListener { Toast.makeText(context, "Click!", Toast.LENGTH_SHORT).show() }
            } else {
                setActionLayout(ListRowView.ACTION_NONE)
                isClickable = false
            }

            when {
                withBadge -> setBadge(true, withBadgeDescription)
                withBadgeNumeric > 0 -> setNumericBadge(withBadgeNumeric, withBadgeDescription)
                else -> setBadge(false, withBadgeDescription)
            }
        }

        private fun getAssetResource(withAsset: Boolean, withAssetType: Int): Int? =
            if (withAsset) {
                if (withAssetType == TYPE_IMAGE) {
                    R.drawable.highlighted_card_custom_background
                } else {
                    R.drawable.ic_lists
                }
            } else {
                null
            }
    }

    class ListViewHolder(val rowView: ListRowView) : RecyclerView.ViewHolder(rowView)
}
