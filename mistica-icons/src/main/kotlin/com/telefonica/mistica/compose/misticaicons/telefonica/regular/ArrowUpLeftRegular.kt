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

public val RegularGroup.ArrowUpLeftRegular: ImageVector
    get() {
        if (_arrowUpLeftRegular != null) {
            return _arrowUpLeftRegular!!
        }
        _arrowUpLeftRegular = Builder(name = "ArrowUpLeftRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.143f, 20.661f)
                curveToRelative(-0.073f, 0.0f, -0.143f, -0.008f, -0.216f, -0.022f)
                curveToRelative(-0.336f, -0.073f, -0.605f, -0.303f, -0.823f, -0.521f)
                lineToRelative(-0.014f, -0.014f)
                lineToRelative(-4.813f, -5.115f)
                lineToRelative(-2.58f, 2.58f)
                lineToRelative(-0.008f, 0.008f)
                curveToRelative(-0.33f, 0.317f, -0.893f, 0.409f, -1.339f, 0.218f)
                curveToRelative(-0.414f, -0.179f, -0.66f, -0.568f, -0.658f, -1.044f)
                lineTo(3.692f, 4.664f)
                arcToRelative(0.901f, 0.901f, 0.0f, false, true, 0.255f, -0.717f)
                arcToRelative(0.89f, 0.89f, 0.0f, false, true, 0.717f, -0.252f)
                lineToRelative(12.145f, 0.005f)
                curveToRelative(0.426f, -0.003f, 0.782f, 0.224f, 0.956f, 0.614f)
                curveToRelative(0.204f, 0.456f, 0.112f, 1.047f, -0.216f, 1.406f)
                arcToRelative(0.074f, 0.074f, 0.0f, false, false, -0.014f, 0.017f)
                lineToRelative(-2.384f, 2.375f)
                lineToRelative(4.905f, 4.79f)
                lineToRelative(0.006f, 0.006f)
                curveToRelative(0.367f, 0.366f, 0.549f, 0.756f, 0.543f, 1.162f)
                curveToRelative(-0.006f, 0.395f, -0.193f, 0.779f, -0.56f, 1.143f)
                lineTo(15.02f, 20.26f)
                lineToRelative(-0.017f, 0.017f)
                curveToRelative(-0.278f, 0.255f, -0.569f, 0.384f, -0.86f, 0.384f)
                close()
                moveTo(13.866f, 19.361f)
                curveToRelative(0.17f, 0.168f, 0.246f, 0.21f, 0.274f, 0.222f)
                arcToRelative(0.604f, 0.604f, 0.0f, false, false, 0.129f, -0.093f)
                lineToRelative(5.017f, -5.039f)
                curveToRelative(0.157f, -0.157f, 0.243f, -0.3f, 0.246f, -0.4f)
                curveToRelative(0.003f, -0.127f, -0.12f, -0.278f, -0.227f, -0.382f)
                lineToRelative(-4.972f, -4.857f)
                lineToRelative(-0.005f, -0.005f)
                arcToRelative(0.973f, 0.973f, 0.0f, false, true, -0.017f, -1.376f)
                lineToRelative(2.448f, -2.448f)
                curveToRelative(0.03f, -0.042f, 0.045f, -0.148f, 0.03f, -0.213f)
                lineTo(4.769f, 4.765f)
                lineTo(4.769f, 16.75f)
                curveToRelative(0.0f, 0.025f, 0.002f, 0.042f, 0.005f, 0.05f)
                curveToRelative(0.037f, 0.02f, 0.137f, 0.017f, 0.177f, -0.008f)
                lineToRelative(2.652f, -2.653f)
                arcToRelative(0.954f, 0.954f, 0.0f, false, true, 0.7f, -0.274f)
                arcToRelative(0.995f, 0.995f, 0.0f, false, true, 0.676f, 0.294f)
                lineToRelative(0.01f, 0.01f)
                lineToRelative(4.878f, 5.191f)
                close()
            }
        }
        .build()
        return _arrowUpLeftRegular!!
    }

private var _arrowUpLeftRegular: ImageVector? = null
