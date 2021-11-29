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

public val RegularGroup.IntranetRegular: ImageVector
    get() {
        if (_intranetRegular != null) {
            return _intranetRegular!!
        }
        _intranetRegular = Builder(name = "IntranetRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.464f, 2.0f, 2.0f, 6.464f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.464f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.464f, 10.0f, -10.0f)
                reflectiveCurveTo(17.536f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(8.536f, 4.18f)
                curveToRelative(-0.464f, 0.644f, -0.856f, 1.428f, -1.144f, 2.284f)
                arcToRelative(1.983f, 1.983f, 0.0f, false, false, -1.964f, 1.964f)
                curveToRelative(0.0f, 0.784f, 0.464f, 1.464f, 1.144f, 1.784f)
                arcToRelative(10.72f, 10.72f, 0.0f, false, false, -0.072f, 1.072f)
                lineTo(3.428f, 11.284f)
                curveTo(3.68f, 8.108f, 5.712f, 5.428f, 8.536f, 4.18f)
                close()
                moveTo(8.248f, 8.428f)
                arcToRelative(0.89f, 0.89f, 0.0f, false, true, -0.896f, 0.896f)
                arcToRelative(0.89f, 0.89f, 0.0f, false, true, -0.896f, -0.896f)
                curveToRelative(0.0f, -0.5f, 0.396f, -0.896f, 0.896f, -0.896f)
                reflectiveCurveToRelative(0.896f, 0.396f, 0.896f, 0.896f)
                close()
                moveTo(3.464f, 12.716f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.108f, 2.928f, 0.896f, 5.428f, 2.072f, 7.108f)
                curveToRelative(-2.824f, -1.256f, -4.824f, -3.932f, -5.072f, -7.108f)
                close()
                moveTo(11.284f, 20.428f)
                curveToRelative(-1.784f, -0.68f, -3.252f, -3.892f, -3.392f, -7.716f)
                horizontalLineToRelative(3.392f)
                verticalLineToRelative(7.716f)
                close()
                moveTo(11.284f, 11.284f)
                lineTo(7.892f, 11.284f)
                curveToRelative(0.0f, -0.356f, 0.036f, -0.68f, 0.072f, -1.0f)
                curveToRelative(0.784f, -0.252f, 1.356f, -1.0f, 1.356f, -1.856f)
                curveToRelative(0.0f, -0.572f, -0.252f, -1.072f, -0.644f, -1.428f)
                curveToRelative(0.608f, -1.752f, 1.536f, -3.036f, 2.608f, -3.428f)
                verticalLineToRelative(7.712f)
                close()
                moveTo(20.568f, 11.284f)
                horizontalLineToRelative(-3.032f)
                curveToRelative(-0.108f, -2.924f, -0.896f, -5.424f, -2.072f, -7.104f)
                curveToRelative(2.82f, 1.248f, 4.856f, 3.928f, 5.104f, 7.104f)
                close()
                moveTo(12.716f, 3.572f)
                curveToRelative(1.784f, 0.68f, 3.252f, 3.892f, 3.392f, 7.716f)
                horizontalLineToRelative(-3.392f)
                lineTo(12.716f, 3.572f)
                close()
                moveTo(12.716f, 20.428f)
                verticalLineToRelative(-7.712f)
                horizontalLineToRelative(3.392f)
                curveToRelative(-0.144f, 3.82f, -1.608f, 7.032f, -3.392f, 7.712f)
                close()
                moveTo(15.464f, 19.82f)
                curveToRelative(1.18f, -1.68f, 1.964f, -4.212f, 2.072f, -7.108f)
                horizontalLineToRelative(3.036f)
                curveToRelative(-0.252f, 3.18f, -2.288f, 5.856f, -5.108f, 7.108f)
                close()
            }
        }
        .build()
        return _intranetRegular!!
    }

private var _intranetRegular: ImageVector? = null
