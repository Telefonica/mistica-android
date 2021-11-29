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

public val RegularGroup.ApartmentBuildingRegular: ImageVector
    get() {
        if (_apartmentBuildingRegular != null) {
            return _apartmentBuildingRegular!!
        }
        _apartmentBuildingRegular = Builder(name = "ApartmentBuildingRegular", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.314f, 2.0f)
                lineTo(5.682f, 2.0f)
                arcTo(0.687f, 0.687f, 0.0f, false, false, 5.0f, 2.69f)
                verticalLineToRelative(18.306f)
                horizontalLineToRelative(3.414f)
                verticalLineToRelative(-5.177f)
                horizontalLineToRelative(1.709f)
                lineTo(10.123f, 21.0f)
                lineTo(19.0f, 21.0f)
                lineTo(19.0f, 2.694f)
                arcTo(0.691f, 0.691f, 0.0f, false, false, 18.314f, 2.0f)
                close()
                moveTo(17.632f, 19.616f)
                horizontalLineToRelative(-6.146f)
                verticalLineToRelative(-5.18f)
                horizontalLineToRelative(-4.44f)
                verticalLineToRelative(5.18f)
                horizontalLineToRelative(-0.682f)
                lineTo(6.364f, 3.384f)
                horizontalLineToRelative(11.268f)
                verticalLineToRelative(16.232f)
                close()
                moveTo(7.046f, 12.534f)
                horizontalLineToRelative(4.44f)
                lineTo(11.486f, 9.427f)
                horizontalLineToRelative(-4.44f)
                verticalLineToRelative(3.107f)
                close()
                moveTo(8.068f, 10.466f)
                horizontalLineToRelative(2.391f)
                lineTo(10.459f, 11.5f)
                lineTo(8.07f, 11.5f)
                verticalLineToRelative(-1.034f)
                close()
                moveTo(12.509f, 12.534f)
                horizontalLineToRelative(4.441f)
                lineTo(16.95f, 9.427f)
                horizontalLineToRelative(-4.44f)
                verticalLineToRelative(3.107f)
                close()
                moveTo(13.532f, 10.466f)
                horizontalLineToRelative(2.39f)
                lineTo(15.922f, 11.5f)
                horizontalLineToRelative(-2.39f)
                verticalLineToRelative(-1.034f)
                close()
                moveTo(12.509f, 17.543f)
                horizontalLineToRelative(4.441f)
                verticalLineToRelative(-3.108f)
                horizontalLineToRelative(-4.44f)
                verticalLineToRelative(3.108f)
                close()
                moveTo(13.532f, 15.47f)
                horizontalLineToRelative(2.39f)
                verticalLineToRelative(1.034f)
                horizontalLineToRelative(-2.39f)
                lineTo(13.532f, 15.47f)
                close()
                moveTo(7.046f, 7.703f)
                horizontalLineToRelative(4.44f)
                lineTo(11.486f, 4.59f)
                horizontalLineToRelative(-4.44f)
                verticalLineToRelative(3.112f)
                close()
                moveTo(8.068f, 5.629f)
                horizontalLineToRelative(2.391f)
                verticalLineToRelative(1.035f)
                lineTo(8.07f, 6.664f)
                lineTo(8.07f, 5.629f)
                close()
                moveTo(12.509f, 7.703f)
                horizontalLineToRelative(4.441f)
                lineTo(16.95f, 4.59f)
                horizontalLineToRelative(-4.44f)
                verticalLineToRelative(3.112f)
                close()
                moveTo(13.532f, 5.629f)
                horizontalLineToRelative(2.39f)
                verticalLineToRelative(1.035f)
                horizontalLineToRelative(-2.39f)
                lineTo(13.532f, 5.629f)
                close()
            }
        }
        .build()
        return _apartmentBuildingRegular!!
    }

private var _apartmentBuildingRegular: ImageVector? = null
