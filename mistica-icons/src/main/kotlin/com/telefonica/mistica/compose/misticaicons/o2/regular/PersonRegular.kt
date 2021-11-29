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

public val RegularGroup.PersonRegular: ImageVector
    get() {
        if (_personRegular != null) {
            return _personRegular!!
        }
        _personRegular = Builder(name = "PersonRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 9.675f)
                arcToRelative(3.39f, 3.39f, 0.0f, false, false, -2.028f, -3.094f)
                curveToRelative(0.369f, -0.48f, 0.59f, -1.075f, 0.59f, -1.724f)
                curveToRelative(0.0f, -1.577f, -1.29f, -2.857f, -2.88f, -2.857f)
                curveToRelative(-1.59f, 0.0f, -2.88f, 1.28f, -2.88f, 2.857f)
                curveToRelative(0.0f, 0.599f, 0.189f, 1.157f, 0.507f, 1.618f)
                arcTo(3.395f, 3.395f, 0.0f, false, false, 8.0f, 9.68f)
                verticalLineToRelative(6.606f)
                horizontalLineToRelative(1.438f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.394f, 0.322f, 0.714f, 0.719f, 0.714f)
                curveToRelative(0.396f, 0.0f, 0.719f, -0.32f, 0.719f, -0.713f)
                verticalLineToRelative(-6.432f)
                lineTo(9.438f, 14.855f)
                verticalLineToRelative(-5.18f)
                curveToRelative(0.0f, -1.065f, 0.908f, -1.965f, 1.981f, -1.965f)
                horizontalLineToRelative(2.162f)
                curveToRelative(1.073f, 0.0f, 1.981f, 0.9f, 1.981f, 1.965f)
                verticalLineToRelative(5.18f)
                horizontalLineToRelative(-1.438f)
                verticalLineToRelative(6.427f)
                curveToRelative(0.0f, 0.393f, 0.323f, 0.713f, 0.72f, 0.713f)
                curveToRelative(0.396f, 0.0f, 0.718f, -0.32f, 0.718f, -0.713f)
                verticalLineToRelative(-4.996f)
                lineTo(17.0f, 16.286f)
                verticalLineToRelative(-6.61f)
                close()
                moveTo(12.677f, 3.426f)
                curveToRelative(0.793f, 0.0f, 1.438f, 0.64f, 1.438f, 1.427f)
                curveToRelative(0.0f, 0.786f, -0.645f, 1.426f, -1.447f, 1.426f)
                arcToRelative(1.436f, 1.436f, 0.0f, false, true, -1.433f, -1.426f)
                arcToRelative(1.44f, 1.44f, 0.0f, false, true, 1.442f, -1.427f)
                close()
            }
        }
        .build()
        return _personRegular!!
    }

private var _personRegular: ImageVector? = null
