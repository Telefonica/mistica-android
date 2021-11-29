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

public val FilledGroup.VideoFilled: ImageVector
    get() {
        if (_videoFilled != null) {
            return _videoFilled!!
        }
        _videoFilled = Builder(name = "VideoFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveToRelative(5.512f, 0.0f, 10.0f, 4.488f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.488f, 10.0f, -10.0f, 10.0f)
                reflectiveCurveTo(2.0f, 17.512f, 2.0f, 12.0f)
                reflectiveCurveTo(6.488f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(9.057f, 6.356f)
                arcToRelative(0.533f, 0.533f, 0.0f, false, false, -0.535f, 0.0f)
                arcToRelative(0.534f, 0.534f, 0.0f, false, false, -0.27f, 0.466f)
                verticalLineToRelative(10.352f)
                arcToRelative(0.543f, 0.543f, 0.0f, false, false, 0.535f, 0.539f)
                arcToRelative(0.51f, 0.51f, 0.0f, false, false, 0.27f, -0.073f)
                lineToRelative(8.926f, -5.178f)
                arcToRelative(0.537f, 0.537f, 0.0f, false, false, 0.0f, -0.928f)
                close()
                moveTo(9.322f, 7.754f)
                lineTo(16.644f, 12.0f)
                lineToRelative(-7.322f, 4.246f)
                lineTo(9.322f, 7.754f)
                close()
            }
        }
        .build()
        return _videoFilled!!
    }

private var _videoFilled: ImageVector? = null
