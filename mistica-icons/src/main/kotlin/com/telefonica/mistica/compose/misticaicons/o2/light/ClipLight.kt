package com.telefonica.mistica.compose.misticaicons.o2.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.o2.LightGroup

public val LightGroup.ClipLight: ImageVector
    get() {
        if (_clipLight != null) {
            return _clipLight!!
        }
        _clipLight = Builder(name = "ClipLight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.807f, 2.0f)
                curveToRelative(1.282f, 0.0f, 2.489f, 0.524f, 3.397f, 1.473f)
                lineToRelative(9.837f, 10.278f)
                arcToRelative(0.391f, 0.391f, 0.0f, false, true, 0.0f, 0.543f)
                arcToRelative(0.356f, 0.356f, 0.0f, false, true, -0.52f, 0.0f)
                lineTo(9.684f, 4.017f)
                arcTo(3.959f, 3.959f, 0.0f, false, false, 6.807f, 2.77f)
                curveToRelative(-1.088f, 0.0f, -2.105f, 0.44f, -2.877f, 1.246f)
                arcToRelative(4.323f, 4.323f, 0.0f, false, false, -1.192f, 3.006f)
                curveToRelative(0.0f, 1.137f, 0.421f, 2.2f, 1.192f, 3.005f)
                lineToRelative(10.92f, 11.41f)
                arcToRelative(2.512f, 2.512f, 0.0f, false, false, 3.658f, 0.0f)
                curveToRelative(1.008f, -1.053f, 1.008f, -2.769f, 0.0f, -3.821f)
                lineTo(7.593f, 6.202f)
                arcToRelative(1.094f, 1.094f, 0.0f, false, false, -1.567f, 0.0f)
                curveToRelative(-0.43f, 0.45f, -0.43f, 1.186f, 0.0f, 1.636f)
                lineToRelative(9.875f, 10.317f)
                arcToRelative(0.391f, 0.391f, 0.0f, false, true, 0.0f, 0.544f)
                arcToRelative(0.356f, 0.356f, 0.0f, false, true, -0.52f, 0.0f)
                lineTo(5.5f, 8.387f)
                arcToRelative(1.995f, 1.995f, 0.0f, false, true, 0.0f, -2.729f)
                arcToRelative(1.793f, 1.793f, 0.0f, false, true, 2.612f, 0.0f)
                lineToRelative(10.92f, 11.41f)
                curveToRelative(1.297f, 1.354f, 1.297f, 3.56f, 0.0f, 4.914f)
                arcTo(3.247f, 3.247f, 0.0f, false, true, 16.682f, 23.0f)
                arcToRelative(3.247f, 3.247f, 0.0f, false, true, -2.352f, -1.018f)
                lineTo(3.41f, 10.572f)
                arcTo(5.104f, 5.104f, 0.0f, false, true, 2.0f, 7.022f)
                curveToRelative(0.0f, -1.34f, 0.502f, -2.6f, 1.41f, -3.549f)
                curveTo(4.318f, 2.524f, 5.525f, 2.0f, 6.807f, 2.0f)
                close()
                moveTo(21.262f, 14.789f)
                curveToRelative(0.407f, 0.0f, 0.738f, 0.346f, 0.738f, 0.771f)
                curveToRelative(0.0f, 0.425f, -0.331f, 0.771f, -0.738f, 0.771f)
                reflectiveCurveToRelative(-0.738f, -0.346f, -0.738f, -0.771f)
                curveToRelative(0.0f, -0.425f, 0.331f, -0.771f, 0.738f, -0.771f)
                close()
            }
        }
        .build()
        return _clipLight!!
    }

private var _clipLight: ImageVector? = null
