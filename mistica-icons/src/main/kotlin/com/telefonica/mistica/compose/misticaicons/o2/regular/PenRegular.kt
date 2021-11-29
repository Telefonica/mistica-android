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

public val RegularGroup.PenRegular: ImageVector
    get() {
        if (_penRegular != null) {
            return _penRegular!!
        }
        _penRegular = Builder(name = "PenRegular", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.889f, 3.107f)
                arcToRelative(3.792f, 3.792f, 0.0f, false, false, -5.356f, 0.0f)
                lineToRelative(-0.724f, 0.724f)
                lineTo(3.841f, 14.802f)
                arcToRelative(0.71f, 0.71f, 0.0f, false, false, -0.228f, 0.364f)
                lineToRelative(-1.588f, 5.926f)
                arcToRelative(0.723f, 0.723f, 0.0f, false, false, 0.888f, 0.884f)
                lineToRelative(5.856f, -1.572f)
                arcToRelative(0.728f, 0.728f, 0.0f, false, false, 0.388f, -0.2f)
                lineTo(19.661f, 9.697f)
                lineToRelative(0.512f, -0.512f)
                lineToRelative(0.724f, -0.724f)
                arcToRelative(3.79f, 3.79f, 0.0f, false, false, -0.008f, -5.354f)
                close()
                moveTo(3.745f, 20.256f)
                lineToRelative(0.936f, -3.505f)
                lineToRelative(2.564f, 2.564f)
                lineToRelative(-3.5f, 0.94f)
                close()
                moveTo(8.645f, 18.667f)
                lineTo(5.333f, 15.354f)
                lineTo(15.325f, 5.36f)
                lineTo(18.637f, 8.673f)
                lineTo(8.645f, 18.667f)
                close()
                moveTo(19.87f, 7.44f)
                lineToRelative(-0.212f, 0.212f)
                lineToRelative(-3.312f, -3.312f)
                lineToRelative(0.212f, -0.212f)
                arcToRelative(2.346f, 2.346f, 0.0f, false, true, 3.312f, 0.0f)
                curveToRelative(0.912f, 0.912f, 0.912f, 2.4f, 0.0f, 3.312f)
                close()
            }
        }
        .build()
        return _penRegular!!
    }

private var _penRegular: ImageVector? = null
