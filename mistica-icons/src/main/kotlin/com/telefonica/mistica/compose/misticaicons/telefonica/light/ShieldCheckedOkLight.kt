package com.telefonica.mistica.compose.misticaicons.telefonica.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.telefonica.LightGroup

public val LightGroup.ShieldCheckedOkLight: ImageVector
    get() {
        if (_shieldCheckedOkLight != null) {
            return _shieldCheckedOkLight!!
        }
        _shieldCheckedOkLight = Builder(name = "ShieldCheckedOkLight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.342f, 14.537f)
                curveToRelative(0.392f, -2.294f, 0.44f, -7.367f, 0.442f, -8.916f)
                curveToRelative(-1.812f, 0.157f, -2.888f, -0.568f, -3.93f, -1.263f)
                curveToRelative(-1.011f, -0.678f, -2.059f, -1.378f, -3.865f, -1.378f)
                horizontalLineToRelative(-0.006f)
                curveToRelative(-1.807f, 0.0f, -2.854f, 0.7f, -3.868f, 1.378f)
                curveToRelative(-1.05f, 0.697f, -2.149f, 1.412f, -3.927f, 1.269f)
                curveToRelative(0.005f, 1.557f, 0.056f, 6.619f, 0.45f, 8.907f)
                curveToRelative(0.496f, 2.886f, 6.267f, 5.897f, 7.348f, 6.44f)
                curveToRelative(1.081f, -0.54f, 6.857f, -3.554f, 7.356f, -6.437f)
                close()
                moveTo(20.599f, 5.159f)
                curveToRelative(0.0f, 0.275f, 0.017f, 6.734f, -0.456f, 9.518f)
                curveToRelative(-0.617f, 3.583f, -7.68f, 6.983f, -7.98f, 7.126f)
                arcToRelative(0.398f, 0.398f, 0.0f, false, true, -0.348f, 0.0f)
                curveToRelative(-0.303f, -0.143f, -7.359f, -3.543f, -7.975f, -7.126f)
                curveToRelative(-0.484f, -2.784f, -0.465f, -9.243f, -0.465f, -9.518f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, true, 0.504f, -0.395f)
                curveToRelative(1.746f, 0.275f, 2.692f, -0.358f, 3.79f, -1.092f)
                curveToRelative(1.06f, -0.712f, 2.26f, -1.516f, 4.314f, -1.516f)
                horizontalLineToRelative(0.006f)
                curveToRelative(2.053f, 0.003f, 3.255f, 0.807f, 4.316f, 1.516f)
                curveToRelative(1.095f, 0.73f, 2.042f, 1.367f, 3.793f, 1.092f)
                arcToRelative(0.455f, 0.455f, 0.0f, false, true, 0.342f, 0.09f)
                arcToRelative(0.428f, 0.428f, 0.0f, false, true, 0.16f, 0.305f)
                close()
                moveTo(15.706f, 8.919f)
                arcToRelative(0.403f, 0.403f, 0.0f, false, true, 0.571f, -0.004f)
                lineToRelative(0.003f, 0.003f)
                curveToRelative(0.16f, 0.16f, 0.16f, 0.42f, 0.0f, 0.58f)
                lineToRelative(-5.532f, 5.583f)
                arcToRelative(0.403f, 0.403f, 0.0f, false, true, -0.572f, 0.002f)
                lineToRelative(-0.002f, -0.002f)
                lineToRelative(-2.485f, -2.507f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, true, 0.0f, -0.58f)
                arcToRelative(0.403f, 0.403f, 0.0f, false, true, 0.571f, -0.003f)
                lineToRelative(0.003f, 0.003f)
                lineToRelative(2.196f, 2.215f)
                lineToRelative(5.247f, -5.29f)
                close()
            }
        }
        .build()
        return _shieldCheckedOkLight!!
    }

private var _shieldCheckedOkLight: ImageVector? = null
