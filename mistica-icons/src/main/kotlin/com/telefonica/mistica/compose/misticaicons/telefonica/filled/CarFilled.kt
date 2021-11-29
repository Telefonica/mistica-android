package com.telefonica.mistica.compose.misticaicons.telefonica.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.telefonica.FilledGroup

public val FilledGroup.CarFilled: ImageVector
    get() {
        if (_carFilled != null) {
            return _carFilled!!
        }
        _carFilled = Builder(name = "CarFilled", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.605f, 16.472f)
                curveToRelative(-0.938f, 0.0f, -1.398f, -0.443f, -1.398f, -1.353f)
                curveToRelative(0.0f, -0.91f, 0.457f, -1.353f, 1.398f, -1.353f)
                curveToRelative(0.938f, 0.0f, 1.395f, 0.443f, 1.395f, 1.353f)
                curveToRelative(0.0f, 0.91f, -0.457f, 1.353f, -1.395f, 1.353f)
                moveToRelative(-8.552f, -0.006f)
                curveToRelative(-0.938f, 0.0f, -1.398f, -0.442f, -1.398f, -1.353f)
                curveToRelative(0.0f, -0.91f, 0.457f, -1.355f, 1.398f, -1.355f)
                curveToRelative(0.941f, 0.0f, 1.398f, 0.442f, 1.398f, 1.355f)
                curveToRelative(0.0f, 0.91f, -0.457f, 1.353f, -1.398f, 1.353f)
                moveToRelative(14.031f, -4.56f)
                curveToRelative(-1.106f, -1.86f, -3.011f, -2.32f, -3.768f, -2.434f)
                curveToRelative(-0.613f, -0.818f, -2.84f, -3.294f, -7.305f, -3.294f)
                curveToRelative(-2.815f, 0.0f, -4.697f, 1.26f, -5.781f, 2.32f)
                curveToRelative(-1.538f, 1.5f, -2.219f, 3.282f, -2.21f, 4.344f)
                curveToRelative(-0.087f, 1.431f, 0.148f, 2.383f, 0.156f, 2.425f)
                arcToRelative(0.611f, 0.611f, 0.0f, false, false, 0.597f, 0.454f)
                horizontalLineTo(4.49f)
                curveToRelative(0.23f, 1.208f, 1.168f, 1.939f, 2.566f, 1.939f)
                reflectiveCurveToRelative(2.333f, -0.729f, 2.566f, -1.939f)
                horizontalLineToRelative(3.42f)
                curveToRelative(0.23f, 1.213f, 1.168f, 1.944f, 2.566f, 1.944f)
                curveToRelative(1.4f, 0.0f, 2.336f, -0.73f, 2.566f, -1.944f)
                horizontalLineToRelative(2.383f)
                arcToRelative(0.623f, 0.623f, 0.0f, false, false, 0.4f, -0.145f)
                curveToRelative(0.063f, -0.056f, 1.525f, -1.328f, 0.127f, -3.67f)
            }
        }
        .build()
        return _carFilled!!
    }

private var _carFilled: ImageVector? = null
