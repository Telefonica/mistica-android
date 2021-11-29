package com.telefonica.mistica.compose.misticaicons.o2.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.o2.FilledGroup

public val FilledGroup.CloudSereyeFilled: ImageVector
    get() {
        if (_cloudSereyeFilled != null) {
            return _cloudSereyeFilled!!
        }
        _cloudSereyeFilled = Builder(name = "CloudSereyeFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.32f, 15.57f)
                curveToRelative(-0.692f, 0.0f, -1.282f, 0.466f, -1.561f, 1.069f)
                horizontalLineToRelative(-4.19f)
                curveToRelative(-0.173f, -0.393f, -0.452f, -0.75f, -0.864f, -0.928f)
                verticalLineTo(14.14f)
                horizontalLineToRelative(3.462f)
                curveToRelative(2.288f, 0.0f, 4.159f, -1.929f, 4.159f, -4.32f)
                curveToRelative(0.0f, -2.32f, -1.942f, -4.286f, -4.225f, -4.318f)
                curveTo(15.719f, 3.504f, 14.02f, 2.0f, 11.978f, 2.0f)
                curveTo(9.934f, 2.0f, 8.236f, 3.5f, 7.855f, 5.5f)
                curveToRelative(-2.288f, 0.037f, -4.159f, 1.966f, -4.159f, 4.32f)
                reflectiveCurveToRelative(1.871f, 4.319f, 4.19f, 4.319f)
                horizontalLineToRelative(3.431f)
                verticalLineToRelative(1.609f)
                arcToRelative(1.774f, 1.774f, 0.0f, false, false, -0.864f, 0.89f)
                horizontalLineTo(6.294f)
                curveToRelative(-0.275f, -0.643f, -0.864f, -1.069f, -1.56f, -1.069f)
                curveToRelative(-0.936f, 0.0f, -1.734f, 0.823f, -1.734f, 1.787f)
                curveToRelative(0.0f, 0.713f, 0.452f, 1.321f, 1.037f, 1.61f)
                verticalLineToRelative(2.321f)
                curveToRelative(0.0f, 0.393f, 0.31f, 0.713f, 0.692f, 0.713f)
                curveToRelative(0.381f, 0.0f, 0.692f, -0.32f, 0.692f, -0.713f)
                verticalLineToRelative(-2.322f)
                curveToRelative(0.38f, -0.178f, 0.691f, -0.498f, 0.864f, -0.891f)
                horizontalLineToRelative(4.19f)
                curveToRelative(0.173f, 0.393f, 0.483f, 0.713f, 0.833f, 0.891f)
                verticalLineToRelative(2.322f)
                curveToRelative(0.0f, 0.393f, 0.31f, 0.713f, 0.692f, 0.713f)
                curveToRelative(0.381f, 0.0f, 0.691f, -0.32f, 0.691f, -0.713f)
                verticalLineToRelative(-2.322f)
                curveToRelative(0.382f, -0.178f, 0.692f, -0.498f, 0.865f, -0.891f)
                horizontalLineToRelative(4.19f)
                curveToRelative(0.172f, 0.393f, 0.483f, 0.713f, 0.833f, 0.891f)
                verticalLineToRelative(2.322f)
                curveToRelative(0.0f, 0.393f, 0.31f, 0.713f, 0.692f, 0.713f)
                curveToRelative(0.38f, 0.0f, 0.691f, -0.32f, 0.691f, -0.713f)
                verticalLineToRelative(-2.322f)
                arcTo(1.715f, 1.715f, 0.0f, false, false, 21.0f, 17.356f)
                curveToRelative(0.017f, -0.964f, -0.745f, -1.787f, -1.68f, -1.787f)
                close()
            }
        }
        .build()
        return _cloudSereyeFilled!!
    }

private var _cloudSereyeFilled: ImageVector? = null
