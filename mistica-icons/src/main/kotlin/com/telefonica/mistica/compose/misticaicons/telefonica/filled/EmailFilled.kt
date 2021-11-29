package com.telefonica.mistica.compose.misticaicons.telefonica.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.telefonica.FilledGroup

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
                moveTo(21.801f, 16.827f)
                curveToRelative(0.026f, 0.215f, 0.065f, 0.888f, -0.392f, 1.437f)
                curveToRelative(-0.246f, 0.297f, -0.728f, 0.652f, -1.616f, 0.67f)
                curveToRelative(-0.518f, 0.008f, -2.465f, 0.01f, -4.83f, 0.01f)
                curveToRelative(-4.565f, 0.0f, -10.688f, -0.01f, -11.075f, -0.01f)
                arcToRelative(1.706f, 1.706f, 0.0f, false, true, -1.151f, -0.48f)
                curveToRelative(-0.38f, -0.372f, -0.577f, -0.905f, -0.577f, -1.585f)
                lineTo(2.16f, 7.4f)
                lineToRelative(8.025f, 5.059f)
                curveToRelative(0.042f, 0.03f, 0.72f, 0.51f, 1.658f, 0.51f)
                curveToRelative(0.471f, 0.0f, 1.009f, -0.12f, 1.563f, -0.485f)
                lineToRelative(8.41f, -5.123f)
                lineToRelative(-0.015f, 9.465f)
                close()
                moveTo(12.762f, 11.477f)
                curveToRelative(-0.966f, 0.63f, -1.832f, 0.039f, -1.896f, -0.006f)
                lineTo(2.33f, 6.09f)
                curveToRelative(0.078f, -0.202f, 0.19f, -0.406f, 0.358f, -0.583f)
                curveToRelative(0.303f, -0.319f, 0.717f, -0.487f, 1.202f, -0.487f)
                lineToRelative(16.221f, 0.003f)
                curveToRelative(0.367f, 0.003f, 1.14f, 0.201f, 1.505f, 1.061f)
                lineToRelative(-8.855f, 5.393f)
                close()
            }
        }
        .build()
        return _emailFilled!!
    }

private var _emailFilled: ImageVector? = null
