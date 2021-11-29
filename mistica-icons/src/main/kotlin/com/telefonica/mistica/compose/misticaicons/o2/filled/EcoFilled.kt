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

public val FilledGroup.EcoFilled: ImageVector
    get() {
        if (_ecoFilled != null) {
            return _ecoFilled!!
        }
        _ecoFilled = Builder(name = "EcoFilled", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.004f, 6.806f)
                curveToRelative(0.28f, 0.0f, 0.53f, 0.253f, 0.53f, 0.537f)
                verticalLineToRelative(14.12f)
                arcToRelative(0.552f, 0.552f, 0.0f, false, true, -0.53f, 0.537f)
                arcToRelative(0.549f, 0.549f, 0.0f, false, true, -0.53f, -0.536f)
                lineTo(11.474f, 7.343f)
                curveToRelative(0.0f, -0.284f, 0.25f, -0.537f, 0.53f, -0.537f)
                close()
                moveTo(11.787f, 2.054f)
                curveToRelative(0.142f, -0.072f, 0.284f, -0.072f, 0.39f, 0.0f)
                curveToRelative(0.25f, 0.14f, 5.827f, 3.752f, 5.823f, 10.293f)
                curveToRelative(0.0f, 4.793f, -3.034f, 6.793f, -4.764f, 7.509f)
                lineTo(13.236f, 7.343f)
                curveToRelative(0.0f, -0.68f, -0.565f, -1.253f, -1.236f, -1.253f)
                reflectiveCurveToRelative(-1.236f, 0.572f, -1.236f, 1.253f)
                verticalLineToRelative(12.513f)
                curveTo(9.034f, 19.136f, 6.0f, 17.136f, 6.0f, 12.347f)
                curveToRelative(0.0f, -6.54f, 5.577f, -10.153f, 5.787f, -10.293f)
                close()
            }
        }
        .build()
        return _ecoFilled!!
    }

private var _ecoFilled: ImageVector? = null
