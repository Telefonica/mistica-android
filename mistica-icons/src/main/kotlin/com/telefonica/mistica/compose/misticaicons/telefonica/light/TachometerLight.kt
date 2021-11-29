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
                moveTo(20.736f, 18.184f)
                curveToRelative(0.285f, -1.004f, 0.43f, -2.151f, 0.43f, -3.414f)
                curveToRelative(0.0f, -5.942f, -3.085f, -8.954f, -9.166f, -8.954f)
                reflectiveCurveTo(2.837f, 8.828f, 2.837f, 14.77f)
                curveToRelative(0.0f, 1.263f, 0.145f, 2.41f, 0.427f, 3.414f)
                horizontalLineToRelative(17.472f)
                close()
                moveTo(11.997f, 5.0f)
                curveTo(18.54f, 5.0f, 22.0f, 8.378f, 22.0f, 14.77f)
                curveToRelative(0.0f, 1.449f, -0.182f, 2.762f, -0.538f, 3.898f)
                arcToRelative(0.365f, 0.365f, 0.0f, false, true, -0.023f, 0.06f)
                lineToRelative(-0.022f, 0.044f)
                arcToRelative(0.419f, 0.419f, 0.0f, false, true, -0.376f, 0.228f)
                lineTo(2.951f, 19.0f)
                arcToRelative(0.418f, 0.418f, 0.0f, false, true, -0.399f, -0.287f)
                curveTo(2.185f, 17.566f, 2.0f, 16.238f, 2.0f, 14.77f)
                curveTo(2.0f, 8.38f, 5.458f, 5.0f, 11.997f, 5.0f)
                close()
                moveTo(12.0f, 16.702f)
                arcToRelative(0.867f, 0.867f, 0.0f, false, false, 0.848f, -0.689f)
                lineToRelative(-0.691f, 0.197f)
                arcToRelative(0.42f, 0.42f, 0.0f, false, true, -0.518f, -0.275f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, true, 0.281f, -0.507f)
                horizontalLineToRelative(0.003f)
                lineToRelative(0.703f, -0.202f)
                arcToRelative(0.876f, 0.876f, 0.0f, false, false, -0.626f, -0.253f)
                arcToRelative(0.875f, 0.875f, 0.0f, false, false, -0.885f, 0.863f)
                curveToRelative(0.0f, 0.478f, 0.396f, 0.866f, 0.885f, 0.866f)
                close()
                moveTo(12.0f, 14.16f)
                curveToRelative(0.603f, 0.0f, 1.164f, 0.315f, 1.474f, 0.83f)
                lineToRelative(6.118f, -1.755f)
                curveToRelative(0.22f, -0.065f, 0.45f, 0.056f, 0.516f, 0.272f)
                verticalLineToRelative(0.003f)
                arcToRelative(0.403f, 0.403f, 0.0f, false, true, -0.28f, 0.504f)
                horizontalLineToRelative(-0.005f)
                lineToRelative(-6.116f, 1.752f)
                curveToRelative(0.0f, 0.022f, 0.009f, 0.045f, 0.009f, 0.07f)
                curveToRelative(0.0f, 0.925f, -0.771f, 1.68f, -1.719f, 1.68f)
                curveToRelative(-0.947f, 0.0f, -1.716f, -0.752f, -1.716f, -1.677f)
                reflectiveCurveToRelative(0.771f, -1.68f, 1.719f, -1.68f)
                close()
                moveTo(11.986f, 8.38f)
                arcToRelative(0.414f, 0.414f, 0.0f, false, true, -0.419f, -0.407f)
                verticalLineToRelative(-0.827f)
                curveToRelative(0.0f, -0.225f, 0.188f, -0.408f, 0.416f, -0.408f)
                curveToRelative(0.23f, 0.0f, 0.418f, 0.183f, 0.418f, 0.408f)
                verticalLineToRelative(0.827f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, true, -0.415f, 0.407f)
                close()
                moveTo(6.704f, 8.906f)
                lineTo(7.304f, 9.491f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, true, 0.006f, 0.571f)
                lineToRelative(-0.006f, 0.006f)
                arcToRelative(0.426f, 0.426f, 0.0f, false, true, -0.589f, 0.0f)
                lineToRelative(-0.6f, -0.585f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, true, -0.006f, -0.571f)
                lineToRelative(0.006f, -0.006f)
                arcToRelative(0.426f, 0.426f, 0.0f, false, true, 0.589f, 0.0f)
                close()
                moveTo(4.9f, 13.693f)
                curveToRelative(0.23f, 0.0f, 0.415f, 0.183f, 0.415f, 0.408f)
                arcToRelative(0.413f, 0.413f, 0.0f, false, true, -0.415f, 0.408f)
                horizontalLineToRelative(-0.848f)
                arcToRelative(0.413f, 0.413f, 0.0f, false, true, -0.416f, -0.408f)
                curveToRelative(0.0f, -0.225f, 0.188f, -0.408f, 0.416f, -0.408f)
                lineTo(4.9f, 13.693f)
                close()
                moveTo(17.034f, 10.225f)
                arcToRelative(0.428f, 0.428f, 0.0f, false, true, -0.296f, -0.118f)
                arcToRelative(0.401f, 0.401f, 0.0f, false, true, -0.003f, -0.573f)
                lineToRelative(0.003f, -0.003f)
                lineToRelative(0.6f, -0.585f)
                arcToRelative(0.42f, 0.42f, 0.0f, false, true, 0.59f, 0.0f)
                curveToRelative(0.162f, 0.154f, 0.165f, 0.41f, 0.005f, 0.57f)
                lineToRelative(-0.005f, 0.006f)
                lineToRelative(-0.598f, 0.585f)
                arcToRelative(0.446f, 0.446f, 0.0f, false, true, -0.296f, 0.118f)
                close()
            }
        }
        .build()
        return _tachometerLight!!
    }

private var _tachometerLight: ImageVector? = null
