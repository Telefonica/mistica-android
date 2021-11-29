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

public val RegularGroup.PendriveRegular: ImageVector
    get() {
        if (_pendriveRegular != null) {
            return _pendriveRegular!!
        }
        _pendriveRegular = Builder(name = "PendriveRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.519f, 11.139f)
                curveToRelative(0.557f, 0.0f, 0.918f, 0.294f, 0.918f, 0.927f)
                curveToRelative(0.0f, 0.305f, -0.084f, 0.53f, -0.232f, 0.683f)
                curveToRelative(-0.163f, 0.166f, -0.398f, 0.247f, -0.686f, 0.247f)
                curveToRelative(-0.289f, 0.0f, -0.527f, -0.081f, -0.687f, -0.247f)
                curveToRelative(-0.148f, -0.154f, -0.232f, -0.378f, -0.232f, -0.683f)
                curveToRelative(0.0f, -0.633f, 0.364f, -0.927f, 0.919f, -0.927f)
                close()
                moveTo(20.639f, 14.217f)
                lineTo(20.639f, 9.665f)
                arcToRelative(0.578f, 0.578f, 0.0f, false, false, -0.51f, -0.565f)
                horizontalLineToRelative(-1.515f)
                verticalLineToRelative(5.686f)
                horizontalLineToRelative(1.482f)
                arcToRelative(0.56f, 0.56f, 0.0f, false, false, 0.543f, -0.569f)
                close()
                moveTo(16.566f, 16.477f)
                curveToRelative(0.47f, 0.0f, 0.852f, -0.394f, 0.852f, -0.879f)
                lineTo(17.418f, 15.4f)
                horizontalLineToRelative(-0.014f)
                lineTo(17.404f, 8.33f)
                curveToRelative(0.0f, -0.484f, -0.381f, -0.88f, -0.852f, -0.88f)
                lineTo(7.496f, 7.45f)
                curveToRelative(-2.734f, 0.088f, -4.129f, 1.606f, -4.129f, 4.508f)
                reflectiveCurveToRelative(1.395f, 4.423f, 4.149f, 4.52f)
                horizontalLineToRelative(9.05f)
                close()
                moveTo(20.082f, 7.867f)
                curveToRelative(0.952f, 0.0f, 1.745f, 0.798f, 1.764f, 1.782f)
                verticalLineToRelative(4.565f)
                curveToRelative(0.0f, 0.99f, -0.784f, 1.796f, -1.75f, 1.796f)
                horizontalLineToRelative(-1.51f)
                curveToRelative(-0.188f, 0.964f, -1.023f, 1.695f, -2.02f, 1.695f)
                horizontalLineToRelative(-9.07f)
                curveToRelative(-3.448f, -0.126f, -5.336f, -2.168f, -5.336f, -5.751f)
                curveToRelative(0.0f, -3.588f, 1.888f, -5.625f, 5.317f, -5.734f)
                horizontalLineToRelative(9.075f)
                curveToRelative(0.983f, 0.0f, 1.807f, 0.709f, 2.011f, 1.65f)
                horizontalLineToRelative(0.678f)
                verticalLineToRelative(-0.003f)
                horizontalLineToRelative(0.84f)
                close()
            }
        }
        .build()
        return _pendriveRegular!!
    }

private var _pendriveRegular: ImageVector? = null
