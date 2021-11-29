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

public val RegularGroup.CancelRegular: ImageVector
    get() {
        if (_cancelRegular != null) {
            return _cancelRegular!!
        }
        _cancelRegular = Builder(name = "CancelRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.85f, 6.143f)
                arcToRelative(0.746f, 0.746f, 0.0f, false, true, 0.0f, 1.059f)
                lineTo(13.052f, 12.0f)
                lineToRelative(4.794f, 4.795f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.045f, 1.079f)
                lineToRelative(-0.017f, -0.017f)
                lineToRelative(-4.79f, -4.795f)
                lineToRelative(-4.782f, 4.78f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.058f, 0.004f)
                lineToRelative(-0.004f, -0.003f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.062f)
                lineTo(10.931f, 12.0f)
                lineToRelative(-4.78f, -4.78f)
                arcToRelative(0.747f, 0.747f, 0.0f, false, true, -0.038f, -1.06f)
                arcToRelative(0.747f, 0.747f, 0.0f, false, true, 1.058f, -0.037f)
                lineToRelative(0.038f, 0.038f)
                lineToRelative(4.78f, 4.78f)
                lineToRelative(4.795f, -4.794f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, true, 1.066f, -0.004f)
                curveToRelative(-0.004f, 0.0f, -0.004f, 0.0f, 0.0f, 0.0f)
                close()
                moveTo(11.997f, 22.501f)
                curveToRelative(7.065f, 0.0f, 10.504f, -3.436f, 10.504f, -10.498f)
                curveTo(22.5f, 4.938f, 19.065f, 1.5f, 12.0f, 1.5f)
                curveTo(4.935f, 1.5f, 1.503f, 4.935f, 1.503f, 12.003f)
                curveToRelative(-0.004f, 7.062f, 3.432f, 10.498f, 10.494f, 10.498f)
                close()
                moveTo(11.997f, 0.0f)
                curveTo(19.577f, 0.0f, 24.0f, 3.832f, 24.0f, 12.003f)
                curveTo(24.0f, 20.18f, 19.578f, 24.0f, 11.997f, 24.0f)
                curveTo(4.415f, 24.0f, 0.0f, 20.179f, 0.0f, 12.003f)
                curveTo(0.0f, 3.832f, 4.415f, 0.0f, 11.997f, 0.0f)
                close()
            }
        }
        .build()
        return _cancelRegular!!
    }

private var _cancelRegular: ImageVector? = null
