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

public val FilledGroup.OpticalFiberFilled: ImageVector
    get() {
        if (_opticalFiberFilled != null) {
            return _opticalFiberFilled!!
        }
        _opticalFiberFilled = Builder(name = "OpticalFiberFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.532f, 6.405f)
                arcToRelative(1.47f, 1.47f, 0.0f, false, false, -1.35f, 2.042f)
                lineToRelative(-5.062f, 5.059f)
                lineToRelative(-1.426f, -1.426f)
                lineToRelative(7.264f, -7.261f)
                arcTo(1.47f, 1.47f, 0.0f, false, false, 22.0f, 3.469f)
                arcTo(1.47f, 1.47f, 0.0f, false, false, 20.532f, 2.0f)
                arcToRelative(1.47f, 1.47f, 0.0f, false, false, -1.35f, 2.042f)
                lineToRelative(-7.264f, 7.262f)
                lineToRelative(-1.426f, -1.426f)
                lineToRelative(5.053f, -5.06f)
                arcToRelative(1.47f, 1.47f, 0.0f, false, false, 2.042f, -1.35f)
                arcTo(1.47f, 1.47f, 0.0f, false, false, 16.119f, 2.0f)
                arcToRelative(1.47f, 1.47f, 0.0f, false, false, -1.35f, 2.042f)
                lineTo(9.71f, 9.096f)
                lineToRelative(-0.376f, -0.376f)
                curveToRelative(-0.419f, -0.419f, -1.144f, -0.419f, -1.558f, 0.0f)
                lineTo(2.0f, 14.494f)
                lineTo(9.504f, 22.0f)
                lineToRelative(5.773f, -5.774f)
                arcToRelative(1.105f, 1.105f, 0.0f, false, false, 0.0f, -1.558f)
                lineToRelative(-0.377f, -0.376f)
                lineToRelative(5.058f, -5.06f)
                curveToRelative(0.174f, 0.076f, 0.372f, 0.119f, 0.574f, 0.119f)
                arcTo(1.47f, 1.47f, 0.0f, false, false, 22.0f, 7.882f)
                curveToRelative(0.0f, -0.81f, -0.659f, -1.477f, -1.468f, -1.477f)
                close()
            }
        }
        .build()
        return _opticalFiberFilled!!
    }

private var _opticalFiberFilled: ImageVector? = null
