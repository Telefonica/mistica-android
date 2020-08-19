package com.telefonica.mistica.highlightedcard

import android.content.Context
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.ColorInt
import androidx.annotation.DrawableRes
import androidx.annotation.IntDef
import androidx.annotation.StringRes
import androidx.appcompat.content.res.AppCompatResources
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.graphics.drawable.DrawableCompat
import androidx.databinding.BindingMethod
import androidx.databinding.BindingMethods
import com.telefonica.mistica.R
import com.telefonica.mistica.util.getThemeColor

@BindingMethods(
    BindingMethod(
        type = HighlightedCardView::class,
        attribute = "highlightedCardBackground",
        method = "setCustomBackground"
    ),
    BindingMethod(
        type = HighlightedCardView::class,
        attribute = "highlightedCardInverse",
        method = "setInverse"
    ),
    BindingMethod(
        type = HighlightedCardView::class,
        attribute = "highlightedCardTitle",
        method = "setTitle"
    ),
    BindingMethod(
        type = HighlightedCardView::class,
        attribute = "highlightedCardContent",
        method = "setContent"
    ),
    BindingMethod(
        type = HighlightedCardView::class,
        attribute = "highlightedCardButtonStyle",
        method = "setButtonStyle"
    ),
    BindingMethod(
        type = HighlightedCardView::class,
        attribute = "highlightedCardImage",
        method = "setImage"
    ),
    BindingMethod(
        type = HighlightedCardView::class,
        attribute = "highlightedCardButton",
        method = "setButtonText"
    ),
    BindingMethod(
        type = HighlightedCardView::class,
        attribute = "highlightedCardImageVisibility",
        method = "setImageVisibility"
    ),
    BindingMethod(
        type = HighlightedCardView::class,
        attribute = "highlightedCardCloseButtonVisibility",
        method = "setCloseVisibility"
    ),
    BindingMethod(
        type = HighlightedCardView::class,
        attribute = "highlightedCardButtonOnClick",
        method = "setButtonOnClick"
    ),
    BindingMethod(
        type = HighlightedCardView::class,
        attribute = "highlightedCardCloseButtonOnClick",
        method = "setCloseButtonOnClick"
    )
)
class HighlightedCardView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
    defStyleRes: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {

    @Retention(AnnotationRetention.SOURCE)
    @IntDef(
        BUTTON_STYLE_PRIMARY,
        BUTTON_STYLE_SECONDARY,
        BUTTON_STYLE_LINK,
        BUTTON_STYLE_NO_BUTTON
    )
    annotation class ButtonStyle

    private val titleTextView: TextView
    private val contentTextView: TextView
    private val image: ImageView
    private val closeButton: ImageView
    private val container: ConstraintLayout

    private var button: Button?
    private var buttonClickListener: OnClickListener? = null
    private var buttonText: String? = null

    private var isInverse: Boolean = false
    private var hasCustomBackground: Boolean = false
    private var buttonStyle: Int = BUTTON_STYLE_NO_BUTTON

    init {
        LayoutInflater.from(context).inflate(R.layout.highlighted_card_view, this, true)

        titleTextView = findViewById(R.id.highlighted_card_title)
        contentTextView = findViewById(R.id.highlighted_card_content)
        button = findViewById(R.id.highlighted_card_button_primary)
        image = findViewById(R.id.highlighted_card_image)
        closeButton = findViewById(R.id.highlighted_card_close_button)
        container = findViewById(R.id.highlighted_card_container)

        if (attrs != null) {
            val styledAttrs =
                context.theme.obtainStyledAttributes(
                    attrs,
                    R.styleable.HighlightedCardView,
                    defStyleAttr,
                    0
                )

            styledAttrs.getDrawable(R.styleable.HighlightedCardView_highlightedCardBackground)
                ?.let { setBackground(it) }


            isInverse = styledAttrs.getBoolean(
                R.styleable.HighlightedCardView_highlightedCardInverse,
                false
            )
            titleTextView.setTextAndVisibility(styledAttrs.getText(R.styleable.HighlightedCardView_highlightedCardTitle))
            contentTextView.setTextAndVisibility(styledAttrs.getText(R.styleable.HighlightedCardView_highlightedCardContent))
            buttonText = styledAttrs.getText(R.styleable.HighlightedCardView_highlightedCardButton)?.toString()
            button?.setTextAndVisibility(buttonText)
            buttonStyle = styledAttrs.getInt(
                R.styleable.HighlightedCardView_highlightedCardButtonStyle,
                BUTTON_STYLE_NO_BUTTON
            )

            setCloseVisibility(
                styledAttrs.getBoolean(
                    R.styleable.HighlightedCardView_highlightedCardCloseButtonVisibility,
                    false
                )
            )
            styledAttrs.getDrawable(R.styleable.HighlightedCardView_highlightedCardImage)
                ?.let { setImage(it) }

            styledAttrs.recycle()
        }
        configureBackground()
        configureColors()
    }

    fun setButtonOnClick(onClickListener: OnClickListener?) {
        this.buttonClickListener = onClickListener
        button?.setOnClickListener(onClickListener)
    }

    fun setCloseButtonOnClick(onClickListener: OnClickListener?) {
        this.closeButton.setOnClickListener(onClickListener)
    }

    fun setTitle(text: CharSequence) {
        titleTextView.setTextAndVisibility(text)
    }

    fun setTitle(@StringRes textRes: Int) {
        textRes?.let { setTitle(context.getString(it)) }
    }

    fun setContent(text: CharSequence) {
        contentTextView.setTextAndVisibility(text)
    }

    fun setContent(@StringRes textRes: Int) {
        textRes?.let { setContent(context.getString(it)) }
    }

    fun setButtonText(text: CharSequence?) {
        text?.let { buttonText = it.toString() }
        configureButton()
    }

    fun setButtonText(@StringRes textRes: Int?) {
        textRes?.let { setButtonText(context.getString(it)) }
    }

    fun setButtonStyle(@ButtonStyle buttonStyle: Int) {
        this.buttonStyle = buttonStyle
        configureButton()
    }

    fun setInverse(inverse: Boolean) {
        isInverse = inverse
        reload()
    }

    fun setImage(@DrawableRes imageRes: Int) {
        image.setImageResource(imageRes)
        image.visibility = View.VISIBLE
    }

    fun setImage(imageRes: Drawable) {
        image.setImageDrawable(imageRes)
        image.visibility = View.VISIBLE
    }

    fun setCustomBackground(@DrawableRes imageRes: Int) {
        setCustomBackground(context.getDrawable(imageRes)!!)
    }

    fun setCustomBackground(drawable: Drawable) {
        container.background = drawable
        hasCustomBackground = true
    }

    fun disableCustomBackground() {
        hasCustomBackground = false
        configureBackground()
    }

    fun hideImage() {
        image.visibility = View.GONE
    }

    fun setCloseVisibility(visible: Boolean) {
        closeButton.visibility = if (visible) View.VISIBLE else View.GONE
    }

    private fun configureColors() {
        @ColorInt val primaryColor: Int =
            context.getThemeColor(if (isInverse) R.attr.colorTextPrimaryInverse else R.attr.colorTextPrimary)

        titleTextView.setTextColor(primaryColor)
        contentTextView.setTextColor(primaryColor)
        closeButton.setCrossColor(primaryColor)
    }

    private fun configureBackground() {
        if (!hasCustomBackground) {
            val backgroundDrawable = if (isInverse) {
                R.drawable.highlighted_card_background_inverse
            } else {
                R.drawable.highlighted_card_background
            }
            container.background = context.getDrawable(backgroundDrawable)
        }
    }

    private fun reload() {
        configureButton()
        configureBackground()
        configureColors()
    }

    private fun configureButton() {
        val button: Button? = when (buttonStyle) {
            BUTTON_STYLE_PRIMARY -> findViewById(if (isInverse) R.id.highlighted_card_button_primary_inverse else R.id.highlighted_card_button_primary)
            BUTTON_STYLE_SECONDARY -> findViewById(if (isInverse) R.id.highlighted_card_button_secondary_inverse else R.id.highlighted_card_button_secondary)
            BUTTON_STYLE_LINK -> findViewById(if (isInverse) R.id.highlighted_card_button_link_inverse else R.id.highlighted_card_button_link)
            else -> null
        }

        if (this.button != button) {
            button?.setOnClickListener(buttonClickListener)
            button?.text = buttonText
            button?.visibility = View.VISIBLE
            this.button?.visibility = View.GONE
            this.button = button
        }
    }

    private fun TextView.setTextAndVisibility(newText: CharSequence?) {
        if (newText?.isNotBlank() == true) {
            text = newText
            visibility = View.VISIBLE
        } else {
            visibility = View.GONE
        }
    }

    private fun ImageView.setCrossColor(@ColorInt color: Int) {
        val unwrappedDrawable =
            AppCompatResources.getDrawable(context, R.drawable.icn_cross_highlight_card)!!
        val drawable = DrawableCompat.wrap(unwrappedDrawable)
        DrawableCompat.setTint(drawable, color)
        closeButton.setImageDrawable(drawable)
    }

    companion object {
        const val BUTTON_STYLE_PRIMARY = 0
        const val BUTTON_STYLE_SECONDARY = 1
        const val BUTTON_STYLE_LINK = 2
        const val BUTTON_STYLE_NO_BUTTON = 3
    }
}
