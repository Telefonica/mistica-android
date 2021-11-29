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

public val RegularGroup.InternetRegular: ImageVector
    get() {
        if (_internetRegular != null) {
            return _internetRegular!!
        }
        _internetRegular = Builder(name = "InternetRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.479f, 2.0f, 2.0f, 6.479f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.474f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.479f, 10.0f, -10.0f)
                reflectiveCurveTo(17.521f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(8.522f, 4.17f)
                curveTo(7.356f, 5.854f, 6.575f, 8.372f, 6.47f, 11.288f)
                lineTo(3.43f, 11.288f)
                curveToRelative(0.261f, -3.186f, 2.3f, -5.868f, 5.092f, -7.116f)
                close()
                moveTo(3.43f, 12.714f)
                horizontalLineToRelative(3.034f)
                curveToRelative(0.105f, 2.911f, 0.887f, 5.43f, 2.052f, 7.116f)
                curveToRelative(-2.788f, -1.248f, -4.826f, -3.93f, -5.086f, -7.116f)
                close()
                moveTo(11.286f, 20.429f)
                curveToRelative(-1.792f, -0.686f, -3.236f, -3.88f, -3.391f, -7.715f)
                horizontalLineToRelative(3.391f)
                verticalLineToRelative(7.715f)
                close()
                moveTo(11.286f, 11.288f)
                lineTo(7.896f, 11.288f)
                curveToRelative(0.155f, -3.835f, 1.6f, -7.03f, 3.391f, -7.715f)
                verticalLineToRelative(7.715f)
                close()
                moveTo(20.568f, 11.288f)
                horizontalLineToRelative(-3.034f)
                curveToRelative(-0.105f, -2.911f, -0.887f, -5.43f, -2.052f, -7.116f)
                curveToRelative(2.788f, 1.248f, 4.826f, 3.93f, 5.086f, 7.116f)
                close()
                moveTo(12.712f, 3.573f)
                curveToRelative(1.792f, 0.686f, 3.236f, 3.88f, 3.391f, 7.715f)
                horizontalLineToRelative(-3.391f)
                lineTo(12.712f, 3.572f)
                close()
                moveTo(12.712f, 20.429f)
                verticalLineToRelative(-7.715f)
                horizontalLineToRelative(3.391f)
                curveToRelative(-0.155f, 3.835f, -1.6f, 7.03f, -3.391f, 7.715f)
                close()
                moveTo(15.477f, 19.83f)
                curveToRelative(1.166f, -1.682f, 1.947f, -4.2f, 2.052f, -7.116f)
                horizontalLineToRelative(3.035f)
                curveToRelative(-0.256f, 3.186f, -2.294f, 5.868f, -5.087f, 7.116f)
                close()
            }
        }
        .build()
        return _internetRegular!!
    }

private var _internetRegular: ImageVector? = null
