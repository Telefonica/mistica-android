package com.telefonica.mistica.emptystate.screen

import android.content.Context
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.annotation.DrawableRes
import androidx.annotation.IntDef
import androidx.databinding.BindingMethod
import androidx.databinding.BindingMethods
import com.telefonica.mistica.R
import com.telefonica.mistica.util.convertDpToPx

@BindingMethods(
    BindingMethod(
        type = EmptyStateScreenView::class,
        attribute = "emptyStateScreenImage",
        method = "setImage"
    ),
    BindingMethod(
        type = EmptyStateScreenView::class,
        attribute = "emptyStateScreenImageContentDescription",
        method = "setImageContentDescription"
    ),
    BindingMethod(
        type = EmptyStateScreenView::class,
        attribute = "emptyStateScreenTitle",
        method = "setTitle"
    ),
    BindingMethod(
        type = EmptyStateScreenView::class,
        attribute = "emptyStateScreenSubtitle",
        method = "setSubtitle"
    ),
    BindingMethod(
        type = EmptyStateScreenView::class,
        attribute = "emptyStateScreenButtonsConfig",
        method = "setButtonsConfig"
    ),
    BindingMethod(
        type = EmptyStateScreenView::class,
        attribute = "emptyStateScreenPrimaryButtonText",
        method = "setPrimaryButtonText"
    ),
    BindingMethod(
        type = EmptyStateScreenView::class,
        attribute = "emptyStateScreenPrimaryButtonOnClick",
        method = "setPrimaryButtonOnClick"
    ),
    BindingMethod(
        type = EmptyStateScreenView::class,
        attribute = "emptyStateScreenSecondaryButtonText",
        method = "setSecondaryButtonText"
    ),
    BindingMethod(
        type = EmptyStateScreenView::class,
        attribute = "emptyStateScreenSecondaryButtonOnClick",
        method = "setSecondaryButtonOnClick"
    ),
    BindingMethod(
        type = EmptyStateScreenView::class,
        attribute = "emptyStateScreenLinkButtonText",
        method = "setLinkButtonText"
    ),
    BindingMethod(
        type = EmptyStateScreenView::class,
        attribute = "emptyStateScreenLinkButtonOnClick",
        method = "setLinkButtonOnClick"
    ),
    BindingMethod(
        type = EmptyStateScreenView::class,
        attribute = "emptyStateScreenImageSize",
        method = "setImageSize"
    ),
)
class EmptyStateScreenView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
) : LinearLayout(context, attrs, defStyleAttr) {

    @Retention(AnnotationRetention.SOURCE)
    @IntDef(
        BUTTONS_CONFIG_PRIMARY,
        BUTTONS_CONFIG_PRIMARY_LINK,
        BUTTONS_CONFIG_PRIMARY_SECONDARY,
        BUTTONS_CONFIG_SECONDARY,
        BUTTONS_CONFIG_SECONDARY_LINK,
    )
    annotation class ButtonsConfig

    @Retention(AnnotationRetention.SOURCE)
    @IntDef(
        IMAGE_SIZE_ICON,
        IMAGE_SIZE_SMALL,
        IMAGE_SIZE_FULL_WIDTH,
    )
    annotation class ImageSize

    private var image: ImageView
    private var title: TextView
    private var subtitle: TextView
    private var primaryButton: Button
    private var secondaryButton: Button
    private var linkButton: Button

    init {
        LayoutInflater.from(context).inflate(R.layout.empty_state_screen_view, this, true)

        orientation = VERTICAL

        image = findViewById(R.id.empty_state_screen_image)
        title = findViewById(R.id.empty_state_screen_title)
        subtitle = findViewById(R.id.empty_state_screen_subtitle)
        primaryButton = findViewById(R.id.empty_state_screen_primary_button)
        secondaryButton = findViewById(R.id.empty_state_screen_secondary_button)
        linkButton = findViewById(R.id.empty_state_screen_link_button)

        @ButtonsConfig
        var buttonsConfig: Int = BUTTONS_CONFIG_PRIMARY

        @ImageSize
        var imageSize: Int = IMAGE_SIZE_FULL_WIDTH

        if (attrs != null) {
            val theme = context.theme
            val styledAttrs =
                theme.obtainStyledAttributes(attrs, R.styleable.EmptyStateScreenView, defStyleAttr, 0)

            styledAttrs.getDrawable(R.styleable.EmptyStateScreenView_emptyStateScreenImage)?.let { setImageDrawable(it) }
            styledAttrs.getString(R.styleable.EmptyStateScreenView_emptyStateScreenImageContentDescription)?.let { setImageContentDescription(it) }
            imageSize = styledAttrs.getInteger(R.styleable.EmptyStateScreenView_emptyStateScreenImageSize, imageSize)

            styledAttrs.getString(R.styleable.EmptyStateScreenView_emptyStateScreenTitle)?.let { setTitle(it) }
            styledAttrs.getString(R.styleable.EmptyStateScreenView_emptyStateScreenSubtitle)?.let { setSubtitle(it) }

            buttonsConfig = styledAttrs.getInteger(R.styleable.EmptyStateScreenView_emptyStateScreenButtonsConfig, buttonsConfig)
            styledAttrs.getString(R.styleable.EmptyStateScreenView_emptyStateScreenPrimaryButtonText)?.let { setPrimaryButtonText(it) }
            styledAttrs.getString(R.styleable.EmptyStateScreenView_emptyStateScreenSecondaryButtonText)?.let { setSecondaryButtonText(it) }
            styledAttrs.getString(R.styleable.EmptyStateScreenView_emptyStateScreenLinkButtonText)?.let { setLinkButtonText(it) }

            styledAttrs.recycle()
        }

        setButtonsConfig(buttonsConfig)
        setImageSize(imageSize)
    }

    fun setImage(@DrawableRes imageResource: Int) {
        image.setImageResource(imageResource)
    }

    fun setImageDrawable(drawable: Drawable) {
        image.setImageDrawable(drawable)
    }

    fun setImageContentDescription(text: String) {
        image.contentDescription = text
    }

    fun setTitle(text: String) {
        title.text = text
    }

    fun setSubtitle(text: String) {
        subtitle.text = text
    }

    fun setButtonsConfig(@ButtonsConfig buttonsConfig: Int) {
        primaryButton.visibility = when (buttonsConfig) {
            BUTTONS_CONFIG_PRIMARY,
            BUTTONS_CONFIG_PRIMARY_LINK,
            BUTTONS_CONFIG_PRIMARY_SECONDARY,
            -> View.VISIBLE
            else -> View.GONE
        }
        secondaryButton.visibility = when (buttonsConfig) {
            BUTTONS_CONFIG_PRIMARY_SECONDARY,
            BUTTONS_CONFIG_SECONDARY,
            BUTTONS_CONFIG_SECONDARY_LINK,
            -> View.VISIBLE
            else -> View.GONE
        }
        linkButton.visibility = when (buttonsConfig) {
            BUTTONS_CONFIG_PRIMARY_LINK,
            BUTTONS_CONFIG_SECONDARY_LINK,
            -> View.VISIBLE
            else -> View.GONE
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

    fun setImageSize(@ImageSize imageSize: Int) {
        val imageWidth: Int = when (imageSize) {
            IMAGE_SIZE_ICON -> context.convertDpToPx(64)
            IMAGE_SIZE_SMALL -> ViewGroup.LayoutParams.WRAP_CONTENT
            else -> ViewGroup.LayoutParams.MATCH_PARENT
        }
        val imageHeight: Int = when (imageSize) {
            IMAGE_SIZE_ICON -> context.convertDpToPx(64)
            IMAGE_SIZE_SMALL -> context.convertDpToPx(112)
            else -> ViewGroup.LayoutParams.WRAP_CONTENT
        }
        image.scaleType = when (imageSize) {
            IMAGE_SIZE_ICON -> ImageView.ScaleType.CENTER_INSIDE
            IMAGE_SIZE_SMALL -> ImageView.ScaleType.FIT_START
            else -> ImageView.ScaleType.CENTER_INSIDE
        }
        image.layoutParams = image.layoutParams.apply {
            width = imageWidth
            height = imageHeight
        }
    }

    companion object {
        const val BUTTONS_CONFIG_PRIMARY = 0
        const val BUTTONS_CONFIG_PRIMARY_LINK = 1
        const val BUTTONS_CONFIG_PRIMARY_SECONDARY = 2
        const val BUTTONS_CONFIG_SECONDARY = 3
        const val BUTTONS_CONFIG_SECONDARY_LINK = 4

        const val IMAGE_SIZE_ICON = 0
        const val IMAGE_SIZE_SMALL = 1
        const val IMAGE_SIZE_FULL_WIDTH = 2
    }
}
