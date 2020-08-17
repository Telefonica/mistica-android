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
import androidx.annotation.StringRes
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.databinding.BindingMethod
import androidx.databinding.BindingMethods
import com.telefonica.mistica.R
import com.telefonica.mistica.util.getThemeColor

@BindingMethods(
    BindingMethod(
        type = HighlightedCardView::class,
        attribute = "highlightedCardInverse",
        method = "setInverse"
    ),
    BindingMethod(
        type = HighlightedCardView::class,
        attribute = "highlightedCardButtonOnClick",
        method = "setButtonOnClick"
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
        attribute = "highlightedCardImageVisibility",
        method = "setImageVisibility"
    )
)
class HighlightedCardView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
    defStyleRes: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {

    enum class ButtonStyle {
        PRIMARY, SECONDARY, LINK, NO_BUTTON
    }

    private val titleTextView: TextView
    private val contentTextView: TextView
    private val image: ImageView
    private val closeButton: ImageView

    private var button: Button?
    private var buttonClickListener: OnClickListener? = null
    private var buttonText: String? = null

    private var isInverse: Boolean = false
    private var buttonStyle: ButtonStyle = ButtonStyle.NO_BUTTON

    init {
        LayoutInflater.from(context).inflate(R.layout.highlighted_card_view, this, true)

        titleTextView = findViewById(R.id.highlighted_card_title)
        contentTextView = findViewById(R.id.highlighted_card_content)
        button = findViewById(R.id.highlighted_card_button_primary)
        image = findViewById(R.id.highlighted_card_image)
        closeButton = findViewById(R.id.highlighted_card_close_button)

        if (attrs != null) {
            val styledAttrs =
                context.theme.obtainStyledAttributes(
                    attrs,
                    R.styleable.HighlightedCardView,
                    defStyleAttr,
                    0
                )

            titleTextView.setTextAndVisibility(styledAttrs.getText(R.styleable.HighlightedCardView_highlightedCardTitle))
            contentTextView.setTextAndVisibility(styledAttrs.getText(R.styleable.HighlightedCardView_highlightedCardContent))
            button?.setTextAndVisibility(styledAttrs.getText(R.styleable.HighlightedCardView_highlightedCardButton))

            val hasCloseButton = styledAttrs.getBoolean(
                R.styleable.HighlightedCardView_highlightedCardShowCloseAction,
                false
            )
            closeButton.visibility = if (hasCloseButton) View.VISIBLE else View.GONE

            styledAttrs.recycle()
        }
    }

    fun setTitle(text: CharSequence?) {
        titleTextView.setTextAndVisibility(text)
    }

    fun setTitle(@StringRes textRes: Int?) {
        textRes?.let { setTitle(context.getString(it)) }
    }

    fun setContent(text: CharSequence?) {
        contentTextView.setTextAndVisibility(text)
    }

    fun setContent(@StringRes textRes: Int?) {
        textRes?.let { setContent(context.getString(it)) }
    }

    fun setButtonText(text: CharSequence?) {
        text?.let { buttonText = it.toString() }
        reconfigureButton()
    }

    fun setButtonText(@StringRes textRes: Int?) {
        textRes?.let { setButtonText(context.getString(it)) }
    }

    fun setActionButtonOnClick(onClickListener: OnClickListener?) {
        buttonClickListener = onClickListener
        button?.setOnClickListener(onClickListener)
    }

    fun setButtonStyle(buttonStyle: ButtonStyle) {
        this.buttonStyle = buttonStyle
        reconfigureButton()
    }

    fun setInverse(inverse: Boolean) {
        isInverse = inverse
        reconfigureButton()
        configureTextsColors()
    }

    fun setImage(@DrawableRes imageRes: Int) {
        image.setImageResource(imageRes)
        image.visibility = View.VISIBLE
    }

    fun setImage(imageRes: Drawable) {
        image.setImageDrawable(imageRes)
        image.visibility = View.VISIBLE
    }

    fun setImageVisibility(visible: Boolean) {
        image.visibility = if (visible) View.VISIBLE else View.GONE
    }

    private fun configureTextsColors() {
        val backgroundDrawable = if (isInverse) {
            R.drawable.highlighted_card_background_inverse
        } else {
            R.drawable.highlighted_card_background
        }
        findViewById<ConstraintLayout>(R.id.highlighted_card_container).background = context.getDrawable(backgroundDrawable)

        @ColorInt val primaryColor: Int =
            context.getThemeColor(if (isInverse) R.attr.colorTextPrimaryInverse else R.attr.colorTextPrimary)

        titleTextView.setTextColor(primaryColor)
        contentTextView.setTextColor(primaryColor)
    }

    private fun reconfigureButton() {
        val button: Button? = when (buttonStyle) {
            ButtonStyle.PRIMARY -> findViewById(if (isInverse) R.id.highlighted_card_button_primary_inverse else R.id.highlighted_card_button_primary)
            ButtonStyle.SECONDARY -> findViewById(if (isInverse) R.id.highlighted_card_button_secondary_inverse else R.id.highlighted_card_button_secondary)
            ButtonStyle.LINK -> findViewById(if (isInverse) R.id.highlighted_card_button_link_inverse else R.id.highlighted_card_button_link)
            ButtonStyle.NO_BUTTON -> null
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
}
