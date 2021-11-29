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

public val RegularGroup.ImportRegular: ImageVector
    get() {
        if (_importRegular != null) {
            return _importRegular!!
        }
        _importRegular = Builder(name = "ImportRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.284f, 11.284f)
                curveToRelative(0.396f, 0.0f, 0.716f, 0.32f, 0.716f, 0.716f)
                verticalLineToRelative(7.856f)
                arcTo(2.167f, 2.167f, 0.0f, false, true, 19.845f, 22.0f)
                horizontalLineTo(4.143f)
                arcTo(2.149f, 2.149f, 0.0f, false, true, 2.0f, 19.856f)
                verticalLineTo(12.0f)
                arcToRelative(0.715f, 0.715f, 0.0f, true, true, 1.431f, 0.0f)
                verticalLineToRelative(7.856f)
                curveToRelative(0.0f, 0.392f, 0.32f, 0.716f, 0.716f, 0.716f)
                horizontalLineToRelative(15.706f)
                curveToRelative(0.392f, 0.0f, 0.716f, -0.32f, 0.716f, -0.716f)
                verticalLineTo(12.0f)
                curveToRelative(0.0f, -0.392f, 0.32f, -0.716f, 0.715f, -0.716f)
                close()
                moveTo(13.957f, 2.0f)
                curveToRelative(0.396f, 0.0f, 0.715f, 0.32f, 0.715f, 0.716f)
                verticalLineToRelative(7.68f)
                horizontalLineToRelative(2.143f)
                curveToRelative(0.608f, 0.0f, 1.143f, 0.356f, 1.391f, 0.964f)
                curveToRelative(0.252f, 0.644f, 0.108f, 1.392f, -0.356f, 1.856f)
                lineToRelative(-5.856f, 5.856f)
                lineToRelative(-5.852f, -5.856f)
                curveToRelative(-0.464f, -0.464f, -0.608f, -1.216f, -0.36f, -1.86f)
                curveToRelative(0.252f, -0.608f, 0.783f, -0.964f, 1.39f, -0.964f)
                horizontalLineToRelative(2.144f)
                verticalLineToRelative(-7.68f)
                arcToRelative(0.717f, 0.717f, 0.0f, false, true, 1.43f, 0.004f)
                verticalLineToRelative(9.108f)
                horizontalLineToRelative(-3.57f)
                reflectiveCurveToRelative(-0.035f, 0.0f, -0.071f, 0.072f)
                curveToRelative(-0.036f, 0.108f, -0.036f, 0.252f, 0.036f, 0.32f)
                lineToRelative(4.853f, 4.856f)
                lineToRelative(4.853f, -4.856f)
                curveToRelative(0.072f, -0.072f, 0.072f, -0.216f, 0.036f, -0.32f)
                curveToRelative(-0.029f, -0.058f, -0.057f, -0.07f, -0.068f, -0.071f)
                lineToRelative(-3.574f, -0.001f)
                verticalLineTo(2.716f)
                curveToRelative(0.0f, -0.392f, 0.32f, -0.716f, 0.716f, -0.716f)
                close()
            }
        }
        .build()
        return _importRegular!!
    }

private var _importRegular: ImageVector? = null
