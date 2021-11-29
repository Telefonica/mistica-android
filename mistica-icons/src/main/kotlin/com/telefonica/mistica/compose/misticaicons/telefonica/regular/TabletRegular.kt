package com.telefonica.mistica.compose.misticaicons.telefonica.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.telefonica.RegularGroup

public val RegularGroup.TabletRegular: ImageVector
    get() {
        if (_tabletRegular != null) {
            return _tabletRegular!!
        }
        _tabletRegular = Builder(name = "TabletRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.931f, 20.457f)
                curveToRelative(0.99f, 0.0f, 2.168f, -0.42f, 2.168f, -2.415f)
                verticalLineToRelative(-0.034f)
                lineTo(5.73f, 18.008f)
                verticalLineToRelative(0.034f)
                curveToRelative(0.0f, 0.05f, -0.002f, 0.1f, -0.008f, 0.151f)
                curveToRelative(0.0f, 0.0f, -0.092f, 0.989f, 0.457f, 1.62f)
                curveToRelative(0.37f, 0.422f, 1.003f, 0.638f, 1.882f, 0.638f)
                lineToRelative(7.714f, -0.003f)
                curveToRelative(0.031f, 0.0f, 0.062f, 0.0f, 0.096f, 0.003f)
                lineToRelative(0.061f, 0.006f)
                close()
                moveTo(6.61f, 3.58f)
                curveToRelative(-0.218f, 0.134f, -0.88f, 0.546f, -0.88f, 2.042f)
                verticalLineToRelative(11.157f)
                lineTo(18.1f, 16.779f)
                curveToRelative(0.0f, -4.236f, -0.005f, -11.168f, -0.005f, -11.168f)
                curveToRelative(0.0f, -0.037f, 0.003f, -0.073f, 0.005f, -0.112f)
                curveToRelative(0.0f, 0.0f, 0.062f, -1.014f, -0.512f, -1.653f)
                curveToRelative(-0.37f, -0.406f, -0.975f, -0.614f, -1.796f, -0.614f)
                horizontalLineToRelative(-7.75f)
                lineToRelative(-0.082f, -0.002f)
                horizontalLineToRelative(-0.042f)
                curveToRelative(-0.176f, 0.0f, -0.79f, 0.025f, -1.308f, 0.35f)
                close()
                moveTo(19.282f, 5.608f)
                reflectiveCurveToRelative(0.006f, 8.507f, 0.006f, 12.431f)
                curveToRelative(0.0f, 3.426f, -2.675f, 3.644f, -3.358f, 3.644f)
                curveToRelative(-0.101f, 0.0f, -0.157f, -0.002f, -0.157f, -0.002f)
                reflectiveCurveToRelative(-3.757f, 0.002f, -7.715f, 0.002f)
                curveToRelative(-3.958f, 0.0f, -3.52f, -3.641f, -3.52f, -3.641f)
                lineTo(4.538f, 5.622f)
                curveTo(4.538f, 2.193f, 7.292f, 2.0f, 7.914f, 2.0f)
                curveToRelative(0.078f, 0.0f, 0.123f, 0.003f, 0.123f, 0.003f)
                lineTo(15.788f, 2.0f)
                curveToRelative(3.81f, 0.003f, 3.493f, 3.608f, 3.493f, 3.608f)
                close()
                moveTo(11.907f, 18.504f)
                curveToRelative(0.457f, 0.0f, 0.731f, 0.283f, 0.731f, 0.76f)
                curveToRelative(0.0f, 0.232f, -0.064f, 0.417f, -0.19f, 0.551f)
                curveToRelative(-0.13f, 0.135f, -0.314f, 0.207f, -0.54f, 0.207f)
                curveToRelative(-0.228f, 0.0f, -0.413f, -0.07f, -0.541f, -0.207f)
                curveToRelative(-0.127f, -0.134f, -0.19f, -0.32f, -0.19f, -0.552f)
                curveToRelative(0.0f, -0.476f, 0.274f, -0.759f, 0.73f, -0.759f)
                close()
            }
        }
        .build()
        return _tabletRegular!!
    }

private var _tabletRegular: ImageVector? = null
