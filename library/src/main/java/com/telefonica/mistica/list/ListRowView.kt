package com.telefonica.mistica.list

import android.content.Context
import android.content.res.ColorStateList
import android.content.res.TypedArray
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.View
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.annotation.AttrRes
import androidx.annotation.DrawableRes
import androidx.annotation.IntDef
import androidx.annotation.LayoutRes
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter
import androidx.databinding.BindingMethod
import androidx.databinding.BindingMethods
import com.telefonica.mistica.R
import com.telefonica.mistica.badge.Badge
import com.telefonica.mistica.util.convertDpToPx
import com.telefonica.mistica.util.getThemeColor

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
        attribute = "backgroundType",
        method = "setBackgroundType"
    ),
    BindingMethod(
        type = ListRowView::class,
        attribute = "listRowActionLayout",
        method = "setActionLayout"
    ),
)
class ListRowView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
) : ConstraintLayout(context, attrs, defStyleAttr) {

    @Retention(AnnotationRetention.SOURCE)
    @IntDef(
        TYPE_IMAGE,
        TYPE_SMALL_ICON,
        TYPE_LARGE_ICON
    )
    annotation class AssetType

    @Retention(AnnotationRetention.SOURCE)
    @IntDef(
        BackgroundType.TYPE_NORMAL,
        BackgroundType.TYPE_BOXED,
        BackgroundType.TYPE_BOXED_INVERSE,
    )
    annotation class BackgroundType {
        companion object {
            const val TYPE_NORMAL = 0
            const val TYPE_BOXED = 1
            const val TYPE_BOXED_INVERSE = 2
        }
    }

    private val textsContainer: LinearLayout
    private val assetImageView: ImageView
    private val assetCircularImageView: ImageView
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
        assetCircularImageView = findViewById(R.id.row_asset_circular_image)
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
            val isBoxed = styledAttrs.getBoolean(R.styleable.ListRowView_listRowIsBoxed, false)
            val backgroundTypeDefaultValue = if (isBoxed) {
                BackgroundType.TYPE_BOXED
            } else {
                BackgroundType.TYPE_NORMAL
            }
            setBackgroundType(
                styledAttrs.getInt(
                    R.styleable.ListRowView_listRowBackgroundType,
                    backgroundTypeDefaultValue
                )
            )
            setAssetType(
                styledAttrs.getInt(
                    R.styleable.ListRowView_listRowAssetType,
                    TYPE_SMALL_ICON
                )
            )
            setAssetDrawable(styledAttrs.getDrawable(R.styleable.ListRowView_listRowAssetDrawable))
            setBadgeInitialState(styledAttrs)

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
        if (drawable != null) {
            if (assetType == TYPE_IMAGE) {
                assetCircularImageView.setImageDrawable(drawable)
                assetCircularImageView.visibility = VISIBLE
                assetImageView.visibility = GONE
            } else {
                assetImageView.setImageDrawable(drawable)
                assetCircularImageView.visibility = GONE
                assetImageView.visibility = VISIBLE
            }
            assetImageLayout.visibility = VISIBLE
        } else {
            assetImageLayout.visibility = GONE
        }
    }

    fun setAssetType(@AssetType type: Int) {
        assetType = type
        configureAsset()
    }

    private fun configureAsset() {
        when (assetType) {
            TYPE_IMAGE -> {
                assetImageLayout.setBackgroundResource(0)
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

    @Deprecated(
        message = "setBoxed is deprecated, please use 'setBackgroundType' instead",
        replaceWith = ReplaceWith(expression = "this.setBackgroundType(type)"),
        level = DeprecationLevel.WARNING,
    )
    fun setBoxed(boxed: Boolean) {
        setBackgroundType(
            if (boxed) {
                BackgroundType.TYPE_BOXED
            } else {
                BackgroundType.TYPE_NORMAL
            }
        )
    }

    fun setBackgroundType(@BackgroundType type: Int) {
        @DrawableRes val backgroundDrawable: Int = when (type) {
            BackgroundType.TYPE_BOXED -> R.drawable.boxed_list_row_background
            BackgroundType.TYPE_BOXED_INVERSE -> R.drawable.boxed_inverse_list_row_background
            BackgroundType.TYPE_NORMAL -> R.drawable.list_row_background
            else -> R.drawable.list_row_background
        }
        background = ContextCompat.getDrawable(context, backgroundDrawable)
        configureTextViewsColor(type)
    }

    private fun configureTextViewsColor(@BackgroundType type: Int) {
        val colorPrimary = if (type == BackgroundType.TYPE_BOXED_INVERSE) {
            buildTextColorSelector(
                R.attr.colorTextPrimaryInverse,
                R.attr.colorTextDisabled
            )
        } else {
            buildTextColorSelector(
                R.attr.colorTextPrimary,
                R.attr.colorTextDisabled
            )
        }

        val colorSecondary = if (type == BackgroundType.TYPE_BOXED_INVERSE) {
            buildTextColorSelector(
                R.attr.colorTextSecondaryInverse,
                R.attr.colorTextDisabled
            )
        } else {
            buildTextColorSelector(
                R.attr.colorTextSecondary,
                R.attr.colorTextDisabled
            )
        }

        titleTextView.setTextColor(colorPrimary)
        subtitleTextView.setTextColor(colorSecondary)
        descriptionTextView.setTextColor(colorSecondary)
    }

    private fun buildTextColorSelector(@AttrRes enabledColorAttr: Int, @AttrRes disabledColorAttr: Int): ColorStateList {
        val enabledColor: Int = context.getThemeColor(enabledColorAttr)
        val disabledColor: Int = context.getThemeColor(disabledColorAttr)

        return ColorStateList(
            arrayOf(
                intArrayOf(android.R.attr.state_enabled),
                intArrayOf()
            ),
            intArrayOf(
                enabledColor,
                disabledColor
            )
        )
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

    fun setBadge(show: Boolean, withBadgeDescription: String? = null) {
        if (show) {
            showNonNumericBadge(withBadgeDescription)
        } else {
            hideBadge()
        }
    }

    fun setNumericBadge(count: Int, withBadgeDescription: String? = null) {
        if (count > 0) {
            showNumericBadge(count, withBadgeDescription)
        } else {
            hideBadge()
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

    private fun showNonNumericBadge(withBadgeDescription: String?) {
        Badge.removeBadge(badgeAnchor)
        badgeAnchor.visibility = View.VISIBLE
        Badge.showBadgeIn(badgeAnchor, withBadgeDescription)
    }

    private fun showNumericBadge(count: Int, withBadgeDescription: String?) {
        Badge.removeBadge(badgeAnchor)
        badgeAnchor.visibility = View.VISIBLE
        Badge.showNumericBadgeIn(badgeAnchor, count, withBadgeDescription)
    }

    private fun hideBadge() {
        Badge.removeBadge(badgeAnchor)
        badgeAnchor.visibility = GONE
    }

    private fun setBadgeInitialState(styledAttrs: TypedArray) {
        val numericBadgeState =
            styledAttrs.getInt(R.styleable.ListRowView_listRowBadgeCount, BADGE_GONE)
        setNumericBadge(numericBadgeState)

        val nonNumericBadgeState =
            styledAttrs.getBoolean(R.styleable.ListRowView_listRowBadgeVisible, false)
        setBadge(nonNumericBadgeState)
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
                topMargin = context.convertDpToPx(4)
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
        private const val BADGE_GONE = 0
        const val ACTION_NONE = -1
        const val HEADLINE_NONE = -1
        const val TYPE_IMAGE = 0
        const val TYPE_SMALL_ICON = 1
        const val TYPE_LARGE_ICON = 2

        @BindingAdapter(
            value = ["listRowBadgeCount", "listRowBadgeDescription"],
            requireAll = false
        )
        @JvmStatic
        fun setNumericBadge(view: ListRowView, count: Int, withBadgeDescription: String? = null) {
            view.setNumericBadge(count, withBadgeDescription)
        }

        @BindingAdapter(
            value = ["listRowBadgeVisible", "listRowBadgeDescription"],
            requireAll = false
        )
        @JvmStatic
        fun setBadge(view: ListRowView, show: Boolean, withBadgeDescription: String? = null) {
            view.setBadge(show, withBadgeDescription)
        }
    }
}