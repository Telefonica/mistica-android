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

public val RegularGroup.StatusChartRegular: ImageVector
    get() {
        if (_statusChartRegular != null) {
            return _statusChartRegular!!
        }
        _statusChartRegular = Builder(name = "StatusChartRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 22.0f)
                horizontalLineToRelative(-4.437f)
                lineTo(16.563f, 2.0f)
                lineTo(21.0f, 2.0f)
                verticalLineToRelative(20.0f)
                close()
                moveTo(18.044f, 20.434f)
                horizontalLineToRelative(1.475f)
                lineTo(19.519f, 3.566f)
                horizontalLineToRelative(-1.475f)
                verticalLineToRelative(16.868f)
                close()
                moveTo(14.718f, 22.0f)
                horizontalLineToRelative(-4.436f)
                lineTo(10.282f, 8.667f)
                horizontalLineToRelative(4.436f)
                lineTo(14.718f, 22.0f)
                close()
                moveTo(11.762f, 20.434f)
                horizontalLineToRelative(1.476f)
                lineTo(13.238f, 10.233f)
                horizontalLineToRelative(-1.476f)
                verticalLineToRelative(10.2f)
                close()
                moveTo(8.437f, 22.0f)
                lineTo(4.0f, 22.0f)
                verticalLineToRelative(-7.646f)
                horizontalLineToRelative(4.437f)
                lineTo(8.437f, 22.0f)
                close()
                moveTo(5.48f, 20.434f)
                horizontalLineToRelative(1.475f)
                verticalLineToRelative(-4.508f)
                lineTo(5.481f, 15.926f)
                verticalLineToRelative(4.508f)
                close()
            }
        }
        .build()
        return _statusChartRegular!!
    }

private var _statusChartRegular: ImageVector? = null
