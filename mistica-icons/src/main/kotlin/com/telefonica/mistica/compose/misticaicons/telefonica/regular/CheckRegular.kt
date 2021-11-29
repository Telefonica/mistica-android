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
                moveTo(9.416f, 19.5f)
                arcToRelative(0.997f, 0.997f, 0.0f, false, true, -0.77f, -0.353f)
                lineToRelative(-5.033f, -6.065f)
                arcToRelative(0.916f, 0.916f, 0.0f, false, true, 0.155f, -1.322f)
                arcToRelative(1.012f, 1.012f, 0.0f, false, true, 1.379f, 0.149f)
                lineTo(9.39f, 17.02f)
                lineTo(19.633f, 3.877f)
                arcToRelative(1.01f, 1.01f, 0.0f, false, true, 1.373f, -0.19f)
                arcToRelative(0.915f, 0.915f, 0.0f, false, true, 0.198f, 1.317f)
                lineTo(10.207f, 19.121f)
                arcToRelative(0.988f, 0.988f, 0.0f, false, true, -0.77f, 0.379f)
                horizontalLineToRelative(-0.02f)
                close()
            }
        }
        .build()
        return _checkRegular!!
    }

private var _checkRegular: ImageVector? = null
