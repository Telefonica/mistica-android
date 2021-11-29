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

public val RegularGroup.TrendUpRegular: ImageVector
    get() {
        if (_trendUpRegular != null) {
            return _trendUpRegular!!
        }
        _trendUpRegular = Builder(name = "TrendUpRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.846f, 5.6f)
                verticalLineToRelative(3.576f)
                curveToRelative(0.0f, 0.328f, -0.28f, 0.6f, -0.622f, 0.6f)
                arcToRelative(0.612f, 0.612f, 0.0f, false, true, -0.622f, -0.6f)
                verticalLineTo(7.353f)
                lineToRelative(-5.47f, 7.54f)
                arcToRelative(0.62f, 0.62f, 0.0f, false, true, -0.754f, 0.208f)
                lineTo(7.18f, 12.039f)
                lineToRelative(-3.86f, 6.602f)
                arcToRelative(0.613f, 0.613f, 0.0f, false, true, -0.537f, 0.303f)
                arcToRelative(0.701f, 0.701f, 0.0f, false, true, -0.308f, -0.073f)
                arcToRelative(0.592f, 0.592f, 0.0f, false, true, -0.244f, -0.801f)
                curveToRelative(0.005f, -0.008f, 0.008f, -0.017f, 0.014f, -0.022f)
                lineToRelative(4.132f, -7.065f)
                arcToRelative(0.625f, 0.625f, 0.0f, false, true, 0.787f, -0.255f)
                lineToRelative(7.246f, 3.079f)
                lineToRelative(5.524f, -7.603f)
                horizontalLineTo(17.58f)
                arcToRelative(0.612f, 0.612f, 0.0f, false, true, -0.622f, -0.599f)
                verticalLineToRelative(-0.003f)
                curveToRelative(0.0f, -0.336f, 0.275f, -0.602f, 0.622f, -0.602f)
                horizontalLineToRelative(3.644f)
                arcToRelative(0.61f, 0.61f, 0.0f, false, true, 0.622f, 0.6f)
            }
        }
        .build()
        return _trendUpRegular!!
    }

private var _trendUpRegular: ImageVector? = null
