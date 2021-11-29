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

public val RegularGroup.ArrowRightRegular: ImageVector
    get() {
        if (_arrowRightRegular != null) {
            return _arrowRightRegular!!
        }
        _arrowRightRegular = Builder(name = "ArrowRightRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.966f, 22.0f)
                curveToRelative(0.536f, 0.0f, 1.036f, -0.224f, 1.428f, -0.593f)
                lineTo(22.0f, 11.997f)
                lineToRelative(-8.606f, -9.378f)
                curveToRelative(-0.608f, -0.631f, -1.464f, -0.78f, -2.252f, -0.444f)
                curveToRelative(-0.856f, 0.336f, -1.284f, 1.149f, -1.284f, 2.037f)
                verticalLineToRelative(3.892f)
                horizontalLineTo(2.716f)
                curveToRelative(-0.396f, 0.0f, -0.716f, 0.336f, -0.716f, 0.743f)
                curveToRelative(0.0f, 0.406f, 0.324f, 0.742f, 0.716f, 0.742f)
                horizontalLineToRelative(8.574f)
                verticalLineTo(4.212f)
                curveToRelative(0.0f, -0.37f, 0.18f, -0.593f, 0.396f, -0.668f)
                arcToRelative(0.553f, 0.553f, 0.0f, false, true, 0.68f, 0.112f)
                lineToRelative(7.678f, 8.336f)
                lineToRelative(-7.686f, 8.377f)
                curveToRelative(-0.252f, 0.262f, -0.572f, 0.15f, -0.68f, 0.112f)
                curveToRelative(-0.216f, -0.112f, -0.396f, -0.336f, -0.396f, -0.705f)
                verticalLineToRelative(-5.373f)
                horizontalLineTo(2.716f)
                curveToRelative(-0.396f, 0.0f, -0.716f, 0.336f, -0.716f, 0.742f)
                curveToRelative(0.0f, 0.407f, 0.324f, 0.743f, 0.716f, 0.743f)
                horizontalLineToRelative(7.146f)
                verticalLineToRelative(3.892f)
                curveToRelative(0.0f, 0.888f, 0.428f, 1.705f, 1.284f, 2.037f)
                curveToRelative(0.248f, 0.108f, 0.532f, 0.183f, 0.82f, 0.183f)
                close()
            }
        }
        .build()
        return _arrowRightRegular!!
    }

private var _arrowRightRegular: ImageVector? = null
