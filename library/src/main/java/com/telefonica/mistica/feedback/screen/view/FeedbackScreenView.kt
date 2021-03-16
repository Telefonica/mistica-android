package com.telefonica.mistica.feedback.screen.view

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.content.Context
import android.graphics.drawable.ColorDrawable
import android.util.AttributeSet
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.View
import android.view.ViewTreeObserver
import android.view.animation.PathInterpolator
import android.widget.Button
import android.widget.FrameLayout
import android.widget.LinearLayout
import android.widget.TextView
import androidx.annotation.AttrRes
import androidx.annotation.ColorInt
import androidx.annotation.IntDef
import androidx.annotation.LayoutRes
import androidx.constraintlayout.widget.ConstraintLayout
import com.airbnb.lottie.LottieAnimationView
import com.telefonica.mistica.R
import com.telefonica.mistica.button.ProgressButton
import com.telefonica.mistica.feedback.screen.haptics.HapticFeedbackType
import com.telefonica.mistica.feedback.screen.haptics.performHapticFeedback
import com.telefonica.mistica.util.background.GradientBackgroundFactory
import com.telefonica.mistica.util.convertDpToPx
import com.telefonica.mistica.util.getThemeColor
import com.telefonica.mistica.util.getThemeRes

class FeedbackScreenView : ConstraintLayout {

    @Retention(AnnotationRetention.SOURCE)
    @IntDef(
        TYPE_SUCCESS,
        TYPE_ERROR,
        TYPE_INFO
    )
    annotation class FeedbackType

    private lateinit var icon: LottieAnimationView
    private lateinit var title: TextView
    private lateinit var subtitle: TextView
    private lateinit var customContentContainer: FrameLayout
    private lateinit var buttonsContainer: LinearLayout
    private lateinit var firstButton: ProgressButton
    private lateinit var secondButton: Button

    private var type: Int = TYPE_INFO
    private var titleText: CharSequence = ""
    private var subtitleText: CharSequence = ""
    private var isLoading: Boolean = false

    @LayoutRes
    private var customContentLayout: Int? = null
    private var firstButtonText: CharSequence = ""
    private var secondButtonText: CharSequence = ""
    private var secondButtonAsLink: Boolean = false
    private var isIconAnimated: Boolean = false

    private var firstButtonClickListener: OnClickListener? = null
    private var secondButtonClickListener: OnClickListener? = null

    constructor(context: Context) : super(context) {
        init(context)
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        init(context, attrs)
    }

    constructor(context: Context, attrs: AttributeSet, defStyleAttr: Int) : super(
        context,
        attrs,
        defStyleAttr
    ) {
        init(context, attrs, defStyleAttr)
    }

    fun setFeedbackType(@FeedbackType type: Int) {
        this.type = type
        configureView()
    }

    @FeedbackType
    fun getFeedbackType(): Int = this.type

    fun setFeedbackTitle(text: CharSequence) {
        titleText = text
        title.text = text
    }

    fun setFeedbackSubtitle(text: CharSequence) {
        subtitleText = text
        subtitle.text = text
    }

    fun setCustomContentLayout(@LayoutRes layout: Int) {
        customContentLayout = layout
        configureCustomContentView()
    }

    fun setFeedbackFirstButtonText(text: CharSequence) {
        firstButtonText = text
        firstButton.setText(text)
        firstButton.visibility = if (text.isBlank()) View.GONE else View.VISIBLE
    }

    fun setFeedbackSecondButtonText(text: CharSequence) {
        secondButtonText = text
        secondButton.text = text
        secondButton.visibility = if (text.isBlank()) View.GONE else View.VISIBLE
    }

    fun setFeedbackSecondButtonAsLink(asLink: Boolean) {
        secondButtonAsLink = asLink
        configureButtons()
    }

    fun setFirstButtonOnClick(clickListener: OnClickListener) {
        firstButtonClickListener = clickListener
        if (::firstButton.isInitialized) {
            firstButton.setOnClickListener(clickListener)
        }
    }

    fun setSecondButtonOnClick(clickListener: OnClickListener) {
        secondButtonClickListener = clickListener
        if (::secondButton.isInitialized) {
            secondButton.setOnClickListener(clickListener)
        }
    }

    fun getFirstButtonText(): String = firstButtonText.toString()

