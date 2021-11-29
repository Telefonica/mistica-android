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

public val FilledGroup.LikeFilled: ImageVector
    get() {
        if (_likeFilled != null) {
            return _likeFilled!!
        }
        _likeFilled = Builder(name = "LikeFilled", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.107f, 5.404f)
                lineToRelative(0.64f, -2.193f)
                curveToRelative(0.191f, -0.72f, 0.868f, -1.211f, 1.68f, -1.211f)
                curveToRelative(0.942f, 0.0f, 1.788f, 0.803f, 1.788f, 1.794f)
                lineToRelative(-0.179f, 1.253f)
                lineToRelative(-0.89f, 3.046f)
                horizontalLineToRelative(5.711f)
                arcToRelative(2.15f, 2.15f, 0.0f, false, true, 1.394f, 3.78f)
                arcToRelative(2.151f, 2.151f, 0.0f, false, true, -1.188f, 3.313f)
                curveToRelative(0.096f, 0.248f, 0.155f, 0.515f, 0.155f, 0.794f)
                curveToRelative(0.0f, 0.992f, -0.672f, 1.827f, -1.581f, 2.074f)
                curveToRelative(0.096f, 0.248f, 0.155f, 0.514f, 0.155f, 0.794f)
                arcTo(2.15f, 2.15f, 0.0f, false, true, 16.65f, 21.0f)
                horizontalLineToRelative(-6.077f)
                curveToRelative(-0.854f, 0.0f, -1.713f, -0.349f, -2.29f, -0.927f)
                curveToRelative(-0.31f, -0.312f, -0.799f, -0.505f, -1.279f, -0.505f)
                horizontalLineTo(2.0f)
                verticalLineTo(9.167f)
                horizontalLineToRelative(4.999f)
                curveToRelative(0.192f, 0.0f, 0.37f, -0.074f, 0.507f, -0.211f)
                lineToRelative(3.6f, -3.552f)
                close()
            }
        }
        .build()
        return _likeFilled!!
    }

private var _likeFilled: ImageVector? = null
