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

public val LightGroup.LocationMapLight: ImageVector
    get() {
        if (_locationMapLight != null) {
            return _locationMapLight!!
        }
        _locationMapLight = Builder(name = "LocationMapLight", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.246f, 21.246f)
                lineTo(13.7f, 21.246f)
                arcToRelative(3.398f, 3.398f, 0.0f, false, true, -3.396f, -3.396f)
                verticalLineToRelative(-1.13f)
                curveToRelative(0.0f, -1.89f, -1.555f, -2.348f, -2.806f, -2.715f)
                curveToRelative(-1.208f, -0.358f, -1.957f, -0.638f, -2.102f, -1.464f)
                lineTo(5.396f, 11.44f)
                arcToRelative(2.458f, 2.458f, 0.0f, false, false, -2.454f, -2.454f)
                horizontalLineToRelative(-0.188f)
                lineTo(2.754f, 6.53f)
                horizontalLineToRelative(7.744f)
                curveToRelative(0.193f, 2.42f, 3.86f, 7.899f, 4.019f, 8.136f)
                arcToRelative(0.375f, 0.375f, 0.0f, false, false, 0.314f, 0.164f)
                arcToRelative(0.387f, 0.387f, 0.0f, false, false, 0.314f, -0.164f)
                curveToRelative(0.16f, -0.237f, 3.826f, -5.715f, 4.02f, -8.136f)
                horizontalLineToRelative(1.705f)
                verticalLineToRelative(10.57f)
                arcToRelative(0.377f, 0.377f, 0.0f, false, false, 0.753f, 0.0f)
                lineTo(21.623f, 5.773f)
                lineTo(19.13f, 5.773f)
                curveTo(18.86f, 3.618f, 17.072f, 2.0f, 14.83f, 2.0f)
                curveToRelative(-2.24f, 0.0f, -4.028f, 1.618f, -4.299f, 3.773f)
                lineTo(2.0f, 5.773f)
                lineTo(2.0f, 22.0f)
                horizontalLineToRelative(19.246f)
                arcToRelative(0.377f, 0.377f, 0.0f, false, false, 0.0f, -0.754f)
                close()
                moveTo(14.831f, 2.754f)
                arcToRelative(3.547f, 3.547f, 0.0f, false, true, 3.584f, 3.584f)
                curveToRelative(0.0f, 1.58f, -2.352f, 5.532f, -3.584f, 7.43f)
                curveToRelative(-1.232f, -1.898f, -3.585f, -5.85f, -3.585f, -7.43f)
                arcToRelative(3.547f, 3.547f, 0.0f, false, true, 3.585f, -3.584f)
                close()
                moveTo(2.754f, 21.246f)
                lineTo(2.754f, 9.734f)
                horizontalLineToRelative(0.188f)
                curveToRelative(0.937f, 0.0f, 1.7f, 0.764f, 1.7f, 1.7f)
                verticalLineToRelative(1.131f)
                curveToRelative(0.0f, 0.02f, 0.0f, 0.039f, 0.005f, 0.058f)
                curveToRelative(0.213f, 1.387f, 1.503f, 1.768f, 2.638f, 2.102f)
                curveToRelative(1.41f, 0.415f, 2.266f, 0.758f, 2.266f, 1.995f)
                lineTo(9.551f, 18.0f)
                curveToRelative(0.0f, 0.024f, 0.0f, 0.043f, 0.005f, 0.063f)
                arcToRelative(4.153f, 4.153f, 0.0f, false, false, 1.768f, 3.183f)
                horizontalLineToRelative(-8.57f)
                close()
                moveTo(16.624f, 6.338f)
                arcToRelative(1.792f, 1.792f, 0.0f, true, false, -3.584f, -0.001f)
                arcToRelative(1.792f, 1.792f, 0.0f, false, false, 3.583f, 0.001f)
                close()
                moveTo(14.83f, 7.377f)
                arcToRelative(1.04f, 1.04f, 0.0f, false, true, -1.039f, -1.039f)
                curveToRelative(0.0f, -0.575f, 0.464f, -1.038f, 1.039f, -1.038f)
                curveToRelative(0.57f, 0.0f, 1.039f, 0.463f, 1.039f, 1.038f)
                arcToRelative(1.04f, 1.04f, 0.0f, false, true, -1.04f, 1.039f)
                close()
                moveTo(22.0f, 19.357f)
                arcToRelative(0.755f, 0.755f, 0.0f, false, true, -1.507f, 0.0f)
                arcToRelative(0.755f, 0.755f, 0.0f, false, true, 1.507f, 0.0f)
                close()
            }
        }
        .build()
        return _locationMapLight!!
    }

private var _locationMapLight: ImageVector? = null
