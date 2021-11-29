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

public val RegularGroup.InfinityRegular: ImageVector
    get() {
        if (_infinityRegular != null) {
            return _infinityRegular!!
        }
        _infinityRegular = Builder(name = "InfinityRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.849f, 14.735f)
                horizontalLineToRelative(-0.014f)
                curveToRelative(-1.462f, -0.005f, -3.919f, -1.792f, -5.073f, -2.8f)
                curveToRelative(1.157f, -1.012f, 3.619f, -2.805f, 5.084f, -2.805f)
                horizontalLineToRelative(0.006f)
                curveToRelative(0.854f, 0.003f, 1.512f, 0.244f, 1.955f, 0.72f)
                curveToRelative(0.442f, 0.476f, 0.664f, 1.18f, 0.664f, 2.09f)
                curveToRelative(-0.009f, 1.832f, -0.914f, 2.795f, -2.622f, 2.795f)
                moveToRelative(-11.997f, 0.0f)
                horizontalLineToRelative(-0.014f)
                curveToRelative(-1.71f, 0.0f, -2.614f, -0.966f, -2.62f, -2.792f)
                curveToRelative(-0.002f, -0.914f, 0.222f, -1.617f, 0.664f, -2.09f)
                curveToRelative(0.443f, -0.476f, 1.098f, -0.717f, 1.956f, -0.72f)
                horizontalLineToRelative(0.005f)
                curveToRelative(1.468f, 0.0f, 3.93f, 1.793f, 5.084f, 2.804f)
                curveToRelative(-1.154f, 1.006f, -3.61f, 2.793f, -5.075f, 2.798f)
                moveToRelative(14.817f, -5.798f)
                curveTo(20.0f, 8.22f, 19.025f, 7.839f, 17.852f, 7.833f)
                horizontalLineToRelative(-0.009f)
                curveToRelative(-2.033f, 0.0f, -4.89f, 2.252f, -6.0f, 3.238f)
                curveToRelative(-1.11f, -0.986f, -3.963f, -3.238f, -6.003f, -3.238f)
                horizontalLineToRelative(-0.008f)
                curveToRelative(-1.174f, 0.003f, -2.148f, 0.387f, -2.818f, 1.104f)
                curveToRelative(-0.667f, 0.717f, -1.017f, 1.756f, -1.014f, 3.008f)
                curveToRelative(0.008f, 2.56f, 1.443f, 4.09f, 3.838f, 4.09f)
                horizontalLineToRelative(0.016f)
                curveToRelative(2.034f, -0.006f, 4.88f, -2.252f, 5.99f, -3.238f)
                curveToRelative(1.108f, 0.983f, 3.954f, 3.232f, 5.988f, 3.238f)
                horizontalLineToRelative(0.017f)
                curveToRelative(2.398f, 0.0f, 3.832f, -1.527f, 3.837f, -4.09f)
                curveToRelative(0.003f, -1.252f, -0.347f, -2.291f, -1.017f, -3.008f)
            }
        }
        .build()
        return _infinityRegular!!
    }

private var _infinityRegular: ImageVector? = null
