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

public val LightGroup.DisableLight: ImageVector
    get() {
        if (_disableLight != null) {
            return _disableLight!!
        }
        _disableLight = Builder(name = "DisableLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.997f, 23.0f)
                curveToRelative(-3.405f, 0.0f, -6.02f, -0.817f, -7.848f, -2.422f)
                lineTo(20.58f, 4.15f)
                curveToRelative(1.604f, 1.83f, 2.42f, 4.443f, 2.42f, 7.854f)
                curveTo(23.0f, 19.301f, 19.298f, 23.0f, 11.997f, 23.0f)
                moveToRelative(0.0f, -21.998f)
                curveToRelative(3.425f, 0.0f, 6.047f, 0.823f, 7.874f, 2.441f)
                lineTo(3.442f, 19.872f)
                curveTo(1.824f, 18.043f, 1.001f, 15.421f, 1.001f, 12.0f)
                curveTo(1.0f, 4.702f, 4.699f, 1.0f, 11.997f, 1.0f)
                moveToRelative(0.0f, -1.0f)
                curveTo(4.415f, 0.0f, 0.0f, 3.828f, 0.0f, 12.003f)
                curveTo(0.0f, 20.18f, 4.415f, 24.0f, 11.997f, 24.0f)
                curveTo(19.577f, 24.0f, 24.0f, 20.179f, 24.0f, 12.003f)
                curveTo(24.0f, 3.828f, 19.578f, 0.0f, 11.997f, 0.0f)
            }
        }
        .build()
        return _disableLight!!
    }

private var _disableLight: ImageVector? = null
