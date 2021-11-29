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

public val LightGroup.TabletLight: ImageVector
    get() {
        if (_tabletLight != null) {
            return _tabletLight!!
        }
        _tabletLight = Builder(name = "TabletLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.933f, 21.021f)
                curveToRelative(0.958f, 0.0f, 2.563f, -0.367f, 2.563f, -2.824f)
                verticalLineToRelative(-0.152f)
                horizontalLineTo(5.33f)
                verticalLineToRelative(0.155f)
                curveToRelative(0.0f, 0.033f, -0.003f, 0.067f, -0.006f, 0.1f)
                curveToRelative(0.0f, 0.006f, -0.117f, 1.166f, 0.552f, 1.94f)
                curveToRelative(0.449f, 0.518f, 1.183f, 0.778f, 2.183f, 0.778f)
                lineToRelative(7.717f, -0.003f)
                curveToRelative(0.02f, 0.0f, 0.042f, 0.0f, 0.061f, 0.003f)
                curveToRelative(0.006f, 0.003f, 0.04f, 0.003f, 0.096f, 0.003f)
                close()
                moveTo(6.4f, 3.377f)
                curveToRelative(-0.72f, 0.449f, -1.07f, 1.233f, -1.07f, 2.396f)
                verticalLineToRelative(11.451f)
                horizontalLineToRelative(13.166f)
                curveToRelative(0.0f, -4.202f, -0.005f, -11.462f, -0.005f, -11.462f)
                curveToRelative(0.0f, -0.026f, 0.0f, -0.05f, 0.003f, -0.073f)
                curveToRelative(0.0f, -0.006f, 0.08f, -1.188f, -0.614f, -1.964f)
                curveToRelative(-0.446f, -0.5f, -1.146f, -0.751f, -2.088f, -0.751f)
                lineToRelative(-7.752f, 0.003f)
                curveToRelative(-0.02f, 0.0f, -0.037f, 0.0f, -0.054f, -0.003f)
                horizontalLineToRelative(-0.07f)
                curveToRelative(-0.201f, -0.003f, -0.905f, 0.025f, -1.516f, 0.403f)
                close()
                moveTo(19.284f, 5.76f)
                reflectiveCurveToRelative(0.005f, 8.51f, 0.005f, 12.438f)
                curveToRelative(0.0f, 3.426f, -2.676f, 3.645f, -3.36f, 3.645f)
                curveToRelative(-0.1f, 0.0f, -0.156f, -0.006f, -0.156f, -0.006f)
                reflectiveCurveToRelative(-3.758f, 0.003f, -7.717f, 0.003f)
                curveToRelative(-3.959f, 0.0f, -3.522f, -3.64f, -3.522f, -3.64f)
                verticalLineToRelative(-0.526f)
                curveToRelative(-0.003f, -0.014f, -0.008f, -0.025f, -0.008f, -0.04f)
                curveToRelative(0.0f, -0.013f, 0.005f, -0.025f, 0.008f, -0.039f)
                verticalLineTo(5.773f)
                curveToRelative(0.0f, -3.43f, 2.757f, -3.623f, 3.38f, -3.623f)
                curveToRelative(0.078f, 0.0f, 0.123f, 0.003f, 0.123f, 0.003f)
                reflectiveCurveToRelative(3.948f, -0.003f, 7.755f, -0.003f)
                curveToRelative(3.806f, 0.003f, 3.492f, 3.609f, 3.492f, 3.609f)
                close()
                moveTo(11.906f, 18.86f)
                curveToRelative(0.457f, 0.0f, 0.732f, 0.283f, 0.732f, 0.76f)
                curveToRelative(0.0f, 0.232f, -0.065f, 0.417f, -0.191f, 0.551f)
                curveToRelative(-0.129f, 0.137f, -0.317f, 0.207f, -0.54f, 0.207f)
                curveToRelative(-0.225f, 0.0f, -0.413f, -0.07f, -0.542f, -0.207f)
                curveToRelative(-0.126f, -0.134f, -0.19f, -0.32f, -0.19f, -0.552f)
                curveToRelative(0.0f, -0.476f, 0.272f, -0.76f, 0.731f, -0.76f)
                close()
            }
        }
        .build()
        return _tabletLight!!
    }

private var _tabletLight: ImageVector? = null
