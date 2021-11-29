package com.telefonica.mistica.compose.misticaicons.o2.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.o2.RegularGroup

public val RegularGroup.PowerRegular: ImageVector
    get() {
        if (_powerRegular != null) {
            return _powerRegular!!
        }
        _powerRegular = Builder(name = "PowerRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.92f, 4.4f)
                curveToRelative(0.12f, 0.4f, -0.081f, 0.879f, -0.53f, 1.001f)
                curveToRelative(-3.43f, 1.116f, -5.76f, 4.239f, -5.76f, 7.8f)
                curveToRelative(0.0f, 4.52f, 3.754f, 8.2f, 8.368f, 8.2f)
                curveToRelative(4.614f, 0.0f, 8.367f, -3.68f, 8.367f, -8.2f)
                curveToRelative(0.0f, -3.561f, -2.325f, -6.68f, -5.756f, -7.8f)
                curveToRelative(-0.407f, -0.118f, -0.65f, -0.602f, -0.528f, -1.002f)
                curveToRelative(0.12f, -0.4f, 0.613f, -0.64f, 1.02f, -0.517f)
                curveTo(19.224f, 5.199f, 22.0f, 8.962f, 22.0f, 13.2f)
                curveTo(21.996f, 18.597f, 17.508f, 23.0f, 11.998f, 23.0f)
                curveTo(6.492f, 23.0f, 2.0f, 18.601f, 2.0f, 13.2f)
                curveTo(2.0f, 8.959f, 4.773f, 5.2f, 8.898f, 3.883f)
                curveToRelative(0.408f, -0.118f, 0.9f, 0.08f, 1.021f, 0.517f)
                close()
                moveTo(11.997f, 2.0f)
                curveToRelative(0.448f, 0.0f, 0.815f, 0.362f, 0.815f, 0.8f)
                verticalLineToRelative(10.4f)
                curveToRelative(0.0f, 0.439f, -0.367f, 0.8f, -0.815f, 0.8f)
                arcToRelative(0.812f, 0.812f, 0.0f, false, true, -0.815f, -0.8f)
                verticalLineTo(2.8f)
                curveToRelative(0.0f, -0.438f, 0.367f, -0.8f, 0.815f, -0.8f)
                close()
            }
        }
        .build()
        return _powerRegular!!
    }

private var _powerRegular: ImageVector? = null
