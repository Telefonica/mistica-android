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

public val LightGroup.OpenFileLight: ImageVector
    get() {
        if (_openFileLight != null) {
            return _openFileLight!!
        }
        _openFileLight = Builder(name = "OpenFileLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5f, 18.247f)
                curveToRelative(0.0f, 0.182f, -0.148f, 0.33f, -0.33f, 0.33f)
                lineTo(4.095f, 18.577f)
                curveToRelative(-0.182f, 0.0f, -0.33f, -0.148f, -0.337f, -0.257f)
                lineToRelative(1.547f, -8.826f)
                arcToRelative(0.33f, 0.33f, 0.0f, false, true, 0.33f, -0.33f)
                horizontalLineToRelative(15.053f)
                arcToRelative(0.33f, 0.33f, 0.0f, false, true, 0.328f, 0.299f)
                lineToRelative(-1.515f, 8.784f)
                close()
                moveTo(2.98f, 5.85f)
                curveToRelative(0.0f, -0.194f, 0.18f, -0.353f, 0.403f, -0.353f)
                horizontalLineToRelative(6.255f)
                curveToRelative(0.221f, 0.0f, 0.4f, 0.156f, 0.4f, 0.353f)
                verticalLineToRelative(1.056f)
                curveToRelative(0.0f, 0.232f, 0.185f, 0.42f, 0.412f, 0.42f)
                horizontalLineToRelative(7.883f)
                curveToRelative(0.221f, 0.0f, 0.4f, 0.16f, 0.403f, 0.383f)
                lineToRelative(0.048f, 0.614f)
                lineTo(5.635f, 8.323f)
                curveToRelative(-0.636f, 0.0f, -1.154f, 0.527f, -1.148f, 1.098f)
                lineTo(3.55f, 14.76f)
                lineTo(2.98f, 5.85f)
                close()
                moveTo(20.686f, 8.323f)
                horizontalLineToRelative(-1.079f)
                lineToRelative(-0.05f, -0.644f)
                curveToRelative(0.0f, -0.659f, -0.552f, -1.194f, -1.227f, -1.194f)
                horizontalLineToRelative(-7.465f)
                lineTo(10.865f, 5.85f)
                curveToRelative(0.0f, -0.659f, -0.552f, -1.194f, -1.227f, -1.194f)
                lineTo(3.383f, 4.656f)
                curveToRelative(-0.678f, 0.0f, -1.227f, 0.535f, -1.227f, 1.222f)
                lineToRelative(0.787f, 12.344f)
                lineToRelative(-0.005f, 0.025f)
                curveToRelative(0.0f, 0.647f, 0.518f, 1.174f, 1.157f, 1.174f)
                lineTo(19.17f, 19.421f)
                curveToRelative(0.636f, 0.0f, 1.154f, -0.527f, 1.149f, -1.1f)
                lineToRelative(1.518f, -8.754f)
                arcToRelative(0.591f, 0.591f, 0.0f, false, false, 0.006f, -0.073f)
                curveToRelative(0.0f, -0.644f, -0.519f, -1.171f, -1.157f, -1.171f)
                close()
            }
        }
        .build()
        return _openFileLight!!
    }

private var _openFileLight: ImageVector? = null
