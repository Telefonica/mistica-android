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

public val LightGroup.ShieldCrossLight: ImageVector
    get() {
        if (_shieldCrossLight != null) {
            return _shieldCrossLight!!
        }
        _shieldCrossLight = Builder(name = "ShieldCrossLight", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.227f, 20.863f)
                curveToRelative(0.0f, 0.391f, -0.306f, 0.71f, -0.68f, 0.71f)
                curveToRelative(-0.376f, 0.0f, -0.681f, -0.319f, -0.681f, -0.71f)
                curveToRelative(0.0f, -0.39f, 0.305f, -0.709f, 0.68f, -0.709f)
                curveToRelative(0.375f, 0.0f, 0.68f, 0.318f, 0.68f, 0.71f)
                close()
                moveTo(20.0f, 5.133f)
                verticalLineToRelative(9.588f)
                curveToRelative(0.0f, 2.169f, -1.078f, 3.978f, -3.229f, 5.374f)
                arcToRelative(0.33f, 0.33f, 0.0f, false, true, -0.467f, -0.114f)
                arcToRelative(0.364f, 0.364f, 0.0f, false, true, 0.11f, -0.49f)
                curveToRelative(1.963f, -1.278f, 2.918f, -2.838f, 2.918f, -4.77f)
                verticalLineToRelative(-3.023f)
                lineTo(12.84f, 11.698f)
                verticalLineToRelative(9.947f)
                arcToRelative(0.348f, 0.348f, 0.0f, false, true, -0.34f, 0.355f)
                curveToRelative(-0.105f, 0.0f, -0.34f, -0.095f, -0.34f, -0.095f)
                curveTo(8.774f, 20.745f, 5.0f, 18.867f, 5.0f, 14.72f)
                lineTo(5.0f, 5.133f)
                horizontalLineToRelative(0.34f)
                curveToRelative(3.9f, 0.0f, 6.916f, -2.897f, 6.946f, -2.924f)
                lineTo(12.5f, 2.0f)
                lineToRelative(0.214f, 0.21f)
                curveToRelative(0.03f, 0.026f, 3.045f, 2.923f, 6.946f, 2.923f)
                lineTo(20.0f, 5.133f)
                close()
                moveTo(12.16f, 11.703f)
                lineTo(5.685f, 11.703f)
                verticalLineToRelative(3.018f)
                curveToRelative(0.0f, 3.61f, 3.368f, 5.347f, 6.475f, 6.433f)
                verticalLineToRelative(-9.452f)
                close()
                moveTo(12.16f, 3.241f)
                curveToRelative(-1.065f, 0.855f, -3.469f, 2.478f, -6.475f, 2.592f)
                verticalLineToRelative(5.155f)
                horizontalLineToRelative(6.475f)
                lineTo(12.16f, 3.241f)
                close()
                moveTo(19.328f, 5.828f)
                curveToRelative(-3.04f, -0.114f, -5.45f, -1.768f, -6.488f, -2.614f)
                verticalLineToRelative(7.779f)
                horizontalLineToRelative(6.484f)
                lineTo(19.324f, 5.828f)
                horizontalLineToRelative(0.004f)
                close()
            }
        }
        .build()
        return _shieldCrossLight!!
    }

private var _shieldCrossLight: ImageVector? = null
