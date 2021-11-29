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

public val LightGroup.TongueLight: ImageVector
    get() {
        if (_tongueLight != null) {
            return _tongueLight!!
        }
        _tongueLight = Builder(name = "TongueLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.739f, 10.316f)
                curveToRelative(0.0f, 6.694f, -1.499f, 9.064f, -5.723f, 9.064f)
                curveToRelative(-4.227f, 0.0f, -5.723f, -2.372f, -5.723f, -9.064f)
                curveToRelative(0.0f, -0.964f, 0.031f, -1.801f, 0.09f, -2.566f)
                curveToRelative(1.47f, 0.597f, 3.207f, 0.916f, 5.193f, 0.958f)
                lineToRelative(0.04f, 7.428f)
                curveToRelative(0.0f, 0.23f, 0.187f, 0.412f, 0.42f, 0.412f)
                horizontalLineToRelative(0.003f)
                arcToRelative(0.42f, 0.42f, 0.0f, false, false, 0.417f, -0.417f)
                lineToRelative(-0.04f, -7.426f)
                curveToRelative(2.006f, -0.04f, 3.754f, -0.361f, 5.233f, -0.963f)
                curveToRelative(0.059f, 0.764f, 0.09f, 1.605f, 0.09f, 2.574f)
                moveToRelative(3.919f, -6.434f)
                arcToRelative(0.425f, 0.425f, 0.0f, false, false, -0.583f, 0.117f)
                curveToRelative(-1.728f, 2.586f, -4.782f, 3.897f, -9.067f, 3.897f)
                curveToRelative(-4.292f, 0.0f, -7.348f, -1.314f, -9.076f, -3.908f)
                arcToRelative(0.42f, 0.42f, 0.0f, false, false, -0.583f, -0.118f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, false, -0.12f, 0.575f)
                curveToRelative(0.84f, 1.26f, 1.975f, 2.23f, 3.356f, 2.932f)
                curveToRelative(-0.009f, 0.026f, -0.02f, 0.048f, -0.023f, 0.076f)
                arcToRelative(32.06f, 32.06f, 0.0f, false, false, -0.112f, 2.86f)
                curveToRelative(0.0f, 6.106f, 1.098f, 9.894f, 6.563f, 9.894f)
                reflectiveCurveToRelative(6.563f, -3.788f, 6.563f, -9.894f)
                curveToRelative(0.0f, -1.04f, -0.033f, -1.941f, -0.1f, -2.754f)
                arcToRelative(0.429f, 0.429f, 0.0f, false, false, -0.062f, -0.176f)
                curveToRelative(1.384f, -0.706f, 2.518f, -1.672f, 3.361f, -2.93f)
                arcToRelative(0.407f, 0.407f, 0.0f, false, false, -0.117f, -0.571f)
            }
        }
        .build()
        return _tongueLight!!
    }

private var _tongueLight: ImageVector? = null
