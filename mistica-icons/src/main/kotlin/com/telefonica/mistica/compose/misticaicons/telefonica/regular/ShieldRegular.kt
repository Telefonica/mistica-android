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

public val RegularGroup.ShieldRegular: ImageVector
    get() {
        if (_shieldRegular != null) {
            return _shieldRegular!!
        }
        _shieldRegular = Builder(name = "ShieldRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.588f, 5.835f)
                curveToRelative(0.008f, 1.736f, 0.07f, 6.327f, 0.437f, 8.45f)
                curveToRelative(0.409f, 2.376f, 4.936f, 5.093f, 6.96f, 6.102f)
                curveToRelative(2.026f, -1.012f, 6.561f, -3.729f, 6.97f, -6.101f)
                curveToRelative(0.361f, -2.126f, 0.42f, -6.717f, 0.429f, -8.454f)
                curveToRelative(-1.673f, 0.084f, -2.726f, -0.616f, -3.737f, -1.294f)
                curveToRelative(-1.006f, -0.675f, -1.955f, -1.311f, -3.656f, -1.314f)
                horizontalLineToRelative(-0.005f)
                curveToRelative(-1.698f, 0.0f, -2.65f, 0.639f, -3.656f, 1.314f)
                curveToRelative(-1.014f, 0.68f, -2.067f, 1.398f, -3.742f, 1.297f)
                close()
                moveTo(11.986f, 21.686f)
                arcToRelative(0.597f, 0.597f, 0.0f, false, true, -0.258f, -0.059f)
                curveToRelative(-0.745f, -0.355f, -7.286f, -3.577f, -7.896f, -7.128f)
                curveToRelative(-0.474f, -2.743f, -0.457f, -9.082f, -0.457f, -9.35f)
                curveToRelative(0.0f, -0.191f, 0.087f, -0.367f, 0.235f, -0.485f)
                arcToRelative(0.611f, 0.611f, 0.0f, false, true, 0.521f, -0.11f)
                curveToRelative(1.603f, 0.258f, 2.449f, -0.316f, 3.524f, -1.039f)
                curveTo(8.717f, 2.804f, 9.92f, 2.0f, 11.983f, 2.0f)
                horizontalLineToRelative(0.008f)
                curveToRelative(2.065f, 0.003f, 3.266f, 0.807f, 4.325f, 1.518f)
                curveToRelative(1.076f, 0.723f, 1.927f, 1.289f, 3.552f, 1.034f)
                arcToRelative(0.625f, 0.625f, 0.0f, false, true, 0.502f, 0.137f)
                arcToRelative(0.625f, 0.625f, 0.0f, false, true, 0.226f, 0.462f)
                curveToRelative(0.0f, 0.27f, 0.017f, 6.608f, -0.448f, 9.35f)
                curveToRelative(-0.61f, 3.552f, -7.16f, 6.773f, -7.905f, 7.13f)
                arcToRelative(0.637f, 0.637f, 0.0f, false, true, -0.257f, 0.055f)
                close()
            }
        }
        .build()
        return _shieldRegular!!
    }

private var _shieldRegular: ImageVector? = null
