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
                moveTo(19.062f, 3.68f)
                lineTo(4.602f, 3.68f)
                arcToRelative(2.599f, 2.599f, 0.0f, false, false, -2.594f, 2.594f)
                verticalLineToRelative(11.23f)
                arcToRelative(2.599f, 2.599f, 0.0f, false, false, 2.594f, 2.594f)
                lineTo(18.98f, 20.098f)
                arcToRelative(2.68f, 2.68f, 0.0f, false, false, 2.675f, -2.675f)
                lineTo(21.655f, 6.274f)
                arcToRelative(2.599f, 2.599f, 0.0f, false, false, -2.593f, -2.593f)
                close()
                moveTo(16.216f, 5.148f)
                curveToRelative(0.484f, 0.0f, 0.812f, 0.328f, 0.812f, 0.816f)
                arcToRelative(0.81f, 0.81f, 0.0f, false, true, -0.219f, 0.585f)
                arcToRelative(0.801f, 0.801f, 0.0f, false, true, -0.593f, 0.23f)
                arcToRelative(0.806f, 0.806f, 0.0f, false, true, -0.594f, -0.23f)
                curveToRelative(-0.104f, -0.104f, -0.219f, -0.286f, -0.219f, -0.585f)
                curveToRelative(0.0f, -0.488f, 0.328f, -0.816f, 0.813f, -0.816f)
                close()
                moveTo(7.462f, 5.148f)
                curveToRelative(0.485f, 0.0f, 0.812f, 0.328f, 0.812f, 0.816f)
                arcToRelative(0.81f, 0.81f, 0.0f, false, true, -0.218f, 0.585f)
                arcToRelative(0.801f, 0.801f, 0.0f, false, true, -0.594f, 0.23f)
                arcToRelative(0.801f, 0.801f, 0.0f, false, true, -0.594f, -0.23f)
                arcToRelative(0.81f, 0.81f, 0.0f, false, true, -0.218f, -0.585f)
                curveToRelative(0.0f, -0.488f, 0.328f, -0.816f, 0.812f, -0.816f)
                close()
                moveTo(13.709f, 16.815f)
                lineTo(9.922f, 16.815f)
                arcToRelative(0.929f, 0.929f, 0.0f, false, true, -0.034f, -0.277f)
                curveToRelative(0.0f, -0.364f, 0.095f, -0.608f, 0.347f, -0.91f)
                lineToRelative(1.154f, -1.407f)
                curveToRelative(0.661f, -0.798f, 0.939f, -1.19f, 0.939f, -1.683f)
                curveToRelative(0.0f, -0.252f, -0.079f, -0.443f, -0.236f, -0.574f)
                curveToRelative(-0.182f, -0.157f, -0.476f, -0.227f, -0.902f, -0.227f)
                curveToRelative(-0.389f, 0.005f, -0.778f, 0.042f, -1.162f, 0.112f)
                verticalLineToRelative(-0.92f)
                arcToRelative(6.205f, 6.205f, 0.0f, false, true, 1.38f, -0.164f)
                curveToRelative(0.852f, 0.0f, 1.415f, 0.19f, 1.78f, 0.554f)
                curveToRelative(0.277f, 0.278f, 0.425f, 0.661f, 0.425f, 1.154f)
                curveToRelative(0.0f, 0.74f, -0.33f, 1.303f, -1.269f, 2.328f)
                lineToRelative(-1.033f, 1.129f)
                horizontalLineToRelative(2.398f)
                verticalLineToRelative(0.885f)
                close()
                moveTo(20.342f, 8.605f)
                lineTo(3.322f, 8.605f)
                curveToRelative(-0.277f, 0.0f, -0.504f, -0.182f, -0.504f, -0.406f)
                curveToRelative(0.0f, -0.224f, 0.227f, -0.406f, 0.504f, -0.406f)
                lineTo(20.34f, 7.793f)
                curveToRelative(0.277f, 0.0f, 0.504f, 0.182f, 0.504f, 0.406f)
                curveToRelative(0.0f, 0.224f, -0.224f, 0.406f, -0.501f, 0.406f)
                close()
            }
        }
        .build()
        return _calendarFilled!!
    }

private var _calendarFilled: ImageVector? = null
