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

public val LightGroup.PercentLight: ImageVector
    get() {
        if (_percentLight != null) {
            return _percentLight!!
        }
        _percentLight = Builder(name = "PercentLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(14.318f, 15.69f)
                curveToRelative(0.633f, 0.0f, 0.837f, -0.204f, 0.837f, -0.835f)
                curveToRelative(0.0f, -0.633f, -0.204f, -0.837f, -0.837f, -0.837f)
                curveToRelative(-0.634f, 0.0f, -0.835f, 0.204f, -0.835f, 0.837f)
                curveToRelative(0.0f, 0.634f, 0.201f, 0.835f, 0.835f, 0.835f)
                close()
                moveTo(14.318f, 13.2f)
                curveToRelative(1.045f, 0.0f, 1.658f, 0.53f, 1.658f, 1.658f)
                curveToRelative(0.0f, 1.127f, -0.61f, 1.656f, -1.658f, 1.656f)
                curveToRelative(-1.045f, 0.0f, -1.656f, -0.53f, -1.656f, -1.656f)
                reflectiveCurveToRelative(0.608f, -1.658f, 1.656f, -1.658f)
                close()
                moveTo(9.672f, 8.473f)
                curveToRelative(-0.63f, 0.0f, -0.834f, 0.205f, -0.834f, 0.838f)
                curveToRelative(0.0f, 0.63f, 0.204f, 0.835f, 0.834f, 0.835f)
                curveToRelative(0.634f, 0.0f, 0.838f, -0.202f, 0.838f, -0.835f)
                curveToRelative(-0.003f, -0.636f, -0.207f, -0.838f, -0.838f, -0.838f)
                close()
                moveTo(9.672f, 10.964f)
                curveToRelative(-1.045f, 0.0f, -1.655f, -0.527f, -1.655f, -1.656f)
                reflectiveCurveToRelative(0.61f, -1.658f, 1.655f, -1.658f)
                reflectiveCurveToRelative(1.659f, 0.53f, 1.659f, 1.658f)
                curveToRelative(0.0f, 1.13f, -0.614f, 1.656f, -1.659f, 1.656f)
                close()
                moveTo(15.724f, 7.207f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, true, 0.073f, 0.574f)
                lineToRelative(-6.945f, 8.932f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, true, -0.648f, -0.502f)
                lineToRelative(6.943f, -8.934f)
                arcToRelative(0.407f, 0.407f, 0.0f, false, true, 0.571f, -0.076f)
                lineToRelative(0.006f, 0.006f)
                close()
            }
        }
        .build()
        return _percentLight!!
    }

private var _percentLight: ImageVector? = null
