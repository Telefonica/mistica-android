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

public val FilledGroup.PersonalComputerFilled: ImageVector
    get() {
        if (_personalComputerFilled != null) {
            return _personalComputerFilled!!
        }
        _personalComputerFilled = Builder(name = "PersonalComputerFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 3.0f)
                lineTo(2.0f, 3.0f)
                verticalLineToRelative(10.959f)
                horizontalLineToRelative(19.991f)
                lineTo(21.991f, 3.0f)
                lineTo(22.0f, 3.0f)
                close()
                moveTo(20.57f, 15.057f)
                lineTo(2.0f, 15.057f)
                verticalLineToRelative(2.558f)
                horizontalLineToRelative(19.995f)
                verticalLineToRelative(-2.558f)
                lineTo(20.57f, 15.057f)
                close()
                moveTo(15.926f, 18.709f)
                lineTo(8.074f, 18.709f)
                lineToRelative(-0.68f, 2.375f)
                curveToRelative(-0.074f, 0.22f, 0.0f, 0.477f, 0.104f, 0.659f)
                arcTo(0.703f, 0.703f, 0.0f, false, false, 8.07f, 22.0f)
                horizontalLineToRelative(7.857f)
                curveToRelative(0.215f, 0.0f, 0.43f, -0.075f, 0.571f, -0.257f)
                curveToRelative(0.142f, -0.182f, 0.179f, -0.402f, 0.105f, -0.66f)
                lineToRelative(-0.676f, -2.374f)
                close()
            }
        }
        .build()
        return _personalComputerFilled!!
    }

private var _personalComputerFilled: ImageVector? = null
