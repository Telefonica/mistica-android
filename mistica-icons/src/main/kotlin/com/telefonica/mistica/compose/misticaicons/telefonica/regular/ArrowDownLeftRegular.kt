package com.telefonica.mistica.compose.misticaicons.telefonica.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.telefonica.RegularGroup

public val RegularGroup.ArrowDownLeftRegular: ImageVector
    get() {
        if (_arrowDownLeftRegular != null) {
            return _arrowDownLeftRegular!!
        }
        _arrowDownLeftRegular = Builder(name = "ArrowDownLeftRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.585f, 20.591f)
                arcToRelative(0.89f, 0.89f, 0.0f, false, true, -0.641f, -0.258f)
                arcToRelative(0.89f, 0.89f, 0.0f, false, true, -0.252f, -0.717f)
                lineToRelative(0.005f, -12.145f)
                arcToRelative(1.009f, 1.009f, 0.0f, false, true, 0.614f, -0.956f)
                curveToRelative(0.457f, -0.204f, 1.048f, -0.112f, 1.406f, 0.216f)
                curveToRelative(0.006f, 0.006f, 0.011f, 0.011f, 0.017f, 0.014f)
                lineToRelative(2.378f, 2.378f)
                lineToRelative(4.79f, -4.905f)
                lineToRelative(0.006f, -0.005f)
                curveToRelative(0.728f, -0.728f, 1.568f, -0.72f, 2.305f, 0.017f)
                lineToRelative(5.05f, 5.025f)
                lineToRelative(0.017f, 0.017f)
                curveToRelative(0.32f, 0.347f, 0.44f, 0.708f, 0.361f, 1.078f)
                curveToRelative(-0.072f, 0.336f, -0.302f, 0.605f, -0.52f, 0.824f)
                lineToRelative(-0.015f, 0.014f)
                lineToRelative(-5.12f, 4.815f)
                lineToRelative(2.58f, 2.577f)
                lineToRelative(0.008f, 0.008f)
                curveToRelative(0.317f, 0.33f, 0.41f, 0.894f, 0.219f, 1.34f)
                curveToRelative(-0.177f, 0.414f, -0.566f, 0.66f, -1.042f, 0.66f)
                lineTo(4.664f, 20.588f)
                curveToRelative(-0.028f, 0.003f, -0.053f, 0.003f, -0.079f, 0.003f)
                close()
                moveTo(4.768f, 19.513f)
                lineTo(16.75f, 19.513f)
                arcToRelative(0.184f, 0.184f, 0.0f, false, false, 0.053f, -0.006f)
                curveToRelative(0.022f, -0.036f, 0.017f, -0.137f, -0.009f, -0.177f)
                lineToRelative(-2.652f, -2.652f)
                arcToRelative(0.95f, 0.95f, 0.0f, false, true, -0.275f, -0.7f)
                arcToRelative(0.995f, 0.995f, 0.0f, false, true, 0.294f, -0.676f)
                lineToRelative(0.012f, -0.01f)
                lineToRelative(5.187f, -4.877f)
                curveToRelative(0.168f, -0.171f, 0.21f, -0.247f, 0.222f, -0.275f)
                arcToRelative(0.604f, 0.604f, 0.0f, false, false, -0.093f, -0.129f)
                lineToRelative(-5.039f, -5.017f)
                curveToRelative(-0.157f, -0.156f, -0.3f, -0.243f, -0.4f, -0.246f)
                curveToRelative(-0.127f, 0.0f, -0.278f, 0.12f, -0.382f, 0.227f)
                lineTo(8.812f, 9.947f)
                lineToRelative(-0.005f, 0.005f)
                arcToRelative(0.973f, 0.973f, 0.0f, false, true, -1.376f, 0.017f)
                lineTo(4.983f, 7.521f)
                curveToRelative(-0.042f, -0.03f, -0.148f, -0.045f, -0.213f, -0.03f)
                lineToRelative(-0.002f, 12.022f)
                close()
            }
        }
        .build()
        return _arrowDownLeftRegular!!
    }

private var _arrowDownLeftRegular: ImageVector? = null
