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

public val LightGroup.ArrowDownLeftLight: ImageVector
    get() {
        if (_arrowDownLeftLight != null) {
            return _arrowDownLeftLight!!
        }
        _arrowDownLeftLight = Builder(name = "ArrowDownLeftLight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.187f, 20.487f)
                arcToRelative(0.653f, 0.653f, 0.0f, false, true, -0.471f, -0.185f)
                arcToRelative(0.672f, 0.672f, 0.0f, false, true, -0.182f, -0.538f)
                lineToRelative(0.005f, -12.667f)
                arcToRelative(0.766f, 0.766f, 0.0f, false, true, 0.474f, -0.736f)
                curveToRelative(0.372f, -0.166f, 0.871f, -0.09f, 1.16f, 0.176f)
                lineToRelative(0.008f, 0.009f)
                lineToRelative(2.563f, 2.563f)
                arcToRelative(0.155f, 0.155f, 0.0f, false, false, 0.11f, 0.042f)
                arcToRelative(0.195f, 0.195f, 0.0f, false, false, 0.134f, -0.062f)
                lineToRelative(5.092f, -5.073f)
                curveToRelative(0.325f, -0.325f, 0.664f, -0.49f, 1.006f, -0.485f)
                curveToRelative(0.339f, 0.006f, 0.666f, 0.169f, 0.997f, 0.502f)
                lineToRelative(5.056f, 5.05f)
                lineToRelative(0.008f, 0.009f)
                curveToRelative(0.684f, 0.745f, 0.115f, 1.32f, -0.157f, 1.594f)
                lineToRelative(-0.002f, 0.002f)
                lineToRelative(-5.238f, 5.168f)
                curveToRelative(-0.07f, 0.07f, -0.082f, 0.183f, -0.017f, 0.244f)
                lineToRelative(2.773f, 2.773f)
                lineToRelative(0.005f, 0.006f)
                curveToRelative(0.253f, 0.263f, 0.325f, 0.731f, 0.171f, 1.09f)
                curveToRelative(-0.143f, 0.33f, -0.442f, 0.518f, -0.826f, 0.518f)
                horizontalLineToRelative(-12.6f)
                curveToRelative(-0.022f, -0.003f, -0.047f, 0.0f, -0.07f, 0.0f)
                close()
                moveTo(4.447f, 6.828f)
                arcToRelative(0.532f, 0.532f, 0.0f, false, false, -0.204f, 0.04f)
                curveToRelative(-0.126f, 0.056f, -0.143f, 0.148f, -0.143f, 0.22f)
                verticalLineToRelative(0.004f)
                lineToRelative(-0.006f, 12.68f)
                curveToRelative(0.0f, 0.009f, 0.0f, 0.02f, -0.003f, 0.028f)
                curveToRelative(-0.005f, 0.048f, 0.003f, 0.084f, 0.02f, 0.101f)
                reflectiveCurveToRelative(0.056f, 0.025f, 0.1f, 0.02f)
                curveToRelative(0.01f, 0.0f, 0.02f, -0.003f, 0.029f, -0.003f)
                horizontalLineToRelative(12.613f)
                curveToRelative(0.163f, 0.0f, 0.26f, -0.056f, 0.314f, -0.18f)
                curveToRelative(0.073f, -0.167f, 0.025f, -0.386f, -0.062f, -0.478f)
                lineToRelative(-2.77f, -2.77f)
                arcToRelative(0.707f, 0.707f, 0.0f, false, true, -0.204f, -0.524f)
                arcToRelative(0.744f, 0.744f, 0.0f, false, true, 0.224f, -0.513f)
                lineToRelative(5.238f, -5.168f)
                curveToRelative(0.403f, -0.406f, 0.395f, -0.54f, 0.145f, -0.815f)
                lineToRelative(-5.044f, -5.042f)
                curveToRelative(-0.222f, -0.221f, -0.426f, -0.333f, -0.611f, -0.336f)
                curveToRelative(-0.188f, -0.003f, -0.384f, 0.1f, -0.602f, 0.32f)
                lineTo(8.388f, 9.483f)
                arcToRelative(0.762f, 0.762f, 0.0f, false, true, -0.512f, 0.224f)
                arcToRelative(0.711f, 0.711f, 0.0f, false, true, -0.524f, -0.204f)
                lineToRelative(-2.56f, -2.56f)
                arcToRelative(0.532f, 0.532f, 0.0f, false, false, -0.345f, -0.116f)
                close()
            }
        }
        .build()
        return _arrowDownLeftLight!!
    }

private var _arrowDownLeftLight: ImageVector? = null
