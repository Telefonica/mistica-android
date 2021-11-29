package com.telefonica.mistica.compose.misticaicons.o2.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.o2.LightGroup

public val LightGroup.PersonLight: ImageVector
    get() {
        if (_personLight != null) {
            return _personLight!!
        }
        _personLight = Builder(name = "PersonLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.819f, 6.754f)
                arcToRelative(2.7f, 2.7f, 0.0f, false, false, 0.961f, -2.075f)
                curveTo(14.78f, 3.202f, 13.61f, 2.0f, 12.171f, 2.0f)
                curveToRelative(-1.438f, 0.0f, -2.608f, 1.202f, -2.608f, 2.679f)
                curveToRelative(0.0f, 0.8f, 0.347f, 1.518f, 0.894f, 2.011f)
                curveTo(9.064f, 6.933f, 8.0f, 8.18f, 8.0f, 9.68f)
                verticalLineToRelative(6.25f)
                horizontalLineToRelative(1.389f)
                verticalLineToRelative(5.713f)
                curveToRelative(0.0f, 0.197f, 0.156f, 0.357f, 0.347f, 0.357f)
                curveToRelative(0.192f, 0.0f, 0.347f, -0.16f, 0.347f, -0.357f)
                verticalLineToRelative(-6.427f)
                lineTo(8.694f, 15.216f)
                lineTo(8.694f, 9.68f)
                curveToRelative(0.0f, -1.257f, 1.038f, -2.322f, 2.262f, -2.322f)
                horizontalLineToRelative(2.088f)
                curveToRelative(1.224f, 0.0f, 2.262f, 1.065f, 2.262f, 2.322f)
                verticalLineToRelative(5.536f)
                horizontalLineToRelative(-1.39f)
                verticalLineToRelative(3.927f)
                curveToRelative(0.0f, 0.196f, 0.156f, 0.356f, 0.348f, 0.356f)
                curveToRelative(0.191f, 0.0f, 0.347f, -0.16f, 0.347f, -0.356f)
                verticalLineToRelative(-3.214f)
                lineTo(16.0f, 15.929f)
                lineTo(16.0f, 9.68f)
                curveToRelative(-0.004f, -1.394f, -0.926f, -2.574f, -2.181f, -2.926f)
                close()
                moveTo(10.257f, 4.68f)
                curveToRelative(0.0f, -1.084f, 0.86f, -1.966f, 1.914f, -1.966f)
                curveToRelative(1.055f, 0.0f, 1.915f, 0.882f, 1.915f, 1.966f)
                curveToRelative(0.0f, 1.083f, -0.86f, 1.966f, -1.92f, 1.966f)
                curveToRelative(-1.054f, -0.005f, -1.909f, -0.883f, -1.909f, -1.966f)
                close()
                moveTo(14.954f, 21.288f)
                arcToRelative(0.705f, 0.705f, 0.0f, false, true, -0.695f, 0.713f)
                arcToRelative(0.705f, 0.705f, 0.0f, false, true, -0.694f, -0.713f)
                curveToRelative(0.0f, -0.393f, 0.311f, -0.713f, 0.694f, -0.713f)
                curveToRelative(0.383f, 0.0f, 0.695f, 0.32f, 0.695f, 0.713f)
                close()
            }
        }
        .build()
        return _personLight!!
    }

private var _personLight: ImageVector? = null
