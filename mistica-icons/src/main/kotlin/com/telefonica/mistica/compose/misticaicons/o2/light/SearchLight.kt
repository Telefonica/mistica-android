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

public val LightGroup.SearchLight: ImageVector
    get() {
        if (_searchLight != null) {
            return _searchLight!!
        }
        _searchLight = Builder(name = "SearchLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5f, 2.0f)
                curveToRelative(4.136f, 0.0f, 7.5f, 3.364f, 7.496f, 7.5f)
                curveToRelative(0.0f, 0.392f, -0.036f, 0.788f, -0.108f, 1.22f)
                arcToRelative(0.355f, 0.355f, 0.0f, false, true, -0.412f, 0.292f)
                arcToRelative(0.355f, 0.355f, 0.0f, false, true, -0.292f, -0.412f)
                curveToRelative(0.068f, -0.388f, 0.1f, -0.748f, 0.1f, -1.1f)
                arcTo(6.793f, 6.793f, 0.0f, false, false, 9.5f, 2.716f)
                arcTo(6.793f, 6.793f, 0.0f, false, false, 2.716f, 9.5f)
                arcTo(6.793f, 6.793f, 0.0f, false, false, 9.5f, 16.284f)
                arcToRelative(6.734f, 6.734f, 0.0f, false, false, 4.792f, -1.996f)
                curveToRelative(0.14f, -0.14f, 0.364f, -0.14f, 0.504f, 0.0f)
                lineToRelative(0.008f, 0.008f)
                lineToRelative(7.091f, 7.096f)
                curveToRelative(0.14f, 0.136f, 0.14f, 0.364f, -0.004f, 0.504f)
                arcToRelative(0.357f, 0.357f, 0.0f, false, true, -0.503f, 0.0f)
                lineToRelative(-6.852f, -6.852f)
                arcTo(7.434f, 7.434f, 0.0f, false, true, 9.5f, 17.0f)
                curveTo(5.364f, 17.0f, 2.0f, 13.636f, 2.0f, 9.5f)
                reflectiveCurveTo(5.364f, 2.0f, 9.5f, 2.0f)
                close()
                moveTo(15.928f, 12.0f)
                arcToRelative(0.716f, 0.716f, 0.0f, true, true, 0.0f, 1.432f)
                arcToRelative(0.716f, 0.716f, 0.0f, false, true, 0.0f, -1.432f)
                close()
            }
        }
        .build()
        return _searchLight!!
    }

private var _searchLight: ImageVector? = null
