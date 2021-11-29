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

public val LightGroup.ArrowUpLight: ImageVector
    get() {
        if (_arrowUpLight != null) {
            return _arrowUpLight!!
        }
        _arrowUpLight = Builder(name = "ArrowUpLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.0f, 1.0f)
                lineToRelative(9.471f, 9.654f)
                curveToRelative(0.528f, 0.537f, 0.676f, 1.327f, 0.375f, 2.058f)
                curveToRelative(-0.3f, 0.74f, -0.985f, 1.218f, -1.743f, 1.218f)
                lineTo(15.68f, 13.93f)
                lineTo(15.68f, 19.0f)
                arcToRelative(0.371f, 0.371f, 0.0f, false, true, -0.367f, 0.374f)
                arcToRelative(0.371f, 0.371f, 0.0f, false, true, -0.367f, -0.373f)
                verticalLineToRelative(-5.823f)
                horizontalLineToRelative(5.157f)
                curveToRelative(0.56f, 0.0f, 0.919f, -0.39f, 1.059f, -0.748f)
                curveToRelative(0.14f, -0.348f, 0.157f, -0.848f, -0.219f, -1.235f)
                lineTo(12.0f, 2.063f)
                lineTo(3.043f, 11.19f)
                curveToRelative(-0.375f, 0.383f, -0.358f, 0.895f, -0.218f, 1.235f)
                curveToRelative(0.148f, 0.366f, 0.498f, 0.748f, 1.059f, 0.748f)
                lineTo(9.04f, 13.173f)
                verticalLineToRelative(8.456f)
                arcToRelative(0.352f, 0.352f, 0.0f, false, true, -0.354f, 0.37f)
                arcToRelative(0.371f, 0.371f, 0.0f, false, true, -0.367f, -0.374f)
                lineTo(8.319f, 13.93f)
                lineTo(3.896f, 13.93f)
                curveToRelative(-0.758f, 0.0f, -1.442f, -0.475f, -1.743f, -1.218f)
                curveToRelative(-0.301f, -0.731f, -0.148f, -1.512f, 0.375f, -2.058f)
                lineTo(12.0f, 1.0f)
                close()
                moveTo(15.313f, 20.505f)
                arcToRelative(0.74f, 0.74f, 0.0f, false, true, 0.734f, 0.747f)
                arcToRelative(0.74f, 0.74f, 0.0f, false, true, -0.734f, 0.748f)
                arcToRelative(0.74f, 0.74f, 0.0f, false, true, -0.733f, -0.748f)
                arcToRelative(0.74f, 0.74f, 0.0f, false, true, 0.733f, -0.747f)
                close()
            }
        }
        .build()
        return _arrowUpLight!!
    }

private var _arrowUpLight: ImageVector? = null
