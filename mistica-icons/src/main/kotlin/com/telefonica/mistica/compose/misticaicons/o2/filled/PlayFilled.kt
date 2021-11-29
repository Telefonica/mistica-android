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

public val FilledGroup.PlayFilled: ImageVector
    get() {
        if (_playFilled != null) {
            return _playFilled!!
        }
        _playFilled = Builder(name = "PlayFilled", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.023f, 22.0f)
                curveToRelative(-0.37f, 0.0f, -0.743f, -0.108f, -1.08f, -0.32f)
                curveToRelative(-0.607f, -0.356f, -0.943f, -1.0f, -0.943f, -1.716f)
                verticalLineToRelative(-15.9f)
                curveToRelative(0.0f, -0.716f, 0.37f, -1.392f, 1.012f, -1.752f)
                curveToRelative(0.671f, -0.392f, 1.449f, -0.428f, 2.09f, -0.032f)
                lineToRelative(12.909f, 7.928f)
                curveToRelative(0.54f, 0.32f, 0.91f, 0.892f, 0.978f, 1.572f)
                curveToRelative(0.068f, 0.644f, -0.17f, 1.32f, -0.642f, 1.752f)
                curveToRelative(-0.034f, 0.036f, -0.068f, 0.072f, -0.102f, 0.072f)
                lineTo(7.069f, 21.716f)
                arcTo(2.13f, 2.13f, 0.0f, false, true, 6.023f, 22.0f)
                close()
            }
        }
        .build()
        return _playFilled!!
    }

private var _playFilled: ImageVector? = null
