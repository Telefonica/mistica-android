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

public val FilledGroup.HomeFilled: ImageVector
    get() {
        if (_homeFilled != null) {
            return _homeFilled!!
        }
        _homeFilled = Builder(name = "HomeFilled", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.263f, 10.555f)
                lineTo(13.006f, 2.44f)
                curveToRelative(-0.597f, -0.586f, -1.726f, -0.586f, -2.325f, 0.0f)
                lineToRelative(-8.258f, 8.117f)
                arcToRelative(1.326f, 1.326f, 0.0f, false, false, -0.311f, 1.502f)
                curveToRelative(0.24f, 0.552f, 0.818f, 0.907f, 1.47f, 0.907f)
                horizontalLineToRelative(0.611f)
                verticalLineToRelative(7.283f)
                curveToRelative(0.0f, 0.793f, 0.709f, 1.437f, 1.583f, 1.437f)
                horizontalLineToRelative(3.11f)
                curveToRelative(0.229f, 0.006f, 0.422f, -0.18f, 0.425f, -0.409f)
                verticalLineToRelative(-4.045f)
                horizontalLineToRelative(5.112f)
                verticalLineToRelative(4.045f)
                arcToRelative(0.42f, 0.42f, 0.0f, false, false, 0.426f, 0.412f)
                horizontalLineToRelative(2.938f)
                curveToRelative(0.874f, 0.0f, 1.583f, -0.644f, 1.583f, -1.437f)
                verticalLineToRelative(-7.283f)
                horizontalLineToRelative(0.728f)
                curveToRelative(0.653f, 0.0f, 1.232f, -0.356f, 1.47f, -0.907f)
                curveToRelative(0.23f, -0.521f, 0.113f, -1.098f, -0.305f, -1.507f)
            }
        }
        .build()
        return _homeFilled!!
    }

private var _homeFilled: ImageVector? = null
