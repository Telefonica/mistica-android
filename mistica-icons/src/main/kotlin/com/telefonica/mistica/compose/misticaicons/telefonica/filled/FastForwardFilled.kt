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

public val FilledGroup.FastForwardFilled: ImageVector
    get() {
        if (_fastForwardFilled != null) {
            return _fastForwardFilled!!
        }
        _fastForwardFilled = Builder(name = "FastForwardFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.846f, 2.0f)
                curveTo(5.403f, 2.0f, 2.0f, 5.403f, 2.0f, 11.846f)
                curveToRelative(0.0f, 6.437f, 3.403f, 9.84f, 9.846f, 9.84f)
                curveToRelative(6.437f, 0.0f, 9.84f, -3.403f, 9.84f, -9.84f)
                curveToRelative(0.0f, -6.443f, -3.403f, -9.846f, -9.84f, -9.846f)
                close()
                moveTo(7.504f, 13.44f)
                lineToRelative(3.168f, -1.885f)
                lineTo(7.504f, 9.65f)
                verticalLineToRelative(3.79f)
                close()
                moveTo(16.597f, 11.549f)
                lineTo(13.429f, 9.644f)
                verticalLineToRelative(3.79f)
                lineToRelative(3.168f, -1.885f)
                close()
                moveTo(6.599f, 8.053f)
                arcToRelative(0.603f, 0.603f, 0.0f, false, true, 0.611f, 0.009f)
                lineToRelative(4.952f, 2.974f)
                curveToRelative(0.026f, 0.014f, 0.034f, 0.04f, 0.056f, 0.056f)
                lineTo(12.218f, 8.574f)
                arcToRelative(0.603f, 0.603f, 0.0f, false, true, 0.916f, -0.518f)
                lineToRelative(4.953f, 2.978f)
                arcToRelative(0.604f, 0.604f, 0.0f, false, true, 0.0f, 1.036f)
                lineToRelative(-4.953f, 2.947f)
                arcToRelative(0.61f, 0.61f, 0.0f, false, true, -0.61f, 0.005f)
                arcToRelative(0.604f, 0.604f, 0.0f, false, true, -0.306f, -0.526f)
                verticalLineToRelative(-2.482f)
                curveToRelative(-0.022f, 0.017f, -0.033f, 0.045f, -0.058f, 0.059f)
                lineToRelative(-4.953f, 2.952f)
                arcToRelative(0.61f, 0.61f, 0.0f, false, true, -0.61f, 0.006f)
                arcToRelative(0.61f, 0.61f, 0.0f, false, true, -0.306f, -0.527f)
                lineTo(6.291f, 8.58f)
                arcToRelative(0.618f, 0.618f, 0.0f, false, true, 0.308f, -0.527f)
                close()
            }
        }
        .build()
        return _fastForwardFilled!!
    }

private var _fastForwardFilled: ImageVector? = null
