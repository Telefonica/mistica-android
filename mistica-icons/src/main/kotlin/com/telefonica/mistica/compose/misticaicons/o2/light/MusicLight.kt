package com.telefonica.mistica.compose.misticaicons.o2.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.o2.LightGroup

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
                moveTo(17.412f, 3.172f)
                curveToRelative(0.18f, -0.072f, 0.4f, 0.073f, 0.435f, 0.257f)
                arcToRelative(0.467f, 0.467f, 0.0f, false, true, -0.223f, 0.474f)
                lineTo(9.283f, 6.176f)
                verticalLineToRelative(12.162f)
                curveTo(9.283f, 20.35f, 7.642f, 22.0f, 5.64f, 22.0f)
                curveTo(3.641f, 22.0f, 2.0f, 20.35f, 2.0f, 18.338f)
                reflectiveCurveToRelative(1.637f, -3.662f, 3.641f, -3.662f)
                curveToRelative(1.202f, 0.0f, 2.26f, 0.586f, 2.915f, 1.466f)
                lineTo(8.556f, 5.882f)
                curveToRelative(0.0f, -0.18f, 0.112f, -0.328f, 0.256f, -0.365f)
                close()
                moveTo(5.606f, 15.371f)
                curveToRelative(-1.602f, 0.0f, -2.915f, 1.32f, -2.915f, 2.93f)
                curveToRelative(0.0f, 1.611f, 1.31f, 2.932f, 2.915f, 2.932f)
                reflectiveCurveToRelative(2.914f, -1.32f, 2.914f, -2.931f)
                curveToRelative(0.0f, -1.61f, -1.313f, -2.931f, -2.914f, -2.931f)
                close()
                moveTo(21.636f, 2.0f)
                curveToRelative(0.22f, 0.0f, 0.364f, 0.145f, 0.364f, 0.365f)
                verticalLineToRelative(12.636f)
                curveToRelative(0.0f, 2.012f, -1.641f, 3.662f, -3.641f, 3.662f)
                reflectiveCurveToRelative(-3.642f, -1.65f, -3.642f, -3.662f)
                curveToRelative(0.0f, -2.011f, 1.637f, -3.662f, 3.642f, -3.662f)
                curveToRelative(1.201f, 0.0f, 2.26f, 0.587f, 2.914f, 1.466f)
                lineTo(21.273f, 2.365f)
                curveToRelative(0.0f, -0.22f, 0.144f, -0.365f, 0.364f, -0.365f)
                close()
                moveTo(18.36f, 12.07f)
                curveToRelative(-1.602f, 0.0f, -2.915f, 1.321f, -2.915f, 2.931f)
                reflectiveCurveToRelative(1.31f, 2.932f, 2.915f, 2.932f)
                curveToRelative(1.597f, 0.0f, 2.914f, -1.321f, 2.914f, -2.932f)
                curveToRelative(0.0f, -1.61f, -1.313f, -2.93f, -2.914f, -2.93f)
                close()
                moveTo(19.521f, 2.112f)
                curveToRelative(0.402f, 0.0f, 0.727f, 0.328f, 0.727f, 0.731f)
                curveToRelative(0.0f, 0.404f, -0.325f, 0.731f, -0.727f, 0.731f)
                arcToRelative(0.729f, 0.729f, 0.0f, false, true, -0.726f, -0.73f)
                curveToRelative(0.0f, -0.404f, 0.325f, -0.732f, 0.726f, -0.732f)
                close()
            }
        }
        .build()
        return _musicLight!!
    }

private var _musicLight: ImageVector? = null
