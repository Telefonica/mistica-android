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

public val LightGroup.TachometerLight: ImageVector
    get() {
        if (_tachometerLight != null) {
            return _tachometerLight!!
        }
        _tachometerLight = Builder(name = "TachometerLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.282f, 19.257f)
                curveToRelative(0.0f, 0.41f, -0.32f, 0.743f, -0.713f, 0.743f)
                curveToRelative(-0.393f, 0.0f, -0.713f, -0.333f, -0.713f, -0.743f)
                reflectiveCurveToRelative(0.32f, -0.743f, 0.713f, -0.743f)
                curveToRelative(0.394f, 0.0f, 0.713f, 0.333f, 0.713f, 0.743f)
                close()
                moveTo(22.0f, 14.422f)
                curveToRelative(0.0f, 0.962f, -0.128f, 1.915f, -0.375f, 2.834f)
                arcToRelative(0.352f, 0.352f, 0.0f, false, true, -0.439f, 0.258f)
                arcToRelative(0.371f, 0.371f, 0.0f, false, true, -0.246f, -0.458f)
                arcToRelative(9.986f, 9.986f, 0.0f, false, false, 0.347f, -2.634f)
                arcToRelative(9.904f, 9.904f, 0.0f, false, false, -1.956f, -5.935f)
                lineToRelative(-4.488f, 8.126f)
                arcToRelative(3.4f, 3.4f, 0.0f, false, true, -0.334f, 0.414f)
                arcToRelative(3.45f, 3.45f, 0.0f, false, true, -2.5f, 1.077f)
                arcToRelative(3.46f, 3.46f, 0.0f, false, true, -2.504f, -1.076f)
                curveToRelative(-1.38f, -1.439f, -1.38f, -3.778f, 0.0f, -5.216f)
                arcToRelative(3.26f, 3.26f, 0.0f, false, true, 0.365f, -0.324f)
                curveToRelative(0.01f, -0.01f, 0.023f, -0.014f, 0.032f, -0.024f)
                lineToRelative(5.014f, -3.01f)
                arcToRelative(6.214f, 6.214f, 0.0f, false, false, -2.911f, -0.734f)
                curveToRelative(-3.542f, 0.0f, -6.426f, 3.006f, -6.426f, 6.697f)
                curveToRelative(0.0f, 1.868f, 0.763f, 3.668f, 2.093f, 4.935f)
                arcToRelative(0.381f, 0.381f, 0.0f, false, true, 0.023f, 0.524f)
                arcToRelative(0.34f, 0.34f, 0.0f, false, true, -0.265f, 0.12f)
                arcToRelative(0.346f, 0.346f, 0.0f, false, true, -0.243f, -0.1f)
                arcToRelative(7.613f, 7.613f, 0.0f, false, true, -2.326f, -5.483f)
                curveToRelative(0.0f, -4.106f, 3.204f, -7.44f, 7.139f, -7.44f)
                curveToRelative(1.303f, 0.0f, 2.55f, 0.366f, 3.638f, 1.038f)
                lineToRelative(-0.443f, 0.266f)
                lineToRelative(2.495f, -1.495f)
                arcToRelative(8.996f, 8.996f, 0.0f, false, false, -5.695f, -2.039f)
                curveToRelative(-5.118f, 0.0f, -9.282f, 4.34f, -9.282f, 9.674f)
                curveToRelative(0.0f, 1.772f, 0.466f, 3.511f, 1.344f, 5.016f)
                arcToRelative(0.38f, 0.38f, 0.0f, false, true, -0.12f, 0.51f)
                arcToRelative(0.335f, 0.335f, 0.0f, false, true, -0.182f, 0.052f)
                arcToRelative(0.353f, 0.353f, 0.0f, false, true, -0.306f, -0.18f)
                arcTo(10.678f, 10.678f, 0.0f, false, true, 2.0f, 14.421f)
                curveTo(2.0f, 8.678f, 6.484f, 4.0f, 12.0f, 4.0f)
                curveToRelative(2.413f, 0.0f, 4.63f, 0.896f, 6.357f, 2.386f)
                lineToRelative(2.034f, -1.219f)
                arcToRelative(0.342f, 0.342f, 0.0f, false, true, 0.43f, 0.057f)
                arcToRelative(0.38f, 0.38f, 0.0f, false, true, 0.055f, 0.448f)
                lineToRelative(-1.17f, 2.12f)
                arcTo(10.652f, 10.652f, 0.0f, false, true, 22.0f, 14.422f)
                close()
                moveTo(19.6f, 6.501f)
                lineTo(10.268f, 12.098f)
                arcToRelative(2.134f, 2.134f, 0.0f, false, false, -0.265f, 0.243f)
                curveToRelative(-1.102f, 1.148f, -1.102f, 3.015f, 0.0f, 4.163f)
                arcToRelative(2.747f, 2.747f, 0.0f, false, false, 3.994f, 0.0f)
                curveToRelative(0.087f, -0.09f, 0.165f, -0.181f, 0.233f, -0.277f)
                lineToRelative(5.37f, -9.726f)
                close()
            }
        }
        .build()
        return _tachometerLight!!
    }

private var _tachometerLight: ImageVector? = null
