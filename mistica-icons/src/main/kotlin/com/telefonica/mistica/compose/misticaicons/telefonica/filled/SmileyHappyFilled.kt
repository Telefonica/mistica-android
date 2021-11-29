package com.telefonica.mistica.compose.misticaicons.telefonica.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.telefonica.FilledGroup

public val FilledGroup.SmileyHappyFilled: ImageVector
    get() {
        if (_smileyHappyFilled != null) {
            return _smileyHappyFilled!!
        }
        _smileyHappyFilled = Builder(name = "SmileyHappyFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.84f, 2.0f)
                curveToRelative(6.219f, 0.0f, 9.846f, 3.14f, 9.846f, 9.846f)
                curveToRelative(0.0f, 6.706f, -3.627f, 9.84f, -9.846f, 9.84f)
                curveToRelative(-6.218f, 0.0f, -9.84f, -3.134f, -9.84f, -9.84f)
                curveTo(2.0f, 5.14f, 5.622f, 2.0f, 11.84f, 2.0f)
                close()
                moveTo(17.0f, 13.613f)
                curveToRelative(-0.02f, 0.02f, -1.927f, 2.076f, -5.123f, 2.11f)
                curveToRelative(-0.031f, 0.0f, -3.236f, 0.115f, -5.188f, -2.07f)
                arcToRelative(0.613f, 0.613f, 0.0f, true, false, -0.916f, 0.818f)
                curveToRelative(2.09f, 2.339f, 5.247f, 2.481f, 5.983f, 2.481f)
                curveToRelative(0.087f, 0.0f, 0.14f, -0.002f, 0.154f, -0.002f)
                curveToRelative(3.734f, -0.042f, 5.914f, -2.415f, 6.003f, -2.516f)
                arcToRelative(0.615f, 0.615f, 0.0f, false, false, -0.913f, -0.82f)
                close()
                moveTo(8.857f, 10.393f)
                curveToRelative(0.356f, 0.0f, 0.653f, -0.113f, 0.86f, -0.323f)
                curveToRelative(0.205f, -0.207f, 0.305f, -0.493f, 0.305f, -0.846f)
                curveToRelative(0.0f, -0.723f, -0.448f, -1.17f, -1.165f, -1.17f)
                curveToRelative(-0.72f, 0.0f, -1.165f, 0.447f, -1.165f, 1.17f)
                curveToRelative(0.0f, 0.353f, 0.104f, 0.639f, 0.305f, 0.846f)
                curveToRelative(0.207f, 0.207f, 0.504f, 0.322f, 0.86f, 0.322f)
                close()
                moveTo(14.829f, 10.393f)
                curveToRelative(0.356f, 0.0f, 0.653f, -0.113f, 0.86f, -0.326f)
                curveToRelative(0.202f, -0.207f, 0.305f, -0.493f, 0.305f, -0.846f)
                curveToRelative(0.0f, -0.722f, -0.448f, -1.17f, -1.165f, -1.17f)
                curveToRelative(-0.72f, 0.0f, -1.165f, 0.448f, -1.165f, 1.17f)
                curveToRelative(0.0f, 0.353f, 0.104f, 0.639f, 0.308f, 0.846f)
                curveToRelative(0.204f, 0.21f, 0.501f, 0.325f, 0.857f, 0.325f)
                close()
            }
        }
        .build()
        return _smileyHappyFilled!!
    }

private var _smileyHappyFilled: ImageVector? = null
