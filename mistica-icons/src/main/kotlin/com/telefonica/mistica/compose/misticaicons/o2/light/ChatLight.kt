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

public val LightGroup.ChatLight: ImageVector
    get() {
        if (_chatLight != null) {
            return _chatLight!!
        }
        _chatLight = Builder(name = "ChatLight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 8.626f)
                arcToRelative(0.739f, 0.739f, 0.0f, false, true, -0.726f, 0.748f)
                arcToRelative(0.739f, 0.739f, 0.0f, false, true, -0.726f, -0.748f)
                curveToRelative(0.0f, -0.413f, 0.326f, -0.75f, 0.726f, -0.75f)
                curveToRelative(0.4f, 0.0f, 0.726f, 0.337f, 0.726f, 0.75f)
                close()
                moveTo(21.27f, 10.502f)
                arcToRelative(0.37f, 0.37f, 0.0f, false, false, -0.364f, 0.375f)
                curveToRelative(0.0f, 1.45f, -1.14f, 2.625f, -2.546f, 2.625f)
                arcToRelative(0.37f, 0.37f, 0.0f, false, false, -0.363f, 0.375f)
                verticalLineToRelative(1.718f)
                lineToRelative(-1.922f, -1.982f)
                arcToRelative(0.363f, 0.363f, 0.0f, false, false, -0.26f, -0.11f)
                horizontalLineToRelative(-3.999f)
                curveToRelative(-1.405f, 0.0f, -2.546f, -1.177f, -2.546f, -2.626f)
                lineTo(9.27f, 6.374f)
                curveToRelative(0.0f, -1.45f, 1.14f, -2.625f, 2.546f, -2.625f)
                horizontalLineToRelative(6.544f)
                curveToRelative(1.406f, 0.0f, 2.546f, 1.176f, 2.546f, 2.625f)
                arcToRelative(0.37f, 0.37f, 0.0f, false, false, 0.363f, 0.375f)
                arcToRelative(0.37f, 0.37f, 0.0f, false, false, 0.363f, -0.375f)
                curveTo(21.632f, 4.512f, 20.166f, 3.0f, 18.36f, 3.0f)
                horizontalLineToRelative(-6.544f)
                curveTo(10.01f, 3.0f, 8.544f, 4.512f, 8.544f, 6.374f)
                verticalLineToRelative(0.75f)
                lineTo(5.272f, 7.124f)
                curveTo(3.466f, 7.123f, 2.0f, 8.634f, 2.0f, 10.497f)
                lineTo(2.0f, 15.0f)
                curveToRelative(0.0f, 1.733f, 1.275f, 3.163f, 2.909f, 3.355f)
                verticalLineToRelative(2.27f)
                arcToRelative(0.364f, 0.364f, 0.0f, false, false, 0.363f, 0.374f)
                arcToRelative(0.358f, 0.358f, 0.0f, false, false, 0.256f, -0.11f)
                lineToRelative(2.439f, -2.515f)
                horizontalLineToRelative(3.85f)
                curveToRelative(1.358f, 0.0f, 2.587f, -0.878f, 3.062f, -2.188f)
                arcToRelative(0.382f, 0.382f, 0.0f, false, false, -0.214f, -0.485f)
                arcToRelative(0.364f, 0.364f, 0.0f, false, false, -0.47f, 0.22f)
                curveToRelative(-0.373f, 1.018f, -1.327f, 1.705f, -2.384f, 1.705f)
                lineTo(7.813f, 17.626f)
                arcToRelative(0.344f, 0.344f, 0.0f, false, false, -0.256f, 0.11f)
                lineToRelative(-1.922f, 1.982f)
                lineTo(5.635f, 18.0f)
                arcToRelative(0.37f, 0.37f, 0.0f, false, false, -0.363f, -0.374f)
                curveToRelative(-1.406f, 0.0f, -2.546f, -1.176f, -2.546f, -2.626f)
                verticalLineToRelative(-4.502f)
                curveToRelative(0.0f, -1.45f, 1.14f, -2.626f, 2.546f, -2.626f)
                horizontalLineToRelative(3.272f)
                verticalLineToRelative(3.0f)
                curveToRelative(0.0f, 1.862f, 1.466f, 3.374f, 3.272f, 3.374f)
                horizontalLineToRelative(3.85f)
                lineToRelative(2.438f, 2.516f)
                arcToRelative(0.358f, 0.358f, 0.0f, false, false, 0.396f, 0.081f)
                arcToRelative(0.377f, 0.377f, 0.0f, false, false, 0.223f, -0.345f)
                verticalLineToRelative(-2.27f)
                curveToRelative(1.634f, -0.188f, 2.91f, -1.618f, 2.91f, -3.356f)
                arcToRelative(0.365f, 0.365f, 0.0f, false, false, -0.364f, -0.37f)
                close()
            }
        }
        .build()
        return _chatLight!!
    }

private var _chatLight: ImageVector? = null
