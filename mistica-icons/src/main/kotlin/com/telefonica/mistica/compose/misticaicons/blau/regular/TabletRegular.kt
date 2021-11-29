package com.telefonica.mistica.compose.misticaicons.blau.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.blau.RegularGroup

public val RegularGroup.TabletRegular: ImageVector
    get() {
        if (_tabletRegular != null) {
            return _tabletRegular!!
        }
        _tabletRegular = Builder(name = "TabletRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF1E6CA7)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.692f, 20.0f)
                verticalLineToRelative(-2.0f)
                lineTo(5.333f, 18.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.368f, 0.299f, 0.667f, 0.667f, 0.667f)
                horizontalLineToRelative(12.026f)
                arcToRelative(0.667f, 0.667f, 0.0f, false, false, 0.666f, -0.667f)
                close()
                moveTo(5.333f, 4.0f)
                verticalLineToRelative(12.667f)
                horizontalLineToRelative(13.359f)
                lineTo(18.692f, 4.0f)
                arcToRelative(0.667f, 0.667f, 0.0f, false, false, -0.666f, -0.667f)
                lineTo(6.0f, 3.333f)
                arcTo(0.667f, 0.667f, 0.0f, false, false, 5.333f, 4.0f)
                close()
                moveTo(20.025f, 4.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 1.103f, -0.897f, 2.0f, -1.999f, 2.0f)
                lineTo(6.0f, 22.0f)
                curveToRelative(-1.103f, 0.0f, -2.0f, -0.897f, -2.0f, -2.0f)
                lineTo(4.0f, 4.0f)
                curveToRelative(0.0f, -1.103f, 0.897f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(12.026f)
                curveToRelative(1.102f, 0.0f, 1.999f, 0.897f, 1.999f, 2.0f)
                close()
                moveTo(11.359f, 20.0f)
                horizontalLineToRelative(1.333f)
                verticalLineToRelative(-1.334f)
                horizontalLineToRelative(-1.333f)
                lineTo(11.359f, 20.0f)
                close()
            }
        }
        .build()
        return _tabletRegular!!
    }

private var _tabletRegular: ImageVector? = null
