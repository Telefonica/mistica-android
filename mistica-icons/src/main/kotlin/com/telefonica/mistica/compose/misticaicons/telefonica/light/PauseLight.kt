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

public val LightGroup.PauseLight: ImageVector
    get() {
        if (_pauseLight != null) {
            return _pauseLight!!
        }
        _pauseLight = Builder(name = "PauseLight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.998f, 2.16f)
                curveToRelative(3.14f, 0.0f, 5.574f, 0.812f, 7.238f, 2.417f)
                curveTo(20.96f, 6.241f, 21.838f, 8.74f, 21.838f, 12.0f)
                curveToRelative(0.003f, 6.435f, -3.4f, 9.838f, -9.84f, 9.838f)
                curveToRelative(-6.435f, 0.0f, -9.838f, -3.4f, -9.838f, -9.838f)
                curveToRelative(0.0f, -6.437f, 3.4f, -9.84f, 9.838f, -9.84f)
                close()
                moveTo(11.998f, 2.72f)
                curveTo(5.843f, 2.72f, 2.72f, 5.843f, 2.72f, 12.0f)
                curveToRelative(0.0f, 6.154f, 3.12f, 9.278f, 9.278f, 9.278f)
                curveToRelative(6.16f, 0.0f, 9.28f, -3.12f, 9.28f, -9.278f)
                curveToRelative(0.002f, -6.16f, -3.12f, -9.28f, -9.28f, -9.28f)
                close()
                moveTo(8.953f, 7.558f)
                arcToRelative(0.28f, 0.28f, 0.0f, false, true, 0.28f, 0.28f)
                verticalLineToRelative(8.333f)
                arcToRelative(0.28f, 0.28f, 0.0f, false, true, -0.28f, 0.28f)
                arcToRelative(0.28f, 0.28f, 0.0f, false, true, -0.28f, -0.28f)
                lineTo(8.673f, 7.838f)
                arcToRelative(0.28f, 0.28f, 0.0f, false, true, 0.28f, -0.28f)
                close()
                moveTo(14.998f, 7.53f)
                arcToRelative(0.28f, 0.28f, 0.0f, false, true, 0.28f, 0.28f)
                verticalLineToRelative(8.333f)
                arcToRelative(0.28f, 0.28f, 0.0f, false, true, -0.28f, 0.28f)
                arcToRelative(0.28f, 0.28f, 0.0f, false, true, -0.28f, -0.28f)
                lineTo(14.718f, 7.81f)
                arcToRelative(0.28f, 0.28f, 0.0f, false, true, 0.28f, -0.28f)
                close()
            }
        }
        .build()
        return _pauseLight!!
    }

private var _pauseLight: ImageVector? = null
