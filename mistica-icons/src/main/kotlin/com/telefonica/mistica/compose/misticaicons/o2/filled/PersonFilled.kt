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

public val FilledGroup.PersonFilled: ImageVector
    get() {
        if (_personFilled != null) {
            return _personFilled!!
        }
        _personFilled = Builder(name = "PersonFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.991f, 15.705f)
                horizontalLineToRelative(-1.388f)
                verticalLineTo(22.0f)
                horizontalLineTo(9.388f)
                verticalLineToRelative(-6.295f)
                horizontalLineTo(8.0f)
                verticalLineToRelative(-6.48f)
                curveToRelative(0.0f, -1.598f, 1.121f, -2.916f, 2.572f, -3.12f)
                arcToRelative(2.487f, 2.487f, 0.0f, false, true, -0.659f, -1.697f)
                curveTo(9.913f, 3.081f, 10.928f, 2.0f, 12.173f, 2.0f)
                curveToRelative(1.25f, 0.0f, 2.26f, 1.08f, 2.26f, 2.408f)
                curveToRelative(0.0f, 0.692f, -0.275f, 1.313f, -0.711f, 1.754f)
                curveTo(15.026f, 6.49f, 16.0f, 7.736f, 16.0f, 9.224f)
                verticalLineToRelative(6.48f)
                horizontalLineToRelative(-0.009f)
                close()
            }
        }
        .build()
        return _personFilled!!
    }

private var _personFilled: ImageVector? = null
