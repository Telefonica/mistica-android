package com.telefonica.mistica.emptystate.card

import android.content.Context
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.annotation.DrawableRes
import androidx.annotation.IntDef
import androidx.appcompat.content.res.AppCompatResources
import androidx.databinding.BindingMethod
import androidx.databinding.BindingMethods
import com.telefonica.mistica.R
import com.telefonica.mistica.button.Button
import com.telefonica.mistica.util.convertDpToPx

@BindingMethods(
    BindingMethod(
        type = EmptyStateCardView::class,
        attribute = "emptyStateCardImage",
        method = "setImage"
    ),
    BindingMethod(
        type = EmptyStateCardView::class,
        attribute = "emptyStateCardImageContentDescription",
        method = "setImageContentDescription"
    ),
    BindingMethod(
        type = EmptyStateCardView::class,
        attribute = "emptyStateCardTitle",
        method = "setTitle"
    ),
    BindingMethod(
        type = EmptyStateCardView::class,
        attribute = "emptyStateCardSubtitle",
        method = "setSubtitle"
    ),
    BindingMethod(
        type = EmptyStateCardView::class,
        attribute = "emptyStateCardButtonsConfig",
        method = "setButtonsConfig"
    ),
    BindingMethod(
        type = EmptyStateCardView::class,
        attribute = "emptyStateCardPrimaryButtonText",
        method = "setPrimaryButtonText"
    ),
    BindingMethod(
        type = EmptyStateCardView::class,
        attribute = "emptyStateCardPrimaryButtonOnClick",
        method = "setPrimaryButtonOnClick"
    ),
    BindingMethod(
        type = EmptyStateCardView::class,
        attribute = "emptyStateCardSecondaryButtonText",
        method = "setSecondaryButtonText"
    ),
    BindingMethod(
        type = EmptyStateCardView::class,
        attribute = "emptyStateCardSecondaryButtonOnClick",
        method = "setSecondaryButtonOnClick"
    ),
    BindingMethod(
        type = EmptyStateCardView::class,
        attribute = "emptyStateCardLinkButtonText",
        method = "setLinkButtonText"
    ),
    BindingMethod(
        type = EmptyStateCardView::class,
        attribute = "emptyStateCardLinkButtonOnClick",
        method = "setLinkButtonOnClick"
    ),
    BindingMethod(
        type = EmptyStateCardView::class,
        attribute = "emptyStateCardImageSize",
        method = "setImageSize"
    ),
)
class EmptyStateCardView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
) : LinearLayout(context, attrs, defStyleAttr) {

    @Retention(AnnotationRetention.SOURCE)
    @IntDef(
        BUTTONS_CONFIG_NONE,
        BUTTONS_CONFIG_PRIMARY,
        BUTTONS_CONFIG_PRIMARY_LINK,
        BUTTONS_CONFIG_PRIMARY_SECONDARY,
        BUTTONS_CONFIG_SECONDARY,
        BUTTONS_CONFIG_SECONDARY_LINK,
        LINK,
    )
    annotation class ButtonsConfig

    @Retention(AnnotationRetention.SOURCE)
    @IntDef(
        IMAGE_SIZE_ICON,
        IMAGE_SIZE_SMALL
    )
    annotation class ImageSize

    private var image: ImageView
    private var title: TextView
    private var subtitle: TextView
    private var buttonsContainer: LinearLayout
    private var primaryButton: Button
    private var secondaryButton: Button
    private var linkButton: Button

    init {
        LayoutInflater.from(context).inflate(R.layout.empty_state_card_view, this, true)

        background = AppCompatResources.getDrawable(context, R.drawable.empty_state_card_view_background)
        isFocusable = true
        orientation = VERTICAL
        setPadding(
            0,
            context.convertDpToPx(24),
            0,
            context.convertDpToPx(24),
        )

        image = findViewById(R.id.empty_state_screen_image)
        title = findViewById(R.id.empty_state_screen_title)
        subtitle = findViewById(R.id.empty_state_screen_subtitle)
        buttonsContainer = findViewById(R.id.buttons_container)
        primaryButton = findViewById(R.id.empty_state_screen_primary_button)
        secondaryButton = findViewById(R.id.empty_state_screen_secondary_button)
        linkButton = findViewById(R.id.empty_state_screen_link_button)

        @ButtonsConfig
        var buttonsConfig: Int = BUTTONS_CONFIG_NONE

        @ImageSize
        var imageSize: Int = IMAGE_SIZE_SMALL

        if (attrs != null) {
            val theme = context.theme
            val styledAttrs =
                theme.obtainStyledAttributes(attrs, R.styleable.EmptyStateCardView, defStyleAttr, 0)

            styledAttrs.getResourceId(R.styleable.EmptyStateCardView_emptyStateCardImage, TypedValue.TYPE_NULL)
                .takeIf { it != TypedValue.TYPE_NULL }
                ?.let { AppCompatResources.getDrawable(context, it) }
                ?.let { setImageDrawable(it) }

            styledAttrs.getString(R.styleable.EmptyStateCardView_emptyStateCardImageContentDescription)?.let { setImageContentDescription(it) }
            imageSize = styledAttrs.getInteger(R.styleable.EmptyStateCardView_emptyStateCardImageSize, imageSize)

            styledAttrs.getString(R.styleable.EmptyStateCardView_emptyStateCardTitle)?.let { setTitle(it) }
            styledAttrs.getString(R.styleable.EmptyStateCardView_emptyStateCardSubtitle)?.let { setSubtitle(it) }

            buttonsConfig = styledAttrs.getInteger(R.styleable.EmptyStateCardView_emptyStateCardButtonsConfig, buttonsConfig)
            styledAttrs.getString(R.styleable.EmptyStateCardView_emptyStateCardPrimaryButtonText)?.let { setPrimaryButtonText(it) }
            styledAttrs.getString(R.styleable.EmptyStateCardView_emptyStateCardPrimaryButtonLoadingText)?.let { setPrimaryButtonLoadingText(it) }
            styledAttrs.getString(R.styleable.EmptyStateCardView_emptyStateCardSecondaryButtonText)?.let { setSecondaryButtonText(it) }
            styledAttrs.getString(R.styleable.EmptyStateCardView_emptyStateCardLinkButtonText)?.let { setLinkButtonText(it) }

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
        if (text.isNotEmpty()) {
            subtitle.text = text
            subtitle.visibility = View.VISIBLE
        } else {
            subtitle.visibility = View.GONE
        }
    }

    fun setButtonsConfig(@ButtonsConfig buttonsConfig: Int) {
        if (buttonsConfig == BUTTONS_CONFIG_NONE) {
            buttonsContainer.visibility = View.GONE
            return
        }

        buttonsContainer.visibility = View.VISIBLE

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
            LINK,
            -> View.VISIBLE
            else -> View.GONE
        }
        linkButton.layoutParams = (linkButton.layoutParams as LinearLayout.LayoutParams).apply {
            marginStart = when (buttonsConfig) {
                LINK -> context.convertDpToPx(8)
                else -> context.convertDpToPx(24)
            }
        }
    }

    fun setPrimaryButtonText(text: String) {
        primaryButton.text = text
    }

    fun setPrimaryButtonLoadingText(text: String) {
        primaryButton.loadingText = text
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
            IMAGE_SIZE_ICON -> context.convertDpToPx(ICON_SIZE_DP)
            else -> ViewGroup.LayoutParams.WRAP_CONTENT
        }
        val imageHeight: Int = when (imageSize) {
            IMAGE_SIZE_ICON -> context.convertDpToPx(ICON_SIZE_DP)
            else -> context.convertDpToPx(112)
        }
        image.scaleType = when (imageSize) {
            IMAGE_SIZE_ICON -> ImageView.ScaleType.CENTER_INSIDE
            else -> ImageView.ScaleType.FIT_START
        }
        image.layoutParams = image.layoutParams.apply {
            width = imageWidth
            height = imageHeight
        }
    }

    fun setIsLoading(isLoading: Boolean) {
        primaryButton.isLoading = isLoading
    }

    companion object {
        const val BUTTONS_CONFIG_NONE = 0
        const val BUTTONS_CONFIG_PRIMARY = 1
        const val BUTTONS_CONFIG_PRIMARY_LINK = 2
        const val BUTTONS_CONFIG_PRIMARY_SECONDARY = 3
        const val BUTTONS_CONFIG_SECONDARY = 4
        const val BUTTONS_CONFIG_SECONDARY_LINK = 5
        const val LINK = 6
        private const val ICON_SIZE_DP = 48

        const val IMAGE_SIZE_ICON = 0
        const val IMAGE_SIZE_SMALL = 1
    }
}
