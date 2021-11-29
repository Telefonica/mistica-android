package com.telefonica.mistica.compose.misticaicons.o2.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.o2.LightGroup

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
                moveTo(15.746f, 2.0f)
                curveToRelative(1.795f, 0.0f, 3.25f, 1.444f, 3.25f, 3.215f)
                verticalLineToRelative(0.66f)
                curveToRelative(0.004f, 0.016f, 0.004f, 0.032f, 0.004f, 0.048f)
                reflectiveCurveToRelative(0.0f, 0.032f, -0.004f, 0.048f)
                verticalLineToRelative(12.814f)
                curveToRelative(0.0f, 1.775f, -1.46f, 3.215f, -3.25f, 3.215f)
                lineTo(9.25f, 22.0f)
                curveTo(7.455f, 22.0f, 6.0f, 20.556f, 6.0f, 18.785f)
                lineTo(6.0f, 5.215f)
                curveTo(6.0f, 3.44f, 7.46f, 2.0f, 9.25f, 2.0f)
                close()
                moveTo(18.272f, 6.283f)
                lineTo(6.724f, 6.283f)
                verticalLineToRelative(11.43f)
                horizontalLineToRelative(7.579f)
                curveToRelative(0.198f, 0.0f, 0.36f, 0.16f, 0.36f, 0.356f)
                arcToRelative(0.359f, 0.359f, 0.0f, false, true, -0.36f, 0.356f)
                horizontalLineToRelative(-7.58f)
                verticalLineToRelative(0.356f)
                curveToRelative(0.0f, 1.38f, 1.132f, 2.5f, 2.527f, 2.5f)
                horizontalLineToRelative(6.5f)
                curveToRelative(1.39f, 0.0f, 2.526f, -1.12f, 2.522f, -2.496f)
                lineTo(18.272f, 6.283f)
                close()
                moveTo(16.47f, 17.353f)
                curveToRelative(0.4f, 0.0f, 0.723f, 0.32f, 0.723f, 0.716f)
                arcToRelative(0.72f, 0.72f, 0.0f, false, true, -0.723f, 0.716f)
                arcToRelative(0.72f, 0.72f, 0.0f, false, true, -0.724f, -0.716f)
                arcToRelative(0.72f, 0.72f, 0.0f, false, true, 0.724f, -0.716f)
                close()
                moveTo(15.746f, 2.716f)
                lineTo(9.25f, 2.716f)
                curveToRelative(-1.39f, 0.0f, -2.526f, 1.12f, -2.526f, 2.5f)
                verticalLineToRelative(0.351f)
                horizontalLineToRelative(11.548f)
                verticalLineToRelative(-0.352f)
                curveToRelative(0.0f, -1.38f, -1.131f, -2.5f, -2.526f, -2.5f)
                close()
            }
        }
        .build()
        return _mobileDeviceLight!!
    }

private var _mobileDeviceLight: ImageVector? = null
