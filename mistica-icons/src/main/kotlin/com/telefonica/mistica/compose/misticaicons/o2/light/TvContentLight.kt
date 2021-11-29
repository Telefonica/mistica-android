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

public val LightGroup.TvContentLight: ImageVector
    get() {
        if (_tvContentLight != null) {
            return _tvContentLight!!
        }
        _tvContentLight = Builder(name = "TvContentLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 14.126f)
                arcToRelative(0.739f, 0.739f, 0.0f, false, true, -0.726f, 0.75f)
                arcToRelative(0.739f, 0.739f, 0.0f, false, true, -0.726f, -0.75f)
                curveToRelative(0.0f, -0.412f, 0.326f, -0.749f, 0.726f, -0.749f)
                curveToRelative(0.4f, 0.0f, 0.726f, 0.337f, 0.726f, 0.75f)
                close()
                moveTo(21.632f, 16.378f)
                arcToRelative(0.37f, 0.37f, 0.0f, false, true, -0.363f, 0.375f)
                horizontalLineToRelative(-7.633f)
                verticalLineToRelative(1.498f)
                horizontalLineToRelative(2.546f)
                curveToRelative(0.2f, 0.0f, 0.363f, 0.168f, 0.363f, 0.374f)
                arcToRelative(0.37f, 0.37f, 0.0f, false, true, -0.363f, 0.375f)
                lineTo(7.455f, 19.0f)
                arcToRelative(0.37f, 0.37f, 0.0f, false, true, -0.363f, -0.375f)
                arcToRelative(0.37f, 0.37f, 0.0f, false, true, 0.363f, -0.374f)
                horizontalLineToRelative(2.546f)
                verticalLineToRelative(-1.498f)
                lineTo(2.0f, 16.753f)
                lineTo(2.0f, 4.0f)
                horizontalLineToRelative(19.637f)
                verticalLineToRelative(7.88f)
                arcToRelative(0.37f, 0.37f, 0.0f, false, true, -0.363f, 0.374f)
                arcToRelative(0.37f, 0.37f, 0.0f, false, true, -0.363f, -0.375f)
                lineTo(20.911f, 4.75f)
                lineTo(2.726f, 4.75f)
                verticalLineToRelative(11.255f)
                lineTo(21.27f, 16.005f)
                curveToRelative(0.2f, 0.0f, 0.363f, 0.163f, 0.363f, 0.374f)
                close()
                moveTo(12.905f, 16.753f)
                horizontalLineToRelative(-2.183f)
                verticalLineToRelative(1.498f)
                horizontalLineToRelative(2.183f)
                verticalLineToRelative(-1.498f)
                close()
            }
        }
        .build()
        return _tvContentLight!!
    }

private var _tvContentLight: ImageVector? = null
