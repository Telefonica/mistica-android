package com.telefonica.mistica.compose.misticaicons.telefonica.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.telefonica.LightGroup

public val LightGroup.ArrowUpLeftLight: ImageVector
    get() {
        if (_arrowUpLeftLight != null) {
            return _arrowUpLeftLight!!
        }
        _arrowUpLeftLight = Builder(name = "ArrowUpLeftLight", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.22f, 20.475f)
                curveToRelative(-0.398f, 0.0f, -0.703f, -0.305f, -0.885f, -0.482f)
                lineToRelative(-0.003f, -0.003f)
                lineToRelative(-5.168f, -5.238f)
                arcToRelative(0.191f, 0.191f, 0.0f, false, false, -0.134f, -0.058f)
                arcToRelative(0.143f, 0.143f, 0.0f, false, false, -0.11f, 0.042f)
                lineToRelative(-2.773f, 2.773f)
                lineToRelative(-0.005f, 0.005f)
                curveToRelative(-0.264f, 0.252f, -0.731f, 0.325f, -1.09f, 0.171f)
                curveToRelative(-0.33f, -0.143f, -0.52f, -0.445f, -0.518f, -0.829f)
                lineTo(3.534f, 4.254f)
                arcToRelative(0.669f, 0.669f, 0.0f, false, true, 0.182f, -0.538f)
                arcToRelative(0.672f, 0.672f, 0.0f, false, true, 0.538f, -0.182f)
                lineToRelative(12.666f, 0.005f)
                horizontalLineToRelative(0.012f)
                curveToRelative(0.327f, 0.0f, 0.593f, 0.174f, 0.728f, 0.474f)
                curveToRelative(0.165f, 0.372f, 0.09f, 0.871f, -0.177f, 1.16f)
                lineToRelative(-0.008f, 0.008f)
                lineToRelative(-2.563f, 2.563f)
                arcToRelative(0.155f, 0.155f, 0.0f, false, false, -0.042f, 0.11f)
                curveToRelative(0.003f, 0.05f, 0.022f, 0.097f, 0.062f, 0.134f)
                lineToRelative(5.072f, 5.092f)
                curveToRelative(0.65f, 0.65f, 0.645f, 1.345f, -0.016f, 2.006f)
                lineToRelative(-5.048f, 5.056f)
                lineToRelative(-0.008f, 0.008f)
                curveToRelative(-0.26f, 0.238f, -0.499f, 0.325f, -0.712f, 0.325f)
                close()
                moveTo(13.733f, 19.598f)
                curveToRelative(0.406f, 0.404f, 0.54f, 0.395f, 0.815f, 0.146f)
                lineToRelative(5.047f, -5.05f)
                curveToRelative(0.222f, -0.222f, 0.334f, -0.426f, 0.337f, -0.611f)
                curveToRelative(0.002f, -0.188f, -0.101f, -0.384f, -0.32f, -0.602f)
                lineToRelative(-5.075f, -5.096f)
                arcToRelative(0.762f, 0.762f, 0.0f, false, true, -0.224f, -0.512f)
                arcToRelative(0.711f, 0.711f, 0.0f, false, true, 0.204f, -0.524f)
                lineToRelative(2.56f, -2.56f)
                curveToRelative(0.112f, -0.126f, 0.149f, -0.381f, 0.073f, -0.55f)
                curveToRelative(-0.056f, -0.125f, -0.148f, -0.142f, -0.221f, -0.142f)
                horizontalLineToRelative(-0.003f)
                lineTo(4.246f, 4.09f)
                curveToRelative(-0.009f, 0.0f, -0.02f, 0.0f, -0.029f, -0.003f)
                curveToRelative(-0.047f, -0.005f, -0.084f, 0.003f, -0.1f, 0.02f)
                curveToRelative(-0.017f, 0.017f, -0.026f, 0.056f, -0.02f, 0.1f)
                curveToRelative(0.0f, 0.01f, 0.003f, 0.02f, 0.003f, 0.029f)
                lineTo(4.1f, 16.85f)
                curveToRelative(0.0f, 0.163f, 0.056f, 0.26f, 0.179f, 0.314f)
                curveToRelative(0.168f, 0.073f, 0.387f, 0.025f, 0.479f, -0.062f)
                lineToRelative(2.77f, -2.77f)
                arcToRelative(0.707f, 0.707f, 0.0f, false, true, 0.524f, -0.204f)
                arcToRelative(0.744f, 0.744f, 0.0f, false, true, 0.513f, 0.224f)
                lineToRelative(5.168f, 5.246f)
                close()
            }
        }
        .build()
        return _arrowUpLeftLight!!
    }

private var _arrowUpLeftLight: ImageVector? = null
