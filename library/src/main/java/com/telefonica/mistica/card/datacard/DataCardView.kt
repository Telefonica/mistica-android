package com.telefonica.mistica.card.datacard

import android.content.Context
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.cardview.widget.CardView
import androidx.databinding.BindingMethod
import androidx.databinding.BindingMethods
import com.telefonica.mistica.R
import com.telefonica.mistica.card.CardActionsView
import com.telefonica.mistica.card.CardContentView

@BindingMethods(
    BindingMethod(
        type = DataCardView::class,
        attribute = "dataCardImageDrawable",
        method = "setCardIcon"
    ),
    BindingMethod(
        type = DataCardView::class,
        attribute = "dataCardTag",
        method = "setTag"
    ),
    BindingMethod(
        type = DataCardView::class,
        attribute = "dataCardTitle",
        method = "setTitle"
    ),
    BindingMethod(
        type = DataCardView::class,
        attribute = "dataCardSubtitle",
        method = "setSubtitle"
    ),
    BindingMethod(
        type = DataCardView::class,
        attribute = "dataCardDescription",
        method = "setDescription"
    ),
    BindingMethod(
        type = DataCardView::class,
        attribute = "dataCardPrimaryButtonText",
        method = "setPrimaryButtonText"
    ),
    BindingMethod(
        type = DataCardView::class,
        attribute = "dataCardLinkButtonText",
        method = "setLinkButtonText"
    ),
    BindingMethod(
        type = DataCardView::class,
        attribute = "dataCardPrimaryButtonOnClick",
        method = "setPrimaryButtonOnClick"
    ),
    BindingMethod(
        type = DataCardView::class,
        attribute = "dataCardLinkButtonOnClick",
        method = "setLinkButtonOnClick"
    )
)
class DataCardView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : CardView(context, attrs, defStyleAttr) {

    private val iconImageView: ImageView
    private val cardContentView: CardContentView
    private val cardCustomContentLayout: LinearLayout
    private val cardActionsView: CardActionsView

    init {
        LayoutInflater.from(context).inflate(R.layout.data_card_view, this, true)
        isClickable = true
        isFocusable = true
        cardElevation = 0F
        radius = resources.getDimension(R.dimen.data_card_corner_radius)

        iconImageView = findViewById(R.id.data_card_icon)
        cardContentView = findViewById(R.id.data_card_content)
        cardCustomContentLayout = findViewById(R.id.card_custom_content_layout)
        cardActionsView = findViewById(R.id.data_card_actions)

        if (attrs != null) {
            val styledAttrs =
                context.theme.obtainStyledAttributes(
                    attrs,
                    R.styleable.DataCardView,
                    defStyleAttr,
                    0
                )

            cardContentView.tagTextView.setTextAndVisibility(styledAttrs.getText(R.styleable.DataCardView_dataCardTag))
            cardContentView.titleTextView.setTextAndVisibility(styledAttrs.getText(R.styleable.DataCardView_dataCardTitle))
            cardContentView.subtitleTextView.setTextAndVisibility(styledAttrs.getText(R.styleable.DataCardView_dataCardSubtitle))
            cardContentView.descriptionTextView.setTextAndVisibility(styledAttrs.getText(R.styleable.DataCardView_dataCardDescription))

            cardActionsView.primaryButton.setTextAndVisibility(styledAttrs.getText(R.styleable.DataCardView_dataCardPrimaryButtonText))
            cardActionsView.linkButton.setTextAndVisibility(styledAttrs.getText(R.styleable.DataCardView_dataCardLinkButtonText))

            styledAttrs.getDrawable(R.styleable.DataCardView_dataCardIcon)
                ?.let { setIcon(it) }

            setCardRipple(shouldShowRippleOnClick())
            styledAttrs.recycle()
        }
    }

    fun setIcon(icon: Drawable) {
        iconImageView.setImageDrawable(icon)
        iconImageView.visibility = View.VISIBLE
    }

    fun setIcon(@DrawableRes iconRes: Int) {
        iconImageView.setImageResource(iconRes)
        iconImageView.visibility = View.VISIBLE
    }

    fun removeIcon() {
        iconImageView.visibility = View.GONE
    }

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

    fun setSubtitle(text: CharSequence?) {
        cardContentView.subtitleTextView.setTextAndVisibility(text)
    }

    fun setSubtitle(@StringRes textRes: Int?) {
        textRes?.let { setSubtitle(context.getString(it)) }
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

    fun setDataCardAdditionalContent(content: View?) {
        if (content == null) {
            cardCustomContentLayout.removeAllViews()
            return
        }
        cardCustomContentLayout.addView(content)
    }

    private fun shouldShowRippleOnClick(): Boolean = cardActionsView.cardHasNoActions()

    private fun TextView.setTextAndVisibility(newText: CharSequence?) {
        if (newText?.isNotBlank() == true) {
            text = newText
            visibility = VISIBLE
        } else {
            visibility = GONE
        }
    }

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