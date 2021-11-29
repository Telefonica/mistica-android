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

public val FilledGroup.HeartFilled: ImageVector
    get() {
        if (_heartFilled != null) {
            return _heartFilled!!
        }
        _heartFilled = Builder(name = "HeartFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.252f, 2.0f)
                curveToRelative(-2.02f, 0.0f, -3.372f, 0.769f, -5.256f, 3.08f)
                curveTo(10.14f, 2.824f, 8.656f, 2.0f, 6.58f, 2.0f)
                curveTo(3.572f, 2.0f, 2.0f, 4.354f, 2.0f, 6.685f)
                curveToRelative(0.0f, 4.764f, 6.404f, 11.52f, 9.48f, 14.766f)
                lineTo(12.0f, 22.0f)
                lineToRelative(0.52f, -0.549f)
                curveToRelative(0.88f, -0.924f, 1.904f, -2.018f, 2.96f, -3.21f)
                lineToRelative(2.66f, -3.232f)
                curveTo(20.736f, 11.582f, 22.0f, 8.859f, 22.0f, 6.685f)
                curveTo(22.0f, 4.355f, 20.368f, 2.0f, 17.252f, 2.0f)
            }
        }
        .build()
        return _heartFilled!!
    }

private var _heartFilled: ImageVector? = null
