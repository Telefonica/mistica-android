package com.telefonica.mistica.compose.misticaicons.telefonica.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.telefonica.LightGroup

public val LightGroup.CarLight: ImageVector
    get() {
        if (_carLight != null) {
            return _carLight!!
        }
        _carLight = Builder(name = "CarLight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.701f, 14.869f)
                horizontalLineToRelative(-2.627f)
                curveToRelative(-0.157f, -1.255f, -1.042f, -2.023f, -2.406f, -2.023f)
                curveToRelative(-1.361f, 0.0f, -2.25f, 0.768f, -2.406f, 2.023f)
                horizontalLineToRelative(-3.81f)
                curveToRelative(-0.154f, -1.26f, -1.042f, -2.031f, -2.406f, -2.031f)
                reflectiveCurveToRelative(-2.252f, 0.77f, -2.406f, 2.03f)
                horizontalLineTo(3.07f)
                arcToRelative(9.379f, 9.379f, 0.0f, false, true, -0.073f, -1.921f)
                curveToRelative(-0.008f, -0.924f, 0.653f, -2.53f, 1.93f, -3.807f)
                arcToRelative(7.047f, 7.047f, 0.0f, false, true, 5.098f, -2.1f)
                curveToRelative(4.678f, 0.0f, 6.583f, 3.047f, 6.661f, 3.176f)
                curveToRelative(0.07f, 0.115f, 0.194f, 0.19f, 0.328f, 0.199f)
                curveToRelative(0.025f, 0.003f, 2.34f, 0.173f, 3.493f, 2.053f)
                curveToRelative(0.874f, 1.426f, 0.4f, 2.17f, 0.193f, 2.4f)
                moveToRelative(-5.033f, 2.015f)
                curveToRelative(-1.056f, 0.0f, -1.614f, -0.558f, -1.614f, -1.608f)
                reflectiveCurveToRelative(0.558f, -1.608f, 1.614f, -1.608f)
                reflectiveCurveToRelative(1.613f, 0.557f, 1.613f, 1.608f)
                curveToRelative(0.0f, 1.05f, -0.557f, 1.608f, -1.613f, 1.608f)
                moveToRelative(-8.622f, -0.009f)
                curveToRelative(-1.056f, 0.0f, -1.616f, -0.554f, -1.616f, -1.608f)
                curveToRelative(0.0f, -1.05f, 0.56f, -1.607f, 1.616f, -1.607f)
                reflectiveCurveToRelative(1.613f, 0.557f, 1.613f, 1.607f)
                curveToRelative(0.0f, 1.054f, -0.557f, 1.608f, -1.613f, 1.608f)
                moveToRelative(14.168f, -4.835f)
                curveToRelative(-1.174f, -1.91f, -3.26f, -2.336f, -3.933f, -2.422f)
                curveToRelative(-0.512f, -0.729f, -2.697f, -3.398f, -7.252f, -3.398f)
                curveToRelative(-2.77f, 0.0f, -4.622f, 1.271f, -5.686f, 2.341f)
                curveToRelative(-1.501f, 1.505f, -2.177f, 3.334f, -2.168f, 4.367f)
                curveToRelative(-0.084f, 1.451f, 0.143f, 2.41f, 0.154f, 2.451f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, false, 0.4f, 0.314f)
                horizontalLineToRelative(1.91f)
                curveToRelative(0.166f, 1.247f, 1.051f, 2.006f, 2.407f, 2.006f)
                reflectiveCurveToRelative(2.24f, -0.76f, 2.406f, -2.006f)
                horizontalLineToRelative(3.813f)
                curveToRelative(0.16f, 1.252f, 1.047f, 2.014f, 2.406f, 2.014f)
                curveToRelative(1.358f, 0.0f, 2.243f, -0.762f, 2.406f, -2.014f)
                horizontalLineToRelative(2.787f)
                curveToRelative(0.087f, 0.0f, 0.17f, -0.028f, 0.24f, -0.078f)
                curveToRelative(0.015f, -0.014f, 1.578f, -1.182f, 0.11f, -3.575f)
            }
        }
        .build()
        return _carLight!!
    }

private var _carLight: ImageVector? = null
