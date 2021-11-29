package com.telefonica.mistica.compose.misticaicons.telefonica.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.telefonica.FilledGroup

public val FilledGroup.PowerFilled: ImageVector
    get() {
        if (_powerFilled != null) {
            return _powerFilled!!
        }
        _powerFilled = Builder(name = "PowerFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.234f, 4.579f)
                curveToRelative(-1.672f, -1.611f, -4.106f, -2.429f, -7.238f, -2.429f)
                curveToRelative(-3.132f, 0.0f, -5.563f, 0.818f, -7.233f, 2.429f)
                curveTo(3.03f, 6.254f, 2.15f, 8.749f, 2.15f, 12.004f)
                reflectiveCurveToRelative(0.88f, 5.751f, 2.613f, 7.423f)
                curveToRelative(1.673f, 1.61f, 4.107f, 2.429f, 7.236f, 2.429f)
                curveToRelative(3.129f, 0.0f, 5.566f, -0.818f, 7.238f, -2.429f)
                curveToRelative(1.737f, -1.672f, 2.616f, -4.17f, 2.616f, -7.423f)
                curveToRelative(0.0f, -3.252f, -0.882f, -5.75f, -2.619f, -7.425f)
                close()
                moveTo(11.489f, 4.887f)
                curveToRelative(0.0f, -0.308f, 0.252f, -0.56f, 0.56f, -0.56f)
                curveToRelative(0.308f, 0.0f, 0.56f, 0.252f, 0.56f, 0.56f)
                verticalLineToRelative(4.098f)
                curveToRelative(0.0f, 0.308f, -0.252f, 0.56f, -0.56f, 0.56f)
                arcToRelative(0.562f, 0.562f, 0.0f, false, true, -0.56f, -0.56f)
                lineTo(11.489f, 4.887f)
                close()
                moveTo(16.531f, 16.593f)
                curveToRelative(-1.036f, 1.0f, -2.535f, 1.504f, -4.457f, 1.504f)
                curveToRelative(-1.921f, 0.0f, -3.417f, -0.507f, -4.453f, -1.507f)
                curveToRelative(-1.076f, -1.037f, -1.622f, -2.577f, -1.622f, -4.572f)
                curveToRelative(0.0f, -1.658f, 0.378f, -3.005f, 1.126f, -4.008f)
                curveToRelative(0.74f, -0.989f, 1.82f, -1.633f, 3.218f, -1.91f)
                arcToRelative(0.559f, 0.559f, 0.0f, true, true, 0.219f, 1.098f)
                curveToRelative(-2.32f, 0.462f, -3.446f, 2.039f, -3.446f, 4.82f)
                curveToRelative(0.0f, 1.681f, 0.432f, 2.947f, 1.28f, 3.765f)
                curveToRelative(0.821f, 0.79f, 2.06f, 1.19f, 3.678f, 1.19f)
                curveToRelative(1.62f, 0.0f, 2.857f, -0.4f, 3.678f, -1.19f)
                curveToRelative(0.849f, -0.818f, 1.28f, -2.087f, 1.28f, -3.765f)
                curveToRelative(0.0f, -2.82f, -1.16f, -4.403f, -3.543f, -4.84f)
                arcToRelative(0.56f, 0.56f, 0.0f, true, true, 0.202f, -1.104f)
                curveToRelative(1.434f, 0.264f, 2.543f, 0.9f, 3.302f, 1.891f)
                curveToRelative(0.77f, 1.009f, 1.16f, 2.37f, 1.16f, 4.05f)
                curveToRelative(0.003f, 2.0f, -0.544f, 3.538f, -1.622f, 4.578f)
                close()
            }
        }
        .build()
        return _powerFilled!!
    }

private var _powerFilled: ImageVector? = null
