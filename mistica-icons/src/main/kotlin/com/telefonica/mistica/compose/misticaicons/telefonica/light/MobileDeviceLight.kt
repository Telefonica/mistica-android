package com.telefonica.mistica.compose.misticaicons.telefonica.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.telefonica.LightGroup

public val LightGroup.MobileDeviceLight: ImageVector
    get() {
        if (_mobileDeviceLight != null) {
            return _mobileDeviceLight!!
        }
        _mobileDeviceLight = Builder(name = "MobileDeviceLight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.55f, 2.156f)
                curveToRelative(1.03f, 0.0f, 1.773f, 0.244f, 2.271f, 0.745f)
                curveToRelative(0.499f, 0.502f, 0.74f, 1.241f, 0.74f, 2.266f)
                verticalLineToRelative(13.656f)
                curveToRelative(0.0f, 1.036f, -0.244f, 1.781f, -0.745f, 2.28f)
                curveToRelative(-0.496f, 0.493f, -1.238f, 0.731f, -2.266f, 0.731f)
                lineTo(8.449f, 21.834f)
                curveToRelative(-1.028f, 0.0f, -1.77f, -0.238f, -2.266f, -0.731f)
                curveToRelative(-0.502f, -0.496f, -0.745f, -1.244f, -0.745f, -2.28f)
                lineTo(5.438f, 5.167f)
                curveToRelative(0.0f, -1.008f, 0.243f, -1.745f, 0.742f, -2.249f)
                curveToRelative(0.507f, -0.512f, 1.25f, -0.762f, 2.269f, -0.762f)
                horizontalLineToRelative(7.1f)
                close()
                moveTo(15.55f, 2.716f)
                lineTo(8.449f, 2.716f)
                curveToRelative(-0.863f, 0.0f, -1.474f, 0.194f, -1.871f, 0.594f)
                curveToRelative(-0.393f, 0.395f, -0.583f, 1.003f, -0.583f, 1.857f)
                verticalLineToRelative(13.656f)
                curveToRelative(0.0f, 1.742f, 0.711f, 2.45f, 2.45f, 2.45f)
                horizontalLineToRelative(7.102f)
                curveToRelative(1.742f, 0.0f, 2.45f, -0.708f, 2.45f, -2.45f)
                lineTo(17.997f, 5.167f)
                curveToRelative(0.0f, -0.87f, -0.187f, -1.484f, -0.574f, -1.87f)
                curveToRelative(-0.386f, -0.387f, -1.0f, -0.58f, -1.873f, -0.58f)
                close()
                moveTo(12.006f, 17.826f)
                curveToRelative(0.504f, 0.0f, 0.83f, 0.266f, 0.83f, 0.834f)
                curveToRelative(0.0f, 0.275f, -0.074f, 0.477f, -0.208f, 0.614f)
                curveToRelative(-0.146f, 0.148f, -0.359f, 0.221f, -0.622f, 0.221f)
                reflectiveCurveToRelative(-0.476f, -0.073f, -0.622f, -0.221f)
                curveToRelative(-0.134f, -0.137f, -0.21f, -0.339f, -0.21f, -0.614f)
                curveToRelative(0.0f, -0.568f, 0.328f, -0.834f, 0.832f, -0.834f)
                close()
            }
        }
        .build()
        return _mobileDeviceLight!!
    }

private var _mobileDeviceLight: ImageVector? = null
