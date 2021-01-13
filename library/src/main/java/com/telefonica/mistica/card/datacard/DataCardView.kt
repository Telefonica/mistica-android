package com.telefonica.mistica.card.datacard

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

@BindingMethods(
    BindingMethod(
        type = DataCardView::class,
        attribute = "cardIcon",
        method = "setCardIcon"
    )
)
class DataCardView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : CardView(context, attrs, defStyleAttr) {

    private lateinit var iconImageView: ImageView

    override fun handleAttrsAndInflateLayout(
        attrs: AttributeSet?,
        defStyleAttr: Int,
        defStyleRes: Int
    ): View {

        val rootView = LayoutInflater.from(context).inflate(R.layout.data_card_view, this, true)
        iconImageView = findViewById(R.id.data_card_icon)

        if (attrs != null) {
            val styledAttrs =
                context.theme.obtainStyledAttributes(
                    attrs,
                    R.styleable.DataCardView,
                    defStyleAttr,
                    0
                )
            styledAttrs.getDrawable(R.styleable.DataCardView_cardIcon)
                ?.let { setIcon(it) }
        }
        return rootView
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

    override fun setSubtitle(text: CharSequence?) {
        cardContentView.subtitleTextView.setTextAndVisibility(text)
    }

    override fun setSubtitle(@StringRes textRes: Int?) {
        textRes?.let { setSubtitle(context.getString(it)) }
    }
}