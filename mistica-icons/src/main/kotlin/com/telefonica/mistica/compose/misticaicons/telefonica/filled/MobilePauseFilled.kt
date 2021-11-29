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

public val FilledGroup.MobilePauseFilled: ImageVector
    get() {
        if (_mobilePauseFilled != null) {
            return _mobilePauseFilled!!
        }
        _mobilePauseFilled = Builder(name = "MobilePauseFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.087f, 16.801f)
                curveToRelative(3.213f, 0.0f, 4.709f, -1.481f, 4.709f, -4.663f)
                curveToRelative(0.0f, -3.182f, -1.496f, -4.667f, -4.709f, -4.667f)
                curveToRelative(-3.21f, 0.0f, -4.706f, 1.482f, -4.706f, 4.667f)
                curveToRelative(0.0f, 3.182f, 1.496f, 4.663f, 4.706f, 4.663f)
                close()
                moveTo(20.894f, 3.115f)
                curveToRelative(0.641f, 0.639f, 0.955f, 1.535f, 0.955f, 2.737f)
                verticalLineToRelative(12.305f)
                curveToRelative(0.0f, 1.216f, -0.314f, 2.115f, -0.964f, 2.754f)
                curveToRelative(-0.644f, 0.63f, -1.549f, 0.938f, -2.764f, 0.938f)
                horizontalLineToRelative(-6.21f)
                curveToRelative(-1.219f, 0.0f, -2.12f, -0.308f, -2.762f, -0.938f)
                curveToRelative(-0.577f, -0.566f, -0.888f, -1.34f, -0.953f, -2.359f)
                verticalLineToRelative(-0.549f)
                curveToRelative(-0.036f, 0.0f, -0.072f, 0.003f, -0.112f, 0.003f)
                curveToRelative(-3.742f, 0.0f, -5.924f, -1.871f, -5.924f, -5.868f)
                curveToRelative(0.0f, -4.0f, 2.182f, -5.872f, 5.924f, -5.872f)
                curveToRelative(0.034f, 0.0f, 0.068f, 0.003f, 0.101f, 0.003f)
                verticalLineToRelative(-0.417f)
                curveToRelative(0.0f, -1.185f, 0.314f, -2.076f, 0.955f, -2.72f)
                curveToRelative(0.653f, -0.653f, 1.558f, -0.972f, 2.77f, -0.972f)
                horizontalLineToRelative(6.21f)
                curveToRelative(1.222f, 0.003f, 2.13f, 0.314f, 2.774f, 0.955f)
                close()
                moveTo(15.017f, 16.961f)
                curveToRelative(-0.658f, 0.0f, -1.053f, 0.392f, -1.053f, 1.048f)
                curveToRelative(0.0f, 0.32f, 0.092f, 0.577f, 0.274f, 0.759f)
                curveToRelative(0.185f, 0.188f, 0.454f, 0.286f, 0.78f, 0.286f)
                curveToRelative(0.324f, 0.0f, 0.593f, -0.098f, 0.778f, -0.286f)
                curveToRelative(0.182f, -0.185f, 0.274f, -0.44f, 0.274f, -0.76f)
                curveToRelative(0.0f, -0.655f, -0.392f, -1.047f, -1.053f, -1.047f)
                close()
                moveTo(6.267f, 9.306f)
                curveToRelative(0.336f, 0.0f, 0.607f, 0.269f, 0.607f, 0.602f)
                verticalLineToRelative(4.711f)
                arcToRelative(0.607f, 0.607f, 0.0f, false, true, -0.608f, 0.605f)
                arcToRelative(0.605f, 0.605f, 0.0f, false, true, -0.607f, -0.605f)
                lineTo(5.659f, 9.911f)
                curveToRelative(0.0f, -0.334f, 0.274f, -0.605f, 0.607f, -0.605f)
                close()
                moveTo(9.717f, 9.292f)
                curveToRelative(0.337f, 0.0f, 0.608f, 0.271f, 0.608f, 0.602f)
                verticalLineToRelative(4.711f)
                arcToRelative(0.607f, 0.607f, 0.0f, false, true, -0.608f, 0.605f)
                arcToRelative(0.605f, 0.605f, 0.0f, false, true, -0.607f, -0.605f)
                lineTo(9.11f, 9.894f)
                curveToRelative(0.0f, -0.333f, 0.271f, -0.602f, 0.607f, -0.602f)
                close()
            }
        }
        .build()
        return _mobilePauseFilled!!
    }

private var _mobilePauseFilled: ImageVector? = null
