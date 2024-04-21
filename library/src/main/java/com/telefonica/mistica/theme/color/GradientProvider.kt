package com.telefonica.mistica.theme.color

import android.content.Context
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Shader
import android.graphics.drawable.Drawable
import android.graphics.drawable.LayerDrawable
import android.graphics.drawable.PaintDrawable
import android.graphics.drawable.RippleDrawable
import android.graphics.drawable.ShapeDrawable
import android.graphics.drawable.shapes.RectShape
import android.util.TypedValue
import androidx.annotation.ColorInt
import androidx.annotation.Px
import androidx.core.content.res.ResourcesCompat
import com.telefonica.mistica.R
import com.telefonica.mistica.util.convertDpToPx
import com.telefonica.mistica.util.getDimension
import com.telefonica.mistica.util.getThemeColor

fun Context.getThemeGradient(gradient: MisticaGradient): Drawable =
    getThemeGradientBuilder(gradient).get()

fun Context.getThemeGradientBuilder(gradient: MisticaGradient): GradientBuilder =
    GradientBuilder(this, gradient)

class GradientBuilder(
    private val context: Context,
    private val gradient: MisticaGradient,
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
        getGradient(gradient)
            .applyCornerRadius()
            .applyRipple()
            .applyBorderStroke()

    private fun getGradient(
        gradient: MisticaGradient,
    ): PaintDrawable {
        val typedValue = TypedValue()
        context.theme.resolveAttribute(gradient.gradientColorsAttrRes, typedValue, true)
        if (typedValue.data == TypedValue.DATA_NULL_UNDEFINED) {
            throw RuntimeException("Gradient colors are not specified!")
        }
        val colors = context.resources.getIntArray(typedValue.data)

        context.theme.resolveAttribute(gradient.gradientStopsAttrRes, typedValue, true)
        if (typedValue.data == TypedValue.DATA_NULL_UNDEFINED) {
            throw RuntimeException("Gradient stops are not specified!")
        }
        val stops = context.resources.getStringArray(typedValue.data).map { it.toFloat() }.toFloatArray()

        context.theme.resolveAttribute(gradient.gradientAngleAttrRes, typedValue, true)
        val angle = typedValue.data

        return if (colors.size > 1) {
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
    }

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
