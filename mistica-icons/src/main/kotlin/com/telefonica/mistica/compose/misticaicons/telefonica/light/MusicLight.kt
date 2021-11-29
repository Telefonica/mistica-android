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

public val LightGroup.MusicLight: ImageVector
    get() {
        if (_musicLight != null) {
            return _musicLight!!
        }
        _musicLight = Builder(name = "MusicLight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(10.156f, 4.685f)
                lineToRelative(0.003f, -1.67f)
                lineToRelative(9.47f, 2.524f)
                lineToRelative(0.127f, 0.026f)
                verticalLineToRelative(1.677f)
                lineToRelative(-9.6f, -2.557f)
                close()
                moveTo(6.896f, 16.733f)
                curveToRelative(-0.076f, 0.0f, -0.168f, 0.002f, -0.255f, 0.0f)
                curveToRelative(-0.714f, -0.009f, -2.381f, -0.272f, -2.381f, -2.477f)
                curveToRelative(0.0f, -2.198f, 1.65f, -2.453f, 2.358f, -2.459f)
                curveToRelative(0.087f, 0.0f, 0.183f, 0.0f, 0.267f, 0.003f)
                curveToRelative(0.72f, 0.017f, 2.395f, 0.291f, 2.395f, 2.473f)
                reflectiveCurveToRelative(-1.667f, 2.446f, -2.384f, 2.46f)
                close()
                moveTo(17.372f, 20.982f)
                lineTo(17.117f, 20.985f)
                curveToRelative(-0.714f, -0.009f, -2.38f, -0.272f, -2.38f, -2.476f)
                curveToRelative(0.0f, -2.2f, 1.649f, -2.451f, 2.358f, -2.457f)
                lineToRelative(0.266f, 0.003f)
                curveToRelative(0.72f, 0.017f, 2.398f, 0.291f, 2.398f, 2.473f)
                curveToRelative(-0.003f, 2.177f, -1.67f, 2.443f, -2.387f, 2.454f)
                close()
                moveTo(20.622f, 5.567f)
                arcToRelative(0.87f, 0.87f, 0.0f, false, false, -0.813f, -0.86f)
                lineToRelative(-9.538f, -2.54f)
                lineToRelative(-0.112f, -0.017f)
                arcToRelative(0.872f, 0.872f, 0.0f, false, false, -0.877f, 0.863f)
                verticalLineToRelative(8.893f)
                curveToRelative(-0.63f, -0.644f, -1.515f, -0.935f, -2.372f, -0.955f)
                curveToRelative(-0.09f, -0.003f, -0.196f, 0.0f, -0.294f, -0.003f)
                curveToRelative(-1.558f, 0.012f, -3.216f, 0.888f, -3.216f, 3.308f)
                reflectiveCurveToRelative(1.672f, 3.306f, 3.232f, 3.328f)
                curveToRelative(0.096f, 0.003f, 0.191f, 0.003f, 0.286f, 0.0f)
                curveToRelative(0.521f, -0.008f, 3.042f, -0.21f, 3.216f, -3.005f)
                horizontalLineToRelative(0.017f)
                lineToRelative(0.01f, -9.012f)
                lineToRelative(9.6f, 2.56f)
                verticalLineToRelative(8.034f)
                curveToRelative(-0.63f, -0.644f, -1.515f, -0.938f, -2.378f, -0.958f)
                lineToRelative(-0.291f, -0.003f)
                curveToRelative(-1.555f, 0.014f, -3.216f, 0.888f, -3.216f, 3.309f)
                curveToRelative(0.0f, 2.42f, 1.672f, 3.305f, 3.235f, 3.327f)
                lineToRelative(0.28f, -0.003f)
                curveToRelative(0.541f, -0.008f, 3.233f, -0.215f, 3.233f, -3.308f)
                curveToRelative(0.0f, -0.05f, -0.011f, -0.09f, -0.014f, -0.14f)
                horizontalLineToRelative(0.014f)
                lineTo(20.624f, 5.567f)
                horizontalLineToRelative(-0.003f)
                close()
            }
        }
        .build()
        return _musicLight!!
    }

private var _musicLight: ImageVector? = null
