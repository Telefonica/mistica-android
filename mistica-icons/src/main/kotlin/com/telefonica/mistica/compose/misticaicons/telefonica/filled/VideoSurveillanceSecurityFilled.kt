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

public val FilledGroup.VideoSurveillanceSecurityFilled: ImageVector
    get() {
        if (_videoSurveillanceSecurityFilled != null) {
            return _videoSurveillanceSecurityFilled!!
        }
        _videoSurveillanceSecurityFilled = Builder(name = "VideoSurveillanceSecurityFilled",
                defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f,
                viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.087f, 10.748f)
                arcToRelative(0.124f, 0.124f, 0.0f, false, true, -0.152f, 0.09f)
                lineToRelative(-0.736f, -0.188f)
                lineToRelative(0.426f, -1.67f)
                lineToRelative(0.736f, 0.188f)
                arcToRelative(0.122f, 0.122f, 0.0f, false, true, 0.09f, 0.148f)
                lineToRelative(-0.364f, 1.432f)
                close()
                moveTo(21.496f, 8.591f)
                arcToRelative(1.344f, 1.344f, 0.0f, false, false, -0.83f, -0.619f)
                lineToRelative(-0.736f, -0.188f)
                lineToRelative(0.202f, -0.795f)
                curveToRelative(0.095f, -0.378f, 0.039f, -0.77f, -0.16f, -1.107f)
                arcToRelative(1.44f, 1.44f, 0.0f, false, false, -0.894f, -0.67f)
                lineTo(6.74f, 2.073f)
                arcToRelative(1.459f, 1.459f, 0.0f, false, false, -1.773f, 1.051f)
                verticalLineToRelative(0.006f)
                lineToRelative(-1.288f, 5.07f)
                arcToRelative(1.466f, 1.466f, 0.0f, false, false, 1.056f, 1.779f)
                lineToRelative(5.935f, 1.51f)
                lineToRelative(-2.112f, 5.985f)
                horizontalLineToRelative(-2.58f)
                verticalLineToRelative(-2.535f)
                arcToRelative(1.46f, 1.46f, 0.0f, false, false, -1.459f, -1.462f)
                lineTo(3.46f, 13.477f)
                curveToRelative(-0.804f, 0.0f, -1.459f, 0.656f, -1.459f, 1.46f)
                verticalLineToRelative(5.316f)
                curveToRelative(0.0f, 0.807f, 0.655f, 1.46f, 1.46f, 1.46f)
                horizontalLineToRelative(1.053f)
                arcToRelative(1.46f, 1.46f, 0.0f, false, false, 1.459f, -1.463f)
                lineTo(5.973f, 18.7f)
                horizontalLineToRelative(3.014f)
                curveToRelative(0.26f, 0.0f, 0.493f, -0.165f, 0.58f, -0.409f)
                lineToRelative(2.294f, -6.501f)
                lineToRelative(5.204f, 1.325f)
                arcToRelative(1.458f, 1.458f, 0.0f, false, false, 1.773f, -1.056f)
                lineToRelative(0.056f, -0.216f)
                lineToRelative(0.737f, 0.188f)
                arcToRelative(1.357f, 1.357f, 0.0f, false, false, 1.647f, -0.98f)
                lineToRelative(0.364f, -1.435f)
                arcToRelative(1.34f, 1.34f, 0.0f, false, false, -0.145f, -1.025f)
                close()
            }
        }
        .build()
        return _videoSurveillanceSecurityFilled!!
    }

private var _videoSurveillanceSecurityFilled: ImageVector? = null
