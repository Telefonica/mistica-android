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

public val FilledGroup.TrophyFilled: ImageVector
    get() {
        if (_trophyFilled != null) {
            return _trophyFilled!!
        }
        _trophyFilled = Builder(name = "TrophyFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.602f, 9.927f)
                curveToRelative(-0.14f, 0.003f, -0.28f, 0.0f, -0.42f, -0.005f)
                curveToRelative(0.53f, -1.451f, 0.717f, -3.289f, 0.734f, -5.412f)
                verticalLineToRelative(-0.48f)
                curveToRelative(0.93f, 0.08f, 2.512f, 0.561f, 2.512f, 2.93f)
                curveToRelative(0.0f, 2.64f, -1.977f, 2.953f, -2.826f, 2.967f)
                moveToRelative(-11.515f, 0.0f)
                curveToRelative(-0.852f, -0.011f, -2.83f, -0.325f, -2.83f, -2.966f)
                curveToRelative(0.0f, -2.104f, 1.247f, -2.72f, 2.177f, -2.888f)
                verticalLineToRelative(0.24f)
                curveToRelative(0.011f, 2.21f, 0.196f, 4.116f, 0.745f, 5.611f)
                curveToRelative(-0.03f, 0.0f, -0.061f, 0.003f, -0.092f, 0.003f)
                moveToRelative(11.832f, -7.302f)
                arcToRelative(0.628f, 0.628f, 0.0f, false, false, -0.63f, -0.625f)
                horizontalLineTo(6.061f)
                arcToRelative(0.625f, 0.625f, 0.0f, false, false, -0.628f, 0.622f)
                verticalLineToRelative(0.193f)
                curveTo(3.678f, 3.042f, 2.0f, 4.215f, 2.0f, 6.961f)
                curveToRelative(0.0f, 3.061f, 2.1f, 4.182f, 4.067f, 4.21f)
                curveToRelative(0.118f, 0.003f, 0.233f, 0.003f, 0.35f, -0.003f)
                curveToRelative(0.093f, 0.0f, 0.222f, -0.008f, 0.359f, -0.022f)
                curveToRelative(0.868f, 1.364f, 2.26f, 2.173f, 4.44f, 2.277f)
                verticalLineToRelative(3.412f)
                curveToRelative(-2.367f, 0.221f, -3.675f, 1.692f, -3.675f, 4.23f)
                curveToRelative(0.0f, 0.344f, 0.283f, 0.621f, 0.63f, 0.621f)
                horizontalLineToRelative(7.347f)
                curveToRelative(0.347f, 0.0f, 0.63f, -0.28f, 0.63f, -0.622f)
                curveToRelative(0.0f, -2.535f, -1.308f, -4.005f, -3.675f, -4.23f)
                verticalLineTo(13.41f)
                curveToRelative(2.149f, -0.177f, 3.311f, -0.83f, 4.12f, -2.297f)
                horizontalLineToRelative(0.034f)
                curveToRelative(0.216f, 0.028f, 0.521f, 0.056f, 0.639f, 0.059f)
                curveToRelative(0.07f, 0.003f, 0.146f, 0.003f, 0.227f, 0.003f)
                horizontalLineToRelative(0.129f)
                curveToRelative(1.966f, -0.028f, 4.067f, -1.152f, 4.067f, -4.21f)
                curveToRelative(0.0f, -2.92f, -1.896f, -4.062f, -3.767f, -4.177f)
                verticalLineToRelative(-0.162f)
                horizontalLineToRelative(-0.003f)
                close()
            }
        }
        .build()
        return _trophyFilled!!
    }

private var _trophyFilled: ImageVector? = null
