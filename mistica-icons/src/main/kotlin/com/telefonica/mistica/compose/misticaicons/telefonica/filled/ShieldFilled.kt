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

public val FilledGroup.ShieldFilled: ImageVector
    get() {
        if (_shieldFilled != null) {
            return _shieldFilled!!
        }
        _shieldFilled = Builder(name = "ShieldFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.291f, 21.686f)
                arcToRelative(0.597f, 0.597f, 0.0f, false, true, -0.257f, -0.059f)
                curveToRelative(-0.745f, -0.355f, -7.286f, -3.577f, -7.897f, -7.128f)
                curveToRelative(-0.473f, -2.743f, -0.456f, -9.082f, -0.456f, -9.35f)
                curveToRelative(0.0f, -0.191f, 0.087f, -0.367f, 0.235f, -0.485f)
                arcToRelative(0.611f, 0.611f, 0.0f, false, true, 0.521f, -0.11f)
                curveToRelative(1.602f, 0.258f, 2.448f, -0.316f, 3.524f, -1.039f)
                curveTo(9.022f, 2.804f, 10.224f, 2.0f, 12.289f, 2.0f)
                horizontalLineToRelative(0.008f)
                curveToRelative(2.064f, 0.003f, 3.266f, 0.807f, 4.325f, 1.518f)
                curveToRelative(1.075f, 0.723f, 1.927f, 1.289f, 3.552f, 1.034f)
                arcToRelative(0.625f, 0.625f, 0.0f, false, true, 0.501f, 0.137f)
                arcToRelative(0.639f, 0.639f, 0.0f, false, true, 0.23f, 0.462f)
                curveToRelative(0.0f, 0.27f, 0.017f, 6.608f, -0.448f, 9.35f)
                curveToRelative(-0.611f, 3.552f, -7.16f, 6.774f, -7.905f, 7.13f)
                arcToRelative(0.66f, 0.66f, 0.0f, false, true, -0.26f, 0.055f)
                close()
            }
        }
        .build()
        return _shieldFilled!!
    }

private var _shieldFilled: ImageVector? = null
