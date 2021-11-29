package com.telefonica.mistica.compose.misticaicons.telefonica.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.telefonica.LightGroup

public val LightGroup.SendLight: ImageVector
    get() {
        if (_sendLight != null) {
            return _sendLight!!
        }
        _sendLight = Builder(name = "SendLight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.704f, 4.0f)
                arcToRelative(0.704f, 0.704f, 0.0f, false, false, -0.687f, 0.851f)
                lineToRelative(1.611f, 7.59f)
                lineToRelative(-1.584f, 7.712f)
                arcToRelative(0.705f, 0.705f, 0.0f, false, false, 1.006f, 0.772f)
                lineToRelative(15.563f, -7.837f)
                arcToRelative(0.707f, 0.707f, 0.0f, false, false, -0.003f, -1.26f)
                lineTo(5.018f, 4.073f)
                arcTo(0.706f, 0.706f, 0.0f, false, false, 4.704f, 4.0f)
                moveToRelative(0.0f, 0.704f)
                lineToRelative(15.592f, 7.752f)
                lineToRelative(-15.563f, 7.838f)
                lineToRelative(1.616f, -7.857f)
                lineToRelative(-1.645f, -7.733f)
            }
        }
        .build()
        return _sendLight!!
    }

private var _sendLight: ImageVector? = null
