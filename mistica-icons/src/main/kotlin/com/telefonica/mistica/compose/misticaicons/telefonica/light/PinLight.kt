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

public val LightGroup.PinLight: ImageVector
    get() {
        if (_pinLight != null) {
            return _pinLight!!
        }
        _pinLight = Builder(name = "PinLight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.903f, 9.964f)
                arcToRelative(0.415f, 0.415f, 0.0f, false, false, -0.255f, 0.123f)
                lineToRelative(-2.983f, 3.0f)
                arcToRelative(0.433f, 0.433f, 0.0f, false, false, -0.112f, 0.4f)
                curveToRelative(0.417f, 1.816f, -0.2f, 3.57f, -1.886f, 5.27f)
                arcToRelative(0.199f, 0.199f, 0.0f, false, true, -0.145f, 0.061f)
                arcToRelative(0.208f, 0.208f, 0.0f, false, true, -0.146f, -0.061f)
                lineToRelative(-4.022f, -4.054f)
                curveToRelative(-0.006f, -0.008f, -0.009f, -0.016f, -0.014f, -0.025f)
                curveToRelative(-0.009f, -0.008f, -0.017f, -0.011f, -0.026f, -0.017f)
                lineToRelative(-3.955f, -3.98f)
                arcToRelative(0.196f, 0.196f, 0.0f, false, true, 0.006f, -0.28f)
                lineToRelative(0.03f, -0.03f)
                curveTo(7.06f, 8.691f, 8.81f, 8.055f, 10.598f, 8.487f)
                arcToRelative(0.424f, 0.424f, 0.0f, false, false, 0.398f, -0.112f)
                lineToRelative(2.98f, -3.003f)
                arcToRelative(0.437f, 0.437f, 0.0f, false, false, 0.124f, -0.26f)
                curveToRelative(0.07f, -0.735f, 0.428f, -1.432f, 1.098f, -2.076f)
                lineToRelative(5.798f, 5.826f)
                curveToRelative(-0.653f, 0.653f, -1.356f, 1.022f, -2.092f, 1.1f)
                moveToRelative(2.678f, -1.722f)
                lineTo(15.796f, 2.43f)
                arcToRelative(0.899f, 0.899f, 0.0f, false, false, -0.63f, -0.269f)
                curveToRelative(-0.213f, 0.0f, -0.412f, 0.081f, -0.6f, 0.269f)
                curveToRelative(-0.739f, 0.742f, -1.173f, 1.563f, -1.296f, 2.44f)
                lineToRelative(-2.715f, 2.73f)
                curveToRelative(-1.434f, -0.27f, -3.535f, -0.078f, -5.764f, 2.166f)
                lineToRelative(0.3f, 0.303f)
                lineToRelative(-0.334f, -0.272f)
                arcToRelative(1.058f, 1.058f, 0.0f, false, false, -0.003f, 1.49f)
                lineToRelative(3.67f, 3.695f)
                lineToRelative(-6.138f, 6.134f)
                arcToRelative(0.429f, 0.429f, 0.0f, false, false, -0.002f, 0.605f)
                curveToRelative(0.165f, 0.168f, 0.431f, 0.171f, 0.599f, 0.006f)
                lineToRelative(0.003f, -0.003f)
                lineToRelative(6.146f, -6.134f)
                lineToRelative(3.745f, 3.773f)
                curveToRelative(0.198f, 0.201f, 0.465f, 0.313f, 0.745f, 0.313f)
                curveToRelative(0.28f, 0.0f, 0.543f, -0.112f, 0.798f, -0.367f)
                curveToRelative(1.79f, -1.798f, 2.499f, -3.739f, 2.11f, -5.775f)
                lineToRelative(2.714f, -2.732f)
                curveToRelative(0.876f, -0.131f, 1.7f, -0.58f, 2.467f, -1.35f)
                arcToRelative(0.817f, 0.817f, 0.0f, false, false, 0.236f, -0.574f)
                arcToRelative(0.899f, 0.899f, 0.0f, false, false, -0.266f, -0.636f)
            }
        }
        .build()
        return _pinLight!!
    }

private var _pinLight: ImageVector? = null
