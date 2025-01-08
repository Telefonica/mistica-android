package com.telefonica.mistica.stepper

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.PorterDuff
import android.graphics.PorterDuffColorFilter
import android.provider.Settings
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.view.animation.AlphaAnimation
import android.view.animation.Animation
import android.view.animation.AnimationSet
import android.view.animation.ScaleAnimation
import android.widget.FrameLayout
import android.widget.RelativeLayout
import android.widget.TextView
import com.airbnb.lottie.LottieAnimationView
import com.airbnb.lottie.LottieProperty
import com.airbnb.lottie.RenderMode
import com.airbnb.lottie.model.KeyPath
import com.airbnb.lottie.value.ScaleXY
import com.telefonica.mistica.R
import com.telefonica.mistica.util.getThemeColor
import com.telefonica.mistica.util.getThemeRes

internal class StepView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : FrameLayout(context, attrs, defStyleAttr) {

    private val selectedStepTextView: TextView
    private val selectedStepContainer: RelativeLayout
    private val unselectedStepTextView: TextView
    private val unselectedStepContainer: RelativeLayout
    private val checkIcon: LottieAnimationView
    private var stepStatus: State = State.UNSELECTED

    init {
        LayoutInflater.from(context).inflate(R.layout.step_view, this, true)

        selectedStepTextView = findViewById(R.id.selected_step_number)
        selectedStepContainer = findViewById(R.id.selected_step_container)
        unselectedStepTextView = findViewById(R.id.unselected_step_number)
        unselectedStepContainer = findViewById(R.id.unselected_step_container)
        checkIcon = findViewById(R.id.check_icon)

        scaleLayoutAccordingTextSize()

        setUpLottieAnimation()
    }

    private fun scaleLayoutAccordingTextSize() {
        val fontScale = Settings.System.getFloat(context.contentResolver, Settings.System.FONT_SCALE, 1F)
        val stepWidth = (resources.getDimension(R.dimen.stepper_step_width) * fontScale).toInt()

        selectedStepContainer.layoutParams = LayoutParams(stepWidth, stepWidth)
        unselectedStepContainer.layoutParams = LayoutParams(stepWidth, stepWidth)
        checkIcon.layoutParams = LayoutParams(stepWidth, stepWidth)
    }

    private fun setUpLottieAnimation() {
        val animationResource = context.getThemeRes(R.attr.stepperFinishedStepAnimation, false) ?: return
        val keyPath = KeyPath("**")

        with (checkIcon) {
            setAnimation(animationResource)
            setRenderMode(RenderMode.SOFTWARE)
            addValueCallback(
                keyPath,
                LottieProperty.COLOR_FILTER,
                { PorterDuffColorFilter(context.getThemeColor(R.attr.colorControlActive), PorterDuff.Mode.SRC_ATOP) }
            )
            addValueCallback(
                keyPath,
                LottieProperty.STROKE_WIDTH,
                { resources.getDimension(R.dimen.step_completed_icon_width) }
            )
            addValueCallback(
                keyPath,
                LottieProperty.TRANSFORM_SCALE,
                { ScaleXY(ANIMATION_SCALE, ANIMATION_SCALE) }
            )
        }
    }

    @SuppressLint("SetTextI18n")
    fun setStep(step: Int, isSelected: Boolean = false) {
        selectedStepTextView.text = step.toString()
        unselectedStepTextView.text = step.toString()

        if (isSelected) {
            stepStatus = State.SELECTED
            unselectedStepContainer.visibility = INVISIBLE
            selectedStepContainer.visibility = VISIBLE
        }
    }

    fun setUnselected() {
        animateSelection(fadeIn = unselectedStepContainer, fadeOut = selectedStepContainer)
        stepStatus = State.UNSELECTED
    }

    fun setSelected() {
        animateSelection(
            fadeIn = selectedStepContainer,
            fadeOut = if (stepStatus == State.UNSELECTED) unselectedStepContainer else null
        )
        stepStatus = State.SELECTED
    }

    fun setCompleted() {
        val containerToHide = if (stepStatus == State.SELECTED) selectedStepContainer else unselectedStepContainer
        containerToHide.fadeOut(withScale = true)

        checkIcon.visibility = VISIBLE
        checkIcon.playAnimation()

        stepStatus = State.COMPLETED
    }

    private fun animateSelection(fadeIn: View, fadeOut: View?) {
        if (stepStatus == State.COMPLETED) {
            checkIcon.fadeOut(hideOnAnimationEnd = false)
        }

        checkIcon.visibility = INVISIBLE

        fadeIn.fadeIn(withScale = stepStatus == State.COMPLETED)
        fadeOut?.fadeOut()
    }

    private fun View.fadeIn(withScale: Boolean = false) {
        visibility = VISIBLE

        val animationSet = if (withScale) {
            animationSet(fromAlpha = 0F, toAlpha = 1F, fromScale = 0F, toScale = 1F)
        } else {
            animationSet(fromAlpha = 0F, toAlpha = 1F, fromScale = null, toScale = null)
        }

        startAnimation(animationSet)
    }

    private fun View.fadeOut(withScale: Boolean = false, hideOnAnimationEnd: Boolean = true) {
        val animationSet = if (withScale) {
            animationSet(fromAlpha = 1F, toAlpha = 0F, fromScale = 1F, toScale = 0F)
        } else {
            animationSet(fromAlpha = 1F, toAlpha = 0F, fromScale = null, toScale = null)
        }

        if (hideOnAnimationEnd) {
            animationSet.setAnimationListener(object : Animation.AnimationListener {
                override fun onAnimationRepeat(animation: Animation?) {}
                override fun onAnimationStart(animation: Animation?) {}
                override fun onAnimationEnd(animation: Animation?) {
                    animationSet.setAnimationListener(null)
                    visibility = INVISIBLE
                    scaleX = 1F
                    scaleY = 1F
                }
            })
        }

        startAnimation(animationSet)
    }

    private fun animationSet(fromAlpha: Float, toAlpha: Float, fromScale: Float?, toScale: Float?): AnimationSet {
        val animationSet = AnimationSet(true)
        animationSet.repeatCount = 1
        animationSet.duration = ANIMATION_DURATION
        animationSet.addAnimation(AlphaAnimation(fromAlpha, toAlpha))

        if (fromScale != null && toScale != null) {
            animationSet.addAnimation(scaleAnimation(fromScale, toScale))
        }

        return animationSet
    }

    private fun scaleAnimation(from: Float, to: Float) = ScaleAnimation(
        from, to,
        from, to,
        Animation.RELATIVE_TO_SELF, 0.5F,
        Animation.RELATIVE_TO_SELF, 0.5F
    )

    enum class State {
        SELECTED, UNSELECTED, COMPLETED
    }

    private companion object {
        const val ANIMATION_DURATION = 300L
        const val ANIMATION_SCALE = 0.98F
    }
}