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
                moveTo(12.0f, 2.0f)
                curveTo(6.488f, 2.0f, 2.0f, 6.488f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.488f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.488f, 10.0f, -10.0f)
                reflectiveCurveTo(17.512f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.38f, 12.38f)
                lineTo(7.736f, 17.018f)
                arcToRelative(0.532f, 0.532f, 0.0f, false, true, -0.38f, 0.156f)
                arcToRelative(0.535f, 0.535f, 0.0f, false, true, -0.38f, -0.914f)
                lineToRelative(4.265f, -4.265f)
                lineToRelative(-4.264f, -4.264f)
                arcToRelative(0.535f, 0.535f, 0.0f, false, true, 0.0f, -0.758f)
                curveToRelative(0.21f, -0.21f, 0.549f, -0.21f, 0.759f, 0.0f)
                lineToRelative(4.643f, 4.643f)
                arcToRelative(0.54f, 0.54f, 0.0f, false, true, 0.0f, 0.763f)
                close()
                moveTo(18.449f, 12.38f)
                lineTo(13.805f, 17.018f)
                arcToRelative(0.532f, 0.532f, 0.0f, false, true, -0.379f, 0.156f)
                arcToRelative(0.535f, 0.535f, 0.0f, false, true, -0.38f, -0.914f)
                lineToRelative(4.265f, -4.265f)
                lineToRelative(-4.26f, -4.26f)
                arcToRelative(0.535f, 0.535f, 0.0f, false, true, 0.0f, -0.758f)
                curveToRelative(0.21f, -0.21f, 0.549f, -0.21f, 0.759f, 0.0f)
                lineToRelative(4.643f, 4.644f)
                arcToRelative(0.54f, 0.54f, 0.0f, false, true, -0.004f, 0.758f)
                close()
            }
        }
        .build()
        return _fastForwardFilled!!
    }

private var _fastForwardFilled: ImageVector? = null
