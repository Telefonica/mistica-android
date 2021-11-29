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

public val FilledGroup.DisableFilled: ImageVector
    get() {
        if (_disableFilled != null) {
            return _disableFilled!!
        }
        _disableFilled = Builder(name = "DisableFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.997f, 21.999f)
                curveToRelative(-2.913f, 0.0f, -5.157f, -0.588f, -6.779f, -1.783f)
                lineToRelative(14.964f, -14.96f)
                curveTo(21.394f, 6.884f, 22.0f, 9.125f, 22.0f, 12.003f)
                curveToRelative(0.0f, 6.82f, -3.18f, 9.996f, -10.002f, 9.996f)
                moveToRelative(0.0f, -19.998f)
                curveToRelative(2.895f, 0.0f, 5.146f, 0.608f, 6.775f, 1.834f)
                lineTo(3.8f, 18.805f)
                curveTo(2.59f, 17.185f, 2.0f, 14.93f, 2.0f, 12.004f)
                curveToRelative(0.0f, -6.823f, 3.176f, -10.002f, 9.996f, -10.002f)
                moveToRelative(0.0f, -2.001f)
                curveTo(4.415f, 0.0f, 0.0f, 3.828f, 0.0f, 12.003f)
                curveTo(0.0f, 20.18f, 4.415f, 24.0f, 11.997f, 24.0f)
                curveTo(19.577f, 24.0f, 24.0f, 20.179f, 24.0f, 12.003f)
                curveTo(24.0f, 3.828f, 19.578f, 0.0f, 11.997f, 0.0f)
            }
        }
        .build()
        return _disableFilled!!
    }

private var _disableFilled: ImageVector? = null
