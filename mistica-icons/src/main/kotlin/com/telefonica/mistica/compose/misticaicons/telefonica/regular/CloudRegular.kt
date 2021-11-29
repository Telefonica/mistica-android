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

public val RegularGroup.CloudRegular: ImageVector
    get() {
        if (_cloudRegular != null) {
            return _cloudRegular!!
        }
        _cloudRegular = Builder(name = "CloudRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.623f, 19.056f)
                horizontalLineTo(6.203f)
                arcToRelative(4.06f, 4.06f, 0.0f, false, true, -4.053f, -4.054f)
                curveToRelative(0.0f, -0.904f, 0.314f, -1.77f, 0.908f, -2.504f)
                arcToRelative(4.241f, 4.241f, 0.0f, false, true, 2.044f, -1.395f)
                curveToRelative(0.054f, -1.627f, 0.628f, -3.11f, 1.633f, -4.19f)
                curveToRelative(1.073f, -1.157f, 2.58f, -1.793f, 4.239f, -1.793f)
                arcToRelative(6.224f, 6.224f, 0.0f, false, true, 5.593f, 3.51f)
                horizontalLineToRelative(0.06f)
                arcToRelative(5.22f, 5.22f, 0.0f, false, true, 5.215f, 5.215f)
                curveToRelative(0.0f, 2.877f, -2.345f, 5.21f, -5.219f, 5.21f)
                close()
                moveTo(10.971f, 6.238f)
                curveToRelative(-0.687f, 0.0f, -1.336f, 0.128f, -1.927f, 0.383f)
                arcToRelative(4.401f, 4.401f, 0.0f, false, false, -1.49f, 1.054f)
                curveToRelative(-0.863f, 0.93f, -1.337f, 2.232f, -1.337f, 3.672f)
                curveToRelative(0.0f, 0.277f, -0.129f, 0.641f, -0.74f, 0.812f)
                arcToRelative(3.131f, 3.131f, 0.0f, false, false, -1.551f, 1.042f)
                curveToRelative(-0.297f, 0.37f, -0.656f, 0.986f, -0.656f, 1.801f)
                arcToRelative(2.937f, 2.937f, 0.0f, false, false, 2.933f, 2.933f)
                horizontalLineToRelative(10.42f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 4.096f, -4.095f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, -4.096f, -4.095f)
                curveToRelative(-0.05f, 0.0f, -0.109f, 0.002f, -0.168f, 0.005f)
                lineToRelative(-0.123f, 0.006f)
                curveToRelative(-0.151f, 0.005f, -0.527f, -0.034f, -0.711f, -0.502f)
                lineToRelative(-0.003f, -0.008f)
                arcToRelative(5.097f, 5.097f, 0.0f, false, false, -4.647f, -3.008f)
                close()
            }
        }
        .build()
        return _cloudRegular!!
    }

private var _cloudRegular: ImageVector? = null
