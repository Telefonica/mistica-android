package com.telefonica.mistica.compose.misticaicons.o2.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.o2.RegularGroup

public val RegularGroup.RobotRegular: ImageVector
    get() {
        if (_robotRegular != null) {
            return _robotRegular!!
        }
        _robotRegular = Builder(name = "RobotRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.802f, 9.103f)
                lineToRelative(-1.489f, -1.588f)
                horizontalLineToRelative(-1.628f)
                arcToRelative(1.768f, 1.768f, 0.0f, false, false, -0.278f, -0.38f)
                lineToRelative(-2.832f, -2.942f)
                curveTo(15.432f, 2.953f, 14.39f, 2.0f, 13.144f, 2.0f)
                curveToRelative(-0.89f, 0.0f, -1.672f, 0.468f, -2.093f, 1.24f)
                lineToRelative(-4.799f, 8.392f)
                arcToRelative(2.973f, 2.973f, 0.0f, false, false, -1.554f, 2.607f)
                verticalLineToRelative(3.993f)
                curveTo(3.725f, 18.391f, 3.0f, 19.23f, 3.0f, 20.275f)
                lineTo(3.0f, 22.0f)
                horizontalLineToRelative(9.158f)
                verticalLineToRelative(-1.725f)
                curveToRelative(0.0f, -1.041f, -0.72f, -1.88f, -1.698f, -2.043f)
                verticalLineToRelative(-3.9f)
                lineToRelative(3.778f, -6.702f)
                lineToRelative(1.859f, 1.888f)
                curveToRelative(0.039f, 0.04f, 0.086f, 0.088f, 0.139f, 0.128f)
                verticalLineToRelative(2.352f)
                lineToRelative(1.628f, 1.24f)
                curveToRelative(0.29f, 0.22f, 0.734f, 0.154f, 0.95f, -0.137f)
                arcToRelative(0.694f, 0.694f, 0.0f, false, false, -0.134f, -0.966f)
                lineToRelative(-1.085f, -0.83f)
                verticalLineToRelative(-1.31f)
                arcToRelative(1.655f, 1.655f, 0.0f, false, false, 1.216f, -1.103f)
                horizontalLineToRelative(0.916f)
                lineToRelative(1.124f, 1.173f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, false, 0.956f, 0.0f)
                arcToRelative(0.69f, 0.69f, 0.0f, false, false, -0.005f, -0.962f)
                close()
                moveTo(5.037f, 19.583f)
                horizontalLineToRelative(5.089f)
                curveToRelative(0.386f, 0.0f, 0.677f, 0.295f, 0.677f, 0.687f)
                verticalLineToRelative(0.345f)
                lineTo(4.36f, 20.615f)
                verticalLineToRelative(-0.345f)
                curveToRelative(0.0f, -0.392f, 0.291f, -0.688f, 0.678f, -0.688f)
                close()
                moveTo(9.11f, 14.239f)
                verticalLineToRelative(3.962f)
                lineTo(6.057f, 18.201f)
                lineTo(6.057f, 14.24f)
                curveToRelative(0.0f, -0.843f, 0.7f, -1.553f, 1.529f, -1.553f)
                reflectiveCurveToRelative(1.524f, 0.71f, 1.524f, 1.553f)
                close()
                moveTo(8.015f, 11.34f)
                lineToRelative(4.234f, -7.443f)
                curveToRelative(0.178f, -0.309f, 0.539f, -0.516f, 0.895f, -0.516f)
                curveToRelative(0.59f, 0.0f, 1.085f, 0.503f, 1.085f, 1.103f)
                curveToRelative(0.0f, 0.18f, -0.052f, 0.353f, -0.16f, 0.52f)
                lineToRelative(-4.152f, 7.528f)
                arcToRelative(2.879f, 2.879f, 0.0f, false, false, -1.902f, -1.192f)
                close()
                moveTo(15.255f, 5.812f)
                lineTo(17.451f, 8.106f)
                curveToRelative(0.07f, 0.07f, 0.105f, 0.15f, 0.105f, 0.239f)
                curveToRelative(0.0f, 0.145f, -0.144f, 0.308f, -0.34f, 0.308f)
                arcToRelative(0.322f, 0.322f, 0.0f, false, true, -0.234f, -0.105f)
                lineToRelative(-2.088f, -2.123f)
                lineToRelative(0.36f, -0.613f)
                close()
            }
        }
        .build()
        return _robotRegular!!
    }

private var _robotRegular: ImageVector? = null
