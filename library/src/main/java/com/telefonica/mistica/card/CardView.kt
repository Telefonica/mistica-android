package com.telefonica.mistica.card

import android.content.Context
import android.util.AttributeSet
import android.util.TypedValue
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import androidx.annotation.StringRes
import androidx.cardview.widget.CardView
import androidx.databinding.BindingMethod
import androidx.databinding.BindingMethods
import com.telefonica.mistica.R

@BindingMethods(
    BindingMethod(
        type = CardView::class,
        attribute = "cardTag",
        method = "setTag"
    ),
    BindingMethod(
        type = CardView::class,
        attribute = "cardTitle",
        method = "setTitle"
    ),
    BindingMethod(
        type = CardView::class,
        attribute = "cardDescription",
        method = "setDescription"
    ),
    BindingMethod(
        type = CardView::class,
        attribute = "cardPrimaryButtonText",
        method = "setPrimaryButtonText"
    ),
    BindingMethod(
        type = CardView::class,
        attribute = "cardLinkButtonText",
        method = "setLinkButtonText"
    ),
    BindingMethod(
        type = CardView::class,
        attribute = "cardPrimaryButtonOnClick",
        method = "setPrimaryButtonOnClick"
    ),
    BindingMethod(
        type = CardView::class,
        attribute = "cardLinkButtonOnClick",
        method = "setLinkButtonOnClick"
    )
)
abstract class CardView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : CardView(context, attrs, defStyleAttr) {


    protected val cardContentView: CardContentView
    private val cardCustomContentLayout: LinearLayout
    private val cardActionsView: CardActionsView

    init {
        val rootView = handleAttrsAndInflateLayout(attrs, defStyleAttr, defStyleAttr)

        isClickable = true
        isFocusable = true
        cardElevation = 0F
        radius = resources.getDimension(R.dimen.card_corner_radius)
        minimumWidth = resources.getDimension(R.dimen.card_min_width).toInt()

        cardContentView = rootView.findViewById(R.id.card_content)
        cardCustomContentLayout = rootView.findViewById(R.id.card_custom_content_layout)
        cardActionsView = rootView.findViewById(R.id.card_actions)

        if (attrs != null) {
            val styledAttrs =
                context.theme.obtainStyledAttributes(
                    attrs,
                    R.styleable.CardView,
                    defStyleAttr,
                    0
                )

            setTag(styledAttrs.getText(R.styleable.CardView_cardTag))
            setTitle(styledAttrs.getText(R.styleable.CardView_cardTitle))
            setDescription(styledAttrs.getText(R.styleable.CardView_cardDescription))

            setPrimaryButtonText(styledAttrs.getText(R.styleable.CardView_cardPrimaryButtonText))
            setLinkButtonText(styledAttrs.getText(R.styleable.CardView_cardLinkButtonText))

            styledAttrs.recycle()
        }

        setCardRipple(shouldShowRippleOnClick())
    }

    abstract fun handleAttrsAndInflateLayout(
        attrs: AttributeSet? = null,
        defStyleAttr: Int = 0,
        defStyleRes: Int = 0
    ): View

    fun setTag(text: CharSequence?) {
        cardContentView.tagTextView.setTextAndVisibility(text)
    }

    fun setTag(@StringRes textRes: Int?) {
        textRes?.let { setTag(context.getString(it)) }
    }

    fun setTitle(text: CharSequence?) {
        cardContentView.titleTextView.setTextAndVisibility(text)
    }

    fun setTitle(@StringRes textRes: Int?) {
        textRes?.let { setTitle(context.getString(it)) }
    }

    fun setDescription(text: CharSequence?) {
        cardContentView.descriptionTextView.setTextAndVisibility(text)
    }

    fun setDescription(@StringRes textRes: Int?) {
        textRes?.let { setDescription(context.getString(it)) }
    }

    fun setPrimaryButtonText(text: CharSequence?) {
        cardActionsView.primaryButton.setTextAndVisibility(text)
    }

    fun setPrimaryButtonText(@StringRes textRes: Int?) {
        textRes?.let { setPrimaryButtonText(context.getString(it)) }
    }

    fun setLinkButtonText(text: CharSequence?) {
        cardActionsView.linkButton.setTextAndVisibility(text)
    }

    fun setLinkButtonText(@StringRes textRes: Int?) {
        textRes?.let { setLinkButtonText(context.getString(it)) }
    }

    fun setPrimaryButtonOnClick(onClickListener: OnClickListener?) {
        cardActionsView.primaryButton.setOnClickListener(onClickListener)
        setCardRipple(shouldShowRippleOnClick())
    }

    fun setLinkButtonOnClick(onClickListener: OnClickListener?) {
        cardActionsView.linkButton.setOnClickListener(onClickListener)
        setCardRipple(shouldShowRippleOnClick())
    }

    fun setCardAdditionalContent(content: View?) {
        cardCustomContentLayout.removeAllViews()
        if (content != null) {
            cardCustomContentLayout.addView(content)
        }
    }

    protected fun TextView.setTextAndVisibility(newText: CharSequence?) {
        if (newText?.isNotBlank() == true) {
            text = newText
            visibility = VISIBLE
        } else {
            visibility = GONE
        }
    }

    private fun shouldShowRippleOnClick(): Boolean = cardActionsView.cardHasNoActions()

    private fun CardView.setCardRipple(showRippleOnClick: Boolean) {
        foreground = if (showRippleOnClick) {
            val outValue = TypedValue()
            context.theme.resolveAttribute(android.R.attr.selectableItemBackground, outValue, true)
            resources.getDrawable(outValue.resourceId, context.theme)
        } else {
            null
        }
    }
}