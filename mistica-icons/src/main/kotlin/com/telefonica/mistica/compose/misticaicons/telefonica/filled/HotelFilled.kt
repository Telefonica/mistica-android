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

public val FilledGroup.HotelFilled: ImageVector
    get() {
        if (_hotelFilled != null) {
            return _hotelFilled!!
        }
        _hotelFilled = Builder(name = "HotelFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.255f, 2.008f)
                curveToRelative(1.927f, 0.045f, 9.431f, 0.807f, 9.431f, 9.86f)
                curveToRelative(0.0f, 9.07f, -7.512f, 9.776f, -9.392f, 9.813f)
                curveToRelative(-0.269f, 0.002f, -0.6f, 0.008f, -0.902f, 0.002f)
                curveTo(9.415f, 21.655f, 2.0f, 20.941f, 2.0f, 11.813f)
                curveTo(2.0f, 2.694f, 9.347f, 2.02f, 11.322f, 2.0f)
                curveToRelative(0.308f, 0.0f, 0.647f, 0.003f, 0.933f, 0.008f)
                close()
                moveTo(15.667f, 6.703f)
                horizontalLineToRelative(-2.16f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, false, -0.409f, 0.409f)
                verticalLineToRelative(3.451f)
                horizontalLineToRelative(-2.515f)
                lineTo(10.583f, 7.112f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, false, -0.41f, -0.409f)
                lineTo(8.015f, 6.703f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, false, -0.409f, 0.409f)
                verticalLineToRelative(9.468f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, false, 0.409f, 0.409f)
                horizontalLineToRelative(2.16f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, false, 0.409f, -0.41f)
                verticalLineToRelative(-3.576f)
                horizontalLineToRelative(2.515f)
                verticalLineToRelative(3.577f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, false, 0.409f, 0.409f)
                horizontalLineToRelative(2.16f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, false, 0.409f, -0.41f)
                lineTo(16.077f, 7.113f)
                arcToRelative(0.408f, 0.408f, 0.0f, false, false, -0.41f, -0.409f)
                close()
            }
        }
        .build()
        return _hotelFilled!!
    }

private var _hotelFilled: ImageVector? = null
