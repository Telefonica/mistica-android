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

public val LightGroup.ArrowUpRightLight: ImageVector
    get() {
        if (_arrowUpRightLight != null) {
            return _arrowUpRightLight!!
        }
        _arrowUpRightLight = Builder(name = "ArrowUpRightLight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.934f, 20.486f)
                curveToRelative(-0.34f, 0.0f, -0.681f, -0.168f, -1.017f, -0.501f)
                lineToRelative(-5.053f, -5.048f)
                lineToRelative(-0.009f, -0.008f)
                curveToRelative(-0.683f, -0.745f, -0.115f, -1.32f, 0.157f, -1.594f)
                lineToRelative(0.003f, -0.003f)
                lineToRelative(5.238f, -5.168f)
                curveToRelative(0.07f, -0.07f, 0.081f, -0.182f, 0.017f, -0.244f)
                lineTo(6.497f, 5.147f)
                lineToRelative(-0.006f, -0.005f)
                curveToRelative(-0.252f, -0.264f, -0.325f, -0.731f, -0.17f, -1.09f)
                curveToRelative(0.142f, -0.33f, 0.442f, -0.518f, 0.825f, -0.518f)
                horizontalLineToRelative(12.606f)
                arcToRelative(0.669f, 0.669f, 0.0f, false, true, 0.537f, 0.182f)
                arcToRelative(0.672f, 0.672f, 0.0f, false, true, 0.182f, 0.538f)
                lineToRelative(-0.005f, 12.666f)
                arcToRelative(0.766f, 0.766f, 0.0f, false, true, -0.474f, 0.737f)
                curveToRelative(-0.372f, 0.165f, -0.87f, 0.09f, -1.16f, -0.176f)
                lineToRelative(-0.008f, -0.009f)
                lineToRelative(-2.563f, -2.563f)
                arcToRelative(0.155f, 0.155f, 0.0f, false, false, -0.109f, -0.042f)
                arcToRelative(0.195f, 0.195f, 0.0f, false, false, -0.134f, 0.062f)
                lineToRelative(-5.096f, 5.075f)
                curveToRelative(-0.319f, 0.323f, -0.652f, 0.482f, -0.988f, 0.482f)
                close()
                moveTo(4.264f, 14.546f)
                lineTo(9.314f, 19.59f)
                curveToRelative(0.443f, 0.442f, 0.782f, 0.448f, 1.213f, 0.017f)
                lineToRelative(5.093f, -5.07f)
                arcToRelative(0.756f, 0.756f, 0.0f, false, true, 0.512f, -0.224f)
                arcToRelative(0.711f, 0.711f, 0.0f, false, true, 0.524f, 0.204f)
                lineToRelative(2.56f, 2.56f)
                curveToRelative(0.127f, 0.112f, 0.381f, 0.149f, 0.55f, 0.073f)
                curveToRelative(0.126f, -0.056f, 0.142f, -0.148f, 0.142f, -0.221f)
                verticalLineToRelative(-0.003f)
                lineToRelative(0.006f, -12.68f)
                curveToRelative(0.0f, -0.009f, 0.0f, -0.02f, 0.003f, -0.029f)
                curveToRelative(0.005f, -0.047f, -0.003f, -0.084f, -0.02f, -0.1f)
                curveToRelative(-0.017f, -0.017f, -0.056f, -0.026f, -0.1f, -0.02f)
                curveToRelative(-0.01f, 0.0f, -0.02f, 0.003f, -0.029f, 0.003f)
                lineTo(7.152f, 4.1f)
                curveToRelative(-0.162f, 0.0f, -0.26f, 0.056f, -0.314f, 0.179f)
                curveToRelative(-0.072f, 0.168f, -0.025f, 0.387f, 0.062f, 0.479f)
                lineToRelative(2.77f, 2.77f)
                curveToRelative(0.138f, 0.138f, 0.21f, 0.325f, 0.205f, 0.524f)
                arcToRelative(0.744f, 0.744f, 0.0f, false, true, -0.224f, 0.513f)
                lineToRelative(-5.238f, 5.168f)
                curveToRelative(-0.407f, 0.406f, -0.398f, 0.54f, -0.149f, 0.812f)
                close()
            }
        }
        .build()
        return _arrowUpRightLight!!
    }

private var _arrowUpRightLight: ImageVector? = null
