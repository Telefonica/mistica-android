package com.telefonica.mistica.stepper

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.FrameLayout
import android.widget.RelativeLayout
import android.widget.TextView
import androidx.core.content.ContextCompat
import com.telefonica.mistica.R
import com.telefonica.mistica.util.getThemeColor
import com.telefonica.mistica.util.getThemeRes

internal class StepView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : FrameLayout(context, attrs, defStyleAttr) {

    private val stepTextView: TextView
    private val stepContainer: RelativeLayout

    init {
        LayoutInflater.from(context).inflate(R.layout.step_view, this, true)

        stepTextView = findViewById(R.id.step_number)
        stepContainer = findViewById(R.id.step_container)
    }

    fun setStep(step: Int) {
        stepTextView.text = step.toString()
    }

    fun setUnselected() {
        stepContainer.background = context.getDrawable(R.drawable.stepper_unselected_step_background)
        if (stepTextView.visibility != VISIBLE) {
            stepTextView.visibility = VISIBLE
        }
        stepTextView.setTextColor(context.getThemeColor(R.attr.colorTextSecondary))
    }

    fun setSelected() {
        stepContainer.background = context.getDrawable(R.drawable.stepper_selected_step_background)
        if (stepTextView.visibility != VISIBLE) {
            stepTextView.visibility = VISIBLE
        }
        stepTextView.setTextColor(context.getThemeColor(R.attr.colorBackground))
    }

    fun setCompleted() {
        context.getThemeRes(R.attr.stepperFinishedStepIcon, resolveRefs = false)?.let { backgroundId ->
            stepContainer.background = ContextCompat.getDrawable(context, backgroundId)
        }
        stepTextView.visibility = INVISIBLE
    }
}