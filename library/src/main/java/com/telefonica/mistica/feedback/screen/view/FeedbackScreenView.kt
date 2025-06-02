package com.telefonica.mistica.feedback.screen.view

import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.content.Context
import android.graphics.PorterDuff
import android.graphics.PorterDuffColorFilter
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
import androidx.annotation.DrawableRes
import androidx.annotation.IntDef
import androidx.annotation.LayoutRes
import androidx.annotation.RawRes
import androidx.appcompat.content.res.AppCompatResources
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.graphics.drawable.DrawableCompat
import androidx.core.view.ViewCompat
import com.airbnb.lottie.LottieAnimationView
import com.airbnb.lottie.LottieProperty
import com.airbnb.lottie.model.KeyPath
import com.telefonica.mistica.R
import com.telefonica.mistica.button.ProgressButton
import com.telefonica.mistica.feedback.screen.haptics.HapticFeedbackType
import com.telefonica.mistica.feedback.screen.haptics.performHapticFeedback
import com.telefonica.mistica.util.convertDpToPx
import com.telefonica.mistica.util.getThemeColor
import com.telefonica.mistica.util.getMisticaThemeDrawable
import com.telefonica.mistica.util.getThemeRes
import androidx.core.graphics.drawable.toDrawable
import com.telefonica.mistica.compose.theme.values.ThemeVariant

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
    private lateinit var errorReference: TextView
    private lateinit var customContentContainer: FrameLayout
    private lateinit var buttonsContainer: LinearLayout
    private lateinit var firstButton: ProgressButton
    private lateinit var secondButton: Button

    private var type: Int = TYPE_INFO
    private var titleText: CharSequence = ""
    private var subtitleText: CharSequence = ""
    private var errorReferenceText: CharSequence = ""
    private var isLoading: Boolean = false

    @LayoutRes
    private var customContentLayout: Int? = null
    private var firstButtonText: CharSequence = ""
    private var firstButtonLoadingText: CharSequence = ""
    private var secondButtonText: CharSequence = ""
    private var secondButtonAsLink: Boolean = false
    private var isIconAnimated: Boolean = false
    private var shouldAnimateOnAttachedToWindow: Boolean = true

    private var firstButtonClickListener: OnClickListener? = null
    private var secondButtonClickListener: OnClickListener? = null

    @RawRes
    private var customAnimation: Int? = null

    @DrawableRes
    private var customIcon: Int? = null

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
        ViewCompat.setAccessibilityHeading(title, true)
    }

    fun setFeedbackSubtitle(text: CharSequence) {
        subtitleText = text
        subtitle.text = text
    }

    fun setFeedbackErrorReference(text: CharSequence) {
        errorReferenceText = text
        errorReference.text = text
        errorReference.visibility = if (text.isNotBlank() && type == TYPE_ERROR) {
            View.VISIBLE
        } else {
            View.GONE
        }
    }

    fun setCustomContentLayout(@LayoutRes layout: Int) {
        customContentLayout = layout
        configureCustomContentView()
    }

    fun setShouldAnimateOnAttached(animate: Boolean) {
        shouldAnimateOnAttachedToWindow = animate
    }

    fun setFeedbackFirstButtonText(text: CharSequence) {
        firstButtonText = text
        firstButton.setText(text)
        firstButton.visibility = if (text.isBlank()) View.GONE else View.VISIBLE
    }

    fun setFeedbackFirstButtonLoadingText(text: CharSequence) {
        firstButtonLoadingText = text
        firstButton.setLoadingText(text)
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

    fun setCustomIcon(customIcon: Int) {
        this.customIcon = customIcon
    }

    fun setCustomAnimation(customAnimation: Int) {
        this.customAnimation = customAnimation
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
            styledAttrs.getText(R.styleable.FeedbackScreen_feedbackErrorReference)?.let { errorReferenceText = it }
            customContentLayout = styledAttrs.getResourceId(
                R.styleable.FeedbackScreen_feedbackCustomContentLayout,
                TypedValue.TYPE_NULL
            )
                .takeIf { it != TypedValue.TYPE_NULL }
            styledAttrs.getText(R.styleable.FeedbackScreen_feedbackFirstButtonText)
                ?.let { firstButtonText = it }
            styledAttrs.getText(R.styleable.FeedbackScreen_feedbackFirstButtonLoadingText)
                ?.let { firstButtonLoadingText = it }
            styledAttrs.getText(R.styleable.FeedbackScreen_feedbackSecondButtonText)
                ?.let { secondButtonText = it }
            secondButtonAsLink =
                styledAttrs.getBoolean(R.styleable.FeedbackScreen_feedbackSecondButtonAsLink, false)
            shouldAnimateOnAttachedToWindow =
                styledAttrs.getBoolean(R.styleable.FeedbackScreen_shouldAnimateOnAttached, true)
            styledAttrs.getResourceId(R.styleable.FeedbackScreen_customAnimation, 0).takeIf { it != 0 }.let {
                customAnimation = it
            }
            styledAttrs.getResourceId(R.styleable.FeedbackScreen_customIcon, 0).takeIf { it != 0 }.let {
                customIcon = it
            }
            styledAttrs.recycle()
        }

        icon = findViewById(R.id.icon)
        title = findViewById(R.id.title)
        subtitle = findViewById(R.id.subtitle)
        errorReference = findViewById(R.id.error_reference)
        customContentContainer = findViewById(R.id.custom_content)
        buttonsContainer = findViewById(R.id.buttons_container)

        @LayoutRes val buttonsLayout: Int =
            if (isInversePresentation()) R.layout.screen_feedback_buttons_inverse else R.layout.screen_feedback_buttons
        val buttonsView = LayoutInflater.from(context).inflate(buttonsLayout, buttonsContainer, true)
        firstButton = buttonsView.findViewById(R.id.first_button)
        secondButton = buttonsView.findViewById(if (secondButtonAsLink) R.id.link_button else R.id.second_button)
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
        when {
            isInversePresentation() -> context.getMisticaThemeDrawable(R.attr.drawableBackgroundBrand)
            else -> context.getThemeColor(R.attr.colorBackground).toDrawable()
        }.let {
            background = it
        }
    }

    private fun configureIcon() {
        when (type) {
            TYPE_SUCCESS -> configureIcon(
                animationAttr = R.attr.feedbackScreenSuccessAnimation,
                imageAttr = R.attr.feedbackScreenSuccessIcon,
                colorAttr = getSuccessIconColor(),
            )

            TYPE_ERROR -> configureIcon(
                animationAttr = R.attr.feedbackScreenErrorAnimation,
                imageAttr = R.attr.feedbackScreenErrorIcon,
                colorAttr = R.attr.colorError
            )

            TYPE_INFO -> configureIconAsResource(
                animationResource = customAnimation ?: context.getThemeRes(R.attr.feedbackScreenInfoAnimation, false),
                imageResource = customIcon ?: context.getThemeRes(R.attr.feedbackScreenInfoIcon, false),
                colorAttr = R.attr.colorBrand
            )

        }
    }

    private fun getSuccessIconColor(): Int =
        if (isInversePresentation()) R.attr.colorInverse else R.attr.colorBrand

    private fun configureIcon(
        @AttrRes animationAttr: Int,
        @AttrRes imageAttr: Int,
        @AttrRes colorAttr: Int,
    ) {
        val animationResource: Int? = context.getThemeRes(animationAttr, false)
        val imageResource: Int? = context.getThemeRes(imageAttr, false)

        configureIconAsResource(animationResource, imageResource, colorAttr)
    }

    private fun configureIconAsResource(
        @RawRes animationResource: Int?,
        @DrawableRes imageResource: Int?,
        @AttrRes colorAttr: Int,
    ) {
        when {
            animationResource != null -> {
                icon.setAnimation(animationResource)
                icon.addValueCallback(
                    KeyPath("**"),
                    LottieProperty.COLOR_FILTER
                ) {
                    PorterDuffColorFilter(
                        context.getThemeColor(colorAttr),
                        PorterDuff.Mode.SRC_ATOP
                    )
                }
                icon.visibility = View.VISIBLE
            }

            imageResource != null -> {
                val unwrappedDrawable = AppCompatResources.getDrawable(context, imageResource)!!
                val drawable = DrawableCompat.wrap(unwrappedDrawable)
                DrawableCompat.setTint(drawable, context.getThemeColor(colorAttr))
                icon.setImageDrawable(drawable)
                icon.visibility = View.VISIBLE
            }

            else -> icon.visibility = View.GONE
        }
        isIconAnimated = animationResource != null
    }

    private fun configureTexts() {
        @ColorInt val titleTextColor: Int = context.getThemeColor(if (isInversePresentation()) R.attr.colorTextPrimaryInverse else R.attr.colorTextPrimary)
        title.setTextColor(titleTextColor)
        @ColorInt val subtitleTextColor: Int = context.getThemeColor(if (isInversePresentation()) R.attr.colorTextPrimaryInverse else R.attr.colorTextSecondary)
        subtitle.setTextColor(subtitleTextColor)
        setFeedbackTitle(titleText)
        setFeedbackSubtitle(subtitleText)
        setFeedbackErrorReference(errorReferenceText)
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
        setFeedbackFirstButtonLoadingText(firstButtonLoadingText)
        firstButtonClickListener?.let { setFirstButtonOnClick(it) }
        firstButton.setIsLoading(isLoading)

        secondButton =
            findViewById(if (secondButtonAsLink) R.id.link_button else R.id.second_button)
        setFeedbackSecondButtonText(secondButtonText)
        secondButtonClickListener?.let { setSecondButtonOnClick(it) }
    }

    private fun animateViewsOnFirstLayout() {
        if (shouldAnimateOnAttachedToWindow) {
            viewTreeObserver.addOnGlobalLayoutListener(
                object : ViewTreeObserver.OnGlobalLayoutListener {
                    override fun onGlobalLayout() {
                        viewTreeObserver.removeOnGlobalLayoutListener(this)
                        animateViews()
                    }
                }
            )
        }
    }

    fun animateViews() {
        if (isIconAnimated) {
            val titleAnimation = AnimatorSet().apply {
                playTogether(
                    getFadeInAnim(title),
                    getTranslationYAnim(title)
                )
                interpolator = getCubicBezierInterpolator()
                duration = TEXTS_ANIMATION_DURATION
                startDelay = TITLE_ANIMATION_DELAY
            }
            val subtitleAnimation = AnimatorSet().apply {
                playTogether(
                    getFadeInAnim(subtitle),
                    getTranslationYAnim(subtitle)
                )
                interpolator = getCubicBezierInterpolator()
                duration = TEXTS_ANIMATION_DURATION
                startDelay = SUBTITLE_ANIMATION_DELAY
            }

            val extraAnimation = AnimatorSet().apply {
                playTogether(
                    getFadeInAnim(customContentContainer),
                    getTranslationYAnim(customContentContainer),
                    getFadeInAnim(errorReference),
                    getTranslationYAnim(errorReference),
                )
                interpolator = getCubicBezierInterpolator()
                duration = TEXTS_ANIMATION_DURATION
                startDelay = if (subtitleText.isEmpty()) SUBTITLE_ANIMATION_DELAY else EXTRAS_ANIMATION_DELAY
            }

            title.alpha = 0F
            subtitle.alpha = 0F
            errorReference.alpha = 0F
            customContentContainer.alpha = 0F

            icon.playAnimation()
            titleAnimation.start()
            subtitleAnimation.start()
            extraAnimation.start()
            executeHapticFeedback()
        }
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
                        isInverseThemeVariant())

    private fun getBooleanThemeRes(@AttrRes attributeRes: Int): Boolean =
        context.getThemeRes(attributeRes)?.let { it != 0 } ?: false

    private fun isInverseThemeVariant(): Boolean {
        val typedValue = TypedValue()
        context.theme.resolveAttribute(R.attr.successFeedbackThemeVariant, typedValue,true)
        return typedValue.data == ThemeVariant.INVERSE.ordinal
    }

    companion object {
        const val TYPE_SUCCESS = 0
        const val TYPE_ERROR = 1
        const val TYPE_INFO = 2

        const val TEXTS_ANIMATION_DURATION = 800L
        const val TITLE_ANIMATION_DELAY = 600L
        const val SUBTITLE_ANIMATION_DELAY = 900L
        const val EXTRAS_ANIMATION_DELAY = 1_200L

        const val HAPTIC_FEEDBACK_DEFAULT_DELAY = 450L
        const val HAPTIC_FEEDBACK_ERROR_DELAY = 500L
    }
}
