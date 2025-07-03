package com.telefonica.mistica.card

import android.content.Context
import android.util.AttributeSet
import android.view.Gravity
import android.view.LayoutInflater
import android.widget.LinearLayout
import androidx.core.view.isGone
import com.telefonica.mistica.R
import com.telefonica.mistica.button.Button
import com.telefonica.mistica.util.convertDpToPx

internal class CardActionsView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
) : LinearLayout(context, attrs, defStyleAttr) {

    val primaryButton: Button
    val linkButton: Button

    init {
        LayoutInflater.from(context).inflate(R.layout.card_actions_view, this, true)
        orientation = HORIZONTAL
        gravity = Gravity.START

        primaryButton = findViewById(R.id.card_primary_button)
        linkButton = findViewById(R.id.card_link_button)

        setPadding(
            0,
            context.convertDpToPx(16),
            0,
            0
        )
    }

    fun cardHasNoActions(): Boolean =
        primaryButton.isGone && linkButton.isGone

}