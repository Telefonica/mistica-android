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

public val RegularGroup.DigitalLibraryRegular: ImageVector
    get() {
        if (_digitalLibraryRegular != null) {
            return _digitalLibraryRegular!!
        }
        _digitalLibraryRegular = Builder(name = "DigitalLibraryRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.266f, 17.677f)
                arcToRelative(13.95f, 13.95f, 0.0f, false, false, -4.428f, 0.958f)
                verticalLineToRelative(-7.149f)
                curveToRelative(1.66f, -0.81f, 3.523f, -0.927f, 4.428f, -0.93f)
                verticalLineToRelative(7.12f)
                close()
                moveTo(3.207f, 10.557f)
                curveToRelative(0.905f, 0.002f, 2.762f, 0.117f, 4.429f, 0.93f)
                verticalLineToRelative(7.148f)
                arcToRelative(13.95f, 13.95f, 0.0f, false, false, -4.429f, -0.958f)
                verticalLineToRelative(-7.12f)
                close()
                moveTo(5.79f, 7.03f)
                curveToRelative(0.0f, -0.664f, 0.157f, -1.163f, 0.462f, -1.485f)
                curveToRelative(0.317f, -0.33f, 0.818f, -0.501f, 1.49f, -0.501f)
                lineToRelative(10.79f, -0.006f)
                curveToRelative(0.672f, 0.0f, 1.177f, 0.168f, 1.49f, 0.501f)
                curveToRelative(0.306f, 0.323f, 0.46f, 0.821f, 0.46f, 1.485f)
                verticalLineToRelative(5.224f)
                curveToRelative(0.0f, 0.667f, -0.154f, 1.171f, -0.462f, 1.499f)
                curveToRelative(-0.317f, 0.339f, -0.818f, 0.51f, -1.488f, 0.51f)
                lineToRelative(-4.064f, 0.002f)
                lineTo(14.468f, 9.954f)
                arcToRelative(0.614f, 0.614f, 0.0f, false, false, -0.555f, -0.619f)
                curveToRelative(-0.129f, -0.008f, -3.075f, -0.23f, -5.68f, 1.078f)
                arcToRelative(9.927f, 9.927f, 0.0f, false, false, -2.443f, -0.831f)
                lineTo(5.79f, 7.03f)
                close()
                moveTo(18.535f, 15.497f)
                curveToRelative(1.008f, 0.0f, 1.801f, -0.3f, 2.356f, -0.89f)
                curveToRelative(0.53f, -0.566f, 0.798f, -1.362f, 0.798f, -2.359f)
                lineTo(21.689f, 7.024f)
                curveToRelative(0.0f, -1.0f, -0.272f, -1.79f, -0.804f, -2.35f)
                curveToRelative(-0.552f, -0.58f, -1.342f, -0.874f, -2.353f, -0.874f)
                lineToRelative(-10.79f, 0.006f)
                curveToRelative(-1.01f, 0.0f, -1.8f, 0.294f, -2.353f, 0.874f)
                curveToRelative(-0.532f, 0.563f, -0.804f, 1.352f, -0.804f, 2.352f)
                verticalLineToRelative(2.362f)
                arcToRelative(11.704f, 11.704f, 0.0f, false, false, -2.03f, -0.056f)
                arcToRelative(0.616f, 0.616f, 0.0f, false, false, -0.555f, 0.619f)
                verticalLineToRelative(8.33f)
                arcToRelative(0.61f, 0.61f, 0.0f, false, false, 0.602f, 0.62f)
                curveToRelative(3.031f, 0.0f, 5.33f, 1.215f, 5.353f, 1.226f)
                curveToRelative(0.087f, 0.048f, 0.182f, 0.07f, 0.277f, 0.07f)
                curveToRelative(0.017f, 0.0f, 0.031f, -0.01f, 0.045f, -0.014f)
                arcToRelative(0.572f, 0.572f, 0.0f, false, false, 0.236f, -0.058f)
                curveToRelative(0.022f, -0.012f, 2.305f, -1.227f, 5.353f, -1.227f)
                arcToRelative(0.61f, 0.61f, 0.0f, false, false, 0.602f, -0.62f)
                verticalLineToRelative(-0.77f)
                horizontalLineToRelative(6.616f)
                arcToRelative(0.61f, 0.61f, 0.0f, false, false, 0.602f, -0.619f)
                arcToRelative(0.61f, 0.61f, 0.0f, false, false, -0.602f, -0.619f)
                horizontalLineToRelative(-6.616f)
                lineTo(14.468f, 15.5f)
                lineToRelative(4.067f, -0.003f)
                close()
            }
        }
        .build()
        return _digitalLibraryRegular!!
    }

private var _digitalLibraryRegular: ImageVector? = null
