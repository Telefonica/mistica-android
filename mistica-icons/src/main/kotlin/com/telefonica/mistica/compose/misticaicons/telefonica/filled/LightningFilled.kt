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

public val FilledGroup.LightningFilled: ImageVector
    get() {
        if (_lightningFilled != null) {
            return _lightningFilled!!
        }
        _lightningFilled = Builder(name = "LightningFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.121f, 11.45f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, false, -0.434f, -0.428f)
                lineToRelative(-4.504f, -1.11f)
                lineToRelative(2.722f, -6.904f)
                arcToRelative(0.625f, 0.625f, 0.0f, false, false, -0.23f, -0.745f)
                arcToRelative(0.582f, 0.582f, 0.0f, false, false, -0.753f, 0.092f)
                lineToRelative(-8.916f, 9.569f)
                arcToRelative(0.628f, 0.628f, 0.0f, false, false, -0.143f, 0.597f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, false, 0.432f, 0.422f)
                lineToRelative(4.112f, 1.017f)
                lineToRelative(-2.698f, 7.05f)
                arcToRelative(0.622f, 0.622f, 0.0f, false, false, 0.23f, 0.737f)
                arcToRelative(0.58f, 0.58f, 0.0f, false, false, 0.748f, -0.08f)
                lineToRelative(9.286f, -9.617f)
                arcToRelative(0.627f, 0.627f, 0.0f, false, false, 0.148f, -0.6f)
                close()
            }
        }
        .build()
        return _lightningFilled!!
    }

private var _lightningFilled: ImageVector? = null
