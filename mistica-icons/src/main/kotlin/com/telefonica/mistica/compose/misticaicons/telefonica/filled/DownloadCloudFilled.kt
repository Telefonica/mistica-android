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

public val FilledGroup.DownloadCloudFilled: ImageVector
    get() {
        if (_downloadCloudFilled != null) {
            return _downloadCloudFilled!!
        }
        _downloadCloudFilled = Builder(name = "DownloadCloudFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.015f, 16.512f)
                lineToRelative(-0.46f, 0.476f)
                lineToRelative(-4.542f, 4.091f)
                lineToRelative(-4.467f, -4.082f)
                lineToRelative(-0.56f, -0.587f)
                arcToRelative(0.352f, 0.352f, 0.0f, false, true, -0.073f, -0.392f)
                arcToRelative(0.357f, 0.357f, 0.0f, false, true, 0.338f, -0.235f)
                horizontalLineTo(9.33f)
                arcToRelative(0.144f, 0.144f, 0.0f, false, false, 0.138f, -0.142f)
                verticalLineToRelative(-5.068f)
                curveToRelative(0.0f, -0.197f, 0.165f, -0.364f, 0.366f, -0.364f)
                horizontalLineToRelative(4.323f)
                curveToRelative(0.203f, 0.0f, 0.366f, 0.16f, 0.366f, 0.361f)
                verticalLineToRelative(0.003f)
                lineToRelative(0.019f, 5.173f)
                curveToRelative(0.0f, 0.074f, 0.056f, 0.139f, 0.138f, 0.139f)
                horizontalLineToRelative(2.069f)
                curveToRelative(0.156f, 0.0f, 0.285f, 0.083f, 0.34f, 0.222f)
                arcToRelative(0.392f, 0.392f, 0.0f, false, true, -0.074f, 0.405f)
                moveToRelative(0.735f, -9.18f)
                curveTo(16.436f, 3.216f, 11.865f, 3.0f, 10.948f, 3.0f)
                curveToRelative(-1.186f, 0.0f, -7.024f, 0.328f, -7.153f, 6.714f)
                curveTo(2.618f, 10.154f, 1.0f, 11.274f, 1.0f, 14.152f)
                curveToRelative(0.0f, 3.528f, 2.435f, 4.78f, 4.727f, 4.78f)
                lineToRelative(2.545f, -0.01f)
                lineToRelative(3.133f, 2.865f)
                arcToRelative(0.957f, 0.957f, 0.0f, false, false, 0.617f, 0.213f)
                curveToRelative(0.228f, 0.0f, 0.45f, -0.074f, 0.635f, -0.222f)
                lineToRelative(3.19f, -2.905f)
                lineToRelative(1.371f, -0.01f)
                curveToRelative(0.964f, 0.0f, 5.782f, -0.271f, 5.782f, -5.79f)
                curveToRelative(0.0f, -4.814f, -3.669f, -5.617f, -5.25f, -5.74f)
            }
        }
        .build()
        return _downloadCloudFilled!!
    }

private var _downloadCloudFilled: ImageVector? = null
