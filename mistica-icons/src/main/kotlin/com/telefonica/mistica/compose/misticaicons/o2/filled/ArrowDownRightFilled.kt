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

public val FilledGroup.ArrowDownRightFilled: ImageVector
    get() {
        if (_arrowDownRightFilled != null) {
            return _arrowDownRightFilled!!
        }
        _arrowDownRightFilled = Builder(name = "ArrowDownRightFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.712f, 6.672f)
                curveToRelative(-0.808f, -0.332f, -1.652f, -0.3f, -2.284f, 0.332f)
                lineToRelative(-2.86f, 2.86f)
                lineTo(7.708f, 2.0f)
                lineTo(2.0f, 7.708f)
                reflectiveCurveToRelative(6.144f, 6.072f, 7.856f, 7.864f)
                lineToRelative(-2.672f, 2.68f)
                curveToRelative(-0.632f, 0.632f, -0.792f, 1.612f, -0.444f, 2.444f)
                curveToRelative(0.332f, 0.8f, 1.068f, 1.304f, 1.928f, 1.304f)
                horizontalLineTo(22.0f)
                verticalLineTo(8.608f)
                curveToRelative(0.0f, -0.868f, -0.492f, -1.612f, -1.288f, -1.936f)
                close()
            }
        }
        .build()
        return _arrowDownRightFilled!!
    }

private var _arrowDownRightFilled: ImageVector? = null
