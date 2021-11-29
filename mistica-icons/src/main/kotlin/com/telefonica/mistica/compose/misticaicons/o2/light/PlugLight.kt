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

public val LightGroup.PlugLight: ImageVector
    get() {
        if (_plugLight != null) {
            return _plugLight!!
        }
        _plugLight = Builder(name = "PlugLight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.295f, 2.0f)
                curveToRelative(0.224f, 0.0f, 0.372f, 0.152f, 0.372f, 0.382f)
                verticalLineToRelative(3.04f)
                horizontalLineToRelative(2.223f)
                verticalLineToRelative(4.94f)
                curveToRelative(0.0f, 2.354f, -1.815f, 4.332f, -4.075f, 4.52f)
                verticalLineToRelative(1.937f)
                curveToRelative(0.0f, 1.9f, 1.484f, 3.422f, 3.335f, 3.422f)
                curveToRelative(1.852f, 0.0f, 3.336f, -1.522f, 3.336f, -3.422f)
                verticalLineTo(9.221f)
                curveToRelative(0.0f, -2.318f, 1.815f, -4.18f, 4.075f, -4.18f)
                curveToRelative(2.26f, 0.0f, 4.075f, 1.862f, 4.075f, 4.18f)
                verticalLineToRelative(4.94f)
                curveToRelative(0.0f, 0.23f, -0.148f, 0.381f, -0.372f, 0.381f)
                reflectiveCurveToRelative(-0.372f, -0.152f, -0.372f, -0.381f)
                lineToRelative(0.004f, -4.94f)
                curveToRelative(0.0f, -1.9f, -1.483f, -3.422f, -3.335f, -3.422f)
                curveToRelative(-1.852f, 0.0f, -3.335f, 1.522f, -3.335f, 3.422f)
                verticalLineToRelative(7.598f)
                curveToRelative(0.0f, 2.318f, -1.816f, 4.181f, -4.076f, 4.181f)
                reflectiveCurveToRelative(-4.075f, -1.863f, -4.075f, -4.18f)
                verticalLineToRelative(-1.937f)
                curveTo(3.815f, 14.694f, 2.0f, 12.758f, 2.0f, 10.36f)
                verticalLineToRelative(-4.94f)
                horizontalLineToRelative(2.22f)
                verticalLineToRelative(-3.04f)
                curveToRelative(0.0f, -0.23f, 0.148f, -0.381f, 0.371f, -0.381f)
                curveToRelative(0.224f, 0.0f, 0.372f, 0.152f, 0.372f, 0.382f)
                verticalLineToRelative(3.04f)
                horizontalLineToRelative(2.96f)
                verticalLineToRelative(-3.04f)
                curveToRelative(0.0f, -0.23f, 0.148f, -0.382f, 0.372f, -0.382f)
                close()
                moveTo(21.26f, 15.679f)
                curveToRelative(0.409f, 0.0f, 0.74f, 0.34f, 0.74f, 0.759f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.74f, 0.759f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.74f, -0.76f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.74f, -0.758f)
                close()
                moveTo(10.146f, 6.18f)
                horizontalLineTo(2.74f)
                verticalLineToRelative(4.18f)
                curveToRelative(0.0f, 2.089f, 1.664f, 3.8f, 3.703f, 3.8f)
                curveToRelative(2.04f, 0.0f, 3.703f, -1.711f, 3.703f, -3.8f)
                verticalLineToRelative(-4.18f)
                close()
            }
        }
        .build()
        return _plugLight!!
    }

private var _plugLight: ImageVector? = null
