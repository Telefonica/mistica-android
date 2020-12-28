package com.telefonica.mistica.mediacard

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
    ),
    BindingMethod(
        type = MediaCardView::class,
        attribute = "mediaCardOnClick",
        method = "setMediaCardOnClick"
    )
)
class MediaCardView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : CardView(context, attrs, defStyleAttr) {

    private val tagTextView: TextView
    private val titleTextView: TextView
    private val subtitleTextView: TextView
    private val descriptionTextView: TextView
    private val imageView: ImageView
    private val primaryButton: Button
    private val linkButton: Button
    private val additionalContentLayout: LinearLayout

    init {
        LayoutInflater.from(context).inflate(R.layout.media_card_view, this, true)
        isClickable = true
        isFocusable = true
        cardElevation = 0F
        radius = resources.getDimension(R.dimen.media_card_corner_radius)
        minimumWidth = resources.getDimension(R.dimen.media_card_min_with).toInt()

        tagTextView = findViewById(R.id.media_card_tag)
        titleTextView = findViewById(R.id.media_card_title)
        subtitleTextView = findViewById(R.id.media_card_subtitle)
        descriptionTextView = findViewById(R.id.media_card_description)
        imageView = findViewById(R.id.media_card_media)
        primaryButton = findViewById(R.id.media_card_primary_button)
        linkButton = findViewById(R.id.media_card_link_button)
        additionalContentLayout = findViewById(R.id.media_card_custom_content_layout)

        if (attrs != null) {
            val styledAttrs =
                context.theme.obtainStyledAttributes(
                    attrs,
                    R.styleable.MediaCardView,
                    defStyleAttr,
                    0
                )

            tagTextView.setTextAndVisibility(styledAttrs.getText(R.styleable.MediaCardView_mediaCardTag))
            titleTextView.setTextAndVisibility(styledAttrs.getText(R.styleable.MediaCardView_mediaCardTitle))
            subtitleTextView.setTextAndVisibility(styledAttrs.getText(R.styleable.MediaCardView_mediaCardSubtitle))
            descriptionTextView.setTextAndVisibility(styledAttrs.getText(R.styleable.MediaCardView_mediaCardDescription))
            primaryButton.setTextAndVisibility(styledAttrs.getText(R.styleable.MediaCardView_mediaCardPrimaryButtonText))
            linkButton.setTextAndVisibility(styledAttrs.getText(R.styleable.MediaCardView_mediaCardLinkButtonText))

            styledAttrs.getDrawable(R.styleable.MediaCardView_mediaCardImage)
                ?.let { setImage(it) }

            setCardRipple(shouldShowRipple())
            styledAttrs.recycle()
        }
    }

    fun setImage(@DrawableRes imageRes: Int) {
        imageView.setImageResource(imageRes)
    }

    fun setImage(imageDrawable: Drawable) {
        imageView.setImageDrawable(imageDrawable)
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
        setCardRipple(shouldShowRipple())
    }

    fun setLinkButtonOnClick(onClickListener: OnClickListener?) {
        linkButton.setOnClickListener(onClickListener)
        setCardRipple(shouldShowRipple())
    }

    fun setMediaCardOnClick(onClickListener: OnClickListener?) {
        this.setOnClickListener(onClickListener)
    }

    fun setMediaCardAdditionalContent(content: View?) {
        if (content == null) {
            additionalContentLayout.removeAllViews()
            return
        }
        additionalContentLayout.addView(content)
    }

    private fun TextView.setTextAndVisibility(newText: CharSequence?) {
        if (newText?.isNotBlank() == true) {
            text = newText
            visibility = VISIBLE
        } else {
            visibility = GONE
        }
    }

    private fun shouldShowRipple(): Boolean =
        primaryButton.visibility == GONE && linkButton.visibility == GONE

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
