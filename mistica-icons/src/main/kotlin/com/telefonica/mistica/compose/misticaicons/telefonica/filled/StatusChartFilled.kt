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

public val FilledGroup.StatusChartFilled: ImageVector
    get() {
        if (_statusChartFilled != null) {
            return _statusChartFilled!!
        }
        _statusChartFilled = Builder(name = "StatusChartFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.776f, 4.522f)
                arcToRelative(1.94f, 1.94f, 0.0f, false, false, -1.941f, 1.936f)
                curveToRelative(0.0f, 0.468f, 0.173f, 0.894f, 0.453f, 1.227f)
                lineToRelative(-2.392f, 4.0f)
                arcToRelative(1.87f, 1.87f, 0.0f, false, false, -0.448f, -0.056f)
                curveToRelative(-0.563f, 0.0f, -1.067f, 0.246f, -1.42f, 0.63f)
                lineToRelative(-4.129f, -1.81f)
                curveToRelative(0.003f, -0.053f, 0.017f, -0.103f, 0.017f, -0.16f)
                arcToRelative(1.94f, 1.94f, 0.0f, false, false, -3.882f, 0.0f)
                curveToRelative(0.0f, 0.477f, 0.187f, 0.925f, 0.495f, 1.275f)
                lineToRelative(-2.204f, 3.891f)
                arcToRelative(1.922f, 1.922f, 0.0f, false, false, -0.359f, -0.036f)
                arcToRelative(1.94f, 1.94f, 0.0f, false, false, -1.94f, 1.935f)
                arcToRelative(1.943f, 1.943f, 0.0f, false, false, 3.884f, 0.0f)
                curveToRelative(0.0f, -0.493f, -0.19f, -0.935f, -0.495f, -1.277f)
                lineToRelative(2.21f, -3.896f)
                curveToRelative(0.114f, 0.022f, 0.232f, 0.044f, 0.35f, 0.044f)
                curveToRelative(0.563f, 0.0f, 1.067f, -0.246f, 1.423f, -0.63f)
                lineToRelative(4.126f, 1.807f)
                curveToRelative(-0.003f, 0.053f, -0.017f, 0.104f, -0.017f, 0.16f)
                curveToRelative(0.0f, 1.07f, 0.868f, 1.94f, 1.938f, 1.94f)
                curveToRelative(1.07f, 0.0f, 1.942f, -0.868f, 1.942f, -1.938f)
                verticalLineToRelative(-0.002f)
                curveToRelative(0.0f, -0.457f, -0.166f, -0.872f, -0.432f, -1.202f)
                lineToRelative(2.398f, -4.014f)
                curveToRelative(0.134f, 0.03f, 0.274f, 0.05f, 0.42f, 0.05f)
                curveToRelative(1.07f, 0.0f, 1.936f, -0.865f, 1.938f, -1.935f)
                arcToRelative(1.935f, 1.935f, 0.0f, false, false, -1.935f, -1.939f)
            }
        }
        .build()
        return _statusChartFilled!!
    }

private var _statusChartFilled: ImageVector? = null
