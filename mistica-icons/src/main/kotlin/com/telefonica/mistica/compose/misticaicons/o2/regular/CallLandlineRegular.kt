package com.telefonica.mistica.compose.misticaicons.o2.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.o2.RegularGroup

public val RegularGroup.CallLandlineRegular: ImageVector
    get() {
        if (_callLandlineRegular != null) {
            return _callLandlineRegular!!
        }
        _callLandlineRegular = Builder(name = "CallLandlineRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.72f, 22.0f)
                lineTo(7.69f, 22.0f)
                curveToRelative(-1.459f, -0.008f, -2.713f, -0.501f, -3.635f, -1.443f)
                lineToRelative(-1.359f, -1.382f)
                curveToRelative(-0.89f, -0.898f, -0.93f, -2.309f, -0.096f, -3.134f)
                lineToRelative(2.096f, -2.072f)
                curveToRelative(0.38f, -0.381f, 0.898f, -0.59f, 1.459f, -0.59f)
                horizontalLineToRelative(0.008f)
                curveToRelative(0.605f, 0.0f, 1.214f, 0.27f, 1.659f, 0.714f)
                lineToRelative(1.435f, 1.45f)
                curveToRelative(0.236f, 0.237f, 0.557f, 0.357f, 0.962f, 0.365f)
                horizontalLineToRelative(0.008f)
                curveToRelative(1.03f, 0.0f, 2.396f, -0.753f, 3.666f, -2.007f)
                curveToRelative(1.263f, -1.27f, 2.008f, -2.645f, 2.008f, -3.675f)
                curveToRelative(0.0f, -0.405f, -0.12f, -0.73f, -0.364f, -0.962f)
                lineToRelative(-1.451f, -1.435f)
                arcToRelative(2.358f, 2.358f, 0.0f, false, true, -0.714f, -1.66f)
                curveToRelative(0.0f, -0.556f, 0.213f, -1.085f, 0.59f, -1.474f)
                lineTo(16.033f, 2.6f)
                curveToRelative(0.833f, -0.833f, 2.24f, -0.793f, 3.141f, 0.096f)
                lineToRelative(1.383f, 1.367f)
                curveToRelative(0.93f, 0.922f, 1.435f, 2.176f, 1.443f, 3.635f)
                curveToRelative(0.016f, 2.801f, -1.772f, 6.208f, -4.897f, 9.366f)
                lineToRelative(-0.049f, 0.048f)
                curveTo(13.913f, 20.22f, 10.514f, 22.0f, 7.721f, 22.0f)
                close()
                moveTo(6.15f, 14.834f)
                arcToRelative(0.601f, 0.601f, 0.0f, false, false, -0.429f, 0.169f)
                lineToRelative(-2.096f, 2.072f)
                curveToRelative(-0.268f, 0.268f, -0.22f, 0.745f, 0.104f, 1.078f)
                lineToRelative(1.367f, 1.382f)
                curveToRelative(0.657f, 0.666f, 1.53f, 0.994f, 2.597f, 1.002f)
                curveToRelative(2.428f, 0.008f, 5.446f, -1.619f, 8.327f, -4.476f)
                lineToRelative(0.04f, -0.04f)
                curveToRelative(2.858f, -2.882f, 4.485f, -5.916f, 4.477f, -8.328f)
                curveToRelative(-0.008f, -1.078f, -0.34f, -1.952f, -1.002f, -2.597f)
                lineToRelative(-1.382f, -1.367f)
                curveToRelative(-0.325f, -0.324f, -0.81f, -0.372f, -1.079f, -0.104f)
                lineToRelative(-2.08f, 2.096f)
                arcToRelative(0.619f, 0.619f, 0.0f, false, false, -0.168f, 0.437f)
                curveToRelative(0.0f, 0.228f, 0.104f, 0.453f, 0.285f, 0.633f)
                lineToRelative(1.45f, 1.435f)
                curveToRelative(0.517f, 0.509f, 0.794f, 1.198f, 0.794f, 1.992f)
                curveToRelative(0.008f, 1.422f, -0.882f, 3.142f, -2.437f, 4.713f)
                curveToRelative(-1.57f, 1.555f, -3.294f, 2.436f, -4.712f, 2.436f)
                curveToRelative(-0.794f, -0.008f, -1.483f, -0.276f, -1.992f, -0.793f)
                lineToRelative(-1.435f, -1.451f)
                arcToRelative(0.85f, 0.85f, 0.0f, false, false, -0.63f, -0.289f)
                close()
            }
        }
        .build()
        return _callLandlineRegular!!
    }

private var _callLandlineRegular: ImageVector? = null
