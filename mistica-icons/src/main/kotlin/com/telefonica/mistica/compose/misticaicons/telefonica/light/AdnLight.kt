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

public val LightGroup.AdnLight: ImageVector
    get() {
        if (_adnLight != null) {
            return _adnLight!!
        }
        _adnLight = Builder(name = "AdnLight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.068f, 9.11f)
                curveToRelative(0.574f, -0.439f, 1.246f, -0.835f, 1.94f, -1.227f)
                curveToRelative(0.698f, 0.395f, 1.37f, 0.79f, 1.941f, 1.227f)
                horizontalLineToRelative(-3.881f)
                close()
                moveTo(9.186f, 9.934f)
                horizontalLineToRelative(5.648f)
                curveToRelative(0.398f, 0.472f, 0.658f, 1.012f, 0.74f, 1.65f)
                lineTo(8.446f, 11.584f)
                arcToRelative(3.152f, 3.152f, 0.0f, false, true, 0.739f, -1.65f)
                close()
                moveTo(13.918f, 14.882f)
                curveToRelative(-0.565f, 0.428f, -1.226f, 0.813f, -1.91f, 1.2f)
                curveToRelative(-0.68f, -0.387f, -1.34f, -0.775f, -1.906f, -1.2f)
                horizontalLineToRelative(3.816f)
                close()
                moveTo(9.211f, 14.058f)
                arcToRelative(3.127f, 3.127f, 0.0f, false, true, -0.759f, -1.647f)
                horizontalLineToRelative(7.116f)
                arcToRelative(3.139f, 3.139f, 0.0f, false, true, -0.759f, 1.647f)
                lineTo(9.211f, 14.058f)
                close()
                moveTo(16.52f, 11.982f)
                curveToRelative(0.0f, -2.277f, -1.77f, -3.497f, -3.657f, -4.585f)
                curveToRelative(1.887f, -1.088f, 3.657f, -2.31f, 3.657f, -4.585f)
                curveToRelative(0.0f, -0.227f, -0.202f, -0.412f, -0.45f, -0.412f)
                curveToRelative(-0.25f, 0.0f, -0.452f, 0.185f, -0.452f, 0.412f)
                curveToRelative(0.0f, 1.98f, -1.722f, 3.03f, -3.607f, 4.1f)
                curveToRelative(-1.884f, -1.07f, -3.606f, -2.12f, -3.606f, -4.1f)
                curveToRelative(0.0f, -0.227f, -0.202f, -0.412f, -0.451f, -0.412f)
                curveToRelative(-0.25f, 0.0f, -0.451f, 0.185f, -0.451f, 0.412f)
                curveToRelative(0.0f, 2.278f, 1.77f, 3.497f, 3.66f, 4.585f)
                curveToRelative(-1.888f, 1.088f, -3.66f, 2.31f, -3.66f, 4.585f)
                curveToRelative(0.0f, 1.089f, 0.417f, 1.926f, 1.044f, 2.633f)
                curveToRelative(0.034f, 0.079f, 0.096f, 0.144f, 0.171f, 0.19f)
                curveToRelative(0.67f, 0.685f, 1.538f, 1.242f, 2.442f, 1.765f)
                curveToRelative(-1.887f, 1.089f, -3.66f, 2.31f, -3.66f, 4.586f)
                curveToRelative(0.0f, 0.226f, 0.202f, 0.412f, 0.45f, 0.412f)
                curveToRelative(0.25f, 0.0f, 0.452f, -0.186f, 0.452f, -0.412f)
                curveToRelative(0.0f, -1.98f, 1.722f, -3.03f, 3.607f, -4.1f)
                curveToRelative(1.887f, 1.07f, 3.606f, 2.12f, 3.606f, 4.1f)
                curveToRelative(0.0f, 0.226f, 0.202f, 0.412f, 0.451f, 0.412f)
                curveToRelative(0.25f, 0.0f, 0.451f, -0.186f, 0.451f, -0.412f)
                curveToRelative(0.0f, -2.278f, -1.77f, -3.497f, -3.657f, -4.586f)
                curveToRelative(1.89f, -1.09f, 3.66f, -2.31f, 3.66f, -4.588f)
                close()
            }
        }
        .build()
        return _adnLight!!
    }

private var _adnLight: ImageVector? = null
