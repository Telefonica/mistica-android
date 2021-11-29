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

public val FilledGroup.AcademicFilled: ImageVector
    get() {
        if (_academicFilled != null) {
            return _academicFilled!!
        }
        _academicFilled = Builder(name = "AcademicFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.72f, 15.44f)
                curveToRelative(0.326f, 0.0f, 0.648f, -0.082f, 0.891f, -0.163f)
                lineToRelative(5.992f, -2.672f)
                verticalLineToRelative(2.753f)
                curveToRelative(0.0f, 0.81f, -0.566f, 1.457f, -1.294f, 1.62f)
                curveToRelative(-1.294f, 0.243f, -3.076f, 0.727f, -4.373f, 1.78f)
                curveToRelative(-0.325f, 0.244f, -0.728f, 0.407f, -1.134f, 0.407f)
                curveToRelative(-0.406f, 0.0f, -0.81f, -0.163f, -1.135f, -0.406f)
                curveToRelative(-1.294f, -1.054f, -3.075f, -1.538f, -4.372f, -1.782f)
                arcTo(1.654f, 1.654f, 0.0f, false, true, 5.0f, 15.358f)
                verticalLineToRelative(-2.672f)
                lineToRelative(5.829f, 2.59f)
                curveToRelative(0.244f, 0.082f, 0.568f, 0.163f, 0.89f, 0.163f)
                close()
                moveTo(21.113f, 16.571f)
                curveToRelative(0.406f, 0.325f, 0.647f, 0.972f, 0.647f, 1.375f)
                curveToRelative(0.0f, 0.244f, -0.081f, 0.485f, -0.244f, 0.566f)
                curveToRelative(-0.162f, 0.163f, -0.484f, 0.244f, -0.728f, 0.244f)
                lineTo(20.3f, 18.756f)
                curveToRelative(-0.325f, 0.0f, -0.647f, 0.0f, -0.89f, -0.244f)
                arcToRelative(0.736f, 0.736f, 0.0f, false, true, -0.244f, -0.566f)
                curveToRelative(0.0f, -0.406f, 0.244f, -1.053f, 0.647f, -1.375f)
                verticalLineToRelative(-5.423f)
                lineToRelative(-7.61f, 3.4f)
                curveToRelative(-0.163f, 0.082f, -0.407f, 0.163f, -0.566f, 0.163f)
                curveToRelative(-0.244f, 0.0f, -0.407f, -0.081f, -0.566f, -0.162f)
                lineToRelative(-7.93f, -3.563f)
                curveToRelative(-0.566f, -0.244f, -0.891f, -0.729f, -0.891f, -1.376f)
                curveToRelative(0.0f, -0.566f, 0.325f, -1.134f, 0.89f, -1.375f)
                lineToRelative(7.934f, -3.563f)
                curveToRelative(0.406f, -0.163f, 0.81f, -0.163f, 1.215f, 0.0f)
                lineToRelative(7.933f, 3.563f)
                curveToRelative(0.818f, 0.375f, 0.81f, 1.308f, 0.81f, 1.781f)
                lineToRelative(0.08f, 6.555f)
                close()
            }
        }
        .build()
        return _academicFilled!!
    }

private var _academicFilled: ImageVector? = null
