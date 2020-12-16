package com.telefonica.mistica.stepper

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.FrameLayout
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import androidx.constraintlayout.widget.ConstraintSet.END
import androidx.constraintlayout.widget.ConstraintSet.BOTTOM
import androidx.constraintlayout.widget.ConstraintSet.START
import androidx.constraintlayout.widget.ConstraintSet.TOP
import androidx.databinding.BindingMethod
import androidx.databinding.BindingMethods
import com.telefonica.mistica.R
import kotlin.math.roundToInt

@BindingMethods(
    BindingMethod(
        type = DeterminateStepperView::class,
        attribute = "maxSteps",
        method = "setMaxSteps"
    ),
    BindingMethod(
        type = DeterminateStepperView::class,
        attribute = "step",
        method = "setStep"
    )
)
class DeterminateStepperView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : FrameLayout(context, attrs, defStyleAttr) {

    private var maxSteps = 0
    private var currentStep = 0
    private var isDetermined = true
    private val steps = mutableListOf<StepView>()
    private val progressBars = mutableListOf<IndeterminateStepperView>()

    private var indeterminateStepper: IndeterminateStepperView? = null

    init {
        if (attrs != null) {
            val styledAttrs = context.theme.obtainStyledAttributes(
                attrs,
                R.styleable.DeterminateStepperView,
                defStyleAttr,
                0
            )

            val maxSteps = styledAttrs.getInteger(R.styleable.DeterminateStepperView_maxSteps, -1)
            if (maxSteps >= 0) {
                setMaxSteps(maxSteps)
            }
        }
    }

    fun setMaxSteps(maxSteps: Int) {
        reset()

        this.maxSteps = maxSteps
        isDetermined = maxSteps <= MAX_DETERMINED_STEPS

        if (isDetermined) {
            setUpDeterminedStepper()
        } else {
            setUpIndeterminateStepper()
        }
    }

    private fun reset() {
        this.removeAllViews()
        steps.clear()
        progressBars.clear()
        currentStep = 0
    }

    private fun setUpDeterminedStepper() {
        LayoutInflater.from(context).inflate(R.layout.determinate_stepper_layout, this, true)
        val container = findViewById<ConstraintLayout>(R.id.stepper_container)

        createDeterminedSteps(container)
        setUpDeterminedLayout(container)
    }

    private fun createDeterminedSteps(container: ConstraintLayout) {
        createFirstDeterminedStep(container)
        createRemainingDeterminedSteps(container)
    }

    private fun createFirstDeterminedStep(container: ConstraintLayout) {
        val firstStep = StepView(context).apply {
            setStep(FIRST_STEP)
            setSelected()
            id = View.generateViewId()
        }
        steps.add(firstStep)
        container.addView(firstStep)
    }

    private fun createRemainingDeterminedSteps(container: ConstraintLayout) {
        for (i in 2..maxSteps) {
            val step = StepView(context).apply {
                id = View.generateViewId()
                setStep(i)
            }
            steps.add(step)
            container.addView(step)

            val progressBar = IndeterminateStepperView(context).apply {
                id = View.generateViewId()
                layoutParams = ConstraintLayout.LayoutParams(
                    ConstraintLayout.LayoutParams.MATCH_CONSTRAINT_SPREAD,
                    ConstraintLayout.LayoutParams.WRAP_CONTENT
                )
            }
            progressBars.add(progressBar)
            container.addView(progressBar)
        }
    }

    private fun setUpDeterminedLayout(container: ConstraintLayout) {
        val constraintSet = ConstraintSet()
        constraintSet.clone(container)

        constraintSet.connect(steps.first().id, START, container.id, START, 0)

        val margin = resources.getDimension(R.dimen.stepper_step_margin).roundToInt()
        for (i in 0 until progressBars.size) {
            val progressBar = progressBars[i]
            val previousStep = steps[i]
            val nextStep = steps[i + 1]

            constraintSet.connect(progressBar.id, START, previousStep.id, END, margin)
            constraintSet.connect(progressBar.id, END, nextStep.id, START, margin)

            constraintSet.connect(progressBar.id, TOP, container.id, TOP, margin)
            constraintSet.connect(progressBar.id, BOTTOM, container.id, BOTTOM, margin)

            constraintSet.connect(previousStep.id, END, progressBar.id, START, 0)
            constraintSet.connect(nextStep.id, START, progressBar.id, END, 0)
        }

        constraintSet.connect(steps.last().id, END, container.id, END, 0)

        constraintSet.applyTo(container)
    }

    private fun setUpIndeterminateStepper() {
        indeterminateStepper = IndeterminateStepperView(context)
        setIndeterminateStep(FIRST_STEP)
        addView(indeterminateStepper)
    }

    fun setStep(step: Int) {
        when {
            step > maxSteps -> complete()
            step <= 0 -> setStepSafe(FIRST_STEP)
            else -> setStepSafe(step)
        }
    }

    private fun setStepSafe(step: Int) {
        if (isDetermined) {
            setDeterminedStep(step)
        } else {
            setIndeterminateStep(step)
        }
    }

    private fun setDeterminedStep(step: Int) {
        val nextStep = step - 1

        if (nextStep > currentStep) {
            increaseStepsUntil(nextStep)
        } else if (nextStep < currentStep) {
            decreaseStepsUntil(nextStep)
        }

        steps[nextStep].setSelected()
        currentStep = nextStep
    }

    private fun increaseStepsUntil(step: Int) {
        for (i in currentStep until step) {
            steps[i].setCompleted()
            if (i - 1 >= 0) {
                progressBars[i - 1].complete()
            }
        }

        if (step - 1 >= 0 && step < maxSteps) {
            progressBars[step - 1].complete()
        }
    }

    private fun decreaseStepsUntil(step: Int) {
        for (i in currentStep downTo step + 1) {
            steps[i].setUnselected()
            if (i - 1 >= 0) {
                progressBars[i - 1].reset()
            }
        }
    }

    private fun setIndeterminateStep(step: Int) {
        val progress = (MAX_INDETERMINATE_PROGRESS / (maxSteps + 1)) * step
        indeterminateStepper?.setProgress(progress.roundToInt())
    }

    private fun complete() {
        if (isDetermined) {
            increaseStepsUntil(maxSteps)
            currentStep = maxSteps - 1
        } else {
            indeterminateStepper?.complete()
        }
    }

    private companion object {
        const val FIRST_STEP = 1
        const val MAX_DETERMINED_STEPS = 5
        const val MAX_INDETERMINATE_PROGRESS = 100.0
    }
}
