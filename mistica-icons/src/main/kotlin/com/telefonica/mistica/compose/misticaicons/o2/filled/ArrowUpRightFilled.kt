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

public val FilledGroup.ArrowUpRightFilled: ImageVector
    get() {
        if (_arrowUpRightFilled != null) {
            return _arrowUpRightFilled!!
        }
        _arrowUpRightFilled = Builder(name = "ArrowUpRightFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.624f, 2.0f)
                curveToRelative(-0.884f, 0.0f, -1.648f, 0.508f, -1.984f, 1.324f)
                curveToRelative(-0.34f, 0.816f, -0.16f, 1.716f, 0.464f, 2.344f)
                lineToRelative(2.776f, 2.78f)
                lineTo(2.0f, 16.328f)
                lineTo(7.672f, 22.0f)
                lineToRelative(7.88f, -7.88f)
                lineToRelative(2.78f, 2.78f)
                arcToRelative(2.107f, 2.107f, 0.0f, false, false, 2.344f, 0.464f)
                arcTo(2.118f, 2.118f, 0.0f, false, false, 22.0f, 15.38f)
                verticalLineTo(2.0f)
                horizontalLineTo(8.624f)
                close()
            }
        }
        .build()
        return _arrowUpRightFilled!!
    }

private var _arrowUpRightFilled: ImageVector? = null
