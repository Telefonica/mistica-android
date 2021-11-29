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

public val FilledGroup.DownloadFilled: ImageVector
    get() {
        if (_downloadFilled != null) {
            return _downloadFilled!!
        }
        _downloadFilled = Builder(name = "DownloadFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.83f, 21.67f)
                arcToRelative(0.949f, 0.949f, 0.0f, false, true, -0.726f, -0.337f)
                lineToRelative(-8.84f, -9.143f)
                curveToRelative(-0.012f, -0.01f, -0.02f, -0.022f, -0.032f, -0.033f)
                arcToRelative(1.01f, 1.01f, 0.0f, false, true, -0.128f, -1.079f)
                arcToRelative(0.958f, 0.958f, 0.0f, false, true, 0.87f, -0.56f)
                horizontalLineToRelative(3.934f)
                verticalLineTo(3.922f)
                curveToRelative(0.0f, -1.05f, 0.854f, -1.905f, 1.904f, -1.905f)
                horizontalLineToRelative(6.031f)
                curveToRelative(1.053f, 0.0f, 1.905f, 0.851f, 1.905f, 1.905f)
                lineToRelative(-0.003f, 6.596f)
                horizontalLineToRelative(3.96f)
                curveToRelative(0.376f, 0.0f, 0.718f, 0.219f, 0.875f, 0.56f)
                curveToRelative(0.17f, 0.353f, 0.12f, 0.776f, -0.13f, 1.079f)
                curveToRelative(-0.008f, 0.011f, -0.019f, 0.022f, -0.03f, 0.033f)
                lineToRelative(-8.863f, 9.143f)
                arcToRelative(0.959f, 0.959f, 0.0f, false, true, -0.728f, 0.336f)
                close()
            }
        }
        .build()
        return _downloadFilled!!
    }

private var _downloadFilled: ImageVector? = null
