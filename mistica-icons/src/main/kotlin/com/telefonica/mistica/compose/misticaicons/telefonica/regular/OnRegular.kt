package com.telefonica.mistica.compose.misticaicons.telefonica.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.telefonica.RegularGroup

public val RegularGroup.OnRegular: ImageVector
    get() {
        if (_onRegular != null) {
            return _onRegular!!
        }
        _onRegular = Builder(name = "OnRegular", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.415f, 20.639f)
                curveToRelative(1.93f, -0.036f, 8.227f, -0.762f, 8.227f, -8.608f)
                reflectiveCurveToRelative(-6.328f, -8.608f, -8.266f, -8.653f)
                arcToRelative(17.205f, 17.205f, 0.0f, false, false, -0.855f, -0.008f)
                curveToRelative(-1.913f, 0.017f, -8.154f, 0.69f, -8.154f, 8.608f)
                curveToRelative(0.0f, 7.933f, 6.294f, 8.639f, 8.224f, 8.667f)
                curveToRelative(0.275f, 0.002f, 0.577f, 0.0f, 0.824f, -0.006f)
                close()
                moveTo(12.404f, 2.171f)
                curveToRelative(1.574f, 0.037f, 9.442f, 0.69f, 9.442f, 9.857f)
                curveToRelative(0.0f, 9.174f, -7.837f, 9.785f, -9.409f, 9.813f)
                arcToRelative(33.17f, 33.17f, 0.0f, false, true, -0.552f, 0.005f)
                curveToRelative(-0.106f, 0.0f, -0.21f, 0.0f, -0.313f, -0.003f)
                curveToRelative(-1.572f, -0.022f, -9.412f, -0.605f, -9.412f, -9.87f)
                curveToRelative(0.0f, -1.625f, 0.451f, -9.735f, 9.347f, -9.813f)
                curveToRelative(0.297f, 0.0f, 0.625f, 0.006f, 0.897f, 0.011f)
                close()
                moveTo(8.605f, 15.028f)
                curveToRelative(0.816f, 0.0f, 1.65f, -0.322f, 1.65f, -2.72f)
                curveToRelative(0.0f, -2.425f, -0.882f, -2.736f, -1.65f, -2.736f)
                curveToRelative(-0.82f, 0.0f, -1.658f, 0.325f, -1.658f, 2.736f)
                curveToRelative(0.0f, 2.398f, 0.838f, 2.72f, 1.658f, 2.72f)
                close()
                moveTo(8.605f, 8.479f)
                curveToRelative(1.258f, 0.0f, 2.762f, 0.664f, 2.762f, 3.83f)
                curveToRelative(0.0f, 3.156f, -1.501f, 3.82f, -2.762f, 3.82f)
                curveToRelative(-1.263f, 0.0f, -2.77f, -0.66f, -2.77f, -3.82f)
                curveToRelative(0.0f, -3.166f, 1.507f, -3.83f, 2.77f, -3.83f)
                close()
                moveTo(16.947f, 8.605f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, true, 0.4f, 0.4f)
                verticalLineToRelative(6.586f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, true, -0.4f, 0.4f)
                horizontalLineToRelative(-0.221f)
                arcToRelative(0.406f, 0.406f, 0.0f, false, true, -0.336f, -0.178f)
                lineToRelative(-3.233f, -4.894f)
                verticalLineToRelative(4.672f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, true, -0.4f, 0.4f)
                horizontalLineToRelative(-0.27f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, true, -0.4f, -0.4f)
                lineTo(12.087f, 9.006f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, true, 0.4f, -0.4f)
                horizontalLineToRelative(0.214f)
                curveToRelative(0.134f, 0.0f, 0.26f, 0.067f, 0.336f, 0.179f)
                lineToRelative(3.24f, 4.896f)
                lineTo(16.277f, 9.006f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, true, 0.401f, -0.4f)
                horizontalLineToRelative(0.27f)
                close()
            }
        }
        .build()
        return _onRegular!!
    }

private var _onRegular: ImageVector? = null
