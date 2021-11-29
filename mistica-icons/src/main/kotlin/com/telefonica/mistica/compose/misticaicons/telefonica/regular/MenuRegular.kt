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

public val RegularGroup.MenuRegular: ImageVector
    get() {
        if (_menuRegular != null) {
            return _menuRegular!!
        }
        _menuRegular = Builder(name = "MenuRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.003f, 6.241f)
                arcToRelative(0.834f, 0.834f, 0.0f, false, true, -0.843f, -0.82f)
                curveToRelative(0.0f, -0.451f, 0.378f, -0.821f, 0.843f, -0.821f)
                lineTo(21.0f, 4.6f)
                curveToRelative(0.465f, 0.0f, 0.843f, 0.367f, 0.843f, 0.82f)
                arcToRelative(0.834f, 0.834f, 0.0f, false, true, -0.843f, 0.821f)
                lineTo(3.003f, 6.241f)
                close()
                moveTo(21.003f, 11.163f)
                curveToRelative(0.465f, 0.0f, 0.843f, 0.367f, 0.843f, 0.82f)
                arcToRelative(0.832f, 0.832f, 0.0f, false, true, -0.843f, 0.821f)
                horizontalLineToRelative(-18.0f)
                arcToRelative(0.832f, 0.832f, 0.0f, false, true, -0.843f, -0.82f)
                curveToRelative(0.0f, -0.454f, 0.378f, -0.821f, 0.843f, -0.821f)
                horizontalLineToRelative(18.0f)
                close()
                moveTo(21.003f, 17.726f)
                curveToRelative(0.465f, 0.0f, 0.843f, 0.367f, 0.843f, 0.82f)
                arcToRelative(0.832f, 0.832f, 0.0f, false, true, -0.843f, 0.822f)
                horizontalLineToRelative(-18.0f)
                arcToRelative(0.832f, 0.832f, 0.0f, false, true, -0.843f, -0.821f)
                curveToRelative(0.0f, -0.454f, 0.378f, -0.82f, 0.843f, -0.82f)
                horizontalLineToRelative(18.0f)
                close()
            }
        }
        .build()
        return _menuRegular!!
    }

private var _menuRegular: ImageVector? = null
