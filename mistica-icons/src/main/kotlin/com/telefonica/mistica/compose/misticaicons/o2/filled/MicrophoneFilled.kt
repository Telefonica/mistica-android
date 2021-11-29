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

public val FilledGroup.MicrophoneFilled: ImageVector
    get() {
        if (_microphoneFilled != null) {
            return _microphoneFilled!!
        }
        _microphoneFilled = Builder(name = "MicrophoneFilled", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.277f, 21.26f)
                curveToRelative(0.0f, 0.408f, -0.33f, 0.74f, -0.733f, 0.74f)
                horizontalLineTo(8.47f)
                arcToRelative(0.737f, 0.737f, 0.0f, false, true, -0.733f, -0.74f)
                curveToRelative(0.0f, -0.407f, 0.33f, -0.74f, 0.733f, -0.74f)
                horizontalLineToRelative(3.302f)
                verticalLineToRelative(-0.796f)
                curveTo(9.085f, 19.359f, 7.0f, 17.036f, 7.0f, 14.224f)
                curveToRelative(0.0f, -0.408f, 0.329f, -0.74f, 0.733f, -0.74f)
                curveToRelative(0.404f, 0.0f, 0.732f, 0.332f, 0.732f, 0.74f)
                curveToRelative(0.0f, 2.247f, 1.813f, 4.073f, 4.035f, 4.073f)
                curveToRelative(2.222f, 0.0f, 4.035f, -1.83f, 4.035f, -4.073f)
                curveToRelative(0.0f, -0.408f, 0.328f, -0.74f, 0.732f, -0.74f)
                curveToRelative(0.404f, 0.0f, 0.733f, 0.332f, 0.733f, 0.74f)
                curveToRelative(0.0f, 2.812f, -2.08f, 5.135f, -4.772f, 5.5f)
                verticalLineToRelative(0.797f)
                horizontalLineToRelative(3.302f)
                arcToRelative(0.74f, 0.74f, 0.0f, false, true, 0.747f, 0.74f)
                close()
                moveTo(9.02f, 14.04f)
                verticalLineToRelative(-8.52f)
                curveTo(9.02f, 3.545f, 10.55f, 2.0f, 12.505f, 2.0f)
                curveToRelative(1.954f, 0.0f, 3.485f, 1.546f, 3.485f, 3.518f)
                verticalLineToRelative(8.52f)
                curveToRelative(0.0f, 1.973f, -1.531f, 3.52f, -3.485f, 3.52f)
                reflectiveCurveTo(9.02f, 16.01f, 9.02f, 14.037f)
                close()
            }
        }
        .build()
        return _microphoneFilled!!
    }

private var _microphoneFilled: ImageVector? = null
