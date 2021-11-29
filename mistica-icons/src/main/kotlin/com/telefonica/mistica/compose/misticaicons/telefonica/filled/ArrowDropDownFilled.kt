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

public val FilledGroup.ArrowDropDownFilled: ImageVector
    get() {
        if (_arrowDropDownFilled != null) {
            return _arrowDropDownFilled!!
        }
        _arrowDropDownFilled = Builder(name = "ArrowDropDownFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.753f, 7.863f)
                arcToRelative(1.304f, 1.304f, 0.0f, false, false, -1.182f, -0.711f)
                lineTo(3.447f, 7.0f)
                curveToRelative(-0.523f, -0.01f, -1.0f, 0.27f, -1.196f, 0.698f)
                arcToRelative(1.03f, 1.03f, 0.0f, false, false, 0.275f, 1.24f)
                lineToRelative(8.56f, 7.575f)
                arcToRelative(1.407f, 1.407f, 0.0f, false, false, 1.815f, 0.0f)
                lineToRelative(8.56f, -7.423f)
                curveToRelative(0.356f, -0.3f, 0.474f, -0.798f, 0.292f, -1.227f)
                close()
            }
        }
        .build()
        return _arrowDropDownFilled!!
    }

private var _arrowDropDownFilled: ImageVector? = null
