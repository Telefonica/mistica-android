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

public val FilledGroup.PowerFilled: ImageVector
    get() {
        if (_powerFilled != null) {
            return _powerFilled!!
        }
        _powerFilled = Builder(name = "PowerFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.92f, 3.517f)
                curveToRelative(0.12f, 0.418f, -0.082f, 0.924f, -0.532f, 1.047f)
                curveToRelative(-3.428f, 1.17f, -5.755f, 4.444f, -5.755f, 8.17f)
                curveToRelative(0.0f, 4.735f, 3.754f, 8.594f, 8.37f, 8.594f)
                curveToRelative(4.615f, 0.0f, 8.369f, -3.854f, 8.369f, -8.593f)
                curveToRelative(0.0f, -3.731f, -2.327f, -6.996f, -5.756f, -8.171f)
                curveToRelative(-0.407f, -0.123f, -0.651f, -0.63f, -0.531f, -1.047f)
                curveToRelative(0.12f, -0.418f, 0.613f, -0.669f, 1.02f, -0.546f)
                curveTo(19.227f, 4.353f, 22.0f, 8.291f, 22.0f, 12.735f)
                curveTo(22.0f, 18.389f, 17.509f, 23.0f, 12.002f, 23.0f)
                curveTo(6.492f, 23.0f, 2.0f, 18.393f, 2.0f, 12.735f)
                curveTo(2.0f, 8.29f, 4.777f, 4.353f, 8.9f, 2.97f)
                curveToRelative(0.407f, -0.123f, 0.9f, 0.084f, 1.02f, 0.546f)
                close()
                moveTo(12.001f, 1.0f)
                arcToRelative(0.83f, 0.83f, 0.0f, false, true, 0.814f, 0.836f)
                verticalLineTo(12.73f)
                curveToRelative(0.0f, 0.462f, -0.368f, 0.84f, -0.814f, 0.84f)
                arcToRelative(0.83f, 0.83f, 0.0f, false, true, -0.814f, -0.835f)
                verticalLineTo(1.836f)
                arcTo(0.83f, 0.83f, 0.0f, false, true, 12.002f, 1.0f)
                close()
            }
        }
        .build()
        return _powerFilled!!
    }

private var _powerFilled: ImageVector? = null
