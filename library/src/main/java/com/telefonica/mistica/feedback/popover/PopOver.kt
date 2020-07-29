package com.telefonica.mistica.feedback.popover

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.animation.ObjectAnimator
import android.app.Activity
import android.content.Context
import android.util.TypedValue
import android.view.View
import android.view.ViewGroup
import android.view.ViewGroup.LayoutParams
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.telefonica.mistica.feedback.popover.PopOverView.PopOverClickListener

open class PopOver(
    private val context: Context,
    private var targetView: View?
) {
    private var popOverView: PopOverView? = null
    private var listener: PopOverClickListener? = null
    private var tooltipPresentationMode: View? = null
    private var popOverData: PopOverData = createBaseToolTip()

    val isShown: Boolean
        get() = popOverView != null

    open fun setTitle(@StringRes stringId: Int): PopOver = apply { popOverData = popOverData.copy(title = context.getString(stringId)) }

    open fun setTitle(string: String): PopOver = apply { popOverData = popOverData.copy(title = string) }

    open fun setImage(@DrawableRes imageRes: Int): PopOver = apply { popOverData = popOverData.copy(imageRes = imageRes) }

    open fun setDescription(@StringRes stringId: Int): PopOver = apply { popOverData = popOverData.copy(description = context.getString(stringId)) }

    open fun setDescription(string: String): PopOver = apply { popOverData = popOverData.copy(description = string) }

    open fun setListener(listener: PopOverClickListener): PopOver = apply { this.listener = listener }

    open fun show(activity: Activity): PopOver = apply { show(activity.window.decorView as ViewGroup, targetView) }

    open fun show(containerView: View): PopOver = apply { show(containerView as ViewGroup, targetView) }

    open fun hide() {
        if (popOverView == null) {
            return
        }
        val animator = ObjectAnimator.ofFloat<View>(popOverView, View.ALPHA, 1f, 0f)
        animator.addListener(object : AnimatorListenerAdapter() {
            override fun onAnimationEnd(animation: Animator) {
                popOverView?.removeWithoutAnimation()
                popOverView = null
            }
        })
        animator.start()
    }

    open fun updateCurrentTooltip(targetView: View) {
        if (isShown) {
            hide()
        }
        tooltipPresentationMode = null
        createTooltip(targetView)
    }

    open fun updateCurrentTooltipWithoutReset(targetView: View) {
        createTooltip(targetView)
    }

    private fun setNewTargetView(newTargetView: View) {
        this.targetView = newTargetView
    }

    private fun show(container: ViewGroup, targetView: View?): PopOverView? {
        popOverView?.removeWithoutAnimation()

        val popOverRelativeLayout = buildLayout(container, targetView!!.context)
        popOverRelativeLayout.clipChildren = false
        popOverRelativeLayout.clipToPadding = false
        setUpToolTipView(targetView, popOverData, popOverRelativeLayout)

        return popOverView
    }

    private fun setUpToolTipView(targetView: View, popOverData: PopOverData?, popOverRelativeLayout: PopOverRelativeLayout) {
        popOverView = popOverRelativeLayout.showPopOverForView(popOverData!!, targetView, tooltipPresentationMode)
        popOverView?.apply {
            visibility = targetView.visibility
            this.setToolTipListener(object : PopOverClickListener {
                override fun onPopOverViewClicked(popOverView: PopOverView) {
                    hide()
                    listener?.onPopOverViewClicked(popOverView)
                }

                override fun onCloseClicked(popOverView: PopOverView) {
                    hide()
                    listener?.onCloseClicked(popOverView)
                }
            })
        }
    }

    private fun buildLayout(container: ViewGroup, context: Context): PopOverRelativeLayout {
        val popOverRelativeLayout = PopOverRelativeLayout(context)
        popOverRelativeLayout.layoutParams = LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT)
        container.addView(popOverRelativeLayout)
        return popOverRelativeLayout
    }

    private fun createTooltip(targetView: View) {
        popOverData = createBaseToolTip()
        setNewTargetView(targetView)
    }

    private fun createBaseToolTip(): PopOverData {
        val maxWidth = convertDpToPx(TOOLTIP_MAX_DPS_WIDTH, context)

        return PopOverData(
            maxWidth = maxWidth,
            animationDuration = TOOLTIP_ANIMATION_DURATION
        )
    }

    private fun convertDpToPx(dim: Int, context: Context): Int {
        return TypedValue.applyDimension(
            TypedValue.COMPLEX_UNIT_DIP, dim.toFloat(), context.resources.displayMetrics
        ).toInt()
    }

    companion object {

        private const val TOOLTIP_MAX_DPS_WIDTH = 0
        private const val TOOLTIP_ANIMATION_DURATION: Long = 0
    }
}
