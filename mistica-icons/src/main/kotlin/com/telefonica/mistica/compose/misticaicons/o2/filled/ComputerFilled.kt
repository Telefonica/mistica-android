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

public val FilledGroup.ComputerFilled: ImageVector
    get() {
        if (_computerFilled != null) {
            return _computerFilled!!
        }
        _computerFilled = Builder(name = "ComputerFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 15.471f)
                verticalLineToRelative(0.36f)
                curveTo(2.0f, 17.026f, 2.964f, 18.0f, 4.144f, 18.0f)
                horizontalLineToRelative(15.712f)
                curveToRelative(1.18f, 0.0f, 2.144f, -0.975f, 2.144f, -2.168f)
                verticalLineToRelative(-0.36f)
                lineTo(2.0f, 15.472f)
                close()
                moveTo(20.213f, 6.442f)
                curveToRelative(0.0f, -0.795f, -0.644f, -1.442f, -1.426f, -1.442f)
                lineTo(5.217f, 5.0f)
                arcToRelative(1.44f, 1.44f, 0.0f, false, false, -1.425f, 1.442f)
                verticalLineToRelative(7.947f)
                horizontalLineToRelative(16.426f)
                lineTo(20.218f, 6.442f)
                horizontalLineToRelative(-0.005f)
                close()
            }
        }
        .build()
        return _computerFilled!!
    }

private var _computerFilled: ImageVector? = null
