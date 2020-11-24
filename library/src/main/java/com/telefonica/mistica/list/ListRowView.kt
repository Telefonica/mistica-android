package com.telefonica.mistica.list

import android.content.Context
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.View
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import androidx.annotation.IntDef
import androidx.annotation.LayoutRes
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import androidx.core.content.ContextCompat
import androidx.databinding.BindingMethod
import androidx.databinding.BindingMethods
import com.telefonica.mistica.R
import com.telefonica.mistica.badge.Badge
import com.telefonica.mistica.util.convertDpToPx

@BindingMethods(
    BindingMethod(
        type = ListRowView::class,
        attribute = "listRowHeadlineLayout",
        method = "setHeadlineLayout"
    ),
    BindingMethod(
        type = ListRowView::class,
        attribute = "listRowHeadlineVisible",
        method = "setHeadlineVisible"
    ),
    BindingMethod(
        type = ListRowView::class,
        attribute = "listRowTitle",
        method = "setTitle"
    ),
    BindingMethod(
        type = ListRowView::class,
        attribute = "listRowSubtitle",
        method = "setSubtitle"
    ),
    BindingMethod(
        type = ListRowView::class,
        attribute = "listRowDescription",
        method = "setDescription"
    ),
    BindingMethod(
        type = ListRowView::class,
        attribute = "listRowAssetDrawable",
        method = "setAssetDrawable"
    ),
    BindingMethod(
        type = ListRowView::class,
        attribute = "listRowAssetType",
        method = "setAssetType"
    ),
    BindingMethod(
        type = ListRowView::class,
        attribute = "listRowIsBoxed",
        method = "setBoxed"
    ),
    BindingMethod(
        type = ListRowView::class,
        attribute = "listRowActionLayout",
        method = "setActionLayout"
    ),
    BindingMethod(
        type = ListRowView::class,
        attribute = "listRowBadgeCount",
        method = "setBadgeCount"
    )
)
class ListRowView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {

    @Retention(AnnotationRetention.SOURCE)
    @IntDef(
        TYPE_IMAGE,
        TYPE_SMALL_ICON,
        TYPE_LARGE_ICON
    )
    annotation class AssetType

    private val textsContainer: LinearLayout
    private val assetImageView: ImageView
    private val assetImageLayout: FrameLayout
    private val headlineContainer: FrameLayout
    private val titleTextView: TextView
    private val subtitleTextView: TextView
    private val descriptionTextView: TextView
    private val badgeAnchor: View
    private val actionContainer: FrameLayout

    private var currentHeadlineLayoutRes: Int = HEADLINE_NONE
    private var currentActionLayoutRes: Int = ACTION_NONE
    private var assetType: Int = TYPE_SMALL_ICON

    init {
        LayoutInflater.from(context).inflate(R.layout.list_row_item, this, true)

        val verticalPadding = context.convertDpToPx(16)
        setPadding(0, verticalPadding, 0, verticalPadding)
        minHeight = context.convertDpToPx(72)

        textsContainer = findViewById(R.id.row_texts_container)
        assetImageView = findViewById(R.id.row_asset_image)
        assetImageLayout = findViewById(R.id.row_asset_image_layout)
        headlineContainer = findViewById(R.id.row_headline)
        titleTextView = findViewById(R.id.row_title_text)
        subtitleTextView = findViewById(R.id.row_subtitle_text)
        descriptionTextView = findViewById(R.id.row_description_text)
        badgeAnchor = findViewById(R.id.row_badge_anchor)
        actionContainer = findViewById(R.id.row_action_container)

        if (attrs != null) {
            val styledAttrs = context.theme.obtainStyledAttributes(
                attrs,
                R.styleable.ListRowView,
                defStyleAttr,
                0
            )
            styledAttrs.getText(R.styleable.ListRowView_listRowTitle)?.let { setTitle(it) }
            styledAttrs.getResourceId(
                R.styleable.ListRowView_listRowHeadlineLayout,
                TypedValue.TYPE_NULL
            )
                .takeIf { it != TypedValue.TYPE_NULL }
                .let { setHeadlineLayout(it ?: HEADLINE_NONE) }
            setHeadlineVisible(
                styledAttrs.getBoolean(
                    R.styleable.ListRowView_listRowHeadlineVisible,
                    currentHeadlineLayoutRes != HEADLINE_NONE
                )
            )
            setSubtitle(styledAttrs.getText(R.styleable.ListRowView_listRowSubtitle))
            setDescription(styledAttrs.getText(R.styleable.ListRowView_listRowDescription))
            setBoxed(styledAttrs.getBoolean(R.styleable.ListRowView_listRowIsBoxed, false))
            setAssetType(styledAttrs.getType(R.styleable.ListRowView_listRowAssetType))
            setAssetDrawable(styledAttrs.getDrawable(R.styleable.ListRowView_listRowAssetDrawable))
            setBadgeCount(styledAttrs.getInt(R.styleable.ListRowView_listRowBadgeCount, BADGE_GONE))
            styledAttrs.getResourceId(
                R.styleable.ListRowView_listRowActionLayout,
                TypedValue.TYPE_NULL
            )
                .takeIf { it != TypedValue.TYPE_NULL }
                .let { setActionLayout(it ?: ACTION_NONE) }
            styledAttrs.recycle()
        }
    }

    fun setAssetResource(@DrawableRes resource: Int? = null) {
        setAssetDrawable(resource?.let { ContextCompat.getDrawable(context, it) })
    }

