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

public val RegularGroup.CheckRegular: ImageVector
    get() {
        if (_checkRegular != null) {
            return _checkRegular!!
        }
        _checkRegular = Builder(name = "CheckRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(8.552f, 20.0f)
                lineToRelative(-6.284f, -6.713f)
                arcToRelative(0.965f, 0.965f, 0.0f, false, true, 0.048f, -1.381f)
                arcToRelative(0.936f, 0.936f, 0.0f, false, true, 1.364f, 0.049f)
                lineToRelative(4.92f, 5.132f)
                lineTo(20.345f, 5.295f)
                arcToRelative(0.937f, 0.937f, 0.0f, false, true, 1.364f, 0.0f)
                arcToRelative(0.965f, 0.965f, 0.0f, false, true, 0.0f, 1.381f)
                lineTo(8.552f, 20.0f)
                close()
            }
        }
        .build()
        return _checkRegular!!
    }

private var _checkRegular: ImageVector? = null
