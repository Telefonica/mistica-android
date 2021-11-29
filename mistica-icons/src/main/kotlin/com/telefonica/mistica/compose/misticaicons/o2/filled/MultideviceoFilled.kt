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

public val FilledGroup.MultideviceoFilled: ImageVector
    get() {
        if (_multideviceoFilled != null) {
            return _multideviceoFilled!!
        }
        _multideviceoFilled = Builder(name = "MultideviceoFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.814f, 18.124f)
                lineTo(14.59f, 18.124f)
                curveToRelative(-1.854f, 0.0f, -3.333f, -1.497f, -3.333f, -3.373f)
                lineTo(11.257f, 7.999f)
                lineTo(2.0f, 7.999f)
                verticalLineToRelative(11.623f)
                horizontalLineToRelative(14.814f)
                verticalLineToRelative(-1.498f)
                close()
                moveTo(11.258f, 4.625f)
                lineTo(4.185f, 4.625f)
                curveTo(2.962f, 4.625f, 2.0f, 5.599f, 2.0f, 6.837f)
                verticalLineToRelative(0.039f)
                horizontalLineToRelative(9.258f)
                lineTo(11.258f, 4.625f)
                close()
                moveTo(2.0f, 20.788f)
                curveTo(2.0f, 21.988f, 2.962f, 23.0f, 4.185f, 23.0f)
                horizontalLineToRelative(10.482f)
                curveToRelative(1.185f, 0.0f, 2.147f, -0.974f, 2.147f, -2.212f)
                verticalLineToRelative(-0.039f)
                lineTo(2.0f, 20.788f)
                close()
                moveTo(14.59f, 17.0f)
                horizontalLineToRelative(5.187f)
                curveTo(21.0f, 17.001f, 22.0f, 15.99f, 22.0f, 14.751f)
                horizontalLineToRelative(-9.633f)
                curveToRelative(0.0f, 1.238f, 1.0f, 2.25f, 2.224f, 2.25f)
                close()
                moveTo(19.778f, 2.0f)
                lineTo(14.59f, 2.0f)
                curveToRelative(-1.223f, 0.0f, -2.224f, 1.013f, -2.224f, 2.25f)
                horizontalLineToRelative(9.628f)
                curveTo(22.0f, 3.014f, 21.0f, 2.0f, 19.777f, 2.0f)
                close()
                moveTo(12.368f, 5.378f)
                horizontalLineToRelative(9.628f)
                verticalLineToRelative(8.25f)
                horizontalLineToRelative(-9.628f)
                verticalLineToRelative(-8.25f)
                close()
            }
        }
        .build()
        return _multideviceoFilled!!
    }

private var _multideviceoFilled: ImageVector? = null
