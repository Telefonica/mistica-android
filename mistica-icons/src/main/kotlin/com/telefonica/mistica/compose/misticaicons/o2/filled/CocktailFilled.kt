package com.telefonica.mistica.compose.misticaicons.o2.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.o2.FilledGroup

public val FilledGroup.CocktailFilled: ImageVector
    get() {
        if (_cocktailFilled != null) {
            return _cocktailFilled!!
        }
        _cocktailFilled = Builder(name = "CocktailFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.869f, 2.792f)
                arcToRelative(0.48f, 0.48f, 0.0f, false, false, 0.097f, -0.506f)
                arcToRelative(0.452f, 0.452f, 0.0f, false, false, -0.414f, -0.286f)
                horizontalLineTo(3.448f)
                arcToRelative(0.446f, 0.446f, 0.0f, false, false, -0.414f, 0.286f)
                arcToRelative(0.48f, 0.48f, 0.0f, false, false, 0.097f, 0.506f)
                lineToRelative(7.967f, 8.237f)
                verticalLineToRelative(9.113f)
                horizontalLineTo(9.75f)
                curveToRelative(-0.495f, 0.0f, -0.898f, 0.417f, -0.898f, 0.929f)
                reflectiveCurveToRelative(0.403f, 0.929f, 0.898f, 0.929f)
                horizontalLineToRelative(4.5f)
                curveToRelative(0.495f, 0.0f, 0.898f, -0.417f, 0.898f, -0.93f)
                curveToRelative(0.0f, -0.511f, -0.403f, -0.928f, -0.898f, -0.928f)
                horizontalLineToRelative(-1.348f)
                verticalLineToRelative(-9.113f)
                lineToRelative(7.967f, -8.237f)
                close()
            }
        }
        .build()
        return _cocktailFilled!!
    }

private var _cocktailFilled: ImageVector? = null
