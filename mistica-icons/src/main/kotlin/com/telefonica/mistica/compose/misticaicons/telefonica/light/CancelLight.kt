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

public val LightGroup.CancelLight: ImageVector
    get() {
        if (_cancelLight != null) {
            return _cancelLight!!
        }
        _cancelLight = Builder(name = "CancelLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.846f, 7.15f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.0f, 0.708f)
                lineTo(12.7f, 12.003f)
                lineToRelative(4.146f, 4.15f)
                arcToRelative(0.498f, 0.498f, 0.0f, false, true, -0.014f, 0.706f)
                arcToRelative(0.497f, 0.497f, 0.0f, false, true, -0.693f, 0.0f)
                lineToRelative(-4.146f, -4.149f)
                lineToRelative(-4.135f, 4.136f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.707f, -0.707f)
                lineToRelative(4.135f, -4.136f)
                lineToRelative(-4.135f, -4.132f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.707f, -0.707f)
                lineToRelative(4.135f, 4.136f)
                lineToRelative(4.15f, -4.15f)
                arcToRelative(0.497f, 0.497f, 0.0f, false, true, 0.703f, 0.0f)
                close()
                moveTo(11.996f, 23.0f)
                curveTo(19.299f, 23.0f, 23.0f, 19.3f, 23.0f, 12.002f)
                curveToRelative(0.0f, -7.3f, -3.701f, -11.002f, -11.002f, -11.002f)
                curveTo(4.699f, 1.0f, 1.0f, 4.702f, 1.0f, 12.003f)
                curveTo(1.0f, 19.301f, 4.699f, 23.0f, 11.997f, 23.0f)
                close()
                moveTo(11.996f, 0.0f)
                curveTo(19.579f, 0.0f, 24.0f, 3.828f, 24.0f, 12.003f)
                curveTo(24.0f, 20.18f, 19.578f, 24.0f, 11.997f, 24.0f)
                curveTo(4.415f, 24.0f, 0.0f, 20.179f, 0.0f, 12.003f)
                curveTo(0.0f, 3.828f, 4.415f, 0.0f, 11.997f, 0.0f)
                close()
            }
        }
        .build()
        return _cancelLight!!
    }

private var _cancelLight: ImageVector? = null
