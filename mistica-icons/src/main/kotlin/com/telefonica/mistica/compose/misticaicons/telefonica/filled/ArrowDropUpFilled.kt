package com.telefonica.mistica.compose.misticaicons.telefonica.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.telefonica.FilledGroup

public val FilledGroup.ArrowDropUpFilled: ImageVector
    get() {
        if (_arrowDropUpFilled != null) {
            return _arrowDropUpFilled!!
        }
        _arrowDropUpFilled = Builder(name = "ArrowDropUpFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.481f, 14.91f)
                lineTo(12.91f, 7.336f)
                arcToRelative(1.41f, 1.41f, 0.0f, false, false, -1.818f, 0.0f)
                lineTo(2.523f, 14.76f)
                arcToRelative(1.044f, 1.044f, 0.0f, false, false, -0.28f, 1.23f)
                curveToRelative(0.196f, 0.423f, 0.655f, 0.703f, 1.174f, 0.708f)
                lineToRelative(17.137f, 0.152f)
                curveToRelative(0.52f, 0.0f, 0.986f, -0.275f, 1.185f, -0.7f)
                arcToRelative(1.041f, 1.041f, 0.0f, false, false, -0.275f, -1.239f)
                horizontalLineToRelative(0.017f)
                close()
            }
        }
        .build()
        return _arrowDropUpFilled!!
    }

private var _arrowDropUpFilled: ImageVector? = null
