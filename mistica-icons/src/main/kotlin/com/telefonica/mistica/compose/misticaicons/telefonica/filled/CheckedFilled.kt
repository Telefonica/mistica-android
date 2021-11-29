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

public val FilledGroup.CheckedFilled: ImageVector
    get() {
        if (_checkedFilled != null) {
            return _checkedFilled!!
        }
        _checkedFilled = Builder(name = "CheckedFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.078f, 3.71f)
                curveTo(18.21f, 1.913f, 15.492f, 1.0f, 11.997f, 1.0f)
                curveToRelative(-3.495f, 0.0f, -6.213f, 0.912f, -8.079f, 2.714f)
                curveTo(1.981f, 5.582f, 1.0f, 8.371f, 1.0f, 12.004f)
                curveToRelative(0.0f, 3.631f, 0.981f, 6.417f, 2.918f, 8.285f)
                curveTo(5.784f, 22.088f, 8.502f, 23.0f, 11.997f, 23.0f)
                curveToRelative(3.495f, 0.0f, 6.213f, -0.912f, 8.081f, -2.71f)
                curveTo(22.016f, 18.42f, 23.0f, 15.634f, 23.0f, 12.002f)
                curveToRelative(0.0f, -3.632f, -0.981f, -6.424f, -2.922f, -8.292f)
                close()
                moveTo(17.317f, 7.982f)
                lineTo(10.859f, 16.619f)
                arcToRelative(0.572f, 0.572f, 0.0f, false, true, -0.451f, 0.232f)
                horizontalLineToRelative(-0.01f)
                arcToRelative(0.575f, 0.575f, 0.0f, false, true, -0.451f, -0.216f)
                lineToRelative(-2.953f, -3.714f)
                arcToRelative(0.577f, 0.577f, 0.0f, false, true, 0.9f, -0.717f)
                lineToRelative(2.488f, 3.127f)
                lineToRelative(6.01f, -8.041f)
                arcToRelative(0.576f, 0.576f, 0.0f, false, true, 0.805f, -0.116f)
                arcToRelative(0.58f, 0.58f, 0.0f, false, true, 0.12f, 0.808f)
                close()
            }
        }
        .build()
        return _checkedFilled!!
    }

private var _checkedFilled: ImageVector? = null
