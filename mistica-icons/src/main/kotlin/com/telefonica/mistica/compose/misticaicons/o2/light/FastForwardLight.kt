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

public val LightGroup.FastForwardLight: ImageVector
    get() {
        if (_fastForwardLight != null) {
            return _fastForwardLight!!
        }
        _fastForwardLight = Builder(name = "FastForwardLight", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(6.488f, 22.0f, 2.0f, 17.516f, 2.0f, 12.0f)
                reflectiveCurveTo(6.488f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.488f, 10.0f, 10.0f)
                arcToRelative(9.98f, 9.98f, 0.0f, false, true, -1.54f, 5.33f)
                arcToRelative(0.36f, 0.36f, 0.0f, false, true, -0.494f, 0.109f)
                arcToRelative(0.36f, 0.36f, 0.0f, false, true, -0.11f, -0.494f)
                arcToRelative(9.247f, 9.247f, 0.0f, false, false, 1.431f, -4.95f)
                curveTo(21.282f, 6.881f, 17.119f, 2.718f, 12.0f, 2.718f)
                curveTo(6.881f, 2.718f, 2.718f, 6.88f, 2.718f, 12.0f)
                reflectiveCurveTo(6.88f, 21.282f, 12.0f, 21.282f)
                arcToRelative(9.247f, 9.247f, 0.0f, false, false, 4.95f, -1.43f)
                arcToRelative(0.36f, 0.36f, 0.0f, false, true, 0.493f, 0.11f)
                arcToRelative(0.36f, 0.36f, 0.0f, false, true, -0.11f, 0.493f)
                arcTo(9.971f, 9.971f, 0.0f, false, true, 12.0f, 22.0f)
                close()
                moveTo(19.5f, 18.782f)
                arcToRelative(0.714f, 0.714f, 0.0f, false, false, -1.426f, 0.0f)
                arcToRelative(0.714f, 0.714f, 0.0f, false, false, 1.426f, 0.0f)
                close()
                moveTo(7.612f, 16.895f)
                lineToRelative(4.644f, -4.644f)
                arcToRelative(0.35f, 0.35f, 0.0f, false, false, 0.0f, -0.502f)
                lineTo(7.612f, 7.105f)
                arcToRelative(0.35f, 0.35f, 0.0f, false, false, -0.502f, 0.0f)
                arcToRelative(0.354f, 0.354f, 0.0f, false, false, 0.0f, 0.503f)
                lineToRelative(4.387f, 4.387f)
                lineToRelative(-4.387f, 4.388f)
                arcToRelative(0.35f, 0.35f, 0.0f, false, false, 0.0f, 0.503f)
                curveToRelative(0.068f, 0.068f, 0.16f, 0.105f, 0.251f, 0.105f)
                arcToRelative(0.355f, 0.355f, 0.0f, false, false, 0.251f, -0.096f)
                close()
                moveTo(13.682f, 16.895f)
                lineTo(18.325f, 12.251f)
                arcToRelative(0.35f, 0.35f, 0.0f, false, false, 0.0f, -0.502f)
                lineToRelative(-4.643f, -4.644f)
                arcToRelative(0.35f, 0.35f, 0.0f, false, false, -0.503f, 0.0f)
                arcToRelative(0.354f, 0.354f, 0.0f, false, false, 0.0f, 0.503f)
                lineToRelative(4.388f, 4.387f)
                lineToRelative(-4.388f, 4.388f)
                arcToRelative(0.35f, 0.35f, 0.0f, false, false, 0.0f, 0.503f)
                curveToRelative(0.069f, 0.068f, 0.16f, 0.105f, 0.252f, 0.105f)
                arcToRelative(0.355f, 0.355f, 0.0f, false, false, 0.25f, -0.096f)
                close()
            }
        }
        .build()
        return _fastForwardLight!!
    }

private var _fastForwardLight: ImageVector? = null
