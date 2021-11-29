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

public val FilledGroup.WomanFilled: ImageVector
    get() {
        if (_womanFilled != null) {
            return _womanFilled!!
        }
        _womanFilled = Builder(name = "WomanFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.915f, 6.958f)
                curveToRelative(-1.533f, 0.0f, -2.449f, -0.924f, -2.449f, -2.473f)
                curveToRelative(0.0f, -0.79f, 0.225f, -1.412f, 0.67f, -1.85f)
                curveToRelative(0.431f, -0.422f, 1.028f, -0.635f, 1.779f, -0.635f)
                curveToRelative(0.75f, 0.0f, 1.347f, 0.213f, 1.778f, 0.63f)
                curveToRelative(0.448f, 0.434f, 0.675f, 1.06f, 0.675f, 1.852f)
                curveToRelative(0.0f, 1.552f, -0.918f, 2.476f, -2.453f, 2.476f)
                close()
                moveTo(17.167f, 13.608f)
                curveToRelative(0.131f, 0.392f, 0.103f, 0.807f, -0.073f, 1.17f)
                curveToRelative(-0.177f, 0.362f, -0.48f, 0.63f, -0.854f, 0.757f)
                arcToRelative(1.148f, 1.148f, 0.0f, false, true, -0.493f, 0.087f)
                lineToRelative(0.168f, 0.63f)
                arcToRelative(0.604f, 0.604f, 0.0f, false, true, -0.577f, 0.76f)
                horizontalLineToRelative(-0.401f)
                lineToRelative(-0.017f, 3.15f)
                curveToRelative(0.0f, 0.477f, -0.145f, 0.874f, -0.417f, 1.146f)
                curveToRelative(-0.174f, 0.17f, -0.482f, 0.375f, -0.983f, 0.375f)
                horizontalLineToRelative(-0.037f)
                curveToRelative(-0.77f, -0.016f, -1.33f, -0.655f, -1.33f, -1.523f)
                lineToRelative(0.014f, -3.149f)
                horizontalLineToRelative(-0.47f)
                lineToRelative(0.016f, 3.146f)
                curveToRelative(0.0f, 0.47f, -0.154f, 0.88f, -0.437f, 1.16f)
                curveToRelative(-0.247f, 0.243f, -0.58f, 0.375f, -0.927f, 0.366f)
                horizontalLineToRelative(-0.037f)
                curveToRelative(-0.798f, -0.02f, -1.397f, -0.675f, -1.397f, -1.523f)
                lineToRelative(-0.017f, -3.146f)
                horizontalLineToRelative(-0.4f)
                arcToRelative(0.604f, 0.604f, 0.0f, false, true, -0.577f, -0.76f)
                lineToRelative(0.167f, -0.63f)
                horizontalLineToRelative(-0.003f)
                curveToRelative(-0.17f, 0.0f, -0.338f, -0.03f, -0.504f, -0.089f)
                arcToRelative(1.473f, 1.473f, 0.0f, false, true, -0.84f, -0.75f)
                arcToRelative(1.517f, 1.517f, 0.0f, false, true, -0.076f, -1.166f)
                lineToRelative(1.527f, -4.392f)
                arcToRelative(1.54f, 1.54f, 0.0f, false, true, 0.081f, -0.205f)
                arcToRelative(2.826f, 2.826f, 0.0f, false, true, 2.594f, -1.711f)
                horizontalLineToRelative(2.098f)
                curveToRelative(1.134f, 0.0f, 2.157f, 0.683f, 2.605f, 1.74f)
                curveToRelative(0.022f, 0.044f, 0.05f, 0.111f, 0.076f, 0.193f)
                curveToRelative(0.002f, -0.006f, 1.52f, 4.364f, 1.52f, 4.364f)
                close()
            }
        }
        .build()
        return _womanFilled!!
    }

private var _womanFilled: ImageVector? = null
