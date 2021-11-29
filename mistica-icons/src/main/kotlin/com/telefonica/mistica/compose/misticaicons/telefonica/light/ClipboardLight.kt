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

public val LightGroup.ClipboardLight: ImageVector
    get() {
        if (_clipboardLight != null) {
            return _clipboardLight!!
        }
        _clipboardLight = Builder(name = "ClipboardLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.56f, 20.715f)
                lineTo(18.56f, 4.75f)
                curveToRelative(0.0f, -0.081f, -0.264f, -0.33f, -0.63f, -0.33f)
                horizontalLineToRelative(-2.945f)
                curveToRelative(0.012f, 0.098f, 0.028f, 0.193f, 0.031f, 0.294f)
                lineToRelative(0.006f, 0.19f)
                lineToRelative(-0.003f, 0.093f)
                curveToRelative(-0.045f, 1.302f, -1.244f, 1.574f, -3.03f, 1.574f)
                curveToRelative(-1.785f, 0.0f, -2.984f, -0.272f, -3.032f, -1.591f)
                verticalLineToRelative(-0.194f)
                lineToRelative(0.006f, -0.092f)
                curveToRelative(0.003f, -0.098f, 0.022f, -0.182f, 0.036f, -0.274f)
                lineTo(6.05f, 4.42f)
                curveToRelative(-0.369f, 0.0f, -0.63f, 0.252f, -0.63f, 0.33f)
                verticalLineToRelative(15.964f)
                curveToRelative(0.0f, 0.112f, 0.275f, 0.33f, 0.63f, 0.33f)
                horizontalLineToRelative(11.878f)
                curveToRelative(0.358f, 0.0f, 0.633f, -0.221f, 0.633f, -0.33f)
                close()
                moveTo(11.988f, 2.96f)
                curveToRelative(-1.454f, 0.0f, -2.157f, 0.569f, -2.213f, 1.79f)
                lineToRelative(-0.005f, 0.154f)
                curveToRelative(0.014f, 0.392f, 0.03f, 0.863f, 2.221f, 0.863f)
                curveToRelative(2.19f, 0.0f, 2.207f, -0.474f, 2.218f, -0.818f)
                verticalLineToRelative(-0.132f)
                arcToRelative(2.663f, 2.663f, 0.0f, false, false, -0.109f, -0.694f)
                curveToRelative(-0.252f, -0.782f, -0.941f, -1.163f, -2.112f, -1.163f)
                close()
                moveTo(17.927f, 3.618f)
                curveToRelative(0.756f, 0.0f, 1.445f, 0.541f, 1.445f, 1.132f)
                verticalLineToRelative(15.964f)
                curveToRelative(0.0f, 0.613f, -0.661f, 1.131f, -1.443f, 1.131f)
                lineTo(6.053f, 21.845f)
                curveToRelative(-0.782f, 0.0f, -1.443f, -0.518f, -1.443f, -1.131f)
                lineTo(4.61f, 4.75f)
                curveToRelative(0.0f, -0.591f, 0.69f, -1.132f, 1.443f, -1.132f)
                horizontalLineToRelative(3.15f)
                curveToRelative(0.418f, -0.946f, 1.376f, -1.459f, 2.785f, -1.459f)
                curveToRelative(1.717f, 0.0f, 2.462f, 0.74f, 2.782f, 1.46f)
                horizontalLineToRelative(3.157f)
                close()
                moveTo(11.087f, 5.092f)
                arcToRelative(0.405f, 0.405f, 0.0f, false, true, -0.407f, -0.4f)
                curveToRelative(0.0f, -0.222f, 0.182f, -0.401f, 0.406f, -0.401f)
                horizontalLineToRelative(1.801f)
                curveToRelative(0.224f, 0.0f, 0.406f, 0.179f, 0.406f, 0.4f)
                curveToRelative(0.0f, 0.222f, -0.182f, 0.4f, -0.406f, 0.4f)
                horizontalLineToRelative(-1.8f)
                close()
            }
        }
        .build()
        return _clipboardLight!!
    }

private var _clipboardLight: ImageVector? = null
