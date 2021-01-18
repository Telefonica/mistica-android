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
    ),
    BindingMethod(
        type = DataCardView::class,
        attribute = "cardSubtitle",
        method = "setSubtitle"
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
            setSubtitle(styledAttrs.getText(R.styleable.DataCardView_cardSubtitle))
            styledAttrs.getDrawable(R.styleable.DataCardView_cardIcon)
                ?.let { setIcon(it) }
            styledAttrs.recycle()

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

    fun setSubtitle(text: CharSequence?) {
        text?.let { setSubtitle(it.toString()) }
    }

    fun setSubtitle(@StringRes textRes: Int?) {
        textRes?.let { setSubtitle(context.getString(it)) }
    }
}