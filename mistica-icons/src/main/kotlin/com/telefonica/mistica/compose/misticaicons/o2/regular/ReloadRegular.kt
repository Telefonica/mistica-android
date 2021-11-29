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

public val RegularGroup.ReloadRegular: ImageVector
    get() {
        if (_reloadRegular != null) {
            return _reloadRegular!!
        }
        _reloadRegular = Builder(name = "ReloadRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.54f, 19.706f)
                curveToRelative(-1.108f, 0.56f, -2.3f, 0.836f, -3.54f, 0.836f)
                curveToRelative(-4.512f, 0.0f, -8.18f, -3.832f, -8.18f, -8.546f)
                curveToRelative(0.0f, -1.743f, 0.512f, -3.427f, 1.448f, -4.84f)
                lineToRelative(0.212f, 1.547f)
                arcToRelative(0.707f, 0.707f, 0.0f, false, false, 0.688f, 0.627f)
                curveToRelative(0.032f, 0.0f, 0.064f, 0.0f, 0.096f, -0.009f)
                arcToRelative(0.72f, 0.72f, 0.0f, false, false, 0.592f, -0.819f)
                lineToRelative(-0.536f, -3.89f)
                lineToRelative(-3.72f, 0.56f)
                arcToRelative(0.725f, 0.725f, 0.0f, false, false, -0.593f, 0.823f)
                curveToRelative(0.056f, 0.397f, 0.404f, 0.677f, 0.784f, 0.618f)
                lineToRelative(1.257f, -0.188f)
                arcTo(10.32f, 10.32f, 0.0f, false, false, 2.419f, 12.0f)
                curveToRelative(0.0f, 5.516f, 4.293f, 10.0f, 9.573f, 10.0f)
                curveToRelative(1.448f, 0.0f, 2.844f, -0.33f, 4.136f, -0.982f)
                arcToRelative(0.744f, 0.744f, 0.0f, false, false, 0.324f, -0.974f)
                arcToRelative(0.672f, 0.672f, 0.0f, false, false, -0.912f, -0.338f)
                close()
                moveTo(21.993f, 17.996f)
                arcToRelative(0.71f, 0.71f, 0.0f, false, false, -0.784f, -0.618f)
                lineToRelative(-1.257f, 0.188f)
                arcTo(10.243f, 10.243f, 0.0f, false, false, 21.572f, 12.0f)
                curveToRelative(0.0f, -5.516f, -4.292f, -10.0f, -9.572f, -10.0f)
                arcToRelative(9.178f, 9.178f, 0.0f, false, false, -4.096f, 0.957f)
                curveToRelative(-0.348f, 0.167f, -0.492f, 0.61f, -0.332f, 0.974f)
                curveToRelative(0.16f, 0.363f, 0.584f, 0.514f, 0.932f, 0.346f)
                arcToRelative(7.81f, 7.81f, 0.0f, false, true, 3.5f, -0.819f)
                curveToRelative(4.512f, 0.0f, 8.18f, 3.832f, 8.18f, 8.546f)
                curveToRelative(0.0f, 1.751f, -0.512f, 3.418f, -1.44f, 4.83f)
                lineToRelative(-0.212f, -1.545f)
                arcToRelative(0.71f, 0.71f, 0.0f, false, false, -0.784f, -0.619f)
                arcToRelative(0.72f, 0.72f, 0.0f, false, false, -0.592f, 0.82f)
                lineToRelative(0.536f, 3.89f)
                lineToRelative(3.717f, -0.56f)
                arcToRelative(0.732f, 0.732f, 0.0f, false, false, 0.584f, -0.823f)
                close()
            }
        }
        .build()
        return _reloadRegular!!
    }

private var _reloadRegular: ImageVector? = null
