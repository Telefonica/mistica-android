package com.telefonica.mistica.feedback.snackbar

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import androidx.annotation.ColorInt
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import com.telefonica.mistica.R

class CustomSnackbarLayout @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0,
): ConstraintLayout(context, attrs, defStyleAttr) {

    private val maxActionLengthPx: Int

    init {
        LayoutInflater.from(context).inflate(R.layout.snackbar_custom_layout_merge, this, true)

        maxActionLengthPx = context.resources.getDimensionPixelSize(R.dimen.mistica_snackbar_maxActionInlineWidth)
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

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)

        if (actionIsTooLong()) {
            rearrangeLayout()
        }
    }

    private fun actionIsTooLong(): Boolean =
        getAction().measuredWidth > maxActionLengthPx

    private fun rearrangeLayout() {
        val text = getText()
        val action = getAction()
        val parent = this

        val constraintSet = ConstraintSet()
        constraintSet.clone(parent)

        constraintSet.connect(text.id, ConstraintSet.END, parent.id, ConstraintSet.END)
        constraintSet.connect(text.id, ConstraintSet.BOTTOM, action.id, ConstraintSet.TOP)

        constraintSet.connect(action.id, ConstraintSet.START, parent.id, ConstraintSet.START)
        constraintSet.connect(action.id, ConstraintSet.BOTTOM, parent.id, ConstraintSet.BOTTOM)
        constraintSet.connect(action.id, ConstraintSet.TOP, text.id, ConstraintSet.BOTTOM)
        constraintSet.setHorizontalBias(action.id, 1.0F)

        constraintSet.applyTo(this)
    }
}
