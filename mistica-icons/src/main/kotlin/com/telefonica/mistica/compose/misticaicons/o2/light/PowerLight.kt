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

public val LightGroup.PowerLight: ImageVector
    get() {
        if (_powerLight != null) {
            return _powerLight!!
        }
        _powerLight = Builder(name = "PowerLight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.96f, 3.096f)
                curveToRelative(0.038f, 0.212f, -0.082f, 0.459f, -0.288f, 0.503f)
                curveToRelative(-4.038f, 1.087f, -6.857f, 4.862f, -6.857f, 9.134f)
                curveToRelative(0.0f, 5.198f, 4.124f, 9.43f, 9.187f, 9.43f)
                curveToRelative(1.55f, 0.0f, 3.06f, -0.379f, 4.368f, -1.132f)
                curveToRelative(0.206f, -0.123f, 0.447f, -0.04f, 0.571f, 0.168f)
                curveToRelative(0.12f, 0.211f, 0.039f, 0.458f, -0.163f, 0.585f)
                arcTo(9.999f, 9.999f, 0.0f, false, true, 12.002f, 23.0f)
                curveTo(6.492f, 23.0f, 2.0f, 18.393f, 2.0f, 12.733f)
                curveToRelative(0.0f, -4.65f, 3.06f, -8.756f, 7.428f, -9.932f)
                arcToRelative(0.472f, 0.472f, 0.0f, false, true, 0.532f, 0.295f)
                close()
                moveTo(18.533f, 19.018f)
                curveToRelative(0.45f, 0.0f, 0.815f, 0.375f, 0.815f, 0.837f)
                arcToRelative(0.826f, 0.826f, 0.0f, false, true, -0.815f, 0.837f)
                arcToRelative(0.826f, 0.826f, 0.0f, false, true, -0.815f, -0.837f)
                curveToRelative(0.0f, -0.462f, 0.365f, -0.837f, 0.815f, -0.837f)
                close()
                moveTo(14.53f, 2.801f)
                curveTo(18.936f, 3.981f, 22.0f, 8.087f, 22.0f, 12.738f)
                curveToRelative(0.0f, 1.929f, -0.532f, 3.814f, -1.51f, 5.448f)
                arcToRelative(0.488f, 0.488f, 0.0f, false, true, -0.365f, 0.203f)
                curveToRelative(-0.082f, 0.0f, -0.163f, 0.0f, -0.206f, -0.084f)
                curveToRelative(-0.206f, -0.123f, -0.245f, -0.379f, -0.12f, -0.586f)
                arcToRelative(9.776f, 9.776f, 0.0f, false, false, 1.39f, -4.986f)
                curveToRelative(0.0f, -4.272f, -2.82f, -8.042f, -6.861f, -9.134f)
                curveToRelative(-0.206f, -0.04f, -0.326f, -0.251f, -0.288f, -0.503f)
                curveToRelative(0.039f, -0.21f, 0.288f, -0.378f, 0.49f, -0.295f)
                close()
                moveTo(12.002f, 1.0f)
                curveToRelative(0.245f, 0.0f, 0.408f, 0.167f, 0.408f, 0.418f)
                verticalLineToRelative(11.315f)
                curveToRelative(0.0f, 0.251f, -0.163f, 0.419f, -0.408f, 0.419f)
                curveToRelative(-0.244f, 0.0f, -0.407f, -0.168f, -0.407f, -0.419f)
                lineTo(11.595f, 1.418f)
                curveToRelative(0.0f, -0.25f, 0.163f, -0.418f, 0.407f, -0.418f)
                close()
            }
        }
        .build()
        return _powerLight!!
    }

private var _powerLight: ImageVector? = null
