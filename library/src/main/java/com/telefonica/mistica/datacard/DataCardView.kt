package com.telefonica.mistica.datacard

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
import com.telefonica.mistica.button.Button

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
    ),
    BindingMethod(
        type = DataCardView::class,
        attribute = "dataCardOnClick",
        method = "setDataCardOnClick"
    )
)
class DataCardView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : CardView(context, attrs, defStyleAttr) {

    private val iconImageView: ImageView
    private val tagTextView: TextView
    private val titleTextView: TextView
    private val subtitleTextView: TextView
    private val descriptionTextView: TextView
    private val primaryButton: Button
    private val linkButton: Button
    private val additionalContentLayout: LinearLayout

    init {
        LayoutInflater.from(context).inflate(R.layout.data_card_view, this, true)
        isClickable = true
        isFocusable = true
        cardElevation = 0F
        radius = resources.getDimension(R.dimen.data_card_corner_radius)

        iconImageView = findViewById(R.id.data_card_icon)
        tagTextView = findViewById(R.id.data_card_tag)
        titleTextView = findViewById(R.id.data_card_title)
        subtitleTextView = findViewById(R.id.data_card_subtitle)
        descriptionTextView = findViewById(R.id.data_card_description)
        primaryButton = findViewById(R.id.data_card_primary_button)
        linkButton = findViewById(R.id.data_card_link_button)
        additionalContentLayout = findViewById(R.id.data_card_custom_content_layout)

        if (attrs != null) {
            val styledAttrs =
                context.theme.obtainStyledAttributes(
                    attrs,
                    R.styleable.DataCardView,
                    defStyleAttr,
                    0
                )

            tagTextView.setTextAndVisibility(styledAttrs.getText(R.styleable.DataCardView_dataCardTag))
            titleTextView.setTextAndVisibility(styledAttrs.getText(R.styleable.DataCardView_dataCardTitle))
            subtitleTextView.setTextAndVisibility(styledAttrs.getText(R.styleable.DataCardView_dataCardSubtitle))
            descriptionTextView.setTextAndVisibility(styledAttrs.getText(R.styleable.DataCardView_dataCardDescription))
            primaryButton.setTextAndVisibility(styledAttrs.getText(R.styleable.DataCardView_dataCardPrimaryButtonText))
            linkButton.setTextAndVisibility(styledAttrs.getText(R.styleable.DataCardView_dataCardLinkButtonText))

            styledAttrs.getDrawable(R.styleable.DataCardView_dataCardIcon)
                ?.let { setIcon(it) }

            setCardRipple(shouldShowRippleOnClick())
            styledAttrs.recycle()
        }
    }

    fun setIcon(icon: Drawable) {
        iconImageView.setImageDrawable(icon)
    }

    fun setIcon(@DrawableRes iconRes: Int) {
        iconImageView.setImageResource(iconRes)
    }

    fun setTag(text: CharSequence?) {
        tagTextView.setTextAndVisibility(text)
    }

    fun setTag(@StringRes textRes: Int?) {
        textRes?.let { setTag(context.getString(it)) }
    }

    fun setTitle(text: CharSequence?) {
        titleTextView.setTextAndVisibility(text)
    }

    fun setTitle(@StringRes textRes: Int?) {
        textRes?.let { setTitle(context.getString(it)) }
    }

    fun setSubtitle(text: CharSequence?) {
        subtitleTextView.setTextAndVisibility(text)
    }

    fun setSubtitle(@StringRes textRes: Int?) {
        textRes?.let { setSubtitle(context.getString(it)) }
    }

    fun setDescription(text: CharSequence?) {
        descriptionTextView.setTextAndVisibility(text)
    }

    fun setDescription(@StringRes textRes: Int?) {
        textRes?.let { setDescription(context.getString(it)) }
    }

    fun setPrimaryButtonText(text: CharSequence?) {
        primaryButton.setTextAndVisibility(text)
    }

    fun setPrimaryButtonText(@StringRes textRes: Int?) {
        textRes?.let { setPrimaryButtonText(context.getString(it)) }
    }

    fun setLinkButtonText(text: CharSequence?) {
        linkButton.setTextAndVisibility(text)
    }

    fun setLinkButtonText(@StringRes textRes: Int?) {
        textRes?.let { setLinkButtonText(context.getString(it)) }
    }

    fun setPrimaryButtonOnClick(onClickListener: OnClickListener?) {
        primaryButton.setOnClickListener(onClickListener)
        setCardRipple(shouldShowRippleOnClick())
    }

    fun setLinkButtonOnClick(onClickListener: OnClickListener?) {
        linkButton.setOnClickListener(onClickListener)
        setCardRipple(shouldShowRippleOnClick())
    }

    fun setDataCardOnClick(onClickListener: OnClickListener?) {
        this.setOnClickListener(onClickListener)
    }

    fun setDataCardAdditionalContent(content: View?) {
        if (content == null) {
            additionalContentLayout.removeAllViews()
            return
        }
        additionalContentLayout.addView(content)
    }

    private fun shouldShowRippleOnClick() : Boolean =
        primaryButton.visibility == GONE

    private fun TextView.setTextAndVisibility(newText: CharSequence?) {
        if (newText?.isNotBlank() == true) {
            text = newText
            visibility = VISIBLE
        } else {
            visibility = GONE
        }
    }

    private fun CardView.setCardRipple(showRippleOnClick: Boolean) {
        foreground = if (!showRippleOnClick) {
            val outValue = TypedValue()
            context.theme.resolveAttribute(android.R.attr.selectableItemBackground, outValue, true)
            resources.getDrawable(outValue.resourceId, context.theme)
        } else {
            null
        }
    }
}