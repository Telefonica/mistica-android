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

public val FilledGroup.FileImageFilled: ImageVector
    get() {
        if (_fileImageFilled != null) {
            return _fileImageFilled!!
        }
        _fileImageFilled = Builder(name = "FileImageFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.55f, 7.661f)
                lineToRelative(-4.042f, -3.978f)
                verticalLineToRelative(1.762f)
                curveToRelative(0.0f, 0.656f, 0.21f, 1.21f, 0.614f, 1.605f)
                curveToRelative(0.406f, 0.398f, 0.98f, 0.611f, 1.66f, 0.611f)
                horizontalLineToRelative(1.768f)
                close()
                moveTo(19.197f, 7.767f)
                curveToRelative(0.031f, 0.073f, 0.048f, 0.155f, 0.048f, 0.239f)
                verticalLineToRelative(12.28f)
                arcToRelative(1.4f, 1.4f, 0.0f, false, true, -1.384f, 1.38f)
                lineTo(5.895f, 21.666f)
                curveToRelative(-0.737f, 0.0f, -1.384f, -0.644f, -1.384f, -1.38f)
                lineTo(4.511f, 3.4f)
                curveToRelative(0.0f, -0.723f, 0.658f, -1.381f, 1.384f, -1.381f)
                horizontalLineToRelative(7.283f)
                curveToRelative(0.227f, 0.0f, 0.442f, 0.086f, 0.602f, 0.246f)
                lineToRelative(5.205f, 5.118f)
                curveToRelative(0.106f, 0.103f, 0.17f, 0.24f, 0.212f, 0.383f)
                close()
                moveTo(16.088f, 9.731f)
                horizontalLineToRelative(-8.42f)
                curveToRelative(-0.555f, 0.0f, -1.022f, 0.429f, -1.022f, 0.933f)
                verticalLineToRelative(7.815f)
                curveToRelative(0.0f, 0.504f, 0.467f, 0.936f, 1.02f, 0.936f)
                horizontalLineToRelative(8.42f)
                curveToRelative(0.543f, 0.0f, 1.02f, -0.437f, 1.02f, -0.936f)
                verticalLineToRelative(-7.815f)
                curveToRelative(0.005f, -0.496f, -0.474f, -0.933f, -1.018f, -0.933f)
                close()
                moveTo(9.494f, 14.131f)
                arcToRelative(0.864f, 0.864f, 0.0f, false, true, -0.857f, -0.87f)
                curveToRelative(0.0f, -0.482f, 0.384f, -0.872f, 0.857f, -0.872f)
                curveToRelative(0.474f, 0.0f, 0.858f, 0.39f, 0.858f, 0.871f)
                arcToRelative(0.867f, 0.867f, 0.0f, false, true, -0.858f, 0.872f)
                close()
                moveTo(8.738f, 17.585f)
                arcToRelative(0.512f, 0.512f, 0.0f, false, true, -0.398f, -0.19f)
                arcToRelative(0.536f, 0.536f, 0.0f, false, true, 0.068f, -0.742f)
                lineToRelative(2.437f, -2.065f)
                arcToRelative(0.517f, 0.517f, 0.0f, false, true, 0.686f, 0.02f)
                lineToRelative(0.269f, 0.258f)
                lineToRelative(1.557f, -1.261f)
                arcToRelative(0.506f, 0.506f, 0.0f, false, true, 0.633f, -0.006f)
                lineToRelative(1.499f, 1.168f)
                arcToRelative(0.534f, 0.534f, 0.0f, false, true, 0.098f, 0.737f)
                arcToRelative(0.51f, 0.51f, 0.0f, false, true, -0.726f, 0.098f)
                lineToRelative(-1.179f, -0.919f)
                lineToRelative(-1.126f, 0.91f)
                lineToRelative(0.714f, 0.687f)
                arcToRelative(0.531f, 0.531f, 0.0f, false, true, 0.023f, 0.742f)
                arcToRelative(0.513f, 0.513f, 0.0f, false, true, -0.731f, 0.023f)
                lineToRelative(-1.41f, -1.35f)
                lineToRelative(-2.086f, 1.767f)
                arcToRelative(0.497f, 0.497f, 0.0f, false, true, -0.328f, 0.123f)
                close()
            }
        }
        .build()
        return _fileImageFilled!!
    }

private var _fileImageFilled: ImageVector? = null
