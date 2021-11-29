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

public val FilledGroup.TruckFilled: ImageVector
    get() {
        if (_truckFilled != null) {
            return _truckFilled!!
        }
        _truckFilled = Builder(name = "TruckFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.955f, 19.65f)
                curveToRelative(-1.126f, 0.0f, -1.697f, -0.594f, -1.697f, -1.757f)
                curveToRelative(0.0f, -1.17f, 0.571f, -1.764f, 1.697f, -1.764f)
                curveToRelative(1.118f, 0.0f, 1.69f, 0.594f, 1.69f, 1.764f)
                curveToRelative(0.0f, 1.163f, -0.572f, 1.757f, -1.69f, 1.757f)
                close()
                moveTo(6.305f, 19.65f)
                curveToRelative(-1.126f, 0.0f, -1.697f, -0.594f, -1.697f, -1.757f)
                curveToRelative(0.0f, -1.17f, 0.571f, -1.764f, 1.697f, -1.764f)
                curveToRelative(1.118f, 0.0f, 1.69f, 0.594f, 1.69f, 1.764f)
                curveToRelative(0.0f, 1.163f, -0.572f, 1.757f, -1.69f, 1.757f)
                close()
                moveTo(21.005f, 11.667f)
                arcToRelative(479.146f, 479.146f, 0.0f, false, true, -2.831f, -3.922f)
                curveToRelative(-0.41f, -0.585f, -1.126f, -0.97f, -1.835f, -0.97f)
                horizontalLineToRelative(-0.009f)
                lineToRelative(-0.82f, 0.01f)
                lineTo(15.51f, 5.17f)
                curveToRelative(0.0f, -0.82f, -0.645f, -1.482f, -1.432f, -1.482f)
                lineTo(3.457f, 3.681f)
                curveToRelative(-0.79f, 0.0f, -1.432f, 0.67f, -1.432f, 1.49f)
                lineTo(2.025f, 16.95f)
                curveToRelative(0.0f, 0.809f, 0.628f, 1.473f, 1.406f, 1.487f)
                curveToRelative(0.202f, 1.54f, 1.264f, 2.468f, 2.872f, 2.468f)
                curveToRelative(1.599f, 0.0f, 2.66f, -0.93f, 2.854f, -2.468f)
                horizontalLineToRelative(3.935f)
                curveToRelative(0.194f, 1.54f, 1.255f, 2.468f, 2.863f, 2.468f)
                curveToRelative(1.6f, 0.0f, 2.661f, -0.93f, 2.854f, -2.468f)
                horizontalLineToRelative(0.869f)
                curveToRelative(0.507f, 0.0f, 1.028f, -0.233f, 1.423f, -0.644f)
                curveToRelative(0.386f, -0.412f, 0.61f, -0.944f, 0.61f, -1.482f)
                verticalLineToRelative(-2.97f)
                curveToRelative(0.003f, -0.728f, -0.456f, -1.347f, -0.705f, -1.674f)
                close()
            }
        }
        .build()
        return _truckFilled!!
    }

private var _truckFilled: ImageVector? = null
