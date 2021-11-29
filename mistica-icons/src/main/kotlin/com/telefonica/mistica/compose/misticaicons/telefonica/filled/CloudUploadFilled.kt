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

public val FilledGroup.CloudUploadFilled: ImageVector
    get() {
        if (_cloudUploadFilled != null) {
            return _cloudUploadFilled!!
        }
        _cloudUploadFilled = Builder(name = "CloudUploadFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.548f, 14.807f)
                arcToRelative(0.338f, 0.338f, 0.0f, false, true, -0.303f, 0.201f)
                horizontalLineToRelative(-1.854f)
                curveToRelative(-0.076f, 0.0f, -0.126f, 0.05f, -0.132f, 0.126f)
                verticalLineToRelative(4.594f)
                lineToRelative(-4.543f, -0.008f)
                verticalLineToRelative(-1.964f)
                curveToRelative(0.008f, -0.008f, 0.008f, -0.008f, 0.008f, -0.017f)
                verticalLineToRelative(-2.52f)
                arcToRelative(0.118f, 0.118f, 0.0f, false, false, -0.123f, -0.118f)
                lineToRelative(-1.868f, -0.009f)
                arcToRelative(0.312f, 0.312f, 0.0f, false, true, -0.294f, -0.204f)
                arcToRelative(0.316f, 0.316f, 0.0f, false, true, 0.064f, -0.364f)
                lineToRelative(4.302f, -4.544f)
                arcToRelative(0.313f, 0.313f, 0.0f, false, true, 0.233f, -0.1f)
                curveToRelative(0.09f, 0.0f, 0.17f, 0.041f, 0.238f, 0.1f)
                lineToRelative(4.205f, 4.46f)
                curveToRelative(0.09f, 0.103f, 0.114f, 0.238f, 0.067f, 0.367f)
                moveToRelative(0.59f, -7.533f)
                curveToRelative(-1.176f, -3.73f, -5.265f, -3.924f, -6.086f, -3.924f)
                curveToRelative(-1.062f, 0.0f, -6.294f, 0.297f, -6.4f, 6.092f)
                curveToRelative(-1.054f, 0.39f, -2.502f, 1.407f, -2.502f, 4.02f)
                curveToRelative(0.0f, 3.188f, 2.18f, 4.33f, 4.23f, 4.33f)
                lineToRelative(2.515f, -0.016f)
                verticalLineToRelative(2.039f)
                curveToRelative(0.0f, 0.423f, 0.361f, 0.762f, 0.798f, 0.762f)
                horizontalLineToRelative(4.591f)
                curveToRelative(0.435f, 0.0f, 0.799f, -0.34f, 0.799f, -0.754f)
                verticalLineToRelative(-2.08f)
                lineToRelative(1.58f, -0.01f)
                curveToRelative(0.862f, 0.0f, 5.173f, -0.254f, 5.173f, -5.246f)
                curveToRelative(0.0f, -4.364f, -3.283f, -5.1f, -4.697f, -5.213f)
            }
        }
        .build()
        return _cloudUploadFilled!!
    }

private var _cloudUploadFilled: ImageVector? = null
