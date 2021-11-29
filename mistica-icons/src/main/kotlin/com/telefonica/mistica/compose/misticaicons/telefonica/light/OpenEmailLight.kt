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

public val LightGroup.OpenEmailLight: ImageVector
    get() {
        if (_openEmailLight != null) {
            return _openEmailLight!!
        }
        _openEmailLight = Builder(name = "OpenEmailLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.835f, 20.285f)
                curveToRelative(-0.168f, 0.202f, -0.465f, 0.308f, -0.88f, 0.317f)
                curveToRelative(-0.815f, 0.014f, -5.061f, 0.014f, -7.526f, 0.01f)
                horizontalLineToRelative(-0.04f)
                curveToRelative(-3.669f, 0.004f, -7.674f, 0.0f, -8.344f, -0.01f)
                curveToRelative(-0.414f, -0.009f, -0.709f, -0.112f, -0.877f, -0.314f)
                curveToRelative(-0.243f, -0.291f, -0.179f, -0.723f, -0.173f, -0.793f)
                lineToRelative(-0.009f, -8.95f)
                lineToRelative(7.32f, 4.62f)
                curveToRelative(0.028f, 0.02f, 0.666f, 0.479f, 1.565f, 0.479f)
                curveToRelative(0.53f, 0.0f, 1.04f, -0.157f, 1.507f, -0.462f)
                lineToRelative(7.636f, -4.765f)
                lineToRelative(-0.002f, 9.148f)
                curveToRelative(0.0f, 0.006f, 0.061f, 0.432f, -0.177f, 0.72f)
                moveTo(3.34f, 8.485f)
                lineTo(10.908f, 3.7f)
                curveToRelative(0.33f, -0.205f, 0.711f, -0.317f, 1.098f, -0.32f)
                curveToRelative(0.622f, 0.0f, 1.081f, 0.314f, 1.104f, 0.328f)
                lineToRelative(7.535f, 4.765f)
                curveToRelative(0.232f, 0.165f, 0.358f, 0.504f, 0.37f, 0.97f)
                verticalLineToRelative(0.021f)
                curveToRelative(-0.015f, 0.006f, -0.031f, 0.009f, -0.045f, 0.017f)
                lineToRelative(-8.037f, 5.011f)
                arcToRelative(1.913f, 1.913f, 0.0f, false, true, -1.062f, 0.334f)
                curveToRelative(-0.619f, 0.0f, -1.075f, -0.32f, -1.103f, -0.336f)
                lineTo(2.984f, 9.58f)
                verticalLineToRelative(-0.13f)
                curveToRelative(0.01f, -0.473f, 0.14f, -0.812f, 0.355f, -0.966f)
                moveToRelative(18.488f, 11.014f)
                lineToRelative(0.008f, -10.064f)
                curveToRelative(-0.022f, -0.936f, -0.4f, -1.4f, -0.731f, -1.636f)
                lineToRelative(-7.535f, -4.765f)
                arcToRelative(2.92f, 2.92f, 0.0f, false, false, -1.577f, -0.47f)
                curveToRelative(-0.894f, 0.0f, -1.535f, 0.45f, -1.543f, 0.456f)
                lineToRelative(-7.44f, 4.703f)
                lineToRelative(-0.132f, 0.084f)
                curveToRelative(-0.314f, 0.224f, -0.692f, 0.686f, -0.714f, 1.633f)
                lineToRelative(0.014f, 9.989f)
                curveToRelative(-0.014f, 0.081f, -0.123f, 0.807f, 0.353f, 1.378f)
                curveToRelative(0.327f, 0.395f, 0.832f, 0.6f, 1.501f, 0.61f)
                curveToRelative(0.532f, 0.01f, 2.992f, 0.012f, 5.614f, 0.012f)
                horizontalLineToRelative(2.745f)
                verticalLineToRelative(-0.409f)
                lineToRelative(0.042f, 0.409f)
                curveToRelative(2.462f, 0.003f, 6.717f, 0.003f, 7.538f, -0.011f)
                curveToRelative(0.666f, -0.011f, 1.17f, -0.219f, 1.498f, -0.61f)
                curveToRelative(0.476f, -0.572f, 0.367f, -1.298f, 0.359f, -1.309f)
            }
        }
        .build()
        return _openEmailLight!!
    }

private var _openEmailLight: ImageVector? = null
