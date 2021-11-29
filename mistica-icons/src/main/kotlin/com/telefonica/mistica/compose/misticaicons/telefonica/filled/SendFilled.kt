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
                moveTo(21.378f, 11.205f)
                lineTo(3.336f, 2.235f)
                arcToRelative(0.82f, 0.82f, 0.0f, false, false, -1.168f, 0.908f)
                lineToRelative(1.865f, 8.782f)
                lineToRelative(-1.835f, 8.924f)
                arcToRelative(0.823f, 0.823f, 0.0f, false, false, 1.177f, 0.9f)
                lineToRelative(18.008f, -9.074f)
                arcToRelative(0.82f, 0.82f, 0.0f, false, false, -0.005f, -1.47f)
            }
        }
        .build()
        return _sendFilled!!
    }

private var _sendFilled: ImageVector? = null
