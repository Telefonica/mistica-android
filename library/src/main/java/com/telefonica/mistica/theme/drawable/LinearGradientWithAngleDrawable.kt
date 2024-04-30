package com.telefonica.mistica.theme.drawable

import android.content.res.Resources
import android.graphics.LinearGradient
import android.graphics.Shader
import android.graphics.drawable.PaintDrawable
import android.graphics.drawable.shapes.RectShape
import android.util.AttributeSet
import androidx.compose.ui.geometry.Size
import androidx.core.content.res.ResourcesCompat
import com.telefonica.mistica.util.getCoordinatesForLinearGradientWithAngle
import org.xmlpull.v1.XmlPullParser

open class LinearGradientWithAngleDrawable(
    private val colorResStops: List<Pair<Float, Int>>,
    private val angleInDegrees: Float
) : PaintDrawable() {

    override fun inflate(r: Resources, parser: XmlPullParser, attrs: AttributeSet, theme: Resources.Theme?) {
        super.inflate(r, parser, attrs, theme)
        initialize(r, theme)
    }

    fun initialize(r: Resources, theme: Resources.Theme?) {
        val colorValues = colorResStops.map { it.second }
            .map { ResourcesCompat.getColor(r, it, theme) }
            .toIntArray()

        val gradientShaderFactory: ShaderFactory = object : ShaderFactory() {
            override fun resize(width: Int, height: Int): Shader {
                val (from, to) = Size(width.toFloat(), height.toFloat())
                    .getCoordinatesForLinearGradientWithAngle(angleInDegrees)
                return LinearGradient(
                    from.x,
                    from.y,
                    to.x,
                    to.y,
                    colorValues,
                    colorResStops.map { it.first }.toFloatArray(),
                    Shader.TileMode.CLAMP
                )
            }
        }
        shape = RectShape()
        shaderFactory = gradientShaderFactory
    }
}