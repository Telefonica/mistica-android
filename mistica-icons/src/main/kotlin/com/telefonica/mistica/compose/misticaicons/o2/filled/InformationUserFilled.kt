package com.telefonica.mistica.compose.misticaicons.o2.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.o2.FilledGroup

public val FilledGroup.InformationUserFilled: ImageVector
    get() {
        if (_informationUserFilled != null) {
            return _informationUserFilled!!
        }
        _informationUserFilled = Builder(name = "InformationUserFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.5f, 2.0f, 2.0f, 6.5f, 2.0f, 12.0f)
                reflectiveCurveToRelative(4.5f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveToRelative(10.0f, -4.5f, 10.0f, -10.0f)
                reflectiveCurveTo(17.5f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.536f, 16.644f)
                arcToRelative(0.552f, 0.552f, 0.0f, false, true, -0.536f, 0.536f)
                arcToRelative(0.552f, 0.552f, 0.0f, false, true, -0.536f, -0.536f)
                lineTo(11.464f, 9.856f)
                curveToRelative(0.0f, -0.284f, 0.252f, -0.536f, 0.536f, -0.536f)
                curveToRelative(0.284f, 0.0f, 0.536f, 0.252f, 0.536f, 0.536f)
                verticalLineToRelative(6.788f)
                close()
                moveTo(12.0f, 7.892f)
                arcToRelative(0.718f, 0.718f, 0.0f, false, true, -0.716f, -0.716f)
                curveToRelative(0.0f, -0.392f, 0.32f, -0.716f, 0.716f, -0.716f)
                curveToRelative(0.392f, 0.0f, 0.716f, 0.32f, 0.716f, 0.716f)
                arcToRelative(0.718f, 0.718f, 0.0f, false, true, -0.716f, 0.716f)
                close()
            }
        }
        .build()
        return _informationUserFilled!!
    }

private var _informationUserFilled: ImageVector? = null
