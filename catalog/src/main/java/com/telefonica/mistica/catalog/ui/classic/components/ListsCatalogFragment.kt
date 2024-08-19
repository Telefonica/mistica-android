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
import com.telefonica.mistica.catalog.R
import com.telefonica.mistica.list.ListRowView
import com.telefonica.mistica.list.ListRowView.AssetType
import com.telefonica.mistica.list.ListRowView.Companion.TYPE_IMAGE
import com.telefonica.mistica.list.ListRowView.Companion.TYPE_IMAGE_16_9
import com.telefonica.mistica.list.ListRowView.Companion.TYPE_IMAGE_1_1
import com.telefonica.mistica.list.ListRowView.Companion.TYPE_IMAGE_7_10
import com.telefonica.mistica.list.ListRowView.Companion.TYPE_IMAGE_ROUNDED
import com.telefonica.mistica.list.ListRowView.Companion.TYPE_LARGE_ICON
import com.telefonica.mistica.list.ListRowView.Companion.TYPE_SMALL_ICON
import com.telefonica.mistica.list.MisticaRecyclerView
import com.telefonica.mistica.list.model.ImageDimensions
import com.telefonica.mistica.tag.TagStyle
import com.telefonica.mistica.tag.TagView
import com.telefonica.mistica.tag.TagView.Companion.TYPE_INVERSE
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

        private fun rowConfiguration(withInverseBackground: Boolean): List<(ListRowView) -> Unit> = listOf(
            {
                it.configureView(
                    withInverseBackground = withInverseBackground,
                    withTitleHeading = true,
                )
            },
            {
                it.configureView(
                    withAction = true,
                    withInverseBackground = withInverseBackground,
                )
            },
            {
                it.configureView(
                    withAction = true,
                    withBadge = true,
                    withBadgeDescription = "You have unread messages",
                    withInverseBackground = withInverseBackground,
                )
            },
            {
                it.configureView(
                    withAction = true,
                    withBadgeNumeric = 1,
                    withInverseBackground = withInverseBackground,
                )
            },
            {
                it.configureView(
                    withLongDescription = false,
                    withInverseBackground = withInverseBackground,
                    withTitleHeading = true,
                )
            },
            {
                it.configureView(
                    withLongDescription = false,
                    withAction = true,
                    withInverseBackground = withInverseBackground,
                )
            },
            {
                it.configureView(
                    withAsset = true,
                    withAssetType = TYPE_LARGE_ICON,
                    withInverseBackground = withInverseBackground,
                )
            },
            {
                it.configureView(
                    withAsset = true,
                    withAssetType = TYPE_LARGE_ICON,
                    withAction = true,
                    withInverseBackground = withInverseBackground,
                )
            },
            {
                it.configureView(
                    withAsset = true,
                    withAssetType = TYPE_LARGE_ICON,
                    withAction = true,
                    withBadge = true,
                    withInverseBackground = withInverseBackground,
                )
            },
            {
                it.configureView(
                    withAsset = true,
                    withAssetType = TYPE_LARGE_ICON,
                    withAction = true,
                    withBadgeNumeric = 5,
                    withBadgeDescription = "5 new messages",
                    withInverseBackground = withInverseBackground,
                )
            },
            {
                it.configureView(
                    withLongDescription = false,
                    withAsset = true,
                    withAssetType = TYPE_LARGE_ICON,
                    withInverseBackground = withInverseBackground,
                )
            },
            {
                it.configureView(
                    withLongDescription = false,
                    withAsset = true,
                    withAssetType = TYPE_LARGE_ICON,
                    withAction = true,
                    withInverseBackground = withInverseBackground,
                )
            },
            {
                it.configureView(
                    withAsset = true,
                    withAssetType = TYPE_SMALL_ICON,
                    withInverseBackground = withInverseBackground,
                )
            },
            {
                it.configureView(
                    withAsset = true,
                    withAssetType = TYPE_SMALL_ICON,
                    withAction = true,
                    withInverseBackground = withInverseBackground,
                )
            },
            {
                it.configureView(
                    withAsset = true,
                    withAssetType = TYPE_SMALL_ICON,
                    withAction = true,
                    withBadge = true,
                    withInverseBackground = withInverseBackground,
                )
            },
            {
                it.configureView(
                    withAsset = true,
                    withAssetType = TYPE_SMALL_ICON,
                    withAction = true,
                    withBadgeNumeric = 10,
                    withInverseBackground = withInverseBackground,
                )
            },
            {
                it.configureView(
                    withLongTitle = true,
                    withTitleMaxLines = 1,
                    withLongDescription = true,
                    withInverseBackground = withInverseBackground,
                )
            },
            {
                it.configureView(
                    withLongTitle = true,
                    withLongDescription = true,
                    withDescriptionMaxLines = 2,
                    withInverseBackground = withInverseBackground,
                )
            },
            {
                it.configureView(
                    withLongTitle = true,
                    withAsset = true,
                    withAssetType = TYPE_LARGE_ICON,
                    withInverseBackground = withInverseBackground,
                )
            },
            {
                it.configureView(
                    withLongTitle = true,
                    withAsset = true,
                    withAssetType = TYPE_SMALL_ICON,
                    withInverseBackground = withInverseBackground,
                )
            },
            {
                it.configureView(
                    withLongTitle = true,
                    withLongDescription = true,
                    withAsset = true,
                    withAssetType = TYPE_LARGE_ICON,
                    withInverseBackground = withInverseBackground,
                )
            },
            {
                it.configureView(
                    withLongTitle = true,
                    withLongDescription = true,
                    withAsset = true,
                    withAssetType = TYPE_SMALL_ICON,
                    withInverseBackground = withInverseBackground,
                )
            },
            {
                it.configureView(
                    withLongTitle = true,
                    withLongDescription = true,
                    withAsset = true,
                    withAssetType = TYPE_LARGE_ICON,
                    withAction = true,
                    withInverseBackground = withInverseBackground,
                )
            },
            {
                it.configureView(
                    withAsset = true,
                    withAssetType = TYPE_LARGE_ICON,
                    withAction = true,
                    withHeadline = true,
                    withInverseBackground = withInverseBackground,
                )
            },
            {
                it.configureView(
                    withAsset = true,
                    withAssetType = TYPE_IMAGE_1_1,
                    withAction = true,
                    withSubtitle = true,
                    withHeadline = true,
                    withInverseBackground = withInverseBackground,
                )
            },
            {
                it.configureView(
                    withAsset = true,
                    withAssetType = TYPE_IMAGE_7_10,
                    withAction = true,
                    withSubtitle = true,
                    withHeadline = true,
                    withInverseBackground = withInverseBackground,
                )
            },
            {
                it.configureView(
                    withAsset = true,
                    withAssetType = TYPE_IMAGE_16_9,
                    withAction = true,
                    withSubtitle = true,
                    withHeadline = true,
                    withInverseBackground = withInverseBackground,
                )
            },
            {
                it.configureView(
                    withAsset = true,
                    withAssetType = TYPE_IMAGE_1_1,
                    withAction = true,
                    withSubtitle = true,
                    withHeadline = true,
                    withInverseBackground = withInverseBackground,
                    withUrlIcon = IMAGE_URL,
                )
            },
            {
                it.configureView(
                    withAsset = true,
                    withAssetType = TYPE_IMAGE_7_10,
                    withAction = true,
                    withSubtitle = true,
                    withHeadline = true,
                    withInverseBackground = withInverseBackground,
                    withUrlIcon = IMAGE_URL,
                )
            },
            {
                it.configureView(
                    withAsset = true,
                    withAssetType = TYPE_IMAGE_16_9,
                    withAction = true,
                    withSubtitle = true,
                    withHeadline = true,
                    withInverseBackground = withInverseBackground,
                    withUrlIcon = IMAGE_URL,
                )
            },
            {
                it.configureView(
                    withAsset = true,
                    withAssetType = TYPE_LARGE_ICON,
                    withAction = true,
                    withSubtitle = true,
                    withHeadline = true,
                    withInverseBackground = withInverseBackground,
                )
            },
            {
                it.configureView(
                    withAsset = true,
                    withAssetType = TYPE_LARGE_ICON,
                    withLongDescription = false,
                    withAction = true,
                    withSubtitle = true,
                    withHeadline = true,
                    withInverseBackground = withInverseBackground,
                )
            },
            {
                it.configureView(
                    withAsset = true,
                    withAssetType = TYPE_IMAGE,
                    withAction = true,
                    withSubtitle = true,
                    withHeadline = true,
                    withInverseBackground = withInverseBackground,
                    withUrlIcon = "fail_image_url",
                    withErrorIcon =  AppCompatResources.getDrawable(it.context, R.drawable.ic_error)
                )
            },
            {
                it.configureView(
                    withAsset = true,
                    withAssetType = TYPE_LARGE_ICON,
                    withAction = true,
                    withSubtitle = true,
                    withHeadline = true,
                    withInverseBackground = withInverseBackground,
                    withUrlIcon = "fail_image_url",
                    withErrorIcon =  AppCompatResources.getDrawable(it.context, R.drawable.ic_error)
                )
            },
            {
                it.configureView(
                    withAsset = true,
                    withAssetType = TYPE_SMALL_ICON,
                    withAction = true,
                    withSubtitle = true,
                    withHeadline = true,
                    withInverseBackground = withInverseBackground,
                    withUrlIcon = "fail_image_url",
                    withErrorIcon =  AppCompatResources.getDrawable(it.context, R.drawable.ic_error)
                )
            },
            {
                it.configureView(
                    withAsset = true,
                    withAssetType = TYPE_IMAGE_1_1,
                    withAction = true,
                    withSubtitle = true,
                    withHeadline = true,
                    withInverseBackground = withInverseBackground,
                    withUrlIcon = "fail_image_url",
                    withErrorIcon =  AppCompatResources.getDrawable(it.context, R.drawable.ic_error)
                )
            },
            {
                it.configureView(
                    withAsset = true,
                    withAssetType = TYPE_IMAGE_7_10,
                    withAction = true,
                    withSubtitle = true,
                    withHeadline = true,
                    withInverseBackground = withInverseBackground,
                    withUrlIcon = "fail_image_url",
                    withErrorIcon =  AppCompatResources.getDrawable(it.context, R.drawable.ic_error)
                )
            },
            {
                it.configureView(
                    withAsset = true,
                    withAssetType = TYPE_IMAGE_16_9,
                    withAction = true,
                    withSubtitle = true,
                    withHeadline = true,
                    withInverseBackground = withInverseBackground,
                    withUrlIcon = "fail_image_url",
                    withErrorIcon =  AppCompatResources.getDrawable(it.context, R.drawable.ic_error)
                )
            },
            {
                it.configureView(
                    withAsset = true,
                    withAssetType = TYPE_IMAGE,
                    withLongDescription = false,
                    withInverseBackground = withInverseBackground,
                )
            },
            {
                it.configureView(
                    withAsset = true,
                    withAssetType = TYPE_IMAGE,
                    withInverseBackground = withInverseBackground,
                )
            },
            {
                it.configureView(
                    withAsset = true,
                    withAssetType = TYPE_IMAGE_ROUNDED,
                    withDimensions = ImageDimensions(width = 64, height = 64),
                    withAction = true,
                    withSubtitle = true,
                    withHeadline = true,
                    withInverseBackground = withInverseBackground,
                )
            },
        )

        @SuppressLint("SetTextI18n")
        private fun ListRowView.configureView(
            withLongTitle: Boolean = false,
            withTitleMaxLines: Int? = null,
            withTitleHeading: Boolean? = false,
            withLongDescription: Boolean? = null,
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
            withBadgeDescription: String? = null,
            withInverseBackground: Boolean,
            withUrlIcon: String? = null,
            withErrorIcon: Drawable? = null,
        ) {
            if (withHeadline) {
                val headlineText = "Headline"
                setHeadlineLayout(layoutRes = R.layout.list_row_tag_headline, contentDescription = headlineText)
                (getHeadline()!! as TagView).apply {
                    setTagStyle(if (withInverseBackground) TYPE_INVERSE else withHeadlineStyle)
                    text = headlineText
                }
            } else {
                setHeadlineLayout(ListRowView.HEADLINE_NONE)
            }

            withTitleMaxLines?.let { setTitleMaxLines(it) }
            setTitle(if (withLongTitle) "Title long enough to need more than 2 lines to show it, just for testing purposes." +
                    "More sample text just for testing purposes." else "Title")
            if (withTitleHeading == true) {
                setTitleHeading()
            }
            withSubtitleMaxLines?.let { setSubtitleMaxLines(it) }
            setSubtitle(if (withSubtitle) "Any Subtitle" else null)
            withDescriptionMaxLines?.let { setDescriptionMaxLines(it) }
            setDescription(
                withLongDescription?.let { long ->
                    if (long) {
                        "Description long enough to need more than 2 lines to show it, just for testing purposes." +
                                "Description long enough to need more than 2 lines to show it, just for testing purposes."
                    } else {
                        "Description"
                    }
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

            when {
                withBadge -> setBadge(true, withBadgeDescription)
                withBadgeNumeric > 0 -> setNumericBadge(withBadgeNumeric, withBadgeDescription)
                else -> setBadge(false, withBadgeDescription)
            }
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
    }

    class ListViewHolder(val rowView: ListRowView) : RecyclerView.ViewHolder(rowView)

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

    private companion object {
        const val IMAGE_URL = "https://www.fotoaparat.cz/imgs/a/26/2639/0n1wjdf0-cr-em13-09-1200x627x9.jpg"
    }

}
