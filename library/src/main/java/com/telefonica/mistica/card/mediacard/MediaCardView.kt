package com.telefonica.mistica.card.mediacard

import android.content.Context
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.databinding.BindingMethod
import androidx.databinding.BindingMethods
import com.telefonica.mistica.R
import com.telefonica.mistica.card.CardView
import com.telefonica.mistica.util.show


@BindingMethods(
    BindingMethod(
        type = MediaCardView::class,
        attribute = "mediaCardImageDrawable",
        method = "setImageDrawable"
    )
)
class MediaCardView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : CardView(context, attrs, defStyleAttr) {

    private lateinit var cardImageView: ImageView

    override fun handleAttrsAndInflateLayout(
        attrs: AttributeSet?,
        defStyleAttr: Int,
        defStyleRes: Int
    ): View {

        val rootView = LayoutInflater.from(context).inflate(R.layout.media_card_view, this, true)
        cardImageView = findViewById(R.id.media_card_image)

        if (attrs != null) {
            val styledAttrs =
                context.theme.obtainStyledAttributes(
                    attrs,
                    R.styleable.DataCardView,
                    defStyleAttr,
                    0
                )
            styledAttrs.getDrawable(R.styleable.MediaCardView_cardImage)
                ?.let { setCardImage(it) }
        }
        return rootView
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

    override fun setSubtitle(text: CharSequence?) {
        cardContentView.tagSubtitleTextView.setTextAndVisibility(text)
    }

    override fun setSubtitle(@StringRes textRes: Int?) {
        textRes?.let { setSubtitle(context.getString(it)) }
    }
}
