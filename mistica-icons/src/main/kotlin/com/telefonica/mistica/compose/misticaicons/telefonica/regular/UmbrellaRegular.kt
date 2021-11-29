package com.telefonica.mistica.compose.misticaicons.telefonica.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.telefonica.RegularGroup

public val RegularGroup.UmbrellaRegular: ImageVector
    get() {
        if (_umbrellaRegular != null) {
            return _umbrellaRegular!!
        }
        _umbrellaRegular = Builder(name = "UmbrellaRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.387f, 11.134f)
                arcToRelative(0.308f, 0.308f, 0.0f, false, true, -0.236f, 0.107f)
                lineToRelative(-1.812f, -0.006f)
                curveToRelative(-0.602f, -3.375f, -2.135f, -5.361f, -3.55f, -6.501f)
                curveToRelative(1.494f, 0.361f, 2.724f, 1.014f, 3.66f, 1.97f)
                curveToRelative(1.027f, 1.05f, 1.7f, 2.464f, 1.996f, 4.206f)
                arcToRelative(0.31f, 0.31f, 0.0f, false, true, -0.058f, 0.224f)
                close()
                moveTo(12.547f, 4.762f)
                curveToRelative(1.29f, 0.6f, 3.71f, 2.266f, 4.534f, 6.473f)
                lineToRelative(-4.535f, -0.01f)
                lineTo(12.546f, 4.761f)
                close()
                moveTo(6.602f, 11.207f)
                curveToRelative(0.799f, -4.064f, 3.406f, -5.82f, 4.703f, -6.453f)
                verticalLineToRelative(6.467f)
                lineToRelative(-4.703f, -0.014f)
                close()
                moveTo(3.384f, 11.151f)
                curveToRelative(-0.011f, -0.008f, -0.04f, -0.028f, -0.07f, -0.061f)
                arcToRelative(0.294f, 0.294f, 0.0f, false, true, -0.07f, -0.236f)
                curveToRelative(0.308f, -1.736f, 0.991f, -3.145f, 2.033f, -4.187f)
                curveToRelative(0.978f, -0.986f, 2.272f, -1.647f, 3.85f, -1.986f)
                curveToRelative(-1.494f, 1.157f, -3.183f, 3.17f, -3.78f, 6.52f)
                lineToRelative(-1.795f, -0.005f)
                arcToRelative(0.342f, 0.342f, 0.0f, false, true, -0.168f, -0.045f)
                close()
                moveTo(21.664f, 10.703f)
                curveToRelative(-0.34f, -1.983f, -1.123f, -3.616f, -2.328f, -4.846f)
                curveToRelative(-1.605f, -1.639f, -3.885f, -2.524f, -6.79f, -2.653f)
                verticalLineToRelative(-0.593f)
                arcTo(0.616f, 0.616f, 0.0f, false, false, 11.927f, 2.0f)
                arcToRelative(0.616f, 0.616f, 0.0f, false, false, -0.619f, 0.61f)
                verticalLineToRelative(0.594f)
                curveToRelative(-2.952f, 0.087f, -5.283f, 0.961f, -6.913f, 2.608f)
                curveToRelative(-1.219f, 1.222f, -2.017f, 2.846f, -2.37f, 4.83f)
                curveToRelative(-0.075f, 0.425f, 0.042f, 0.868f, 0.345f, 1.238f)
                curveToRelative(0.117f, 0.131f, 0.235f, 0.232f, 0.361f, 0.308f)
                curveToRelative(0.238f, 0.145f, 0.524f, 0.23f, 0.815f, 0.232f)
                lineToRelative(7.762f, 0.023f)
                verticalLineToRelative(7.014f)
                curveToRelative(0.0f, 0.014f, 0.0f, 0.028f, 0.003f, 0.042f)
                curveToRelative(0.025f, 1.212f, 1.036f, 2.19f, 2.272f, 2.19f)
                curveToRelative(1.252f, 0.0f, 2.271f, -1.006f, 2.271f, -2.24f)
                arcToRelative(0.616f, 0.616f, 0.0f, false, false, -0.619f, -0.611f)
                arcToRelative(0.616f, 0.616f, 0.0f, false, false, -0.619f, 0.61f)
                curveToRelative(0.0f, 0.56f, -0.465f, 1.017f, -1.033f, 1.017f)
                arcToRelative(1.028f, 1.028f, 0.0f, false, true, -1.034f, -1.017f)
                verticalLineToRelative(-7.003f)
                lineToRelative(7.605f, 0.02f)
                curveToRelative(0.46f, -0.003f, 0.894f, -0.199f, 1.196f, -0.557f)
                curveToRelative(0.275f, -0.348f, 0.39f, -0.788f, 0.314f, -1.205f)
                close()
            }
        }
        .build()
        return _umbrellaRegular!!
    }

private var _umbrellaRegular: ImageVector? = null
