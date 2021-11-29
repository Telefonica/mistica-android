package com.telefonica.mistica.compose.misticaicons.o2.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.o2.LightGroup

public val LightGroup.StatusChartLight: ImageVector
    get() {
        if (_statusChartLight != null) {
            return _statusChartLight!!
        }
        _statusChartLight = Builder(name = "StatusChartLight", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 19.254f)
                arcToRelative(0.775f, 0.775f, 0.0f, false, true, -0.765f, 0.783f)
                arcToRelative(0.775f, 0.775f, 0.0f, false, true, -0.764f, -0.783f)
                curveToRelative(0.0f, -0.432f, 0.343f, -0.783f, 0.764f, -0.783f)
                curveToRelative(0.422f, 0.0f, 0.765f, 0.351f, 0.765f, 0.783f)
                close()
                moveTo(20.618f, 21.608f)
                arcToRelative(0.388f, 0.388f, 0.0f, false, false, -0.383f, -0.391f)
                lineTo(16.79f, 21.217f)
                lineTo(16.79f, 2.783f)
                horizontalLineToRelative(3.064f)
                lineTo(19.854f, 16.9f)
                curveToRelative(0.0f, 0.215f, 0.172f, 0.391f, 0.382f, 0.391f)
                curveToRelative(0.211f, 0.0f, 0.383f, -0.176f, 0.383f, -0.391f)
                lineTo(20.619f, 2.0f)
                lineTo(16.02f, 2.0f)
                verticalLineToRelative(20.0f)
                horizontalLineToRelative(4.215f)
                curveToRelative(0.211f, 0.0f, 0.383f, -0.176f, 0.383f, -0.392f)
                close()
                moveTo(14.108f, 8.667f)
                lineTo(9.51f, 8.667f)
                lineTo(9.51f, 22.0f)
                horizontalLineToRelative(4.598f)
                lineTo(14.108f, 8.667f)
                close()
                moveTo(10.275f, 9.45f)
                horizontalLineToRelative(3.063f)
                verticalLineToRelative(11.767f)
                horizontalLineToRelative(-3.063f)
                lineTo(10.275f, 9.45f)
                close()
                moveTo(7.598f, 14.55f)
                lineTo(3.0f, 14.55f)
                lineTo(3.0f, 22.0f)
                horizontalLineToRelative(4.598f)
                verticalLineToRelative(-7.45f)
                close()
                moveTo(3.765f, 15.333f)
                horizontalLineToRelative(3.063f)
                verticalLineToRelative(5.884f)
                lineTo(3.765f, 21.217f)
                verticalLineToRelative(-5.884f)
                close()
            }
        }
        .build()
        return _statusChartLight!!
    }

private var _statusChartLight: ImageVector? = null
