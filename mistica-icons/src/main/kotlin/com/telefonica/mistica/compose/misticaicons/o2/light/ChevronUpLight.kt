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

public val LightGroup.ChevronUpLight: ImageVector
    get() {
        if (_chevronUpLight != null) {
            return _chevronUpLight!!
        }
        _chevronUpLight = Builder(name = "ChevronUpLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(12.202f, 8.083f)
                lineToRelative(6.284f, 6.067f)
                arcToRelative(0.248f, 0.248f, 0.0f, false, true, 0.087f, 0.194f)
                arcToRelative(0.248f, 0.248f, 0.0f, false, true, -0.087f, 0.195f)
                arcToRelative(0.282f, 0.282f, 0.0f, false, true, -0.4f, 0.0f)
                lineTo(12.0f, 8.664f)
                lineToRelative(-7.514f, 7.253f)
                arcToRelative(0.282f, 0.282f, 0.0f, false, true, -0.4f, 0.0f)
                arcToRelative(0.259f, 0.259f, 0.0f, false, true, 0.0f, -0.386f)
                lineToRelative(7.716f, -7.448f)
                arcToRelative(0.282f, 0.282f, 0.0f, false, true, 0.4f, 0.0f)
                close()
                moveTo(19.427f, 14.894f)
                curveToRelative(0.317f, 0.0f, 0.573f, 0.248f, 0.573f, 0.553f)
                arcToRelative(0.563f, 0.563f, 0.0f, false, true, -0.573f, 0.553f)
                arcToRelative(0.563f, 0.563f, 0.0f, false, true, -0.573f, -0.553f)
                curveToRelative(0.0f, -0.305f, 0.257f, -0.553f, 0.573f, -0.553f)
                close()
            }
        }
        .build()
        return _chevronUpLight!!
    }

private var _chevronUpLight: ImageVector? = null
