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

public val FilledGroup.AlarmClockFilled: ImageVector
    get() {
        if (_alarmClockFilled != null) {
            return _alarmClockFilled!!
        }
        _alarmClockFilled = Builder(name = "AlarmClockFilled", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.003f, 2.243f)
                curveToRelative(5.29f, 0.0f, 9.6f, 4.35f, 9.6f, 9.687f)
                arcToRelative(9.696f, 9.696f, 0.0f, false, true, -2.943f, 6.974f)
                lineToRelative(1.772f, 1.8f)
                arcTo(0.759f, 0.759f, 0.0f, false, true, 19.898f, 22.0f)
                arcToRelative(0.758f, 0.758f, 0.0f, false, true, -0.533f, -0.223f)
                lineToRelative(-1.884f, -1.901f)
                arcToRelative(9.455f, 9.455f, 0.0f, false, true, -5.486f, 1.75f)
                arcToRelative(9.455f, 9.455f, 0.0f, false, true, -5.485f, -1.75f)
                lineToRelative(-1.884f, 1.901f)
                arcToRelative(0.747f, 0.747f, 0.0f, false, true, -1.068f, 0.0f)
                arcToRelative(0.759f, 0.759f, 0.0f, false, true, 0.0f, -1.073f)
                lineToRelative(1.784f, -1.8f)
                arcTo(9.715f, 9.715f, 0.0f, false, true, 2.4f, 11.93f)
                curveToRelative(0.0f, -5.338f, 4.314f, -9.687f, 9.603f, -9.687f)
                close()
                moveTo(12.0f, 5.473f)
                arcToRelative(0.57f, 0.57f, 0.0f, false, false, -0.567f, 0.573f)
                verticalLineToRelative(5.497f)
                horizontalLineToRelative(-3.2f)
                arcToRelative(0.57f, 0.57f, 0.0f, false, false, -0.568f, 0.572f)
                arcToRelative(0.57f, 0.57f, 0.0f, false, false, 0.567f, 0.572f)
                horizontalLineToRelative(4.335f)
                lineTo(12.567f, 6.046f)
                arcTo(0.57f, 0.57f, 0.0f, false, false, 12.0f, 5.474f)
                close()
                moveTo(17.248f, 1.078f)
                arcToRelative(11.405f, 11.405f, 0.0f, false, true, 4.631f, 4.126f)
                curveToRelative(0.23f, 0.35f, 0.125f, 0.829f, -0.23f, 1.048f)
                arcToRelative(0.691f, 0.691f, 0.0f, false, true, -0.395f, 0.126f)
                arcToRelative(0.737f, 0.737f, 0.0f, false, true, -0.634f, -0.35f)
                arcToRelative(9.842f, 9.842f, 0.0f, false, false, -4.022f, -3.579f)
                arcToRelative(0.766f, 0.766f, 0.0f, false, true, -0.354f, -1.013f)
                arcToRelative(0.746f, 0.746f, 0.0f, false, true, 1.004f, -0.358f)
                close()
                moveTo(7.765f, 1.431f)
                arcToRelative(0.767f, 0.767f, 0.0f, false, true, -0.354f, 1.014f)
                arcToRelative(9.83f, 9.83f, 0.0f, false, false, -4.022f, 3.584f)
                arcToRelative(0.77f, 0.77f, 0.0f, false, true, -0.642f, 0.349f)
                arcToRelative(0.779f, 0.779f, 0.0f, false, true, -0.405f, -0.118f)
                arcToRelative(0.773f, 0.773f, 0.0f, false, true, -0.22f, -1.056f)
                arcToRelative(11.325f, 11.325f, 0.0f, false, true, 4.639f, -4.13f)
                arcToRelative(0.754f, 0.754f, 0.0f, false, true, 1.004f, 0.357f)
                close()
            }
        }
        .build()
        return _alarmClockFilled!!
    }

private var _alarmClockFilled: ImageVector? = null
