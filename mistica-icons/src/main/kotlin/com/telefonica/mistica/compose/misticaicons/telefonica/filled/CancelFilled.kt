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

public val FilledGroup.CancelFilled: ImageVector
    get() {
        if (_cancelFilled != null) {
            return _cancelFilled!!
        }
        _cancelFilled = Builder(name = "CancelFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.85f, 16.795f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.062f, 1.062f)
                lineToRelative(-4.795f, -4.795f)
                lineToRelative(-4.78f, 4.78f)
                arcToRelative(0.744f, 0.744f, 0.0f, false, true, -0.53f, 0.22f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.53f, -1.28f)
                lineToRelative(4.782f, -4.782f)
                lineToRelative(-4.781f, -4.78f)
                arcToRelative(0.746f, 0.746f, 0.0f, false, true, 0.0f, -1.06f)
                arcToRelative(0.746f, 0.746f, 0.0f, false, true, 1.058f, 0.0f)
                lineToRelative(4.781f, 4.781f)
                lineToRelative(4.795f, -4.798f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.062f, 1.062f)
                lineTo(13.052f, 12.0f)
                lineToRelative(4.798f, 4.795f)
                close()
                moveTo(11.997f, 0.0f)
                curveTo(4.415f, 0.0f, 0.0f, 3.828f, 0.0f, 12.003f)
                curveTo(0.0f, 20.18f, 4.415f, 24.0f, 11.997f, 24.0f)
                curveTo(19.577f, 24.0f, 24.0f, 20.179f, 24.0f, 12.003f)
                curveTo(24.0f, 3.828f, 19.578f, 0.0f, 11.997f, 0.0f)
                close()
            }
        }
        .build()
        return _cancelFilled!!
    }

private var _cancelFilled: ImageVector? = null
