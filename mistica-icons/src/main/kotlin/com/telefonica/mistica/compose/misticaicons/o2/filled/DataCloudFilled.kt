package com.telefonica.mistica.compose.misticaicons.o2.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.o2.FilledGroup

public val FilledGroup.DataCloudFilled: ImageVector
    get() {
        if (_dataCloudFilled != null) {
            return _dataCloudFilled!!
        }
        _dataCloudFilled = Builder(name = "DataCloudFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.061f, 8.91f)
                arcToRelative(0.778f, 0.778f, 0.0f, false, true, -1.074f, -0.292f)
                arcTo(2.375f, 2.375f, 0.0f, false, false, 5.92f, 7.41f)
                curveToRelative(-1.295f, 0.0f, -2.354f, 1.078f, -2.354f, 2.408f)
                curveToRelative(0.0f, 1.33f, 1.054f, 2.407f, 2.354f, 2.407f)
                curveToRelative(0.431f, 0.0f, 0.783f, 0.36f, 0.783f, 0.801f)
                curveToRelative(0.0f, 0.442f, -0.352f, 0.8f, -0.783f, 0.8f)
                curveTo(3.757f, 13.828f, 2.0f, 12.032f, 2.0f, 9.82f)
                curveToRelative(0.0f, -2.213f, 1.757f, -4.01f, 3.92f, -4.01f)
                curveToRelative(0.226f, 0.0f, 0.446f, 0.026f, 0.667f, 0.068f)
                curveTo(7.415f, 3.017f, 10.015f, 1.0f, 12.977f, 1.0f)
                curveToRelative(2.99f, 0.0f, 5.63f, 2.058f, 6.423f, 5.0f)
                arcToRelative(0.804f, 0.804f, 0.0f, false, true, -0.547f, 0.985f)
                arcToRelative(0.782f, 0.782f, 0.0f, false, true, -0.963f, -0.56f)
                curveToRelative(-0.608f, -2.248f, -2.63f, -3.823f, -4.914f, -3.823f)
                curveToRelative(-2.308f, 0.0f, -4.326f, 1.601f, -4.918f, 3.855f)
                curveToRelative(0.522f, 0.338f, 0.968f, 0.795f, 1.285f, 1.355f)
                arcTo(0.808f, 0.808f, 0.0f, false, true, 9.06f, 8.91f)
                close()
                moveTo(15.491f, 8.654f)
                arcToRelative(0.378f, 0.378f, 0.0f, false, false, -0.317f, 0.0f)
                lineToRelative(-5.872f, 2.628f)
                lineToRelative(6.028f, 3.085f)
                lineToRelative(6.028f, -3.085f)
                lineToRelative(-5.867f, -2.628f)
                close()
                moveTo(8.67f, 18.643f)
                curveToRelative(0.0f, 0.154f, 0.085f, 0.292f, 0.216f, 0.36f)
                lineTo(14.748f, 22.0f)
                verticalLineToRelative(-6.596f)
                lineTo(8.67f, 12.298f)
                verticalLineToRelative(6.345f)
                close()
                moveTo(15.922f, 15.403f)
                lineTo(15.922f, 22.0f)
                lineToRelative(5.862f, -2.998f)
                arcToRelative(0.403f, 0.403f, 0.0f, false, false, 0.216f, -0.36f)
                verticalLineToRelative(-6.344f)
                lineToRelative(-6.078f, 3.106f)
                close()
            }
        }
        .build()
        return _dataCloudFilled!!
    }

private var _dataCloudFilled: ImageVector? = null
