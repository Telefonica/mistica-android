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

public val LightGroup.RewindLight: ImageVector
    get() {
        if (_rewindLight != null) {
            return _rewindLight!!
        }
        _rewindLight = Builder(name = "RewindLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.988f, 2.15f)
                curveToRelative(3.14f, 0.0f, 5.574f, 0.812f, 7.238f, 2.417f)
                curveToRelative(1.725f, 1.664f, 2.602f, 4.163f, 2.602f, 7.423f)
                curveToRelative(0.003f, 6.435f, -3.4f, 9.838f, -9.84f, 9.838f)
                curveToRelative(-6.435f, 0.0f, -9.838f, -3.4f, -9.838f, -9.838f)
                curveToRelative(0.0f, -6.437f, 3.4f, -9.84f, 9.838f, -9.84f)
                close()
                moveTo(11.988f, 2.71f)
                curveToRelative(-6.155f, 0.0f, -9.278f, 3.123f, -9.278f, 9.28f)
                curveToRelative(0.0f, 6.154f, 3.12f, 9.278f, 9.278f, 9.278f)
                curveToRelative(6.16f, 0.0f, 9.28f, -3.12f, 9.28f, -9.278f)
                curveToRelative(0.002f, -6.16f, -3.12f, -9.28f, -9.28f, -9.28f)
                close()
                moveTo(11.251f, 8.133f)
                curveToRelative(0.087f, 0.05f, 0.143f, 0.143f, 0.143f, 0.244f)
                lineToRelative(-0.002f, 3.177f)
                arcToRelative(0.275f, 0.275f, 0.0f, false, true, 0.1f, -0.104f)
                lineToRelative(5.507f, -3.308f)
                arcToRelative(0.277f, 0.277f, 0.0f, false, true, 0.283f, -0.003f)
                curveToRelative(0.086f, 0.05f, 0.143f, 0.143f, 0.143f, 0.243f)
                verticalLineToRelative(6.586f)
                arcToRelative(0.278f, 0.278f, 0.0f, false, true, -0.28f, 0.28f)
                arcToRelative(0.288f, 0.288f, 0.0f, false, true, -0.143f, -0.04f)
                lineToRelative(-5.507f, -3.276f)
                arcToRelative(0.284f, 0.284f, 0.0f, false, true, -0.103f, -0.107f)
                lineToRelative(0.002f, 3.137f)
                curveToRelative(0.0f, 0.101f, -0.054f, 0.194f, -0.143f, 0.244f)
                arcToRelative(0.251f, 0.251f, 0.0f, false, true, -0.135f, 0.04f)
                arcToRelative(0.288f, 0.288f, 0.0f, false, true, -0.142f, -0.04f)
                lineToRelative(-5.51f, -3.28f)
                arcToRelative(0.28f, 0.28f, 0.0f, false, true, -0.003f, -0.482f)
                lineToRelative(5.507f, -3.308f)
                arcToRelative(0.277f, 0.277f, 0.0f, false, true, 0.283f, -0.003f)
                close()
                moveTo(16.864f, 8.878f)
                lineTo(12.184f, 11.691f)
                lineTo(16.864f, 14.478f)
                verticalLineToRelative(-5.6f)
                close()
                moveTo(10.834f, 8.873f)
                lineTo(6.153f, 11.685f)
                lineTo(10.833f, 14.472f)
                verticalLineToRelative(-5.6f)
                close()
            }
        }
        .build()
        return _rewindLight!!
    }

private var _rewindLight: ImageVector? = null
