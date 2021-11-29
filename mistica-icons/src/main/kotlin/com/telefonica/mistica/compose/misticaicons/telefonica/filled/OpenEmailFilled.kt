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

public val FilledGroup.OpenEmailFilled: ImageVector
    get() {
        if (_openEmailFilled != null) {
            return _openEmailFilled!!
        }
        _openEmailFilled = Builder(name = "OpenEmailFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.636f, 14.536f)
                arcToRelative(1.684f, 1.684f, 0.0f, false, true, -0.919f, 0.292f)
                arcToRelative(1.815f, 1.815f, 0.0f, false, true, -0.963f, -0.297f)
                lineTo(3.24f, 9.794f)
                verticalLineToRelative(-0.003f)
                curveToRelative(0.011f, -0.386f, 0.106f, -0.664f, 0.25f, -0.767f)
                lineToRelative(7.408f, -4.684f)
                arcToRelative(1.84f, 1.84f, 0.0f, false, true, 0.95f, -0.271f)
                curveToRelative(0.532f, 0.0f, 0.935f, 0.269f, 0.963f, 0.288f)
                lineToRelative(7.359f, 4.65f)
                curveToRelative(0.151f, 0.106f, 0.24f, 0.347f, 0.263f, 0.667f)
                lineToRelative(-7.798f, 4.862f)
                close()
                moveTo(21.672f, 19.567f)
                lineTo(21.681f, 9.763f)
                curveToRelative(-0.023f, -1.002f, -0.44f, -1.51f, -0.815f, -1.776f)
                lineToRelative(-7.359f, -4.65f)
                arcToRelative(3.025f, 3.025f, 0.0f, false, false, -1.67f, -0.5f)
                curveToRelative(-0.927f, 0.0f, -1.582f, 0.447f, -1.624f, 0.48f)
                lineToRelative(-7.283f, 4.6f)
                lineToRelative(-0.137f, 0.087f)
                curveToRelative(-0.348f, 0.25f, -0.765f, 0.757f, -0.787f, 1.773f)
                lineToRelative(0.008f, 9.793f)
                curveToRelative(-0.025f, 0.219f, -0.062f, 0.902f, 0.4f, 1.457f)
                curveToRelative(0.25f, 0.3f, 0.734f, 0.658f, 1.63f, 0.677f)
                horizontalLineToRelative(15.597f)
                curveToRelative(0.894f, -0.016f, 1.379f, -0.378f, 1.628f, -0.677f)
                curveToRelative(0.465f, -0.558f, 0.428f, -1.238f, 0.403f, -1.46f)
                close()
            }
        }
        .build()
        return _openEmailFilled!!
    }

private var _openEmailFilled: ImageVector? = null
