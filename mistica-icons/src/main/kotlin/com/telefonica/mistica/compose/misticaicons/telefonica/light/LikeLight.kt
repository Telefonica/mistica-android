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

public val LightGroup.LikeLight: ImageVector
    get() {
        if (_likeLight != null) {
            return _likeLight!!
        }
        _likeLight = Builder(name = "LikeLight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.729f, 12.98f)
                curveToRelative(0.45f, 0.0f, 0.767f, 0.314f, 0.767f, 0.768f)
                reflectiveCurveToRelative(-0.314f, 0.768f, -0.767f, 0.768f)
                curveToRelative(-0.451f, 0.0f, -0.768f, -0.317f, -0.768f, -0.768f)
                curveToRelative(0.0f, -0.45f, 0.314f, -0.767f, 0.768f, -0.767f)
                close()
                moveTo(20.591f, 12.762f)
                arcToRelative(0.411f, 0.411f, 0.0f, false, true, -0.022f, -0.58f)
                lineToRelative(0.022f, -0.022f)
                curveToRelative(0.286f, -0.26f, 0.437f, -0.69f, 0.437f, -1.238f)
                curveToRelative(0.0f, -1.193f, -1.09f, -1.345f, -1.425f, -1.364f)
                lineTo(16.12f, 9.558f)
                lineToRelative(-2.74f, -0.081f)
                arcToRelative(0.407f, 0.407f, 0.0f, false, true, -0.395f, -0.41f)
                reflectiveCurveToRelative(0.009f, -2.453f, 0.009f, -4.316f)
                verticalLineToRelative(-0.022f)
                lineTo(13.0f, 4.605f)
                curveToRelative(0.0f, -1.134f, -0.481f, -1.63f, -1.518f, -1.63f)
                curveToRelative(-0.54f, 0.0f, -0.96f, 0.143f, -1.213f, 0.415f)
                curveToRelative(-0.238f, 0.255f, -0.341f, 0.627f, -0.305f, 1.112f)
                lineToRelative(0.017f, 0.204f)
                curveToRelative(0.01f, 0.087f, 0.017f, 0.168f, 0.022f, 0.27f)
                curveToRelative(0.003f, 0.016f, 0.003f, 0.033f, 0.006f, 0.05f)
                curveToRelative(0.025f, 1.173f, 0.042f, 2.68f, -0.073f, 3.91f)
                curveToRelative(-0.18f, 1.86f, -1.927f, 2.88f, -2.6f, 3.207f)
                verticalLineToRelative(0.123f)
                curveToRelative(0.0f, 0.017f, 0.006f, 0.031f, 0.006f, 0.048f)
                verticalLineToRelative(7.81f)
                curveToRelative(0.0f, 0.016f, -0.003f, 0.03f, -0.006f, 0.047f)
                verticalLineToRelative(0.076f)
                lineToRelative(2.754f, 0.036f)
                curveToRelative(0.302f, 0.0f, 0.622f, 0.09f, 1.02f, 0.205f)
                lineToRelative(0.224f, 0.064f)
                curveToRelative(0.762f, 0.224f, 1.624f, 0.476f, 3.787f, 0.476f)
                curveToRelative(3.767f, 0.0f, 3.919f, -0.406f, 4.218f, -1.218f)
                curveToRelative(0.067f, -0.446f, 0.037f, -0.804f, -0.117f, -1.09f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, true, 0.168f, -0.554f)
                lineToRelative(0.033f, -0.017f)
                curveToRelative(0.488f, -0.205f, 1.068f, -0.591f, 1.068f, -1.292f)
                curveToRelative(0.0f, -0.456f, -0.107f, -0.826f, -0.314f, -1.064f)
                arcToRelative(0.405f, 0.405f, 0.0f, false, true, 0.042f, -0.574f)
                curveToRelative(0.011f, -0.011f, 0.025f, -0.02f, 0.036f, -0.028f)
                curveToRelative(0.353f, -0.241f, 0.773f, -0.667f, 0.773f, -1.314f)
                curveToRelative(0.003f, -0.47f, -0.143f, -0.846f, -0.437f, -1.115f)
                close()
                moveTo(6.098f, 20.555f)
                curveToRelative(0.227f, 0.0f, 0.415f, -0.18f, 0.426f, -0.409f)
                verticalLineToRelative(-7.854f)
                arcToRelative(0.427f, 0.427f, 0.0f, false, false, -0.426f, -0.407f)
                lineTo(3.404f, 11.885f)
                arcToRelative(0.43f, 0.43f, 0.0f, false, false, -0.429f, 0.432f)
                verticalLineToRelative(7.81f)
                curveToRelative(0.0f, 0.237f, 0.193f, 0.43f, 0.429f, 0.43f)
                lineToRelative(2.694f, -0.002f)
                close()
                moveTo(21.412f, 12.46f)
                curveToRelative(0.233f, 0.316f, 0.434f, 0.778f, 0.434f, 1.42f)
                curveToRelative(0.0f, 0.658f, -0.285f, 1.266f, -0.812f, 1.737f)
                curveToRelative(0.151f, 0.288f, 0.274f, 0.691f, 0.274f, 1.24f)
                curveToRelative(0.0f, 0.782f, -0.425f, 1.435f, -1.204f, 1.866f)
                curveToRelative(0.104f, 0.364f, 0.11f, 0.779f, 0.022f, 1.291f)
                curveToRelative(-0.523f, 1.432f, -1.238f, 1.827f, -5.002f, 1.827f)
                curveToRelative(-2.283f, 0.0f, -3.244f, -0.283f, -4.017f, -0.51f)
                lineToRelative(-0.21f, -0.062f)
                curveToRelative(-0.359f, -0.1f, -0.614f, -0.173f, -0.81f, -0.173f)
                lineToRelative(-2.865f, -0.037f)
                arcToRelative(0.685f, 0.685f, 0.0f, false, true, -0.25f, -0.053f)
                arcToRelative(1.234f, 1.234f, 0.0f, false, true, -0.874f, 0.361f)
                lineTo(3.404f, 21.367f)
                curveToRelative(-0.687f, 0.0f, -1.244f, -0.56f, -1.244f, -1.246f)
                verticalLineToRelative(-7.807f)
                curveToRelative(0.0f, -0.686f, 0.557f, -1.246f, 1.244f, -1.246f)
                horizontalLineToRelative(2.694f)
                curveToRelative(0.337f, 0.0f, 0.639f, 0.134f, 0.863f, 0.35f)
                curveToRelative(0.521f, -0.252f, 2.025f, -1.101f, 2.165f, -2.56f)
                curveToRelative(0.112f, -1.169f, 0.098f, -2.614f, 0.073f, -3.757f)
                arcToRelative(2.907f, 2.907f, 0.0f, false, false, -0.025f, -0.31f)
                lineToRelative(-0.02f, -0.233f)
                curveToRelative(-0.05f, -0.706f, 0.132f, -1.303f, 0.524f, -1.723f)
                curveToRelative(0.412f, -0.443f, 1.037f, -0.675f, 1.81f, -0.675f)
                curveToRelative(1.482f, 0.0f, 2.333f, 0.866f, 2.333f, 2.37f)
                lineToRelative(-0.003f, 0.095f)
                lineToRelative(-0.005f, 0.134f)
                curveToRelative(0.0f, 1.407f, -0.006f, 3.143f, -0.006f, 3.914f)
                lineToRelative(2.33f, 0.07f)
                horizontalLineToRelative(3.494f)
                curveToRelative(1.036f, 0.056f, 2.218f, 0.66f, 2.218f, 2.179f)
                curveToRelative(-0.003f, 0.72f, -0.204f, 1.213f, -0.437f, 1.538f)
                close()
            }
        }
        .build()
        return _likeLight!!
    }

private var _likeLight: ImageVector? = null
