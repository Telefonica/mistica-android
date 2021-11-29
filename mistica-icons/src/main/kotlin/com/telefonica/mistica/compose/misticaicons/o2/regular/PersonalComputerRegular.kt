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

public val RegularGroup.PersonalComputerRegular: ImageVector
    get() {
        if (_personalComputerRegular != null) {
            return _personalComputerRegular!!
        }
        _personalComputerRegular = Builder(name = "PersonalComputerRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 3.0f)
                lineTo(2.0f, 3.0f)
                verticalLineToRelative(14.903f)
                horizontalLineToRelative(6.252f)
                lineToRelative(-0.859f, 3.167f)
                curveToRelative(-0.073f, 0.224f, 0.0f, 0.448f, 0.105f, 0.634f)
                arcTo(0.73f, 0.73f, 0.0f, false, false, 8.07f, 22.0f)
                horizontalLineToRelative(7.857f)
                arcToRelative(0.73f, 0.73f, 0.0f, false, false, 0.571f, -0.296f)
                arcToRelative(0.673f, 0.673f, 0.0f, false, false, 0.105f, -0.634f)
                lineToRelative(-0.854f, -3.162f)
                horizontalLineToRelative(6.247f)
                lineTo(21.996f, 3.0f)
                lineTo(22.0f, 3.0f)
                close()
                moveTo(20.57f, 4.493f)
                verticalLineToRelative(9.314f)
                lineTo(3.43f, 13.807f)
                lineTo(3.43f, 4.493f)
                horizontalLineToRelative(17.14f)
                close()
                moveTo(14.998f, 20.512f)
                lineTo(9.002f, 20.512f)
                lineToRelative(0.676f, -2.609f)
                horizontalLineToRelative(4.644f)
                lineToRelative(0.676f, 2.609f)
                close()
                moveTo(3.431f, 16.415f)
                verticalLineToRelative(-1.488f)
                horizontalLineToRelative(17.138f)
                verticalLineToRelative(1.488f)
                lineTo(3.431f, 16.415f)
                close()
            }
        }
        .build()
        return _personalComputerRegular!!
    }

private var _personalComputerRegular: ImageVector? = null
