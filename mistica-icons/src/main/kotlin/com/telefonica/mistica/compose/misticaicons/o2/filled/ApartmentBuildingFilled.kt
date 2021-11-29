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

public val FilledGroup.ApartmentBuildingFilled: ImageVector
    get() {
        if (_apartmentBuildingFilled != null) {
            return _apartmentBuildingFilled!!
        }
        _apartmentBuildingFilled = Builder(name = "ApartmentBuildingFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.623f, 2.0f)
                lineTo(5.0f, 2.0f)
                verticalLineToRelative(20.0f)
                horizontalLineToRelative(1.843f)
                verticalLineToRelative(-6.419f)
                horizontalLineToRelative(4.422f)
                verticalLineToRelative(6.414f)
                lineTo(19.0f, 21.995f)
                lineTo(19.0f, 2.377f)
                arcTo(0.387f, 0.387f, 0.0f, false, false, 18.623f, 2.0f)
                close()
                moveTo(11.26f, 12.94f)
                lineTo(6.838f, 12.94f)
                lineTo(6.838f, 9.92f)
                horizontalLineToRelative(4.422f)
                verticalLineToRelative(3.02f)
                close()
                moveTo(11.26f, 7.656f)
                lineTo(6.838f, 7.656f)
                lineTo(6.838f, 4.642f)
                horizontalLineToRelative(4.422f)
                verticalLineToRelative(3.014f)
                close()
                moveTo(17.152f, 18.6f)
                horizontalLineToRelative(-4.421f)
                lineTo(12.731f, 15.58f)
                horizontalLineToRelative(4.421f)
                lineTo(17.152f, 18.6f)
                close()
                moveTo(17.152f, 12.94f)
                horizontalLineToRelative(-4.421f)
                lineTo(12.731f, 9.92f)
                horizontalLineToRelative(4.421f)
                verticalLineToRelative(3.02f)
                close()
                moveTo(17.152f, 7.656f)
                horizontalLineToRelative(-4.421f)
                lineTo(12.731f, 4.642f)
                horizontalLineToRelative(4.421f)
                verticalLineToRelative(3.014f)
                close()
            }
        }
        .build()
        return _apartmentBuildingFilled!!
    }

private var _apartmentBuildingFilled: ImageVector? = null
