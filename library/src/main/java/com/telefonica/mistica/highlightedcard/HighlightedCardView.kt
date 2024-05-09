package com.telefonica.mistica.highlightedcard

import android.content.Context
import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.PorterDuff
import android.graphics.PorterDuffXfermode
import android.graphics.Rect
import android.graphics.RectF
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.util.TypedValue
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
import androidx.databinding.BindingMethod
import androidx.databinding.BindingMethods
import com.telefonica.mistica.R
import com.telefonica.mistica.util.DrawableBuilder
import com.telefonica.mistica.util.getDimension
import com.telefonica.mistica.util.getMisticaThemeDrawableBuilder
import com.telefonica.mistica.util.getThemeColor
import com.telefonica.mistica.util.hide
import com.telefonica.mistica.util.show

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
        attribute = "highlightedCardImageStyle",
        method = "setImageStyle"
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
        attribute = "highlightedCardCloseButton",
        method = "setCloseButton"
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
) : ConstraintLayout(context, attrs, defStyleAttr) {

    @Retention(AnnotationRetention.SOURCE)
    @IntDef(
        BUTTON_STYLE_PRIMARY,
        BUTTON_STYLE_SECONDARY,
        BUTTON_STYLE_LINK,
        BUTTON_STYLE_NO_BUTTON
    )
    annotation class ButtonStyle

    @Retention(AnnotationRetention.SOURCE)
    @IntDef(
        IMAGE_STYLE_MODE_FIT,
        IMAGE_STYLE_MODE_FILL,
        IMAGE_STYLE_NO_IMAGE
    )
    annotation class ImageStyle

    private val titleTextView: TextView
    private val contentTextView: TextView
    private val image: ImageView
    private val closeButton: ImageView
    private val closeButtonBackground: View
    private val container: ConstraintLayout

    private var button: Button?
    private var buttonClickListener: OnClickListener? = null
    private var buttonText: String? = null

    private var isInverse: Boolean = false
    private var hasCustomBackground: Boolean = false
    private var buttonStyle: Int = BUTTON_STYLE_NO_BUTTON
    private var imageStyle: Int = IMAGE_STYLE_NO_IMAGE

    init {
        LayoutInflater.from(context).inflate(R.layout.highlighted_card_view, this, true)

        titleTextView = findViewById(R.id.highlighted_card_title)
        contentTextView = findViewById(R.id.highlighted_card_content)
        button = findViewById(R.id.highlighted_card_button_primary)
        image = findViewById(R.id.highlighted_card_image)
        closeButton = findViewById(R.id.highlighted_card_close_button)
        closeButtonBackground = findViewById(R.id.highlighted_card_close_button_background)
        container = findViewById(R.id.highlighted_card_container)

        if (attrs != null) {
            val styledAttrs =
                context.theme.obtainStyledAttributes(
                    attrs,
                    R.styleable.HighlightedCardView,
                    defStyleAttr,
                    0
                )

            styledAttrs.getResourceId(R.styleable.HighlightedCardView_highlightedCardBackground, TypedValue.TYPE_NULL)
                .takeIf { it != TypedValue.TYPE_NULL }
                ?.let { AppCompatResources.getDrawable(context, it) }
                ?.let { setCustomBackground(it) }

            isInverse = styledAttrs.getBoolean(
                R.styleable.HighlightedCardView_highlightedCardInverse,
                false
            )

            styledAttrs.getText(R.styleable.HighlightedCardView_highlightedCardTitle)
                ?.let { titleTextView.text = it }
            styledAttrs.getText(R.styleable.HighlightedCardView_highlightedCardContent)
                ?.let { contentTextView.text = it }
            styledAttrs.getText(R.styleable.HighlightedCardView_highlightedCardButton)
                ?.let { buttonText = it.toString() }
            buttonText?.let { button?.text = it }

            buttonStyle = styledAttrs.getInt(
                R.styleable.HighlightedCardView_highlightedCardButtonStyle,
                BUTTON_STYLE_NO_BUTTON
            )

            imageStyle = styledAttrs.getInt(
                R.styleable.HighlightedCardView_highlightedCardImageStyle,
                IMAGE_STYLE_NO_IMAGE
            )
            styledAttrs.getText(R.styleable.HighlightedCardView_highlightedCardCloseButton)
                ?.let { setCloseButton(it) }
            styledAttrs.getResourceId(R.styleable.HighlightedCardView_highlightedCardImage, TypedValue.TYPE_NULL)
                .takeIf { it != TypedValue.TYPE_NULL }
                ?.let { AppCompatResources.getDrawable(context, it) }
                ?.let { setImage(it) }

            styledAttrs.recycle()
        }
        reload()
    }

    fun setButtonOnClick(onClickListener: OnClickListener?) {
        this.buttonClickListener = onClickListener
        button?.setOnClickListener(onClickListener)
    }

    fun setTitle(text: CharSequence) {
        titleTextView.text = text
    }

    fun setTitle(@StringRes textRes: Int) {
        setTitle(context.getString(textRes))
    }

    fun setContent(text: CharSequence) {
        contentTextView.text = text
    }

    fun setContent(@StringRes textRes: Int) {
        setContent(context.getString(textRes))
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
        configureImage()
    }

    fun setImage(imageRes: Drawable) {
        image.setImageDrawable(imageRes)
        configureImage()
    }

    fun setImageStyle(@ImageStyle imageStyle: Int) {
        this.imageStyle = imageStyle
        configureImage()
    }

    fun setCustomBackground(@DrawableRes imageRes: Int) {
        setCustomBackground(AppCompatResources.getDrawable(context, imageRes)!!)
    }

    fun setCustomBackground(drawable: Drawable) {

        val roundedCornerBitmap =
            BitmapDrawable(resources, getRoundedCornerBitmap((drawable as BitmapDrawable).bitmap))

        container.background = roundedCornerBitmap
        hasCustomBackground = true
    }

    fun disableCustomBackground() {
        hasCustomBackground = false
        configureBackground()
    }

    fun setCloseButton(buttonContentDescription: CharSequence) {
        closeButton.contentDescription = buttonContentDescription
        closeButton.show()
        when (showCloseButtonBackground()) {
            true -> closeButtonBackground.show()
            false -> closeButtonBackground.hide()
        }
    }

    private fun showCloseButtonBackground() =
        isInverse || hasCustomBackground || imageStyle == IMAGE_STYLE_MODE_FILL

    fun setCloseButtonOnClick(onButtonClick: OnClickListener) {
        closeButton.setOnClickListener(onButtonClick)
    }

    fun removeCloseButton() {
        closeButton.hide()
        closeButtonBackground.hide()
    }

    private fun configureColors() {
        @ColorInt val primaryColor: Int =
            context.getThemeColor(if (isInverse) R.attr.colorTextPrimaryInverse else R.attr.colorTextPrimary)
        titleTextView.setTextColor(primaryColor)

        @ColorInt val secondaryColor: Int =
            context.getThemeColor(if (isInverse) R.attr.colorTextSecondaryInverse else R.attr.colorTextSecondary)
        contentTextView.setTextColor(secondaryColor)

    }

    private fun configureBackground() {
        if (!hasCustomBackground) {
            val backgroundDrawable = if (isInverse) {
                context.getMisticaThemeDrawableBuilder(R.attr.drawableBackgroundBrand)
                    .withCornerRadius()
                    .withBorderStroke()
                    .get()
            } else {
                AppCompatResources.getDrawable(context, R.drawable.highlighted_card_background)
            }
            container.background = backgroundDrawable
        }
    }

    private fun configureImage() {
        when (imageStyle) {
            IMAGE_STYLE_MODE_FIT -> showFitImage()
            IMAGE_STYLE_MODE_FILL -> showFillImage()
            IMAGE_STYLE_NO_IMAGE -> hideImage()
        }
    }

    private fun showFillImage() {
        image.scaleType = ImageView.ScaleType.CENTER_CROP
        image.visibility = View.VISIBLE
    }

    private fun showFitImage() {
        image.scaleType = ImageView.ScaleType.FIT_END
        image.visibility = View.VISIBLE
    }

    private fun hideImage() {
        image.visibility = View.GONE
    }

    private fun reload() {
        configureButton()
        configureBackground()
        configureColors()
        configureImage()
    }

    private fun configureButton() {
        val button: Button? = when (buttonStyle) {
            BUTTON_STYLE_PRIMARY -> findViewById(if (isInverse) R.id.highlighted_card_button_primary_inverse else R.id.highlighted_card_button_primary)
            BUTTON_STYLE_SECONDARY -> findViewById(if (isInverse) R.id.highlighted_card_button_secondary_inverse else R.id.highlighted_card_button_secondary)
            BUTTON_STYLE_LINK -> findViewById(if (isInverse) R.id.highlighted_card_button_link_inverse else R.id.highlighted_card_button_link)
            else -> null
        }

        button?.setOnClickListener(buttonClickListener)
        button?.text = buttonText
        if (this.button != button) {
            button?.visibility = View.VISIBLE
            this.button?.visibility = View.GONE
            this.button = button
        }
    }

    private fun getRoundedCornerBitmap(bitmap: Bitmap): Bitmap? {
        val output = Bitmap.createBitmap(
            bitmap.width, bitmap
                .height, Bitmap.Config.ARGB_8888
        )
        val canvas = Canvas(output)
        val color = context.getThemeColor(R.attr.colorBorder)
        val paint = Paint()
        val rect = Rect(0, 0, bitmap.width, bitmap.height)
        val rectF = RectF(rect)
        val roundPx = context.getDimension(R.attr.containerBorderRadius)
        paint.isAntiAlias = true
        canvas.drawARGB(0, 0, 0, 0)
        paint.color = color
        canvas.drawRoundRect(rectF, roundPx, roundPx, paint)
        paint.xfermode = PorterDuffXfermode(PorterDuff.Mode.SRC_IN)
        canvas.drawBitmap(bitmap, rect, rect, paint)
        return output
    }

    companion object {
        const val BUTTON_STYLE_PRIMARY = 0
        const val BUTTON_STYLE_SECONDARY = 1
        const val BUTTON_STYLE_LINK = 2
        const val BUTTON_STYLE_NO_BUTTON = 3

        const val IMAGE_STYLE_MODE_FIT = 0
        const val IMAGE_STYLE_MODE_FILL = 1
        const val IMAGE_STYLE_NO_IMAGE = 2
    }
}
