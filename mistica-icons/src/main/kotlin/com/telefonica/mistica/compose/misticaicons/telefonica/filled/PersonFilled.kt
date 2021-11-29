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

public val FilledGroup.PersonFilled: ImageVector
    get() {
        if (_personFilled != null) {
            return _personFilled!!
        }
        _personFilled = Builder(name = "PersonFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.304f, 14.048f)
                arcToRelative(1.52f, 1.52f, 0.0f, false, true, -1.079f, 1.857f)
                arcToRelative(1.509f, 1.509f, 0.0f, false, true, -1.196f, -0.168f)
                verticalLineToRelative(4.594f)
                curveToRelative(0.0f, 0.863f, -0.619f, 1.515f, -1.44f, 1.515f)
                curveToRelative(-0.818f, 0.0f, -1.434f, -0.652f, -1.434f, -1.515f)
                verticalLineToRelative(-4.454f)
                horizontalLineToRelative(-0.28f)
                verticalLineToRelative(4.454f)
                curveToRelative(0.0f, 0.865f, -0.597f, 1.493f, -1.415f, 1.493f)
                curveToRelative(-0.823f, 0.0f, -1.445f, -0.642f, -1.445f, -1.493f)
                verticalLineToRelative(-4.594f)
                lineToRelative(-0.04f, 0.025f)
                arcToRelative(1.521f, 1.521f, 0.0f, false, true, -1.162f, 0.14f)
                arcToRelative(1.516f, 1.516f, 0.0f, false, true, -1.072f, -1.851f)
                lineToRelative(1.154f, -4.21f)
                arcToRelative(0.885f, 0.885f, 0.0f, false, true, 0.047f, -0.146f)
                curveToRelative(0.286f, -1.294f, 1.46f, -2.23f, 2.801f, -2.23f)
                horizontalLineToRelative(2.563f)
                curveToRelative(1.342f, 0.0f, 2.513f, 0.933f, 2.799f, 2.224f)
                arcToRelative(0.85f, 0.85f, 0.0f, false, true, 0.059f, 0.188f)
                curveToRelative(0.0f, 0.006f, 1.14f, 4.171f, 1.14f, 4.171f)
                close()
                moveTo(11.777f, 7.118f)
                curveToRelative(-1.563f, 0.0f, -2.499f, -0.927f, -2.499f, -2.476f)
                curveToRelative(0.0f, -0.793f, 0.23f, -1.415f, 0.684f, -1.849f)
                curveToRelative(0.44f, -0.42f, 1.05f, -0.633f, 1.815f, -0.633f)
                curveToRelative(0.767f, 0.0f, 1.378f, 0.213f, 1.815f, 0.63f)
                curveToRelative(0.454f, 0.434f, 0.686f, 1.056f, 0.686f, 1.849f)
                curveToRelative(0.0f, 1.552f, -0.932f, 2.476f, -2.501f, 2.479f)
                close()
            }
        }
        .build()
        return _personFilled!!
    }

private var _personFilled: ImageVector? = null
