package com.telefonica.mistica.card

import android.content.Context
import android.util.AttributeSet
import android.view.Gravity
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.TextView
import com.telefonica.mistica.R

class CardContentView @JvmOverloads internal constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr) {

    val tagTextView: TextView
    val tagSubtitleTextView: TextView
    val titleTextView: TextView
    val subtitleTextView: TextView
    val descriptionTextView: TextView

    init {
        LayoutInflater.from(context).inflate(R.layout.card_content_view, this, true)
        orientation = VERTICAL
        gravity = Gravity.START

        tagTextView = findViewById(R.id.card_tag)
        tagSubtitleTextView = findViewById(R.id.card_tag_subtitle)
        titleTextView = findViewById(R.id.card_title)
        subtitleTextView = findViewById(R.id.card_subtitle)
        descriptionTextView = findViewById(R.id.card_description)
    }
}