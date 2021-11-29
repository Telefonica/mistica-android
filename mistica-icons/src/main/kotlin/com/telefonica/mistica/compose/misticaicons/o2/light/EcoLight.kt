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

public val LightGroup.EcoLight: ImageVector
    get() {
        if (_ecoLight != null) {
            return _ecoLight!!
        }
        _ecoLight = Builder(name = "EcoLight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.787f, 2.054f)
                curveToRelative(0.142f, -0.072f, 0.284f, -0.072f, 0.39f, 0.0f)
                curveToRelative(0.25f, 0.14f, 5.827f, 3.752f, 5.823f, 10.297f)
                curveToRelative(0.0f, 2.324f, -0.707f, 4.216f, -2.082f, 5.649f)
                arcToRelative(0.336f, 0.336f, 0.0f, false, true, -0.493f, 0.0f)
                arcToRelative(0.346f, 0.346f, 0.0f, false, true, 0.0f, -0.5f)
                curveToRelative(1.232f, -1.289f, 1.868f, -3.04f, 1.868f, -5.149f)
                curveToRelative(0.0f, -5.509f, -4.341f, -8.9f, -5.293f, -9.58f)
                curveToRelative(-0.952f, 0.68f, -5.293f, 4.075f, -5.293f, 9.58f)
                curveToRelative(0.0f, 5.109f, 3.674f, 6.645f, 4.941f, 7.04f)
                verticalLineToRelative(-12.4f)
                curveToRelative(0.0f, -0.213f, 0.139f, -0.357f, 0.352f, -0.357f)
                curveToRelative(0.21f, 0.0f, 0.352f, 0.14f, 0.352f, 0.356f)
                verticalLineToRelative(14.654f)
                curveToRelative(0.0f, 0.212f, -0.139f, 0.356f, -0.352f, 0.356f)
                curveToRelative(-0.21f, 0.0f, -0.352f, -0.14f, -0.352f, -0.356f)
                lineTo(11.648f, 20.14f)
                curveTo(10.448f, 19.784f, 6.0f, 18.136f, 6.0f, 12.347f)
                curveToRelative(0.0f, -6.54f, 5.577f, -10.153f, 5.787f, -10.293f)
                close()
                moveTo(14.121f, 18.424f)
                curveToRelative(0.39f, 0.0f, 0.707f, 0.32f, 0.707f, 0.716f)
                arcToRelative(0.712f, 0.712f, 0.0f, false, true, -0.707f, 0.716f)
                arcToRelative(0.712f, 0.712f, 0.0f, false, true, -0.707f, -0.716f)
                curveToRelative(0.0f, -0.396f, 0.317f, -0.716f, 0.707f, -0.716f)
                close()
            }
        }
        .build()
        return _ecoLight!!
    }

private var _ecoLight: ImageVector? = null
