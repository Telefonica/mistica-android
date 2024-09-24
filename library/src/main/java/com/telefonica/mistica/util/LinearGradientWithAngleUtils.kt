package com.telefonica.mistica.util

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

@Suppress("ComplexCondition")
fun Size.getCoordinatesForLinearGradientWithAngle(
    angleInDegrees: Float = 90F,
): Pair<Offset, Offset> {

    if (width == 0f || height == 0f) {
        return Offset.Zero to Offset.Zero
    }

    val normalizedAngle: Float = ((90 - angleInDegrees) % 360 + 360) % 360
    val angleInRadians: Float = Math.toRadians(normalizedAngle.toDouble()).toFloat()

    val diagonal = sqrt(width.pow(2) + height.pow(2))
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

    val start = center + Offset(-horizontalOffset, verticalOffset)
    val end = center + Offset(horizontalOffset, -verticalOffset)

    return start to end
}