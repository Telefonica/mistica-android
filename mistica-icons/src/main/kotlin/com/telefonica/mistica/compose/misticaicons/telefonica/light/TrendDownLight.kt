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

public val LightGroup.TrendDownLight: ImageVector
    get() {
        if (_trendDownLight != null) {
            return _trendDownLight!!
        }
        _trendDownLight = Builder(name = "TrendDownLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.842f, 14.853f)
                verticalLineToRelative(3.68f)
                curveToRelative(0.0f, 0.23f, -0.188f, 0.415f, -0.415f, 0.412f)
                horizontalLineToRelative(-3.73f)
                arcToRelative(0.414f, 0.414f, 0.0f, false, true, -0.424f, -0.406f)
                verticalLineToRelative(-0.006f)
                curveToRelative(0.0f, -0.23f, 0.185f, -0.411f, 0.423f, -0.411f)
                horizontalLineToRelative(2.81f)
                lineTo(14.53f, 9.836f)
                lineTo(6.968f, 13.07f)
                arcToRelative(0.429f, 0.429f, 0.0f, false, true, -0.532f, -0.174f)
                lineTo(2.212f, 5.623f)
                arcToRelative(0.414f, 0.414f, 0.0f, false, true, 0.154f, -0.566f)
                curveToRelative(0.002f, -0.003f, 0.005f, -0.003f, 0.008f, -0.005f)
                arcToRelative(0.436f, 0.436f, 0.0f, false, true, 0.577f, 0.156f)
                lineToRelative(4.036f, 6.956f)
                lineToRelative(7.521f, -3.219f)
                arcToRelative(0.416f, 0.416f, 0.0f, false, true, 0.516f, 0.14f)
                lineToRelative(5.972f, 8.275f)
                verticalLineToRelative(-2.51f)
                curveToRelative(0.0f, -0.23f, 0.185f, -0.412f, 0.423f, -0.412f)
                arcToRelative(0.417f, 0.417f, 0.0f, false, true, 0.423f, 0.415f)
            }
        }
        .build()
        return _trendDownLight!!
    }

private var _trendDownLight: ImageVector? = null
