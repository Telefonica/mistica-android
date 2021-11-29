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

public val RegularGroup.TrophyRegular: ImageVector
    get() {
        if (_trophyRegular != null) {
            return _trophyRegular!!
        }
        _trophyRegular = Builder(name = "TrophyRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.6f, 9.927f)
                arcToRelative(5.675f, 5.675f, 0.0f, false, true, -0.418f, -0.008f)
                curveToRelative(0.53f, -1.451f, 0.717f, -3.289f, 0.737f, -5.412f)
                verticalLineToRelative(-0.479f)
                curveToRelative(0.93f, 0.078f, 2.51f, 0.56f, 2.51f, 2.93f)
                curveToRelative(0.0f, 2.641f, -1.978f, 2.955f, -2.83f, 2.97f)
                moveToRelative(-0.94f, -5.432f)
                curveToRelative(-0.054f, 5.652f, -1.27f, 7.624f, -4.785f, 7.697f)
                curveToRelative(-0.011f, -0.003f, -0.16f, 0.006f, -0.199f, 0.006f)
                curveToRelative(-3.7f, 0.0f, -4.958f, -1.992f, -4.986f, -7.888f)
                verticalLineTo(3.244f)
                horizontalLineToRelative(9.97f)
                curveToRelative(0.002f, 0.515f, 0.002f, 1.173f, 0.0f, 1.252f)
                moveToRelative(-1.805f, 15.947f)
                horizontalLineTo(8.83f)
                curveToRelative(0.185f, -1.64f, 1.157f, -2.41f, 3.011f, -2.41f)
                curveToRelative(1.857f, 0.0f, 2.83f, 0.77f, 3.014f, 2.41f)
                moveTo(6.087f, 9.927f)
                curveToRelative(-0.852f, -0.011f, -2.83f, -0.325f, -2.83f, -2.966f)
                curveToRelative(0.0f, -2.104f, 1.247f, -2.72f, 2.177f, -2.888f)
                verticalLineToRelative(0.24f)
                curveToRelative(0.011f, 2.21f, 0.196f, 4.116f, 0.745f, 5.611f)
                curveToRelative(-0.03f, 0.0f, -0.061f, 0.003f, -0.092f, 0.003f)
                moveToRelative(11.832f, -7.143f)
                verticalLineToRelative(-0.16f)
                arcToRelative(0.625f, 0.625f, 0.0f, false, false, -0.628f, -0.621f)
                horizontalLineTo(6.061f)
                arcToRelative(0.625f, 0.625f, 0.0f, false, false, -0.627f, 0.622f)
                verticalLineToRelative(0.193f)
                curveTo(3.678f, 3.045f, 2.0f, 4.216f, 2.0f, 6.96f)
                curveToRelative(0.0f, 3.061f, 2.1f, 4.182f, 4.067f, 4.21f)
                horizontalLineToRelative(0.13f)
                curveToRelative(0.078f, 0.0f, 0.153f, 0.0f, 0.218f, -0.003f)
                curveToRelative(0.092f, 0.0f, 0.22f, -0.008f, 0.358f, -0.022f)
                curveToRelative(0.868f, 1.364f, 2.26f, 2.173f, 4.44f, 2.277f)
                verticalLineToRelative(3.412f)
                curveToRelative(-2.367f, 0.221f, -3.675f, 1.692f, -3.675f, 4.23f)
                curveToRelative(0.0f, 0.344f, 0.283f, 0.621f, 0.63f, 0.621f)
                horizontalLineToRelative(7.347f)
                curveToRelative(0.348f, 0.0f, 0.628f, -0.28f, 0.628f, -0.622f)
                curveToRelative(0.0f, -2.537f, -1.308f, -4.005f, -3.675f, -4.23f)
                verticalLineTo(13.41f)
                curveToRelative(2.03f, -0.168f, 3.325f, -0.975f, 4.145f, -2.305f)
                lineToRelative(0.135f, 0.025f)
                arcToRelative(4.94f, 4.94f, 0.0f, false, false, 0.74f, 0.042f)
                horizontalLineToRelative(0.128f)
                curveToRelative(1.967f, -0.028f, 4.067f, -1.151f, 4.067f, -4.21f)
                curveToRelative(0.003f, -2.919f, -1.893f, -4.062f, -3.764f, -4.177f)
            }
        }
        .build()
        return _trophyRegular!!
    }

private var _trophyRegular: ImageVector? = null
