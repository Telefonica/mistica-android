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

public val RegularGroup.CarRegular: ImageVector
    get() {
        if (_carRegular != null) {
            return _carRegular!!
        }
        _carRegular = Builder(name = "CarRegular", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.269f, 14.528f)
                horizontalLineToRelative(-2.095f)
                curveToRelative(-0.227f, -1.218f, -1.166f, -1.952f, -2.569f, -1.952f)
                reflectiveCurveToRelative(-2.344f, 0.734f, -2.569f, 1.952f)
                horizontalLineTo(9.625f)
                curveToRelative(-0.224f, -1.221f, -1.166f, -1.96f, -2.572f, -1.96f)
                curveToRelative(-1.406f, 0.0f, -2.347f, 0.739f, -2.571f, 1.96f)
                horizontalLineToRelative(-1.19f)
                curveToRelative(-0.048f, -0.367f, -0.09f, -0.941f, -0.048f, -1.658f)
                curveToRelative(-0.006f, -0.852f, 0.627f, -2.34f, 1.854f, -3.535f)
                curveToRelative(0.919f, -0.9f, 2.518f, -1.967f, 4.91f, -1.967f)
                curveToRelative(4.513f, 0.0f, 6.356f, 2.852f, 6.429f, 2.97f)
                arcToRelative(0.62f, 0.62f, 0.0f, false, false, 0.493f, 0.288f)
                curveToRelative(0.084f, 0.003f, 2.056f, 0.14f, 3.09f, 1.874f)
                curveToRelative(0.658f, 1.104f, 0.425f, 1.756f, 0.249f, 2.028f)
                moveToRelative(-4.664f, 1.944f)
                curveToRelative(-0.941f, 0.0f, -1.395f, -0.443f, -1.395f, -1.353f)
                curveToRelative(0.0f, -0.91f, 0.457f, -1.353f, 1.395f, -1.353f)
                reflectiveCurveTo(17.0f, 14.21f, 17.0f, 15.12f)
                curveToRelative(0.0f, 0.91f, -0.457f, 1.353f, -1.395f, 1.353f)
                moveToRelative(-8.552f, -0.006f)
                curveToRelative(-0.941f, 0.0f, -1.395f, -0.442f, -1.395f, -1.353f)
                curveToRelative(0.0f, -0.913f, 0.457f, -1.355f, 1.395f, -1.355f)
                curveToRelative(0.939f, 0.0f, 1.398f, 0.442f, 1.398f, 1.355f)
                curveToRelative(-0.003f, 0.91f, -0.46f, 1.353f, -1.398f, 1.353f)
                moveToRelative(14.031f, -4.56f)
                curveToRelative(-1.106f, -1.86f, -3.014f, -2.322f, -3.767f, -2.434f)
                curveToRelative(-0.614f, -0.818f, -2.84f, -3.294f, -7.306f, -3.294f)
                curveToRelative(-2.815f, 0.0f, -4.697f, 1.26f, -5.781f, 2.32f)
                curveToRelative(-1.54f, 1.5f, -2.222f, 3.282f, -2.21f, 4.344f)
                curveToRelative(-0.087f, 1.431f, 0.148f, 2.383f, 0.156f, 2.426f)
                arcToRelative(0.612f, 0.612f, 0.0f, false, false, 0.597f, 0.453f)
                horizontalLineTo(4.49f)
                curveToRelative(0.23f, 1.208f, 1.168f, 1.936f, 2.563f, 1.936f)
                curveToRelative(1.398f, 0.0f, 2.334f, -0.728f, 2.566f, -1.936f)
                horizontalLineToRelative(3.42f)
                curveToRelative(0.227f, 1.213f, 1.168f, 1.944f, 2.569f, 1.944f)
                curveToRelative(1.4f, 0.0f, 2.336f, -0.73f, 2.566f, -1.944f)
                horizontalLineToRelative(2.38f)
                curveToRelative(0.15f, 0.0f, 0.292f, -0.05f, 0.401f, -0.145f)
                curveToRelative(0.065f, -0.056f, 1.527f, -1.328f, 0.129f, -3.67f)
            }
        }
        .build()
        return _carRegular!!
    }

private var _carRegular: ImageVector? = null
