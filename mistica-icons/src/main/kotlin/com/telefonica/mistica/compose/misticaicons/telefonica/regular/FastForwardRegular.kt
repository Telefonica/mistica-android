package com.telefonica.mistica.compose.misticaicons.telefonica.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.telefonica.RegularGroup

public val RegularGroup.FastForwardRegular: ImageVector
    get() {
        if (_fastForwardRegular != null) {
            return _fastForwardRegular!!
        }
        _fastForwardRegular = Builder(name = "FastForwardRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.846f, 20.476f)
                curveToRelative(-5.731f, 0.0f, -8.636f, -2.905f, -8.636f, -8.63f)
                curveToRelative(0.0f, -5.731f, 2.905f, -8.636f, 8.636f, -8.636f)
                curveToRelative(5.728f, 0.0f, 8.63f, 2.905f, 8.63f, 8.636f)
                curveToRelative(0.0f, 5.725f, -2.905f, 8.63f, -8.63f, 8.63f)
                close()
                moveTo(11.846f, 2.0f)
                curveTo(5.406f, 2.0f, 2.0f, 5.403f, 2.0f, 11.846f)
                curveToRelative(0.0f, 6.437f, 3.403f, 9.84f, 9.846f, 9.84f)
                curveToRelative(6.437f, 0.0f, 9.84f, -3.403f, 9.84f, -9.84f)
                curveToRelative(0.0f, -6.443f, -3.403f, -9.846f, -9.84f, -9.846f)
                close()
                moveTo(7.504f, 13.44f)
                lineTo(7.504f, 9.65f)
                lineToRelative(3.171f, 1.905f)
                curveToRelative(-0.003f, 0.0f, -3.17f, 1.885f, -3.17f, 1.885f)
                close()
                moveTo(16.597f, 11.549f)
                lineTo(13.426f, 13.434f)
                verticalLineToRelative(-3.79f)
                lineToRelative(3.17f, 1.905f)
                close()
                moveTo(6.599f, 8.053f)
                arcToRelative(0.603f, 0.603f, 0.0f, false, false, -0.308f, 0.527f)
                lineTo(6.291f, 14.5f)
                arcToRelative(0.606f, 0.606f, 0.0f, false, false, 0.916f, 0.521f)
                lineToRelative(4.953f, -2.946f)
                curveToRelative(0.025f, -0.014f, 0.036f, -0.042f, 0.058f, -0.06f)
                lineTo(12.218f, 14.5f)
                arcToRelative(0.606f, 0.606f, 0.0f, false, false, 0.914f, 0.52f)
                lineToRelative(4.952f, -2.946f)
                arcToRelative(0.604f, 0.604f, 0.0f, false, false, 0.003f, -1.037f)
                lineToRelative(-4.953f, -2.98f)
                arcToRelative(0.605f, 0.605f, 0.0f, false, false, -0.916f, 0.518f)
                verticalLineToRelative(2.518f)
                curveToRelative(-0.022f, -0.016f, -0.03f, -0.042f, -0.056f, -0.056f)
                lineTo(7.21f, 8.062f)
                arcToRelative(0.61f, 0.61f, 0.0f, false, false, -0.61f, -0.009f)
                close()
            }
        }
        .build()
        return _fastForwardRegular!!
    }

private var _fastForwardRegular: ImageVector? = null
