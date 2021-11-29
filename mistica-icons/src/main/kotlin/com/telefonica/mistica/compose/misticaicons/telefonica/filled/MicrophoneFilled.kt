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

public val FilledGroup.MicrophoneFilled: ImageVector
    get() {
        if (_microphoneFilled != null) {
            return _microphoneFilled!!
        }
        _microphoneFilled = Builder(name = "MicrophoneFilled", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.993f, 2.16f)
                curveToRelative(2.79f, 0.0f, 4.325f, 1.555f, 4.325f, 4.375f)
                verticalLineToRelative(6.79f)
                curveToRelative(0.0f, 2.821f, -1.535f, 4.376f, -4.328f, 4.376f)
                curveToRelative(-2.79f, 0.0f, -4.325f, -1.555f, -4.325f, -4.376f)
                verticalLineToRelative(-6.79f)
                curveToRelative(0.0f, -2.82f, 1.538f, -4.375f, 4.328f, -4.375f)
                close()
                moveTo(12.015f, 19.914f)
                arcToRelative(0.96f, 0.96f, 0.0f, false, true, 0.955f, 0.966f)
                arcToRelative(0.962f, 0.962f, 0.0f, false, true, -0.955f, 0.966f)
                arcToRelative(0.962f, 0.962f, 0.0f, false, true, -0.955f, -0.966f)
                arcToRelative(0.96f, 0.96f, 0.0f, false, true, 0.955f, -0.966f)
                close()
                moveTo(15.343f, 18.947f)
                arcToRelative(0.96f, 0.96f, 0.0f, false, true, 0.955f, 0.967f)
                arcToRelative(0.962f, 0.962f, 0.0f, false, true, -0.955f, 0.966f)
                arcToRelative(0.96f, 0.96f, 0.0f, false, true, -0.955f, -0.966f)
                arcToRelative(0.96f, 0.96f, 0.0f, false, true, 0.955f, -0.967f)
                close()
                moveTo(18.015f, 16.645f)
                arcToRelative(0.96f, 0.96f, 0.0f, false, true, 0.955f, 0.966f)
                arcToRelative(0.962f, 0.962f, 0.0f, false, true, -0.955f, 0.966f)
                arcToRelative(0.962f, 0.962f, 0.0f, false, true, -0.955f, -0.966f)
                arcToRelative(0.96f, 0.96f, 0.0f, false, true, 0.955f, -0.966f)
                close()
                moveTo(18.97f, 13.356f)
                arcToRelative(0.82f, 0.82f, 0.0f, false, true, 0.815f, 0.824f)
                arcToRelative(0.82f, 0.82f, 0.0f, false, true, -0.815f, 0.826f)
                arcToRelative(0.82f, 0.82f, 0.0f, false, true, -0.815f, -0.826f)
                arcToRelative(0.818f, 0.818f, 0.0f, false, true, 0.815f, -0.824f)
                close()
                moveTo(8.643f, 18.947f)
                arcToRelative(0.96f, 0.96f, 0.0f, false, true, 0.955f, 0.967f)
                arcToRelative(0.962f, 0.962f, 0.0f, false, true, -0.955f, 0.966f)
                arcToRelative(0.96f, 0.96f, 0.0f, false, true, -0.956f, -0.966f)
                arcToRelative(0.957f, 0.957f, 0.0f, false, true, 0.956f, -0.967f)
                close()
                moveTo(5.97f, 16.645f)
                arcToRelative(0.96f, 0.96f, 0.0f, false, true, 0.956f, 0.966f)
                arcToRelative(0.962f, 0.962f, 0.0f, false, true, -0.956f, 0.966f)
                arcToRelative(0.962f, 0.962f, 0.0f, false, true, -0.955f, -0.966f)
                arcToRelative(0.96f, 0.96f, 0.0f, false, true, 0.955f, -0.966f)
                close()
                moveTo(5.83f, 14.18f)
                arcToRelative(0.82f, 0.82f, 0.0f, false, true, -0.815f, 0.826f)
                arcToRelative(0.82f, 0.82f, 0.0f, false, true, -0.815f, -0.826f)
                arcToRelative(0.818f, 0.818f, 0.0f, false, true, 0.815f, -0.824f)
                curveToRelative(0.454f, 0.003f, 0.818f, 0.37f, 0.815f, 0.824f)
                close()
            }
        }
        .build()
        return _microphoneFilled!!
    }

private var _microphoneFilled: ImageVector? = null
