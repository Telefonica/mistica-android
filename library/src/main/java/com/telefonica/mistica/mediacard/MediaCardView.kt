package com.telefonica.mistica.mediacard

import android.content.Context
import android.graphics.drawable.Drawable
import android.net.Uri
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
import com.telefonica.mistica.util.hide
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
    private val cardVideoView: MediaCardVideoView
    private val tagTextView: TextView
    private val titleTextView: TextView
    private val subtitleTextView: TextView
    private val descriptionTextView: TextView
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
        background = resources.getDrawable(R.drawable.media_card_background, context.theme)

        cardImageView = findViewById(R.id.media_card_image)
        cardVideoView = findViewById(R.id.media_card_video_view)
        tagTextView = findViewById(R.id.media_card_tag)
        titleTextView = findViewById(R.id.media_card_title)
        subtitleTextView = findViewById(R.id.media_card_subtitle)
        descriptionTextView = findViewById(R.id.media_card_description)
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
                ?.let { setCardImage(it) }

            setCardRipple(shouldShowRipple())
            styledAttrs.recycle()
        }
    }

    fun getVideoThumbnailImageView() = cardVideoView.thumbnail

    fun setVideo(videoUri: Uri, @DrawableRes imageRes: Int) {
        cardVideoView.show()
        cardVideoView.setVideo(videoUri, imageRes)
        cardImageView.hide()
    }

    fun setVideo(videoUri: Uri, imageDrawable: Drawable) {
        cardVideoView.show()
        cardVideoView.setVideo(videoUri, imageDrawable)
        cardImageView.hide()
    }

    fun getCardImageView(): ImageView = cardImageView

    fun setCardImage(@DrawableRes imageRes: Int) {
        cardImageView.setImageResource(imageRes)
        cardVideoView.hide()
        cardImageView.show()
    }

    fun setCardImage(imageDrawable: Drawable) {
        cardImageView.setImageDrawable(imageDrawable)
        cardVideoView.hide()
        cardImageView.show()
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
            show()
        } else {
            hide()
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
