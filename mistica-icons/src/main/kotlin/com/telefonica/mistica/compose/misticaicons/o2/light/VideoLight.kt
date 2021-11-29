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

public val LightGroup.VideoLight: ImageVector
    get() {
        if (_videoLight != null) {
            return _videoLight!!
        }
        _videoLight = Builder(name = "VideoLight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(8.965f, 17.484f)
                lineToRelative(8.926f, -5.178f)
                arcToRelative(0.36f, 0.36f, 0.0f, false, false, 0.0f, -0.621f)
                lineToRelative(-8.926f, -5.17f)
                arcToRelative(0.355f, 0.355f, 0.0f, false, false, -0.534f, 0.311f)
                verticalLineToRelative(10.357f)
                arcToRelative(0.36f, 0.36f, 0.0f, false, false, 0.178f, 0.31f)
                arcToRelative(0.357f, 0.357f, 0.0f, false, false, 0.178f, 0.046f)
                arcToRelative(0.426f, 0.426f, 0.0f, false, false, 0.178f, -0.055f)
                close()
                moveTo(17.0f, 12.0f)
                lineToRelative(-7.856f, 4.557f)
                lineTo(9.144f, 7.443f)
                lineTo(17.0f, 12.0f)
                close()
            }
        }
        .build()
        return _videoLight!!
    }

private var _videoLight: ImageVector? = null
