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

public val RegularGroup.InformationRegular: ImageVector
    get() {
        if (_informationRegular != null) {
            return _informationRegular!!
        }
        _informationRegular = Builder(name = "InformationRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 5.583f)
                arcToRelative(1.375f, 1.375f, 0.0f, true, false, 0.0f, 2.75f)
                arcToRelative(1.375f, 1.375f, 0.0f, false, false, 0.0f, -2.75f)
                close()
                moveTo(12.0f, 10.167f)
                curveToRelative(-0.759f, 0.0f, -1.375f, 0.657f, -1.375f, 1.466f)
                verticalLineToRelative(4.4f)
                curveToRelative(0.0f, 0.811f, 0.616f, 1.467f, 1.375f, 1.467f)
                reflectiveCurveToRelative(1.375f, -0.657f, 1.375f, -1.467f)
                verticalLineToRelative(-4.4f)
                curveToRelative(0.0f, -0.809f, -0.616f, -1.466f, -1.375f, -1.466f)
                close()
                moveTo(12.0f, 1.0f)
                curveTo(5.935f, 1.0f, 1.0f, 5.935f, 1.0f, 12.0f)
                reflectiveCurveToRelative(4.935f, 11.0f, 11.0f, 11.0f)
                reflectiveCurveToRelative(11.0f, -4.935f, 11.0f, -11.0f)
                reflectiveCurveTo(18.065f, 1.0f, 12.0f, 1.0f)
                close()
                moveTo(12.0f, 21.167f)
                arcTo(9.177f, 9.177f, 0.0f, false, true, 2.833f, 12.0f)
                arcTo(9.177f, 9.177f, 0.0f, false, true, 12.0f, 2.833f)
                arcTo(9.177f, 9.177f, 0.0f, false, true, 21.167f, 12.0f)
                arcTo(9.177f, 9.177f, 0.0f, false, true, 12.0f, 21.167f)
                close()
            }
        }
        .build()
        return _informationRegular!!
    }

private var _informationRegular: ImageVector? = null
