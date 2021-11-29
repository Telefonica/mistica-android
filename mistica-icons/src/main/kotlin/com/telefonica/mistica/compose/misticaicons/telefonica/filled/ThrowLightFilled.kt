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

public val FilledGroup.ThrowLightFilled: ImageVector
    get() {
        if (_throwLightFilled != null) {
            return _throwLightFilled!!
        }
        _throwLightFilled = Builder(name = "ThrowLightFilled", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.72f, 21.849f)
                arcToRelative(0.56f, 0.56f, 0.0f, false, true, -0.395f, -0.958f)
                lineToRelative(4.633f, -4.633f)
                arcToRelative(0.561f, 0.561f, 0.0f, false, true, 0.793f, 0.793f)
                lineToRelative(-4.636f, 4.633f)
                arcToRelative(0.55f, 0.55f, 0.0f, false, true, -0.395f, 0.165f)
                close()
                moveTo(7.757f, 21.852f)
                arcToRelative(0.56f, 0.56f, 0.0f, false, true, -0.4f, -0.953f)
                lineToRelative(2.293f, -2.35f)
                arcToRelative(0.562f, 0.562f, 0.0f, false, true, 0.827f, 0.76f)
                curveToRelative(-0.009f, 0.008f, -0.014f, 0.016f, -0.023f, 0.022f)
                lineTo(8.16f, 21.684f)
                arcToRelative(0.561f, 0.561f, 0.0f, false, true, -0.403f, 0.168f)
                close()
                moveTo(2.77f, 16.866f)
                arcToRelative(0.56f, 0.56f, 0.0f, false, true, -0.4f, -0.953f)
                lineToRelative(2.293f, -2.35f)
                arcToRelative(0.561f, 0.561f, 0.0f, false, true, 0.801f, 0.785f)
                lineToRelative(-2.294f, 2.35f)
                arcToRelative(0.55f, 0.55f, 0.0f, false, true, -0.4f, 0.168f)
                close()
                moveTo(20.46f, 2.16f)
                horizontalLineToRelative(-7.586f)
                arcToRelative(1.401f, 1.401f, 0.0f, false, false, -0.991f, 2.392f)
                lineToRelative(0.697f, 0.698f)
                lineToRelative(-6.221f, 6.22f)
                arcToRelative(1.402f, 1.402f, 0.0f, false, false, 0.0f, 1.981f)
                lineToRelative(4.196f, 4.2f)
                arcToRelative(1.402f, 1.402f, 0.0f, false, false, 1.98f, 0.0f)
                lineToRelative(6.222f, -6.225f)
                lineToRelative(0.708f, 0.712f)
                curveToRelative(0.26f, 0.263f, 0.617f, 0.411f, 0.99f, 0.411f)
                curveToRelative(0.772f, 0.0f, 1.4f, -0.627f, 1.402f, -1.4f)
                lineTo(21.857f, 3.56f)
                curveToRelative(0.0f, -0.774f, -0.624f, -1.401f, -1.397f, -1.401f)
                close()
            }
        }
        .build()
        return _throwLightFilled!!
    }

private var _throwLightFilled: ImageVector? = null
