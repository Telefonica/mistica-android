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

public val RegularGroup.TrendDownRegular: ImageVector
    get() {
        if (_trendDownRegular != null) {
            return _trendDownRegular!!
        }
        _trendDownRegular = Builder(name = "TrendDownRegular", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.842f, 14.778f)
                lineToRelative(-0.429f, 3.482f)
                arcToRelative(0.787f, 0.787f, 0.0f, false, true, -0.787f, 0.687f)
                horizontalLineToRelative(-3.49f)
                arcToRelative(0.787f, 0.787f, 0.0f, false, true, -0.793f, -0.78f)
                arcToRelative(0.79f, 0.79f, 0.0f, false, true, 0.793f, -0.778f)
                horizontalLineToRelative(1.882f)
                lineToRelative(-4.986f, -6.95f)
                lineToRelative(-6.793f, 2.928f)
                arcToRelative(0.818f, 0.818f, 0.0f, false, true, -1.016f, -0.334f)
                lineTo(2.262f, 6.168f)
                arcToRelative(0.777f, 0.777f, 0.0f, false, true, 0.294f, -1.062f)
                lineToRelative(0.008f, -0.005f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, true, 1.079f, 0.294f)
                lineToRelative(3.61f, 6.255f)
                lineToRelative(6.732f, -2.894f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, true, 0.969f, 0.263f)
                lineToRelative(5.117f, 7.146f)
                lineToRelative(0.19f, -1.574f)
                arcToRelative(0.804f, 0.804f, 0.0f, false, true, 0.889f, -0.686f)
                curveToRelative(0.428f, 0.047f, 0.74f, 0.437f, 0.692f, 0.865f)
                verticalLineToRelative(0.008f)
            }
        }
        .build()
        return _trendDownRegular!!
    }

private var _trendDownRegular: ImageVector? = null
