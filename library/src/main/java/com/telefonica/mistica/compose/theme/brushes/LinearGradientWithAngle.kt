package com.telefonica.mistica.compose.theme.brushes

import androidx.compose.runtime.Immutable
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.LinearGradientShader
import androidx.compose.ui.graphics.Shader
import androidx.compose.ui.graphics.ShaderBrush
import androidx.compose.ui.graphics.TileMode
import com.telefonica.mistica.util.getCoordinatesForLinearGradientWithAngle

@Immutable
class LinearGradientWithAngle(
    private val colorStops: List<Pair<Float, Color>>,
    private val angleInDegrees: Float = 0F,
) : ShaderBrush() {

    override fun createShader(size: Size): Shader {
        val (from, to) = size.getCoordinatesForLinearGradientWithAngle(angleInDegrees)
        return LinearGradientShader(
            colors = colorStops.map { it.second },
            colorStops = colorStops.map { it.first },
            from = from,
            to = to,
            tileMode = TileMode.Clamp
        )
    }
}
