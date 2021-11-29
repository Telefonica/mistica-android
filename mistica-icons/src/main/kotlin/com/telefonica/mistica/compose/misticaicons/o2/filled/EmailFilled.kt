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

public val FilledGroup.EmailFilled: ImageVector
    get() {
        if (_emailFilled != null) {
            return _emailFilled!!
        }
        _emailFilled = Builder(name = "EmailFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 5.962f)
                verticalLineToRelative(12.272f)
                arcToRelative(0.754f, 0.754f, 0.0f, false, true, -0.74f, 0.766f)
                horizontalLineTo(2.74f)
                arcToRelative(0.754f, 0.754f, 0.0f, false, true, -0.74f, -0.766f)
                verticalLineTo(5.962f)
                lineToRelative(9.706f, 6.237f)
                arcToRelative(0.53f, 0.53f, 0.0f, false, false, 0.588f, 0.0f)
                lineTo(22.0f, 5.962f)
                close()
                moveTo(21.26f, 5.0f)
                curveToRelative(0.043f, 0.0f, 0.076f, 0.005f, 0.114f, 0.01f)
                lineTo(12.0f, 11.035f)
                lineTo(2.626f, 5.01f)
                curveToRelative(0.038f, -0.005f, 0.076f, -0.01f, 0.114f, -0.01f)
                close()
            }
        }
        .build()
        return _emailFilled!!
    }

private var _emailFilled: ImageVector? = null
