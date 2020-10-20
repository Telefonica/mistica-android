package com.telefonica.mistica.contentindicator

import android.content.Context
import android.os.Build
import android.util.AttributeSet
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.view.ViewOutlineProvider
import android.view.animation.*
import androidx.appcompat.widget.AppCompatTextView
import com.telefonica.mistica.R
import com.telefonica.mistica.util.getThemeColor

class ScrollContentIndicator @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : AppCompatTextView(context, attrs, defStyleAttr) {

    private var animationsEnabled = true

    init {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            setTextAppearance(R.style.AppTheme_TextAppearance_Preset7_Medium)
        } else {
            @Suppress("DEPRECATION")
            setTextAppearance(context, R.style.AppTheme_TextAppearance_Preset7_Medium)
        }
        layoutParams = ViewGroup.LayoutParams(
            ViewGroup.LayoutParams.WRAP_CONTENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        )
        gravity = Gravity.CENTER
        minWidth =
            context.resources.getDimension(R.dimen.scroll_content_indicator_min_width).toInt()

        val startEndPadding =
            context.resources.getDimension(R.dimen.scroll_content_start_end_padding).toInt()
        val topBottomPadding =
            context.resources.getDimension(R.dimen.scroll_content_top_bottom_padding).toInt()
        setPadding(startEndPadding, topBottomPadding, startEndPadding, topBottomPadding)

        setTextColor(context.getThemeColor(R.attr.colorTextPrimaryInverse))

        isClickable = true
        isFocusable = true
        background = context.getDrawable(R.drawable.scroll_content_indicator_clickable_background)

        elevation = context.resources.getDimension(R.dimen.scroll_content_elevation)
        clipToOutline = true
        outlineProvider = ViewOutlineProvider.BACKGROUND

        visibility = View.GONE
    }

    override fun setVisibility(visibility: Int) {
        if (visibility == getVisibility()) {
            return
        }

        when (visibility) {
            View.VISIBLE -> runEaseOutAnimation()
            View.GONE -> runEaseInAnimation()
            else -> Unit
        }

        super.setVisibility(visibility)
    }

    open fun disableAnimations() {
        animationsEnabled = false
    }

    open fun enableAnimations() {
        animationsEnabled = true
    }

    private fun runEaseOutAnimation() {
        val scaleAnimation = ScaleAnimation(
            IN_SCALE_FROM_X,
            IN_SCALE_TO_X,
            IN_SCALE_FROM_Y,
            IN_SCALE_TO_Y,
            Animation.RELATIVE_TO_SELF,
            SCALE_PIVOT_X,
            Animation.RELATIVE_TO_SELF,
            SCALE_PIVOT_Y
        )
        val alphaAnimation = AlphaAnimation(
            IN_ALPHA_FROM,
            IN_ALPHA_TO
        )

        AnimationSet(SHARE_INTERPOLATOR).run {
            addAnimation(scaleAnimation)
            addAnimation(alphaAnimation)
            interpolator = DecelerateInterpolator()
            duration = if (animationsEnabled) ANIM_DURATION_MS else 0
            startAnimation(this)
        }
    }

    private fun runEaseInAnimation() {
        val scaleAnimation = ScaleAnimation(
            OUT_SCALE_FROM_X,
            OUT_SCALE_TO_X,
            OUT_SCALE_FROM_Y,
            OUT_SCALE_TO_Y,
            Animation.RELATIVE_TO_SELF,
            SCALE_PIVOT_X,
            Animation.RELATIVE_TO_SELF,
            SCALE_PIVOT_Y
        )
        val alphaAnimation = AlphaAnimation(
            OUT_ALPHA_FROM,
            OUT_ALPHA_TO
        )

        AnimationSet(SHARE_INTERPOLATOR).run {
            addAnimation(scaleAnimation)
            addAnimation(alphaAnimation)
            interpolator = AccelerateInterpolator()
            duration = if (animationsEnabled) ANIM_DURATION_MS else 0
            startAnimation(this)
        }
    }

    private companion object {
        const val IN_SCALE_FROM_X = 0f
        const val IN_SCALE_FROM_Y = 0f
        const val IN_SCALE_TO_X = 1f
        const val IN_SCALE_TO_Y = 1f

        const val OUT_SCALE_FROM_X = 1f
        const val OUT_SCALE_FROM_Y = 1f
        const val OUT_SCALE_TO_X = 0f
        const val OUT_SCALE_TO_Y = 0f

        const val IN_ALPHA_FROM = 0f
        const val IN_ALPHA_TO = 1f

        const val OUT_ALPHA_FROM = 1f
        const val OUT_ALPHA_TO = 0f

        const val SCALE_PIVOT_X = 0.5f
        const val SCALE_PIVOT_Y = 0.5f

        const val SHARE_INTERPOLATOR = true

        const val ANIM_DURATION_MS = 300L
    }
}