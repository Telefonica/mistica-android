package com.telefonica.mistica.compose.misticaicons.telefonica.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.telefonica.FilledGroup

public val FilledGroup.MultideviceoFilled: ImageVector
    get() {
        if (_multideviceoFilled != null) {
            return _multideviceoFilled!!
        }
        _multideviceoFilled = Builder(name = "MultideviceoFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.818f, 18.283f)
                curveToRelative(0.308f, 0.0f, 0.56f, 0.252f, 0.56f, 0.56f)
                curveToRelative(0.0f, 0.309f, -0.252f, 0.56f, -0.56f, 0.56f)
                lineTo(7.902f, 19.403f)
                arcToRelative(0.562f, 0.562f, 0.0f, false, true, -0.56f, -0.56f)
                curveToRelative(0.0f, -0.308f, 0.252f, -0.56f, 0.56f, -0.56f)
                close()
                moveTo(15.544f, 5.16f)
                curveToRelative(1.1f, 0.0f, 1.94f, 0.325f, 2.504f, 0.97f)
                curveToRelative(0.521f, 0.599f, 0.787f, 1.467f, 0.787f, 2.582f)
                verticalLineToRelative(0.005f)
                horizontalLineToRelative(0.916f)
                curveToRelative(1.37f, 0.0f, 2.095f, 0.726f, 2.095f, 2.096f)
                lineTo(21.846f, 17.3f)
                curveToRelative(0.0f, 1.37f, -0.725f, 2.095f, -2.095f, 2.095f)
                horizontalLineToRelative(-2.938f)
                curveToRelative(-1.37f, 0.0f, -2.096f, -0.725f, -2.096f, -2.095f)
                verticalLineToRelative(-0.1f)
                lineTo(5.451f, 17.2f)
                curveToRelative(-1.1f, 0.0f, -1.94f, -0.326f, -2.504f, -0.97f)
                curveToRelative(-0.524f, -0.6f, -0.787f, -1.468f, -0.787f, -2.583f)
                lineTo(2.16f, 8.71f)
                curveToRelative(0.0f, -1.115f, 0.263f, -1.983f, 0.787f, -2.58f)
                curveToRelative(0.563f, -0.641f, 1.406f, -0.969f, 2.504f, -0.969f)
                close()
                moveTo(19.751f, 9.838f)
                lineTo(16.81f, 9.838f)
                curveToRelative(-0.728f, 0.0f, -0.975f, 0.246f, -0.975f, 0.975f)
                verticalLineToRelative(6.49f)
                curveToRelative(0.0f, 0.378f, 0.07f, 0.639f, 0.207f, 0.773f)
                curveToRelative(0.138f, 0.137f, 0.395f, 0.204f, 0.77f, 0.204f)
                horizontalLineToRelative(2.936f)
                curveToRelative(0.376f, 0.0f, 0.633f, -0.07f, 0.77f, -0.204f)
                curveToRelative(0.138f, -0.137f, 0.208f, -0.398f, 0.208f, -0.773f)
                verticalLineToRelative(-6.49f)
                curveToRelative(0.0f, -0.748f, -0.227f, -0.975f, -0.975f, -0.975f)
                close()
                moveTo(18.281f, 16.098f)
                curveToRelative(0.453f, 0.0f, 0.747f, 0.294f, 0.747f, 0.751f)
                curveToRelative(0.0f, 0.28f, -0.109f, 0.448f, -0.199f, 0.54f)
                curveToRelative(-0.092f, 0.096f, -0.263f, 0.208f, -0.549f, 0.208f)
                curveToRelative(-0.285f, 0.0f, -0.456f, -0.112f, -0.549f, -0.207f)
                curveToRelative(-0.092f, -0.093f, -0.198f, -0.26f, -0.198f, -0.54f)
                curveToRelative(0.0f, -0.458f, 0.294f, -0.752f, 0.747f, -0.752f)
                close()
            }
        }
        .build()
        return _multideviceoFilled!!
    }

private var _multideviceoFilled: ImageVector? = null
