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

public val FilledGroup.TabletFilled: ImageVector
    get() {
        if (_tabletFilled != null) {
            return _tabletFilled!!
        }
        _tabletFilled = Builder(name = "TabletFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 5.393f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(13.214f)
                lineTo(4.0f, 18.607f)
                lineTo(4.0f, 5.393f)
                close()
                moveTo(20.0f, 4.324f)
                verticalLineToRelative(-0.54f)
                curveToRelative(0.0f, -1.0f, -0.764f, -1.784f, -1.738f, -1.784f)
                lineTo(5.738f, 2.0f)
                curveTo(4.764f, 2.0f, 4.0f, 2.784f, 4.0f, 3.784f)
                verticalLineToRelative(0.536f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(0.004f)
                close()
                moveTo(4.0f, 19.68f)
                verticalLineToRelative(0.536f)
                curveToRelative(0.0f, 1.0f, 0.764f, 1.784f, 1.738f, 1.784f)
                horizontalLineToRelative(12.52f)
                curveToRelative(0.975f, 0.0f, 1.738f, -0.784f, 1.738f, -1.784f)
                verticalLineToRelative(-0.536f)
                lineTo(4.0f, 19.68f)
                close()
            }
        }
        .build()
        return _tabletFilled!!
    }

private var _tabletFilled: ImageVector? = null
