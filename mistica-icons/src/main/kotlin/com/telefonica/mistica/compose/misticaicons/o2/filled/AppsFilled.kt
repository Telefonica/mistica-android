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

public val FilledGroup.AppsFilled: ImageVector
    get() {
        if (_appsFilled != null) {
            return _appsFilled!!
        }
        _appsFilled = Builder(name = "AppsFilled", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.31f, 2.0f)
                lineTo(3.926f, 2.0f)
                curveTo(2.865f, 2.0f, 2.0f, 2.864f, 2.0f, 3.925f)
                verticalLineToRelative(5.382f)
                curveToRelative(0.0f, 1.052f, 0.864f, 1.917f, 1.925f, 1.917f)
                horizontalLineToRelative(5.382f)
                curveToRelative(1.06f, 0.0f, 1.925f, -0.865f, 1.925f, -1.925f)
                lineTo(11.232f, 3.925f)
                arcTo(1.932f, 1.932f, 0.0f, false, false, 9.31f, 2.0f)
                close()
                moveTo(20.08f, 2.0f)
                horizontalLineToRelative(-5.387f)
                curveToRelative(-1.06f, 0.0f, -1.925f, 0.864f, -1.925f, 1.925f)
                verticalLineToRelative(5.382f)
                curveToRelative(0.0f, 1.06f, 0.865f, 1.925f, 1.925f, 1.925f)
                horizontalLineToRelative(5.382f)
                curveToRelative(1.06f, 0.0f, 1.925f, -0.865f, 1.925f, -1.925f)
                lineTo(22.0f, 3.925f)
                arcTo(1.932f, 1.932f, 0.0f, false, false, 20.08f, 2.0f)
                close()
                moveTo(9.31f, 12.768f)
                lineTo(3.926f, 12.768f)
                curveToRelative(-1.06f, 0.0f, -1.925f, 0.865f, -1.925f, 1.925f)
                verticalLineToRelative(5.382f)
                curveToRelative(0.0f, 1.053f, 0.864f, 1.917f, 1.925f, 1.917f)
                horizontalLineToRelative(5.382f)
                curveToRelative(1.06f, 0.0f, 1.925f, -0.864f, 1.925f, -1.925f)
                verticalLineToRelative(-5.382f)
                arcToRelative(1.93f, 1.93f, 0.0f, false, false, -1.921f, -1.917f)
                close()
                moveTo(20.08f, 12.768f)
                horizontalLineToRelative(-5.387f)
                curveToRelative(-1.06f, 0.0f, -1.925f, 0.865f, -1.925f, 1.925f)
                verticalLineToRelative(5.382f)
                curveToRelative(0.0f, 1.06f, 0.865f, 1.925f, 1.925f, 1.925f)
                horizontalLineToRelative(5.382f)
                curveToRelative(1.06f, 0.0f, 1.925f, -0.864f, 1.925f, -1.925f)
                verticalLineToRelative(-5.382f)
                arcToRelative(1.932f, 1.932f, 0.0f, false, false, -1.92f, -1.925f)
                close()
            }
        }
        .build()
        return _appsFilled!!
    }

private var _appsFilled: ImageVector? = null
