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

public val FilledGroup.DatabaseFilled: ImageVector
    get() {
        if (_databaseFilled != null) {
            return _databaseFilled!!
        }
        _databaseFilled = Builder(name = "DatabaseFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 13.787f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-5.0f)
                lineTo(4.0f, 8.787f)
                verticalLineToRelative(5.0f)
                close()
                moveTo(7.303f, 10.213f)
                horizontalLineToRelative(2.435f)
                curveToRelative(0.276f, 0.0f, 0.521f, 0.251f, 0.521f, 0.535f)
                arcToRelative(0.544f, 0.544f, 0.0f, false, true, -0.52f, 0.534f)
                lineTo(7.302f, 11.282f)
                arcToRelative(0.544f, 0.544f, 0.0f, false, true, -0.52f, -0.534f)
                curveToRelative(0.0f, -0.284f, 0.244f, -0.535f, 0.52f, -0.535f)
                close()
                moveTo(4.0f, 22.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-7.144f)
                lineTo(4.0f, 14.856f)
                lineTo(4.0f, 22.0f)
                close()
                moveTo(7.303f, 16.287f)
                horizontalLineToRelative(2.435f)
                curveToRelative(0.276f, 0.0f, 0.521f, 0.251f, 0.521f, 0.535f)
                arcToRelative(0.544f, 0.544f, 0.0f, false, true, -0.52f, 0.534f)
                lineTo(7.302f, 17.356f)
                arcToRelative(0.544f, 0.544f, 0.0f, false, true, -0.52f, -0.534f)
                curveToRelative(0.0f, -0.284f, 0.244f, -0.535f, 0.52f, -0.535f)
                close()
                moveTo(17.913f, 2.0f)
                lineTo(4.0f, 2.0f)
                verticalLineToRelative(5.713f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-3.57f)
                curveTo(20.0f, 2.965f, 19.06f, 2.0f, 17.912f, 2.0f)
                close()
                moveTo(9.737f, 4.861f)
                lineTo(7.303f, 4.861f)
                arcToRelative(0.544f, 0.544f, 0.0f, false, true, -0.52f, -0.535f)
                curveToRelative(0.0f, -0.283f, 0.244f, -0.534f, 0.52f, -0.534f)
                horizontalLineToRelative(2.435f)
                curveToRelative(0.276f, 0.0f, 0.521f, 0.251f, 0.521f, 0.534f)
                arcToRelative(0.54f, 0.54f, 0.0f, false, true, -0.52f, 0.535f)
                close()
            }
        }
        .build()
        return _databaseFilled!!
    }

private var _databaseFilled: ImageVector? = null
