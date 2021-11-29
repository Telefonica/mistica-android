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

public val FilledGroup.PlayFilled: ImageVector
    get() {
        if (_playFilled != null) {
            return _playFilled!!
        }
        _playFilled = Builder(name = "PlayFilled", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.208f, 4.583f)
                curveToRelative(-1.67f, -1.608f, -4.098f, -2.423f, -7.222f, -2.423f)
                curveToRelative(-3.123f, 0.0f, -5.551f, 0.815f, -7.218f, 2.426f)
                curveToRelative(-1.731f, 1.67f, -2.608f, 4.162f, -2.608f, 7.409f)
                curveToRelative(0.0f, 3.246f, 0.877f, 5.736f, 2.608f, 7.406f)
                curveToRelative(1.667f, 1.608f, 4.095f, 2.423f, 7.218f, 2.423f)
                curveToRelative(3.124f, 0.0f, 5.552f, -0.815f, 7.222f, -2.423f)
                curveToRelative(1.73f, -1.67f, 2.61f, -4.16f, 2.61f, -7.406f)
                curveToRelative(0.0f, -3.247f, -0.876f, -5.743f, -2.61f, -7.412f)
                close()
                moveTo(16.082f, 12.39f)
                lineTo(9.429f, 16.23f)
                arcToRelative(0.486f, 0.486f, 0.0f, false, true, -0.728f, -0.42f)
                lineTo(8.701f, 8.126f)
                arcToRelative(0.485f, 0.485f, 0.0f, false, true, 0.728f, -0.42f)
                lineToRelative(6.653f, 3.84f)
                curveToRelative(0.232f, 0.135f, 0.31f, 0.432f, 0.176f, 0.664f)
                arcToRelative(0.471f, 0.471f, 0.0f, false, true, -0.176f, 0.18f)
                close()
            }
        }
        .build()
        return _playFilled!!
    }

private var _playFilled: ImageVector? = null
