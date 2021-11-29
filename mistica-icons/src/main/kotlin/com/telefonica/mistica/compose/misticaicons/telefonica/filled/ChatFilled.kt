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

public val FilledGroup.ChatFilled: ImageVector
    get() {
        if (_chatFilled != null) {
            return _chatFilled!!
        }
        _chatFilled = Builder(name = "ChatFilled", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.812f, 2.845f)
                lineTo(4.832f, 2.845f)
                arcToRelative(2.822f, 2.822f, 0.0f, false, false, -2.826f, 2.812f)
                verticalLineToRelative(9.65f)
                curveToRelative(0.0f, 1.383f, 0.924f, 2.507f, 2.187f, 2.759f)
                verticalLineToRelative(2.35f)
                curveToRelative(0.0f, 0.51f, 0.482f, 0.975f, 1.009f, 0.975f)
                curveToRelative(0.518f, 0.0f, 0.77f, -0.336f, 0.854f, -0.449f)
                lineToRelative(2.207f, -2.823f)
                horizontalLineToRelative(10.55f)
                arcToRelative(2.82f, 2.82f, 0.0f, false, false, 2.823f, -2.812f)
                lineTo(21.636f, 5.654f)
                arcToRelative(2.82f, 2.82f, 0.0f, false, false, -2.824f, -2.81f)
                close()
                moveTo(17.782f, 8.881f)
                lineTo(5.848f, 8.881f)
                arcToRelative(0.562f, 0.562f, 0.0f, false, true, -0.56f, -0.56f)
                curveToRelative(0.0f, -0.308f, 0.252f, -0.56f, 0.56f, -0.56f)
                lineTo(17.78f, 7.761f)
                curveToRelative(0.309f, 0.0f, 0.56f, 0.252f, 0.56f, 0.56f)
                curveToRelative(0.0f, 0.308f, -0.251f, 0.56f, -0.56f, 0.56f)
                close()
                moveTo(13.958f, 13.251f)
                horizontalLineToRelative(-8.11f)
                arcToRelative(0.562f, 0.562f, 0.0f, false, true, -0.56f, -0.56f)
                curveToRelative(0.0f, -0.309f, 0.253f, -0.56f, 0.56f, -0.56f)
                horizontalLineToRelative(8.11f)
                curveToRelative(0.308f, 0.0f, 0.56f, 0.251f, 0.56f, 0.56f)
                curveToRelative(0.0f, 0.308f, -0.252f, 0.56f, -0.56f, 0.56f)
                close()
            }
        }
        .build()
        return _chatFilled!!
    }

private var _chatFilled: ImageVector? = null
