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

public val LightGroup.ParkingLight: ImageVector
    get() {
        if (_parkingLight != null) {
            return _parkingLight!!
        }
        _parkingLight = Builder(name = "ParkingLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.037f, 21.238f)
                curveToRelative(0.0f, 0.42f, -0.332f, 0.762f, -0.74f, 0.762f)
                arcToRelative(0.752f, 0.752f, 0.0f, false, true, -0.739f, -0.762f)
                curveToRelative(0.0f, -0.42f, 0.332f, -0.763f, 0.74f, -0.763f)
                curveToRelative(0.407f, 0.0f, 0.74f, 0.342f, 0.74f, 0.763f)
                moveToRelative(-2.59f, 0.0f)
                arcToRelative(0.376f, 0.376f, 0.0f, false, false, -0.369f, -0.382f)
                lineTo(3.854f, 20.856f)
                curveToRelative(-0.612f, 0.0f, -1.11f, -0.513f, -1.11f, -1.143f)
                lineTo(2.744f, 2.91f)
                curveToRelative(0.0f, -0.63f, 0.498f, -1.144f, 1.11f, -1.144f)
                lineTo(20.15f, 1.766f)
                curveToRelative(0.612f, 0.0f, 1.11f, 0.513f, 1.11f, 1.144f)
                verticalLineToRelative(16.802f)
                curveToRelative(0.0f, 0.523f, -0.342f, 0.972f, -0.835f, 1.104f)
                arcToRelative(0.38f, 0.38f, 0.0f, false, false, -0.265f, 0.465f)
                arcToRelative(0.367f, 0.367f, 0.0f, false, false, 0.45f, 0.273f)
                curveToRelative(0.82f, -0.215f, 1.389f, -0.977f, 1.389f, -1.842f)
                lineTo(21.999f, 2.91f)
                curveTo(22.0f, 1.86f, 21.17f, 1.0f, 20.146f, 1.0f)
                lineTo(3.854f, 1.0f)
                curveTo(2.834f, 1.0f, 2.0f, 1.855f, 2.0f, 2.91f)
                verticalLineToRelative(16.803f)
                curveToRelative(0.0f, 1.05f, 0.83f, 1.91f, 1.854f, 1.91f)
                horizontalLineToRelative(12.22f)
                arcToRelative(0.384f, 0.384f, 0.0f, false, false, 0.375f, -0.385f)
                close()
                moveTo(9.41f, 17.42f)
                verticalLineToRelative(-4.966f)
                horizontalLineToRelative(3.333f)
                curveToRelative(2.043f, 0.0f, 3.702f, -1.71f, 3.702f, -3.816f)
                curveToRelative(0.0f, -2.107f, -1.659f, -3.817f, -3.702f, -3.817f)
                lineTo(8.67f, 4.821f)
                lineTo(8.67f, 17.42f)
                curveToRelative(0.0f, 0.21f, 0.166f, 0.381f, 0.37f, 0.381f)
                curveToRelative(0.203f, 0.0f, 0.37f, -0.171f, 0.37f, -0.381f)
                close()
                moveTo(9.41f, 5.583f)
                horizontalLineToRelative(3.333f)
                curveToRelative(1.635f, 0.0f, 2.963f, 1.369f, 2.963f, 3.055f)
                curveToRelative(0.0f, 1.686f, -1.328f, 3.054f, -2.963f, 3.054f)
                lineTo(9.409f, 11.692f)
                lineTo(9.409f, 5.584f)
                close()
            }
        }
        .build()
        return _parkingLight!!
    }

private var _parkingLight: ImageVector? = null
