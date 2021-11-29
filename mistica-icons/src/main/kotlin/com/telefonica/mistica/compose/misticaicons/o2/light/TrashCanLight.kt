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

public val LightGroup.TrashCanLight: ImageVector
    get() {
        if (_trashCanLight != null) {
            return _trashCanLight!!
        }
        _trashCanLight = Builder(name = "TrashCanLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.112f, 1.0f)
                curveToRelative(1.037f, 0.0f, 1.85f, 0.823f, 1.85f, 1.874f)
                verticalLineToRelative(0.752f)
                horizontalLineToRelative(6.669f)
                curveToRelative(0.224f, 0.0f, 0.369f, 0.155f, 0.369f, 0.378f)
                curveToRelative(0.0f, 0.222f, -0.145f, 0.373f, -0.37f, 0.373f)
                lineTo(4.96f, 4.377f)
                verticalLineToRelative(15.754f)
                curveToRelative(0.0f, 0.638f, 0.48f, 1.125f, 1.112f, 1.125f)
                horizontalLineToRelative(11.854f)
                curveToRelative(0.631f, 0.0f, 1.112f, -0.487f, 1.112f, -1.125f)
                lineTo(19.038f, 8.503f)
                curveToRelative(0.0f, -0.223f, 0.146f, -0.374f, 0.37f, -0.374f)
                curveToRelative(0.22f, 0.0f, 0.369f, 0.147f, 0.369f, 0.374f)
                verticalLineToRelative(11.623f)
                curveToRelative(0.0f, 1.05f, -0.813f, 1.874f, -1.85f, 1.874f)
                lineTo(6.07f, 22.0f)
                curveToRelative(-1.038f, 0.0f, -1.851f, -0.823f, -1.851f, -1.874f)
                lineTo(4.219f, 4.373f)
                lineTo(2.37f, 4.373f)
                curveTo(2.15f, 4.373f, 2.0f, 4.222f, 2.0f, 4.0f)
                curveToRelative(0.0f, -0.222f, 0.145f, -0.373f, 0.37f, -0.373f)
                horizontalLineToRelative(6.667f)
                verticalLineToRelative(-0.752f)
                curveToRelative(0.0f, -1.05f, 0.814f, -1.874f, 1.851f, -1.874f)
                close()
                moveTo(14.593f, 7.003f)
                curveToRelative(0.22f, 0.0f, 0.37f, 0.147f, 0.37f, 0.374f)
                verticalLineToRelative(10.876f)
                curveToRelative(0.0f, 0.222f, -0.15f, 0.374f, -0.37f, 0.374f)
                reflectiveCurveToRelative(-0.369f, -0.147f, -0.369f, -0.374f)
                lineTo(14.224f, 7.377f)
                curveToRelative(0.0f, -0.227f, 0.15f, -0.374f, 0.37f, -0.374f)
                close()
                moveTo(9.407f, 7.003f)
                curveToRelative(0.22f, 0.0f, 0.369f, 0.147f, 0.369f, 0.374f)
                verticalLineToRelative(10.876f)
                curveToRelative(0.0f, 0.222f, -0.15f, 0.374f, -0.37f, 0.374f)
                reflectiveCurveToRelative(-0.369f, -0.147f, -0.369f, -0.374f)
                lineTo(9.037f, 7.377f)
                curveToRelative(0.0f, -0.227f, 0.15f, -0.374f, 0.37f, -0.374f)
                close()
                moveTo(19.41f, 5.499f)
                curveToRelative(0.41f, 0.0f, 0.743f, 0.337f, 0.743f, 0.752f)
                arcToRelative(0.747f, 0.747f, 0.0f, false, true, -0.743f, 0.752f)
                arcToRelative(0.747f, 0.747f, 0.0f, false, true, -0.743f, -0.752f)
                curveToRelative(0.0f, -0.415f, 0.333f, -0.752f, 0.743f, -0.752f)
                close()
                moveTo(13.111f, 1.748f)
                horizontalLineToRelative(-2.224f)
                curveToRelative(-0.63f, 0.0f, -1.112f, 0.487f, -1.112f, 1.126f)
                verticalLineToRelative(0.752f)
                horizontalLineToRelative(4.448f)
                verticalLineToRelative(-0.752f)
                curveToRelative(0.0f, -0.639f, -0.481f, -1.126f, -1.112f, -1.126f)
                close()
            }
        }
        .build()
        return _trashCanLight!!
    }

private var _trashCanLight: ImageVector? = null
