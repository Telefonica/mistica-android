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

public val LightGroup.TimeLight: ImageVector
    get() {
        if (_timeLight != null) {
            return _timeLight!!
        }
        _timeLight = Builder(name = "TimeLight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.992f, 21.02f)
                curveToRelative(5.99f, 0.0f, 9.027f, -3.035f, 9.027f, -9.022f)
                curveToRelative(0.0f, -5.99f, -3.037f, -9.027f, -9.027f, -9.027f)
                curveToRelative(-5.987f, 0.0f, -9.021f, 3.037f, -9.021f, 9.027f)
                curveToRelative(0.0f, 5.987f, 3.034f, 9.021f, 9.021f, 9.021f)
                close()
                moveTo(11.992f, 2.15f)
                curveToRelative(6.22f, 0.0f, 9.848f, 3.14f, 9.848f, 9.848f)
                curveToRelative(0.0f, 6.707f, -3.628f, 9.842f, -9.848f, 9.842f)
                curveToRelative(-6.22f, 0.0f, -9.842f, -3.135f, -9.842f, -9.842f)
                curveToRelative(0.0f, -6.707f, 3.623f, -9.848f, 9.842f, -9.848f)
                close()
                moveTo(12.407f, 12.096f)
                lineTo(15.315f, 15.006f)
                arcToRelative(0.408f, 0.408f, 0.0f, false, true, -0.011f, 0.58f)
                arcToRelative(0.408f, 0.408f, 0.0f, false, true, -0.569f, 0.0f)
                lineToRelative(-3.031f, -3.028f)
                arcToRelative(0.421f, 0.421f, 0.0f, false, true, -0.12f, -0.291f)
                lineTo(11.584f, 8.165f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, true, 0.817f, 0.0f)
                lineToRelative(0.006f, 3.93f)
                close()
            }
        }
        .build()
        return _timeLight!!
    }

private var _timeLight: ImageVector? = null
