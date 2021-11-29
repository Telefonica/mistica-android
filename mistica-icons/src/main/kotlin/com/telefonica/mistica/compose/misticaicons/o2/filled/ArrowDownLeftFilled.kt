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

public val FilledGroup.ArrowDownLeftFilled: ImageVector
    get() {
        if (_arrowDownLeftFilled != null) {
            return _arrowDownLeftFilled!!
        }
        _arrowDownLeftFilled = Builder(name = "ArrowDownLeftFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.144f, 15.572f)
                lineTo(22.0f, 7.708f)
                lineTo(16.284f, 2.0f)
                lineTo(8.428f, 9.856f)
                curveToRelative(-0.916f, -0.916f, -2.86f, -2.852f, -2.86f, -2.852f)
                curveToRelative(-0.624f, -0.632f, -1.464f, -0.672f, -2.284f, -0.332f)
                curveTo(2.492f, 6.996f, 2.0f, 7.74f, 2.0f, 8.608f)
                verticalLineTo(22.0f)
                horizontalLineToRelative(13.336f)
                curveToRelative(0.86f, 0.0f, 1.596f, -0.504f, 1.928f, -1.304f)
                curveToRelative(0.348f, -0.836f, 0.188f, -1.812f, -0.444f, -2.444f)
                lineToRelative(-2.676f, -2.68f)
                close()
            }
        }
        .build()
        return _arrowDownLeftFilled!!
    }

private var _arrowDownLeftFilled: ImageVector? = null
