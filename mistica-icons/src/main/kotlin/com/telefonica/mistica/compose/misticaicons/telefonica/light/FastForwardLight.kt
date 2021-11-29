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

public val LightGroup.FastForwardLight: ImageVector
    get() {
        if (_fastForwardLight != null) {
            return _fastForwardLight!!
        }
        _fastForwardLight = Builder(name = "FastForwardLight", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.002f, 21.019f)
                curveToRelative(-5.986f, 0.0f, -9.022f, -3.034f, -9.022f, -9.017f)
                curveToRelative(0.0f, -5.989f, 3.033f, -9.022f, 9.022f, -9.022f)
                curveToRelative(5.983f, 0.0f, 9.017f, 3.033f, 9.017f, 9.022f)
                curveToRelative(0.0f, 5.983f, -3.034f, 9.017f, -9.017f, 9.017f)
                close()
                moveTo(12.002f, 2.156f)
                curveToRelative(-6.44f, 0.0f, -9.846f, 3.404f, -9.846f, 9.846f)
                curveToRelative(0.0f, 6.437f, 3.404f, 9.84f, 9.846f, 9.84f)
                curveToRelative(6.437f, 0.0f, 9.84f, -3.403f, 9.84f, -9.84f)
                curveToRelative(0.0f, -6.442f, -3.403f, -9.846f, -9.84f, -9.846f)
                close()
                moveTo(13.412f, 13.986f)
                lineTo(13.412f, 9.391f)
                lineToRelative(3.84f, 2.308f)
                lineToRelative(-3.84f, 2.285f)
                close()
                moveTo(12.795f, 8.305f)
                arcToRelative(0.405f, 0.405f, 0.0f, false, false, -0.207f, 0.358f)
                verticalLineToRelative(6.048f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, false, 0.409f, 0.412f)
                horizontalLineToRelative(0.002f)
                curveToRelative(0.073f, 0.0f, 0.146f, -0.02f, 0.21f, -0.056f)
                lineToRelative(5.056f, -3.012f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, false, 0.0f, -0.705f)
                lineToRelative(-5.053f, -3.04f)
                arcToRelative(0.419f, 0.419f, 0.0f, false, false, -0.417f, -0.005f)
                close()
                moveTo(7.364f, 13.99f)
                lineTo(7.364f, 9.397f)
                lineToRelative(3.84f, 2.308f)
                lineToRelative(-3.84f, 2.286f)
                close()
                moveTo(6.75f, 8.31f)
                arcToRelative(0.413f, 0.413f, 0.0f, false, false, -0.21f, 0.358f)
                verticalLineToRelative(6.047f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, false, 0.409f, 0.412f)
                horizontalLineToRelative(0.003f)
                curveToRelative(0.073f, 0.0f, 0.145f, -0.02f, 0.21f, -0.056f)
                lineToRelative(5.056f, -3.011f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, false, 0.0f, -0.706f)
                lineToRelative(-5.053f, -3.04f)
                arcToRelative(0.407f, 0.407f, 0.0f, false, false, -0.415f, -0.005f)
                close()
            }
        }
        .build()
        return _fastForwardLight!!
    }

private var _fastForwardLight: ImageVector? = null
