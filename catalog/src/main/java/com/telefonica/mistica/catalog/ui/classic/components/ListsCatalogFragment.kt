package com.telefonica.mistica.catalog.ui.classic.components

import android.annotation.SuppressLint
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.content.res.AppCompatResources
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.telefonica.mistica.catalog.R
import com.telefonica.mistica.catalog.ui.classic.components.ListsCatalogFragment.ToggleableListAdapter.ViewType.CHECKBOX
import com.telefonica.mistica.catalog.ui.classic.components.ListsCatalogFragment.ToggleableListAdapter.ViewType.SWITCH
import com.telefonica.mistica.list.ListRowView
import com.telefonica.mistica.list.ListRowView.AssetType
import com.telefonica.mistica.list.ListRowView.Companion.TYPE_IMAGE
import com.telefonica.mistica.list.ListRowView.Companion.TYPE_IMAGE_16_9
import com.telefonica.mistica.list.ListRowView.Companion.TYPE_IMAGE_1_1
import com.telefonica.mistica.list.ListRowView.Companion.TYPE_IMAGE_7_10
import com.telefonica.mistica.list.ListRowView.Companion.TYPE_IMAGE_ROUNDED
import com.telefonica.mistica.list.ListRowView.Companion.TYPE_LARGE_ICON
import com.telefonica.mistica.list.ListRowView.Companion.TYPE_SMALL_ICON
import com.telefonica.mistica.list.ListRowViewWithCheckBox
import com.telefonica.mistica.list.ListRowViewWithSwitch
import com.telefonica.mistica.list.MisticaRecyclerView
import com.telefonica.mistica.list.model.ImageDimensions
import com.telefonica.mistica.tag.TagStyle
import com.telefonica.mistica.tag.TagView
import com.telefonica.mistica.tag.TagView.Companion.TYPE_PROMO
import com.telefonica.mistica.util.convertDpToPx

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

        val clickableRow: MisticaRecyclerView = view.findViewById(R.id.clickable_list)
        clickableRow.adapter = ClickableListAdapter()

        val toggleableRow: MisticaRecyclerView = view.findViewById(R.id.toggleable_list)
        toggleableRow.adapter = ToggleableListAdapter()
    }

    class ListAdapter(
        @ListRowView.BackgroundType private val backgroundType: Int,
    ) : RecyclerView.Adapter<ListViewHolder>() {

        private val rowConfiguration = rowConfiguration(
            withInverseBackground = backgroundType == ListRowView.BackgroundType.TYPE_BOXED_INVERSE
        )

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder =
            ListViewHolder(
                LayoutInflater.from(parent.context).inflate(
                    R.layout.screen_fragment_lists_catalog_item,
                    parent,
                    false
                ) as ListRowView
            )

        override fun getItemCount(): Int = rowConfiguration.size

        override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
            val rowView: ListRowView = holder.rowView
            rowView.setBackgroundType(backgroundType)
            rowConfiguration[position].invoke(rowView)
        }

        private fun rowConfiguration(withInverseBackground: Boolean): List<(ListRowView) -> Unit> {
            fun configure(
                withAction: Boolean = false,
                withBadge: Boolean = false,
                withBadgeNumeric: Int? = null,
                withAssetType: Int? = null,
                withHeadline: Boolean = false,
                withSubtitle: Boolean = false,
                withUrlIcon: String? = null,
                withErrorIcon: Int? = null,
                withTitleHeading: Boolean = false,
                withLongDescription: Boolean = true,
                withLongTitle: Boolean = false,
                withTitleMaxLines: Int? = null,
                withDescriptionMaxLines: Int? = null,
                withDimensions: ImageDimensions? = null,
                withCustomContentDescription: Boolean = false,
            ): (ListRowView) -> Unit = { view ->
                view.configureView(
                    withAction = withAction,
                    withBadge = withBadge,
                    withBadgeNumeric = withBadgeNumeric ?: 0,
                    withAsset = withAssetType != null,
                    withAssetType = withAssetType ?: TYPE_SMALL_ICON,
                    withInverseBackground = withInverseBackground,
                    withHeadline = withHeadline,
                    withSubtitle = withSubtitle,
                    withUrlIcon = withUrlIcon,
                    withErrorIcon = withErrorIcon?.let { AppCompatResources.getDrawable(view.context, it) },
                    withTitleHeading = withTitleHeading,
                    withLongDescription = withLongDescription,
                    withLongTitle = withLongTitle,
                    withTitleMaxLines = withTitleMaxLines,
                    withDescriptionMaxLines = withDescriptionMaxLines,
                    withDimensions = withDimensions,
                    withCustomContentDescription = withCustomContentDescription,
                )
            }

            return listOf(
                configure(withTitleHeading = true),
                configure(withAction = true),
                configure(withCustomContentDescription = true),
                configure(withAction = true, withBadge = true),
                configure(withAction = true, withBadgeNumeric = 1),
                configure(withLongDescription = false, withTitleHeading = true),
                configure(withLongDescription = false, withAction = true),
                configure(withAssetType = TYPE_LARGE_ICON),
                configure(withAssetType = TYPE_LARGE_ICON, withAction = true),
                configure(withAssetType = TYPE_LARGE_ICON, withAction = true, withBadge = true),
                configure(withAssetType = TYPE_LARGE_ICON, withAction = true, withBadgeNumeric = 5),
                configure(withLongDescription = false, withAssetType = TYPE_LARGE_ICON),
                configure(withLongDescription = false, withAssetType = TYPE_LARGE_ICON, withAction = true),
                configure(withAssetType = TYPE_SMALL_ICON),
                configure(withAssetType = TYPE_SMALL_ICON, withAction = true),
                configure(withAssetType = TYPE_SMALL_ICON, withAction = true, withBadge = true),
                configure(withAssetType = TYPE_SMALL_ICON, withAction = true, withBadgeNumeric = 10),
                configure(withLongTitle = true, withTitleMaxLines = 1),
                configure(withLongTitle = true, withDescriptionMaxLines = 2),
                configure(withLongTitle = true, withAssetType = TYPE_LARGE_ICON),
                configure(withLongTitle = true, withAssetType = TYPE_SMALL_ICON),
                configure(withLongTitle = true, withAssetType = TYPE_LARGE_ICON, withLongDescription = true),
                configure(withLongTitle = true, withAssetType = TYPE_SMALL_ICON, withLongDescription = true),
                configure(withLongTitle = true, withAssetType = TYPE_LARGE_ICON, withAction = true),
                configure(withAssetType = TYPE_LARGE_ICON, withAction = true, withHeadline = true),
                configure(withAssetType = TYPE_IMAGE_1_1, withAction = true, withHeadline = true, withSubtitle = true),
                configure(withAssetType = TYPE_IMAGE_7_10, withAction = true, withHeadline = true, withSubtitle = true),
                configure(withAssetType = TYPE_IMAGE_16_9, withAction = true, withHeadline = true, withSubtitle = true),
                configure(withAssetType = TYPE_IMAGE_1_1, withAction = true, withHeadline = true, withSubtitle = true, withUrlIcon = IMAGE_URL),
                configure(withAssetType = TYPE_IMAGE_7_10, withAction = true, withHeadline = true, withSubtitle = true, withUrlIcon = IMAGE_URL),
                configure(withAssetType = TYPE_IMAGE_16_9, withAction = true, withHeadline = true, withSubtitle = true, withUrlIcon = IMAGE_URL),
                configure(withAssetType = TYPE_LARGE_ICON, withAction = true, withHeadline = true, withSubtitle = true),
                configure(withAssetType = TYPE_IMAGE, withErrorIcon = R.drawable.ic_error, withUrlIcon =
                "fail_image_url"),
                configure(withAssetType = TYPE_IMAGE_ROUNDED, withDimensions = ImageDimensions(64, 64),
                    withAction = true, withHeadline = true, withSubtitle = true)
            )
        }

        @SuppressLint("SetTextI18n")
        @Suppress("CyclomaticComplexMethod")
        private fun ListRowView.configureView(
            withLongTitle: Boolean = false,
            withTitleMaxLines: Int? = null,
            withTitleHeading: Boolean = false,
            withLongDescription: Boolean = true,
            withDescriptionMaxLines: Int? = null,
            withAsset: Boolean = false,
            @AssetType withAssetType: Int = TYPE_SMALL_ICON,
            withDimensions: ImageDimensions? = null,
            withAction: Boolean = false,
            withBadge: Boolean = false,
            withBadgeNumeric: Int = 0,
            withHeadline: Boolean = false,
            @TagStyle withHeadlineStyle: Int = TYPE_PROMO,
            withSubtitle: Boolean = false,
            withSubtitleMaxLines: Int? = null,
            withInverseBackground: Boolean,
            withUrlIcon: String? = null,
            withErrorIcon: Drawable? = null,
            withCustomContentDescription: Boolean = false,
        ) {
            if (withHeadline) {
                val headlineText = "Headline"
                setHeadlineLayout(layoutRes = R.layout.list_row_tag_headline, contentDescription = headlineText)
                (getHeadline()!! as TagView).apply {
                    setTagStyle(withHeadlineStyle)
                    text = headlineText
                }
            } else {
                setHeadlineLayout(ListRowView.HEADLINE_NONE)
            }

            withTitleMaxLines?.let { setTitleMaxLines(it) }
            setTitle(
                if (withLongTitle) "Title long enough to need more than 2 lines to show it, just for testing purposes. " +
                        "More sample text just for testing purposes."
                else "Title"
            )
            if (withTitleHeading == true) {
                setTitleHeading()
            }
            withSubtitleMaxLines?.let { setSubtitleMaxLines(it) }
            setSubtitle(if (withSubtitle) "Any Subtitle" else null)
            withDescriptionMaxLines?.let { setDescriptionMaxLines(it) }
            setDescription(
                when {
                    withCustomContentDescription -> "Description.\nListRowView with custom content description."
                    withLongDescription -> "Description long enough to need more than 2 lines to show it, just for testing purposes." +
                            "Description long enough to need more than 2 lines to show it, just for testing purposes."

                    else -> "Description"
                }
            )

            withDimensions?.let {
                setAssetHeight(context.convertDpToPx(withDimensions.height).toFloat())
                setAssetWidth(context.convertDpToPx(withDimensions.width).toFloat())
            }
            setAssetType(withAssetType)
            withUrlIcon?.let {
                setAssetUrl(it, errorDrawable = withErrorIcon)
            } ?: run {
                setAssetResource(getAssetResource(withAsset, withAssetType))
            }

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

            if (withCustomContentDescription) contentDescription = "Custom content description for ListRowView"

            setBadge(withBadge, withBadgeNumeric)
        }

        private fun getAssetResource(withAsset: Boolean, @AssetType withAssetType: Int): Int? =
            if (withAsset) {
                when (withAssetType) {
                    TYPE_IMAGE -> R.drawable.highlighted_card_custom_background
                    TYPE_IMAGE_1_1,
                    TYPE_IMAGE_16_9,
                    TYPE_IMAGE_7_10,
                    TYPE_IMAGE_ROUNDED,
                    -> R.drawable.highlighted_card_custom_background

                    else -> R.drawable.ic_lists
                }
            } else {
                null
            }

        private fun ListRowView.setBadge(withBadge: Boolean, withBadgeNumeric: Int) {
            when {
                withBadge -> setBadge(true)
                withBadgeNumeric > 0 -> setNumericBadge(withBadgeNumeric)
                else -> setBadge(false)
            }
        }
    }

    class ListViewHolder(val rowView: ListRowView) : ViewHolder(rowView)

    class ClickableListAdapter : RecyclerView.Adapter<ListViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
            return ListViewHolder(
                LayoutInflater.from(parent.context).inflate(
                    R.layout.screen_fragment_lists_catalog_item,
                    parent,
                    false
                ) as ListRowView
            )
        }

        override fun getItemCount(): Int = 2

        override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
            with(holder.rowView) {
                if (position == 0) {
                    setTitle("Clickable Asset")
                    setAssetOnClickListener {
                        Toast.makeText(context, "Asset clicked!", Toast.LENGTH_SHORT).show()
                    }
                } else {
                    setTitle("Clickable Asset in Clickable Row")
                    setOnClickListener {
                        Toast.makeText(context, "Row clicked!", Toast.LENGTH_SHORT).show()
                    }
                    setAssetOnClickListener {
                        Toast.makeText(context, "Asset clicked!", Toast.LENGTH_SHORT).show()
                    }
                }
            }
        }
    }

    class ListSwitchViewHolder(val rowView: ListRowViewWithSwitch) : ViewHolder(rowView)
    class ListCheckBoxViewHolder(val rowView: ListRowViewWithCheckBox) : ViewHolder(rowView)

    class ToggleableListAdapter : RecyclerView.Adapter<ViewHolder>() {

        override fun getItemViewType(position: Int): Int = position
        override fun getItemCount(): Int = 2

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            return when (viewType) {
                0 -> ListSwitchViewHolder(
                    LayoutInflater.from(parent.context).inflate(R.layout.screen_fragment_lists_catalog_item_with_switch, parent, false)
                            as ListRowViewWithSwitch
                )

                else -> ListCheckBoxViewHolder(
                    LayoutInflater.from(parent.context).inflate(R.layout.screen_fragment_lists_catalog_item_with_checkbox, parent, false)
                            as ListRowViewWithCheckBox
                )
            }
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            when (holder.itemViewType) {
                SWITCH.viewType -> with((holder as ListSwitchViewHolder).rowView) {
                    setOnClickListener { changeSwitchState() }
                }
                CHECKBOX.viewType -> with((holder as ListCheckBoxViewHolder).rowView) {
                    setOnClickListener { changeCheckBoxState() }
                }
            }
        }

        private enum class ViewType(val viewType: Int) {
            SWITCH(0), CHECKBOX(1)
        }
    }

    private companion object {
        const val IMAGE_URL = "https://www.fotoaparat.cz/imgs/a/26/2639/0n1wjdf0-cr-em13-09-1200x627x9.jpg"
    }
}
