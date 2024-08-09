package com.telefonica.mistica.list

import android.content.Context
import android.content.res.TypedArray
import android.graphics.drawable.Drawable
import android.text.TextUtils
import android.util.AttributeSet
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.View
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.annotation.DrawableRes
import androidx.annotation.IntDef
import androidx.annotation.LayoutRes
import androidx.appcompat.content.res.AppCompatResources
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import androidx.core.view.ViewCompat
import androidx.core.view.isVisible
import androidx.databinding.BindingAdapter
import androidx.databinding.BindingMethod
import androidx.databinding.BindingMethods
import com.telefonica.mistica.R
import com.telefonica.mistica.badge.Badge
import com.telefonica.mistica.list.model.ImageDimensions
import com.telefonica.mistica.util.convertDpToPx
import com.telefonica.mistica.util.getMisticaThemeDrawableBuilder
import com.telefonica.mistica.util.getThemeColor
import com.telefonica.mistica.util.loadUrl
import com.telefonica.mistica.util.setAlpha

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
        attribute = "listRowTitleMaxLines",
        method = "setTitleMaxLines"
    ),
    BindingMethod(
        type = ListRowView::class,
        attribute = "listRowIsTitleHeading",
        method = "setTitleHeading"
    ),
    BindingMethod(
        type = ListRowView::class,
        attribute = "listRowSubtitle",
        method = "setSubtitle"
    ),
    BindingMethod(
        type = ListRowView::class,
        attribute = "listRowSubtitleMaxLines",
        method = "setSubtitleMaxLines"
    ),
    BindingMethod(
        type = ListRowView::class,
        attribute = "listRowDescription",
        method = "setDescription"
    ),
    BindingMethod(
        type = ListRowView::class,
        attribute = "listRowDescriptionMaxLines",
        method = "setDescriptionMaxLines"
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
    BindingMethod(
        type = ListRowView::class,
        attribute = "listRowAssetHeight",
        method = "setAssetHeight"
    ),
    BindingMethod(
        type = ListRowView::class,
        attribute = "listRowAssetWidth",
        method = "setAssetWidth"
    ),
)
open class ListRowView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
) : ConstraintLayout(context, attrs, defStyleAttr) {

    @Retention(AnnotationRetention.SOURCE)
    @IntDef(
        TYPE_IMAGE,
        TYPE_SMALL_ICON,
        TYPE_LARGE_ICON,
        TYPE_IMAGE_1_1,
        TYPE_IMAGE_7_10,
        TYPE_IMAGE_16_9,
        TYPE_IMAGE_ROUNDED,
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
    private val assetRoundedImageView: ImageView
    private val assetImageLayout: FrameLayout
    private val headlineContainer: FrameLayout
    private val titleTextView: TextView
    private val subtitleTextView: TextView
    private val descriptionTextView: TextView
    private val badgeAnchor: View
    private val badgeAnchorContainer: FrameLayout
    protected val actionContainer: FrameLayout

    private var currentHeadlineLayoutRes: Int = HEADLINE_NONE
    private var currentActionLayoutRes: Int = ACTION_NONE
    private var assetType: Int = TYPE_SMALL_ICON
    private var assetHeight: Float = UNDEFINED
    private var assetWidth: Float = UNDEFINED
    private var cachedDefaultBackgroundType: Int = BackgroundType.TYPE_NORMAL

    init {
        LayoutInflater.from(context).inflate(R.layout.list_row_item, this, true)

        val verticalPadding = context.convertDpToPx(16)
        setPadding(0, verticalPadding, 0, verticalPadding)
        minHeight = context.convertDpToPx(72)

        textsContainer = findViewById(R.id.row_texts_container)
        assetImageView = findViewById(R.id.row_asset_image)
        assetCircularImageView = findViewById(R.id.row_asset_circular_image)
        assetRoundedImageView = findViewById(R.id.row_asset_rounded_image)
        assetImageLayout = findViewById(R.id.row_asset_image_layout)
        headlineContainer = findViewById(R.id.row_headline)
        titleTextView = findViewById(R.id.row_title_text)
        subtitleTextView = findViewById(R.id.row_subtitle_text)
        descriptionTextView = findViewById(R.id.row_description_text)
        badgeAnchor = findViewById(R.id.row_badge_anchor)
        badgeAnchorContainer = findViewById(R.id.row_badge_container)
        actionContainer = findViewById(R.id.row_action_container)

        // Important! This value builds a sentence for a11y according to Mística order definition. Do not modify StringBuilder order arbitrarily
        // https://www.figma.com/design/Be8QB9onmHunKCCAkIBAVr/%F0%9F%94%B8-Lists-Specs?node-id=4615-10711&t=rHgrWciayIn0NP4V-4
        val contentDescriptionBuilder = StringBuilder()

        if (attrs != null) {
            val styledAttrs = context.theme.obtainStyledAttributes(
                attrs,
                R.styleable.ListRowView,
                defStyleAttr,
                0
            )

            // Title
            setTitleMaxLines(styledAttrs.getInteger(R.styleable.ListRowView_listRowTitleMaxLines, -1))
            styledAttrs.getText(R.styleable.ListRowView_listRowTitle)?.let {
                setTitle(it)
                contentDescriptionBuilder.append(it)
            }

            // Headline
            val headlineResId: Int = styledAttrs.getResourceId(
                R.styleable.ListRowView_listRowHeadlineLayout,
                TypedValue.TYPE_NULL
            )
            val headlineVisible: Boolean = styledAttrs.getBoolean(
                R.styleable.ListRowView_listRowHeadlineVisible,
                currentHeadlineLayoutRes != HEADLINE_NONE
            )
            val headlineContentDescription: String? = styledAttrs.getString(R.styleable.ListRowView_listRowHeadlineContentDescription)

            setHeadlineLayout(headlineResId.takeIf { it != TypedValue.TYPE_NULL } ?: HEADLINE_NONE)
            setHeadlineVisible(headlineVisible)
            if(headlineContentDescription != null && headlineResId != TypedValue.TYPE_NULL && headlineVisible) {
                contentDescriptionBuilder.append(headlineContentDescription)
            }

            // todo - finish contentDescription String builder with the rest of the params according to Figma order:

            setSubtitleMaxLines(styledAttrs.getInteger(R.styleable.ListRowView_listRowSubtitleMaxLines, -1))
            setSubtitle(styledAttrs.getText(R.styleable.ListRowView_listRowSubtitle))
            setDescriptionMaxLines(styledAttrs.getInteger(R.styleable.ListRowView_listRowDescriptionMaxLines, -1))
            setDescription(styledAttrs.getText(R.styleable.ListRowView_listRowDescription))
            val isBoxed = styledAttrs.getBoolean(R.styleable.ListRowView_listRowIsBoxed, false)
            val backgroundTypeDefaultValue = if (isBoxed) {
                BackgroundType.TYPE_BOXED
            } else {
                BackgroundType.TYPE_NORMAL
            }
            cachedDefaultBackgroundType = backgroundTypeDefaultValue
            setBackgroundType(
                styledAttrs.getInt(
                    R.styleable.ListRowView_listRowBackgroundType,
                    backgroundTypeDefaultValue
                )
            )
            setAssetHeight(
                styledAttrs.getDimension(
                    R.styleable.ListRowView_listRowAssetHeight,
                    UNDEFINED
                )
            )
            setAssetWidth(
                styledAttrs.getDimension(
                    R.styleable.ListRowView_listRowAssetWidth,
                    UNDEFINED
                )
            )
            setAssetType(
                styledAttrs.getInt(
                    R.styleable.ListRowView_listRowAssetType,
                    TYPE_SMALL_ICON
                )
            )
            val assetDrawable: Drawable? = styledAttrs.getResourceId(R.styleable.ListRowView_listRowAssetDrawable, TypedValue.TYPE_NULL)
                .takeIf { it != TypedValue.TYPE_NULL }
                ?.let { AppCompatResources.getDrawable(context, it) }
            setAssetDrawable(assetDrawable)
            setBadgeInitialState(styledAttrs)

            styledAttrs.getResourceId(
                R.styleable.ListRowView_listRowActionLayout,
                TypedValue.TYPE_NULL
            )
                .takeIf { it != TypedValue.TYPE_NULL }
                .let { setActionLayout(it ?: ACTION_NONE) }

            styledAttrs.getBoolean(
                R.styleable.ListRowView_listRowIsTitleHeading,
                false
            )
                .takeIf { it }
                ?.let { setTitleHeading() }

            styledAttrs.recycle()

            // Set content description to the Row according to Figma order.
            contentDescription = contentDescriptionBuilder.toString()
        }
    }

    fun setAssetResource(@DrawableRes resource: Int? = null) {
        setAssetDrawable(resource?.let { AppCompatResources.getDrawable(context, it) })
    }

    fun setAssetUrl(
        url: String,
        scaleType: ImageView.ScaleType = ImageView.ScaleType.CENTER_CROP,
        placeholder: Drawable? = null,
        errorDrawable: Drawable? = null,
        onSuccess: (() -> Unit)? = null,
        onError: (() -> Unit)? = null,
    ) {
        assetImageLayout.visibility = VISIBLE
        updateIconVisibility()

        when (assetType) {
            TYPE_IMAGE -> assetCircularImageView
            TYPE_IMAGE_1_1,
            TYPE_IMAGE_7_10,
            TYPE_IMAGE_16_9,
            TYPE_IMAGE_ROUNDED,
            -> assetRoundedImageView

            else -> assetImageView
        }.also { imageView ->
            imageView.loadUrl(url) {
                listener(
                    onSuccess = { _, _ ->
                        imageView.scaleType = scaleType
                        onSuccess?.invoke()
                    }, onError = { _, _ ->
                        imageView.setImageDrawable(errorDrawable)
                        imageView.scaleType = ImageView.ScaleType.FIT_CENTER
                        onError?.invoke()
                    }, onStart = {
                        imageView.setImageDrawable(placeholder)
                    })
            }
        }
    }

    fun setAssetDrawable(drawable: Drawable? = null) {
        if (drawable != null) {
            when (assetType) {
                TYPE_IMAGE ->
                    assetCircularImageView.setImageDrawable(drawable)

                TYPE_IMAGE_1_1,
                TYPE_IMAGE_7_10,
                TYPE_IMAGE_16_9,
                TYPE_IMAGE_ROUNDED,
                -> assetRoundedImageView.setImageDrawable(drawable)

                else -> assetImageView.setImageDrawable(drawable)
            }
            updateIconVisibility()
            assetImageLayout.visibility = VISIBLE
        } else {
            assetImageLayout.visibility = GONE
        }
    }

    fun setAssetOnClickListener(clickListener: OnClickListener) {
        assetImageLayout.setOnClickListener(clickListener)
    }

    private fun updateIconVisibility() {
        assetCircularImageView.isVisible = assetType == TYPE_IMAGE
        assetRoundedImageView.isVisible = assetType == TYPE_IMAGE_1_1 || assetType == TYPE_IMAGE_7_10
                || assetType == TYPE_IMAGE_16_9 || assetType == TYPE_IMAGE_ROUNDED
        assetImageView.isVisible = assetType == TYPE_SMALL_ICON || assetType == TYPE_LARGE_ICON
    }

    fun setAssetType(@AssetType type: Int, dimensions: ImageDimensions? = null) {
        assetType = type
        dimensions?.let {
            setAssetHeight(context.convertDpToPx(it.height).toFloat())
            setAssetWidth(context.convertDpToPx(it.width).toFloat())
        }
        configureAsset()
    }

    fun setAssetHeight(height: Float) {
        assetHeight = if (height > 0) {
            height
        } else {
            resources.getDimension(R.dimen.asset_default_size)
        }
    }

    fun setAssetWidth(width: Float) {
        assetWidth = if (width > 0)
            width
        else
            resources.getDimension(R.dimen.asset_default_size)
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

            TYPE_IMAGE_1_1 -> assetRoundedImageView.setSize(80, 80)
            TYPE_IMAGE_7_10 -> assetRoundedImageView.setSize(80, 116)
            TYPE_IMAGE_16_9 -> assetRoundedImageView.setSize(138, 80)
            TYPE_IMAGE_ROUNDED -> assetRoundedImageView.setSizePx(assetWidth, assetHeight)
        }
        recalculateAssetPosition()
    }

    fun setTitle(text: CharSequence?) {
        titleTextView.text = text
        recalculateTitleBottomConstraints()
    }

    fun setTitleMaxLines(maxLines: Int) {
        if (maxLines > 0) {
            titleTextView.maxLines = maxLines
            titleTextView.ellipsize = TextUtils.TruncateAt.END
        }
    }

    fun setTitleHeading() {
        ViewCompat.setAccessibilityHeading(titleTextView, true)
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
        cachedDefaultBackgroundType = type
        background = when (type) {
            BackgroundType.TYPE_BOXED ->
                AppCompatResources.getDrawable(context, R.drawable.boxed_list_row_background)

            BackgroundType.TYPE_BOXED_INVERSE ->
                context.getMisticaThemeDrawableBuilder(R.attr.drawableBackgroundBrand)
                    .withCornerRadius()
                    .withRipple()
                    .get()

            BackgroundType.TYPE_NORMAL ->
                AppCompatResources.getDrawable(context, R.drawable.list_row_background)

            else ->
                AppCompatResources.getDrawable(context, R.drawable.list_row_background)
        }
        setDefaultTitleTextColor(type)
        setDefaultSubtitleTextColor(type)
        setDefaultDescriptionTextColor(type)
    }

    fun setDefaultTitleTextColor(@BackgroundType type: Int = cachedDefaultBackgroundType) {
        val themeColor = when (type) {
            BackgroundType.TYPE_BOXED_INVERSE -> R.attr.colorTextPrimaryInverse
            else -> R.attr.colorTextPrimary
        }
        setTitleTextColor(context.getThemeColor(themeColor))
    }

    fun setDefaultSubtitleTextColor(@BackgroundType type: Int = cachedDefaultBackgroundType) {
        val themeColor = when (type) {
            BackgroundType.TYPE_BOXED_INVERSE -> R.attr.colorTextPrimaryInverse
            else -> R.attr.colorTextPrimary
        }
        setSubtitleTextColor(context.getThemeColor(themeColor))
    }

    fun setDefaultDescriptionTextColor(@BackgroundType type: Int = cachedDefaultBackgroundType) {
        val themeColor = when (type) {
            BackgroundType.TYPE_BOXED_INVERSE -> R.attr.colorTextSecondaryInverse
            else -> R.attr.colorTextSecondary
        }
        setDescriptionTextColor(context.getThemeColor(themeColor))
    }

    fun setTitleTextColor(textColorOverride: Int) {
        titleTextView.setTextColor(textColorOverride)
    }

    fun setSubtitleTextColor(textColorOverride: Int) {
        subtitleTextView.setTextColor(textColorOverride)
    }

    fun setDescriptionTextColor(textColorOverride: Int) {
        descriptionTextView.setTextColor(textColorOverride)
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
                val view = LayoutInflater.from(context).inflate(layoutRes, headlineContainer, true)
                println("Fernaa - " + view.contentDescription)
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

    fun setSubtitleMaxLines(maxLines: Int) {
        if (maxLines > 0) {
            subtitleTextView.maxLines = maxLines
            subtitleTextView.ellipsize = TextUtils.TruncateAt.END
        }
    }

    fun setDescription(text: CharSequence?) {
        descriptionTextView.setTextAndVisibility(text)
        recalculateTitleBottomConstraints()
        recalculateAssetPosition()
    }

    fun setDescriptionMaxLines(maxLines: Int) {
        if (maxLines > 0) {
            descriptionTextView.maxLines = maxLines
            descriptionTextView.ellipsize = TextUtils.TruncateAt.END
        }
    }

    open fun setActionLayout(@LayoutRes layoutRes: Int = ACTION_NONE) {
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

    open fun getActionView(): View? =
        actionContainer.getChildAt(0)

    override fun setEnabled(enabled: Boolean) {
        super.setEnabled(enabled)
        titleTextView.isEnabled = enabled
        descriptionTextView.isEnabled = enabled
        getActionView()?.isEnabled = enabled
        setAlpha(enabled)
    }

    fun delegateClickOnActionView() {
        setOnClickListener {
            getActionView()?.performClick()
        }
    }

    private fun showNonNumericBadge(withBadgeDescription: String?) {
        Badge.removeBadge(badgeAnchor)
        badgeAnchorContainer.visibility = View.VISIBLE
        Badge.showBadgeIn(badgeAnchor, badgeAnchorContainer, withBadgeDescription)
    }

    private fun showNumericBadge(count: Int, withBadgeDescription: String?) {
        Badge.removeBadge(badgeAnchor)
        badgeAnchorContainer.visibility = View.VISIBLE
        badgeAnchorContainer.setBackgroundColor(Color.Transparent.toArgb())
        Badge.showNumericBadgeIn(badgeAnchor, badgeAnchorContainer, count, withBadgeDescription)
    }

    private fun hideBadge() {
        Badge.removeBadge(badgeAnchor)
        badgeAnchorContainer.visibility = GONE
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

    private fun ImageView.setSize(dpWidth: Int, dpHeight: Int) {
        val pxWidth: Int = context.convertDpToPx(dpWidth)
        val pxHeight: Int = context.convertDpToPx(dpHeight)
        layoutParams.apply {
            height = pxHeight
            width = pxWidth
            layoutParams = this
        }
    }

    private fun ImageView.setSizePx(pxWidth: Float, pxHeight: Float) {
        layoutParams.apply {
            height = pxHeight.toInt()
            width = pxWidth.toInt()
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
        private const val UNDEFINED = -1f
        const val ACTION_NONE = -1
        const val HEADLINE_NONE = -1
        const val TYPE_IMAGE = 0
        const val TYPE_SMALL_ICON = 1
        const val TYPE_LARGE_ICON = 2
        const val TYPE_IMAGE_1_1 = 3
        const val TYPE_IMAGE_7_10 = 4
        const val TYPE_IMAGE_16_9 = 5
        const val TYPE_IMAGE_ROUNDED = 6

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
