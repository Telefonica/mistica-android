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

public val FilledGroup.AlertFilled: ImageVector
    get() {
        if (_alertFilled != null) {
            return _alertFilled!!
        }
        _alertFilled = Builder(name = "AlertFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.905f, 21.837f)
                lineTo(12.582f, 1.453f)
                curveTo(12.438f, 1.17f, 12.178f, 1.0f, 11.887f, 1.0f)
                curveToRelative(-0.292f, 0.0f, -0.552f, 0.172f, -0.693f, 0.456f)
                lineTo(1.091f, 21.837f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, false, 0.025f, 0.788f)
                curveToRelative(0.145f, 0.231f, 0.41f, 0.375f, 0.709f, 0.375f)
                horizontalLineToRelative(20.353f)
                arcToRelative(0.82f, 0.82f, 0.0f, false, false, 0.708f, -0.372f)
                arcToRelative(0.799f, 0.799f, 0.0f, false, false, 0.019f, -0.79f)
                close()
                moveTo(12.0f, 19.93f)
                curveToRelative(-0.392f, 0.0f, -0.62f, -0.225f, -0.62f, -0.619f)
                curveToRelative(0.0f, -0.393f, 0.225f, -0.618f, 0.62f, -0.618f)
                curveToRelative(0.394f, 0.0f, 0.62f, 0.225f, 0.62f, 0.618f)
                curveToRelative(0.0f, 0.394f, -0.229f, 0.62f, -0.62f, 0.62f)
                close()
                moveTo(12.63f, 16.948f)
                curveToRelative(0.0f, 0.341f, -0.276f, 0.616f, -0.618f, 0.616f)
                arcToRelative(0.616f, 0.616f, 0.0f, false, true, -0.617f, -0.616f)
                lineTo(11.395f, 8.34f)
                curveToRelative(0.0f, -0.341f, 0.276f, -0.616f, 0.617f, -0.616f)
                curveToRelative(0.342f, 0.0f, 0.617f, 0.275f, 0.617f, 0.616f)
                verticalLineToRelative(8.608f)
                close()
            }
        }
        .build()
        return _alertFilled!!
    }

private var _alertFilled: ImageVector? = null
