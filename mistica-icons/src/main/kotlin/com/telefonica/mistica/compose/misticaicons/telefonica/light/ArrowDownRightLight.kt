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

public val LightGroup.ArrowDownRightLight: ImageVector
    get() {
        if (_arrowDownRightLight != null) {
            return _arrowDownRightLight!!
        }
        _arrowDownRightLight = Builder(name = "ArrowDownRightLight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.831f, 20.474f)
                curveToRelative(-0.022f, 0.0f, -0.045f, 0.0f, -0.07f, -0.003f)
                lineToRelative(-12.667f, -0.005f)
                horizontalLineToRelative(-0.01f)
                arcToRelative(0.772f, 0.772f, 0.0f, false, true, -0.73f, -0.474f)
                curveToRelative(-0.164f, -0.372f, -0.089f, -0.87f, 0.177f, -1.16f)
                lineToRelative(0.009f, -0.008f)
                lineToRelative(2.563f, -2.563f)
                arcToRelative(0.155f, 0.155f, 0.0f, false, false, 0.042f, -0.109f)
                arcToRelative(0.195f, 0.195f, 0.0f, false, false, -0.062f, -0.134f)
                lineToRelative(-5.067f, -5.096f)
                curveToRelative(-0.325f, -0.325f, -0.487f, -0.663f, -0.485f, -1.005f)
                curveToRelative(0.006f, -0.34f, 0.168f, -0.667f, 0.502f, -0.997f)
                lineTo(9.08f, 3.864f)
                lineToRelative(0.009f, -0.009f)
                curveToRelative(0.745f, -0.683f, 1.32f, -0.115f, 1.594f, 0.157f)
                lineToRelative(0.002f, 0.003f)
                lineToRelative(5.168f, 5.238f)
                arcToRelative(0.191f, 0.191f, 0.0f, false, false, 0.135f, 0.059f)
                arcToRelative(0.143f, 0.143f, 0.0f, false, false, 0.11f, -0.042f)
                lineToRelative(2.772f, -2.773f)
                lineToRelative(0.006f, -0.006f)
                curveToRelative(0.263f, -0.252f, 0.731f, -0.325f, 1.09f, -0.17f)
                curveToRelative(0.33f, 0.142f, 0.52f, 0.445f, 0.518f, 0.828f)
                verticalLineToRelative(12.6f)
                arcToRelative(0.669f, 0.669f, 0.0f, false, true, -0.182f, 0.538f)
                arcToRelative(0.638f, 0.638f, 0.0f, false, true, -0.471f, 0.187f)
                close()
                moveTo(7.094f, 19.908f)
                lineTo(19.775f, 19.914f)
                curveToRelative(0.008f, 0.0f, 0.02f, 0.0f, 0.028f, 0.003f)
                curveToRelative(0.048f, 0.005f, 0.084f, -0.003f, 0.1f, -0.02f)
                curveToRelative(0.018f, -0.017f, 0.026f, -0.056f, 0.02f, -0.1f)
                lineToRelative(-0.002f, -0.029f)
                lineTo(19.921f, 7.152f)
                curveToRelative(0.0f, -0.162f, -0.056f, -0.26f, -0.18f, -0.314f)
                curveToRelative(-0.168f, -0.072f, -0.386f, -0.025f, -0.479f, 0.06f)
                lineToRelative(-2.77f, 2.77f)
                arcToRelative(0.707f, 0.707f, 0.0f, false, true, -0.524f, 0.204f)
                arcToRelative(0.744f, 0.744f, 0.0f, false, true, -0.512f, -0.224f)
                lineTo(10.288f, 4.41f)
                curveToRelative(-0.407f, -0.404f, -0.541f, -0.395f, -0.816f, -0.146f)
                lineToRelative(-5.044f, 5.05f)
                curveToRelative(-0.222f, 0.222f, -0.334f, 0.426f, -0.337f, 0.611f)
                curveToRelative(-0.002f, 0.188f, 0.101f, 0.384f, 0.32f, 0.602f)
                lineToRelative(5.073f, 5.093f)
                curveToRelative(0.137f, 0.137f, 0.218f, 0.32f, 0.224f, 0.512f)
                arcToRelative(0.711f, 0.711f, 0.0f, false, true, -0.205f, 0.524f)
                lineToRelative(-2.56f, 2.56f)
                curveToRelative(-0.112f, 0.127f, -0.148f, 0.381f, -0.073f, 0.55f)
                curveToRelative(0.056f, 0.126f, 0.146f, 0.142f, 0.222f, 0.142f)
                horizontalLineToRelative(0.002f)
                close()
            }
        }
        .build()
        return _arrowDownRightLight!!
    }

private var _arrowDownRightLight: ImageVector? = null
