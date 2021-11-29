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

public val LightGroup.TruckLight: ImageVector
    get() {
        if (_truckLight != null) {
            return _truckLight!!
        }
        _truckLight = Builder(name = "TruckLight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.144f, 2.0f)
                curveTo(10.72f, 2.0f, 12.0f, 3.303f, 12.0f, 4.908f)
                lineTo(12.0f, 6.0f)
                horizontalLineToRelative(3.004f)
                lineTo(22.0f, 13.124f)
                verticalLineToRelative(6.33f)
                horizontalLineToRelative(-2.228f)
                curveTo(19.448f, 20.908f, 18.168f, 22.0f, 16.64f, 22.0f)
                curveToRelative(-1.532f, 0.0f, -2.812f, -1.092f, -3.136f, -2.554f)
                curveToRelative(-0.028f, 0.004f, -0.052f, 0.008f, -0.08f, 0.008f)
                lineTo(4.856f, 19.454f)
                arcToRelative(0.36f, 0.36f, 0.0f, false, true, -0.356f, -0.362f)
                curveToRelative(0.0f, -0.2f, 0.16f, -0.363f, 0.356f, -0.363f)
                horizontalLineToRelative(6.428f)
                lineTo(11.284f, 4.91f)
                curveToRelative(0.0f, -1.206f, -0.964f, -2.184f, -2.144f, -2.184f)
                lineTo(2.356f, 2.726f)
                arcTo(0.36f, 0.36f, 0.0f, false, true, 2.0f, 2.363f)
                curveToRelative(0.0f, -0.2f, 0.16f, -0.363f, 0.356f, -0.363f)
                close()
                moveTo(16.644f, 16.183f)
                curveToRelative(-1.38f, 0.0f, -2.5f, 1.14f, -2.5f, 2.546f)
                curveToRelative(0.0f, 1.405f, 1.12f, 2.546f, 2.5f, 2.546f)
                curveToRelative(1.376f, 0.0f, 2.5f, -1.14f, 2.5f, -2.546f)
                curveToRelative(0.0f, -1.405f, -1.12f, -2.546f, -2.5f, -2.546f)
                close()
                moveTo(2.716f, 18.363f)
                curveToRelative(0.395f, 0.0f, 0.716f, 0.326f, 0.716f, 0.729f)
                curveToRelative(0.0f, 0.402f, -0.32f, 0.729f, -0.716f, 0.729f)
                arcTo(0.723f, 0.723f, 0.0f, false, true, 2.0f, 19.09f)
                curveToRelative(0.0f, -0.402f, 0.32f, -0.728f, 0.716f, -0.728f)
                close()
                moveTo(14.708f, 6.725f)
                lineTo(12.0f, 6.725f)
                lineTo(12.0f, 18.73f)
                horizontalLineToRelative(1.424f)
                curveToRelative(0.0f, -1.808f, 1.44f, -3.275f, 3.216f, -3.275f)
                curveToRelative(1.776f, 0.0f, 3.216f, 1.47f, 3.216f, 3.275f)
                horizontalLineToRelative(1.428f)
                verticalLineToRelative(-5.307f)
                lineToRelative(-6.576f, -6.697f)
                close()
                moveTo(8.784f, 13.275f)
                arcToRelative(0.36f, 0.36f, 0.0f, false, true, 0.356f, 0.362f)
                curveToRelative(0.0f, 0.2f, -0.16f, 0.363f, -0.356f, 0.363f)
                lineTo(2.356f, 14.0f)
                arcTo(0.36f, 0.36f, 0.0f, false, true, 2.0f, 13.637f)
                curveToRelative(0.0f, -0.2f, 0.16f, -0.362f, 0.356f, -0.362f)
                close()
                moveTo(5.572f, 9.637f)
                arcToRelative(0.36f, 0.36f, 0.0f, false, true, 0.356f, 0.363f)
                curveToRelative(0.0f, 0.2f, -0.16f, 0.363f, -0.356f, 0.363f)
                lineTo(2.356f, 10.363f)
                arcTo(0.36f, 0.36f, 0.0f, false, true, 2.0f, 10.0f)
                curveToRelative(0.0f, -0.2f, 0.16f, -0.363f, 0.356f, -0.363f)
                close()
            }
        }
        .build()
        return _truckLight!!
    }

private var _truckLight: ImageVector? = null
