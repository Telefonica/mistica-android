package com.telefonica.mistica.compose.misticaicons.telefonica.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.telefonica.FilledGroup

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
                moveTo(18.406f, 18.007f)
                lineTo(5.603f, 18.0f)
                curveToRelative(-1.12f, 0.0f, -1.99f, -0.311f, -2.58f, -0.927f)
                curveToRelative(-0.574f, -0.591f, -0.863f, -1.437f, -0.863f, -2.513f)
                lineTo(2.16f, 8.282f)
                curveTo(2.16f, 6.08f, 3.381f, 4.87f, 5.6f, 4.87f)
                lineToRelative(12.806f, 0.008f)
                curveToRelative(2.219f, 0.0f, 3.44f, 1.213f, 3.44f, 3.412f)
                verticalLineToRelative(6.277f)
                curveToRelative(0.0f, 1.076f, -0.288f, 1.922f, -0.86f, 2.513f)
                curveToRelative(-0.594f, 0.616f, -1.462f, 0.927f, -2.58f, 0.927f)
                close()
                moveTo(21.286f, 20.22f)
                lineTo(2.72f, 20.212f)
                arcToRelative(0.562f, 0.562f, 0.0f, false, true, -0.56f, -0.56f)
                curveToRelative(0.0f, -0.309f, 0.252f, -0.56f, 0.56f, -0.56f)
                lineToRelative(18.566f, 0.008f)
                curveToRelative(0.308f, 0.0f, 0.56f, 0.252f, 0.56f, 0.56f)
                curveToRelative(0.0f, 0.308f, -0.252f, 0.56f, -0.56f, 0.56f)
                close()
            }
        }
        .build()
        return _computerFilled!!
    }

private var _computerFilled: ImageVector? = null
