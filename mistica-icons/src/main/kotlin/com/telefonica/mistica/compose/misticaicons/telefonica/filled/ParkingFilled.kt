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

public val FilledGroup.ParkingFilled: ImageVector
    get() {
        if (_parkingFilled != null) {
            return _parkingFilled!!
        }
        _parkingFilled = Builder(name = "ParkingFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.74f, 10.785f)
                arcToRelative(1.494f, 1.494f, 0.0f, false, true, -0.655f, 0.4f)
                curveToRelative(-0.218f, 0.065f, -0.658f, 0.137f, -1.504f, 0.137f)
                horizontalLineTo(11.15f)
                verticalLineTo(6.348f)
                horizontalLineToRelative(1.305f)
                curveToRelative(0.672f, 0.0f, 1.219f, 0.05f, 1.622f, 0.148f)
                curveToRelative(0.311f, 0.076f, 0.555f, 0.196f, 0.709f, 0.34f)
                curveToRelative(0.425f, 0.416f, 0.512f, 1.246f, 0.512f, 1.87f)
                curveToRelative(0.0f, 0.986f, -0.19f, 1.706f, -0.557f, 2.079f)
                moveToRelative(3.846f, -6.925f)
                curveToRelative(-0.65f, -0.622f, -1.504f, -1.07f, -2.54f, -1.333f)
                curveToRelative(-0.964f, -0.244f, -2.197f, -0.367f, -3.667f, -0.367f)
                horizontalLineTo(6.312f)
                arcToRelative(0.82f, 0.82f, 0.0f, false, false, -0.812f, 0.83f)
                verticalLineToRelative(18.027f)
                curveToRelative(0.0f, 0.457f, 0.364f, 0.83f, 0.812f, 0.83f)
                horizontalLineToRelative(4.028f)
                arcToRelative(0.822f, 0.822f, 0.0f, false, false, 0.813f, -0.83f)
                verticalLineToRelative(-5.392f)
                horizontalLineToRelative(2.028f)
                curveToRelative(1.255f, 0.0f, 2.341f, -0.157f, 3.23f, -0.468f)
                curveToRelative(0.94f, -0.328f, 1.728f, -0.849f, 2.33f, -1.549f)
                curveToRelative(1.011f, -1.151f, 1.524f, -2.81f, 1.524f, -4.927f)
                curveToRelative(-0.003f, -2.146f, -0.566f, -3.77f, -1.678f, -4.82f)
            }
        }
        .build()
        return _parkingFilled!!
    }

private var _parkingFilled: ImageVector? = null
