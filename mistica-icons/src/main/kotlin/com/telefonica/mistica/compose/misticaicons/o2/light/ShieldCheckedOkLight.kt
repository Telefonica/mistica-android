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
                moveTo(12.0f, 22.0f)
                arcToRelative(0.275f, 0.275f, 0.0f, false, true, -0.102f, -0.018f)
                curveTo(7.257f, 20.42f, 5.0f, 18.143f, 5.0f, 15.023f)
                lineTo(5.0f, 6.31f)
                curveToRelative(0.0f, -0.192f, 0.15f, -0.348f, 0.333f, -0.348f)
                curveToRelative(3.621f, 0.0f, 6.403f, -2.835f, 6.432f, -2.862f)
                arcToRelative(0.324f, 0.324f, 0.0f, false, true, 0.47f, 0.0f)
                curveToRelative(0.025f, 0.027f, 2.81f, 2.862f, 6.432f, 2.862f)
                curveToRelative(0.184f, 0.0f, 0.333f, 0.156f, 0.333f, 0.348f)
                verticalLineToRelative(8.718f)
                curveToRelative(0.0f, 3.12f, -2.257f, 5.396f, -6.898f, 6.959f)
                arcTo(0.403f, 0.403f, 0.0f, false, true, 12.0f, 22.0f)
                close()
                moveTo(5.67f, 6.65f)
                verticalLineToRelative(8.378f)
                curveToRelative(0.0f, 2.758f, 2.073f, 4.807f, 6.33f, 6.258f)
                curveToRelative(4.261f, -1.455f, 6.33f, -3.504f, 6.33f, -6.258f)
                lineTo(18.33f, 6.649f)
                curveToRelative(-3.152f, -0.134f, -5.584f, -2.142f, -6.33f, -2.83f)
                curveToRelative(-0.746f, 0.692f, -3.178f, 2.696f, -6.33f, 2.83f)
                close()
                moveTo(14.402f, 11.742f)
                arcToRelative(0.358f, 0.358f, 0.0f, false, false, -0.005f, -0.49f)
                arcToRelative(0.32f, 0.32f, 0.0f, false, false, -0.469f, 0.004f)
                lineToRelative(-3.596f, 3.803f)
                lineToRelative(-1.928f, -2.018f)
                arcToRelative(0.317f, 0.317f, 0.0f, false, false, -0.47f, 0.0f)
                arcToRelative(0.358f, 0.358f, 0.0f, false, false, 0.0f, 0.491f)
                lineToRelative(2.402f, 2.513f)
                lineToRelative(4.066f, -4.303f)
                close()
                moveTo(14.999f, 10.144f)
                curveToRelative(0.0f, 0.384f, 0.298f, 0.697f, 0.665f, 0.697f)
                curveToRelative(0.367f, 0.0f, 0.666f, -0.313f, 0.666f, -0.697f)
                curveToRelative(0.0f, -0.384f, -0.299f, -0.696f, -0.666f, -0.696f)
                curveToRelative(-0.367f, 0.0f, -0.665f, 0.312f, -0.665f, 0.696f)
            }
        }
        .build()
        return _shieldCheckedOkLight!!
    }

private var _shieldCheckedOkLight: ImageVector? = null
