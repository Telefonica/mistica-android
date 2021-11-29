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

public val RegularGroup.QuestionRegular: ImageVector
    get() {
        if (_questionRegular != null) {
            return _questionRegular!!
        }
        _questionRegular = Builder(name = "QuestionRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveToRelative(5.5f, 0.0f, 10.0f, 4.5f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.5f, 10.0f, -10.0f, 10.0f)
                reflectiveCurveTo(2.0f, 17.5f, 2.0f, 12.0f)
                reflectiveCurveTo(6.5f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 3.428f)
                curveToRelative(-4.716f, 0.0f, -8.572f, 3.856f, -8.572f, 8.572f)
                curveToRelative(0.0f, 4.716f, 3.856f, 8.572f, 8.572f, 8.572f)
                curveToRelative(4.716f, 0.0f, 8.572f, -3.856f, 8.572f, -8.572f)
                curveToRelative(0.0f, -4.716f, -3.856f, -8.572f, -8.572f, -8.572f)
                close()
                moveTo(12.0f, 16.036f)
                arcToRelative(0.784f, 0.784f, 0.0f, true, true, 0.0f, 1.568f)
                arcToRelative(0.784f, 0.784f, 0.0f, false, true, 0.0f, -1.568f)
                close()
                moveTo(12.18f, 6.46f)
                curveToRelative(1.0f, 0.0f, 1.928f, 0.464f, 2.536f, 1.252f)
                curveToRelative(0.716f, 0.928f, 0.82f, 2.644f, -0.108f, 3.608f)
                lineToRelative(-1.036f, 1.036f)
                curveToRelative(-0.536f, 0.608f, -0.856f, 1.356f, -0.856f, 2.144f)
                arcToRelative(0.72f, 0.72f, 0.0f, false, true, -0.716f, 0.716f)
                arcToRelative(0.718f, 0.718f, 0.0f, false, true, -0.716f, -0.716f)
                curveToRelative(0.0f, -1.18f, 0.464f, -2.284f, 1.284f, -3.144f)
                lineToRelative(1.036f, -1.036f)
                curveToRelative(0.392f, -0.392f, 0.32f, -1.284f, 0.0f, -1.716f)
                arcToRelative(1.809f, 1.809f, 0.0f, false, false, -1.428f, -0.716f)
                lineTo(12.0f, 7.888f)
                curveToRelative(-0.572f, 0.0f, -1.108f, 0.32f, -1.392f, 0.784f)
                curveToRelative(-0.216f, 0.356f, -0.644f, 0.464f, -0.964f, 0.252f)
                curveToRelative(-0.356f, -0.216f, -0.464f, -0.644f, -0.252f, -0.964f)
                arcTo(3.016f, 3.016f, 0.0f, false, true, 12.0f, 6.46f)
                horizontalLineToRelative(0.18f)
                close()
            }
        }
        .build()
        return _questionRegular!!
    }

private var _questionRegular: ImageVector? = null
