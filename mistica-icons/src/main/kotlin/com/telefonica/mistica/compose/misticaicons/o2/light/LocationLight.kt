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
                moveTo(12.5f, 2.0f)
                arcToRelative(6.18f, 6.18f, 0.0f, false, true, 4.461f, 1.889f)
                curveToRelative(0.14f, 0.148f, 0.14f, 0.372f, 0.0f, 0.516f)
                arcToRelative(0.326f, 0.326f, 0.0f, false, true, -0.49f, 0.0f)
                curveTo(15.416f, 3.293f, 14.05f, 2.74f, 12.5f, 2.74f)
                curveToRelative(-3.303f, 0.0f, -5.798f, 2.777f, -5.798f, 6.479f)
                curveToRelative(0.0f, 4.554f, 4.64f, 10.444f, 5.798f, 11.853f)
                curveToRelative(1.162f, -1.409f, 5.798f, -7.3f, 5.798f, -11.853f)
                curveToRelative(0.0f, -0.556f, -0.073f, -1.073f, -0.175f, -1.593f)
                curveToRelative(-0.034f, -0.184f, 0.072f, -0.408f, 0.28f, -0.444f)
                arcToRelative(0.359f, 0.359f, 0.0f, false, true, 0.422f, 0.296f)
                curveToRelative(0.107f, 0.556f, 0.175f, 1.149f, 0.175f, 1.74f)
                curveToRelative(0.0f, 5.443f, -5.976f, 12.37f, -6.253f, 12.666f)
                arcTo(0.347f, 0.347f, 0.0f, false, true, 12.5f, 22.0f)
                arcToRelative(0.31f, 0.31f, 0.0f, false, true, -0.247f, -0.112f)
                curveTo(11.973f, 21.592f, 6.0f, 14.665f, 6.0f, 9.223f)
                curveTo(6.0f, 5.113f, 8.81f, 2.0f, 12.5f, 2.0f)
                close()
                moveTo(17.77f, 4.961f)
                curveToRelative(0.388f, 0.0f, 0.702f, 0.332f, 0.702f, 0.74f)
                curveToRelative(0.0f, 0.41f, -0.314f, 0.74f, -0.702f, 0.74f)
                curveToRelative(-0.388f, 0.0f, -0.703f, -0.33f, -0.703f, -0.74f)
                curveToRelative(0.0f, -0.408f, 0.315f, -0.74f, 0.703f, -0.74f)
                close()
            }
        }
        .build()
        return _locationLight!!
    }

private var _locationLight: ImageVector? = null
