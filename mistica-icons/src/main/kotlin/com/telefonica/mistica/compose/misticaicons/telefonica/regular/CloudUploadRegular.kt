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

public val RegularGroup.CloudUploadRegular: ImageVector
    get() {
        if (_cloudUploadRegular != null) {
            return _cloudUploadRegular!!
        }
        _cloudUploadRegular = Builder(name = "CloudUploadRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.567f, 16.647f)
                lineToRelative(-1.846f, 0.008f)
                verticalLineToRelative(-1.131f)
                horizontalLineToRelative(1.443f)
                curveToRelative(0.33f, 0.0f, 0.627f, -0.208f, 0.756f, -0.516f)
                arcToRelative(0.878f, 0.878f, 0.0f, false, false, -0.168f, -0.921f)
                lineToRelative(-4.117f, -4.381f)
                arcToRelative(0.837f, 0.837f, 0.0f, false, false, -1.177f, 0.0f)
                lineTo(7.237f, 14.17f)
                arcToRelative(0.878f, 0.878f, 0.0f, false, false, -0.168f, 0.921f)
                arcToRelative(0.817f, 0.817f, 0.0f, false, false, 0.764f, 0.516f)
                horizontalLineToRelative(1.443f)
                verticalLineToRelative(1.073f)
                lineToRelative(-2.779f, 0.016f)
                curveToRelative(-0.944f, 0.0f, -3.134f, -0.308f, -3.134f, -3.215f)
                curveToRelative(0.0f, -1.63f, 0.678f, -2.65f, 2.014f, -3.042f)
                arcToRelative(0.637f, 0.637f, 0.0f, false, false, 0.442f, -0.617f)
                lineToRelative(-0.008f, -0.1f)
                curveToRelative(0.0f, -4.762f, 4.028f, -5.127f, 5.263f, -5.127f)
                curveToRelative(0.7f, 0.0f, 4.238f, 0.157f, 5.076f, 3.373f)
                arcToRelative(0.605f, 0.605f, 0.0f, false, false, 0.563f, 0.465f)
                curveToRelative(1.176f, 0.034f, 3.916f, 0.499f, 3.916f, 4.09f)
                curveToRelative(-0.003f, 3.823f, -3.104f, 4.123f, -4.062f, 4.123f)
                close()
                moveTo(13.503f, 19.33f)
                lineTo(10.48f, 19.33f)
                verticalLineToRelative(-4.112f)
                arcToRelative(0.84f, 0.84f, 0.0f, false, false, -0.83f, -0.848f)
                lineToRelative(-0.91f, -0.009f)
                lineToRelative(3.305f, -3.49f)
                lineToRelative(3.2f, 3.406f)
                horizontalLineToRelative(-0.903f)
                curveToRelative(-0.45f, 0.0f, -0.82f, 0.376f, -0.829f, 0.849f)
                lineToRelative(-0.011f, 4.204f)
                close()
                moveTo(17.178f, 7.213f)
                curveToRelative(-1.24f, -3.673f, -5.277f, -3.863f, -6.11f, -3.863f)
                curveToRelative(-1.055f, 0.0f, -6.277f, 0.291f, -6.461f, 6.042f)
                curveToRelative(-1.073f, 0.44f, -2.457f, 1.504f, -2.457f, 4.087f)
                curveToRelative(0.0f, 3.288f, 2.24f, 4.462f, 4.345f, 4.462f)
                lineToRelative(2.778f, -0.017f)
                verticalLineToRelative(1.804f)
                curveToRelative(0.0f, 0.465f, 0.362f, 0.846f, 0.821f, 0.846f)
                horizontalLineToRelative(3.795f)
                curveToRelative(0.451f, 0.0f, 0.821f, -0.38f, 0.821f, -0.846f)
                lineTo(14.71f, 17.9f)
                lineToRelative(1.855f, -0.008f)
                curveToRelative(2.434f, 0.0f, 5.268f, -1.404f, 5.268f, -5.367f)
                curveToRelative(0.003f, -3.597f, -2.324f, -5.084f, -4.655f, -5.311f)
                close()
            }
        }
        .build()
        return _cloudUploadRegular!!
    }

private var _cloudUploadRegular: ImageVector? = null
