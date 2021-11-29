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

public val FilledGroup.CalendarFilled: ImageVector
    get() {
        if (_calendarFilled != null) {
            return _calendarFilled!!
        }
        _calendarFilled = Builder(name = "CalendarFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 10.572f)
                lineTo(22.0f, 22.0f)
                lineTo(2.0f, 22.0f)
                lineTo(2.0f, 10.572f)
                horizontalLineToRelative(20.0f)
                close()
                moveTo(9.644f, 12.532f)
                lineTo(9.0f, 12.532f)
                curveToRelative(-0.428f, 0.0f, -1.216f, 0.18f, -1.608f, 0.464f)
                curveToRelative(-0.252f, 0.18f, -0.288f, 0.5f, -0.108f, 0.752f)
                reflectiveCurveToRelative(0.5f, 0.288f, 0.752f, 0.108f)
                curveToRelative(0.144f, -0.108f, 0.644f, -0.252f, 0.964f, -0.252f)
                horizontalLineToRelative(0.644f)
                curveToRelative(0.608f, 0.0f, 1.108f, 0.464f, 1.108f, 1.072f)
                curveToRelative(0.0f, 0.608f, -0.5f, 1.072f, -1.108f, 1.072f)
                lineTo(8.68f, 15.748f)
                arcToRelative(0.552f, 0.552f, 0.0f, false, false, -0.536f, 0.536f)
                curveToRelative(0.0f, 0.284f, 0.252f, 0.536f, 0.536f, 0.536f)
                horizontalLineToRelative(0.964f)
                curveToRelative(0.608f, 0.0f, 1.108f, 0.464f, 1.108f, 1.072f)
                curveToRelative(0.0f, 0.608f, -0.5f, 1.072f, -1.108f, 1.072f)
                lineTo(9.0f, 18.964f)
                curveToRelative(-0.32f, 0.0f, -0.82f, -0.144f, -0.964f, -0.252f)
                curveToRelative(-0.252f, -0.176f, -0.572f, -0.144f, -0.752f, 0.108f)
                curveToRelative(-0.176f, 0.252f, -0.144f, 0.572f, 0.108f, 0.752f)
                curveToRelative(0.428f, 0.284f, 1.18f, 0.464f, 1.608f, 0.464f)
                horizontalLineToRelative(0.64f)
                curveToRelative(1.216f, 0.0f, 2.18f, -0.964f, 2.18f, -2.144f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, false, -0.748f, -1.608f)
                curveToRelative(0.468f, -0.392f, 0.752f, -0.964f, 0.752f, -1.608f)
                curveToRelative(0.0f, -1.18f, -0.964f, -2.144f, -2.18f, -2.144f)
                close()
                moveTo(15.504f, 12.604f)
                arcToRelative(0.484f, 0.484f, 0.0f, false, false, -0.536f, 0.0f)
                lineToRelative(-1.644f, 0.928f)
                arcToRelative(0.502f, 0.502f, 0.0f, false, false, -0.216f, 0.716f)
                curveToRelative(0.144f, 0.288f, 0.464f, 0.36f, 0.716f, 0.216f)
                lineTo(14.68f, 14.0f)
                verticalLineToRelative(5.5f)
                curveToRelative(0.0f, 0.284f, 0.252f, 0.536f, 0.536f, 0.536f)
                arcToRelative(0.552f, 0.552f, 0.0f, false, false, 0.536f, -0.536f)
                verticalLineToRelative(-0.134f)
                lineToRelative(-0.001f, -0.099f)
                verticalLineToRelative(-0.436f)
                lineToRelative(-0.001f, -0.185f)
                verticalLineToRelative(-4.07f)
                lineToRelative(0.001f, -0.231f)
                verticalLineToRelative(-0.42f)
                curveToRelative(0.002f, -0.52f, 0.003f, -0.856f, 0.005f, -0.857f)
                arcToRelative(0.518f, 0.518f, 0.0f, false, false, -0.252f, -0.464f)
                close()
                moveTo(6.288f, 4.144f)
                verticalLineToRelative(2.144f)
                curveToRelative(0.0f, 1.0f, 0.784f, 1.784f, 1.784f, 1.784f)
                reflectiveCurveToRelative(1.784f, -0.784f, 1.784f, -1.784f)
                lineTo(9.856f, 4.144f)
                horizontalLineToRelative(4.288f)
                verticalLineToRelative(2.144f)
                curveToRelative(0.0f, 1.0f, 0.784f, 1.784f, 1.784f, 1.784f)
                reflectiveCurveToRelative(1.784f, -0.784f, 1.784f, -1.784f)
                lineTo(17.712f, 4.144f)
                horizontalLineToRelative(2.144f)
                curveToRelative(1.18f, 0.0f, 2.144f, 0.964f, 2.144f, 2.14f)
                lineTo(22.0f, 9.5f)
                lineTo(2.0f, 9.5f)
                lineTo(2.0f, 6.284f)
                curveToRelative(0.0f, -1.176f, 0.964f, -2.14f, 2.144f, -2.14f)
                horizontalLineToRelative(2.144f)
                close()
                moveTo(8.072f, 2.0f)
                curveToRelative(0.392f, 0.0f, 0.716f, 0.32f, 0.716f, 0.716f)
                verticalLineToRelative(3.572f)
                arcTo(0.72f, 0.72f, 0.0f, false, true, 8.072f, 7.0f)
                arcToRelative(0.718f, 0.718f, 0.0f, false, true, -0.716f, -0.716f)
                lineTo(7.356f, 2.716f)
                curveToRelative(0.0f, -0.396f, 0.324f, -0.716f, 0.716f, -0.716f)
                close()
                moveTo(15.928f, 2.0f)
                curveToRelative(0.396f, 0.0f, 0.716f, 0.32f, 0.716f, 0.716f)
                verticalLineToRelative(3.572f)
                arcToRelative(0.717f, 0.717f, 0.0f, false, true, -1.432f, -0.004f)
                lineTo(15.212f, 2.716f)
                curveToRelative(0.0f, -0.392f, 0.32f, -0.716f, 0.716f, -0.716f)
                close()
            }
        }
        .build()
        return _calendarFilled!!
    }

private var _calendarFilled: ImageVector? = null
