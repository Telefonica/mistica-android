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

public val LightGroup.BriefcaseLight: ImageVector
    get() {
        if (_briefcaseLight != null) {
            return _briefcaseLight!!
        }
        _briefcaseLight = Builder(name = "BriefcaseLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.768f, 19.411f)
                curveToRelative(0.426f, 0.0f, 0.772f, 0.356f, 0.772f, 0.795f)
                arcToRelative(0.783f, 0.783f, 0.0f, false, true, -0.772f, 0.794f)
                arcToRelative(0.783f, 0.783f, 0.0f, false, true, -0.772f, -0.794f)
                curveToRelative(0.0f, -0.44f, 0.346f, -0.795f, 0.772f, -0.795f)
                close()
                moveTo(12.0f, 2.0f)
                curveToRelative(1.772f, 0.0f, 3.192f, 1.227f, 3.424f, 2.77f)
                horizontalLineToRelative(4.652f)
                curveToRelative(1.08f, 0.0f, 1.924f, 0.873f, 1.924f, 1.98f)
                verticalLineToRelative(11.875f)
                curveToRelative(0.0f, 1.111f, -0.848f, 1.98f, -1.924f, 1.98f)
                curveToRelative(-0.228f, 0.0f, -0.384f, -0.16f, -0.384f, -0.395f)
                curveToRelative(0.0f, -0.235f, 0.152f, -0.395f, 0.384f, -0.395f)
                curveToRelative(0.656f, 0.0f, 1.156f, -0.52f, 1.156f, -1.19f)
                lineTo(21.232f, 11.5f)
                lineTo(2.768f, 11.5f)
                verticalLineToRelative(7.12f)
                curveToRelative(0.0f, 0.676f, 0.504f, 1.19f, 1.156f, 1.19f)
                horizontalLineToRelative(11.54f)
                curveToRelative(0.228f, 0.0f, 0.384f, 0.161f, 0.384f, 0.396f)
                curveToRelative(0.0f, 0.234f, -0.152f, 0.395f, -0.384f, 0.395f)
                lineTo(3.924f, 20.601f)
                curveTo(2.844f, 20.6f, 2.0f, 19.728f, 2.0f, 18.62f)
                lineTo(2.0f, 6.75f)
                curveToRelative(0.0f, -1.111f, 0.844f, -1.98f, 1.924f, -1.98f)
                horizontalLineToRelative(4.652f)
                curveTo(8.768f, 3.227f, 10.228f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(20.08f, 5.556f)
                lineTo(3.924f, 5.556f)
                curveToRelative(-0.656f, 0.0f, -1.156f, 0.519f, -1.156f, 1.19f)
                verticalLineToRelative(3.96f)
                horizontalLineToRelative(18.468f)
                verticalLineToRelative(-3.96f)
                curveToRelative(0.0f, -0.675f, -0.504f, -1.19f, -1.156f, -1.19f)
                close()
                moveTo(12.0f, 2.794f)
                curveToRelative(-1.348f, 0.0f, -2.424f, 0.869f, -2.656f, 1.98f)
                horizontalLineToRelative(5.312f)
                curveToRelative(-0.232f, -1.111f, -1.308f, -1.98f, -2.656f, -1.98f)
                close()
            }
        }
        .build()
        return _briefcaseLight!!
    }

private var _briefcaseLight: ImageVector? = null
