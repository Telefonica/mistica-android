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

public val RegularGroup.ParkingRegular: ImageVector
    get() {
        if (_parkingRegular != null) {
            return _parkingRegular!!
        }
        _parkingRegular = Builder(name = "ParkingRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.04f, 18.667f)
                arcToRelative(0.74f, 0.74f, 0.0f, false, true, -0.74f, -0.74f)
                lineTo(8.3f, 5.338f)
                horizontalLineToRelative(4.447f)
                arcToRelative(4.078f, 4.078f, 0.0f, false, true, 4.072f, 4.072f)
                arcToRelative(4.08f, 4.08f, 0.0f, false, true, -4.072f, 4.072f)
                lineTo(9.784f, 13.482f)
                verticalLineToRelative(4.447f)
                arcToRelative(0.748f, 0.748f, 0.0f, false, true, -0.744f, 0.74f)
                close()
                moveTo(9.78f, 12.002f)
                horizontalLineToRelative(2.962f)
                arcToRelative(2.594f, 2.594f, 0.0f, false, false, 0.0f, -5.186f)
                lineTo(9.779f, 6.816f)
                verticalLineToRelative(5.186f)
                close()
                moveTo(19.78f, 22.0f)
                lineTo(4.223f, 22.0f)
                arcTo(2.226f, 2.226f, 0.0f, false, true, 2.0f, 19.777f)
                lineTo(2.0f, 4.223f)
                curveTo(2.0f, 3.0f, 2.995f, 2.0f, 4.223f, 2.0f)
                horizontalLineToRelative(15.554f)
                curveTo(21.0f, 2.0f, 22.0f, 2.995f, 22.0f, 4.223f)
                verticalLineToRelative(15.554f)
                arcTo(2.222f, 2.222f, 0.0f, false, true, 19.781f, 22.0f)
                close()
                moveTo(4.223f, 3.484f)
                arcToRelative(0.74f, 0.74f, 0.0f, false, false, -0.74f, 0.74f)
                verticalLineToRelative(15.553f)
                curveToRelative(0.0f, 0.407f, 0.333f, 0.74f, 0.74f, 0.74f)
                horizontalLineToRelative(15.554f)
                arcToRelative(0.74f, 0.74f, 0.0f, false, false, 0.74f, -0.74f)
                lineTo(20.517f, 4.223f)
                arcToRelative(0.74f, 0.74f, 0.0f, false, false, -0.74f, -0.74f)
                lineTo(4.223f, 3.483f)
                close()
            }
        }
        .build()
        return _parkingRegular!!
    }

private var _parkingRegular: ImageVector? = null
