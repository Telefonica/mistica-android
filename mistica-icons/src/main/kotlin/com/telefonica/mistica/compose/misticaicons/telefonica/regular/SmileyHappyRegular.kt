package com.telefonica.mistica.compose.misticaicons.telefonica.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.telefonica.RegularGroup

public val RegularGroup.SmileyHappyRegular: ImageVector
    get() {
        if (_smileyHappyRegular != null) {
            return _smileyHappyRegular!!
        }
        _smileyHappyRegular = Builder(name = "SmileyHappyRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 13.613f)
                arcToRelative(0.614f, 0.614f, 0.0f, false, true, 0.913f, 0.824f)
                curveToRelative(-0.092f, 0.1f, -2.269f, 2.473f, -6.003f, 2.515f)
                curveToRelative(-0.014f, 0.0f, -0.067f, 0.003f, -0.154f, 0.003f)
                curveToRelative(-0.736f, 0.0f, -3.893f, -0.143f, -5.983f, -2.482f)
                arcToRelative(0.613f, 0.613f, 0.0f, true, true, 0.916f, -0.818f)
                curveToRelative(1.952f, 2.183f, 5.157f, 2.07f, 5.188f, 2.07f)
                curveToRelative(3.196f, -0.039f, 5.103f, -2.092f, 5.123f, -2.112f)
                close()
                moveTo(11.84f, 20.457f)
                curveToRelative(5.796f, 0.0f, 8.617f, -2.818f, 8.617f, -8.611f)
                curveToRelative(0.0f, -5.796f, -2.818f, -8.614f, -8.617f, -8.614f)
                curveToRelative(-5.792f, 0.0f, -8.61f, 2.818f, -8.61f, 8.614f)
                curveToRelative(0.0f, 5.793f, 2.818f, 8.61f, 8.61f, 8.61f)
                close()
                moveTo(11.84f, 2.0f)
                curveToRelative(6.219f, 0.0f, 9.846f, 3.14f, 9.846f, 9.846f)
                curveToRelative(0.0f, 6.706f, -3.627f, 9.84f, -9.846f, 9.84f)
                curveToRelative(-6.218f, 0.0f, -9.84f, -3.134f, -9.84f, -9.84f)
                curveTo(2.0f, 5.14f, 5.622f, 2.0f, 11.84f, 2.0f)
                close()
                moveTo(8.857f, 10.392f)
                curveToRelative(-0.356f, 0.0f, -0.653f, -0.112f, -0.86f, -0.322f)
                curveToRelative(-0.204f, -0.207f, -0.305f, -0.493f, -0.305f, -0.846f)
                curveToRelative(0.0f, -0.723f, 0.448f, -1.17f, 1.165f, -1.17f)
                curveToRelative(0.72f, 0.0f, 1.165f, 0.447f, 1.165f, 1.17f)
                curveToRelative(0.0f, 0.356f, -0.103f, 0.639f, -0.305f, 0.846f)
                curveToRelative(-0.207f, 0.207f, -0.504f, 0.322f, -0.86f, 0.322f)
                close()
                moveTo(14.829f, 10.392f)
                curveToRelative(-0.356f, 0.0f, -0.653f, -0.112f, -0.86f, -0.322f)
                curveToRelative(-0.204f, -0.207f, -0.308f, -0.493f, -0.308f, -0.846f)
                curveToRelative(0.0f, -0.723f, 0.448f, -1.17f, 1.165f, -1.17f)
                curveToRelative(0.72f, 0.0f, 1.166f, 0.447f, 1.166f, 1.17f)
                curveToRelative(0.0f, 0.353f, -0.104f, 0.639f, -0.306f, 0.846f)
                curveToRelative(-0.204f, 0.207f, -0.501f, 0.322f, -0.857f, 0.322f)
                close()
            }
        }
        .build()
        return _smileyHappyRegular!!
    }

private var _smileyHappyRegular: ImageVector? = null
