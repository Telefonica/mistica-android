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

public val LightGroup.KebabMenuLight: ImageVector
    get() {
        if (_kebabMenuLight != null) {
            return _kebabMenuLight!!
        }
        _kebabMenuLight = Builder(name = "KebabMenuLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.914f, 14.439f)
                curveToRelative(-1.277f, 0.0f, -2.314f, -1.1f, -2.314f, -2.459f)
                curveToRelative(0.0f, -1.36f, 1.035f, -2.459f, 2.314f, -2.459f)
                curveToRelative(1.277f, 0.0f, 2.312f, 1.1f, 2.312f, 2.459f)
                curveToRelative(0.0f, 1.36f, -1.035f, 2.459f, -2.312f, 2.459f)
                close()
                moveTo(11.914f, 7.065f)
                curveToRelative(-1.277f, 0.0f, -2.314f, -1.1f, -2.314f, -2.459f)
                curveToRelative(0.0f, -1.36f, 1.037f, -2.456f, 2.314f, -2.456f)
                curveToRelative(1.277f, 0.0f, 2.312f, 1.1f, 2.312f, 2.459f)
                curveToRelative(0.0f, 1.36f, -1.035f, 2.456f, -2.312f, 2.456f)
                close()
                moveTo(11.914f, 21.81f)
                curveToRelative(-1.277f, 0.0f, -2.314f, -1.1f, -2.314f, -2.456f)
                curveToRelative(0.0f, -1.357f, 1.035f, -2.459f, 2.314f, -2.459f)
                curveToRelative(1.277f, 0.0f, 2.312f, 1.1f, 2.312f, 2.459f)
                curveToRelative(0.0f, 1.36f, -1.035f, 2.456f, -2.312f, 2.456f)
                close()
            }
        }
        .build()
        return _kebabMenuLight!!
    }

private var _kebabMenuLight: ImageVector? = null
