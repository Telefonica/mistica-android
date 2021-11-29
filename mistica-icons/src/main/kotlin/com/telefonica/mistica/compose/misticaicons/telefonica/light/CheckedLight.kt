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

public val LightGroup.CheckedLight: ImageVector
    get() {
        if (_checkedLight != null) {
            return _checkedLight!!
        }
        _checkedLight = Builder(name = "CheckedLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.998f, 1.0f)
                curveToRelative(3.511f, 0.0f, 6.232f, 0.908f, 8.093f, 2.703f)
                curveTo(22.02f, 5.563f, 23.0f, 8.356f, 23.0f, 12.002f)
                curveTo(23.003f, 19.195f, 19.198f, 23.0f, 11.998f, 23.0f)
                curveTo(4.805f, 23.0f, 1.0f, 19.198f, 1.0f, 12.002f)
                curveTo(1.0f, 4.805f, 4.802f, 1.0f, 11.998f, 1.0f)
                close()
                moveTo(11.998f, 1.626f)
                curveToRelative(-6.88f, 0.0f, -10.372f, 3.492f, -10.372f, 10.376f)
                curveToRelative(0.0f, 6.88f, 3.489f, 10.372f, 10.372f, 10.372f)
                curveToRelative(6.887f, 0.0f, 10.376f, -3.489f, 10.376f, -10.372f)
                curveToRelative(0.003f, -6.887f, -3.489f, -10.376f, -10.376f, -10.376f)
                close()
                moveTo(17.388f, 7.442f)
                curveToRelative(0.128f, 0.1f, 0.153f, 0.288f, 0.053f, 0.416f)
                lineToRelative(-6.864f, 8.872f)
                arcToRelative(0.301f, 0.301f, 0.0f, false, true, -0.235f, 0.116f)
                arcToRelative(0.292f, 0.292f, 0.0f, false, true, -0.235f, -0.116f)
                lineToRelative(-2.89f, -3.776f)
                arcToRelative(0.296f, 0.296f, 0.0f, false, true, 0.056f, -0.417f)
                arcToRelative(0.296f, 0.296f, 0.0f, false, true, 0.416f, 0.056f)
                lineToRelative(2.653f, 3.467f)
                lineToRelative(6.63f, -8.565f)
                arcToRelative(0.298f, 0.298f, 0.0f, false, true, 0.416f, -0.053f)
                close()
            }
        }
        .build()
        return _checkedLight!!
    }

private var _checkedLight: ImageVector? = null
