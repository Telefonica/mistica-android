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

public val FilledGroup.BriefcaseFilled: ImageVector
    get() {
        if (_briefcaseFilled != null) {
            return _briefcaseFilled!!
        }
        _briefcaseFilled = Builder(name = "BriefcaseFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 12.093f)
                verticalLineToRelative(6.532f)
                curveTo(2.0f, 19.93f, 3.04f, 21.0f, 4.308f, 21.0f)
                horizontalLineToRelative(15.384f)
                curveTo(20.96f, 21.0f, 22.0f, 19.93f, 22.0f, 18.625f)
                verticalLineToRelative(-6.532f)
                lineTo(2.0f, 12.093f)
                close()
                moveTo(22.0f, 10.907f)
                lineTo(22.0f, 7.54f)
                curveToRelative(0.0f, -1.305f, -1.04f, -2.375f, -2.308f, -2.375f)
                horizontalLineToRelative(-3.884f)
                curveTo(15.576f, 3.383f, 13.964f, 2.0f, 12.0f, 2.0f)
                curveToRelative(-1.964f, 0.0f, -3.616f, 1.387f, -3.808f, 3.165f)
                lineTo(4.308f, 5.165f)
                curveTo(3.04f, 5.165f, 2.0f, 6.235f, 2.0f, 7.54f)
                verticalLineToRelative(3.363f)
                lineToRelative(20.0f, 0.004f)
                close()
                moveTo(12.0f, 3.585f)
                curveToRelative(1.112f, 0.0f, 2.04f, 0.675f, 2.268f, 1.584f)
                horizontalLineToRelative(-4.54f)
                curveTo(9.96f, 4.26f, 10.884f, 3.585f, 12.0f, 3.585f)
                close()
            }
        }
        .build()
        return _briefcaseFilled!!
    }

private var _briefcaseFilled: ImageVector? = null
