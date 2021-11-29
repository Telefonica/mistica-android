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

public val FilledGroup.LocationMapFilled: ImageVector
    get() {
        if (_locationMapFilled != null) {
            return _locationMapFilled!!
        }
        _locationMapFilled = Builder(name = "LocationMapFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.94f, 5.71f)
                arcToRelative(0.876f, 0.876f, 0.0f, false, true, -0.866f, 0.884f)
                arcToRelative(0.876f, 0.876f, 0.0f, false, true, -0.866f, -0.884f)
                curveToRelative(0.0f, -0.487f, 0.389f, -0.884f, 0.866f, -0.884f)
                curveToRelative(0.478f, 0.0f, 0.866f, 0.397f, 0.866f, 0.884f)
                close()
                moveTo(19.686f, 5.71f)
                curveToRelative(0.0f, 2.42f, -3.711f, 8.12f, -4.134f, 8.763f)
                arcToRelative(0.567f, 0.567f, 0.0f, false, true, -0.955f, 0.0f)
                curveToRelative(-0.424f, -0.643f, -4.135f, -6.342f, -4.135f, -8.763f)
                curveTo(10.462f, 3.07f, 12.49f, 1.0f, 15.079f, 1.0f)
                curveToRelative(2.59f, 0.0f, 4.607f, 2.069f, 4.607f, 4.71f)
                close()
                moveTo(17.092f, 5.71f)
                curveToRelative(0.0f, -1.135f, -0.905f, -2.059f, -2.018f, -2.059f)
                curveToRelative(-1.112f, 0.0f, -2.018f, 0.924f, -2.018f, 2.06f)
                curveToRelative(0.0f, 1.134f, 0.906f, 2.058f, 2.018f, 2.058f)
                curveToRelative(1.113f, 0.0f, 2.018f, -0.924f, 2.018f, -2.059f)
                close()
                moveTo(9.502f, 17.918f)
                curveToRelative(-0.005f, -0.03f, -0.005f, -0.056f, -0.005f, -0.086f)
                verticalLineToRelative(-1.33f)
                curveToRelative(0.0f, -1.17f, -0.783f, -1.467f, -2.17f, -1.884f)
                curveToRelative(-1.153f, -0.346f, -2.585f, -0.778f, -2.821f, -2.34f)
                curveToRelative(-0.005f, -0.03f, -0.005f, -0.06f, -0.005f, -0.09f)
                verticalLineToRelative(-1.175f)
                curveToRelative(0.0f, -0.864f, -0.69f, -1.567f, -1.536f, -1.567f)
                lineTo(2.0f, 9.446f)
                lineTo(2.0f, 22.0f)
                horizontalLineToRelative(9.353f)
                curveToRelative(-1.064f, -1.055f, -1.777f, -2.636f, -1.851f, -4.082f)
                close()
                moveTo(20.43f, 5.123f)
                curveToRelative(0.02f, 0.19f, 0.03f, 0.391f, 0.03f, 0.587f)
                curveToRelative(0.0f, 0.457f, -0.207f, 3.043f, -4.269f, 9.2f)
                curveToRelative(-0.25f, 0.381f, -0.669f, 0.607f, -1.117f, 0.607f)
                curveToRelative(-0.448f, 0.0f, -0.866f, -0.226f, -1.117f, -0.607f)
                curveToRelative(-4.061f, -6.162f, -4.268f, -8.748f, -4.268f, -9.2f)
                curveToRelative(0.0f, -0.2f, 0.01f, -0.397f, 0.03f, -0.587f)
                lineTo(2.0f, 5.123f)
                lineTo(2.0f, 8.26f)
                horizontalLineToRelative(0.96f)
                curveToRelative(1.486f, 0.0f, 2.692f, 1.23f, 2.692f, 2.747f)
                verticalLineToRelative(1.13f)
                curveToRelative(0.138f, 0.753f, 0.852f, 1.004f, 2.004f, 1.35f)
                curveToRelative(1.265f, 0.382f, 2.998f, 0.904f, 2.998f, 3.013f)
                verticalLineToRelative(1.175f)
                curveToRelative(0.0f, 1.904f, 1.54f, 4.314f, 3.268f, 4.314f)
                lineTo(22.0f, 21.989f)
                lineTo(22.0f, 5.123f)
                horizontalLineToRelative(-1.57f)
                close()
            }
        }
        .build()
        return _locationMapFilled!!
    }

private var _locationMapFilled: ImageVector? = null
