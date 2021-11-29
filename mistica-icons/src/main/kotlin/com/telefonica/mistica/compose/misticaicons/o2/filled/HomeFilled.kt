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
                moveTo(21.911f, 11.798f)
                lineTo(12.008f, 1.0f)
                lineTo(2.11f, 11.798f)
                arcToRelative(0.357f, 0.357f, 0.0f, false, false, -0.073f, 0.416f)
                curveToRelative(0.073f, 0.151f, 0.18f, 0.227f, 0.325f, 0.227f)
                horizontalLineToRelative(1.785f)
                verticalLineTo(22.0f)
                horizontalLineToRelative(5.716f)
                verticalLineToRelative(-6.75f)
                horizontalLineToRelative(4.287f)
                verticalLineTo(22.0f)
                horizontalLineToRelative(5.716f)
                verticalLineToRelative(-9.563f)
                horizontalLineToRelative(1.785f)
                curveToRelative(0.144f, 0.0f, 0.284f, -0.076f, 0.324f, -0.227f)
                curveToRelative(0.04f, -0.147f, 0.04f, -0.298f, -0.064f, -0.412f)
                close()
            }
        }
        .build()
        return _homeFilled!!
    }

private var _homeFilled: ImageVector? = null
