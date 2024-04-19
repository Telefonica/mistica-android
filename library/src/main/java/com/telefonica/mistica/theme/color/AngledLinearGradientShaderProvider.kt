package com.telefonica.mistica.theme.color

import android.graphics.LinearGradient
import android.graphics.Shader
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.geometry.center
import kotlin.math.PI
import kotlin.math.abs
import kotlin.math.acos
import kotlin.math.cos
import kotlin.math.pow
import kotlin.math.sin
import kotlin.math.sqrt

class AngledLinearGradientShaderProvider(
    private val colors: IntArray,
    private val stops: FloatArray,
    private val angleInDegrees: Float = 0f,
    private val useAsCssAngle: Boolean = true,
    private val tileMode: Shader.TileMode = Shader.TileMode.CLAMP,
) {

    // handle edge cases like: -1235, ...
    private val normalizedAngle: Float = if (useAsCssAngle) {
        ((90 - angleInDegrees) % 360 + 360) % 360
    } else {
        (angleInDegrees % 360 + 360) % 360
    }
    private val angleInRadians: Float = Math.toRadians(normalizedAngle.toDouble()).toFloat()

    fun createShader(width: Int, height: Int): Shader {
        val (from, to) = getGradientCoordinates(width, height)
        return LinearGradient(
            from.x,
            from.y,
            to.x,
            to.y,
            colors,
            stops,
            Shader.TileMode.CLAMP
        )
    }

    private fun getGradientCoordinates(width: Int, height: Int): Pair<Offset, Offset> {
        val diagonal = sqrt(width.toFloat().pow(2) + height.toFloat().pow(2))
        val angleBetweenDiagonalAndWidth = acos(width / diagonal)
        val angleBetweenDiagonalAndGradientLine =
            if ((normalizedAngle > 90 && normalizedAngle < 180)
                || (normalizedAngle > 270 && normalizedAngle < 360)
            ) {
                PI.toFloat() - angleInRadians - angleBetweenDiagonalAndWidth
            } else {
                angleInRadians - angleBetweenDiagonalAndWidth
            }
        val halfGradientLine = abs(cos(angleBetweenDiagonalAndGradientLine) * diagonal) / 2

        val horizontalOffset = halfGradientLine * cos(angleInRadians)
        val verticalOffset = halfGradientLine * sin(angleInRadians)

        val size = Size(width.toFloat(), height.toFloat())
        val start = size.center + Offset(-horizontalOffset, verticalOffset)
        val end = size.center + Offset(horizontalOffset, -verticalOffset)

        return start to end
    }
}
