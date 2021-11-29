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

public val FilledGroup.SmileySadFilled: ImageVector
    get() {
        if (_smileySadFilled != null) {
            return _smileySadFilled!!
        }
        _smileySadFilled = Builder(name = "SmileySadFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.84f, 2.0f)
                curveToRelative(6.219f, 0.0f, 9.846f, 3.14f, 9.846f, 9.846f)
                curveToRelative(0.0f, 6.706f, -3.627f, 9.84f, -9.846f, 9.84f)
                curveToRelative(-6.218f, 0.0f, -9.84f, -3.134f, -9.84f, -9.84f)
                curveTo(2.0f, 5.14f, 5.622f, 2.0f, 11.84f, 2.0f)
                close()
                moveTo(11.93f, 13.415f)
                curveToRelative(-0.154f, -0.006f, -3.824f, -0.135f, -6.157f, 2.478f)
                arcToRelative(0.613f, 0.613f, 0.0f, false, false, 0.05f, 0.869f)
                arcToRelative(0.613f, 0.613f, 0.0f, false, false, 0.869f, -0.05f)
                curveToRelative(1.941f, -2.171f, 5.157f, -2.065f, 5.207f, -2.07f)
                curveToRelative(3.177f, 0.033f, 5.084f, 2.089f, 5.104f, 2.109f)
                arcToRelative(0.61f, 0.61f, 0.0f, false, false, 0.456f, 0.201f)
                arcToRelative(0.612f, 0.612f, 0.0f, false, false, 0.457f, -1.025f)
                curveToRelative(-0.093f, -0.1f, -2.272f, -2.473f, -5.986f, -2.512f)
                close()
                moveTo(8.857f, 10.392f)
                curveToRelative(0.356f, 0.0f, 0.653f, -0.112f, 0.86f, -0.322f)
                curveToRelative(0.202f, -0.207f, 0.305f, -0.493f, 0.305f, -0.846f)
                curveToRelative(0.0f, -0.723f, -0.448f, -1.17f, -1.165f, -1.17f)
                curveToRelative(-0.72f, 0.0f, -1.165f, 0.447f, -1.165f, 1.17f)
                curveToRelative(0.0f, 0.353f, 0.103f, 0.639f, 0.305f, 0.846f)
                curveToRelative(0.207f, 0.21f, 0.504f, 0.322f, 0.86f, 0.322f)
                close()
                moveTo(14.829f, 10.392f)
                curveToRelative(0.356f, 0.0f, 0.653f, -0.112f, 0.86f, -0.322f)
                curveToRelative(0.204f, -0.207f, 0.308f, -0.493f, 0.308f, -0.846f)
                curveToRelative(0.0f, -0.723f, -0.448f, -1.17f, -1.165f, -1.17f)
                curveToRelative(-0.72f, 0.0f, -1.165f, 0.447f, -1.165f, 1.17f)
                curveToRelative(0.0f, 0.353f, 0.103f, 0.639f, 0.305f, 0.846f)
                curveToRelative(0.202f, 0.21f, 0.499f, 0.322f, 0.857f, 0.322f)
                close()
            }
        }
        .build()
        return _smileySadFilled!!
    }

private var _smileySadFilled: ImageVector? = null