    fun setIsLoading(isLoading: Boolean) {
        val wasLoading = this.isLoading
        this.isLoading = isLoading
        firstButton.setIsLoading(isLoading)
        if (wasLoading && !isLoading) {
            icon.playAnimation()
            executeHapticFeedback()
        }
    }

    private fun init(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) {
        LayoutInflater.from(context).inflate(R.layout.screen_feedback, this, true)

        if (attrs != null) {
            val theme = context.theme
            val styledAttrs =
                theme.obtainStyledAttributes(attrs, R.styleable.FeedbackScreen, defStyleAttr, 0)
            type = styledAttrs.getInteger(R.styleable.FeedbackScreen_feedbackType, TYPE_INFO)
            styledAttrs.getText(R.styleable.FeedbackScreen_feedbackTitle)?.let { titleText = it }
            styledAttrs.getText(R.styleable.FeedbackScreen_feedbackSubtitle)
                ?.let { subtitleText = it }
            customContentLayout = styledAttrs.getResourceId(
                R.styleable.FeedbackScreen_feedbackCustomContentLayout,
                TypedValue.TYPE_NULL
            )
                .takeIf { it != TypedValue.TYPE_NULL }
            styledAttrs.getText(R.styleable.FeedbackScreen_feedbackFirstButtonText)
                ?.let { firstButtonText = it }
            styledAttrs.getText(R.styleable.FeedbackScreen_feedbackSecondButtonText)
                ?.let { secondButtonText = it }
            secondButtonAsLink =
                styledAttrs.getBoolean(R.styleable.FeedbackScreen_feedbackSecondButtonAsLink, false)
            styledAttrs.recycle()
        }

        icon = findViewById(R.id.icon)
        title = findViewById(R.id.title)
        subtitle = findViewById(R.id.subtitle)
        customContentContainer = findViewById(R.id.custom_content)
        buttonsContainer = findViewById(R.id.buttons_container)
    }

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()
        configureView()
        animateViewsOnFirstLayout()
    }

    private fun configureView() {
        configureBackground()
        configureIcon()
        configureTexts()
        configureCustomContentView()
        configureButtons()
    }

    private fun configureBackground() {
        when (type) {
            TYPE_SUCCESS -> when {
                getBooleanThemeRes(R.attr.feedbackScreenSuccessWithGradient) -> GradientBackgroundFactory.getBackground(
                    context
                )
                getBooleanThemeRes(R.attr.feedbackScreenSuccessInverse) -> ColorDrawable(
                    context.getThemeColor(
                        R.attr.colorBackgroundBrand
                    )
                )
                else -> ColorDrawable(context.getThemeColor(R.attr.colorBackground))
            }
            else -> ColorDrawable(context.getThemeColor(R.attr.colorBackground))
        }.let {
            background = it
        }
    }

    private fun configureIcon() {
        when (type) {
            TYPE_SUCCESS -> configureIcon(
                R.attr.feedbackScreenSuccessAnimation,
                R.attr.feedbackScreenSuccessIcon
            )
            TYPE_ERROR -> configureIcon(
                R.attr.feedbackScreenErrorAnimation,
                R.attr.feedbackScreenErrorIcon
            )
            else -> configureIcon(R.attr.feedbackScreenInfoAnimation, R.attr.feedbackScreenInfoIcon)
        }
    }

    private fun configureIcon(@AttrRes animationAttr: Int, @AttrRes imageAttr: Int) {
        val animationResource: Int? = context.getThemeRes(animationAttr, false)
        val imageResource: Int? = context.getThemeRes(imageAttr, false)
        when {
            animationResource != null -> {
                icon.setAnimation(animationResource)
                icon.visibility = View.VISIBLE
            }
            imageResource != null -> {
                icon.setImageResource(imageResource)
                icon.visibility = View.VISIBLE
            }
            else -> icon.visibility = View.GONE
        }
        isIconAnimated = animationResource != null
        icon.addOnLayoutChangeListener { _, _, _, _, _, _, _, _, _ ->
            icon.translationX = -(icon.width - context.convertDpToPx(64).toFloat()) / 2
        }
    }

    private fun configureTexts() {
        @ColorInt val titleTextColor: Int =
            context.getThemeColor(if (isInversePresentation()) R.attr.colorTextPrimaryInverse else R.attr.colorTextPrimary)
        title.setTextColor(titleTextColor)
        @ColorInt val subtitleTextColor: Int =
            context.getThemeColor(if (isInversePresentation()) R.attr.colorTextPrimaryInverse else R.attr.colorTextSecondary)
        subtitle.setTextColor(subtitleTextColor)
        setFeedbackTitle(titleText)
        setFeedbackSubtitle(subtitleText)
    }

    private fun configureCustomContentView() {
        customContentContainer.removeAllViews()
        customContentLayout?.let {
            LayoutInflater.from(context).inflate(it, customContentContainer, false)
            customContentContainer.visibility = View.VISIBLE
        }
    }

    private fun configureButtons() {
        buttonsContainer.removeAllViews()
        @LayoutRes val layout: Int =
            if (isInversePresentation()) R.layout.screen_feedback_buttons_inverse else R.layout.screen_feedback_buttons
        LayoutInflater.from(context).inflate(layout, buttonsContainer, true)

        firstButton = findViewById(R.id.first_button)
        setFeedbackFirstButtonText(firstButtonText)
        firstButtonClickListener?.let { setFirstButtonOnClick(it) }
        firstButton.setIsLoading(isLoading)

        secondButton =
            findViewById(if (secondButtonAsLink) R.id.link_button else R.id.second_button)
        setFeedbackSecondButtonText(secondButtonText)
        secondButtonClickListener?.let { setSecondButtonOnClick(it) }
    }

    private fun animateViewsOnFirstLayout() {
        viewTreeObserver.addOnGlobalLayoutListener(
            object : ViewTreeObserver.OnGlobalLayoutListener {
                override fun onGlobalLayout() {
                    viewTreeObserver.removeOnGlobalLayoutListener(this)
                    if (isIconAnimated) {
                        animateViews()
                    }
                }
            }
        )
    }

    private fun animateViews() {
        val animation = AnimatorSet().apply {
            playTogether(
                getFadeInAnim(title),
                getFadeInAnim(subtitle),
                getFadeInAnim(customContentContainer),
                getTranslationYAnim(title),
                getTranslationYAnim(subtitle),
                getTranslationYAnim(customContentContainer)
            )
            interpolator = getCubicBezierInterpolator()
            duration = TEXTS_ANIMATION_DURATION
            startDelay = TEXTS_ANIMATION_DELAY
        }

        title.alpha = 0F
        subtitle.alpha = 0F
        customContentContainer.alpha = 0F

        animation.start()
        icon.playAnimation()
        executeHapticFeedback()
    }

    private fun executeHapticFeedback() {
        postDelayed(
            { performHapticFeedback() },
            if (type == TYPE_ERROR) HAPTIC_FEEDBACK_ERROR_DELAY else HAPTIC_FEEDBACK_DEFAULT_DELAY
        )
    }

    private fun getTranslationYAnim(view: View): ObjectAnimator {
        val pixels: Float = context.convertDpToPx(20).toFloat()
        return ObjectAnimator.ofFloat(view, "translationY", pixels, 0F)
    }

    private fun getFadeInAnim(view: View): ObjectAnimator =
        ObjectAnimator.ofFloat(view, "alpha", 0F, 1F)

    @Suppress("MagicNumber")
    private fun getCubicBezierInterpolator(): PathInterpolator =
        PathInterpolator(0.215F, 0.61F, 0.355F, 1F)

    private fun performHapticFeedback() {
        when (type) {
            TYPE_SUCCESS -> context.performHapticFeedback(HapticFeedbackType.SUCCESS)
            TYPE_ERROR -> context.performHapticFeedback(HapticFeedbackType.ERROR)
        }
    }

    private fun isInversePresentation(): Boolean =
        type == TYPE_SUCCESS &&
                (getBooleanThemeRes(R.attr.feedbackScreenSuccessWithGradient) ||
                        getBooleanThemeRes(R.attr.feedbackScreenSuccessInverse))

    private fun getBooleanThemeRes(@AttrRes attributeRes: Int): Boolean =
        context.getThemeRes(attributeRes)?.let { it != 0 } ?: false

    companion object {
        const val TYPE_SUCCESS = 0
        const val TYPE_ERROR = 1
        const val TYPE_INFO = 2

        const val TEXTS_ANIMATION_DURATION = 800L
        const val TEXTS_ANIMATION_DELAY = 200L

        const val HAPTIC_FEEDBACK_DEFAULT_DELAY = 450L
        const val HAPTIC_FEEDBACK_ERROR_DELAY = 500L
    }
}