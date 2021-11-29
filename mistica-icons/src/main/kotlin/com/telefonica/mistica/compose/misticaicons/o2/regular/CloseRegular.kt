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

public val RegularGroup.CloseRegular: ImageVector
    get() {
        if (_closeRegular != null) {
            return _closeRegular!!
        }
        _closeRegular = Builder(name = "CloseRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.734f, 12.0f)
                lineToRelative(6.114f, -6.114f)
                arcToRelative(0.52f, 0.52f, 0.0f, false, false, -0.734f, -0.734f)
                lineTo(12.0f, 11.266f)
                lineTo(5.886f, 5.152f)
                arcToRelative(0.52f, 0.52f, 0.0f, false, false, -0.734f, 0.734f)
                lineTo(11.266f, 12.0f)
                lineToRelative(-6.114f, 6.114f)
                arcToRelative(0.52f, 0.52f, 0.0f, false, false, 0.365f, 0.886f)
                curveToRelative(0.132f, 0.0f, 0.265f, -0.05f, 0.366f, -0.152f)
                lineTo(12.0f, 12.734f)
                lineToRelative(6.114f, 6.114f)
                arcToRelative(0.515f, 0.515f, 0.0f, false, false, 0.731f, 0.0f)
                arcToRelative(0.52f, 0.52f, 0.0f, false, false, 0.0f, -0.734f)
                lineTo(12.734f, 12.0f)
                close()
            }
        }
        .build()
        return _closeRegular!!
    }

private var _closeRegular: ImageVector? = null
