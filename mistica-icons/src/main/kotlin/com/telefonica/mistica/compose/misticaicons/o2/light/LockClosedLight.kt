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

public val LightGroup.LockClosedLight: ImageVector
    get() {
        if (_lockClosedLight != null) {
            return _lockClosedLight!!
        }
        _lockClosedLight = Builder(name = "LockClosedLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.5f, 2.0f)
                curveToRelative(3.01f, 0.0f, 5.457f, 2.564f, 5.457f, 5.712f)
                verticalLineToRelative(2.144f)
                horizontalLineToRelative(0.34f)
                curveToRelative(0.94f, 0.0f, 1.703f, 0.804f, 1.703f, 1.788f)
                verticalLineToRelative(8.572f)
                curveTo(20.0f, 21.2f, 19.236f, 22.0f, 18.297f, 22.0f)
                lineTo(6.703f, 22.0f)
                curveTo(5.763f, 22.0f, 5.0f, 21.2f, 5.0f, 20.216f)
                verticalLineToRelative(-8.572f)
                curveToRelative(0.0f, -0.984f, 0.764f, -1.784f, 1.703f, -1.784f)
                horizontalLineToRelative(0.34f)
                lineTo(7.043f, 7.716f)
                curveTo(7.043f, 4.564f, 9.491f, 2.0f, 12.5f, 2.0f)
                close()
                moveTo(18.297f, 10.572f)
                lineTo(6.703f, 10.572f)
                curveToRelative(-0.565f, 0.0f, -1.023f, 0.48f, -1.023f, 1.072f)
                verticalLineToRelative(8.572f)
                curveToRelative(0.0f, 0.592f, 0.458f, 1.072f, 1.023f, 1.072f)
                horizontalLineToRelative(11.594f)
                curveToRelative(0.565f, 0.0f, 1.023f, -0.48f, 1.023f, -1.072f)
                verticalLineToRelative(-8.572f)
                curveToRelative(0.0f, -0.592f, -0.458f, -1.072f, -1.023f, -1.072f)
                close()
                moveTo(14.307f, 14.604f)
                curveToRelative(0.13f, -0.14f, 0.354f, -0.14f, 0.488f, 0.0f)
                arcToRelative(0.367f, 0.367f, 0.0f, false, true, 0.0f, 0.504f)
                lineToRelative(-3.31f, 3.468f)
                lineToRelative(-1.948f, -2.04f)
                arcToRelative(0.367f, 0.367f, 0.0f, false, true, 0.0f, -0.504f)
                arcToRelative(0.328f, 0.328f, 0.0f, false, true, 0.48f, 0.0f)
                lineToRelative(1.463f, 1.532f)
                close()
                moveTo(15.91f, 12.712f)
                curveToRelative(0.378f, 0.0f, 0.684f, 0.32f, 0.684f, 0.716f)
                curveToRelative(0.0f, 0.395f, -0.306f, 0.716f, -0.684f, 0.716f)
                curveToRelative(-0.377f, 0.0f, -0.683f, -0.32f, -0.683f, -0.716f)
                curveToRelative(0.0f, -0.395f, 0.306f, -0.716f, 0.683f, -0.716f)
                close()
                moveTo(12.5f, 2.716f)
                curveToRelative(-2.631f, 0.0f, -4.773f, 2.244f, -4.773f, 5.0f)
                lineTo(7.727f, 9.86f)
                horizontalLineToRelative(9.546f)
                lineTo(17.273f, 7.716f)
                curveToRelative(0.0f, -2.756f, -2.142f, -5.0f, -4.773f, -5.0f)
                close()
            }
        }
        .build()
        return _lockClosedLight!!
    }

private var _lockClosedLight: ImageVector? = null
