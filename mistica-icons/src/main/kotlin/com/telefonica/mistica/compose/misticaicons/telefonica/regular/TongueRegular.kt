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

public val RegularGroup.TongueRegular: ImageVector
    get() {
        if (_tongueRegular != null) {
            return _tongueRegular!!
        }
        _tongueRegular = Builder(name = "TongueRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.413f, 10.356f)
                curveToRelative(0.0f, 6.459f, -1.361f, 8.641f, -5.397f, 8.641f)
                curveToRelative(-4.037f, 0.0f, -5.398f, -2.182f, -5.398f, -8.641f)
                curveToRelative(0.0f, -0.824f, 0.022f, -1.552f, 0.067f, -2.219f)
                curveToRelative(1.356f, 0.507f, 2.922f, 0.79f, 4.695f, 0.843f)
                lineToRelative(0.039f, 7.056f)
                arcToRelative(0.612f, 0.612f, 0.0f, false, false, 0.616f, 0.602f)
                horizontalLineToRelative(0.003f)
                arcToRelative(0.61f, 0.61f, 0.0f, false, false, 0.613f, -0.607f)
                lineToRelative(-0.039f, -7.048f)
                curveToRelative(1.79f, -0.053f, 3.367f, -0.336f, 4.731f, -0.852f)
                curveToRelative(0.048f, 0.67f, 0.07f, 1.401f, 0.07f, 2.225f)
                moveToRelative(4.154f, -6.446f)
                arcToRelative(0.624f, 0.624f, 0.0f, false, false, -0.854f, 0.171f)
                curveToRelative(-1.653f, 2.462f, -4.583f, 3.712f, -8.706f, 3.712f)
                curveToRelative(-4.129f, 0.0f, -7.062f, -1.253f, -8.714f, -3.72f)
                arcToRelative(0.625f, 0.625f, 0.0f, false, false, -0.855f, -0.174f)
                arcToRelative(0.596f, 0.596f, 0.0f, false, false, -0.176f, 0.837f)
                curveTo(3.08f, 5.955f, 4.17f, 6.9f, 5.492f, 7.596f)
                curveToRelative(-0.07f, 0.816f, -0.107f, 1.718f, -0.107f, 2.754f)
                curveToRelative(0.0f, 5.913f, 1.13f, 9.851f, 6.633f, 9.851f)
                curveToRelative(5.505f, 0.0f, 6.63f, -3.938f, 6.63f, -9.851f)
                curveToRelative(0.0f, -1.014f, -0.033f, -1.896f, -0.1f, -2.703f)
                curveToRelative(-0.003f, -0.02f, -0.011f, -0.037f, -0.017f, -0.056f)
                curveToRelative(1.314f, -0.695f, 2.398f, -1.636f, 3.213f, -2.846f)
                arcToRelative(0.596f, 0.596f, 0.0f, false, false, -0.177f, -0.835f)
            }
        }
        .build()
        return _tongueRegular!!
    }

private var _tongueRegular: ImageVector? = null
