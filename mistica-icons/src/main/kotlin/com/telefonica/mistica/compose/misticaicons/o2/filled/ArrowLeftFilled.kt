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

public val FilledGroup.ArrowLeftFilled: ImageVector
    get() {
        if (_arrowLeftFilled != null) {
            return _arrowLeftFilled!!
        }
        _arrowLeftFilled = Builder(name = "ArrowLeftFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.996f, 16.177f)
                horizontalLineTo(14.14f)
                verticalLineToRelative(3.682f)
                curveToRelative(0.0f, 0.841f, -0.428f, 1.612f, -1.287f, 1.965f)
                curveToRelative(-0.286f, 0.106f, -0.573f, 0.176f, -0.823f, 0.176f)
                curveToRelative(-0.536f, 0.0f, -1.073f, -0.21f, -1.464f, -0.562f)
                lineTo(2.0f, 12.494f)
                lineToRelative(8.57f, -8.907f)
                curveToRelative(0.61f, -0.6f, 1.5f, -0.739f, 2.287f, -0.423f)
                curveToRelative(0.823f, 0.349f, 1.287f, 1.124f, 1.287f, 1.964f)
                verticalLineToRelative(3.683f)
                horizontalLineTo(22.0f)
                verticalLineToRelative(7.366f)
                horizontalLineToRelative(-0.004f)
                close()
            }
        }
        .build()
        return _arrowLeftFilled!!
    }

private var _arrowLeftFilled: ImageVector? = null
