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

public val LightGroup.ChevronLeftLight: ImageVector
    get() {
        if (_chevronLeftLight != null) {
            return _chevronLeftLight!!
        }
        _chevronLeftLight = Builder(name = "ChevronLeftLight", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.447f, 18.854f)
                curveToRelative(0.305f, 0.0f, 0.553f, 0.257f, 0.553f, 0.573f)
                arcToRelative(0.563f, 0.563f, 0.0f, false, true, -0.553f, 0.573f)
                arcToRelative(0.563f, 0.563f, 0.0f, false, true, -0.553f, -0.573f)
                curveToRelative(0.0f, -0.316f, 0.248f, -0.573f, 0.553f, -0.573f)
                close()
                moveTo(15.531f, 4.086f)
                arcToRelative(0.259f, 0.259f, 0.0f, false, true, 0.386f, 0.0f)
                arcToRelative(0.282f, 0.282f, 0.0f, false, true, 0.0f, 0.4f)
                lineTo(8.664f, 12.0f)
                lineToRelative(5.875f, 6.086f)
                arcToRelative(0.282f, 0.282f, 0.0f, false, true, 0.0f, 0.4f)
                arcToRelative(0.248f, 0.248f, 0.0f, false, true, -0.195f, 0.087f)
                arcToRelative(0.248f, 0.248f, 0.0f, false, true, -0.194f, -0.087f)
                lineToRelative(-6.067f, -6.284f)
                arcToRelative(0.282f, 0.282f, 0.0f, false, true, 0.0f, -0.4f)
                close()
            }
        }
        .build()
        return _chevronLeftLight!!
    }

private var _chevronLeftLight: ImageVector? = null
