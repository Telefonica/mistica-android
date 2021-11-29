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

public val LightGroup.OutgoingCallLight: ImageVector
    get() {
        if (_outgoingCallLight != null) {
            return _outgoingCallLight!!
        }
        _outgoingCallLight = Builder(name = "OutgoingCallLight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.96f, 19.9f)
                curveToRelative(0.72f, -0.754f, 1.076f, -1.505f, 1.065f, -2.236f)
                curveToRelative(-0.014f, -0.703f, -0.372f, -1.412f, -1.064f, -2.103f)
                arcToRelative(4.327f, 4.327f, 0.0f, false, false, -0.874f, -0.69f)
                curveToRelative(-0.588f, -0.364f, -1.18f, -0.495f, -1.773f, -0.397f)
                curveToRelative(-0.603f, 0.1f, -1.205f, 0.45f, -1.787f, 1.033f)
                curveToRelative(-0.14f, 0.138f, -0.272f, 0.286f, -0.395f, 0.443f)
                arcToRelative(0.403f, 0.403f, 0.0f, false, true, -0.118f, 0.1f)
                curveToRelative(-0.339f, 0.194f, -0.871f, 0.029f, -1.636f, -0.495f)
                curveToRelative(-0.871f, -0.597f, -1.888f, -1.583f, -2.574f, -2.272f)
                lineToRelative(-0.081f, -0.078f)
                curveToRelative(-0.692f, -0.692f, -1.678f, -1.712f, -2.272f, -2.577f)
                curveToRelative(-0.521f, -0.765f, -0.683f, -1.3f, -0.493f, -1.636f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, true, 0.104f, -0.123f)
                arcToRelative(4.29f, 4.29f, 0.0f, false, false, 0.44f, -0.392f)
                curveToRelative(0.582f, -0.583f, 0.93f, -1.185f, 1.033f, -1.788f)
                curveToRelative(0.1f, -0.59f, -0.03f, -1.182f, -0.392f, -1.759f)
                arcToRelative(4.358f, 4.358f, 0.0f, false, false, -0.698f, -0.885f)
                curveToRelative(-0.692f, -0.692f, -1.4f, -1.05f, -2.103f, -1.064f)
                lineTo(6.3f, 2.981f)
                curveToRelative(-0.717f, 0.0f, -1.454f, 0.358f, -2.19f, 1.064f)
                arcToRelative(5.2f, 5.2f, 0.0f, false, false, -0.617f, 0.74f)
                curveToRelative(-0.709f, 1.022f, -0.675f, 2.6f, 0.073f, 4.473f)
                curveToRelative(0.815f, 2.04f, 2.406f, 4.283f, 4.602f, 6.482f)
                lineToRelative(0.014f, 0.014f)
                lineToRelative(0.07f, 0.07f)
                curveToRelative(2.207f, 2.207f, 4.451f, 3.804f, 6.496f, 4.616f)
                curveToRelative(1.857f, 0.742f, 3.454f, 0.779f, 4.44f, 0.098f)
                curveToRelative(0.16f, -0.115f, 0.526f, -0.38f, 0.773f, -0.638f)
                close()
                moveTo(20.54f, 14.978f)
                curveToRelative(0.85f, 0.849f, 1.29f, 1.748f, 1.306f, 2.67f)
                curveToRelative(0.017f, 0.955f, -0.415f, 1.901f, -1.291f, 2.817f)
                curveToRelative(-0.3f, 0.314f, -0.698f, 0.603f, -0.846f, 0.709f)
                curveToRelative(-0.026f, 0.02f, -0.05f, 0.036f, -0.076f, 0.053f)
                curveToRelative(-0.585f, 0.406f, -1.342f, 0.62f, -2.227f, 0.62f)
                curveToRelative(-0.893f, 0.0f, -1.888f, -0.216f, -2.96f, -0.645f)
                curveToRelative(-2.15f, -0.854f, -4.49f, -2.515f, -6.768f, -4.795f)
                lineToRelative(-0.065f, -0.065f)
                lineToRelative(-0.016f, -0.017f)
                curveToRelative(-2.28f, -2.28f, -3.939f, -4.622f, -4.796f, -6.767f)
                curveToRelative(-0.851f, -2.137f, -0.854f, -3.986f, -0.011f, -5.21f)
                curveToRelative(0.132f, -0.18f, 0.428f, -0.591f, 0.75f, -0.9f)
                curveToRelative(0.914f, -0.873f, 1.852f, -1.29f, 2.816f, -1.288f)
                curveToRelative(0.921f, 0.017f, 1.82f, 0.457f, 2.67f, 1.305f)
                curveToRelative(0.335f, 0.34f, 0.613f, 0.69f, 0.817f, 1.042f)
                curveToRelative(0.462f, 0.745f, 0.63f, 1.53f, 0.496f, 2.322f)
                curveToRelative(-0.132f, 0.776f, -0.557f, 1.527f, -1.26f, 2.233f)
                curveToRelative(-0.115f, 0.118f, -0.236f, 0.23f, -0.362f, 0.333f)
                curveToRelative(0.03f, 0.118f, 0.129f, 0.356f, 0.409f, 0.768f)
                curveToRelative(0.555f, 0.81f, 1.507f, 1.793f, 2.174f, 2.46f)
                lineToRelative(0.08f, 0.08f)
                curveToRelative(0.668f, 0.664f, 1.645f, 1.617f, 2.46f, 2.177f)
                curveToRelative(0.41f, 0.28f, 0.65f, 0.375f, 0.768f, 0.409f)
                curveToRelative(0.11f, -0.129f, 0.202f, -0.23f, 0.336f, -0.361f)
                curveToRelative(0.706f, -0.706f, 1.457f, -1.13f, 2.23f, -1.261f)
                curveToRelative(0.795f, -0.134f, 1.577f, 0.036f, 2.33f, 0.504f)
                curveToRelative(0.348f, 0.196f, 0.7f, 0.47f, 1.037f, 0.807f)
                close()
                moveTo(13.978f, 8.409f)
                curveToRelative(-0.107f, 0.082f, -0.157f, 0.166f, -0.168f, 0.264f)
                arcToRelative(0.36f, 0.36f, 0.0f, false, false, 0.084f, 0.283f)
                lineToRelative(0.946f, 1.053f)
                curveToRelative(0.087f, 0.112f, 0.18f, 0.162f, 0.28f, 0.17f)
                arcToRelative(0.332f, 0.332f, 0.0f, false, false, 0.26f, -0.089f)
                lineToRelative(2.542f, -2.185f)
                arcToRelative(0.407f, 0.407f, 0.0f, false, true, 0.571f, 0.037f)
                lineToRelative(0.557f, 0.616f)
                curveToRelative(0.031f, 0.036f, 0.104f, 0.092f, 0.18f, 0.073f)
                curveToRelative(0.084f, -0.026f, 0.112f, -0.115f, 0.12f, -0.152f)
                lineToRelative(0.807f, -3.776f)
                arcToRelative(0.22f, 0.22f, 0.0f, false, false, -0.045f, -0.201f)
                arcToRelative(0.229f, 0.229f, 0.0f, false, false, -0.174f, -0.073f)
                horizontalLineToRelative(-0.02f)
                lineToRelative(-3.831f, 0.291f)
                curveToRelative(-0.048f, 0.003f, -0.135f, 0.023f, -0.165f, 0.098f)
                curveToRelative(-0.031f, 0.079f, 0.02f, 0.152f, 0.05f, 0.185f)
                lineToRelative(0.549f, 0.61f)
                arcToRelative(0.412f, 0.412f, 0.0f, false, true, -0.034f, 0.583f)
                curveToRelative(0.003f, 0.003f, -2.51f, 2.213f, -2.51f, 2.213f)
                close()
                moveTo(14.21f, 10.529f)
                lineTo(13.286f, 9.505f)
                arcToRelative(1.178f, 1.178f, 0.0f, false, true, 0.179f, -1.737f)
                lineToRelative(2.17f, -1.91f)
                lineToRelative(-0.274f, -0.303f)
                arcToRelative(1.003f, 1.003f, 0.0f, false, true, -0.204f, -1.04f)
                arcToRelative(0.995f, 0.995f, 0.0f, false, true, 0.863f, -0.61f)
                lineToRelative(3.829f, -0.297f)
                lineToRelative(0.087f, -0.003f)
                arcToRelative(1.038f, 1.038f, 0.0f, false, true, 1.022f, 1.272f)
                lineToRelative(-0.807f, 3.776f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.711f, 0.773f)
                arcToRelative(1.01f, 1.01f, 0.0f, false, true, -1.003f, -0.314f)
                lineToRelative(-0.283f, -0.322f)
                lineToRelative(-2.218f, 1.908f)
                arcToRelative(1.122f, 1.122f, 0.0f, false, true, -0.883f, 0.3f)
                arcToRelative(1.175f, 1.175f, 0.0f, false, true, -0.843f, -0.468f)
                close()
            }
        }
        .build()
        return _outgoingCallLight!!
    }

private var _outgoingCallLight: ImageVector? = null
