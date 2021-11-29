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

public val FilledGroup.StormFilled: ImageVector
    get() {
        if (_stormFilled != null) {
            return _stormFilled!!
        }
        _stormFilled = Builder(name = "StormFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(15.898f, 15.27f)
                lineToRelative(-6.325f, 4.897f)
                lineToRelative(1.45f, -3.334f)
                curveToRelative(0.018f, -0.05f, 0.065f, -0.103f, 0.035f, -0.126f)
                curveToRelative(-0.068f, -0.042f, -3.062f, -0.705f, -3.062f, -0.705f)
                arcToRelative(0.404f, 0.404f, 0.0f, false, true, -0.289f, -0.283f)
                arcToRelative(0.414f, 0.414f, 0.0f, false, true, 0.09f, -0.407f)
                lineToRelative(5.938f, -6.59f)
                arcToRelative(0.398f, 0.398f, 0.0f, false, true, 0.507f, -0.076f)
                arcToRelative(0.435f, 0.435f, 0.0f, false, true, 0.168f, 0.507f)
                reflectiveCurveToRelative(-1.82f, 4.58f, -1.778f, 4.711f)
                curveToRelative(0.033f, 0.104f, 3.061f, 0.706f, 3.061f, 0.706f)
                curveToRelative(0.146f, 0.037f, 0.26f, 0.149f, 0.3f, 0.291f)
                arcToRelative(0.44f, 0.44f, 0.0f, false, true, -0.095f, 0.41f)
                moveToRelative(1.283f, -9.258f)
                curveTo(15.937f, 2.34f, 11.892f, 2.15f, 11.07f, 2.15f)
                curveToRelative(-1.064f, 0.0f, -6.277f, 0.291f, -6.47f, 6.04f)
                curveToRelative(-1.073f, 0.442f, -2.451f, 1.506f, -2.451f, 4.089f)
                curveToRelative(0.0f, 3.291f, 1.96f, 4.342f, 4.347f, 4.484f)
                lineToRelative(3.547f, 0.28f)
                lineToRelative(-1.827f, 4.205f)
                arcToRelative(0.422f, 0.422f, 0.0f, false, false, 0.112f, 0.499f)
                arcToRelative(0.42f, 0.42f, 0.0f, false, false, 0.252f, 0.09f)
                arcToRelative(0.357f, 0.357f, 0.0f, false, false, 0.233f, -0.082f)
                lineToRelative(6.776f, -5.062f)
                lineToRelative(0.975f, -0.008f)
                curveToRelative(2.434f, 0.0f, 5.268f, -1.406f, 5.268f, -5.361f)
                curveToRelative(0.003f, -3.597f, -2.327f, -5.084f, -4.652f, -5.311f)
            }
        }
        .build()
        return _stormFilled!!
    }

private var _stormFilled: ImageVector? = null
