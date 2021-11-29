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

public val FilledGroup.CloudFilled: ImageVector
    get() {
        if (_cloudFilled != null) {
            return _cloudFilled!!
        }
        _cloudFilled = Builder(name = "CloudFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.974f, 5.12f)
                arcToRelative(6.224f, 6.224f, 0.0f, false, true, 5.593f, 3.51f)
                horizontalLineToRelative(0.06f)
                arcToRelative(5.22f, 5.22f, 0.0f, false, true, 5.215f, 5.215f)
                curveToRelative(0.0f, 2.877f, -2.345f, 5.21f, -5.219f, 5.21f)
                horizontalLineTo(6.203f)
                arcToRelative(4.06f, 4.06f, 0.0f, false, true, -4.053f, -4.053f)
                curveToRelative(0.0f, -0.904f, 0.314f, -1.77f, 0.908f, -2.504f)
                arcToRelative(4.241f, 4.241f, 0.0f, false, true, 2.044f, -1.395f)
                curveToRelative(0.054f, -1.627f, 0.628f, -3.11f, 1.633f, -4.19f)
                curveToRelative(1.073f, -1.157f, 2.58f, -1.793f, 4.239f, -1.793f)
                close()
            }
        }
        .build()
        return _cloudFilled!!
    }

private var _cloudFilled: ImageVector? = null
