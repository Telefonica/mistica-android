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

public val LightGroup.MultideviceLight: ImageVector
    get() {
        if (_multideviceLight != null) {
            return _multideviceLight!!
        }
        _multideviceLight = Builder(name = "MultideviceLight", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.147f, 2.0f)
                horizontalLineToRelative(-5.555f)
                curveToRelative(-1.037f, 0.0f, -1.853f, 0.825f, -1.853f, 1.876f)
                verticalLineToRelative(0.749f)
                lineTo(3.853f, 4.625f)
                curveTo(2.815f, 4.625f, 2.0f, 5.45f, 2.0f, 6.501f)
                verticalLineToRelative(14.623f)
                curveTo(2.0f, 22.174f, 2.815f, 23.0f, 3.853f, 23.0f)
                horizontalLineToRelative(11.11f)
                curveToRelative(1.037f, 0.0f, 1.852f, -0.825f, 1.852f, -1.876f)
                verticalLineToRelative(-3.0f)
                curveToRelative(0.0f, -0.225f, -0.147f, -0.374f, -0.37f, -0.374f)
                curveToRelative(-0.222f, 0.0f, -0.37f, 0.149f, -0.37f, 0.374f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 0.638f, -0.483f, 1.123f, -1.108f, 1.123f)
                lineTo(3.853f, 22.247f)
                curveToRelative(-0.63f, 0.0f, -1.109f, -0.49f, -1.109f, -1.123f)
                verticalLineToRelative(-0.375f)
                lineTo(12.0f, 20.749f)
                curveToRelative(0.223f, 0.0f, 0.37f, -0.148f, 0.37f, -0.374f)
                reflectiveCurveToRelative(-0.147f, -0.374f, -0.37f, -0.374f)
                lineTo(2.744f, 20.001f)
                lineTo(2.744f, 7.624f)
                horizontalLineToRelative(9.995f)
                verticalLineToRelative(7.122f)
                curveToRelative(0.0f, 1.05f, 0.816f, 1.876f, 1.853f, 1.876f)
                horizontalLineToRelative(5.555f)
                curveToRelative(1.038f, 0.0f, 1.853f, -0.825f, 1.853f, -1.876f)
                lineTo(22.0f, 3.876f)
                curveTo(22.0f, 2.826f, 21.185f, 2.0f, 20.147f, 2.0f)
                close()
                moveTo(13.483f, 5.378f)
                horizontalLineToRelative(7.778f)
                verticalLineToRelative(7.875f)
                horizontalLineToRelative(-7.778f)
                lineTo(13.483f, 5.378f)
                close()
                moveTo(14.593f, 2.753f)
                horizontalLineToRelative(5.554f)
                curveToRelative(0.63f, 0.0f, 1.109f, 0.49f, 1.109f, 1.123f)
                verticalLineToRelative(0.749f)
                horizontalLineToRelative(-7.773f)
                verticalLineToRelative(-0.749f)
                curveToRelative(0.0f, -0.638f, 0.48f, -1.123f, 1.11f, -1.123f)
                close()
                moveTo(2.743f, 6.876f)
                lineTo(2.743f, 6.5f)
                curveToRelative(0.0f, -0.638f, 0.483f, -1.123f, 1.11f, -1.123f)
                horizontalLineToRelative(8.885f)
                verticalLineToRelative(1.498f)
                lineTo(2.744f, 6.875f)
                close()
                moveTo(20.146f, 15.874f)
                horizontalLineToRelative(-5.555f)
                curveToRelative(-0.63f, 0.0f, -1.109f, -0.49f, -1.109f, -1.123f)
                verticalLineToRelative(-0.749f)
                horizontalLineToRelative(7.778f)
                verticalLineToRelative(0.749f)
                curveToRelative(-0.005f, 0.638f, -0.484f, 1.123f, -1.114f, 1.123f)
                close()
                moveTo(13.482f, 20.375f)
                curveToRelative(0.0f, 0.413f, 0.332f, 0.749f, 0.74f, 0.749f)
                curveToRelative(0.407f, 0.0f, 0.74f, -0.336f, 0.74f, -0.749f)
                arcToRelative(0.745f, 0.745f, 0.0f, false, false, -0.74f, -0.749f)
                arcToRelative(0.745f, 0.745f, 0.0f, false, false, -0.74f, 0.749f)
                close()
            }
        }
        .build()
        return _multideviceLight!!
    }

private var _multideviceLight: ImageVector? = null
