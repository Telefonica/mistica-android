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

public val RegularGroup.BoxRegular: ImageVector
    get() {
        if (_boxRegular != null) {
            return _boxRegular!!
        }
        _boxRegular = Builder(name = "BoxRegular", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.5f, 2.0f)
                lineTo(4.0f, 7.097f)
                verticalLineToRelative(9.802f)
                lineTo(12.5f, 22.0f)
                lineToRelative(8.5f, -5.097f)
                lineTo(21.0f, 7.097f)
                lineTo(12.5f, 2.0f)
                close()
                moveTo(12.5f, 11.177f)
                lineTo(9.807f, 9.63f)
                lineToRelative(6.392f, -3.74f)
                lineToRelative(2.698f, 1.615f)
                lineToRelative(-6.397f, 3.67f)
                close()
                moveTo(14.798f, 5.05f)
                lineTo(8.375f, 8.808f)
                lineTo(6.103f, 7.506f)
                lineTo(12.5f, 3.67f)
                lineToRelative(2.298f, 1.38f)
                close()
                moveTo(5.418f, 8.762f)
                lineTo(11.793f, 12.419f)
                verticalLineToRelative(7.483f)
                lineTo(5.419f, 16.08f)
                lineTo(5.419f, 8.762f)
                close()
                moveTo(13.208f, 19.902f)
                lineTo(13.208f, 12.42f)
                lineToRelative(6.373f, -3.657f)
                verticalLineToRelative(7.318f)
                lineToRelative(-6.374f, 3.822f)
                close()
            }
        }
        .build()
        return _boxRegular!!
    }

private var _boxRegular: ImageVector? = null
