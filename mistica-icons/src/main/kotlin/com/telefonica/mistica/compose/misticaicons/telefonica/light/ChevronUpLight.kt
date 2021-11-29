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

public val LightGroup.ChevronUpLight: ImageVector
    get() {
        if (_chevronUpLight != null) {
            return _chevronUpLight!!
        }
        _chevronUpLight = Builder(name = "ChevronUpLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 15.388f)
                curveToRelative(0.0f, -0.15f, 0.057f, -0.295f, 0.16f, -0.404f)
                lineToRelative(7.314f, -7.793f)
                arcTo(0.604f, 0.604f, 0.0f, false, true, 11.916f, 7.0f)
                curveToRelative(0.173f, 0.0f, 0.337f, 0.07f, 0.455f, 0.191f)
                lineToRelative(7.451f, 7.793f)
                arcToRelative(0.592f, 0.592f, 0.0f, false, true, 0.0f, 0.845f)
                arcToRelative(0.64f, 0.64f, 0.0f, false, true, -0.872f, 0.0f)
                lineToRelative(-7.02f, -7.354f)
                lineToRelative(-6.862f, 7.319f)
                arcToRelative(0.628f, 0.628f, 0.0f, false, true, -0.868f, 0.004f)
                lineToRelative(-0.004f, -0.004f)
                arcTo(0.624f, 0.624f, 0.0f, false, true, 4.0f, 15.388f)
                close()
            }
        }
        .build()
        return _chevronUpLight!!
    }

private var _chevronUpLight: ImageVector? = null
