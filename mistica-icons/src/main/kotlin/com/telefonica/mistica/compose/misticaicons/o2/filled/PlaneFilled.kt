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

public val FilledGroup.PlaneFilled: ImageVector
    get() {
        if (_planeFilled != null) {
            return _planeFilled!!
        }
        _planeFilled = Builder(name = "PlaneFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.403f, 2.612f)
                arcToRelative(2.002f, 2.002f, 0.0f, false, false, -2.882f, 0.0f)
                lineTo(14.657f, 6.57f)
                lineToRelative(-7.85f, -2.156f)
                arcToRelative(1.828f, 1.828f, 0.0f, false, false, -1.787f, 0.49f)
                lineTo(3.45f, 6.512f)
                lineToRelative(7.14f, 4.225f)
                lineToRelative(-3.688f, 3.78f)
                lineToRelative(-2.067f, -0.57f)
                arcToRelative(1.828f, 1.828f, 0.0f, false, false, -1.787f, 0.491f)
                lineTo(2.0f, 15.512f)
                lineToRelative(4.911f, 2.904f)
                arcToRelative(1.825f, 1.825f, 0.0f, false, false, 2.238f, -0.301f)
                lineToRelative(4.257f, -4.488f)
                lineTo(17.596f, 21.0f)
                lineToRelative(1.57f, -1.608f)
                curveToRelative(0.464f, -0.476f, 0.649f, -1.18f, 0.478f, -1.83f)
                lineToRelative(-2.105f, -8.044f)
                lineToRelative(3.864f, -3.958f)
                arcToRelative(2.118f, 2.118f, 0.0f, false, false, 0.0f, -2.948f)
                close()
            }
        }
        .build()
        return _planeFilled!!
    }

private var _planeFilled: ImageVector? = null
