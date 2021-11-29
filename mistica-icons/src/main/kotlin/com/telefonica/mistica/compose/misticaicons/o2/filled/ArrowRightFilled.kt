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

public val FilledGroup.ArrowRightFilled: ImageVector
    get() {
        if (_arrowRightFilled != null) {
            return _arrowRightFilled!!
        }
        _arrowRightFilled = Builder(name = "ArrowRightFilled", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 15.871f)
                horizontalLineToRelative(7.858f)
                verticalLineToRelative(3.875f)
                curveToRelative(0.0f, 0.885f, 0.428f, 1.696f, 1.284f, 2.068f)
                curveToRelative(0.284f, 0.112f, 0.572f, 0.186f, 0.824f, 0.186f)
                curveToRelative(0.536f, 0.0f, 1.072f, -0.223f, 1.464f, -0.591f)
                lineTo(22.0f, 11.996f)
                lineToRelative(-8.574f, -9.38f)
                curveToRelative(-0.608f, -0.628f, -1.5f, -0.777f, -2.284f, -0.442f)
                curveToRelative(-0.856f, 0.368f, -1.284f, 1.183f, -1.284f, 2.068f)
                verticalLineToRelative(3.875f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(7.754f)
                close()
            }
        }
        .build()
        return _arrowRightFilled!!
    }

private var _arrowRightFilled: ImageVector? = null
