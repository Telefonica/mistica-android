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

public val LightGroup.ChevronRightLight: ImageVector
    get() {
        if (_chevronRightLight != null) {
            return _chevronRightLight!!
        }
        _chevronRightLight = Builder(name = "ChevronRightLight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.553f, 18.854f)
                curveToRelative(0.305f, 0.0f, 0.553f, 0.257f, 0.553f, 0.573f)
                arcToRelative(0.563f, 0.563f, 0.0f, false, true, -0.553f, 0.573f)
                arcToRelative(0.563f, 0.563f, 0.0f, false, true, -0.553f, -0.573f)
                curveToRelative(0.0f, -0.316f, 0.248f, -0.573f, 0.553f, -0.573f)
                close()
                moveTo(8.469f, 4.086f)
                lineToRelative(7.448f, 7.716f)
                arcToRelative(0.282f, 0.282f, 0.0f, false, true, 0.0f, 0.4f)
                lineTo(9.85f, 18.486f)
                arcToRelative(0.248f, 0.248f, 0.0f, false, true, -0.194f, 0.087f)
                arcToRelative(0.248f, 0.248f, 0.0f, false, true, -0.195f, -0.087f)
                arcToRelative(0.282f, 0.282f, 0.0f, false, true, 0.0f, -0.4f)
                lineTo(15.336f, 12.0f)
                lineTo(8.083f, 4.486f)
                arcToRelative(0.282f, 0.282f, 0.0f, false, true, 0.0f, -0.4f)
                arcToRelative(0.259f, 0.259f, 0.0f, false, true, 0.386f, 0.0f)
                close()
            }
        }
        .build()
        return _chevronRightLight!!
    }

private var _chevronRightLight: ImageVector? = null
