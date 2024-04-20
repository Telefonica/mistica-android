package com.telefonica.mistica.theme.color

import android.content.Context
import android.graphics.Paint
import android.graphics.Shader
import android.graphics.drawable.Drawable
import android.graphics.drawable.LayerDrawable
import android.graphics.drawable.PaintDrawable
import android.graphics.drawable.RippleDrawable
import android.graphics.drawable.ShapeDrawable
import android.graphics.drawable.shapes.RectShape
import android.util.TypedValue
import androidx.core.content.res.ResourcesCompat
import com.telefonica.mistica.R
import com.telefonica.mistica.util.convertDpToPx
import com.telefonica.mistica.util.getDimension
import com.telefonica.mistica.util.getThemeColor

fun Context.getThemeGradient(
    gradient: MisticaGradient,
    withBorderRadius: Boolean = false,
    withRipple: Boolean = false,
    withBorderStroke: Boolean = false,
): Drawable {
    val typedValueColors = TypedValue()
    theme.resolveAttribute(gradient.gradientColorsAttrRes, typedValueColors, true)
    if (typedValueColors.data == TypedValue.DATA_NULL_UNDEFINED) {
        throw RuntimeException("Gradient colors are not specified!")
    }
    val colors = resources.getIntArray(typedValueColors.data)

    val typedValueStops = TypedValue()
    theme.resolveAttribute(gradient.gradientStopsAttrRes, typedValueStops, true)
    if (typedValueStops.data == TypedValue.DATA_NULL_UNDEFINED) {
        throw RuntimeException("Gradient stops are not specified!")
    }
    val stops = resources.getStringArray(typedValueStops.data).map { it.toFloat() }.toFloatArray()

    val typedValueAngle = TypedValue()
    theme.resolveAttribute(gradient.gradientAngleAttrRes, typedValueAngle, true)
    val angle = typedValueAngle.data

    val paint = if (colors.size > 1) {
        val shaderFactory: ShapeDrawable.ShaderFactory = object : ShapeDrawable.ShaderFactory() {
            override fun resize(width: Int, height: Int): Shader {
                return AngledLinearGradientShaderProvider(
                    colors = colors,
                    stops = stops,
                    angleInDegrees = angle.toFloat(),
                ).createShader(width, height)
            }
        }
        PaintDrawable().apply {
            shape = RectShape()
            this.shaderFactory = shaderFactory
        }
    } else {
        PaintDrawable(colors.first())
    }

    if (withBorderRadius) {
        paint.setCornerRadius(getDimension(R.attr.containerBorderRadius))
    }

    val ripplePaint = if (withRipple) {
        getRippleDrawable(paint)
    } else {
        paint
    }

    return if (withBorderStroke) {
        val stroke = PaintDrawable().apply {
            shape = RectShape()
            this.setCornerRadius(getDimension(R.attr.containerBorderRadius))
            this.paint.color = getThemeColor(R.attr.colorBorder)
            this.paint.strokeWidth = convertDpToPx(1F).toFloat()
            this.paint.style = Paint.Style.STROKE
        }
        LayerDrawable(arrayOf(ripplePaint, stroke))
    } else {
        ripplePaint
    }
}

fun Context.getRippleDrawable(drawable: Drawable): RippleDrawable {
    val ripple = ResourcesCompat
        .getDrawable(resources, R.drawable.empty_ripple_background, theme) as RippleDrawable
    // Support for API 21 requires layer replacing
    ripple.setDrawableByLayerId(android.R.id.mask, drawable)
    ripple.setDrawableByLayerId(android.R.id.background, drawable)
    return ripple
}
