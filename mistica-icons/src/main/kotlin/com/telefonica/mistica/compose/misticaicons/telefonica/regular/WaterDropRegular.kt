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

public val RegularGroup.WaterDropRegular: ImageVector
    get() {
        if (_waterDropRegular != null) {
            return _waterDropRegular!!
        }
        _waterDropRegular = Builder(name = "WaterDropRegular", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.322f, 20.434f)
                horizontalLineToRelative(-0.033f)
                curveToRelative(-1.824f, 0.0f, -3.247f, -0.501f, -4.23f, -1.493f)
                curveToRelative(-0.986f, -0.997f, -1.49f, -2.45f, -1.496f, -4.322f)
                curveToRelative(-0.011f, -3.325f, 3.936f, -9.006f, 5.712f, -11.076f)
                curveToRelative(1.619f, 1.9f, 5.756f, 7.552f, 5.767f, 11.04f)
                curveToRelative(0.014f, 3.762f, -2.02f, 5.84f, -5.72f, 5.851f)
                moveToRelative(0.395f, -18.258f)
                arcToRelative(0.626f, 0.626f, 0.0f, false, false, -0.871f, 0.0f)
                curveToRelative(-1.328f, 1.35f, -6.524f, 8.155f, -6.51f, 12.446f)
                curveToRelative(0.006f, 2.185f, 0.65f, 3.983f, 1.86f, 5.207f)
                curveToRelative(1.205f, 1.216f, 2.966f, 1.857f, 5.098f, 1.857f)
                horizontalLineToRelative(0.034f)
                curveToRelative(4.364f, -0.014f, 6.963f, -2.67f, 6.952f, -7.106f)
                curveToRelative(-0.017f, -4.61f, -5.748f, -11.574f, -6.563f, -12.404f)
            }
        }
        .build()
        return _waterDropRegular!!
    }

private var _waterDropRegular: ImageVector? = null
