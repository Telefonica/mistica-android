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

public val RegularGroup.TrashCanRegular: ImageVector
    get() {
        if (_trashCanRegular != null) {
            return _trashCanRegular!!
        }
        _trashCanRegular = Builder(name = "TrashCanRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.75f, 2.5f)
                curveToRelative(1.202f, 0.0f, 2.167f, 0.98f, 2.245f, 2.197f)
                lineToRelative(0.005f, 0.16f)
                lineTo(17.0f, 6.5f)
                horizontalLineToRelative(4.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.102f, 1.493f)
                lineTo(21.25f, 8.0f)
                lineTo(20.0f, 8.0f)
                verticalLineToRelative(10.75f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -3.066f, 3.245f)
                lineTo(16.75f, 22.0f)
                horizontalLineToRelative(-9.0f)
                arcToRelative(3.25f, 3.25f, 0.0f, false, true, -3.25f, -3.25f)
                lineTo(4.5f, 8.0f)
                lineTo(3.25f, 8.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.102f, -1.493f)
                lineTo(3.25f, 6.5f)
                lineTo(7.5f, 6.5f)
                lineTo(7.5f, 4.857f)
                curveToRelative(0.0f, -1.236f, 0.915f, -2.268f, 2.095f, -2.352f)
                lineTo(9.75f, 2.5f)
                horizontalLineToRelative(5.0f)
                close()
                moveTo(18.5f, 8.0f)
                lineTo(6.0f, 8.0f)
                verticalLineToRelative(10.75f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, 1.606f, 1.744f)
                lineToRelative(0.144f, 0.006f)
                horizontalLineToRelative(9.0f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, 1.75f, -1.75f)
                lineTo(18.5f, 8.0f)
                close()
                moveTo(10.25f, 10.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.743f, 0.648f)
                lineToRelative(0.007f, 0.102f)
                verticalLineToRelative(6.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.493f, 0.102f)
                lineTo(9.5f, 17.25f)
                verticalLineToRelative(-6.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, -0.75f)
                close()
                moveTo(14.25f, 10.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.743f, 0.648f)
                lineToRelative(0.007f, 0.102f)
                verticalLineToRelative(6.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.493f, 0.102f)
                lineToRelative(-0.007f, -0.102f)
                verticalLineToRelative(-6.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.75f, -0.75f)
                close()
                moveTo(14.75f, 4.0f)
                horizontalLineToRelative(-5.0f)
                curveToRelative(-0.37f, 0.0f, -0.696f, 0.318f, -0.744f, 0.747f)
                lineTo(9.0f, 4.857f)
                lineTo(9.0f, 6.5f)
                horizontalLineToRelative(6.5f)
                lineTo(15.5f, 4.857f)
                curveToRelative(0.0f, -0.447f, -0.297f, -0.799f, -0.658f, -0.85f)
                lineTo(14.75f, 4.0f)
                close()
            }
        }
        .build()
        return _trashCanRegular!!
    }

private var _trashCanRegular: ImageVector? = null
