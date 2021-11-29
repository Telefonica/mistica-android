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

public val FilledGroup.TabletFilled: ImageVector
    get() {
        if (_tabletFilled != null) {
            return _tabletFilled!!
        }
        _tabletFilled = Builder(name = "TabletFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.61f, 3.58f)
                curveToRelative(-0.22f, 0.134f, -0.88f, 0.546f, -0.88f, 2.042f)
                verticalLineToRelative(11.157f)
                lineTo(18.1f, 16.779f)
                curveToRelative(0.0f, -4.238f, -0.006f, -11.168f, -0.006f, -11.168f)
                curveToRelative(0.0f, -0.037f, 0.003f, -0.073f, 0.005f, -0.112f)
                curveToRelative(0.0f, 0.0f, 0.062f, -1.014f, -0.512f, -1.653f)
                curveToRelative(-0.367f, -0.406f, -0.97f, -0.614f, -1.793f, -0.614f)
                lineToRelative(-7.75f, 0.003f)
                curveToRelative(-0.029f, 0.0f, -0.054f, -0.003f, -0.082f, -0.003f)
                lineTo(7.92f, 3.232f)
                curveToRelative(-0.18f, -0.002f, -0.793f, 0.023f, -1.31f, 0.348f)
                close()
                moveTo(19.28f, 5.608f)
                reflectiveCurveToRelative(0.006f, 8.507f, 0.006f, 12.434f)
                curveToRelative(0.0f, 3.426f, -2.675f, 3.644f, -3.358f, 3.644f)
                curveToRelative(-0.101f, 0.0f, -0.157f, -0.003f, -0.157f, -0.003f)
                reflectiveCurveToRelative(-3.757f, 0.003f, -7.715f, 0.003f)
                curveToRelative(-3.958f, 0.0f, -3.52f, -3.638f, -3.52f, -3.638f)
                lineTo(4.536f, 5.628f)
                curveToRelative(0.0f, -3.43f, 2.756f, -3.622f, 3.378f, -3.622f)
                curveToRelative(0.078f, 0.0f, 0.123f, 0.002f, 0.123f, 0.002f)
                lineToRelative(7.75f, -0.002f)
                curveToRelative(3.807f, -0.003f, 3.493f, 3.602f, 3.493f, 3.602f)
                close()
                moveTo(11.905f, 18.406f)
                curveToRelative(-0.512f, 0.0f, -0.82f, 0.308f, -0.82f, 0.82f)
                curveToRelative(0.0f, 0.25f, 0.07f, 0.452f, 0.212f, 0.597f)
                curveToRelative(0.146f, 0.146f, 0.356f, 0.225f, 0.608f, 0.225f)
                reflectiveCurveToRelative(0.462f, -0.079f, 0.608f, -0.225f)
                curveToRelative(0.143f, -0.145f, 0.213f, -0.347f, 0.213f, -0.596f)
                curveToRelative(0.0f, -0.513f, -0.308f, -0.82f, -0.82f, -0.82f)
                close()
            }
        }
        .build()
        return _tabletFilled!!
    }

private var _tabletFilled: ImageVector? = null
