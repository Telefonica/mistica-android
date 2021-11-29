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

public val LightGroup.DigitalLibraryLight: ImageVector
    get() {
        if (_digitalLibraryLight != null) {
            return _digitalLibraryLight!!
        }
        _digitalLibraryLight = Builder(name = "DigitalLibraryLight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.659f, 17.744f)
                curveToRelative(-2.241f, 0.067f, -4.042f, 0.672f, -4.93f, 1.036f)
                verticalLineToRelative(-7.395f)
                curveToRelative(1.896f, -0.921f, 4.067f, -0.989f, 4.93f, -0.977f)
                verticalLineToRelative(7.336f)
                close()
                moveTo(2.98f, 10.408f)
                curveToRelative(0.857f, -0.02f, 3.033f, 0.058f, 4.93f, 0.98f)
                verticalLineToRelative(7.392f)
                arcToRelative(14.528f, 14.528f, 0.0f, false, false, -4.93f, -1.036f)
                verticalLineToRelative(-7.336f)
                close()
                moveTo(5.617f, 7.17f)
                curveToRelative(0.0f, -0.7f, 0.179f, -1.236f, 0.529f, -1.589f)
                curveToRelative(0.361f, -0.364f, 0.924f, -0.549f, 1.67f, -0.549f)
                lineToRelative(11.016f, -0.005f)
                curveToRelative(0.745f, 0.0f, 1.306f, 0.185f, 1.67f, 0.549f)
                curveToRelative(0.35f, 0.353f, 0.53f, 0.885f, 0.53f, 1.588f)
                verticalLineToRelative(5.09f)
                curveToRelative(0.0f, 0.703f, -0.18f, 1.24f, -0.53f, 1.6f)
                curveToRelative(-0.364f, 0.372f, -0.925f, 0.56f, -1.667f, 0.56f)
                lineToRelative(-4.353f, 0.002f)
                verticalLineToRelative(-4.398f)
                arcToRelative(0.406f, 0.406f, 0.0f, false, false, -0.378f, -0.4f)
                curveToRelative(-0.129f, -0.011f, -3.151f, -0.227f, -5.782f, 1.075f)
                curveToRelative(-0.899f, -0.442f, -1.84f, -0.711f, -2.7f, -0.868f)
                lineTo(5.617f, 7.17f)
                close()
                moveTo(18.829f, 15.22f)
                curveToRelative(0.972f, 0.0f, 1.734f, -0.272f, 2.258f, -0.807f)
                curveToRelative(0.504f, -0.515f, 0.76f, -1.24f, 0.76f, -2.16f)
                lineTo(21.847f, 7.165f)
                curveToRelative(0.0f, -0.919f, -0.258f, -1.641f, -0.763f, -2.151f)
                curveToRelative(-0.52f, -0.524f, -1.28f, -0.793f, -2.252f, -0.793f)
                lineToRelative(-11.017f, 0.006f)
                curveToRelative(-0.972f, 0.0f, -1.73f, 0.266f, -2.254f, 0.79f)
                curveToRelative(-0.505f, 0.51f, -0.762f, 1.232f, -0.762f, 2.15f)
                verticalLineToRelative(2.527f)
                arcToRelative(12.478f, 12.478f, 0.0f, false, false, -2.26f, -0.078f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, false, -0.379f, 0.406f)
                verticalLineToRelative(8.12f)
                curveToRelative(0.0f, 0.225f, 0.182f, 0.401f, 0.409f, 0.401f)
                curveToRelative(3.148f, 0.0f, 5.535f, 1.207f, 5.557f, 1.219f)
                curveToRelative(0.06f, 0.03f, 0.124f, 0.044f, 0.19f, 0.044f)
                curveToRelative(0.01f, 0.0f, 0.018f, -0.005f, 0.026f, -0.005f)
                arcToRelative(0.491f, 0.491f, 0.0f, false, false, 0.165f, -0.04f)
                curveToRelative(0.023f, -0.01f, 2.41f, -1.218f, 5.56f, -1.218f)
                curveToRelative(0.227f, 0.0f, 0.41f, -0.18f, 0.41f, -0.403f)
                verticalLineToRelative(-1.27f)
                horizontalLineToRelative(6.938f)
                curveToRelative(0.227f, 0.0f, 0.409f, -0.178f, 0.409f, -0.403f)
                arcToRelative(0.408f, 0.408f, 0.0f, false, false, -0.41f, -0.403f)
                horizontalLineToRelative(-6.937f)
                verticalLineToRelative(-0.843f)
                horizontalLineToRelative(4.352f)
                close()
            }
        }
        .build()
        return _digitalLibraryLight!!
    }

private var _digitalLibraryLight: ImageVector? = null
