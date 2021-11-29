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

public val FilledGroup.PauseFilled: ImageVector
    get() {
        if (_pauseFilled != null) {
            return _pauseFilled!!
        }
        _pauseFilled = Builder(name = "PauseFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.208f, 4.583f)
                curveToRelative(-1.67f, -1.608f, -4.098f, -2.423f, -7.222f, -2.423f)
                curveToRelative(-3.123f, 0.0f, -5.551f, 0.815f, -7.218f, 2.426f)
                curveToRelative(-1.731f, 1.67f, -2.608f, 4.162f, -2.608f, 7.409f)
                curveToRelative(0.0f, 3.246f, 0.877f, 5.736f, 2.608f, 7.406f)
                curveToRelative(1.667f, 1.608f, 4.095f, 2.423f, 7.218f, 2.423f)
                curveToRelative(3.124f, 0.0f, 5.552f, -0.815f, 7.222f, -2.423f)
                curveToRelative(1.73f, -1.67f, 2.61f, -4.16f, 2.61f, -7.406f)
                curveToRelative(0.0f, -3.247f, -0.88f, -5.743f, -2.61f, -7.412f)
                close()
                moveTo(9.782f, 15.804f)
                curveToRelative(0.0f, 0.308f, -0.238f, 0.56f, -0.532f, 0.56f)
                curveToRelative(-0.294f, 0.0f, -0.533f, -0.252f, -0.533f, -0.56f)
                lineTo(8.717f, 8.157f)
                curveToRelative(0.0f, -0.308f, 0.239f, -0.56f, 0.533f, -0.56f)
                curveToRelative(0.294f, 0.0f, 0.532f, 0.252f, 0.532f, 0.56f)
                verticalLineToRelative(7.647f)
                close()
                moveTo(15.272f, 15.813f)
                curveToRelative(0.0f, 0.308f, -0.238f, 0.56f, -0.53f, 0.56f)
                curveToRelative(-0.29f, 0.0f, -0.529f, -0.252f, -0.529f, -0.56f)
                lineTo(14.213f, 8.166f)
                curveToRelative(0.0f, -0.309f, 0.238f, -0.56f, 0.53f, -0.56f)
                curveToRelative(0.29f, 0.0f, 0.529f, 0.251f, 0.529f, 0.56f)
                verticalLineToRelative(7.647f)
                close()
            }
        }
        .build()
        return _pauseFilled!!
    }

private var _pauseFilled: ImageVector? = null
