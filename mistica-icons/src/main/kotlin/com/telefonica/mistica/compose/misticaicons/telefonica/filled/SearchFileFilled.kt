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

public val FilledGroup.SearchFileFilled: ImageVector
    get() {
        if (_searchFileFilled != null) {
            return _searchFileFilled!!
        }
        _searchFileFilled = Builder(name = "SearchFileFilled", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.647f, 8.034f)
                verticalLineToRelative(-0.009f)
                curveToRelative(0.0f, -0.014f, 0.0f, -0.025f, -0.003f, -0.039f)
                verticalLineToRelative(-0.014f)
                lineToRelative(-0.008f, -0.05f)
                curveToRelative(-0.003f, -0.017f, -0.009f, -0.031f, -0.011f, -0.048f)
                curveToRelative(0.0f, -0.006f, -0.003f, -0.008f, -0.006f, -0.014f)
                curveToRelative(-0.003f, -0.011f, -0.008f, -0.022f, -0.014f, -0.036f)
                lineToRelative(-0.006f, -0.012f)
                curveToRelative(-0.005f, -0.017f, -0.014f, -0.03f, -0.022f, -0.045f)
                lineToRelative(-0.025f, -0.042f)
                lineToRelative(-0.009f, -0.01f)
                lineToRelative(-0.022f, -0.032f)
                lineToRelative(-0.008f, -0.01f)
                curveToRelative(-0.012f, -0.015f, -0.023f, -0.026f, -0.034f, -0.037f)
                lineToRelative(-5.462f, -5.462f)
                curveToRelative(-0.011f, -0.012f, -0.025f, -0.023f, -0.037f, -0.034f)
                lineToRelative(-0.01f, -0.008f)
                lineToRelative(-0.032f, -0.023f)
                lineToRelative(-0.01f, -0.008f)
                lineToRelative(-0.043f, -0.025f)
                curveToRelative(-0.014f, -0.009f, -0.03f, -0.014f, -0.045f, -0.023f)
                lineToRelative(-0.01f, -0.005f)
                curveToRelative(-0.012f, -0.006f, -0.023f, -0.009f, -0.037f, -0.014f)
                horizontalLineToRelative(-0.012f)
                arcToRelative(0.237f, 0.237f, 0.0f, false, false, -0.047f, -0.012f)
                lineToRelative(-0.05f, -0.008f)
                horizontalLineToRelative(-0.015f)
                curveToRelative(-0.014f, 0.0f, -0.025f, -0.003f, -0.039f, -0.003f)
                horizontalLineToRelative(-0.008f)
                curveToRelative(-2.782f, -0.003f, -5.927f, 0.0f, -6.51f, 0.0f)
                curveToRelative(-0.711f, 0.0f, -1.151f, 0.44f, -1.151f, 1.149f)
                verticalLineToRelative(2.28f)
                arcToRelative(5.803f, 5.803f, 0.0f, false, false, -2.538f, 9.168f)
                lineTo(2.16f, 17.994f)
                arcToRelative(0.562f, 0.562f, 0.0f, false, false, 0.806f, 0.779f)
                lineToRelative(3.25f, -3.375f)
                arcToRelative(5.776f, 5.776f, 0.0f, false, false, 1.748f, 0.988f)
                verticalLineToRelative(4.115f)
                curveToRelative(0.0f, 0.715f, 0.442f, 1.16f, 1.154f, 1.16f)
                horizontalLineToRelative(11.397f)
                curveToRelative(0.684f, 0.0f, 1.13f, -0.445f, 1.13f, -1.132f)
                curveToRelative(0.002f, -0.442f, 0.002f, -8.235f, 0.002f, -12.495f)
                close()
                moveTo(19.734f, 7.474f)
                horizontalLineToRelative(-1.378f)
                curveToRelative(-0.653f, 0.0f, -1.2f, -0.205f, -1.583f, -0.589f)
                curveToRelative(-0.384f, -0.384f, -0.585f, -0.933f, -0.585f, -1.585f)
                lineTo(16.188f, 3.922f)
                lineToRelative(1.773f, 1.773f)
                lineToRelative(1.773f, 1.778f)
                close()
                moveTo(6.583f, 7.602f)
                arcToRelative(4.68f, 4.68f, 0.0f, true, true, 6.619f, 6.619f)
                arcToRelative(4.68f, 4.68f, 0.0f, false, true, -6.62f, -6.619f)
                close()
            }
        }
        .build()
        return _searchFileFilled!!
    }

private var _searchFileFilled: ImageVector? = null
