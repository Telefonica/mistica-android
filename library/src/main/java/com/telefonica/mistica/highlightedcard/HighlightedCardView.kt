package com.telefonica.mistica.highlightedcard

import android.content.Context
import android.util.AttributeSet
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import androidx.annotation.StringRes
import androidx.databinding.BindingMethod
import androidx.databinding.BindingMethods
import com.telefonica.mistica.R

@BindingMethods(
    BindingMethod(
        type = HighlightedCardView::class,
        attribute = "title",
        method = "setTitle"
    )
)
class HighlightedCardView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
    defStyleRes: Int = 0
) : LinearLayout(context, attrs, defStyleAttr, defStyleRes) {

    private val titleTextView: TextView

    init {
        LayoutInflater.from(context).inflate(R.layout.highlighted_card_view, this, true)
        orientation = VERTICAL
        gravity = Gravity.START

        titleTextView = findViewById(R.id.highlighted_card_title)

        if (attrs != null) {
            val styledAttrs =
                context.theme.obtainStyledAttributes(attrs, R.styleable.HighlightedCardView, defStyleAttr, 0)

//            titleTextView.setTextAndVisibility(styledAttrs.getText(R.styleable.HighlightedCardView_highlightedCardTitle))

            styledAttrs.recycle()
        }
    }

    fun setTitle(text: CharSequence?) {
        titleTextView.setTextAndVisibility(text)
    }

    fun setTitle(@StringRes textRes: Int?) {
        textRes?.let { setTitle(context.getString(it)) }
    }

    private fun TextView.setTextAndVisibility(newText: CharSequence?) {
        if (newText?.isNotBlank() == true) {
            text = newText
            visibility = View.VISIBLE
        } else {
            visibility = View.GONE
        }
    }

}
