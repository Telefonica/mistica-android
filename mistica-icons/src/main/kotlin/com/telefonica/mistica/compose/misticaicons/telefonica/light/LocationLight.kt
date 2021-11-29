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

public val LightGroup.LocationLight: ImageVector
    get() {
        if (_locationLight != null) {
            return _locationLight!!
        }
        _locationLight = Builder(name = "LocationLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.975f, 20.974f)
                curveToRelative(1.558f, -1.776f, 6.195f, -8.005f, 6.207f, -11.825f)
                curveToRelative(0.01f, -4.061f, -2.177f, -6.304f, -6.162f, -6.315f)
                horizontalLineToRelative(-0.031f)
                curveToRelative(-3.968f, 0.0f, -6.16f, 2.228f, -6.17f, 6.281f)
                curveToRelative(-0.012f, 3.854f, 4.603f, 10.086f, 6.156f, 11.86f)
                close()
                moveTo(12.02f, 2.0f)
                curveToRelative(4.384f, 0.014f, 6.994f, 2.687f, 6.98f, 7.152f)
                curveToRelative(-0.014f, 4.346f, -5.369f, 11.333f, -6.736f, 12.725f)
                arcToRelative(0.401f, 0.401f, 0.0f, false, true, -0.573f, 0.005f)
                lineToRelative(-0.006f, -0.005f)
                curveTo(10.318f, 20.49f, 4.986f, 13.5f, 5.0f, 9.109f)
                curveTo(5.014f, 4.655f, 7.627f, 2.0f, 11.989f, 2.0f)
                horizontalLineToRelative(0.03f)
                close()
                moveTo(12.0f, 10.407f)
                curveToRelative(1.094f, 0.0f, 1.673f, -0.589f, 1.673f, -1.705f)
                curveToRelative(0.0f, -1.115f, -0.579f, -1.704f, -1.673f, -1.704f)
                reflectiveCurveToRelative(-1.676f, 0.589f, -1.676f, 1.704f)
                curveToRelative(0.0f, 1.116f, 0.58f, 1.705f, 1.676f, 1.705f)
                close()
                moveTo(12.0f, 6.164f)
                curveToRelative(1.56f, 0.0f, 2.492f, 0.95f, 2.492f, 2.538f)
                curveToRelative(0.0f, 1.588f, -0.931f, 2.539f, -2.492f, 2.539f)
                curveToRelative(-1.56f, 0.0f, -2.492f, -0.95f, -2.492f, -2.539f)
                curveToRelative(0.0f, -1.588f, 0.931f, -2.538f, 2.492f, -2.538f)
                close()
            }
        }
        .build()
        return _locationLight!!
    }

private var _locationLight: ImageVector? = null
