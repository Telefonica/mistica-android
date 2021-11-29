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

public val LightGroup.StormLight: ImageVector
    get() {
        if (_stormLight != null) {
            return _stormLight!!
        }
        _stormLight = Builder(name = "StormLight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.667f, 15.46f)
                lineToRelative(-1.053f, 0.005f)
                lineToRelative(0.367f, -0.386f)
                arcToRelative(0.417f, 0.417f, 0.0f, false, false, -0.205f, -0.692f)
                lineToRelative(-3.127f, -0.707f)
                lineToRelative(1.81f, -4.721f)
                arcToRelative(0.418f, 0.418f, 0.0f, false, false, -0.165f, -0.504f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, false, -0.521f, 0.07f)
                lineToRelative(-6.067f, 6.598f)
                arcToRelative(0.417f, 0.417f, 0.0f, false, false, -0.092f, 0.39f)
                lineToRelative(-1.236f, 0.006f)
                curveToRelative(-1.022f, 0.0f, -3.404f, -0.334f, -3.404f, -3.427f)
                curveToRelative(0.0f, -1.738f, 0.742f, -2.833f, 2.208f, -3.254f)
                curveToRelative(0.176f, -0.05f, 0.3f, -0.215f, 0.3f, -0.4f)
                lineToRelative(-0.006f, -0.115f)
                curveToRelative(0.0f, -4.954f, 4.273f, -5.34f, 5.582f, -5.34f)
                curveToRelative(0.742f, 0.0f, 4.486f, 0.17f, 5.377f, 3.535f)
                curveToRelative(0.047f, 0.18f, 0.204f, 0.303f, 0.387f, 0.309f)
                curveToRelative(1.26f, 0.036f, 4.2f, 0.526f, 4.2f, 4.304f)
                curveToRelative(-0.003f, 4.018f, -3.332f, 4.329f, -4.355f, 4.329f)
                close()
                moveTo(11.707f, 16.306f)
                arcToRelative(0.423f, 0.423f, 0.0f, false, false, -0.022f, -0.345f)
                arcToRelative(0.407f, 0.407f, 0.0f, false, false, -0.271f, -0.207f)
                lineToRelative(-2.618f, -0.594f)
                lineToRelative(4.12f, -4.483f)
                lineToRelative(-1.208f, 3.152f)
                arcToRelative(0.412f, 0.412f, 0.0f, false, false, 0.02f, 0.345f)
                arcToRelative(0.411f, 0.411f, 0.0f, false, false, 0.271f, 0.21f)
                lineToRelative(2.878f, 0.65f)
                lineToRelative(-4.433f, 4.651f)
                lineToRelative(1.264f, -3.379f)
                close()
                moveTo(17.144f, 6.011f)
                curveToRelative(-1.177f, -3.673f, -5.262f, -3.861f, -6.086f, -3.861f)
                curveToRelative(-1.06f, 0.0f, -6.294f, 0.291f, -6.406f, 5.985f)
                curveToRelative(-1.05f, 0.387f, -2.502f, 1.387f, -2.502f, 3.954f)
                curveToRelative(0.0f, 3.141f, 2.186f, 4.259f, 4.228f, 4.259f)
                lineToRelative(3.76f, -0.017f)
                curveToRelative(0.015f, 0.0f, 0.026f, -0.005f, 0.037f, -0.008f)
                lineToRelative(0.594f, 0.134f)
                lineToRelative(-1.793f, 4.82f)
                arcToRelative(0.417f, 0.417f, 0.0f, false, false, 0.384f, 0.563f)
                arcToRelative(0.42f, 0.42f, 0.0f, false, false, 0.297f, -0.126f)
                lineToRelative(5.158f, -5.414f)
                lineToRelative(1.852f, -0.01f)
                curveToRelative(0.863f, 0.0f, 5.173f, -0.25f, 5.173f, -5.162f)
                curveToRelative(0.003f, -4.287f, -3.278f, -5.007f, -4.696f, -5.117f)
                close()
            }
        }
        .build()
        return _stormLight!!
    }

private var _stormLight: ImageVector? = null
