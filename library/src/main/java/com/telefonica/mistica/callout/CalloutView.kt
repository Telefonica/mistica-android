package com.telefonica.mistica.callout

import android.content.Context
import android.util.AttributeSet
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.View
import android.view.animation.AlphaAnimation
import android.view.animation.Animation
import android.view.animation.AnimationSet
import android.view.animation.PathInterpolator
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.annotation.DrawableRes
import androidx.annotation.IntDef
import androidx.appcompat.content.res.AppCompatResources
import androidx.core.view.ViewCompat
import androidx.databinding.BindingMethod
import androidx.databinding.BindingMethods
import com.google.android.material.imageview.ShapeableImageView
import com.telefonica.mistica.R
import com.telefonica.mistica.button.Button
import com.telefonica.mistica.util.getThemeColor

@BindingMethods(
    BindingMethod(
        type = CalloutView::class,
        attribute = "calloutTitle",
        method = "setTitle",
    ),
    BindingMethod(
        type = CalloutView::class,
        attribute = "calloutTitleAsHeading",
        method = "setTitleAsHeading",
    ),
    BindingMethod(
        type = CalloutView::class,
        attribute = "calloutDescription",
        method = "setDescription",
    ),
    BindingMethod(
        type = CalloutView::class,
        attribute = "calloutAsset",
        method = "setAsset",
    ),
    BindingMethod(
        type = CalloutView::class,
        attribute = "calloutAssetType",
        method = "setAssetType",
    ),
    BindingMethod(
        type = CalloutView::class,
        attribute = "calloutButtonsConfig",
        method = "setButtonsConfig",
    ),
    BindingMethod(
        type = CalloutView::class,
        attribute = "calloutPrimaryButtonText",
        method = "setPrimaryButtonText",
    ),
    BindingMethod(
        type = CalloutView::class,
        attribute = "calloutPrimaryButtonOnClick",
        method = "setPrimaryButtonOnClick",
    ),
    BindingMethod(
        type = CalloutView::class,
        attribute = "calloutSecondaryButtonText",
        method = "setSecondaryButtonText",
    ),
    BindingMethod(
        type = CalloutView::class,
        attribute = "calloutSecondaryButtonOnClick",
        method = "setSecondaryButtonOnClick",
    ),
    BindingMethod(
        type = CalloutView::class,
        attribute = "calloutLinkButtonText",
        method = "setLinkButtonText",
    ),
    BindingMethod(
        type = CalloutView::class,
        attribute = "calloutLinkButtonOnClick",
        method = "setLinkButtonOnClick",
    ),
    BindingMethod(
        type = CalloutView::class,
        attribute = "calloutDismissable",
        method = "setDismissable",
    ),
    BindingMethod(
        type = CalloutView::class,
        attribute = "calloutOnDismiss",
        method = "setOnDismiss",
    ),
)
class CalloutView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
) : FrameLayout(context, attrs, defStyleAttr, defStyleAttr) {

    @Retention(AnnotationRetention.SOURCE)
    @IntDef(
        BUTTONS_CONFIG_NONE,
        BUTTONS_CONFIG_PRIMARY,
        BUTTONS_CONFIG_PRIMARY_LINK,
        BUTTONS_CONFIG_PRIMARY_SECONDARY,
        BUTTONS_CONFIG_SECONDARY,
        BUTTONS_CONFIG_SECONDARY_LINK,
        BUTTONS_CONFIG_LINK
    )
    annotation class ButtonsConfig

    private var icon: ImageView
    private var image: ShapeableImageView
    private var circularImage: ShapeableImageView
    private var title: TextView
    private var description: TextView
    private var buttonsContainer: View
    private var primaryButton: Button
    private var secondaryButton: Button
    private var linkButton: Button
    private var closeButton: ImageView
    private var asset: Int? = null
    private var assetType: CalloutViewImageConfig = CalloutViewImageConfig.ICON

    private var onDismissed: () -> Unit = NO_OP_CALLOUT_LISTENER

    init {
        LayoutInflater.from(context).inflate(R.layout.callout_view, this, true)

        icon = findViewById(R.id.callout_icon)
        icon.setColorFilter(context.getThemeColor(R.attr.colorNeutralHigh))
        image = findViewById(R.id.callout_image)
        circularImage = findViewById(R.id.callout_circular_image)
        title = findViewById(R.id.callout_title)
        description = findViewById(R.id.callout_description)
        buttonsContainer = findViewById(R.id.callout_buttons_container)
        primaryButton = findViewById(R.id.callout_primary_button)
        secondaryButton = findViewById(R.id.callout_secondary_button)
        linkButton = findViewById(R.id.callout_link_button)
        closeButton = findViewById(R.id.callout_close_button)

        @ButtonsConfig
        var buttonsConfig: Int = BUTTONS_CONFIG_PRIMARY
        var dismissable = false
        var titleAsHeading = true
        var inverse = false
        assetType = CalloutViewImageConfig.NONE

        if (attrs != null) {
            val styledAttrs = context.theme.obtainStyledAttributes(attrs, R.styleable.CalloutView, defStyleAttr, 0)

            titleAsHeading = styledAttrs.getBoolean(R.styleable.CalloutView_calloutTitleAsHeading, true)
            styledAttrs.getString(R.styleable.CalloutView_calloutTitle)?.let { setTitle(it) }
            styledAttrs.getString(R.styleable.CalloutView_calloutDescription)?.let { setDescription(it) }

            buttonsConfig = styledAttrs.getInteger(R.styleable.CalloutView_calloutButtonsConfig, buttonsConfig)
            styledAttrs.getString(R.styleable.CalloutView_calloutPrimaryButtonText)?.let { setPrimaryButtonText(it) }
            styledAttrs.getString(R.styleable.CalloutView_calloutSecondaryButtonText)?.let { setSecondaryButtonText(it) }
            styledAttrs.getString(R.styleable.CalloutView_calloutLinkButtonText)?.let { setLinkButtonText(it) }
            assetType = CalloutViewImageConfig.getConfigByValue(
                styledAttrs.getInteger(R.styleable.CalloutView_calloutAssetType, CalloutViewImageConfig.NONE.value)
            )
            styledAttrs.getResourceId(R.styleable.CalloutView_calloutAsset, TypedValue.TYPE_NULL).takeIf { it != TypedValue.TYPE_NULL }
                ?.let { setAsset(it) }

            dismissable = styledAttrs.getBoolean(R.styleable.CalloutView_calloutDismissable, false)
            inverse = styledAttrs.getBoolean(R.styleable.CalloutView_calloutInverse, false)

            styledAttrs.recycle()
        }

        setTitleAsHeading(titleAsHeading)
        setButtonsConfig(buttonsConfig)
        setDismissable(dismissable)
        setInverse(inverse)
        initCloseButton()
    }

    fun setDismissable(dismissable: Boolean) {
        closeButton.visibility = if (dismissable) VISIBLE else GONE
    }

    fun setInverse(inverse: Boolean) {
        val backgroundDrawable = if (inverse) R.drawable.bg_callout_inverse else R.drawable.bg_callout
        background = AppCompatResources.getDrawable(context, backgroundDrawable)
    }

    private fun initCloseButton() {
        closeButton.setOnClickListener {
            hide()
        }
    }

    private fun hide() {
        val alphaAnimation = AlphaAnimation(1f, 0f)
        AnimationSet(true).run {
            addAnimation(alphaAnimation)
            interpolator = ANIMATION_INTERPOLATOR
            duration = ANIMATION_DURATION
            startAnimation(this)
            setAnimationListener(object : Animation.AnimationListener {
                override fun onAnimationStart(animation: Animation?) {

                }

                override fun onAnimationEnd(animation: Animation?) {
                    onDismissed()
                    visibility = GONE
                }

                override fun onAnimationRepeat(animation: Animation?) {

                }
            })
        }
    }

    fun setOnDismiss(listener: () -> Unit) {
        onDismissed = listener
    }

    fun setAsset(@DrawableRes assetRes: Int?) {
        asset = assetRes
        if (assetRes != null) {
            when (assetType) {
                CalloutViewImageConfig.NONE -> noAsset()
                CalloutViewImageConfig.ICON -> {
                    icon.setImageResource(assetRes)
                    icon.visibility = VISIBLE
                    image.visibility = GONE
                    circularImage.visibility = GONE
                }
                CalloutViewImageConfig.SQUARE_IMAGE -> {
                    image.setImageResource(assetRes)
                    image.visibility = VISIBLE
                    icon.visibility = GONE
                    circularImage.visibility = GONE
                }
                CalloutViewImageConfig.CIRCULAR_IMAGE -> {
                    circularImage.setImageResource(assetRes)
                    circularImage.visibility = VISIBLE
                    icon.visibility = GONE
                    image.visibility = GONE
                }
            }
        } else {
            noAsset()
        }
    }

    fun setAssetType(value: CalloutViewImageConfig) {
        assetType = value
        setAsset(asset)
    }

    private fun noAsset() {
        icon.visibility = GONE
        image.visibility = GONE
        circularImage.visibility = GONE
    }

    fun setTitle(text: String) {
        if (text.isNotBlank()) {
            title.text = text
            title.visibility = VISIBLE
        } else {
            title.visibility = GONE
        }
    }

    fun setTitleAsHeading(value: Boolean) {
        ViewCompat.setAccessibilityHeading(title, value)
    }

    fun setDescription(text: String) {
        if (text.isNotBlank()) {
            description.text = text
            description.visibility = VISIBLE
        } else {
            description.visibility = GONE
        }
    }

    fun setPrimaryButtonText(text: String) {
        primaryButton.text = text
    }

    fun setPrimaryButtonOnClick(clickListener: OnClickListener) {
        primaryButton.setOnClickListener(clickListener)
    }

    fun setSecondaryButtonText(text: String) {
        secondaryButton.text = text
    }

    fun setSecondaryButtonOnClick(clickListener: OnClickListener) {
        secondaryButton.setOnClickListener(clickListener)
    }

    fun setLinkButtonText(text: String) {
        linkButton.text = text
    }

    fun setLinkButtonOnClick(clickListener: OnClickListener) {
        linkButton.setOnClickListener(clickListener)
    }

    fun setButtonsConfig(@ButtonsConfig buttonsConfig: Int) {
        buttonsContainer.visibility = VISIBLE

        when (buttonsConfig) {
            BUTTONS_CONFIG_NONE -> {
                buttonsContainer.visibility = GONE
                closeButton.accessibilityTraversalAfter = description.id
            }

            BUTTONS_CONFIG_PRIMARY -> {
                primaryButton.visibility = VISIBLE
                secondaryButton.visibility = GONE
                linkButton.visibility = GONE
                closeButton.accessibilityTraversalAfter = primaryButton.id
            }

            BUTTONS_CONFIG_PRIMARY_LINK -> {
                primaryButton.visibility = VISIBLE
                secondaryButton.visibility = GONE
                linkButton.visibility = VISIBLE
                linkButton.layoutParams = marginStart(0f)
                closeButton.accessibilityTraversalAfter = linkButton.id
            }

            BUTTONS_CONFIG_PRIMARY_SECONDARY -> {
                primaryButton.visibility = VISIBLE
                secondaryButton.visibility = VISIBLE
                linkButton.visibility = GONE
                closeButton.accessibilityTraversalAfter = secondaryButton.id
            }

            BUTTONS_CONFIG_SECONDARY -> {
                primaryButton.visibility = GONE
                secondaryButton.visibility = VISIBLE
                linkButton.visibility = GONE
                closeButton.accessibilityTraversalAfter = secondaryButton.id
            }

            BUTTONS_CONFIG_SECONDARY_LINK -> {
                primaryButton.visibility = GONE
                secondaryButton.visibility = VISIBLE
                linkButton.visibility = VISIBLE
                linkButton.layoutParams = marginStart(0f)
                closeButton.accessibilityTraversalAfter = linkButton.id
            }

            BUTTONS_CONFIG_LINK -> {
                primaryButton.visibility = GONE
                secondaryButton.visibility = GONE
                linkButton.visibility = VISIBLE
                linkButton.layoutParams = marginStart(-8f)
                closeButton.accessibilityTraversalAfter = linkButton.id
            }
        }
    }

    private fun marginStart(value: Float): LinearLayout.LayoutParams {
        val layoutParams = LinearLayout.LayoutParams(
            LinearLayout.LayoutParams.WRAP_CONTENT,
            LinearLayout.LayoutParams.WRAP_CONTENT
        )
        layoutParams.marginStart = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, value, resources.displayMetrics).toInt()
        return layoutParams
    }

    companion object {
        const val BUTTONS_CONFIG_NONE = -1
        const val BUTTONS_CONFIG_PRIMARY = 0
        const val BUTTONS_CONFIG_PRIMARY_LINK = 1
        const val BUTTONS_CONFIG_PRIMARY_SECONDARY = 2
        const val BUTTONS_CONFIG_SECONDARY = 3
        const val BUTTONS_CONFIG_SECONDARY_LINK = 4
        const val BUTTONS_CONFIG_LINK = 5

        val NO_OP_CALLOUT_LISTENER = {}
        val ANIMATION_INTERPOLATOR = PathInterpolator(0.77f, 0f, 0.175f, 1f)
        const val ANIMATION_DURATION = 400L
    }
}

enum class CalloutViewImageConfig(val value: Int) {
    NONE(-1),
    ICON(0),
    SQUARE_IMAGE(1),
    CIRCULAR_IMAGE(2);

    companion object {
        fun getConfigByValue(item: Int): CalloutViewImageConfig {
            return values().firstOrNull { it.value == item } ?: NONE
        }
    }
}
