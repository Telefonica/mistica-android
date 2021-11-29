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

public val FilledGroup.AlertFilled: ImageVector
    get() {
        if (_alertFilled != null) {
            return _alertFilled!!
        }
        _alertFilled = Builder(name = "AlertFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.892f, 19.877f)
                lineTo(12.656f, 3.374f)
                arcTo(0.804f, 0.804f, 0.0f, false, false, 12.0f, 3.0f)
                curveToRelative(-0.256f, 0.0f, -0.545f, 0.149f, -0.656f, 0.374f)
                lineTo(2.108f, 19.877f)
                arcToRelative(0.702f, 0.702f, 0.0f, false, false, 0.0f, 0.749f)
                curveToRelative(0.145f, 0.225f, 0.363f, 0.374f, 0.62f, 0.374f)
                horizontalLineToRelative(18.545f)
                arcToRelative(0.702f, 0.702f, 0.0f, false, false, 0.619f, -0.374f)
                curveToRelative(0.144f, -0.221f, 0.144f, -0.485f, 0.0f, -0.75f)
                close()
                moveTo(11.455f, 9.227f)
                curveToRelative(0.0f, -0.297f, 0.256f, -0.561f, 0.545f, -0.561f)
                curveToRelative(0.289f, 0.0f, 0.545f, 0.264f, 0.545f, 0.561f)
                verticalLineToRelative(5.776f)
                curveToRelative(0.0f, 0.298f, -0.256f, 0.562f, -0.545f, 0.562f)
                curveToRelative(-0.289f, 0.0f, -0.545f, -0.264f, -0.545f, -0.562f)
                verticalLineTo(9.227f)
                close()
                moveTo(12.0f, 18.604f)
                curveToRelative(-0.507f, 0.0f, -0.908f, -0.413f, -0.908f, -0.936f)
                curveToRelative(0.0f, -0.523f, 0.4f, -0.936f, 0.908f, -0.936f)
                curveToRelative(0.507f, 0.0f, 0.908f, 0.413f, 0.908f, 0.936f)
                curveToRelative(0.0f, 0.523f, -0.4f, 0.936f, -0.908f, 0.936f)
                close()
            }
        }
        .build()
        return _alertFilled!!
    }

private var _alertFilled: ImageVector? = null
