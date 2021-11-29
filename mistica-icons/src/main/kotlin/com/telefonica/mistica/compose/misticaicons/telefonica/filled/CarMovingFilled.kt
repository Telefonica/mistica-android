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

public val FilledGroup.CarMovingFilled: ImageVector
    get() {
        if (_carMovingFilled != null) {
            return _carMovingFilled!!
        }
        _carMovingFilled = Builder(name = "CarMovingFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.457f, 15.661f)
                curveToRelative(0.703f, 0.0f, 1.03f, -0.328f, 1.03f, -1.034f)
                curveToRelative(0.0f, -0.705f, -0.327f, -1.033f, -1.03f, -1.033f)
                curveToRelative(-0.704f, 0.0f, -1.031f, 0.328f, -1.031f, 1.033f)
                curveToRelative(0.0f, 0.706f, 0.327f, 1.034f, 1.03f, 1.034f)
                close()
                moveTo(9.524f, 15.655f)
                curveToRelative(0.703f, 0.0f, 1.03f, -0.327f, 1.03f, -1.033f)
                reflectiveCurveToRelative(-0.327f, -1.034f, -1.03f, -1.034f)
                curveToRelative(-0.703f, 0.0f, -1.031f, 0.328f, -1.031f, 1.034f)
                curveToRelative(-0.003f, 0.706f, 0.325f, 1.033f, 1.03f, 1.033f)
                close()
                moveTo(21.14f, 11.865f)
                curveToRelative(1.048f, 1.715f, 0.353f, 2.877f, -0.157f, 3.25f)
                arcToRelative(0.597f, 0.597f, 0.0f, false, true, -0.353f, 0.115f)
                horizontalLineToRelative(-2.014f)
                curveToRelative(-0.218f, 1.016f, -1.0f, 1.633f, -2.16f, 1.633f)
                curveToRelative(-1.16f, 0.0f, -1.94f, -0.617f, -2.16f, -1.633f)
                horizontalLineToRelative(-2.615f)
                curveToRelative(-0.222f, 1.014f, -1.003f, 1.624f, -2.16f, 1.624f)
                curveToRelative(-1.157f, 0.0f, -1.936f, -0.61f, -2.16f, -1.624f)
                horizontalLineToRelative(-1.31f)
                arcToRelative(0.599f, 0.599f, 0.0f, false, true, -0.583f, -0.46f)
                curveToRelative(-0.009f, -0.033f, -0.202f, -0.848f, -0.132f, -2.064f)
                curveToRelative(-0.008f, -0.905f, 0.552f, -2.432f, 1.82f, -3.712f)
                curveToRelative(0.894f, -0.902f, 2.443f, -1.977f, 4.76f, -1.977f)
                curveToRelative(3.605f, 0.0f, 5.44f, 2.042f, 5.98f, 2.773f)
                curveToRelative(0.678f, 0.112f, 2.306f, 0.532f, 3.244f, 2.076f)
                close()
                moveTo(4.328f, 12.883f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, true, 0.0f, 1.2f)
                lineTo(3.022f, 14.083f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, true, 0.0f, -1.2f)
                horizontalLineToRelative(1.306f)
                close()
                moveTo(4.583f, 10.883f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, true, 0.0f, 1.2f)
                lineTo(2.599f, 12.083f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, true, 0.0f, -1.2f)
                horizontalLineToRelative(1.984f)
                close()
                moveTo(5.81f, 9.507f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, true, -0.6f, 0.6f)
                lineTo(3.67f, 10.107f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, true, 0.0f, -1.2f)
                horizontalLineToRelative(1.54f)
                curveToRelative(0.333f, 0.0f, 0.6f, 0.27f, 0.6f, 0.6f)
                close()
            }
        }
        .build()
        return _carMovingFilled!!
    }

private var _carMovingFilled: ImageVector? = null
