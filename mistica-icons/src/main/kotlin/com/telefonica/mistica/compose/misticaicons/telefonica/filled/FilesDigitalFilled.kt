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

public val FilledGroup.FilesDigitalFilled: ImageVector
    get() {
        if (_filesDigitalFilled != null) {
            return _filesDigitalFilled!!
        }
        _filesDigitalFilled = Builder(name = "FilesDigitalFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.347f, 18.804f)
                lineTo(3.202f, 18.804f)
                lineTo(3.202f, 8.59f)
                lineTo(6.81f, 8.59f)
                verticalLineToRelative(1.134f)
                curveToRelative(0.0f, 0.681f, 0.232f, 1.275f, 0.672f, 1.71f)
                curveToRelative(0.434f, 0.433f, 1.017f, 0.657f, 1.7f, 0.657f)
                horizontalLineToRelative(1.163f)
                verticalLineToRelative(6.712f)
                horizontalLineToRelative(0.002f)
                close()
                moveTo(8.014f, 8.64f)
                lineToRelative(2.289f, 2.219f)
                horizontalLineToRelative(-1.12f)
                curveToRelative(-0.259f, 0.0f, -0.603f, -0.048f, -0.866f, -0.305f)
                curveToRelative(-0.202f, -0.205f, -0.306f, -0.485f, -0.306f, -0.83f)
                lineTo(8.011f, 8.641f)
                horizontalLineToRelative(0.003f)
                close()
                moveTo(18.72f, 15.13f)
                curveToRelative(0.947f, 0.0f, 1.683f, -0.271f, 2.182f, -0.803f)
                curveToRelative(0.49f, -0.51f, 0.731f, -1.241f, 0.731f, -2.18f)
                lineTo(21.633f, 6.636f)
                curveToRelative(0.0f, -0.936f, -0.24f, -1.658f, -0.731f, -2.168f)
                curveToRelative(-0.496f, -0.527f, -1.235f, -0.79f, -2.182f, -0.79f)
                lineToRelative(-11.451f, 0.008f)
                curveToRelative(-0.947f, 0.0f, -1.684f, 0.264f, -2.182f, 0.787f)
                curveToRelative(-0.48f, 0.502f, -0.731f, 1.233f, -0.731f, 2.168f)
                verticalLineToRelative(0.715f)
                lineTo(3.08f, 7.356f)
                curveToRelative(-0.577f, 0.0f, -1.081f, 0.51f, -1.081f, 1.1f)
                verticalLineToRelative(10.485f)
                curveToRelative(0.0f, 0.591f, 0.496f, 1.093f, 1.081f, 1.093f)
                horizontalLineToRelative(7.387f)
                curveToRelative(0.585f, 0.0f, 1.081f, -0.502f, 1.081f, -1.093f)
                verticalLineToRelative(-1.784f)
                horizontalLineToRelative(9.479f)
                arcToRelative(0.604f, 0.604f, 0.0f, false, false, 0.602f, -0.616f)
                arcToRelative(0.608f, 0.608f, 0.0f, false, false, -0.602f, -0.617f)
                horizontalLineToRelative(-9.479f)
                verticalLineToRelative(-0.79f)
                lineToRelative(7.17f, -0.002f)
                close()
            }
        }
        .build()
        return _filesDigitalFilled!!
    }

private var _filesDigitalFilled: ImageVector? = null
