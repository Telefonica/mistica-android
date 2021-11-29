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

public val FilledGroup.BoxFilled: ImageVector
    get() {
        if (_boxFilled != null) {
            return _boxFilled!!
        }
        _boxFilled = Builder(name = "BoxFilled", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.54f, 6.606f)
                lineTo(12.5f, 2.0f)
                lineToRelative(3.454f, 1.997f)
                lineTo(8.18f, 8.639f)
                lineTo(4.54f, 6.606f)
                close()
                moveTo(16.992f, 4.6f)
                lineTo(9.24f, 9.233f)
                lineToRelative(3.259f, 1.822f)
                lineToRelative(7.96f, -4.45f)
                lineTo(16.994f, 4.6f)
                close()
                moveTo(11.969f, 11.958f)
                lineTo(4.0f, 7.508f)
                verticalLineToRelative(8.882f)
                lineTo(11.97f, 21.0f)
                verticalLineToRelative(-9.042f)
                close()
                moveTo(13.029f, 11.958f)
                lineTo(13.029f, 21.0f)
                lineTo(21.0f, 16.39f)
                lineTo(21.0f, 7.508f)
                lineToRelative(-7.97f, 4.45f)
                close()
            }
        }
        .build()
        return _boxFilled!!
    }

private var _boxFilled: ImageVector? = null
