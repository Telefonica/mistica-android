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

public val LightGroup.WaterDropLight: ImageVector
    get() {
        if (_waterDropLight != null) {
            return _waterDropLight!!
        }
        _waterDropLight = Builder(name = "WaterDropLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.992f, 21.022f)
                horizontalLineToRelative(-0.034f)
                curveToRelative(-1.947f, 0.0f, -3.473f, -0.538f, -4.53f, -1.594f)
                curveToRelative(-1.064f, -1.064f, -1.604f, -2.608f, -1.613f, -4.585f)
                curveToRelative(-0.011f, -3.796f, 4.586f, -9.93f, 6.132f, -11.676f)
                curveToRelative(1.552f, 1.748f, 6.174f, 7.886f, 6.185f, 11.64f)
                curveToRelative(0.008f, 3.994f, -2.171f, 6.204f, -6.14f, 6.215f)
                moveToRelative(0.243f, -18.745f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, false, -0.288f, -0.12f)
                arcToRelative(0.42f, 0.42f, 0.0f, false, false, -0.289f, 0.12f)
                curveTo(10.3f, 3.644f, 4.986f, 10.52f, 5.0f, 14.845f)
                curveToRelative(0.006f, 2.171f, 0.647f, 3.958f, 1.852f, 5.166f)
                curveToRelative(1.198f, 1.198f, 2.963f, 1.834f, 5.106f, 1.834f)
                horizontalLineToRelative(0.034f)
                curveToRelative(4.364f, -0.014f, 6.963f, -2.644f, 6.95f, -7.042f)
                curveToRelative(-0.01f, -4.277f, -5.345f, -11.154f, -6.707f, -12.526f)
            }
        }
        .build()
        return _waterDropLight!!
    }

private var _waterDropLight: ImageVector? = null
