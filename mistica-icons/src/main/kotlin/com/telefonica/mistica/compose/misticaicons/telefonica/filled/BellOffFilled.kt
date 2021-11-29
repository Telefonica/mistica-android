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

public val FilledGroup.BellOffFilled: ImageVector
    get() {
        if (_bellOffFilled != null) {
            return _bellOffFilled!!
        }
        _bellOffFilled = Builder(name = "BellOffFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.019f, 20.482f)
                curveToRelative(0.638f, 0.0f, 1.1f, -0.165f, 1.411f, -0.501f)
                curveToRelative(0.325f, -0.353f, 0.43f, -0.838f, 0.46f, -1.19f)
                horizontalLineToRelative(-3.74f)
                curveToRelative(0.028f, 0.35f, 0.13f, 0.837f, 0.454f, 1.19f)
                curveToRelative(0.311f, 0.339f, 0.773f, 0.501f, 1.415f, 0.501f)
                close()
                moveTo(4.122f, 2.202f)
                lineTo(20.89f, 20.653f)
                arcToRelative(0.593f, 0.593f, 0.0f, false, true, -0.037f, 0.838f)
                lineToRelative(-0.014f, 0.014f)
                arcToRelative(0.623f, 0.623f, 0.0f, false, true, -0.868f, -0.05f)
                lineToRelative(-2.42f, -2.662f)
                horizontalLineToRelative(-2.423f)
                curveToRelative(-0.036f, 0.544f, -0.193f, 1.356f, -0.77f, 1.99f)
                curveToRelative(-0.55f, 0.601f, -1.336f, 0.907f, -2.336f, 0.907f)
                curveToRelative(-1.003f, 0.0f, -1.79f, -0.306f, -2.34f, -0.908f)
                curveToRelative(-0.576f, -0.633f, -0.73f, -1.445f, -0.764f, -1.989f)
                horizontalLineTo(3.615f)
                arcToRelative(0.615f, 0.615f, 0.0f, false, true, -0.58f, -0.4f)
                arcToRelative(0.59f, 0.59f, 0.0f, false, true, 0.191f, -0.667f)
                curveToRelative(2.05f, -1.641f, 1.857f, -5.056f, 1.854f, -5.092f)
                lineToRelative(-0.002f, -3.835f)
                curveToRelative(0.0f, -0.356f, 0.022f, -0.695f, 0.058f, -1.023f)
                lineToRelative(0.034f, -0.263f)
                curveToRelative(0.011f, -0.084f, 0.017f, -0.17f, 0.03f, -0.255f)
                lineToRelative(0.015f, 0.017f)
                curveToRelative(0.084f, -0.54f, 0.23f, -1.07f, 0.434f, -1.577f)
                lineTo(3.204f, 3.001f)
                arcToRelative(0.593f, 0.593f, 0.0f, false, true, 0.036f, -0.838f)
                lineToRelative(0.014f, -0.014f)
                arcToRelative(0.629f, 0.629f, 0.0f, false, true, 0.868f, 0.053f)
                close()
                moveTo(20.817f, 17.72f)
                curveToRelative(0.202f, 0.16f, 0.277f, 0.429f, 0.19f, 0.67f)
                arcToRelative(0.604f, 0.604f, 0.0f, false, true, -0.126f, 0.196f)
                lineTo(7.223f, 3.558f)
                curveToRelative(1.913f, -1.591f, 4.423f, -1.538f, 4.799f, -1.518f)
                curveToRelative(0.386f, -0.02f, 3.053f, -0.081f, 4.986f, 1.678f)
                curveToRelative(1.296f, 1.179f, 1.955f, 2.888f, 1.955f, 5.078f)
                verticalLineToRelative(3.796f)
                curveToRelative(-0.003f, 0.072f, -0.188f, 3.498f, 1.854f, 5.128f)
                close()
            }
        }
        .build()
        return _bellOffFilled!!
    }

private var _bellOffFilled: ImageVector? = null
