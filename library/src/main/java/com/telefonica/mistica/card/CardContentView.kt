package com.telefonica.mistica.card

import android.content.Context
import android.util.AttributeSet
import android.view.Gravity
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.TextView
import com.telefonica.mistica.R
import com.telefonica.mistica.tag.TagView

internal class CardContentView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr) {

    val tagTextView: TagView
    val pretitleTextView: TextView
    val titleTextView: TextView
    val subtitleTextView: TextView
    val descriptionTextView: TextView

    init {
        LayoutInflater.from(context).inflate(R.layout.card_content_view, this, true)
        orientation = VERTICAL
        gravity = Gravity.START

        tagTextView = findViewById(R.id.card_tag)
        pretitleTextView = findViewById(R.id.card_pre_title)
        titleTextView = findViewById(R.id.card_title)
        subtitleTextView = findViewById(R.id.card_subtitle)
        descriptionTextView = findViewById(R.id.card_description)
    }
}