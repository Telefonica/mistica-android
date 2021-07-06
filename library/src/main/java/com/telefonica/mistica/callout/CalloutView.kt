package com.telefonica.mistica.callout

import android.content.Context
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.animation.AlphaAnimation
import android.view.animation.Animation
import android.view.animation.AnimationSet
import android.view.animation.PathInterpolator
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.DrawableRes
import androidx.annotation.IntDef
import androidx.databinding.BindingMethod
import androidx.databinding.BindingMethods
import com.telefonica.mistica.R
import com.telefonica.mistica.button.Button

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
        BUTTONS_CONFIG_EMPTY,
        BUTTONS_CONFIG_PRIMARY,
        BUTTONS_CONFIG_PRIMARY_LINK,
        BUTTONS_CONFIG_PRIMARY_SECONDARY,
        BUTTONS_CONFIG_SECONDARY,
        BUTTONS_CONFIG_SECONDARY_LINK,
    )
    annotation class ButtonsConfig

    private var icon: ImageView
    private var title: TextView
    private var description: TextView
    private var buttonsContainer: View
    private var primaryButton: Button
    private var secondaryButton: Button
    private var linkButton: Button
    private var closeButton: ImageView

    private var dismissable = false

    private var onCalloutDismissListener: OnCalloutDismissListener = object : OnCalloutDismissListener {
        override fun onDismissed() {

        }
    }

    init {
        LayoutInflater.from(context).inflate(R.layout.callout_view, this, true)

        icon = findViewById(R.id.callout_icon)
        title = findViewById(R.id.callout_title)
        description = findViewById(R.id.callout_description)
        buttonsContainer = findViewById(R.id.callout_buttons_container)
        primaryButton = findViewById(R.id.callout_primary_button)
        secondaryButton = findViewById(R.id.callout_secondary_button)
        linkButton = findViewById(R.id.callout_link_button)
        closeButton = findViewById(R.id.callout_close_button)

        @ButtonsConfig
        var buttonsConfig: Int = BUTTONS_CONFIG_PRIMARY

        if (attrs != null) {
            val styledAttrs = context.theme.obtainStyledAttributes(attrs, R.styleable.CalloutView, defStyleAttr, 0)

            styledAttrs.getDrawable(R.styleable.CalloutView_calloutIcon)?.let { setIconDrawable(it) }

            styledAttrs.getString(R.styleable.CalloutView_calloutTitle)?.let { setTitle(it) }
            styledAttrs.getString(R.styleable.CalloutView_calloutDescription)?.let { setDescription(it) }

            buttonsConfig = styledAttrs.getInteger(R.styleable.CalloutView_calloutButtonsConfig, buttonsConfig)
            styledAttrs.getString(R.styleable.CalloutView_calloutPrimaryButtonText)?.let { setPrimaryButtonText(it) }
            styledAttrs.getString(R.styleable.CalloutView_calloutSecondaryButtonText)?.let { setSecondaryButtonText(it) }
            styledAttrs.getString(R.styleable.CalloutView_calloutLinkButtonText)?.let { setLinkButtonText(it) }

            dismissable = styledAttrs.getBoolean(R.styleable.CalloutView_calloutDismissable, false)

            styledAttrs.recycle()
        }

        setButtonsConfig(buttonsConfig)
        setDismissable()
        initCloseButton()
    }

    private fun setDismissable() {
        closeButton.visibility = if (dismissable) VISIBLE else GONE
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
            interpolator = INTERPOLATOR
            duration = DURATION
            startAnimation(this)
            setAnimationListener(object : Animation.AnimationListener {
                override fun onAnimationStart(animation: Animation?) {

                }

                override fun onAnimationEnd(animation: Animation?) {
                    visibility = GONE
                }

                override fun onAnimationRepeat(animation: Animation?) {

                }
            })
        }
    }

    fun show() {
        visibility = VISIBLE
    }

    fun setOnDismiss(listener: OnCalloutDismissListener) {
        onCalloutDismissListener = listener
    }

    fun setIcon(@DrawableRes iconRes: Int) {
        icon.setImageResource(iconRes)
    }

    fun setIconDrawable(drawable: Drawable) {
        icon.setImageDrawable(drawable)
    }

    fun setTitle(text: String) {
        if (text.isNotEmpty()) {
            title.text = text
            title.visibility = VISIBLE
        } else {
            title.visibility = GONE
        }
    }

    fun setDescription(text: String) {
        if (text.isNotEmpty()) {
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
        if (buttonsConfig == BUTTONS_CONFIG_EMPTY) {
            buttonsContainer.visibility = GONE
            return
        }
        buttonsContainer.visibility = VISIBLE

        primaryButton.visibility = when (buttonsConfig) {
            BUTTONS_CONFIG_PRIMARY,
            BUTTONS_CONFIG_PRIMARY_LINK,
            BUTTONS_CONFIG_PRIMARY_SECONDARY,
            -> View.VISIBLE
            else -> GONE
        }
        secondaryButton.visibility = when (buttonsConfig) {
            BUTTONS_CONFIG_PRIMARY_SECONDARY,
            BUTTONS_CONFIG_SECONDARY,
            BUTTONS_CONFIG_SECONDARY_LINK,
            -> View.VISIBLE
            else -> GONE
        }
        linkButton.visibility = when (buttonsConfig) {
            BUTTONS_CONFIG_PRIMARY_LINK,
            BUTTONS_CONFIG_SECONDARY_LINK,
            BUTTONS_CONFIG_LINK,
            -> View.VISIBLE
            else -> GONE
        }
    }

    interface OnCalloutDismissListener {
        fun onDismissed()
    }

    companion object {
        const val BUTTONS_CONFIG_EMPTY = -1
        const val BUTTONS_CONFIG_PRIMARY = 0
        const val BUTTONS_CONFIG_PRIMARY_LINK = 1
        const val BUTTONS_CONFIG_PRIMARY_SECONDARY = 2
        const val BUTTONS_CONFIG_SECONDARY = 3
        const val BUTTONS_CONFIG_SECONDARY_LINK = 4
        const val BUTTONS_CONFIG_LINK = 5

        val INTERPOLATOR = PathInterpolator(0.77f, 0f, 0.175f, 1f)
        const val DURATION = 400L
    }
}
