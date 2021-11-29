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
                moveTo(21.0f, 2.0f)
                verticalLineToRelative(20.0f)
                horizontalLineToRelative(-4.437f)
                verticalLineTo(2.0f)
                horizontalLineTo(21.0f)
                close()
                moveTo(10.282f, 22.0f)
                horizontalLineToRelative(4.436f)
                verticalLineTo(8.667f)
                horizontalLineToRelative(-4.436f)
                verticalLineTo(22.0f)
                close()
                moveTo(4.0f, 22.0f)
                horizontalLineToRelative(4.437f)
                verticalLineToRelative(-7.45f)
                horizontalLineTo(4.0f)
                verticalLineTo(22.0f)
                close()
            }
        }
        .build()
        return _statusChartFilled!!
    }

private var _statusChartFilled: ImageVector? = null
