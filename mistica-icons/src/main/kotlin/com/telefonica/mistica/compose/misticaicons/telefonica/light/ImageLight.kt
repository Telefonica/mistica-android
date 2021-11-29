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

public val LightGroup.ImageLight: ImageVector
    get() {
        if (_imageLight != null) {
            return _imageLight!!
        }
        _imageLight = Builder(name = "ImageLight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.016f, 18.04f)
                lineTo(21.016f, 5.728f)
                curveToRelative(0.0f, -0.135f, -0.272f, -0.395f, -0.6f, -0.395f)
                lineTo(3.57f, 5.333f)
                curveToRelative(-0.33f, 0.0f, -0.596f, 0.238f, -0.596f, 0.395f)
                lineTo(2.97f, 18.043f)
                curveToRelative(0.0f, 0.157f, 0.269f, 0.395f, 0.6f, 0.395f)
                horizontalLineToRelative(16.848f)
                curveToRelative(0.325f, -0.002f, 0.597f, -0.263f, 0.597f, -0.397f)
                close()
                moveTo(20.416f, 4.5f)
                curveToRelative(0.745f, 0.0f, 1.42f, 0.583f, 1.42f, 1.224f)
                verticalLineToRelative(12.317f)
                curveToRelative(0.0f, 0.638f, -0.678f, 1.224f, -1.42f, 1.224f)
                lineTo(3.567f, 19.265f)
                curveToRelative(-0.753f, 0.003f, -1.417f, -0.572f, -1.417f, -1.224f)
                lineToRelative(0.003f, -12.317f)
                curveToRelative(0.0f, -0.653f, 0.664f, -1.224f, 1.42f, -1.224f)
                horizontalLineToRelative(16.843f)
                close()
                moveTo(7.05f, 7.62f)
                curveToRelative(-0.678f, 0.0f, -1.23f, 0.558f, -1.23f, 1.241f)
                curveToRelative(0.0f, 0.687f, 0.552f, 1.241f, 1.23f, 1.241f)
                curveToRelative(0.678f, 0.0f, 1.23f, -0.557f, 1.23f, -1.24f)
                curveToRelative(0.0f, -0.684f, -0.552f, -1.242f, -1.23f, -1.242f)
                close()
                moveTo(7.05f, 10.934f)
                curveToRelative(-1.131f, 0.0f, -2.05f, -0.93f, -2.05f, -2.07f)
                curveToRelative(0.0f, -1.14f, 0.919f, -2.07f, 2.05f, -2.07f)
                curveToRelative(1.132f, 0.0f, 2.05f, 0.93f, 2.05f, 2.07f)
                curveToRelative(0.0f, 1.14f, -0.918f, 2.07f, -2.05f, 2.07f)
                close()
                moveTo(16.358f, 10.169f)
                lineTo(19.605f, 12.676f)
                curveToRelative(0.18f, 0.14f, 0.215f, 0.401f, 0.078f, 0.583f)
                arcToRelative(0.407f, 0.407f, 0.0f, false, true, -0.571f, 0.079f)
                lineToRelative(-0.003f, -0.003f)
                lineToRelative(-2.994f, -2.311f)
                lineToRelative(-3.507f, 2.818f)
                lineToRelative(2.142f, 2.039f)
                curveToRelative(0.166f, 0.157f, 0.174f, 0.42f, 0.017f, 0.585f)
                arcToRelative(0.407f, 0.407f, 0.0f, false, true, -0.574f, 0.023f)
                lineToRelative(-0.006f, -0.006f)
                lineToRelative(-3.507f, -3.336f)
                lineToRelative(-5.0f, 4.202f)
                arcToRelative(0.405f, 0.405f, 0.0f, false, true, -0.574f, -0.05f)
                lineToRelative(-0.003f, -0.003f)
                arcToRelative(0.416f, 0.416f, 0.0f, false, true, 0.054f, -0.583f)
                lineToRelative(5.277f, -4.44f)
                arcToRelative(0.407f, 0.407f, 0.0f, false, true, 0.543f, 0.017f)
                lineToRelative(1.026f, 0.975f)
                lineToRelative(3.851f, -3.09f)
                arcToRelative(0.408f, 0.408f, 0.0f, false, true, 0.504f, -0.006f)
                close()
            }
        }
        .build()
        return _imageLight!!
    }

private var _imageLight: ImageVector? = null
