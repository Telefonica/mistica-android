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

public val RegularGroup.EyeRegular: ImageVector
    get() {
        if (_eyeRegular != null) {
            return _eyeRegular!!
        }
        _eyeRegular = Builder(name = "EyeRegular", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.037f, 17.284f)
                curveToRelative(3.602f, 0.0f, 7.3f, -3.736f, 8.409f, -4.955f)
                curveToRelative(-1.115f, -1.218f, -4.835f, -4.96f, -8.434f, -4.96f)
                curveToRelative(-3.603f, 0.0f, -7.32f, 3.736f, -8.435f, 4.957f)
                curveToRelative(1.124f, 1.219f, 4.86f, 4.958f, 8.46f, 4.958f)
                close()
                moveTo(21.715f, 11.948f)
                arcToRelative(0.592f, 0.592f, 0.0f, false, true, 0.0f, 0.756f)
                curveToRelative(-0.194f, 0.239f, -4.83f, 5.774f, -9.678f, 5.774f)
                curveToRelative(-4.849f, 0.0f, -9.535f, -5.535f, -9.731f, -5.77f)
                arcToRelative(0.592f, 0.592f, 0.0f, false, true, -0.003f, -0.76f)
                curveToRelative(0.199f, -0.235f, 4.857f, -5.773f, 9.709f, -5.773f)
                curveToRelative(4.851f, 0.0f, 9.507f, 5.538f, 9.703f, 5.773f)
                close()
                moveTo(12.112f, 9.957f)
                curveToRelative(0.488f, 0.01f, 2.381f, 0.201f, 2.381f, 2.453f)
                curveToRelative(0.0f, 2.258f, -1.896f, 2.435f, -2.37f, 2.443f)
                curveToRelative(-0.075f, 0.003f, -0.15f, 0.003f, -0.226f, 0.003f)
                curveToRelative(-0.499f, -0.009f, -2.37f, -0.185f, -2.37f, -2.46f)
                curveToRelative(0.0f, -2.271f, 1.852f, -2.44f, 2.353f, -2.442f)
                curveToRelative(0.076f, 0.0f, 0.162f, 0.0f, 0.232f, 0.003f)
                close()
            }
        }
        .build()
        return _eyeRegular!!
    }

private var _eyeRegular: ImageVector? = null
