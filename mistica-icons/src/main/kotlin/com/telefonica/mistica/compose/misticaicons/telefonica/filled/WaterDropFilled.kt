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

public val FilledGroup.WaterDropFilled: ImageVector
    get() {
        if (_waterDropFilled != null) {
            return _waterDropFilled!!
        }
        _waterDropFilled = Builder(name = "WaterDropFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.569f, 2.12f)
                arcToRelative(0.407f, 0.407f, 0.0f, false, false, -0.575f, -0.002f)
                lineToRelative(-0.002f, 0.002f)
                curveToRelative(-1.359f, 1.367f, -6.673f, 8.247f, -6.659f, 12.57f)
                curveToRelative(0.006f, 2.173f, 0.647f, 3.957f, 1.852f, 5.164f)
                curveToRelative(1.199f, 1.2f, 2.966f, 1.835f, 5.106f, 1.835f)
                horizontalLineToRelative(0.034f)
                curveToRelative(4.367f, -0.014f, 6.964f, -2.644f, 6.95f, -7.042f)
                curveToRelative(-0.009f, -4.28f, -5.345f, -11.157f, -6.706f, -12.527f)
            }
        }
        .build()
        return _waterDropFilled!!
    }

private var _waterDropFilled: ImageVector? = null
