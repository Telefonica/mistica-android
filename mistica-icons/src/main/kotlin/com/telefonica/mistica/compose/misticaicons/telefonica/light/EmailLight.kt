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

public val LightGroup.EmailLight: ImageVector
    get() {
        if (_emailLight != null) {
            return _emailLight!!
        }
        _emailLight = Builder(name = "EmailLight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.834f, 17.817f)
                curveToRelative(-0.168f, 0.199f, -0.462f, 0.305f, -0.874f, 0.31f)
                curveToRelative(-1.543f, 0.026f, -16.092f, 0.0f, -16.246f, 0.0f)
                arcToRelative(0.755f, 0.755f, 0.0f, false, true, -0.451f, -0.198f)
                curveToRelative(-0.188f, -0.185f, -0.283f, -0.488f, -0.283f, -0.902f)
                verticalLineTo(7.682f)
                lineToRelative(7.3f, 4.63f)
                curveToRelative(0.041f, 0.029f, 0.68f, 0.488f, 1.568f, 0.488f)
                curveToRelative(0.448f, 0.0f, 0.964f, -0.118f, 1.493f, -0.468f)
                lineToRelative(7.678f, -4.664f)
                lineToRelative(-0.009f, 9.426f)
                curveToRelative(0.0f, 0.003f, 0.068f, 0.434f, -0.176f, 0.723f)
                moveTo(3.719f, 5.837f)
                lineToRelative(16.586f, 0.002f)
                curveToRelative(0.103f, 0.003f, 0.593f, 0.065f, 0.691f, 0.883f)
                lineToRelative(-8.095f, 4.918f)
                curveToRelative(-1.11f, 0.726f, -2.098f, 0.04f, -2.16f, -0.003f)
                lineTo(2.986f, 6.716f)
                curveToRelative(0.02f, -0.219f, 0.081f, -0.521f, 0.255f, -0.703f)
                curveToRelative(0.115f, -0.118f, 0.272f, -0.177f, 0.48f, -0.177f)
                moveToRelative(18.106f, 11.19f)
                lineTo(21.84f, 6.93f)
                curveToRelative(-0.042f, -1.538f, -1.012f, -1.888f, -1.535f, -1.908f)
                lineTo(3.719f, 5.016f)
                curveToRelative(-0.434f, 0.0f, -0.81f, 0.15f, -1.078f, 0.437f)
                curveToRelative(-0.524f, 0.554f, -0.488f, 1.411f, -0.482f, 1.484f)
                verticalLineToRelative(10.087f)
                curveToRelative(0.0f, 0.644f, 0.18f, 1.146f, 0.53f, 1.487f)
                curveToRelative(0.277f, 0.27f, 0.646f, 0.426f, 1.033f, 0.435f)
                curveToRelative(0.098f, 0.0f, 6.555f, 0.01f, 11.333f, 0.01f)
                curveToRelative(2.415f, 0.0f, 4.398f, -0.002f, 4.919f, -0.01f)
                curveToRelative(0.667f, -0.012f, 1.17f, -0.219f, 1.496f, -0.614f)
                curveToRelative(0.473f, -0.571f, 0.364f, -1.297f, 0.356f, -1.305f)
            }
        }
        .build()
        return _emailLight!!
    }

private var _emailLight: ImageVector? = null
