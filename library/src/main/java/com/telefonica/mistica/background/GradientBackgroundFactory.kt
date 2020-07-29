package com.telefonica.mistica.background

import android.content.Context
import android.graphics.LinearGradient
import android.graphics.Shader
import android.graphics.Shader.TileMode
import android.graphics.drawable.Drawable
import android.graphics.drawable.PaintDrawable
import android.graphics.drawable.ShapeDrawable.ShaderFactory
import android.graphics.drawable.shapes.RectShape
import android.util.TypedValue
import com.telefonica.mistica.R
import com.telefonica.mistica.util.getThemeColor

object GradientBackgroundFactory {

    @JvmStatic
    fun getBackground(context: Context): Drawable {
        return getBackground(context, getColors(context))
    }

    @JvmStatic
    fun getBackgroundForPinScreen(context: Context): Drawable {
        return getBackground(context, getPinScreenColors(context))
    }

    @JvmStatic
    fun getBackgroundForLoginLoadingScreen(context: Context): Drawable {
        return getBackground(context, getLoginLoadingScreenColors(context))
    }

    private fun getBackground(context: Context, intColors: IntArray): Drawable {
        val positions = getPositions(context)
        val shaderFactory: ShaderFactory = object : ShaderFactory() {
            override fun resize(width: Int, height: Int): Shader {
                val x = width / 2f
                return LinearGradient(x, 0f, x, height.toFloat(), intColors, positions, TileMode.CLAMP)
            }
        }
        val paint = PaintDrawable()
        paint.shape = RectShape()
        paint.shaderFactory = shaderFactory
        return paint
    }

    private fun getPositions(context: Context): FloatArray {
        val positions = FloatArray(4)
        val typedValue = TypedValue()
        context.resources.getValue(R.dimen.gradient_background_start_point, typedValue, true)
        positions[0] = typedValue.float
        context.resources.getValue(R.dimen.gradient_background_med_point, typedValue, true)
        positions[1] = typedValue.float
        context.resources.getValue(R.dimen.gradient_background_med_high_point, typedValue, true)
        positions[2] = typedValue.float
        context.resources.getValue(R.dimen.gradient_background_end_point, typedValue, true)
        positions[3] = typedValue.float
        return positions
    }

    private fun getColors(context: Context): IntArray {
        val intColors = IntArray(4)
        intColors[0] = context.getThemeColor(R.attr.colorGradientBackgroundFirst)
        intColors[1] = context.getThemeColor(R.attr.colorGradientBackgroundSecond)
        intColors[2] = context.getThemeColor(R.attr.colorGradientBackgroundThird)
        intColors[3] = context.getThemeColor(R.attr.colorGradientBackgroundFourth)
        return intColors
    }

    private fun getPinScreenColors(context: Context): IntArray {
        val intColors = IntArray(4)
        intColors[0] = context.getThemeColor(R.attr.colorPinGradientFirst)
        intColors[1] = context.getThemeColor(R.attr.colorPinGradientSecond)
        intColors[2] = context.getThemeColor(R.attr.colorPinGradientThird)
        intColors[3] = context.getThemeColor(R.attr.colorPinGradientFourth)
        return intColors
    }

    private fun getLoginLoadingScreenColors(context: Context): IntArray {
        val intColors = IntArray(4)
        intColors[0] = context.getThemeColor(R.attr.colorLoginLoadingGradientFirst)
        intColors[1] = context.getThemeColor(R.attr.colorLoginLoadingGradientSecond)
        intColors[2] = context.getThemeColor(R.attr.colorLoginLoadingGradientThird)
        intColors[3] = context.getThemeColor(R.attr.colorLoginLoadingGradientFourth)
        return intColors
    }
}