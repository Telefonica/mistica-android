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

public val LightGroup.ArrowDownLight: ImageVector
    get() {
        if (_arrowDownLight != null) {
            return _arrowDownLight!!
        }
        _arrowDownLight = Builder(name = "ArrowDownLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.998f, 22.0f)
                lineToRelative(-9.465f, -9.459f)
                curveToRelative(-0.536f, -0.546f, -0.676f, -1.326f, -0.383f, -2.057f)
                curveToRelative(0.3f, -0.739f, 0.984f, -1.213f, 1.741f, -1.213f)
                lineTo(8.31f, 9.271f)
                lineTo(8.31f, 1.378f)
                arcToRelative(0.37f, 0.37f, 0.0f, false, true, 0.367f, -0.374f)
                arcToRelative(0.37f, 0.37f, 0.0f, false, true, 0.366f, 0.374f)
                verticalLineToRelative(8.64f)
                lineTo(3.9f, 10.018f)
                curveToRelative(-0.56f, 0.0f, -0.919f, 0.39f, -1.059f, 0.747f)
                curveToRelative(-0.14f, 0.349f, -0.156f, 0.857f, 0.219f, 1.239f)
                lineToRelative(8.95f, 8.938f)
                lineToRelative(8.952f, -8.947f)
                curveToRelative(0.375f, -0.382f, 0.358f, -0.881f, 0.218f, -1.23f)
                curveToRelative(-0.148f, -0.365f, -0.498f, -0.747f, -1.058f, -0.747f)
                horizontalLineToRelative(-5.167f)
                lineTo(14.955f, 4.01f)
                arcToRelative(0.37f, 0.37f, 0.0f, false, true, 0.366f, -0.373f)
                arcToRelative(0.37f, 0.37f, 0.0f, false, true, 0.367f, 0.373f)
                verticalLineToRelative(5.26f)
                horizontalLineToRelative(4.418f)
                curveToRelative(0.757f, 0.0f, 1.44f, 0.475f, 1.741f, 1.214f)
                curveToRelative(0.3f, 0.73f, 0.148f, 1.52f, -0.374f, 2.057f)
                lineTo(11.998f, 22.0f)
                close()
                moveTo(14.584f, 1.747f)
                curveToRelative(0.0f, 0.416f, 0.334f, 0.748f, 0.733f, 0.748f)
                curveToRelative(0.408f, 0.0f, 0.733f, -0.34f, 0.733f, -0.748f)
                arcTo(0.742f, 0.742f, 0.0f, false, false, 15.317f, 1.0f)
                curveToRelative(-0.4f, 0.0f, -0.733f, 0.332f, -0.733f, 0.747f)
            }
        }
        .build()
        return _arrowDownLight!!
    }

private var _arrowDownLight: ImageVector? = null
