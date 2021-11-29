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

public val LightGroup.CocktailLight: ImageVector
    get() {
        if (_cocktailLight != null) {
            return _cocktailLight!!
        }
        _cocktailLight = Builder(name = "CocktailLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.552f, 3.0f)
                curveToRelative(0.178f, 0.0f, 0.345f, 0.11f, 0.414f, 0.278f)
                arcToRelative(0.46f, 0.46f, 0.0f, false, true, -0.097f, 0.492f)
                lineToRelative(-4.396f, 4.414f)
                arcToRelative(0.445f, 0.445f, 0.0f, false, true, -0.634f, 0.0f)
                arcToRelative(0.446f, 0.446f, 0.0f, false, true, 0.0f, -0.637f)
                lineToRelative(3.624f, -3.643f)
                horizontalLineTo(4.531f)
                lineToRelative(7.789f, 7.826f)
                arcToRelative(0.434f, 0.434f, 0.0f, false, true, 0.132f, 0.318f)
                verticalLineToRelative(9.048f)
                horizontalLineToRelative(1.798f)
                arcToRelative(0.451f, 0.451f, 0.0f, false, true, 0.0f, 0.904f)
                horizontalLineToRelative(-4.5f)
                arcToRelative(0.451f, 0.451f, 0.0f, false, true, 0.0f, -0.904f)
                horizontalLineToRelative(1.798f)
                verticalLineToRelative(-8.862f)
                lineTo(3.13f, 3.77f)
                arcToRelative(0.458f, 0.458f, 0.0f, false, true, -0.097f, -0.492f)
                arcTo(0.446f, 0.446f, 0.0f, false, true, 3.448f, 3.0f)
                close()
                moveTo(14.25f, 8.88f)
                curveToRelative(0.496f, 0.0f, 0.898f, 0.404f, 0.898f, 0.903f)
                curveToRelative(0.0f, 0.5f, -0.402f, 0.904f, -0.898f, 0.904f)
                arcToRelative(0.901f, 0.901f, 0.0f, false, true, -0.9f, -0.904f)
                curveToRelative(0.0f, -0.499f, 0.403f, -0.903f, 0.9f, -0.903f)
                close()
            }
        }
        .build()
        return _cocktailLight!!
    }

private var _cocktailLight: ImageVector? = null
