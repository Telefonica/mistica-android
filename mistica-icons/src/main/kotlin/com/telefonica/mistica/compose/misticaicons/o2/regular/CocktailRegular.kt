package com.telefonica.mistica.compose.misticaicons.o2.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.o2.RegularGroup

public val RegularGroup.CocktailRegular: ImageVector
    get() {
        if (_cocktailRegular != null) {
            return _cocktailRegular!!
        }
        _cocktailRegular = Builder(name = "CocktailRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.761f, 3.572f)
                arcToRelative(0.958f, 0.958f, 0.0f, false, false, 0.16f, -1.012f)
                arcToRelative(0.931f, 0.931f, 0.0f, false, false, -0.848f, -0.56f)
                lineTo(3.929f, 2.0f)
                curveToRelative(-0.368f, 0.0f, -0.7f, 0.217f, -0.849f, 0.56f)
                arcToRelative(0.946f, 0.946f, 0.0f, false, false, 0.16f, 1.012f)
                lineToRelative(8.335f, 9.38f)
                verticalLineToRelative(7.168f)
                horizontalLineToRelative(-1.388f)
                arcToRelative(0.934f, 0.934f, 0.0f, false, false, -0.925f, 0.94f)
                curveToRelative(0.0f, 0.518f, 0.415f, 0.94f, 0.925f, 0.94f)
                horizontalLineToRelative(4.633f)
                curveToRelative(0.51f, 0.0f, 0.926f, -0.422f, 0.926f, -0.94f)
                arcToRelative(0.934f, 0.934f, 0.0f, false, false, -0.926f, -0.94f)
                horizontalLineToRelative(-1.388f)
                verticalLineToRelative(-7.168f)
                lineToRelative(8.329f, -9.38f)
                close()
                moveTo(6.011f, 3.886f)
                horizontalLineToRelative(12.98f)
                lineToRelative(-6.49f, 7.3f)
                lineToRelative(-6.49f, -7.3f)
                close()
            }
        }
        .build()
        return _cocktailRegular!!
    }

private var _cocktailRegular: ImageVector? = null
