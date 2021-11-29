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

public val RegularGroup.TabletRegular: ImageVector
    get() {
        if (_tabletRegular != null) {
            return _tabletRegular!!
        }
        _tabletRegular = Builder(name = "TabletRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.913f, 2.0f)
                lineTo(6.087f, 2.0f)
                curveTo(4.938f, 2.0f, 4.0f, 2.964f, 4.0f, 4.143f)
                verticalLineToRelative(15.714f)
                curveTo(4.0f, 21.037f, 4.938f, 22.0f, 6.087f, 22.0f)
                horizontalLineToRelative(11.826f)
                curveTo(19.062f, 22.0f, 20.0f, 21.036f, 20.0f, 19.857f)
                lineTo(20.0f, 4.143f)
                curveTo(20.0f, 2.963f, 19.062f, 2.0f, 17.913f, 2.0f)
                close()
                moveTo(6.087f, 3.427f)
                horizontalLineToRelative(11.826f)
                curveToRelative(0.385f, 0.0f, 0.697f, 0.324f, 0.697f, 0.716f)
                lineTo(18.61f, 4.5f)
                lineTo(5.394f, 4.5f)
                verticalLineToRelative(-0.356f)
                curveToRelative(0.0f, -0.392f, 0.312f, -0.716f, 0.693f, -0.716f)
                close()
                moveTo(18.606f, 5.927f)
                lineTo(18.606f, 18.07f)
                lineTo(5.394f, 18.07f)
                lineTo(5.394f, 5.926f)
                horizontalLineToRelative(13.212f)
                close()
                moveTo(17.913f, 20.569f)
                lineTo(6.087f, 20.569f)
                arcToRelative(0.708f, 0.708f, 0.0f, false, true, -0.697f, -0.716f)
                verticalLineToRelative(-0.356f)
                horizontalLineToRelative(13.216f)
                verticalLineToRelative(0.356f)
                arcToRelative(0.705f, 0.705f, 0.0f, false, true, -0.693f, 0.716f)
                close()
            }
        }
        .build()
        return _tabletRegular!!
    }

private var _tabletRegular: ImageVector? = null
