package com.telefonica.mistica.compose.misticaicons.o2.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.o2.FilledGroup

public val FilledGroup.ArrowUpDownFilled: ImageVector
    get() {
        if (_arrowUpDownFilled != null) {
            return _arrowUpDownFilled!!
        }
        _arrowUpDownFilled = Builder(name = "ArrowUpDownFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.957f, 9.712f)
                lineToRelative(5.88f, 6.036f)
                lineToRelative(1.18f, -1.18f)
                curveToRelative(0.315f, -0.324f, 0.764f, -0.396f, 1.18f, -0.216f)
                curveToRelative(0.417f, 0.18f, 0.663f, 0.536f, 0.663f, 1.0f)
                verticalLineTo(22.0f)
                horizontalLineToRelative(-6.608f)
                curveToRelative(-0.417f, 0.0f, -0.803f, -0.252f, -0.974f, -0.68f)
                arcToRelative(1.165f, 1.165f, 0.0f, false, true, 0.21f, -1.212f)
                lineToRelative(1.391f, -1.36f)
                lineToRelative(-5.879f, -6.0f)
                lineToRelative(2.957f, -3.036f)
                close()
                moveTo(12.607f, 2.0f)
                curveToRelative(0.418f, 0.0f, 0.803f, 0.252f, 0.975f, 0.68f)
                curveToRelative(0.171f, 0.428f, 0.07f, 0.896f, -0.21f, 1.212f)
                lineTo(12.12f, 5.144f)
                lineTo(18.0f, 11.18f)
                lineToRelative(-2.957f, 2.996f)
                lineToRelative(-5.88f, -6.036f)
                lineToRelative(-1.285f, 1.288f)
                curveToRelative(-0.316f, 0.324f, -0.764f, 0.396f, -1.18f, 0.216f)
                arcToRelative(1.045f, 1.045f, 0.0f, false, true, -0.663f, -1.0f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(6.573f)
                close()
            }
        }
        .build()
        return _arrowUpDownFilled!!
    }

private var _arrowUpDownFilled: ImageVector? = null
