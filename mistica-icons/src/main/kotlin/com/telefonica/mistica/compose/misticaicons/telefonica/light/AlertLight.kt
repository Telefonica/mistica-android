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

public val LightGroup.AlertLight: ImageVector
    get() {
        if (_alertLight != null) {
            return _alertLight!!
        }
        _alertLight = Builder(name = "AlertLight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.0f)
                curveToRelative(0.17f, 0.0f, 0.32f, 0.103f, 0.41f, 0.282f)
                lineToRelative(10.528f, 21.0f)
                arcToRelative(0.499f, 0.499f, 0.0f, false, true, -0.006f, 0.492f)
                curveToRelative(-0.085f, 0.145f, -0.245f, 0.226f, -0.436f, 0.226f)
                lineTo(1.507f, 23.0f)
                arcToRelative(0.499f, 0.499f, 0.0f, false, true, -0.44f, -0.226f)
                arcToRelative(0.499f, 0.499f, 0.0f, false, true, -0.005f, -0.491f)
                lineToRelative(10.53f, -21.001f)
                curveTo(11.68f, 1.103f, 11.831f, 1.0f, 12.0f, 1.0f)
                close()
                moveTo(12.003f, 1.805f)
                lineTo(1.676f, 22.398f)
                horizontalLineToRelative(20.648f)
                lineTo(12.004f, 1.805f)
                close()
                moveTo(12.003f, 19.309f)
                curveToRelative(0.213f, 0.0f, 0.339f, 0.126f, 0.339f, 0.339f)
                curveToRelative(0.0f, 0.213f, -0.122f, 0.338f, -0.339f, 0.338f)
                curveToRelative(-0.216f, 0.0f, -0.339f, -0.125f, -0.339f, -0.338f)
                curveToRelative(0.0f, -0.213f, 0.126f, -0.339f, 0.34f, -0.339f)
                close()
                moveTo(12.025f, 7.717f)
                curveToRelative(0.173f, 0.0f, 0.314f, 0.141f, 0.314f, 0.313f)
                verticalLineToRelative(9.174f)
                arcToRelative(0.314f, 0.314f, 0.0f, false, true, -0.627f, 0.0f)
                lineTo(11.712f, 8.03f)
                curveToRelative(0.0f, -0.172f, 0.14f, -0.313f, 0.313f, -0.313f)
                close()
            }
        }
        .build()
        return _alertLight!!
    }

private var _alertLight: ImageVector? = null