    fun setAssetDrawable(drawable: Drawable? = null) {
        assetImageView.setImageDrawable(drawable)
        val visibility = if (drawable != null) {
            View.VISIBLE
        } else {
            View.GONE
        }

        assetImageLayout.visibility = visibility
        assetImageView.visibility = visibility
    }

    fun setAssetType(@AssetType type: Int) {
        assetType = type
        configureAsset()
    }

    private fun configureAsset() {
        when (assetType) {
            TYPE_IMAGE -> {
                assetImageView.setSize(40)
                assetImageLayout.setBackgroundResource(0)
                //TODO: crop the image to be a circle
            }
            TYPE_SMALL_ICON -> {
                assetImageView.setSize(24)
                assetImageLayout.setBackgroundResource(0)
            }
            TYPE_LARGE_ICON -> {
                assetImageView.setSize(24)
                assetImageLayout.setBackgroundResource(R.drawable.bg_list_image)
            }
        }
        recalculateAssetPosition()
    }

    fun setTitle(text: CharSequence?) {
        titleTextView.text = text
        recalculateTitleBottomConstraints()
    }

    fun setBoxed(boxed: Boolean) {
        @DrawableRes val backgroundDrawable: Int =
            if (boxed) R.drawable.boxed_list_row_background else R.drawable.list_row_background
        background = ContextCompat.getDrawable(context, backgroundDrawable)
    }

    fun setHeadlineVisible(visible: Boolean) {
        headlineContainer.visibility = if (visible) View.VISIBLE else View.GONE
        recalculateTitleBottomConstraints()
        recalculateAssetPosition()
    }

    fun getHeadline(): View? =
        headlineContainer.getChildAt(0)

    fun setHeadlineLayout(@LayoutRes layoutRes: Int = HEADLINE_NONE) {
        if (currentHeadlineLayoutRes != layoutRes) {
            headlineContainer.removeAllViews()
            if (layoutRes != HEADLINE_NONE) {
                LayoutInflater.from(context).inflate(layoutRes, headlineContainer, true)
                setHeadlineVisible(true)
            } else {
                setHeadlineVisible(false)
            }
            currentHeadlineLayoutRes = layoutRes
        }
    }

    fun setSubtitle(text: CharSequence?) {
        subtitleTextView.setTextAndVisibility(text)
        recalculateTitleBottomConstraints()
        recalculateAssetPosition()
    }

    fun setDescription(text: CharSequence?) {
        descriptionTextView.setTextAndVisibility(text)
        recalculateTitleBottomConstraints()
        recalculateAssetPosition()
    }

    fun setActionLayout(@LayoutRes layoutRes: Int = ACTION_NONE) {
        if (currentActionLayoutRes != layoutRes) {
            actionContainer.removeAllViews()
            if (layoutRes != ACTION_NONE) {
                LayoutInflater.from(context).inflate(layoutRes, actionContainer, true)
                actionContainer.visibility = View.VISIBLE
            } else {
                actionContainer.visibility = View.GONE
            }
            currentActionLayoutRes = layoutRes
        }
    }

    fun setBadgeCount(count: Int = 0) {
        Badge.removeBadge(badgeAnchor)
        if (count == BADGE_GONE) {
            titleTextView.maxLines = 2
            badgeAnchor.visibility = View.GONE
        } else {
            titleTextView.maxLines = 1
            Badge.showBadgeIn(badgeAnchor, count)
            badgeAnchor.visibility = View.VISIBLE
        }
    }

    fun getActionView(): View? =
        actionContainer.getChildAt(0)

    override fun setEnabled(enabled: Boolean) {
        super.setEnabled(enabled)
        titleTextView.isEnabled = enabled
        descriptionTextView.isEnabled = enabled
        getActionView()?.isEnabled = enabled
    }

    fun delegateClickOnActionView() {
        setOnClickListener {
            getActionView()?.performClick()
        }
    }

    private fun recalculateTitleBottomConstraints() {
        with(textsContainer.layoutParams as LayoutParams) {
            bottomToBottom =
                if (isAnyTextDifferentThanTitleVisible()) ConstraintSet.UNSET else ConstraintSet.PARENT_ID
            textsContainer.layoutParams = this
        }
    }

    private fun recalculateAssetPosition() {
        with(assetImageLayout.layoutParams as LayoutParams) {
            if (isAnyTextDifferentThanTitleVisible()) {
                bottomToBottom = ConstraintSet.UNSET
                topMargin = context.convertDpToPx(if (assetType == TYPE_SMALL_ICON) 8 else 4)
            } else {
                bottomToBottom = ConstraintSet.PARENT_ID
                topMargin = context.convertDpToPx(0)
            }
            assetImageLayout.layoutParams = this
        }
    }

    private fun isAnyTextDifferentThanTitleVisible(): Boolean =
        headlineContainer.isVisible() || subtitleTextView.isVisible() || descriptionTextView.isVisible()

    private fun ImageView.setSize(dpsSize: Int) {
        val pxSize: Int = context.convertDpToPx(dpsSize)
        layoutParams.apply {
            height = pxSize
            width = pxSize
            layoutParams = this
        }
    }

    private fun View.isVisible(): Boolean =
        visibility == View.VISIBLE

    private fun TextView.setTextAndVisibility(newText: CharSequence?) {
        if (newText != null) {
            text = newText
            visibility = View.VISIBLE
        } else {
            visibility = View.GONE
        }
    }

    companion object {
        const val BADGE_GONE = -1
        const val ACTION_NONE = -1
        const val HEADLINE_NONE = -1
        const val TYPE_IMAGE = 0
        const val TYPE_SMALL_ICON = 1
        const val TYPE_LARGE_ICON = 2
    }
}