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

public val FilledGroup.ControlsFilled: ImageVector
    get() {
        if (_controlsFilled != null) {
            return _controlsFilled!!
        }
        _controlsFilled = Builder(name = "ControlsFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.95f, 2.185f)
                arcTo(0.354f, 0.354f, 0.0f, false, false, 20.646f, 2.0f)
                horizontalLineTo(4.352f)
                arcToRelative(0.348f, 0.348f, 0.0f, false, false, -0.304f, 0.185f)
                arcToRelative(0.395f, 0.395f, 0.0f, false, false, -0.004f, 0.37f)
                lineToRelative(6.864f, 12.876f)
                verticalLineToRelative(4.9f)
                curveToRelative(0.0f, 0.92f, 0.716f, 1.669f, 1.596f, 1.669f)
                curveToRelative(0.88f, 0.0f, 1.596f, -0.749f, 1.596f, -1.668f)
                verticalLineToRelative(-4.905f)
                lineToRelative(6.855f, -12.872f)
                arcToRelative(0.383f, 0.383f, 0.0f, false, false, -0.005f, -0.37f)
                close()
            }
        }
        .build()
        return _controlsFilled!!
    }

private var _controlsFilled: ImageVector? = null
