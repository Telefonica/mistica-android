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

public val FilledGroup.PenFilled: ImageVector
    get() {
        if (_penFilled != null) {
            return _penFilled!!
        }
        _penFilled = Builder(name = "PenFilled", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.553f, 8.145f)
                lineToRelative(0.34f, -0.357f)
                curveToRelative(1.476f, -1.55f, 1.476f, -4.075f, 0.0f, -5.625f)
                arcToRelative(3.667f, 3.667f, 0.0f, false, false, -5.358f, 0.0f)
                lineToRelative(-0.34f, 0.357f)
                lineToRelative(5.358f, 5.625f)
                close()
                moveTo(4.177f, 14.088f)
                lineToRelative(10.25f, -10.763f)
                lineToRelative(5.356f, 5.624f)
                lineTo(9.533f, 19.71f)
                lineToRelative(-5.356f, -5.623f)
                close()
                moveTo(3.552f, 15.043f)
                lineTo(2.024f, 21.046f)
                arcToRelative(0.784f, 0.784f, 0.0f, false, false, 0.188f, 0.731f)
                arcToRelative(0.705f, 0.705f, 0.0f, false, false, 0.696f, 0.198f)
                lineToRelative(5.717f, -1.61f)
                lineToRelative(-5.073f, -5.322f)
                close()
            }
        }
        .build()
        return _penFilled!!
    }

private var _penFilled: ImageVector? = null
