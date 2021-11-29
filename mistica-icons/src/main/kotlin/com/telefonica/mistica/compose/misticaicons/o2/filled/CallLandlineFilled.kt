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

public val FilledGroup.CallLandlineFilled: ImageVector
    get() {
        if (_callLandlineFilled != null) {
            return _callLandlineFilled!!
        }
        _callLandlineFilled = Builder(name = "CallLandlineFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(20.553f, 4.063f)
                lineToRelative(-1.382f, -1.375f)
                curveToRelative(-0.898f, -0.882f, -2.305f, -0.922f, -3.134f, -0.084f)
                lineToRelative(-2.08f, 2.088f)
                curveToRelative(-0.381f, 0.39f, -0.593f, 0.91f, -0.593f, 1.472f)
                curveToRelative(0.0f, 0.61f, 0.26f, 1.219f, 0.713f, 1.664f)
                lineToRelative(1.455f, 1.43f)
                curveToRelative(0.236f, 0.237f, 0.356f, 0.562f, 0.364f, 0.96f)
                curveToRelative(0.008f, 1.021f, -0.745f, 2.405f, -2.007f, 3.671f)
                curveToRelative(-1.267f, 1.26f, -2.641f, 2.01f, -3.663f, 2.01f)
                horizontalLineToRelative(-0.008f)
                curveToRelative(-0.405f, 0.0f, -0.722f, -0.121f, -0.958f, -0.366f)
                lineToRelative(-1.431f, -1.455f)
                arcToRelative(2.345f, 2.345f, 0.0f, false, false, -1.663f, -0.714f)
                horizontalLineToRelative(-0.008f)
                curveToRelative(-0.561f, 0.0f, -1.074f, 0.213f, -1.455f, 0.594f)
                lineToRelative(-2.1f, 2.084f)
                curveToRelative(-0.838f, 0.83f, -0.797f, 2.233f, 0.088f, 3.136f)
                lineToRelative(1.375f, 1.39f)
                curveToRelative(0.918f, 0.927f, 2.176f, 1.424f, 3.63f, 1.432f)
                horizontalLineToRelative(0.033f)
                curveToRelative(2.793f, 0.0f, 6.188f, -1.78f, 9.326f, -4.9f)
                lineToRelative(0.048f, -0.047f)
                curveToRelative(3.126f, -3.151f, 4.905f, -6.567f, 4.897f, -9.362f)
                curveToRelative(-0.016f, -1.447f, -0.513f, -2.71f, -1.447f, -3.628f)
                close()
            }
        }
        .build()
        return _callLandlineFilled!!
    }

private var _callLandlineFilled: ImageVector? = null
