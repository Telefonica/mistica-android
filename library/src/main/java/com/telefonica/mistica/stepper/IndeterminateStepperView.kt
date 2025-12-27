package com.telefonica.mistica.stepper

import android.animation.ValueAnimator
import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.animation.DecelerateInterpolator
import android.widget.LinearLayout
import android.widget.ProgressBar
import com.telefonica.mistica.R

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
            setProgress(progress, animate = false)
        }
    }

    fun setProgress(progress: Int, animate: Boolean = true) {
        if (animate) {
            ValueAnimator.ofInt(progressBar.progress, progress).apply {
                addUpdateListener {
                    progressBar.progress = it.animatedValue as Int
                }
                duration = PROGRESS_ANIMATION_DURATION
                interpolator = DecelerateInterpolator()
                start()
            }
        } else {
            progressBar.progress = progress
        }
    }

    internal fun reset() {
        setProgress(EMPTY_PROGRESS)
    }

    internal fun complete() {
        setProgress(FULL_PROGRESS)
    }

    private companion object {
        const val PROGRESS_ANIMATION_DURATION = 100L
        const val EMPTY_PROGRESS = 0
        const val FULL_PROGRESS = 100
    }
}