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

public val RegularGroup.KeyRegular: ImageVector
    get() {
        if (_keyRegular != null) {
            return _keyRegular!!
        }
        _keyRegular = Builder(name = "KeyRegular", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.998f, 12.586f)
                curveToRelative(0.459f, 0.0f, 0.602f, -0.137f, 0.602f, -0.585f)
                curveToRelative(0.0f, -0.451f, -0.14f, -0.588f, -0.602f, -0.588f)
                curveToRelative(-0.463f, 0.0f, -0.603f, 0.137f, -0.603f, 0.588f)
                curveToRelative(0.0f, 0.445f, 0.143f, 0.585f, 0.603f, 0.585f)
                close()
                moveTo(5.998f, 10.214f)
                curveToRelative(1.142f, 0.0f, 1.826f, 0.666f, 1.826f, 1.784f)
                curveToRelative(0.0f, 1.1f, -0.7f, 1.784f, -1.826f, 1.784f)
                curveToRelative(-1.13f, 0.0f, -1.83f, -0.683f, -1.83f, -1.784f)
                curveToRelative(0.003f, -1.118f, 0.687f, -1.784f, 1.83f, -1.784f)
                close()
                moveTo(19.345f, 12.892f)
                lineTo(20.342f, 11.964f)
                lineTo(19.059f, 10.796f)
                lineTo(9.61f, 10.796f)
                arcToRelative(0.616f, 0.616f, 0.0f, false, true, -0.561f, -0.355f)
                curveToRelative(-0.412f, -0.908f, -1.291f, -1.348f, -2.684f, -1.348f)
                curveToRelative(-2.028f, 0.0f, -2.974f, 0.922f, -2.974f, 2.905f)
                curveToRelative(0.0f, 1.98f, 0.946f, 2.905f, 2.974f, 2.905f)
                curveToRelative(1.317f, 0.0f, 2.174f, -0.367f, 2.547f, -1.093f)
                curveToRelative(0.039f, -0.075f, 0.129f, -0.3f, 0.129f, -0.302f)
                arcToRelative(0.611f, 0.611f, 0.0f, false, true, 0.568f, -0.378f)
                horizontalLineToRelative(4.504f)
                lineToRelative(0.92f, -1.292f)
                arcToRelative(0.622f, 0.622f, 0.0f, false, true, 0.988f, -0.025f)
                lineToRelative(0.683f, 0.866f)
                lineToRelative(0.521f, -0.818f)
                arcToRelative(0.623f, 0.623f, 0.0f, false, true, 0.952f, -0.106f)
                lineToRelative(1.169f, 1.137f)
                close()
                moveTo(21.653f, 11.522f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, true, 0.196f, 0.434f)
                curveToRelative(0.0f, 0.165f, -0.07f, 0.322f, -0.19f, 0.437f)
                lineToRelative(-1.902f, 1.768f)
                arcToRelative(0.625f, 0.625f, 0.0f, false, true, -0.858f, -0.012f)
                lineToRelative(-1.039f, -1.014f)
                lineToRelative(-0.58f, 0.908f)
                arcToRelative(0.62f, 0.62f, 0.0f, false, true, -0.49f, 0.283f)
                arcToRelative(0.589f, 0.589f, 0.0f, false, true, -0.515f, -0.233f)
                lineToRelative(-0.712f, -0.899f)
                lineToRelative(-0.624f, 0.877f)
                arcToRelative(0.615f, 0.615f, 0.0f, false, true, -0.504f, 0.258f)
                horizontalLineToRelative(-4.42f)
                curveToRelative(-0.003f, 0.008f, -0.01f, 0.014f, -0.012f, 0.022f)
                curveToRelative(-0.412f, 0.798f, -1.375f, 1.75f, -3.641f, 1.75f)
                curveToRelative(-2.709f, 0.0f, -4.202f, -1.456f, -4.202f, -4.1f)
                curveTo(2.16f, 9.357f, 3.653f, 7.9f, 6.362f, 7.9f)
                curveToRelative(2.075f, 0.0f, 3.106f, 0.86f, 3.616f, 1.703f)
                horizontalLineToRelative(9.32f)
                arcToRelative(0.63f, 0.63f, 0.0f, false, true, 0.417f, 0.16f)
                lineToRelative(1.938f, 1.759f)
                close()
            }
        }
        .build()
        return _keyRegular!!
    }

private var _keyRegular: ImageVector? = null
