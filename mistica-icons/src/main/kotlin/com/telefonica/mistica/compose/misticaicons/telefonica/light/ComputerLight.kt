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

public val LightGroup.ComputerLight: ImageVector
    get() {
        if (_computerLight != null) {
            return _computerLight!!
        }
        _computerLight = Builder(name = "ComputerLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.319f, 17.452f)
                curveToRelative(-1.042f, 0.0f, -1.84f, -0.283f, -2.381f, -0.84f)
                curveToRelative(-0.518f, -0.538f, -0.782f, -1.32f, -0.782f, -2.32f)
                verticalLineTo(8.015f)
                curveToRelative(0.0f, -1.0f, 0.264f, -1.776f, 0.782f, -2.305f)
                curveToRelative(0.535f, -0.55f, 1.336f, -0.827f, 2.378f, -0.827f)
                lineToRelative(13.356f, -0.008f)
                curveToRelative(1.042f, 0.0f, 1.843f, 0.277f, 2.378f, 0.826f)
                curveToRelative(0.518f, 0.533f, 0.781f, 1.308f, 0.781f, 2.306f)
                verticalLineToRelative(6.277f)
                curveToRelative(0.0f, 1.0f, -0.263f, 1.781f, -0.781f, 2.32f)
                curveToRelative(-0.538f, 0.557f, -1.34f, 0.84f, -2.381f, 0.84f)
                lineToRelative(-13.35f, 0.008f)
                close()
                moveTo(18.674f, 5.435f)
                lineTo(5.32f, 5.444f)
                curveToRelative(-1.751f, 0.0f, -2.603f, 0.84f, -2.603f, 2.571f)
                verticalLineToRelative(6.277f)
                curveToRelative(0.0f, 0.852f, 0.21f, 1.499f, 0.625f, 1.93f)
                curveToRelative(0.429f, 0.446f, 1.093f, 0.67f, 1.978f, 0.67f)
                lineToRelative(13.355f, -0.009f)
                curveToRelative(0.883f, 0.0f, 1.55f, -0.224f, 1.978f, -0.67f)
                curveToRelative(0.415f, -0.428f, 0.625f, -1.077f, 0.625f, -1.929f)
                verticalLineTo(8.007f)
                curveToRelative(-0.003f, -1.731f, -0.855f, -2.572f, -2.603f, -2.572f)
                close()
                moveTo(2.436f, 19.1f)
                arcToRelative(0.28f, 0.28f, 0.0f, false, true, -0.28f, -0.28f)
                arcToRelative(0.28f, 0.28f, 0.0f, false, true, 0.28f, -0.28f)
                lineToRelative(19.118f, -0.009f)
                arcToRelative(0.28f, 0.28f, 0.0f, false, true, 0.28f, 0.28f)
                arcToRelative(0.28f, 0.28f, 0.0f, false, true, -0.28f, 0.28f)
                lineToRelative(-19.118f, 0.01f)
                close()
            }
        }
        .build()
        return _computerLight!!
    }

private var _computerLight: ImageVector? = null
