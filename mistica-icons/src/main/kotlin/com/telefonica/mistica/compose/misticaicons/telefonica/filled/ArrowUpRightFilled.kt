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

public val FilledGroup.ArrowUpRightFilled: ImageVector
    get() {
        if (_arrowUpRightFilled != null) {
            return _arrowUpRightFilled!!
        }
        _arrowUpRightFilled = Builder(name = "ArrowUpRightFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.28f, 20.588f)
                horizontalLineToRelative(-0.022f)
                curveToRelative(-0.394f, -0.006f, -0.778f, -0.196f, -1.142f, -0.56f)
                lineToRelative(-5.048f, -5.025f)
                lineToRelative(-0.017f, -0.017f)
                curveToRelative(-0.32f, -0.348f, -0.44f, -0.709f, -0.361f, -1.079f)
                curveToRelative(0.073f, -0.336f, 0.302f, -0.605f, 0.52f, -0.823f)
                lineToRelative(0.015f, -0.014f)
                lineToRelative(5.118f, -4.812f)
                lineToRelative(-2.58f, -2.58f)
                lineToRelative(-0.009f, -0.009f)
                curveToRelative(-0.316f, -0.33f, -0.409f, -0.893f, -0.218f, -1.339f)
                curveToRelative(0.176f, -0.414f, 0.566f, -0.66f, 1.039f, -0.66f)
                horizontalLineToRelative(12.09f)
                curveToRelative(0.28f, -0.02f, 0.532f, 0.07f, 0.717f, 0.254f)
                curveToRelative(0.185f, 0.185f, 0.274f, 0.44f, 0.252f, 0.717f)
                lineToRelative(-0.006f, 12.146f)
                curveToRelative(0.011f, 0.415f, -0.232f, 0.793f, -0.613f, 0.955f)
                curveToRelative(-0.457f, 0.205f, -1.05f, 0.112f, -1.406f, -0.216f)
                lineToRelative(-0.017f, -0.014f)
                lineToRelative(-2.376f, -2.378f)
                lineToRelative(-4.79f, 4.905f)
                lineToRelative(-0.005f, 0.006f)
                curveToRelative(-0.359f, 0.361f, -0.742f, 0.543f, -1.14f, 0.543f)
                close()
            }
        }
        .build()
        return _arrowUpRightFilled!!
    }

private var _arrowUpRightFilled: ImageVector? = null
