package com.telefonica.mistica.compose.misticaicons.telefonica.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.telefonica.RegularGroup

public val RegularGroup.DownloadRegular: ImageVector
    get() {
        if (_downloadRegular != null) {
            return _downloadRegular!!
        }
        _downloadRegular = Builder(name = "DownloadRegular", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(3.212f, 11.607f)
                lineToRelative(8.619f, 8.913f)
                lineToRelative(8.641f, -8.913f)
                horizontalLineTo(16.63f)
                curveToRelative(-0.535f, 0.0f, -0.972f, -0.448f, -0.972f, -0.997f)
                lineToRelative(0.003f, -6.687f)
                arcToRelative(0.816f, 0.816f, 0.0f, false, false, -0.815f, -0.818f)
                horizontalLineToRelative(-6.03f)
                arcTo(0.816f, 0.816f, 0.0f, false, false, 8.0f, 3.922f)
                verticalLineToRelative(6.686f)
                curveToRelative(0.0f, 0.549f, -0.437f, 0.997f, -0.972f, 0.997f)
                horizontalLineTo(3.213f)
                verticalLineToRelative(0.003f)
                close()
            }
        }
        .build()
        return _downloadRegular!!
    }

private var _downloadRegular: ImageVector? = null
