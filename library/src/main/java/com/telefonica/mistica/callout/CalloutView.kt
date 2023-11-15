package com.telefonica.mistica.callout

import android.content.Context
import android.graphics.drawable.Drawable
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
        attribute = "calloutDescription",
        method = "setDescription",
    ),
    BindingMethod(
        type = CalloutView::class,
        attribute = "calloutIcon",
        method = "setIcon",
    ),
    BindingMethod(
        type = CalloutView::class,
        attribute = "calloutImage",
        method = "setImage",
    ),
    BindingMethod(
        type = CalloutView::class,
        attribute = "calloutCircularImage",
        method = "setCircularImage",
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
    private var image: ImageView
    private var circularImage: ShapeableImageView
    private var title: TextView
    private var description: TextView
    private var buttonsContainer: View
    private var primaryButton: Button
    private var secondaryButton: Button
    private var linkButton: Button
    private var closeButton: ImageView

    private var onDismissed: () -> Unit = NO_OP_CALLOUT_LISTENER

    init {
        LayoutInflater.from(context).inflate(R.layout.callout_view, this, true)

        icon = findViewById(R.id.callout_icon)
        icon.setColorFilter(context.getThemeColor(R.attr.colorNeutralHigh))
        image = findViewById(R.id.callout_image)
        circularImage = findViewById(R.id.data_card_circular_icon)
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
        var inverse = false

        if (attrs != null) {
            val styledAttrs = context.theme.obtainStyledAttributes(attrs, R.styleable.CalloutView, defStyleAttr, 0)

            styledAttrs.getResourceId(R.styleable.CalloutView_calloutIcon, TypedValue.TYPE_NULL)
                .takeIf { it != TypedValue.TYPE_NULL }
                ?.let { AppCompatResources.getDrawable(context, it) }
                ?.let { setIconDrawable(it) }

            styledAttrs.getString(R.styleable.CalloutView_calloutTitle)?.let { setTitle(it) }
            styledAttrs.getString(R.styleable.CalloutView_calloutDescription)?.let { setDescription(it) }

            buttonsConfig = styledAttrs.getInteger(R.styleable.CalloutView_calloutButtonsConfig, buttonsConfig)
            styledAttrs.getString(R.styleable.CalloutView_calloutPrimaryButtonText)?.let { setPrimaryButtonText(it) }
            styledAttrs.getString(R.styleable.CalloutView_calloutSecondaryButtonText)?.let { setSecondaryButtonText(it) }
            styledAttrs.getString(R.styleable.CalloutView_calloutLinkButtonText)?.let { setLinkButtonText(it) }

            dismissable = styledAttrs.getBoolean(R.styleable.CalloutView_calloutDismissable, false)
            inverse = styledAttrs.getBoolean(R.styleable.CalloutView_calloutInverse, false)

            styledAttrs.recycle()
        }

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

    fun setIcon(@DrawableRes iconRes: Int?) {
        if (iconRes != null) {
            setImageConfig(CalloutViewImageConfig.IMAGE_CONFIG_ICON)
            icon.setImageResource(iconRes)
        } else {
            icon.visibility = GONE
        }
    }

    fun setImage(@DrawableRes imageRes: Int?) {
        if (imageRes != null) {
            setImageConfig(CalloutViewImageConfig.IMAGE_CONFIG_SQUARE)
            image.setImageResource(imageRes)
        } else {
            image.visibility = GONE
        }
    }

    fun setCircularImage(@DrawableRes imageRes: Int?) {
        if (imageRes != null) {
            setImageConfig(CalloutViewImageConfig.IMAGE_CONFIG_CIRCULAR)
            circularImage.setImageResource(imageRes)
        } else {
            circularImage.visibility = GONE
        }
    }

    fun setIconDrawable(drawable: Drawable) {
        icon.setImageDrawable(drawable)
        icon.visibility = VISIBLE
    }

    fun setTitle(text: String) {
        if (text.isNotBlank()) {
            title.text = text
            title.visibility = VISIBLE
        } else {
            title.visibility = GONE
        }
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
        if (buttonsConfig == BUTTONS_CONFIG_NONE) {
            buttonsContainer.visibility = GONE
            return
        }
        buttonsContainer.visibility = VISIBLE

        when (buttonsConfig) {
            BUTTONS_CONFIG_PRIMARY -> {
                primaryButton.visibility = VISIBLE
                secondaryButton.visibility = GONE
                linkButton.visibility = GONE
            }
            BUTTONS_CONFIG_PRIMARY_LINK -> {
                primaryButton.visibility = VISIBLE
                secondaryButton.visibility = GONE
                linkButton.visibility = VISIBLE
                linkButton.layoutParams = marginStart(0f)
            }
            BUTTONS_CONFIG_PRIMARY_SECONDARY -> {
                primaryButton.visibility = VISIBLE
                secondaryButton.visibility = VISIBLE
                linkButton.visibility = GONE
            }
            BUTTONS_CONFIG_SECONDARY -> {
                primaryButton.visibility = GONE
                secondaryButton.visibility = VISIBLE
                linkButton.visibility = GONE
            }
            BUTTONS_CONFIG_SECONDARY_LINK -> {
                primaryButton.visibility = GONE
                secondaryButton.visibility = VISIBLE
                linkButton.visibility = VISIBLE
                linkButton.layoutParams = marginStart(0f)
            }
            BUTTONS_CONFIG_LINK -> {
                primaryButton.visibility = GONE
                secondaryButton.visibility = GONE
                linkButton.visibility = VISIBLE
                linkButton.layoutParams = marginStart(-8f)
            }
            BUTTONS_CONFIG_NONE -> {}
        }
    }

    private fun setImageConfig(imageConfig: CalloutViewImageConfig) {
        when (imageConfig) {
            CalloutViewImageConfig.IMAGE_CONFIG_NONE -> {
                icon.visibility = GONE
                image.visibility = GONE
                circularImage.visibility = GONE
            }
            CalloutViewImageConfig.IMAGE_CONFIG_ICON -> {
                icon.visibility = VISIBLE
                image.visibility = GONE
                circularImage.visibility = GONE
            }
            CalloutViewImageConfig.IMAGE_CONFIG_SQUARE -> {
                icon.visibility = GONE
                image.visibility = VISIBLE
                circularImage.visibility = GONE
            }
            CalloutViewImageConfig.IMAGE_CONFIG_CIRCULAR -> {
                icon.visibility = GONE
                image.visibility = GONE
                circularImage.visibility = VISIBLE
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

enum class CalloutViewImageConfig {
    IMAGE_CONFIG_NONE,
    IMAGE_CONFIG_ICON,
    IMAGE_CONFIG_SQUARE,
    IMAGE_CONFIG_CIRCULAR
}
