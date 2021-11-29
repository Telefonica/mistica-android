package com.telefonica.mistica.compose.misticaicons.telefonica.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.telefonica.RegularGroup

public val RegularGroup.SearchRegular: ImageVector
    get() {
        if (_searchRegular != null) {
            return _searchRegular!!
        }
        _searchRegular = Builder(name = "SearchRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.417f, 4.39f)
                arcToRelative(7.845f, 7.845f, 0.0f, false, true, 0.378f, 10.497f)
                lineToRelative(5.704f, 5.704f)
                arcToRelative(0.561f, 0.561f, 0.0f, false, true, -0.793f, 0.793f)
                lineToRelative(-5.696f, -5.697f)
                arcToRelative(7.792f, 7.792f, 0.0f, false, true, -5.139f, 1.918f)
                arcTo(7.846f, 7.846f, 0.0f, false, true, 4.322f, 4.21f)
                arcToRelative(7.848f, 7.848f, 0.0f, false, true, 11.095f, 0.18f)
                close()
                moveTo(9.871f, 3.033f)
                arcToRelative(6.726f, 6.726f, 0.0f, false, false, -4.756f, 11.481f)
                arcToRelative(6.728f, 6.728f, 0.0f, false, false, 9.512f, -0.036f)
                arcToRelative(6.724f, 6.724f, 0.0f, false, false, 0.0f, -9.473f)
                arcToRelative(6.672f, 6.672f, 0.0f, false, false, -4.756f, -1.972f)
                close()
            }
        }
        .build()
        return _searchRegular!!
    }

private var _searchRegular: ImageVector? = null
