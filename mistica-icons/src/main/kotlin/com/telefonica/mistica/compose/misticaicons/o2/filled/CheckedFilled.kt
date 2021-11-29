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
                moveTo(12.0f, 2.0f)
                curveToRelative(5.516f, 0.0f, 10.0f, 4.484f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.484f, 10.0f, -10.0f, 10.0f)
                reflectiveCurveTo(2.0f, 17.516f, 2.0f, 12.0f)
                reflectiveCurveTo(6.484f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(16.95f, 8.014f)
                lineTo(10.633f, 14.164f)
                lineTo(8.066f, 11.569f)
                arcToRelative(0.724f, 0.724f, 0.0f, false, false, -1.032f, -0.028f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, false, -0.027f, 1.022f)
                lineToRelative(3.593f, 3.721f)
                lineToRelative(7.38f, -7.247f)
                arcToRelative(0.704f, 0.704f, 0.0f, false, false, 0.0f, -1.023f)
                arcToRelative(0.726f, 0.726f, 0.0f, false, false, -1.03f, 0.0f)
                close()
            }
        }
        .build()
        return _checkedFilled!!
    }

private var _checkedFilled: ImageVector? = null
