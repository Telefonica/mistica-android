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

public val FilledGroup.BellFilled: ImageVector
    get() {
        if (_bellFilled != null) {
            return _bellFilled!!
        }
        _bellFilled = Builder(name = "BellFilled", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.042f, 20.642f)
                curveTo(9.387f, 21.979f, 10.58f, 23.0f, 12.005f, 23.0f)
                reflectiveCurveToRelative(2.614f, -1.02f, 2.963f, -2.358f)
                lineTo(9.042f, 20.642f)
                close()
                moveTo(21.845f, 18.208f)
                arcToRelative(11.276f, 11.276f, 0.0f, false, true, -2.154f, -6.6f)
                verticalLineToRelative(-2.75f)
                curveToRelative(0.0f, -4.32f, -3.462f, -7.858f, -7.69f, -7.858f)
                curveTo(7.772f, 1.0f, 4.31f, 4.538f, 4.31f, 8.858f)
                verticalLineToRelative(2.75f)
                curveToRelative(0.0f, 2.359f, -0.77f, 4.713f, -2.153f, 6.6f)
                curveToRelative(-0.194f, 0.238f, -0.194f, 0.55f, -0.078f, 0.828f)
                curveToRelative(0.117f, 0.277f, 0.384f, 0.43f, 0.694f, 0.43f)
                horizontalLineToRelative(18.456f)
                curveToRelative(0.305f, 0.0f, 0.577f, -0.158f, 0.693f, -0.43f)
                curveToRelative(0.116f, -0.273f, 0.112f, -0.594f, -0.077f, -0.828f)
                close()
            }
        }
        .build()
        return _bellFilled!!
    }

private var _bellFilled: ImageVector? = null
