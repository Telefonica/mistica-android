package com.telefonica.mistica.compose.misticaicons.o2.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.o2.LightGroup

public val LightGroup.CloseLight: ImageVector
    get() {
        if (_closeLight != null) {
            return _closeLight!!
        }
        _closeLight = Builder(name = "CloseLight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.461f, 17.925f)
                arcToRelative(0.538f, 0.538f, 0.0f, true, true, 0.0f, 1.075f)
                arcToRelative(0.538f, 0.538f, 0.0f, false, true, 0.0f, -1.075f)
                close()
                moveTo(18.54f, 5.08f)
                arcToRelative(0.267f, 0.267f, 0.0f, false, true, 0.381f, 0.0f)
                arcToRelative(0.267f, 0.267f, 0.0f, false, true, 0.0f, 0.38f)
                lineTo(12.38f, 12.0f)
                lineToRelative(5.194f, 5.194f)
                arcToRelative(0.267f, 0.267f, 0.0f, false, true, 0.0f, 0.38f)
                arcToRelative(0.265f, 0.265f, 0.0f, false, true, -0.19f, 0.08f)
                arcToRelative(0.265f, 0.265f, 0.0f, false, true, -0.191f, -0.08f)
                lineTo(12.0f, 12.382f)
                lineToRelative(-6.54f, 6.54f)
                arcToRelative(0.265f, 0.265f, 0.0f, false, true, -0.19f, 0.079f)
                arcToRelative(0.265f, 0.265f, 0.0f, false, true, -0.19f, -0.078f)
                arcToRelative(0.267f, 0.267f, 0.0f, false, true, 0.0f, -0.381f)
                lineTo(11.62f, 12.0f)
                lineTo(5.08f, 5.46f)
                arcToRelative(0.267f, 0.267f, 0.0f, false, true, 0.0f, -0.381f)
                arcToRelative(0.267f, 0.267f, 0.0f, false, true, 0.38f, 0.0f)
                lineTo(12.0f, 11.62f)
                close()
            }
        }
        .build()
        return _closeLight!!
    }

private var _closeLight: ImageVector? = null
