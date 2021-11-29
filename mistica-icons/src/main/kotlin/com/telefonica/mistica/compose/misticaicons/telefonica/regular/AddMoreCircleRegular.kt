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

public val RegularGroup.AddMoreCircleRegular: ImageVector
    get() {
        if (_addMoreCircleRegular != null) {
            return _addMoreCircleRegular!!
        }
        _addMoreCircleRegular = Builder(name = "AddMoreCircleRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.98f, 11.215f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, true, 0.0f, 1.502f)
                horizontalLineToRelative(-5.236f)
                verticalLineToRelative(5.245f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, true, -1.502f, 0.0f)
                verticalLineToRelative(-5.248f)
                lineTo(6.017f, 12.714f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, true, 0.0f, -1.503f)
                horizontalLineToRelative(5.225f)
                lineTo(11.242f, 6.038f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, true, 1.502f, 0.0f)
                verticalLineToRelative(5.177f)
                horizontalLineToRelative(5.236f)
                close()
                moveTo(12.52f, 22.494f)
                curveToRelative(3.0f, -0.055f, 9.977f, -1.185f, 9.977f, -10.463f)
                curveToRelative(0.0f, -9.279f, -7.017f, -10.45f, -10.033f, -10.522f)
                curveToRelative(-0.286f, -0.006f, -0.573f, -0.01f, -0.86f, -0.01f)
                horizontalLineToRelative(-0.226f)
                curveToRelative(-2.97f, 0.027f, -9.875f, 1.096f, -9.875f, 10.463f)
                curveToRelative(0.0f, 9.381f, 6.973f, 10.494f, 9.971f, 10.535f)
                curveToRelative(0.348f, 0.004f, 0.697f, 0.004f, 1.045f, -0.003f)
                close()
                moveTo(12.498f, 0.01f)
                curveTo(14.855f, 0.068f, 24.0f, 0.997f, 24.0f, 12.03f)
                curveToRelative(0.0f, 11.062f, -9.162f, 11.919f, -11.45f, 11.963f)
                curveToRelative(-0.215f, 0.004f, -0.461f, 0.007f, -0.71f, 0.007f)
                curveToRelative(-0.13f, 0.0f, -0.26f, 0.0f, -0.39f, -0.003f)
                curveTo(9.04f, 23.962f, 0.0f, 23.092f, 0.0f, 11.962f)
                curveTo(0.0f, 0.847f, 8.954f, 0.02f, 11.365f, 0.0f)
                horizontalLineToRelative(0.239f)
                curveToRelative(0.307f, 0.0f, 0.625f, 0.003f, 0.895f, 0.01f)
                close()
            }
        }
        .build()
        return _addMoreCircleRegular!!
    }

private var _addMoreCircleRegular: ImageVector? = null
