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

public val FilledGroup.LoudspeakerFilled: ImageVector
    get() {
        if (_loudspeakerFilled != null) {
            return _loudspeakerFilled!!
        }
        _loudspeakerFilled = Builder(name = "LoudspeakerFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.58f, 5.614f)
                curveToRelative(0.251f, 0.182f, 0.4f, 0.477f, 0.4f, 0.787f)
                verticalLineToRelative(11.185f)
                curveToRelative(0.0f, 0.311f, -0.149f, 0.605f, -0.4f, 0.787f)
                arcToRelative(0.94f, 0.94f, 0.0f, false, true, -0.807f, 0.135f)
                lineToRelative(-5.462f, -1.642f)
                lineToRelative(-0.194f, 0.62f)
                arcToRelative(0.801f, 0.801f, 0.0f, false, true, -0.403f, 0.481f)
                arcToRelative(0.782f, 0.782f, 0.0f, false, true, -0.625f, 0.056f)
                lineToRelative(-2.269f, -0.711f)
                arcToRelative(0.822f, 0.822f, 0.0f, false, true, -0.538f, -1.028f)
                lineToRelative(0.18f, -0.574f)
                lineToRelative(-3.18f, -0.956f)
                curveToRelative(0.0f, 0.286f, -0.243f, 0.516f, -0.546f, 0.516f)
                curveToRelative(-0.302f, 0.0f, -0.546f, -0.23f, -0.546f, -0.516f)
                verticalLineToRelative(-5.51f)
                curveToRelative(0.0f, -0.282f, 0.244f, -0.515f, 0.546f, -0.515f)
                curveToRelative(0.299f, 0.0f, 0.54f, 0.224f, 0.546f, 0.504f)
                lineToRelative(12.49f, -3.753f)
                arcToRelative(0.92f, 0.92f, 0.0f, false, true, 0.807f, 0.134f)
                close()
                moveTo(19.512f, 15.429f)
                lineTo(21.019f, 16.937f)
                arcToRelative(0.548f, 0.548f, 0.0f, false, true, -0.773f, 0.773f)
                lineToRelative(-1.507f, -1.507f)
                arcToRelative(0.548f, 0.548f, 0.0f, false, true, 0.773f, -0.774f)
                close()
                moveTo(7.479f, 16.129f)
                lineTo(7.409f, 16.354f)
                lineTo(9.156f, 16.903f)
                lineTo(9.226f, 16.679f)
                lineTo(7.479f, 16.129f)
                close()
                moveTo(21.347f, 11.186f)
                arcToRelative(0.545f, 0.545f, 0.0f, true, true, 0.0f, 1.092f)
                horizontalLineToRelative(-2.185f)
                arcToRelative(0.545f, 0.545f, 0.0f, true, true, 0.0f, -1.092f)
                horizontalLineToRelative(2.185f)
                close()
                moveTo(21.027f, 5.69f)
                arcToRelative(0.548f, 0.548f, 0.0f, false, true, 0.0f, 0.773f)
                lineTo(19.482f, 8.01f)
                arcToRelative(0.545f, 0.545f, 0.0f, false, true, -0.773f, 0.0f)
                arcToRelative(0.548f, 0.548f, 0.0f, false, true, 0.0f, -0.773f)
                lineToRelative(1.546f, -1.546f)
                arcToRelative(0.548f, 0.548f, 0.0f, false, true, 0.774f, 0.0f)
                close()
            }
        }
        .build()
        return _loudspeakerFilled!!
    }

private var _loudspeakerFilled: ImageVector? = null
