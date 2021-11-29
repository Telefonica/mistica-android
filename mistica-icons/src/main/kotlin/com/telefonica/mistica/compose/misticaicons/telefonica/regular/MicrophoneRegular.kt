package com.telefonica.mistica.compose.misticaicons.telefonica.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.telefonica.RegularGroup

public val RegularGroup.MicrophoneRegular: ImageVector
    get() {
        if (_microphoneRegular != null) {
            return _microphoneRegular!!
        }
        _microphoneRegular = Builder(name = "MicrophoneRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.3f, 13.412f)
                verticalLineToRelative(-6.72f)
                curveToRelative(0.0f, -2.227f, -1.08f, -3.31f, -3.307f, -3.31f)
                reflectiveCurveToRelative(-3.308f, 1.08f, -3.308f, 3.31f)
                verticalLineToRelative(6.72f)
                curveToRelative(0.0f, 2.227f, 1.08f, 3.311f, 3.308f, 3.311f)
                curveToRelative(2.227f, 0.0f, 3.308f, -1.084f, 3.308f, -3.31f)
                close()
                moveTo(11.994f, 2.16f)
                curveToRelative(2.921f, 0.0f, 4.53f, 1.61f, 4.53f, 4.532f)
                verticalLineToRelative(6.72f)
                curveToRelative(0.0f, 2.922f, -1.609f, 4.532f, -4.53f, 4.532f)
                curveToRelative(-2.922f, 0.0f, -4.53f, -1.61f, -4.53f, -4.532f)
                verticalLineToRelative(-6.72f)
                curveToRelative(0.0f, -2.921f, 1.608f, -4.532f, 4.53f, -4.532f)
                close()
                moveTo(12.016f, 19.933f)
                arcToRelative(0.957f, 0.957f, 0.0f, false, true, 0.0f, 1.913f)
                arcToRelative(0.956f, 0.956f, 0.0f, false, true, 0.0f, -1.913f)
                close()
                moveTo(15.344f, 18.978f)
                arcToRelative(0.956f, 0.956f, 0.0f, true, true, -0.003f, 1.913f)
                arcToRelative(0.956f, 0.956f, 0.0f, false, true, 0.003f, -1.913f)
                close()
                moveTo(18.016f, 16.698f)
                arcToRelative(0.956f, 0.956f, 0.0f, false, true, 0.0f, 1.91f)
                arcToRelative(0.956f, 0.956f, 0.0f, false, true, 0.0f, -1.91f)
                close()
                moveTo(18.971f, 13.443f)
                arcToRelative(0.814f, 0.814f, 0.0f, true, true, 0.0f, 1.63f)
                arcToRelative(0.814f, 0.814f, 0.0f, true, true, 0.0f, -1.63f)
                close()
                moveTo(8.643f, 18.978f)
                arcToRelative(0.956f, 0.956f, 0.0f, true, true, -0.003f, 1.913f)
                arcToRelative(0.956f, 0.956f, 0.0f, false, true, 0.003f, -1.913f)
                close()
                moveTo(5.97f, 16.698f)
                arcToRelative(0.956f, 0.956f, 0.0f, false, true, 0.0f, 1.91f)
                arcToRelative(0.956f, 0.956f, 0.0f, false, true, 0.0f, -1.91f)
                close()
                moveTo(5.83f, 14.261f)
                arcToRelative(0.814f, 0.814f, 0.0f, true, true, -1.63f, 0.0f)
                arcToRelative(0.814f, 0.814f, 0.0f, true, true, 1.63f, 0.0f)
                close()
            }
        }
        .build()
        return _microphoneRegular!!
    }

private var _microphoneRegular: ImageVector? = null
