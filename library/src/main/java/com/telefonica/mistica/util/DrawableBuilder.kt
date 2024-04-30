package com.telefonica.mistica.util

import android.content.Context
import android.graphics.Paint
import android.graphics.drawable.Drawable
import android.graphics.drawable.LayerDrawable
import android.graphics.drawable.PaintDrawable
import android.graphics.drawable.RippleDrawable
import android.graphics.drawable.shapes.RectShape
import androidx.annotation.ColorInt
import androidx.annotation.Px
import androidx.core.content.res.ResourcesCompat
import com.telefonica.mistica.R

class DrawableBuilder(
    private val context: Context,
    private val baseDrawable: PaintDrawable,
) {
    private var withCornerRadius: Boolean = false

    @Px
    private var cornerRadius: Float? = null

    private var withRipple: Boolean = false

    private var withBorderStroke: Boolean = false

    @ColorInt
    private var borderStrokeColor: Int? = null

    @Px
    private var borderStrokeWidth: Float? = null

    fun withCornerRadius(
        @Px cornerRadius: Float? = null,
    ) = apply {
        withCornerRadius = true
        this.cornerRadius = cornerRadius
    }

    fun withRipple() = apply {
        withRipple = true
    }

    fun withBorderStroke(
        @ColorInt borderStrokeColor: Int? = null,
        @Px borderStrikeWidth: Float? = null,
    ) = apply {
        withBorderStroke = true
        this.borderStrokeColor = borderStrokeColor
        this.borderStrokeWidth = borderStrikeWidth
    }

    fun get(): Drawable =
        baseDrawable
            .applyCornerRadius()
            .applyRipple()
            .applyBorderStroke()

    private fun PaintDrawable.applyCornerRadius(): PaintDrawable = apply {
        if (withCornerRadius) {
            setCornerRadius(cornerRadius ?: context.getDimension(R.attr.containerBorderRadius))
        }
    }

    private fun Drawable.applyRipple(): Drawable {
        if (!withRipple) {
            return this
        }

        val ripple = ResourcesCompat
            .getDrawable(context.resources, R.drawable.empty_ripple_background, context.theme) as RippleDrawable
        // Support for API 21 requires layer replacing
        ripple.setDrawableByLayerId(android.R.id.mask, this)
        ripple.setDrawableByLayerId(android.R.id.background, this)
        return ripple
    }

    private fun Drawable.applyBorderStroke(): Drawable {
        if (!withBorderStroke) {
            return this
        }

        val strokeDrawable = PaintDrawable().apply {
            shape = RectShape()
            if (withCornerRadius) {
                setCornerRadius(cornerRadius ?: context.getDimension(R.attr.containerBorderRadius))
            }
            paint.color = borderStrokeColor ?: context.getThemeColor(R.attr.colorBorder)
            paint.strokeWidth = borderStrokeWidth ?: context.convertDpToPx(1F).toFloat()
            paint.style = Paint.Style.STROKE
        }
        return LayerDrawable(arrayOf(this, strokeDrawable))
    }
}
