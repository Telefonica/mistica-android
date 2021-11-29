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

public val RegularGroup.DownloadCloudRegular: ImageVector
    get() {
        if (_downloadCloudRegular != null) {
            return _downloadCloudRegular!!
        }
        _downloadCloudRegular = Builder(name = "DownloadCloudRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.115f, 17.656f)
                horizontalLineToRelative(-0.532f)
                lineToRelative(0.739f, -0.769f)
                arcToRelative(0.969f, 0.969f, 0.0f, false, false, 0.187f, -1.016f)
                arcToRelative(0.928f, 0.928f, 0.0f, false, false, -0.854f, -0.569f)
                horizontalLineToRelative(-1.603f)
                lineToRelative(-0.01f, -4.646f)
                arcToRelative(0.935f, 0.935f, 0.0f, false, false, -0.926f, -0.924f)
                lineTo(9.884f, 9.732f)
                curveToRelative(-0.513f, 0.0f, -0.93f, 0.42f, -0.93f, 0.936f)
                verticalLineToRelative(4.535f)
                lineToRelative(-1.612f, 0.01f)
                arcToRelative(0.91f, 0.91f, 0.0f, false, false, -0.845f, 0.568f)
                arcToRelative(0.942f, 0.942f, 0.0f, false, false, 0.188f, 1.016f)
                lineToRelative(0.873f, 0.918f)
                lineToRelative(-1.703f, 0.01f)
                curveToRelative(-1.055f, 0.0f, -3.503f, -0.34f, -3.503f, -3.547f)
                curveToRelative(0.0f, -1.798f, 0.758f, -2.935f, 2.251f, -3.365f)
                arcToRelative(0.668f, 0.668f, 0.0f, false, false, 0.485f, -0.67f)
                verticalLineToRelative(-0.12f)
                curveToRelative(0.0f, -5.243f, 4.502f, -5.645f, 5.882f, -5.645f)
                curveToRelative(0.783f, 0.0f, 4.736f, 0.173f, 5.663f, 3.72f)
                arcToRelative(0.69f, 0.69f, 0.0f, false, false, 0.638f, 0.512f)
                curveToRelative(1.315f, 0.037f, 4.377f, 0.55f, 4.377f, 4.511f)
                curveToRelative(0.003f, 4.214f, -3.472f, 4.535f, -4.533f, 4.535f)
                close()
                moveTo(12.063f, 20.434f)
                lineTo(8.372f, 16.575f)
                horizontalLineToRelative(1.017f)
                curveToRelative(0.514f, 0.0f, 0.917f, -0.41f, 0.917f, -0.933f)
                verticalLineToRelative(-4.535f)
                horizontalLineToRelative(3.388f)
                lineToRelative(0.009f, 4.637f)
                curveToRelative(0.0f, 0.513f, 0.413f, 0.936f, 0.926f, 0.936f)
                horizontalLineToRelative(1.008f)
                lineToRelative(-3.574f, 3.754f)
                close()
                moveTo(17.797f, 7.26f)
                curveTo(16.411f, 3.21f, 11.89f, 3.0f, 10.97f, 3.0f)
                curveToRelative(-1.19f, 0.0f, -7.015f, 0.321f, -7.231f, 6.664f)
                curveTo(2.549f, 10.149f, 1.0f, 11.323f, 1.0f, 14.174f)
                curveToRelative(0.0f, 3.627f, 2.504f, 4.922f, 4.855f, 4.922f)
                lineToRelative(3.018f, -0.019f)
                lineToRelative(2.53f, 2.639f)
                arcToRelative(0.93f, 0.93f, 0.0f, false, false, 0.656f, 0.284f)
                arcToRelative(0.935f, 0.935f, 0.0f, false, false, 0.658f, -0.284f)
                lineToRelative(2.548f, -2.676f)
                lineToRelative(1.847f, -0.009f)
                curveToRelative(2.72f, 0.0f, 5.888f, -1.548f, 5.888f, -5.91f)
                curveToRelative(0.003f, -3.97f, -2.598f, -5.61f, -5.203f, -5.86f)
                close()
            }
        }
        .build()
        return _downloadCloudRegular!!
    }

private var _downloadCloudRegular: ImageVector? = null
