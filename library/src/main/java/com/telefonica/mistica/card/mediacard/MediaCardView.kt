package com.telefonica.mistica.card.mediacard

import android.content.Context
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.FrameLayout
import android.widget.ImageView
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.databinding.BindingMethod
import androidx.databinding.BindingMethods
import com.telefonica.mistica.R
import com.telefonica.mistica.card.CardView
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
        attribute = "cardPretitle",
        method = "setPretitle"
    )
)
class MediaCardView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : CardView(context, attrs, defStyleAttr) {

    private lateinit var cardImageView: ImageView
    private lateinit var otherMediaLayout: FrameLayout

    override fun handleAttrsAndInflateLayout(
        attrs: AttributeSet?,
        defStyleAttr: Int,
        defStyleRes: Int
    ): View {

        val rootView = LayoutInflater.from(context).inflate(R.layout.media_card_view, this, true)
        cardImageView = findViewById(R.id.media_card_image)
        otherMediaLayout = findViewById(R.id.media_card_multimedia_container)

        if (attrs != null) {
            val styledAttrs =
                context.theme.obtainStyledAttributes(
                    attrs,
                    R.styleable.MediaCardView,
                    defStyleAttr,
                    0
                )
            setPretitle(styledAttrs.getText(R.styleable.MediaCardView_cardPretitle))
            styledAttrs.getDrawable(R.styleable.MediaCardView_cardImage)
                ?.let { setCardImage(it) }
            styledAttrs.recycle()
        }
        return rootView
    }

    fun getCardImageView(): ImageView = cardImageView

    fun setCardImage(@DrawableRes imageRes: Int) {
        otherMediaLayout.removeAllViews()
        cardImageView.setImageResource(imageRes)
        cardImageView.show()
    }

    fun setCardImageContentDescription(description: String) {
        cardImageView.contentDescription = description
    }

    fun removeCardImageContentDescription() {
        cardImageView.contentDescription = null
    }

    fun setCardImage(imageDrawable: Drawable) {
        otherMediaLayout.removeAllViews()
        cardImageView.setImageDrawable(imageDrawable)
        cardImageView.show()
    }

    fun setOtherMultimedia(view: View) {
        cardImageView.hide()
        otherMediaLayout.addView(view)
    }

    fun setPretitle(text: CharSequence?) {
        text?.let { setPretitle(it.toString()) }
    }

    fun setPretitle(@StringRes textRes: Int?) {
        textRes?.let { setPretitle(context.getString(it)) }
    }
}
