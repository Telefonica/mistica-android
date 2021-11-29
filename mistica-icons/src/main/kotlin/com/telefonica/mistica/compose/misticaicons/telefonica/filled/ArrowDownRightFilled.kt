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

public val FilledGroup.ArrowDownRightFilled: ImageVector
    get() {
        if (_arrowDownRightFilled != null) {
            return _arrowDownRightFilled!!
        }
        _arrowDownRightFilled = Builder(name = "ArrowDownRightFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.675f, 10.289f)
                verticalLineToRelative(-0.023f)
                curveToRelative(0.006f, -0.395f, 0.193f, -0.779f, 0.56f, -1.143f)
                lineToRelative(5.026f, -5.047f)
                lineToRelative(0.016f, -0.017f)
                curveToRelative(0.348f, -0.32f, 0.709f, -0.44f, 1.079f, -0.362f)
                curveToRelative(0.336f, 0.073f, 0.605f, 0.303f, 0.823f, 0.521f)
                lineToRelative(0.014f, 0.014f)
                lineToRelative(4.813f, 5.115f)
                lineToRelative(2.58f, -2.58f)
                lineToRelative(0.008f, -0.008f)
                curveToRelative(0.33f, -0.316f, 0.893f, -0.409f, 1.339f, -0.218f)
                curveToRelative(0.414f, 0.176f, 0.66f, 0.565f, 0.66f, 1.039f)
                verticalLineToRelative(12.09f)
                curveToRelative(0.02f, 0.28f, -0.07f, 0.532f, -0.254f, 0.717f)
                arcToRelative(0.894f, 0.894f, 0.0f, false, true, -0.717f, 0.252f)
                lineToRelative(-12.146f, -0.006f)
                arcToRelative(1.009f, 1.009f, 0.0f, false, true, -0.955f, -0.613f)
                curveToRelative(-0.204f, -0.457f, -0.112f, -1.05f, 0.216f, -1.407f)
                lineToRelative(0.014f, -0.016f)
                lineToRelative(2.378f, -2.379f)
                lineToRelative(-4.905f, -4.79f)
                lineToRelative(-0.006f, -0.005f)
                curveToRelative(-0.36f, -0.353f, -0.543f, -0.737f, -0.543f, -1.134f)
                close()
            }
        }
        .build()
        return _arrowDownRightFilled!!
    }

private var _arrowDownRightFilled: ImageVector? = null
