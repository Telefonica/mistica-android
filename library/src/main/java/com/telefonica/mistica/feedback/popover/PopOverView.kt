/*
 * Copyright 2013 Niek Haarman
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.telefonica.mistica.feedback.popover

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Rect
import android.os.Build.VERSION_CODES
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewTreeObserver
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import com.telefonica.mistica.R
import com.telefonica.mistica.util.getThemeColor
import java.util.*
import kotlin.math.max
import kotlin.math.roundToInt

open class PopOverView internal constructor(context: Context) : RelativeLayout(context),
    ViewTreeObserver.OnPreDrawListener, View.OnClickListener {

    private lateinit var popOverContent: ViewGroup
    private lateinit var popOverTopTip: ImageView
    private lateinit var popOverTitle: TextView
    private lateinit var popOverImage: ImageView
    private lateinit var popOverDescription: TextView
    private lateinit var popOverBottomTip: ImageView
    private lateinit var popOverCloseButton: ImageView

    private var popOverData: PopOverData? = null
    private lateinit var targetView: View

    private var dimensionsKnown: Boolean = false
    private var targetViewRelativeY: Int = 0
    private var targetViewRelativeX: Int = 0

    private var listener: PopOverClickListener? = null

    init {
        init()
    }

    private fun init() {
        layoutParams = LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT)
        LayoutInflater.from(context).inflate(R.layout.popover_view, this, true)

        popOverContent = findViewById(R.id.popover_content)
        popOverTopTip = findViewById(R.id.popover_pointer_up)
        popOverTitle = findViewById(R.id.popover_title)
        popOverImage = findViewById(R.id.popover_image)
        popOverDescription = findViewById(R.id.popover_subtitle)
        popOverBottomTip = findViewById(R.id.popover_pointer_down)
        popOverCloseButton = findViewById(R.id.close_button)

        setOnClickListener(this)
        viewTreeObserver.addOnPreDrawListener(this)
    }

    override fun onPreDraw(): Boolean {
        viewTreeObserver.removeOnPreDrawListener(this)
        dimensionsKnown = true

        if (popOverData != null) {
            applyPopOverTipPosition()
        }

        return true
    }

    internal fun setUpToolTip(popOverData: PopOverData, targetView: View) {
        this.popOverData = popOverData
        this.targetView = targetView

        setTitle(popOverData)
        setImage(popOverData)
        setDescription(popOverData)
        setCloseButton()
        setMaxWidth(popOverData)
        applyTheme(popOverData.theme)
        setTipMargin(popOverData.extraMarginForTip)
        setMargin(popOverData)
        contentDescription = popOverData.dismissButtonContentDescription
        setShadow()
        if (dimensionsKnown) {
            applyPopOverTipPosition()
        }
    }

    private fun setTipMargin(tipMargin: Int) {
        if (tipMargin != 0) {
            val paramsTop = popOverTopTip.layoutParams as LayoutParams
            paramsTop.setMargins(
                resources.getDimension(R.dimen.popover_arrow_margin_horizontal).roundToInt(),
                tipMargin,
                resources.getDimension(R.dimen.popover_arrow_margin_horizontal).roundToInt(),
                resources.getDimension(R.dimen.popover_arrow_margin_vertical).roundToInt()
            )
            popOverTopTip.layoutParams = paramsTop
            val paramsBottom = popOverBottomTip.layoutParams as LayoutParams
            paramsBottom.setMargins(
                resources.getDimension(R.dimen.popover_arrow_margin_horizontal).roundToInt(),
                resources.getDimension(R.dimen.popover_arrow_margin_vertical).roundToInt(),
                resources.getDimension(R.dimen.popover_arrow_margin_horizontal).roundToInt(),
                tipMargin
            )
            popOverBottomTip.layoutParams = paramsBottom
        }
    }

    private fun setMargin(popOverData: PopOverData) {
        val margin = popOverData.margin
        if (margin > 0) {
            setPadding(margin, 0, margin, 0)
        }
    }

    private fun setCloseButton() {
        popOverCloseButton.visibility = View.VISIBLE
        popOverCloseButton.setOnClickListener { listener?.onCloseClicked(this@PopOverView) }
    }

    private fun setTitle(popOverData: PopOverData) {
        if (!popOverData.title.isNullOrEmpty()) {
            popOverTitle.text = popOverData.title
            popOverTitle.visibility = View.VISIBLE
        } else {
            popOverTitle.visibility = View.GONE
        }
    }

    private fun setImage(popOverData: PopOverData) {
        if (popOverData.imageRes != null) {
            popOverImage.setImageResource(popOverData.imageRes)
            popOverImage.visibility = View.VISIBLE
        } else {
            popOverImage.visibility = View.GONE
        }
    }

    private fun setDescription(popOverData: PopOverData) {
        if (popOverData.description != null) {
            popOverDescription.text = popOverData.description
            popOverDescription.visibility = View.VISIBLE
        } else {
            popOverDescription.visibility = View.GONE
        }
    }

    private fun setMaxWidth(popOverData: PopOverData) {
        if (popOverData.maxWidth > 0) {
            popOverTitle.maxWidth = popOverData.maxWidth
        }
    }

    private fun setShadow() {
        if (android.os.Build.VERSION.SDK_INT >= VERSION_CODES.LOLLIPOP) {
            popOverContent.elevation = resources.getDimension(R.dimen.popover_elevation)
            popOverBottomTip.elevation = resources.getDimension(R.dimen.popover_elevation)
            popOverTopTip.elevation = resources.getDimension(R.dimen.popover_elevation)
        }
    }

    private fun applyTheme(theme: PopOverTheme) {
        popOverTopTip.setImageResource(theme.topTip)
        popOverBottomTip.setImageResource(theme.bottomTip)
        popOverTitle.setTextColor(context.getThemeColor(theme.textColor))
        popOverCloseButton.setImageResource(theme.closeButton)
    }

    @SuppressLint("NewApi")
    private fun applyPopOverTipPosition() {
        val targetViewScreenPosition = IntArray(2)
        val parentViewScreenPosition = IntArray(2)

        val availableVisibleArea = Rect() // includes decorations (e.g. status bar)
        targetView.getLocationOnScreen(targetViewScreenPosition)
        targetView.getWindowVisibleDisplayFrame(availableVisibleArea)
        (parent as View).getLocationOnScreen(parentViewScreenPosition)

        targetViewRelativeX = targetViewScreenPosition[0] - parentViewScreenPosition[0]
        targetViewRelativeY = targetViewScreenPosition[1] - parentViewScreenPosition[1]
        val targetViewRelativeCenterX = targetViewRelativeX + targetView.width / 2

        val popOverViewAboveY = (targetViewRelativeY - height).toFloat()
        val popOverViewBelowY = (targetViewRelativeY + targetView.height).toFloat()
        val popOverViewY: Float

        var popOverViewX = max(0, targetViewRelativeCenterX - width / 2).toFloat()
        if (popOverViewX + width > availableVisibleArea.right) {
            popOverViewX = (availableVisibleArea.right - width).toFloat()
        }

        x = popOverViewX
        setPointerCenterX(targetViewRelativeCenterX)

        val showBelow = popOverViewAboveY < 0

        popOverTopTip.visibility = if (showBelow) View.VISIBLE else View.GONE
        popOverBottomTip.visibility = if (showBelow) View.GONE else View.VISIBLE

        if (showBelow) {
            popOverViewY = popOverViewBelowY
        } else {
            popOverViewY = popOverViewAboveY
        }

        val animators = ArrayList<Animator>()

        if (popOverData?.animationType == PopOverData.ANIMATIONTYPE_FROMMASTERVIEW) {
            animators.add(
                ObjectAnimator.ofFloat<View>(
                    this,
                    View.TRANSLATION_Y,
                    (targetViewRelativeY + targetView.height / 2 - height / 2).toFloat(),
                    popOverViewY
                )
            )
            animators.add(
                ObjectAnimator.ofFloat<View>(
                    this, View.TRANSLATION_X,
                    (targetViewRelativeX + targetView.width / 2 - width / 2).toFloat(), popOverViewX
                )
            )
        } else if (popOverData?.animationType == PopOverData.ANIMATIONTYPE_FROMTOP) {
            animators.add(ObjectAnimator.ofFloat<View>(this, View.TRANSLATION_Y, 0f, popOverViewY))
        }

        animators.add(ObjectAnimator.ofFloat<View>(this, View.SCALE_X, 0f, 1f))
        animators.add(ObjectAnimator.ofFloat<View>(this, View.SCALE_Y, 0f, 1f))

        animators.add(ObjectAnimator.ofFloat<View>(this, View.ALPHA, 0f, 1f))

        val animatorSet = AnimatorSet()
        animatorSet.duration = popOverData?.animationDuration ?: 0
        animatorSet.playTogether(animators)

        animatorSet.start()
    }

    @SuppressLint("NewApi")
    fun setPointerCenterX(pointerCenterX: Int) {
        val pointerWidth = max(popOverTopTip.measuredWidth, popOverBottomTip.measuredWidth)

        popOverTopTip.x = pointerCenterX.toFloat() - (pointerWidth / 2).toFloat() - x
        popOverBottomTip.x = pointerCenterX.toFloat() - (pointerWidth / 2).toFloat() - x
    }

    fun setToolTipListener(listener: PopOverClickListener) {
        this.listener = listener
    }

    @SuppressLint("NewApi")
    fun remove() {
        val animators = ArrayList<Animator>()
        if (popOverData?.animationType == PopOverData.ANIMATIONTYPE_FROMMASTERVIEW) {
            animators.add(
                ObjectAnimator.ofFloat<View>(
                    this, View.TRANSLATION_Y, y,
                    (targetViewRelativeY + targetView.height / 2 - height / 2).toFloat()
                )
            )
            animators.add(
                ObjectAnimator.ofFloat<View>(
                    this, View.TRANSLATION_X, x,
                    (targetViewRelativeX + targetView.width / 2 - width / 2).toFloat()
                )
            )
        } else {
            animators.add(ObjectAnimator.ofFloat<View>(this, View.TRANSLATION_Y, y, 0f))
        }

        animators.add(ObjectAnimator.ofFloat<View>(this, View.SCALE_X, 1f, 0f))
        animators.add(ObjectAnimator.ofFloat<View>(this, View.SCALE_Y, 1f, 0f))

        animators.add(ObjectAnimator.ofFloat<View>(this, View.ALPHA, 1f, 0f))

        val animatorSet = AnimatorSet()
        animatorSet.playTogether(animators)
        animatorSet.addListener(object : AnimatorListenerAdapter() {
            override fun onAnimationEnd(animator: Animator) {
                removeWithoutAnimation()
            }
        })
        animatorSet.start()
    }

    fun removeWithoutAnimation() {
        val container = parent as View
        val containerParent = container.parent as? ViewGroup
        containerParent?.removeView(container)
    }

    override fun onClick(view: View) {
        listener?.onPopOverViewClicked(this)
    }

    interface PopOverClickListener {

        fun onPopOverViewClicked(popOverView: PopOverView)

        fun onCloseClicked(popOverView: PopOverView)
    }
}
