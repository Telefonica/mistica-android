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

public val FilledGroup.WebFilled: ImageVector
    get() {
        if (_webFilled != null) {
            return _webFilled!!
        }
        _webFilled = Builder(name = "WebFilled", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.655f, 10.357f)
                lineToRelative(2.729f, 2.384f)
                arcToRelative(0.57f, 0.57f, 0.0f, false, true, 0.006f, 0.857f)
                lineTo(6.66f, 16.027f)
                arcToRelative(0.595f, 0.595f, 0.0f, false, true, -0.409f, 0.154f)
                arcToRelative(0.61f, 0.61f, 0.0f, false, true, -0.442f, -0.188f)
                arcToRelative(0.566f, 0.566f, 0.0f, false, true, 0.01f, -0.801f)
                curveToRelative(0.01f, -0.006f, 0.015f, -0.014f, 0.023f, -0.02f)
                lineToRelative(2.244f, -1.997f)
                lineToRelative(-2.238f, -1.958f)
                arcToRelative(0.567f, 0.567f, 0.0f, false, true, -0.062f, -0.798f)
                curveToRelative(0.006f, -0.009f, 0.014f, -0.014f, 0.02f, -0.023f)
                arcToRelative(0.615f, 0.615f, 0.0f, false, true, 0.848f, -0.039f)
                close()
                moveTo(17.336f, 12.612f)
                curveToRelative(0.333f, 0.0f, 0.605f, 0.26f, 0.605f, 0.58f)
                curveToRelative(0.0f, 0.32f, -0.272f, 0.58f, -0.602f, 0.58f)
                lineTo(10.87f, 13.772f)
                arcToRelative(0.596f, 0.596f, 0.0f, false, true, -0.605f, -0.58f)
                curveToRelative(0.0f, -0.32f, 0.272f, -0.583f, 0.605f, -0.583f)
                lineToRelative(6.465f, 0.003f)
                close()
                moveTo(20.258f, 18.127f)
                arcToRelative(0.22f, 0.22f, 0.0f, false, false, 0.224f, -0.215f)
                lineTo(20.482f, 8.248f)
                lineTo(3.204f, 8.248f)
                verticalLineToRelative(9.664f)
                curveToRelative(0.0f, 0.117f, 0.101f, 0.215f, 0.225f, 0.215f)
                horizontalLineToRelative(16.829f)
                close()
                moveTo(5.188f, 6.732f)
                arcToRelative(0.548f, 0.548f, 0.0f, false, false, -0.558f, -0.537f)
                horizontalLineToRelative(-0.003f)
                arcToRelative(0.548f, 0.548f, 0.0f, false, false, -0.557f, 0.537f)
                curveToRelative(0.0f, 0.297f, 0.25f, 0.538f, 0.557f, 0.538f)
                arcToRelative(0.548f, 0.548f, 0.0f, false, false, 0.56f, -0.538f)
                close()
                moveTo(6.866f, 6.732f)
                arcToRelative(0.548f, 0.548f, 0.0f, false, false, -0.558f, -0.537f)
                horizontalLineToRelative(-0.003f)
                arcToRelative(0.548f, 0.548f, 0.0f, false, false, -0.557f, 0.537f)
                curveToRelative(0.0f, 0.297f, 0.25f, 0.538f, 0.557f, 0.538f)
                arcToRelative(0.548f, 0.548f, 0.0f, false, false, 0.56f, -0.538f)
                close()
                moveTo(8.543f, 6.732f)
                arcToRelative(0.548f, 0.548f, 0.0f, false, false, -0.557f, -0.537f)
                horizontalLineToRelative(-0.003f)
                arcToRelative(0.548f, 0.548f, 0.0f, false, false, -0.557f, 0.537f)
                curveToRelative(0.0f, 0.297f, 0.25f, 0.538f, 0.557f, 0.538f)
                arcToRelative(0.548f, 0.548f, 0.0f, false, false, 0.56f, -0.538f)
                close()
                moveTo(20.258f, 4.525f)
                curveToRelative(0.787f, 0.0f, 1.428f, 0.62f, 1.428f, 1.378f)
                verticalLineToRelative(12.009f)
                curveToRelative(0.0f, 0.759f, -0.641f, 1.378f, -1.428f, 1.378f)
                lineTo(3.428f, 19.29f)
                curveToRelative(-0.79f, 0.0f, -1.428f, -0.616f, -1.428f, -1.375f)
                lineTo(2.0f, 5.903f)
                curveToRelative(0.0f, -0.759f, 0.639f, -1.378f, 1.429f, -1.378f)
                horizontalLineToRelative(16.829f)
                close()
            }
        }
        .build()
        return _webFilled!!
    }

private var _webFilled: ImageVector? = null
