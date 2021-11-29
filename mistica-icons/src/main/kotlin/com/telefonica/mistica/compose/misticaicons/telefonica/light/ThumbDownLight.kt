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

public val LightGroup.ThumbDownLight: ImageVector
    get() {
        if (_thumbDownLight != null) {
            return _thumbDownLight!!
        }
        _thumbDownLight = Builder(name = "ThumbDownLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.725f, 11.022f)
                curveToRelative(0.45f, 0.0f, 0.767f, -0.314f, 0.767f, -0.768f)
                curveToRelative(0.0f, -0.453f, -0.313f, -0.767f, -0.767f, -0.767f)
                curveToRelative(-0.451f, 0.0f, -0.768f, 0.316f, -0.768f, 0.767f)
                reflectiveCurveToRelative(0.314f, 0.768f, 0.768f, 0.768f)
                close()
                moveTo(20.588f, 11.24f)
                arcToRelative(0.411f, 0.411f, 0.0f, false, false, -0.023f, 0.58f)
                lineToRelative(0.023f, 0.023f)
                curveToRelative(0.285f, 0.26f, 0.437f, 0.689f, 0.437f, 1.238f)
                curveToRelative(0.0f, 1.193f, -1.09f, 1.344f, -1.426f, 1.364f)
                horizontalLineToRelative(-3.482f)
                lineToRelative(-2.74f, 0.081f)
                arcToRelative(0.407f, 0.407f, 0.0f, false, false, -0.394f, 0.409f)
                curveToRelative(0.0f, 1.445f, 0.002f, 2.89f, 0.008f, 4.339f)
                lineToRelative(0.006f, 0.123f)
                curveToRelative(0.0f, 1.135f, -0.482f, 1.63f, -1.519f, 1.63f)
                curveToRelative(-0.54f, 0.0f, -0.96f, -0.142f, -1.213f, -0.414f)
                curveToRelative(-0.238f, -0.255f, -0.341f, -0.628f, -0.305f, -1.112f)
                lineToRelative(0.017f, -0.205f)
                curveToRelative(0.011f, -0.087f, 0.017f, -0.168f, 0.022f, -0.269f)
                arcToRelative(0.309f, 0.309f, 0.0f, false, false, 0.006f, -0.05f)
                curveToRelative(0.025f, -1.174f, 0.042f, -2.68f, -0.073f, -3.91f)
                curveToRelative(-0.18f, -1.86f, -1.927f, -2.88f, -2.6f, -3.208f)
                verticalLineToRelative(-0.123f)
                curveToRelative(0.0f, -0.017f, 0.006f, -0.03f, 0.006f, -0.048f)
                verticalLineToRelative(-7.81f)
                curveToRelative(0.0f, -0.016f, -0.002f, -0.03f, -0.005f, -0.047f)
                verticalLineToRelative(-0.075f)
                lineToRelative(2.753f, -0.037f)
                curveToRelative(0.303f, 0.0f, 0.622f, -0.09f, 1.02f, -0.204f)
                lineToRelative(0.224f, -0.065f)
                curveToRelative(0.762f, -0.224f, 1.625f, -0.476f, 3.787f, -0.476f)
                curveToRelative(3.768f, 0.0f, 3.919f, 0.406f, 4.219f, 1.219f)
                curveToRelative(0.067f, 0.445f, 0.036f, 0.804f, -0.118f, 1.09f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, false, 0.168f, 0.554f)
                lineToRelative(0.034f, 0.017f)
                curveToRelative(0.487f, 0.204f, 1.067f, 0.59f, 1.067f, 1.291f)
                curveToRelative(0.0f, 0.457f, -0.107f, 0.826f, -0.314f, 1.064f)
                arcToRelative(0.405f, 0.405f, 0.0f, false, false, 0.042f, 0.575f)
                curveToRelative(0.011f, 0.01f, 0.025f, 0.02f, 0.036f, 0.028f)
                curveToRelative(0.353f, 0.24f, 0.774f, 0.666f, 0.774f, 1.313f)
                curveToRelative(0.002f, 0.471f, -0.143f, 0.846f, -0.437f, 1.115f)
                close()
                moveTo(6.095f, 3.448f)
                curveToRelative(0.23f, 0.0f, 0.414f, 0.182f, 0.425f, 0.409f)
                verticalLineToRelative(7.857f)
                arcToRelative(0.427f, 0.427f, 0.0f, false, true, -0.425f, 0.406f)
                lineTo(3.4f, 12.12f)
                arcToRelative(0.43f, 0.43f, 0.0f, false, true, -0.429f, -0.432f)
                verticalLineToRelative(-7.81f)
                curveToRelative(0.0f, -0.237f, 0.194f, -0.43f, 0.429f, -0.43f)
                horizontalLineToRelative(2.695f)
                close()
                moveTo(21.408f, 11.543f)
                curveToRelative(0.233f, -0.317f, 0.435f, -0.779f, 0.435f, -1.42f)
                curveToRelative(0.0f, -0.659f, -0.286f, -1.266f, -0.813f, -1.737f)
                curveToRelative(0.151f, -0.289f, 0.275f, -0.692f, 0.275f, -1.241f)
                curveToRelative(0.0f, -0.781f, -0.426f, -1.434f, -1.205f, -1.866f)
                curveToRelative(0.104f, -0.364f, 0.11f, -0.778f, 0.023f, -1.29f)
                curveToRelative(-0.524f, -1.438f, -1.238f, -1.833f, -5.003f, -1.833f)
                curveToRelative(-2.283f, 0.0f, -3.244f, 0.283f, -4.017f, 0.51f)
                lineToRelative(-0.21f, 0.062f)
                curveToRelative(-0.359f, 0.1f, -0.614f, 0.173f, -0.81f, 0.173f)
                lineToRelative(-2.865f, 0.04f)
                arcToRelative(0.685f, 0.685f, 0.0f, false, false, -0.25f, 0.053f)
                arcToRelative(1.234f, 1.234f, 0.0f, false, false, -0.873f, -0.362f)
                lineTo(3.4f, 2.632f)
                curveToRelative(-0.686f, 0.0f, -1.244f, 0.558f, -1.244f, 1.247f)
                verticalLineToRelative(7.81f)
                curveToRelative(0.0f, 0.686f, 0.558f, 1.246f, 1.244f, 1.246f)
                horizontalLineToRelative(2.695f)
                curveToRelative(0.336f, 0.0f, 0.638f, -0.134f, 0.862f, -0.35f)
                curveToRelative(0.521f, 0.252f, 2.026f, 1.1f, 2.166f, 2.56f)
                curveToRelative(0.112f, 1.168f, 0.098f, 2.613f, 0.072f, 3.756f)
                arcToRelative(2.907f, 2.907f, 0.0f, false, true, -0.025f, 0.311f)
                lineToRelative(-0.02f, 0.233f)
                curveToRelative(-0.05f, 0.706f, 0.132f, 1.302f, 0.524f, 1.722f)
                curveToRelative(0.41f, 0.443f, 1.037f, 0.676f, 1.807f, 0.676f)
                curveToRelative(1.482f, 0.0f, 2.334f, -0.866f, 2.334f, -2.37f)
                lineToRelative(-0.003f, -0.095f)
                lineToRelative(-0.003f, -0.135f)
                curveToRelative(0.0f, -1.406f, -0.006f, -3.143f, -0.006f, -3.913f)
                lineToRelative(2.33f, -0.07f)
                horizontalLineToRelative(3.494f)
                curveToRelative(1.036f, -0.056f, 2.218f, -0.661f, 2.218f, -2.18f)
                curveToRelative(-0.002f, -0.72f, -0.204f, -1.212f, -0.437f, -1.537f)
                close()
            }
        }
        .build()
        return _thumbDownLight!!
    }

private var _thumbDownLight: ImageVector? = null
