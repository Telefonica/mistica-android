package com.telefonica.mistica.theme.color

import android.content.Context
import android.graphics.Shader
import android.graphics.drawable.Drawable
import android.graphics.drawable.PaintDrawable
import android.graphics.drawable.ShapeDrawable
import android.graphics.drawable.shapes.RectShape
import android.util.TypedValue

fun Context.getThemeGradient(gradient: MisticaGradient): Drawable {
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

    val shaderFactory: ShapeDrawable.ShaderFactory = object : ShapeDrawable.ShaderFactory() {
        override fun resize(width: Int, height: Int): Shader {
            return AngledLinearGradientShaderProvider(
                colors = colors,
                stops = stops,
                angleInDegrees = angle.toFloat(),
            ).createShader(width, height)
        }
    }
    val paint = PaintDrawable()
    paint.shape = RectShape()
    paint.shaderFactory = shaderFactory
    return paint
}
