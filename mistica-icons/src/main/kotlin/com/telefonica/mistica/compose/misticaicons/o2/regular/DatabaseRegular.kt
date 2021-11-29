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

public val RegularGroup.DatabaseRegular: ImageVector
    get() {
        if (_databaseRegular != null) {
            return _databaseRegular!!
        }
        _databaseRegular = Builder(name = "DatabaseRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.912f, 2.0f)
                lineTo(4.0f, 2.0f)
                verticalLineToRelative(20.0f)
                horizontalLineToRelative(16.0f)
                lineTo(20.0f, 4.144f)
                curveTo(20.0f, 2.964f, 19.06f, 2.0f, 17.912f, 2.0f)
                close()
                moveTo(5.393f, 9.145f)
                horizontalLineToRelative(13.218f)
                verticalLineToRelative(4.608f)
                lineTo(5.393f, 13.753f)
                lineTo(5.393f, 9.145f)
                close()
                moveTo(17.913f, 3.431f)
                curveToRelative(0.382f, 0.0f, 0.694f, 0.32f, 0.694f, 0.713f)
                verticalLineToRelative(3.927f)
                lineTo(5.393f, 8.071f)
                lineTo(5.393f, 3.43f)
                horizontalLineToRelative(12.52f)
                close()
                moveTo(5.392f, 20.574f)
                verticalLineToRelative(-5.751f)
                horizontalLineToRelative(13.218f)
                verticalLineToRelative(5.75f)
                lineTo(5.393f, 20.573f)
                close()
                moveTo(6.955f, 5.574f)
                horizontalLineToRelative(2.782f)
                curveToRelative(0.276f, 0.0f, 0.521f, -0.25f, 0.521f, -0.534f)
                arcToRelative(0.544f, 0.544f, 0.0f, false, false, -0.52f, -0.535f)
                lineTo(6.955f, 4.505f)
                arcToRelative(0.544f, 0.544f, 0.0f, false, false, -0.52f, 0.535f)
                curveToRelative(0.0f, 0.283f, 0.244f, 0.535f, 0.52f, 0.535f)
                close()
                moveTo(9.737f, 10.214f)
                lineTo(6.956f, 10.214f)
                arcToRelative(0.544f, 0.544f, 0.0f, false, false, -0.52f, 0.536f)
                curveToRelative(0.0f, 0.283f, 0.244f, 0.535f, 0.52f, 0.535f)
                horizontalLineToRelative(2.782f)
                curveToRelative(0.276f, 0.0f, 0.521f, -0.252f, 0.521f, -0.535f)
                arcToRelative(0.54f, 0.54f, 0.0f, false, false, -0.52f, -0.535f)
                close()
                moveTo(9.737f, 15.929f)
                lineTo(6.956f, 15.929f)
                arcToRelative(0.544f, 0.544f, 0.0f, false, false, -0.52f, 0.535f)
                curveToRelative(0.0f, 0.283f, 0.244f, 0.535f, 0.52f, 0.535f)
                horizontalLineToRelative(2.782f)
                curveToRelative(0.276f, 0.0f, 0.521f, -0.252f, 0.521f, -0.535f)
                arcToRelative(0.54f, 0.54f, 0.0f, false, false, -0.52f, -0.535f)
                close()
            }
        }
        .build()
        return _databaseRegular!!
    }

private var _databaseRegular: ImageVector? = null
