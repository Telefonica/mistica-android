package com.telefonica.mistica.theme.gradient

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

open class LinearGradientWithAngleDrawable : PaintDrawable {

    private var colorResources: List<Int>? = null
    private val colorStops: FloatArray
    private val angleInDegrees: Float

    private lateinit var colorValues: IntArray

    constructor(
        colorValues: IntArray,
        colorStops: FloatArray,
        angleInDegrees: Float,
    ): super() {
        this.colorValues = colorValues
        this.colorStops = colorStops
        this.angleInDegrees = angleInDegrees
        init()
    }

    constructor(
        colorResStops: List<Pair<Float, Int>>,
        angleInDegrees: Float,
    ): super() {
        this.colorResources = colorResStops
            .map { it.second }
        this.colorStops = colorResStops
            .map { it.first }
            .toFloatArray()
        this.angleInDegrees = angleInDegrees
        init()
    }

    override fun inflate(r: Resources, parser: XmlPullParser, attrs: AttributeSet, theme: Resources.Theme?) {
        super.inflate(r, parser, attrs, theme)
        colorValues = colorResources?.map { ResourcesCompat.getColor(r, it, theme) }?.toIntArray() ?: intArrayOf()
    }

    private fun init() {
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
                    colorStops,
                    Shader.TileMode.CLAMP
                )
            }
        }
        shape = RectShape()
        shaderFactory = gradientShaderFactory
    }
}