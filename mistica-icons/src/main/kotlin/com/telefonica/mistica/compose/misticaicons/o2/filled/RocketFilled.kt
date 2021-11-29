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

public val FilledGroup.RocketFilled: ImageVector
    get() {
        if (_rocketFilled != null) {
            return _rocketFilled!!
        }
        _rocketFilled = Builder(name = "RocketFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(6.205f, 18.57f)
                lineToRelative(-3.272f, 3.272f)
                arcToRelative(0.542f, 0.542f, 0.0f, false, true, -0.386f, 0.158f)
                arcToRelative(0.545f, 0.545f, 0.0f, false, true, -0.386f, -0.931f)
                lineToRelative(3.272f, -3.272f)
                arcToRelative(0.545f, 0.545f, 0.0f, false, true, 0.772f, 0.0f)
                arcToRelative(0.545f, 0.545f, 0.0f, false, true, 0.0f, 0.772f)
                close()
                moveTo(2.547f, 18.364f)
                curveToRelative(0.14f, 0.0f, 0.28f, -0.05f, 0.386f, -0.158f)
                lineToRelative(1.452f, -1.457f)
                arcToRelative(0.545f, 0.545f, 0.0f, false, false, 0.0f, -0.773f)
                arcToRelative(0.545f, 0.545f, 0.0f, false, false, -0.772f, 0.0f)
                lineTo(2.16f, 17.43f)
                arcToRelative(0.545f, 0.545f, 0.0f, false, false, 0.0f, 0.773f)
                arcToRelative(0.528f, 0.528f, 0.0f, false, false, 0.386f, 0.162f)
                close()
                moveTo(7.253f, 19.617f)
                lineTo(5.8f, 21.069f)
                arcToRelative(0.545f, 0.545f, 0.0f, false, false, 0.387f, 0.931f)
                curveToRelative(0.14f, 0.0f, 0.279f, -0.051f, 0.386f, -0.158f)
                lineToRelative(1.452f, -1.453f)
                arcToRelative(0.545f, 0.545f, 0.0f, false, false, 0.0f, -0.772f)
                arcToRelative(0.545f, 0.545f, 0.0f, false, false, -0.772f, 0.0f)
                close()
                moveTo(21.839f, 2.933f)
                lineToRelative(-0.865f, 0.866f)
                arcToRelative(3.449f, 3.449f, 0.0f, false, true, -0.354f, 4.46f)
                lineToRelative(-6.237f, 6.237f)
                lineToRelative(1.294f, 4.888f)
                lineToRelative(-2.406f, 2.407f)
                lineToRelative(-3.09f, -3.091f)
                lineToRelative(-0.727f, 0.726f)
                lineToRelative(-4.878f, -4.879f)
                lineToRelative(0.726f, -0.726f)
                lineToRelative(-3.09f, -3.09f)
                lineToRelative(2.406f, -2.407f)
                lineToRelative(4.887f, 1.294f)
                lineToRelative(6.237f, -6.238f)
                arcToRelative(3.425f, 3.425f, 0.0f, false, true, 2.44f, -1.01f)
                curveToRelative(0.734f, 0.0f, 1.437f, 0.233f, 2.02f, 0.656f)
                lineToRelative(0.865f, -0.865f)
                arcToRelative(0.545f, 0.545f, 0.0f, false, true, 0.772f, 0.0f)
                arcToRelative(0.545f, 0.545f, 0.0f, false, true, 0.0f, 0.772f)
                close()
                moveTo(18.907f, 7.09f)
                arcToRelative(2.004f, 2.004f, 0.0f, false, false, -2.001f, -2.001f)
                arcToRelative(2.004f, 2.004f, 0.0f, false, false, -2.002f, 2.001f)
                curveToRelative(0.0f, 1.103f, 0.899f, 2.002f, 2.002f, 2.002f)
                arcToRelative(2.004f, 2.004f, 0.0f, false, false, 2.001f, -2.002f)
                close()
                moveTo(16.91f, 6.182f)
                arcToRelative(0.909f, 0.909f, 0.0f, false, false, -0.907f, 0.908f)
                curveToRelative(0.0f, 0.498f, 0.41f, 0.908f, 0.907f, 0.908f)
                curveToRelative(0.498f, 0.0f, 0.908f, -0.41f, 0.908f, -0.908f)
                arcToRelative(0.912f, 0.912f, 0.0f, false, false, -0.908f, -0.908f)
                close()
            }
        }
        .build()
        return _rocketFilled!!
    }

private var _rocketFilled: ImageVector? = null
