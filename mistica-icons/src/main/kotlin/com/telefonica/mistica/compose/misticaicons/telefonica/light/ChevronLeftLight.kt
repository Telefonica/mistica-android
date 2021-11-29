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

public val LightGroup.ChevronLeftLight: ImageVector
    get() {
        if (_chevronLeftLight != null) {
            return _chevronLeftLight!!
        }
        _chevronLeftLight = Builder(name = "ChevronLeftLight", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.388f, 20.0f)
                arcToRelative(0.593f, 0.593f, 0.0f, false, true, -0.404f, -0.16f)
                lineTo(7.19f, 12.527f)
                arcTo(0.604f, 0.604f, 0.0f, false, true, 7.0f, 12.084f)
                curveToRelative(0.0f, -0.173f, 0.07f, -0.337f, 0.191f, -0.455f)
                lineToRelative(7.793f, -7.451f)
                arcToRelative(0.592f, 0.592f, 0.0f, false, true, 0.845f, 0.0f)
                arcToRelative(0.64f, 0.64f, 0.0f, false, true, 0.0f, 0.872f)
                lineToRelative(-7.354f, 7.02f)
                lineToRelative(7.319f, 6.862f)
                arcToRelative(0.628f, 0.628f, 0.0f, false, true, 0.004f, 0.868f)
                lineToRelative(-0.004f, 0.004f)
                arcToRelative(0.624f, 0.624f, 0.0f, false, true, -0.406f, 0.196f)
                close()
            }
        }
        .build()
        return _chevronLeftLight!!
    }

private var _chevronLeftLight: ImageVector? = null
