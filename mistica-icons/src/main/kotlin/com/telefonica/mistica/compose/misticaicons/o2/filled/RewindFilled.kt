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

public val FilledGroup.RewindFilled: ImageVector
    get() {
        if (_rewindFilled != null) {
            return _rewindFilled!!
        }
        _rewindFilled = Builder(name = "RewindFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.488f, 2.0f, 2.0f, 6.488f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.488f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.488f, 10.0f, -10.0f)
                reflectiveCurveTo(17.512f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(10.949f, 16.264f)
                arcToRelative(0.535f, 0.535f, 0.0f, false, true, -0.38f, 0.914f)
                arcToRelative(0.532f, 0.532f, 0.0f, false, true, -0.379f, -0.155f)
                lineToRelative(-4.639f, -4.644f)
                arcToRelative(0.535f, 0.535f, 0.0f, false, true, 0.0f, -0.758f)
                lineToRelative(4.644f, -4.644f)
                arcToRelative(0.535f, 0.535f, 0.0f, true, true, 0.759f, 0.759f)
                lineTo(6.688f, 12.0f)
                lineToRelative(4.26f, 4.264f)
                close()
                moveTo(17.019f, 16.264f)
                arcToRelative(0.535f, 0.535f, 0.0f, false, true, -0.38f, 0.914f)
                arcToRelative(0.532f, 0.532f, 0.0f, false, true, -0.38f, -0.155f)
                lineToRelative(-4.638f, -4.644f)
                arcToRelative(0.535f, 0.535f, 0.0f, false, true, 0.0f, -0.758f)
                lineToRelative(4.643f, -4.644f)
                curveToRelative(0.21f, -0.21f, 0.549f, -0.21f, 0.759f, 0.0f)
                curveToRelative(0.21f, 0.21f, 0.21f, 0.549f, 0.0f, 0.759f)
                lineTo(12.759f, 12.0f)
                lineToRelative(4.26f, 4.264f)
                close()
            }
        }
        .build()
        return _rewindFilled!!
    }

private var _rewindFilled: ImageVector? = null
