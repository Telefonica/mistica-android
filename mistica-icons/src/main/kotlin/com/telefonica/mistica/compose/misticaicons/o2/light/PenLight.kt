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

public val LightGroup.PenLight: ImageVector
    get() {
        if (_penLight != null) {
            return _penLight!!
        }
        _penLight = Builder(name = "PenLight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.155f, 2.052f)
                arcToRelative(3.315f, 3.315f, 0.0f, false, true, 4.844f, 0.0f)
                curveToRelative(1.335f, 1.402f, 1.335f, 3.684f, 0.0f, 5.086f)
                lineToRelative(-0.722f, 0.757f)
                lineToRelative(-8.85f, 9.293f)
                arcToRelative(0.366f, 0.366f, 0.0f, false, true, -0.257f, 0.11f)
                arcToRelative(0.349f, 0.349f, 0.0f, false, true, -0.256f, -0.11f)
                arcToRelative(0.392f, 0.392f, 0.0f, false, true, 0.0f, -0.535f)
                lineToRelative(8.597f, -9.019f)
                lineToRelative(-3.826f, -4.016f)
                lineTo(4.458f, 15.407f)
                lineToRelative(4.082f, 4.282f)
                arcToRelative(0.404f, 0.404f, 0.0f, false, true, 0.092f, 0.366f)
                arcToRelative(0.378f, 0.378f, 0.0f, false, true, -0.257f, 0.27f)
                lineToRelative(-5.922f, 1.662f)
                arcToRelative(0.352f, 0.352f, 0.0f, false, true, -0.349f, -0.097f)
                arcToRelative(0.404f, 0.404f, 0.0f, false, true, -0.092f, -0.366f)
                lineToRelative(1.587f, -6.218f)
                lineTo(3.599f, 15.3f)
                lineToRelative(0.017f, -0.042f)
                arcToRelative(0.13f, 0.13f, 0.0f, false, true, 0.016f, -0.042f)
                reflectiveCurveToRelative(0.004f, -0.004f, 0.004f, -0.008f)
                curveToRelative(0.008f, -0.009f, 0.012f, -0.021f, 0.02f, -0.03f)
                lineToRelative(0.008f, -0.008f)
                curveToRelative(0.008f, -0.013f, 0.016f, -0.021f, 0.028f, -0.034f)
                lineTo(15.432f, 2.81f)
                close()
                moveTo(4.133f, 16.139f)
                lineTo(2.87f, 21.086f)
                lineTo(7.58f, 19.76f)
                lineToRelative(-3.448f, -3.62f)
                close()
                moveTo(9.727f, 17.68f)
                curveToRelative(0.398f, 0.0f, 0.721f, 0.34f, 0.721f, 0.758f)
                curveToRelative(0.0f, 0.419f, -0.323f, 0.758f, -0.721f, 0.758f)
                curveToRelative(-0.399f, 0.0f, -0.722f, -0.34f, -0.722f, -0.758f)
                reflectiveCurveToRelative(0.323f, -0.758f, 0.722f, -0.758f)
                close()
                moveTo(20.489f, 2.586f)
                arcToRelative(2.618f, 2.618f, 0.0f, false, false, -3.825f, 0.0f)
                lineToRelative(-0.465f, 0.489f)
                lineToRelative(3.825f, 4.016f)
                lineToRelative(0.465f, -0.488f)
                curveToRelative(1.055f, -1.107f, 1.055f, -2.91f, 0.0f, -4.017f)
                close()
            }
        }
        .build()
        return _penLight!!
    }

private var _penLight: ImageVector? = null
