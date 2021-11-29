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

public val FilledGroup.SendFilled: ImageVector
    get() {
        if (_sendFilled != null) {
            return _sendFilled!!
        }
        _sendFilled = Builder(name = "SendFilled", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.963f, 11.94f)
                lineTo(2.215f, 8.185f)
                arcToRelative(0.392f, 0.392f, 0.0f, false, true, -0.213f, -0.388f)
                arcToRelative(0.389f, 0.389f, 0.0f, false, true, 0.275f, -0.344f)
                lineTo(18.64f, 2.83f)
                lineToRelative(-8.677f, 9.11f)
                close()
                moveTo(21.788f, 2.228f)
                arcToRelative(0.717f, 0.717f, 0.0f, false, false, -1.048f, 0.0f)
                lineTo(9.996f, 13.508f)
                arcToRelative(0.806f, 0.806f, 0.0f, false, false, 0.0f, 1.1f)
                arcToRelative(0.704f, 0.704f, 0.0f, false, false, 0.521f, 0.228f)
                curveToRelative(0.19f, 0.0f, 0.38f, -0.074f, 0.522f, -0.229f)
                lineToRelative(1.01f, -1.06f)
                lineToRelative(4.059f, 9.229f)
                arcToRelative(0.37f, 0.37f, 0.0f, false, false, 0.336f, 0.224f)
                horizontalLineToRelative(0.029f)
                arcToRelative(0.381f, 0.381f, 0.0f, false, false, 0.327f, -0.284f)
                reflectiveCurveTo(21.987f, 2.905f, 21.992f, 2.88f)
                arcToRelative(0.798f, 0.798f, 0.0f, false, false, -0.204f, -0.652f)
                close()
            }
        }
        .build()
        return _sendFilled!!
    }

private var _sendFilled: ImageVector? = null
