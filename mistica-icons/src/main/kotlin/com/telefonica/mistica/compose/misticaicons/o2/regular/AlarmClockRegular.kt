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

public val RegularGroup.AlarmClockRegular: ImageVector
    get() {
        if (_alarmClockRegular != null) {
            return _alarmClockRegular!!
        }
        _alarmClockRegular = Builder(name = "AlarmClockRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.243f)
                curveToRelative(5.29f, 0.0f, 9.599f, 4.35f, 9.599f, 9.687f)
                arcToRelative(9.703f, 9.703f, 0.0f, false, true, -2.951f, 6.974f)
                lineToRelative(1.784f, 1.8f)
                arcTo(0.759f, 0.759f, 0.0f, false, true, 19.898f, 22.0f)
                arcToRelative(0.758f, 0.758f, 0.0f, false, true, -0.533f, -0.223f)
                lineToRelative(-1.884f, -1.901f)
                arcToRelative(9.454f, 9.454f, 0.0f, false, true, -5.485f, 1.75f)
                arcToRelative(9.454f, 9.454f, 0.0f, false, true, -5.485f, -1.75f)
                lineToRelative(-1.884f, 1.901f)
                arcToRelative(0.747f, 0.747f, 0.0f, false, true, -1.067f, 0.0f)
                arcToRelative(0.759f, 0.759f, 0.0f, false, true, 0.0f, -1.073f)
                lineToRelative(1.784f, -1.8f)
                arcTo(9.715f, 9.715f, 0.0f, false, true, 2.4f, 11.93f)
                curveToRelative(0.0f, -5.338f, 4.31f, -9.687f, 9.599f, -9.687f)
                close()
                moveTo(12.0f, 3.762f)
                curveToRelative(-4.46f, 0.0f, -8.094f, 3.667f, -8.094f, 8.168f)
                curveTo(3.906f, 16.44f, 7.54f, 20.1f, 12.0f, 20.1f)
                curveToRelative(4.46f, 0.0f, 8.094f, -3.668f, 8.094f, -8.169f)
                curveToRelative(0.0f, -4.5f, -3.634f, -8.168f, -8.094f, -8.168f)
                close()
                moveTo(12.0f, 5.284f)
                curveToRelative(0.413f, 0.0f, 0.75f, 0.341f, 0.75f, 0.762f)
                verticalLineToRelative(6.83f)
                lineTo(8.232f, 12.876f)
                arcToRelative(0.756f, 0.756f, 0.0f, false, true, -0.75f, -0.757f)
                curveToRelative(0.0f, -0.416f, 0.337f, -0.757f, 0.75f, -0.757f)
                horizontalLineToRelative(3.018f)
                verticalLineToRelative(-5.32f)
                curveToRelative(0.0f, -0.417f, 0.337f, -0.758f, 0.75f, -0.758f)
                close()
                moveTo(16.235f, 1.431f)
                arcToRelative(0.754f, 0.754f, 0.0f, false, true, 1.004f, -0.357f)
                arcTo(11.337f, 11.337f, 0.0f, false, true, 21.88f, 5.2f)
                arcToRelative(0.769f, 0.769f, 0.0f, false, true, -0.23f, 1.06f)
                arcToRelative(0.802f, 0.802f, 0.0f, false, true, -0.404f, 0.118f)
                arcToRelative(0.756f, 0.756f, 0.0f, false, true, -0.634f, -0.35f)
                arcToRelative(9.882f, 9.882f, 0.0f, false, false, -4.022f, -3.583f)
                arcToRelative(0.767f, 0.767f, 0.0f, false, true, -0.354f, -1.014f)
                close()
                moveTo(6.76f, 1.074f)
                arcToRelative(0.753f, 0.753f, 0.0f, false, true, 1.004f, 0.357f)
                arcToRelative(0.766f, 0.766f, 0.0f, false, true, -0.354f, 1.014f)
                arcToRelative(9.882f, 9.882f, 0.0f, false, false, -4.022f, 3.584f)
                arcToRelative(0.734f, 0.734f, 0.0f, false, true, -0.634f, 0.336f)
                arcToRelative(0.753f, 0.753f, 0.0f, false, true, -0.634f, -1.165f)
                arcToRelative(11.344f, 11.344f, 0.0f, false, true, 4.64f, -4.126f)
                close()
            }
        }
        .build()
        return _alarmClockRegular!!
    }

private var _alarmClockRegular: ImageVector? = null
