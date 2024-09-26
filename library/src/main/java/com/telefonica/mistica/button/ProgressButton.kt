package com.telefonica.mistica.button

import android.animation.Animator
import android.animation.AnimatorSet
import android.animation.ArgbEvaluator
import android.animation.ObjectAnimator
import android.annotation.SuppressLint
import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Color
import android.graphics.PorterDuff
import android.graphics.Rect
import android.util.AttributeSet
import android.view.Gravity
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.view.animation.PathInterpolator
import android.widget.FrameLayout
import android.widget.ProgressBar
import android.widget.TextView
import androidx.annotation.ColorInt
import androidx.annotation.StringRes
import androidx.appcompat.content.res.AppCompatResources
import androidx.core.graphics.ColorUtils
import com.google.android.material.button.MaterialButton
import com.telefonica.mistica.R
import com.telefonica.mistica.util.setAlpha

class ProgressButton : FrameLayout {

    private val progressBar: ProgressBar = ProgressBar(context)
    private val buttonNormal: MaterialButton
    private val buttonLoading: MaterialButton
    private val buttonBackground: MaterialButton

    private lateinit var originalTextColors: ColorStateList

    var isLoading: Boolean = false
        private set
    private var currentAnimation: AnimatorSet? = null

    constructor(context: Context) : super(context) {
        buttonNormal = MaterialButton(context)
        buttonLoading = MaterialButton(context)
        buttonBackground = MaterialButton(context)
        init()
    }

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        buttonNormal = MaterialButton(context, attrs)
        buttonLoading = MaterialButton(context, attrs)
        buttonBackground = MaterialButton(context, attrs)
        init(attrs)
    }

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        buttonNormal = MaterialButton(context, attrs, defStyleAttr)
        buttonLoading = MaterialButton(context, attrs, defStyleAttr)
        buttonBackground = MaterialButton(context, attrs, defStyleAttr)
        init(attrs, defStyleAttr)
    }

    @SuppressLint("ClickableViewAccessibility")
    private fun init(attrs: AttributeSet? = null, defStyleAttr: Int = 0) {
        setupAttributes(attrs, defStyleAttr)
        setupViewProperties()
        setupButtonNormal()
        setupButtonLoading()
        setupProgressBar()
        setButtonBackground()
        addViews()
        setVisibilityAndColors()
    }

    fun getText(): CharSequence =
        buttonBackground.text

    fun setText(text: CharSequence) {
        buttonNormal.text = text
        if (!isLoading) {
            buttonBackground.text = text
        }
    }

    fun setText(@StringRes textId: Int) {
        setText(context.getString(textId))
    }

    fun setLoadingText(text: CharSequence) {
        buttonLoading.text = text
        if (isLoading) {
            buttonBackground.text = text
        }
    }

    override fun setOnClickListener(l: OnClickListener?) {
        buttonBackground.setOnClickListener(l)
    }

    override fun setEnabled(enabled: Boolean) {
        super.setEnabled(enabled)
        setAlpha(enabled)
        buttonBackground.isEnabled = enabled
        buttonNormal.isEnabled = enabled
        buttonLoading.isEnabled = enabled
        progressBar.isEnabled = enabled
    }

    fun setIsLoading(loading: Boolean) {
        if (loading) {
            showLoading()
        } else {
            hideLoading()
        }
    }

    fun showLoading() {
        if (!isLoading) {
            switchState()
        }
    }

    fun hideLoading() {
        if (isLoading) {
            switchState()
        }
    }

    private fun setupAttributes(attrs: AttributeSet?, defStyleAttr: Int) {
        if (attrs != null) {
            val theme = context.theme
            val styledAttrs =
                theme.obtainStyledAttributes(attrs, R.styleable.Button, defStyleAttr, 0)
            try {
                isLoading = styledAttrs.getBoolean(R.styleable.Button_isLoading, false)
            } finally {
                styledAttrs.recycle()
            }
        }
    }

    private fun setupViewProperties() {
        this.importantForAccessibility = IMPORTANT_FOR_ACCESSIBILITY_NO
        isClickable = false
        setPadding(0, 0, 0, 0)
        setBackgroundColor(Color.TRANSPARENT)
        originalTextColors = buttonNormal.textColors
    }

    private fun setupButtonNormal() {
        buttonNormal.apply {
            id = NO_ID
            importantForAccessibility = IMPORTANT_FOR_ACCESSIBILITY_NO
            layoutParams = LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
            )
            showTextOnly()
        }
    }

    private fun setupButtonLoading() {
        buttonLoading.apply {
            id = NO_ID
            importantForAccessibility = IMPORTANT_FOR_ACCESSIBILITY_NO
            layoutParams = LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
            )
            showTextOnly()
            icon = AppCompatResources.getDrawable(context, R.drawable.empty_material_button_icon)
            text = ""
        }
    }

    private fun setupProgressBar() {
        progressBar.apply {
            layoutParams = LayoutParams(buttonLoading.iconSize, buttonLoading.iconSize)
                .apply {
                    gravity = Gravity.CENTER
                }
            importantForAccessibility = IMPORTANT_FOR_ACCESSIBILITY_NO
            isIndeterminate = true
            indeterminateTintMode = PorterDuff.Mode.SRC_IN
            visibility = INVISIBLE
        }
    }

    private fun setButtonBackground() {
        buttonBackground.apply {
            id = NO_ID
            importantForAccessibility = IMPORTANT_FOR_ACCESSIBILITY_YES
            layoutParams = LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
            )
            icon = null
            setTextColor(Color.TRANSPARENT)
            visibility = VISIBLE
            setOnTouchListener { view, event ->
                when (event.action) {
                    MotionEvent.ACTION_DOWN -> {
                        buttonNormal.isPressed = true
                        buttonLoading.isPressed = true
                    }

                    MotionEvent.ACTION_MOVE -> {
                        val outsideBounds =
                            event.x < 0 || event.y < 0 || event.x > view.measuredWidth || event.y > view.measuredHeight
                        buttonNormal.isPressed = !outsideBounds
                        buttonLoading.isPressed = !outsideBounds
                    }

                    MotionEvent.ACTION_UP, MotionEvent.ACTION_CANCEL -> {
                        buttonNormal.isPressed = false
                        buttonLoading.isPressed = false
                        view.performClick()
                    }
                }
                false
            }
        }
    }

    private fun addViews() {
        addView(buttonBackground)
        addView(buttonNormal)
        addView(buttonLoading)
        addView(progressBar)
    }

    private fun switchState() {
        currentAnimation?.cancel()

        val maxTranslation: Float =
            resources.getDimensionPixelSize(R.dimen.button_max_animation_translation).toFloat()

        currentAnimation = AnimatorSet().apply {
            playTogether(
                getCurrentTextColorFadeAnim(buttonNormal, !isLoading),
                getTranslationYAnim(
                    buttonNormal,
                    floatArrayOf(0F, -maxTranslation).reverseIfLoading()
                ),
                getCurrentTextColorFadeAnim(buttonLoading, isLoading).apply {
                    addUpdateListener {
                        progressBar.indeterminateTintList = buttonLoading.textColors
                    }
                },
                getTranslationYAnim(
                    buttonLoading,
                    floatArrayOf(maxTranslation, 0F).reverseIfLoading()
                ).apply {
                    addUpdateListener { progressBar.translationY = buttonLoading.translationY }
                }
            )
            interpolator = getCubicBezierInterpolator()
            duration = ANIMATION_DURATION
            addListener(object : Animator.AnimatorListener {
                override fun onAnimationRepeat(animator: Animator) {}

                override fun onAnimationEnd(animator: Animator) {
                    setVisibilityAndColors()
                    if (!isLoading) {
                        buttonBackground.isClickable = true
                    }
                }

                override fun onAnimationCancel(animator: Animator) {
                    animator.end()
                }

                override fun onAnimationStart(animator: Animator) {
                    if (!buttonLoading.text.isNullOrBlank()) {
                        setProgressBarHorizontalPosition()
                    }
                    isLoading = !isLoading
                    buttonNormal.visibility = View.VISIBLE
                    buttonLoading.visibility = View.VISIBLE
                    progressBar.visibility = View.VISIBLE
                    if (isLoading) {
                        buttonBackground.isClickable = false
                    }
                }
            })
        }
        currentAnimation?.start()
    }

    private fun setVisibilityAndColors() {
        buttonNormal.visibility = if (isLoading) View.INVISIBLE else View.VISIBLE
        buttonLoading.visibility = if (isLoading) View.VISIBLE else View.INVISIBLE
        progressBar.visibility = if (isLoading) View.VISIBLE else View.INVISIBLE
        buttonBackground.text = if (isLoading) buttonLoading.text else buttonNormal.text

        buttonNormal.setTextColor(originalTextColors)
        buttonLoading.setTextColor(originalTextColors)
        progressBar.translationY = 0F
        progressBar.indeterminateTintList = originalTextColors
    }

    private fun MaterialButton.showTextOnly() {
        background = null
        isClickable = false
        isFocusable = false
        strokeWidth = 0
        rippleColor = ColorStateList.valueOf(Color.TRANSPARENT)
    }

    private fun setProgressBarHorizontalPosition() {
        val bounds = Rect()
        buttonLoading.paint.getTextBounds(
            buttonLoading.text.toString(),
            0,
            buttonLoading.text.length,
            bounds
        )
        val textWidth: Float =
            bounds.width().toFloat() + buttonLoading.iconSize + buttonLoading.iconPadding
        progressBar.x = (buttonLoading.width - textWidth) / 2
    }

    private fun getCurrentTextColorFadeAnim(view: TextView, out: Boolean): ObjectAnimator {
        val color = getCurrentTextColor()
        val transparentColor = ColorUtils.setAlphaComponent(color, 0)

        val fromColor = if (out) color else transparentColor
        val toColor = if (out) transparentColor else color

        return ObjectAnimator.ofInt(view, "textColor", fromColor, toColor)
            .apply {
                setEvaluator(ArgbEvaluator())
            }
    }

    @Suppress("SpreadOperator")
    private fun getTranslationYAnim(view: View, positions: FloatArray): ObjectAnimator =
        ObjectAnimator.ofFloat(view, "translationY", *positions)

    private fun getCubicBezierInterpolator(): PathInterpolator =
        PathInterpolator(0.77F, 0F, 0.175F, 1F)

    @ColorInt
    private fun getCurrentTextColor(): Int =
        if (isLoading) {
            buttonLoading.currentTextColor
        } else {
            buttonNormal.currentTextColor
        }

    private fun FloatArray.reverseIfLoading(): FloatArray =
        if (isLoading) reversedArray() else this

    private companion object {
        private const val ANIMATION_DURATION = 300L
        private const val NO_ID = -1
    }
}
