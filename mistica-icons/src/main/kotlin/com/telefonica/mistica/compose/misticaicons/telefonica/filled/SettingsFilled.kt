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

public val FilledGroup.SettingsFilled: ImageVector
    get() {
        if (_settingsFilled != null) {
            return _settingsFilled!!
        }
        _settingsFilled = Builder(name = "SettingsFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.695f, 10.11f)
                horizontalLineToRelative(-1.852f)
                arcTo(7.354f, 7.354f, 0.0f, false, false, 18.19f, 8.0f)
                lineToRelative(1.37f, -1.37f)
                arcToRelative(0.997f, 0.997f, 0.0f, false, false, 0.0f, -1.406f)
                lineToRelative(-1.1f, -1.098f)
                arcToRelative(0.997f, 0.997f, 0.0f, false, false, -1.407f, 0.0f)
                lineToRelative(-1.37f, 1.37f)
                arcToRelative(7.307f, 7.307f, 0.0f, false, false, -2.109f, -0.653f)
                lineTo(13.574f, 2.99f)
                curveToRelative(0.0f, -0.54f, -0.44f, -0.98f, -0.98f, -0.98f)
                lineTo(11.09f, 2.01f)
                curveToRelative(-0.541f, 0.0f, -0.98f, 0.44f, -0.98f, 0.98f)
                verticalLineToRelative(1.854f)
                arcTo(7.354f, 7.354f, 0.0f, false, false, 8.0f, 5.496f)
                lineToRelative(-1.37f, -1.37f)
                arcToRelative(0.997f, 0.997f, 0.0f, false, false, -1.406f, 0.0f)
                lineTo(4.126f, 5.224f)
                arcToRelative(0.997f, 0.997f, 0.0f, false, false, 0.0f, 1.406f)
                lineToRelative(1.367f, 1.367f)
                curveToRelative(-0.317f, 0.56f, -0.543f, 1.465f, -0.65f, 2.112f)
                lineTo(2.99f, 10.109f)
                curveToRelative(-0.54f, 0.0f, -0.98f, 0.44f, -0.98f, 0.98f)
                verticalLineToRelative(1.505f)
                curveToRelative(0.0f, 0.54f, 0.44f, 0.98f, 0.98f, 0.98f)
                horizontalLineToRelative(1.854f)
                curveToRelative(0.107f, 0.65f, 0.333f, 1.552f, 0.65f, 2.112f)
                lineToRelative(-1.367f, 1.367f)
                arcToRelative(0.997f, 0.997f, 0.0f, false, false, 0.0f, 1.406f)
                lineToRelative(1.098f, 1.098f)
                arcToRelative(0.997f, 0.997f, 0.0f, false, false, 1.406f, 0.0f)
                lineTo(8.0f, 18.187f)
                arcToRelative(7.354f, 7.354f, 0.0f, false, false, 2.11f, 0.653f)
                verticalLineToRelative(1.855f)
                curveToRelative(0.0f, 0.54f, 0.439f, 0.98f, 0.98f, 0.98f)
                horizontalLineToRelative(1.504f)
                curveToRelative(0.54f, 0.0f, 0.98f, -0.44f, 0.98f, -0.98f)
                lineTo(13.574f, 18.84f)
                arcToRelative(7.307f, 7.307f, 0.0f, false, false, 2.11f, -0.652f)
                lineToRelative(1.37f, 1.37f)
                arcToRelative(0.997f, 0.997f, 0.0f, false, false, 1.405f, 0.0f)
                lineToRelative(1.098f, -1.099f)
                arcToRelative(0.997f, 0.997f, 0.0f, false, false, 0.0f, -1.406f)
                lineToRelative(-1.367f, -1.367f)
                arcToRelative(7.354f, 7.354f, 0.0f, false, false, 0.653f, -2.109f)
                horizontalLineToRelative(1.854f)
                curveToRelative(0.541f, 0.0f, 0.98f, -0.44f, 0.98f, -0.98f)
                verticalLineToRelative(-1.505f)
                arcToRelative(0.984f, 0.984f, 0.0f, false, false, -0.982f, -0.983f)
                close()
                moveTo(11.843f, 9.112f)
                curveToRelative(1.863f, 0.0f, 2.731f, 0.868f, 2.731f, 2.731f)
                reflectiveCurveToRelative(-0.868f, 2.731f, -2.73f, 2.731f)
                curveToRelative(-1.864f, 0.0f, -2.732f, -0.868f, -2.732f, -2.73f)
                curveToRelative(0.0f, -1.864f, 0.868f, -2.732f, 2.731f, -2.732f)
                close()
            }
        }
        .build()
        return _settingsFilled!!
    }

private var _settingsFilled: ImageVector? = null
