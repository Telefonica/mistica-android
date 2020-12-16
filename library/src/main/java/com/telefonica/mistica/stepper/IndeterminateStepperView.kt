package com.telefonica.mistica.stepper

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import android.widget.ProgressBar
import androidx.databinding.BindingMethod
import androidx.databinding.BindingMethods
import com.telefonica.mistica.R

@BindingMethods(
    BindingMethod(
        type = IndeterminateStepperView::class,
        attribute = "progress",
        method = "setProgress"
    )
)
class IndeterminateStepperView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : LinearLayout(context, attrs, defStyleAttr) {

    private val progressBar: ProgressBar

    init {
        LayoutInflater.from(context).inflate(R.layout.indeterminate_stepper, this, true)

        progressBar = findViewById(R.id.progress_bar)

        if (attrs != null) {
            val styledAttrs = context.theme.obtainStyledAttributes(
                attrs,
                R.styleable.IndeterminateStepperView,
                defStyleAttr,
                0
            )

            val progress = styledAttrs.getInteger(R.styleable.IndeterminateStepperView_progress, 0)
            setProgress(progress)
        }
    }

    fun setProgress(progress: Int) {
        progressBar.progress = progress
    }

    internal fun reset() {
        setProgress(EMPTY_PROGRESS)
    }

    internal fun complete() {
        setProgress(FULL_PROGRESS)
    }

    private companion object {
        const val EMPTY_PROGRESS = 0
        const val FULL_PROGRESS = 100
    }
}