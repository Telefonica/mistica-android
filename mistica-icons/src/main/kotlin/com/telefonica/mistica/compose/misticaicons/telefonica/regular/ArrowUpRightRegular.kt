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

public val RegularGroup.ArrowUpRightRegular: ImageVector
    get() {
        if (_arrowUpRightRegular != null) {
            return _arrowUpRightRegular!!
        }
        _arrowUpRightRegular = Builder(name = "ArrowUpRightRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.284f, 20.582f)
                curveToRelative(-0.395f, 0.0f, -0.793f, -0.184f, -1.166f, -0.557f)
                lineTo(4.068f, 15.0f)
                lineToRelative(-0.017f, -0.017f)
                curveToRelative(-0.32f, -0.347f, -0.44f, -0.709f, -0.361f, -1.078f)
                curveToRelative(0.073f, -0.337f, 0.302f, -0.605f, 0.52f, -0.824f)
                lineToRelative(0.015f, -0.014f)
                lineTo(9.34f, 8.255f)
                lineToRelative(-2.58f, -2.58f)
                lineToRelative(-0.009f, -0.008f)
                curveToRelative(-0.316f, -0.331f, -0.408f, -0.894f, -0.218f, -1.34f)
                curveToRelative(0.18f, -0.414f, 0.569f, -0.66f, 1.045f, -0.658f)
                horizontalLineToRelative(12.087f)
                curveToRelative(0.28f, -0.02f, 0.532f, 0.07f, 0.717f, 0.255f)
                arcToRelative(0.89f, 0.89f, 0.0f, false, true, 0.252f, 0.717f)
                lineToRelative(-0.006f, 12.146f)
                curveToRelative(0.003f, 0.426f, -0.224f, 0.781f, -0.613f, 0.955f)
                curveToRelative(-0.457f, 0.205f, -1.048f, 0.112f, -1.406f, -0.216f)
                lineToRelative(-0.017f, -0.014f)
                lineToRelative(-2.376f, -2.38f)
                lineToRelative(-4.79f, 4.904f)
                lineToRelative(-0.005f, 0.006f)
                curveToRelative(-0.359f, 0.361f, -0.748f, 0.54f, -1.137f, 0.54f)
                close()
                moveTo(4.838f, 14.246f)
                lineTo(9.878f, 19.263f)
                curveToRelative(0.156f, 0.157f, 0.3f, 0.244f, 0.4f, 0.247f)
                horizontalLineToRelative(0.003f)
                curveToRelative(0.126f, 0.0f, 0.274f, -0.124f, 0.378f, -0.227f)
                lineToRelative(4.854f, -4.972f)
                lineToRelative(0.006f, -0.006f)
                arcToRelative(0.973f, 0.973f, 0.0f, false, true, 1.375f, -0.017f)
                lineToRelative(2.448f, 2.449f)
                curveToRelative(0.043f, 0.03f, 0.149f, 0.044f, 0.213f, 0.03f)
                lineToRelative(0.006f, -12.022f)
                lineTo(7.572f, 4.745f)
                arcToRelative(0.175f, 0.175f, 0.0f, false, false, -0.05f, 0.006f)
                arcToRelative(0.241f, 0.241f, 0.0f, false, false, 0.008f, 0.176f)
                lineToRelative(2.653f, 2.653f)
                arcToRelative(0.95f, 0.95f, 0.0f, false, true, 0.274f, 0.7f)
                arcToRelative(0.995f, 0.995f, 0.0f, false, true, -0.294f, 0.675f)
                lineToRelative(-0.011f, 0.011f)
                lineToRelative(-5.185f, 4.88f)
                curveToRelative(-0.168f, 0.17f, -0.21f, 0.246f, -0.221f, 0.274f)
                arcToRelative(0.55f, 0.55f, 0.0f, false, false, 0.092f, 0.126f)
                close()
            }
        }
        .build()
        return _arrowUpRightRegular!!
    }

private var _arrowUpRightRegular: ImageVector? = null
