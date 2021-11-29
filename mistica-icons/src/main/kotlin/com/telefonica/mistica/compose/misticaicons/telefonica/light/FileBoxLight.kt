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

public val LightGroup.FileBoxLight: ImageVector
    get() {
        if (_fileBoxLight != null) {
            return _fileBoxLight!!
        }
        _fileBoxLight = Builder(name = "FileBoxLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.016f, 20.585f)
                curveToRelative(0.0f, 0.24f, -0.193f, 0.437f, -0.434f, 0.437f)
                lineTo(3.406f, 21.022f)
                arcToRelative(0.44f, 0.44f, 0.0f, false, true, -0.435f, -0.437f)
                verticalLineToRelative(-7.3f)
                curveToRelative(0.0f, -0.232f, 0.2f, -0.428f, 0.435f, -0.428f)
                horizontalLineToRelative(5.91f)
                verticalLineToRelative(0.476f)
                arcToRelative(2.582f, 2.582f, 0.0f, false, false, 2.58f, 2.58f)
                horizontalLineToRelative(0.196f)
                arcToRelative(2.585f, 2.585f, 0.0f, false, false, 2.582f, -2.58f)
                verticalLineToRelative(-0.476f)
                horizontalLineToRelative(5.91f)
                curveToRelative(0.205f, 0.0f, 0.379f, 0.14f, 0.421f, 0.324f)
                lineToRelative(0.006f, 0.034f)
                curveToRelative(0.002f, 0.022f, 0.008f, 0.045f, 0.008f, 0.07f)
                verticalLineToRelative(7.3f)
                horizontalLineToRelative(-0.003f)
                close()
                moveTo(4.613f, 3.41f)
                curveToRelative(0.0f, -0.238f, 0.193f, -0.434f, 0.431f, -0.434f)
                lineToRelative(13.9f, 0.017f)
                curveToRelative(0.251f, 0.0f, 0.473f, 0.224f, 0.526f, 0.532f)
                lineToRelative(1.356f, 8.552f)
                curveToRelative(-0.082f, -0.017f, -0.16f, -0.042f, -0.247f, -0.042f)
                horizontalLineToRelative(-6.316f)
                arcToRelative(0.408f, 0.408f, 0.0f, false, false, -0.41f, 0.412f)
                verticalLineToRelative(0.888f)
                curveToRelative(0.0f, 0.969f, -0.79f, 1.759f, -1.761f, 1.759f)
                horizontalLineToRelative(-0.196f)
                curveToRelative(-0.972f, 0.0f, -1.762f, -0.79f, -1.762f, -1.76f)
                verticalLineToRelative(-0.887f)
                arcToRelative(0.412f, 0.412f, 0.0f, false, false, -0.41f, -0.412f)
                lineTo(3.407f, 12.035f)
                curveToRelative(-0.084f, 0.0f, -0.163f, 0.008f, -0.241f, 0.025f)
                lineToRelative(1.448f, -8.65f)
                close()
                moveTo(21.829f, 13.208f)
                curveToRelative(0.0f, -0.016f, 0.005f, -0.03f, 0.002f, -0.047f)
                lineToRelative(-0.016f, -0.115f)
                verticalLineToRelative(-0.011f)
                lineToRelative(-1.53f, -9.647f)
                curveToRelative(-0.132f, -0.717f, -0.68f, -1.216f, -1.336f, -1.216f)
                lineToRelative(-13.9f, -0.017f)
                curveToRelative(-0.688f, 0.0f, -1.251f, 0.563f, -1.246f, 1.188f)
                lineToRelative(-1.638f, 9.748f)
                curveToRelative(-0.006f, 0.025f, 0.002f, 0.05f, 0.002f, 0.075f)
                curveToRelative(-0.002f, 0.04f, -0.01f, 0.079f, -0.01f, 0.118f)
                verticalLineToRelative(7.3f)
                curveToRelative(0.0f, 0.694f, 0.562f, 1.258f, 1.254f, 1.258f)
                horizontalLineToRelative(17.18f)
                curveToRelative(0.688f, 0.0f, 1.252f, -0.564f, 1.252f, -1.258f)
                verticalLineToRelative(-7.3f)
                arcToRelative(0.604f, 0.604f, 0.0f, false, true, -0.014f, -0.076f)
                close()
            }
        }
        .build()
        return _fileBoxLight!!
    }

private var _fileBoxLight: ImageVector? = null
