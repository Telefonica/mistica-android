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

public val RegularGroup.ArrowDownRightRegular: ImageVector
    get() {
        if (_arrowDownRightRegular != null) {
            return _arrowDownRightRegular!!
        }
        _arrowDownRightRegular = Builder(name = "ArrowDownRightRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.695f, 20.647f)
                curveToRelative(-0.026f, 0.0f, -0.05f, 0.0f, -0.079f, -0.003f)
                lineTo(7.471f, 20.64f)
                horizontalLineToRelative(-0.012f)
                curveToRelative(-0.42f, 0.0f, -0.77f, -0.23f, -0.944f, -0.614f)
                curveToRelative(-0.204f, -0.456f, -0.112f, -1.047f, 0.216f, -1.406f)
                curveToRelative(0.006f, -0.006f, 0.011f, -0.011f, 0.014f, -0.017f)
                lineToRelative(2.378f, -2.378f)
                lineToRelative(-4.902f, -4.79f)
                lineToRelative(-0.005f, -0.005f)
                curveToRelative(-0.729f, -0.729f, -0.72f, -1.57f, 0.016f, -2.306f)
                lineToRelative(5.026f, -5.047f)
                lineToRelative(0.016f, -0.017f)
                curveToRelative(0.348f, -0.32f, 0.71f, -0.44f, 1.079f, -0.362f)
                curveToRelative(0.336f, 0.073f, 0.605f, 0.303f, 0.823f, 0.521f)
                lineToRelative(0.014f, 0.014f)
                lineToRelative(4.813f, 5.115f)
                lineToRelative(2.58f, -2.58f)
                lineToRelative(0.008f, -0.008f)
                curveToRelative(0.33f, -0.316f, 0.894f, -0.409f, 1.339f, -0.218f)
                curveToRelative(0.414f, 0.179f, 0.66f, 0.568f, 0.658f, 1.044f)
                verticalLineToRelative(12.087f)
                curveToRelative(0.02f, 0.28f, -0.07f, 0.532f, -0.255f, 0.717f)
                arcToRelative(0.879f, 0.879f, 0.0f, false, true, -0.638f, 0.258f)
                close()
                moveTo(7.49f, 19.563f)
                lineToRelative(12.023f, 0.006f)
                verticalLineTo(7.585f)
                arcToRelative(0.175f, 0.175f, 0.0f, false, false, -0.006f, -0.05f)
                arcToRelative(0.241f, 0.241f, 0.0f, false, false, -0.177f, 0.008f)
                lineToRelative(-2.65f, 2.65f)
                arcToRelative(0.97f, 0.97f, 0.0f, false, true, -1.375f, -0.02f)
                lineToRelative(-0.01f, -0.01f)
                lineToRelative(-4.88f, -5.185f)
                curveToRelative(-0.171f, -0.168f, -0.247f, -0.21f, -0.275f, -0.222f)
                arcToRelative(0.604f, 0.604f, 0.0f, false, false, -0.129f, 0.093f)
                lineTo(4.994f, 9.885f)
                curveToRelative(-0.156f, 0.157f, -0.243f, 0.3f, -0.246f, 0.4f)
                curveToRelative(-0.003f, 0.127f, 0.12f, 0.278f, 0.227f, 0.382f)
                lineToRelative(4.972f, 4.857f)
                lineToRelative(0.005f, 0.005f)
                curveToRelative(0.384f, 0.384f, 0.393f, 1.0f, 0.017f, 1.376f)
                lineToRelative(-2.448f, 2.448f)
                curveToRelative(-0.03f, 0.04f, -0.045f, 0.148f, -0.03f, 0.21f)
                close()
            }
        }
        .build()
        return _arrowDownRightRegular!!
    }

private var _arrowDownRightRegular: ImageVector? = null
