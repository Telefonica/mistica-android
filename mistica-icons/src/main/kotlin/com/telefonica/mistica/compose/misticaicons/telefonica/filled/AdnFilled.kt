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

public val FilledGroup.AdnFilled: ImageVector
    get() {
        if (_adnFilled != null) {
            return _adnFilled!!
        }
        _adnFilled = Builder(name = "AdnFilled", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.878f, 2.15f)
                curveToRelative(0.356f, 0.0f, 0.644f, 0.28f, 0.644f, 0.622f)
                curveToRelative(0.0f, 2.263f, -1.613f, 3.554f, -3.302f, 4.61f)
                curveToRelative(1.689f, 1.057f, 3.302f, 2.348f, 3.302f, 4.611f)
                reflectiveCurveToRelative(-1.613f, 3.555f, -3.305f, 4.608f)
                curveToRelative(1.69f, 1.056f, 3.303f, 2.347f, 3.303f, 4.61f)
                arcToRelative(0.633f, 0.633f, 0.0f, false, true, -0.645f, 0.622f)
                arcToRelative(0.634f, 0.634f, 0.0f, false, true, -0.644f, -0.621f)
                curveToRelative(0.0f, -1.838f, -1.462f, -2.821f, -3.221f, -3.877f)
                curveToRelative(-1.76f, 1.056f, -3.221f, 2.036f, -3.221f, 3.877f)
                arcToRelative(0.633f, 0.633f, 0.0f, false, true, -0.645f, 0.621f)
                arcToRelative(0.634f, 0.634f, 0.0f, false, true, -0.644f, -0.621f)
                curveToRelative(0.0f, -2.264f, 1.613f, -3.555f, 3.303f, -4.611f)
                curveToRelative(-0.757f, -0.47f, -1.493f, -0.994f, -2.082f, -1.627f)
                arcToRelative(0.619f, 0.619f, 0.0f, false, true, -0.148f, -0.16f)
                curveToRelative(-0.642f, -0.75f, -1.07f, -1.656f, -1.07f, -2.82f)
                curveToRelative(0.0f, -2.261f, 1.613f, -3.555f, 3.302f, -4.612f)
                curveToRelative(-1.689f, -1.056f, -3.302f, -2.347f, -3.302f, -4.61f)
                curveToRelative(0.0f, -0.345f, 0.288f, -0.622f, 0.644f, -0.622f)
                curveToRelative(0.356f, 0.0f, 0.644f, 0.28f, 0.644f, 0.622f)
                curveToRelative(0.0f, 1.84f, 1.46f, 2.82f, 3.222f, 3.877f)
                curveToRelative(1.762f, -1.054f, 3.22f, -2.037f, 3.22f, -3.877f)
                curveToRelative(0.0f, -0.345f, 0.29f, -0.622f, 0.645f, -0.622f)
                close()
                moveTo(15.164f, 12.629f)
                lineTo(8.859f, 12.629f)
                curveToRelative(0.095f, 0.468f, 0.294f, 0.877f, 0.577f, 1.244f)
                horizontalLineToRelative(5.15f)
                curveToRelative(0.28f, -0.37f, 0.483f, -0.776f, 0.578f, -1.244f)
                close()
                moveTo(12.01f, 8.114f)
                curveToRelative(-0.432f, 0.26f, -0.843f, 0.52f, -1.224f, 0.784f)
                horizontalLineToRelative(2.45f)
                arcToRelative(21.167f, 21.167f, 0.0f, false, false, -1.226f, -0.784f)
                close()
            }
        }
        .build()
        return _adnFilled!!
    }

private var _adnFilled: ImageVector? = null
