package com.telefonica.mistica.card.mediacard

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
import com.telefonica.mistica.util.show


@BindingMethods(
    BindingMethod(
        type = MediaCardView::class,
        attribute = "mediaCardImageDrawable",
        method = "setImageDrawable"
    ),
    BindingMethod(
        type = MediaCardView::class,
        attribute = "mediaCardTag",
        method = "setTag"
    ),
    BindingMethod(
        type = MediaCardView::class,
        attribute = "mediaCardTitle",
        method = "setTitle"
    ),
    BindingMethod(
        type = MediaCardView::class,
        attribute = "mediaCardSubtitle",
        method = "setSubtitle"
    ),
    BindingMethod(
        type = MediaCardView::class,
        attribute = "mediaCardDescription",
        method = "setDescription"
    ),
    BindingMethod(
        type = MediaCardView::class,
        attribute = "mediaCardPrimaryButtonText",
        method = "setPrimaryButtonText"
    ),
    BindingMethod(
        type = MediaCardView::class,
        attribute = "mediaCardLinkButtonText",
        method = "setLinkButtonText"
    ),
    BindingMethod(
        type = MediaCardView::class,
        attribute = "mediaCardPrimaryButtonOnClick",
        method = "setPrimaryButtonOnClick"
    ),
    BindingMethod(
        type = MediaCardView::class,
        attribute = "mediaCardLinkButtonOnClick",
        method = "setLinkButtonOnClick"
    )
)
class MediaCardView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : CardView(context, attrs, defStyleAttr) {

    private val cardImageView: ImageView
    private val cardContentView: CardContentView
    private val cardCustomContentLayout: LinearLayout
    private val cardActionsView: CardActionsView

    init {
        LayoutInflater.from(context).inflate(R.layout.media_card_view, this, true)
        isClickable = true
        isFocusable = true
        cardElevation = 0F
        radius = resources.getDimension(R.dimen.media_card_corner_radius)
        minimumWidth = resources.getDimension(R.dimen.media_card_min_with).toInt()
        background = resources.getDrawable(R.drawable.media_card_background, context.theme)

        cardImageView = findViewById(R.id.media_card_image)
        cardContentView = findViewById(R.id.media_card_content)
        cardCustomContentLayout = findViewById(R.id.card_custom_content_layout)
        cardActionsView = findViewById(R.id.media_card_actions)

        if (attrs != null) {
            val styledAttrs =
                context.theme.obtainStyledAttributes(
                    attrs,
                    R.styleable.MediaCardView,
                    defStyleAttr,
                    0
                )

            cardContentView.tagTextView.setTextAndVisibility(styledAttrs.getText(R.styleable.MediaCardView_mediaCardTag))
            cardContentView.tagSubtitleTextView.setTextAndVisibility(styledAttrs.getText(R.styleable.MediaCardView_mediaCardSubtitle))
            cardContentView.titleTextView.setTextAndVisibility(styledAttrs.getText(R.styleable.MediaCardView_mediaCardTitle))
            cardContentView.descriptionTextView.setTextAndVisibility(styledAttrs.getText(R.styleable.MediaCardView_mediaCardDescription))

            cardActionsView.primaryButton.setTextAndVisibility(styledAttrs.getText(R.styleable.MediaCardView_mediaCardPrimaryButtonText))
            cardActionsView.linkButton.setTextAndVisibility(styledAttrs.getText(R.styleable.MediaCardView_mediaCardLinkButtonText))

            styledAttrs.getDrawable(R.styleable.MediaCardView_mediaCardImage)
                ?.let { setCardImage(it) }

            setCardRipple(shouldShowRippleOnClick())
            styledAttrs.recycle()
        }
    }

    fun getCardImageView(): ImageView = cardImageView

    fun setCardImage(@DrawableRes imageRes: Int) {
        cardImageView.setImageResource(imageRes)
        cardImageView.show()
    }

    fun setCardImage(imageDrawable: Drawable) {
        cardImageView.setImageDrawable(imageDrawable)
        cardImageView.show()
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
        cardContentView.tagSubtitleTextView.setTextAndVisibility(text)
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

    fun setMediaCardAdditionalContent(content: View?) {
        if (content == null) {
            cardCustomContentLayout.removeAllViews()
            return
        }
        cardCustomContentLayout.addView(content)
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

    private fun TextView.setTextAndVisibility(newText: CharSequence?) {
        if (newText?.isNotBlank() == true) {
            text = newText
            visibility = VISIBLE
        } else {
            visibility = GONE
        }
    }
}
