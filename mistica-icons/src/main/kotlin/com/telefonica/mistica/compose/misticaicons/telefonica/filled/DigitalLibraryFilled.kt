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

public val FilledGroup.DigitalLibraryFilled: ImageVector
    get() {
        if (_digitalLibraryFilled != null) {
            return _digitalLibraryFilled!!
        }
        _digitalLibraryFilled = Builder(name = "DigitalLibraryFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.263f, 17.68f)
                arcToRelative(13.95f, 13.95f, 0.0f, false, false, -4.428f, 0.958f)
                verticalLineToRelative(-7.152f)
                curveToRelative(1.661f, -0.81f, 3.524f, -0.927f, 4.428f, -0.93f)
                verticalLineToRelative(7.124f)
                close()
                moveTo(7.63f, 18.635f)
                arcToRelative(13.978f, 13.978f, 0.0f, false, false, -4.425f, -0.958f)
                verticalLineToRelative(-7.118f)
                arcToRelative(12.452f, 12.452f, 0.0f, false, true, 2.619f, 0.303f)
                curveToRelative(0.028f, 0.005f, 0.056f, 0.016f, 0.084f, 0.022f)
                curveToRelative(0.168f, 0.042f, 0.336f, 0.084f, 0.507f, 0.137f)
                curveToRelative(0.078f, 0.025f, 0.16f, 0.053f, 0.24f, 0.082f)
                curveToRelative(0.124f, 0.039f, 0.244f, 0.078f, 0.368f, 0.126f)
                curveToRelative(0.204f, 0.078f, 0.409f, 0.165f, 0.61f, 0.263f)
                lineToRelative(-0.003f, 7.143f)
                close()
                moveTo(18.53f, 15.497f)
                curveToRelative(1.008f, 0.0f, 1.803f, -0.3f, 2.355f, -0.89f)
                curveToRelative(0.53f, -0.566f, 0.801f, -1.359f, 0.801f, -2.359f)
                lineTo(21.686f, 7.024f)
                curveToRelative(0.0f, -1.0f, -0.271f, -1.79f, -0.803f, -2.35f)
                curveTo(20.33f, 4.09f, 19.54f, 3.8f, 18.53f, 3.8f)
                lineToRelative(-10.79f, 0.006f)
                curveToRelative(-1.012f, 0.0f, -1.801f, 0.294f, -2.353f, 0.874f)
                curveToRelative(-0.532f, 0.563f, -0.804f, 1.352f, -0.804f, 2.352f)
                verticalLineToRelative(2.365f)
                arcToRelative(11.85f, 11.85f, 0.0f, false, false, -2.028f, -0.06f)
                arcToRelative(0.607f, 0.607f, 0.0f, false, false, -0.555f, 0.617f)
                verticalLineToRelative(8.33f)
                arcToRelative(0.61f, 0.61f, 0.0f, false, false, 0.602f, 0.62f)
                curveToRelative(3.031f, 0.0f, 5.33f, 1.212f, 5.353f, 1.226f)
                curveToRelative(0.087f, 0.048f, 0.182f, 0.07f, 0.28f, 0.073f)
                curveToRelative(0.009f, 0.0f, 0.014f, -0.005f, 0.023f, -0.005f)
                arcToRelative(0.636f, 0.636f, 0.0f, false, false, 0.258f, -0.065f)
                curveToRelative(0.022f, -0.01f, 2.305f, -1.227f, 5.353f, -1.227f)
                arcToRelative(0.612f, 0.612f, 0.0f, false, false, 0.602f, -0.619f)
                verticalLineToRelative(-0.77f)
                horizontalLineToRelative(6.616f)
                arcToRelative(0.612f, 0.612f, 0.0f, false, false, 0.602f, -0.619f)
                arcToRelative(0.609f, 0.609f, 0.0f, false, false, -0.602f, -0.619f)
                horizontalLineToRelative(-6.62f)
                verticalLineToRelative(-0.776f)
                lineToRelative(4.063f, -0.006f)
                close()
            }
        }
        .build()
        return _digitalLibraryFilled!!
    }

private var _digitalLibraryFilled: ImageVector? = null
