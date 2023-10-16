package com.telefonica.mistica.feedback.snackbar

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import androidx.annotation.ColorInt
import androidx.constraintlayout.widget.ConstraintLayout
import com.telefonica.mistica.R

class CustomSnackbarLayout @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
): ConstraintLayout(context, attrs, defStyleAttr) {
    init {
        LayoutInflater.from(context).inflate(R.layout.snackbar_custom_layout_merge, this, true)
    }

    fun setText(text: CharSequence) {
        getText().text = text
    }

    private fun getText(): TextView =
        findViewById(R.id.custom_snackbar_text)

    fun setAction(actionText: CharSequence, listener: OnClickListener) {
        getAction().run {
            visibility = View.VISIBLE
            text = actionText
            setOnClickListener(listener)
        }
    }

    fun setActionTextColor(@ColorInt color: Int) {
        getAction().setTextColor(color)
    }

    private fun getAction(): TextView =
        findViewById(R.id.custom_snackbar_action)
}
