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

public val FilledGroup.SearchFilled: ImageVector
    get() {
        if (_searchFilled != null) {
            return _searchFilled!!
        }
        _searchFilled = Builder(name = "SearchFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(21.793f, 21.719f)
                lineToRelative(-5.9f, -6.19f)
                arcToRelative(8.469f, 8.469f, 0.0f, false, false, 1.82f, -5.276f)
                curveTo(17.717f, 5.7f, 14.19f, 2.0f, 9.857f, 2.0f)
                curveTo(5.524f, 2.0f, 2.0f, 5.7f, 2.0f, 10.249f)
                curveToRelative(0.0f, 4.548f, 3.524f, 8.249f, 7.857f, 8.249f)
                curveToRelative(1.908f, 0.0f, 3.66f, -0.719f, 5.024f, -1.911f)
                lineToRelative(5.9f, 6.195f)
                arcToRelative(0.695f, 0.695f, 0.0f, false, false, 1.008f, 0.0f)
                arcToRelative(0.781f, 0.781f, 0.0f, false, false, 0.004f, -1.063f)
                close()
                moveTo(3.428f, 10.249f)
                curveToRelative(0.0f, -3.721f, 2.884f, -6.75f, 6.429f, -6.75f)
                curveToRelative(3.544f, 0.0f, 6.428f, 3.029f, 6.428f, 6.75f)
                reflectiveCurveToRelative(-2.884f, 6.75f, -6.428f, 6.75f)
                curveToRelative(-3.545f, 0.0f, -6.429f, -3.029f, -6.429f, -6.75f)
                close()
            }
        }
        .build()
        return _searchFilled!!
    }

private var _searchFilled: ImageVector? = null
