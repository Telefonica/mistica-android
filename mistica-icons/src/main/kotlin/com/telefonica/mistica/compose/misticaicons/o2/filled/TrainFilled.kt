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

public val FilledGroup.TrainFilled: ImageVector
    get() {
        if (_trainFilled != null) {
            return _trainFilled!!
        }
        _trainFilled = Builder(name = "TrainFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.241f, 19.091f)
                lineTo(16.093f, 22.0f)
                lineTo(6.898f, 22.0f)
                lineToRelative(2.86f, -2.909f)
                horizontalLineToRelative(3.483f)
                close()
                moveTo(19.0f, 9.638f)
                lineTo(19.0f, 22.0f)
                horizontalLineToRelative(-1.399f)
                curveToRelative(-0.004f, -0.005f, -0.009f, -0.014f, -0.013f, -0.023f)
                lineToRelative(-2.834f, -2.89f)
                arcTo(1.804f, 1.804f, 0.0f, false, false, 16.5f, 17.27f)
                verticalLineToRelative(-0.465f)
                arcToRelative(1.066f, 1.066f, 0.0f, false, true, -0.713f, 0.284f)
                arcToRelative(1.08f, 1.08f, 0.0f, false, true, -1.07f, -1.09f)
                curveToRelative(0.0f, -0.6f, 0.48f, -1.089f, 1.07f, -1.089f)
                curveToRelative(0.274f, 0.0f, 0.526f, 0.107f, 0.713f, 0.284f)
                lineTo(16.5f, 13.46f)
                horizontalLineToRelative(-10.0f)
                verticalLineToRelative(1.736f)
                curveToRelative(0.192f, -0.172f, 0.439f, -0.284f, 0.713f, -0.284f)
                curveToRelative(0.59f, 0.0f, 1.07f, 0.489f, 1.07f, 1.09f)
                curveToRelative(0.0f, 0.6f, -0.48f, 1.089f, -1.07f, 1.089f)
                curveToRelative(-0.274f, 0.0f, -0.526f, -0.107f, -0.713f, -0.284f)
                verticalLineToRelative(0.465f)
                curveToRelative(0.0f, 0.987f, 0.782f, 1.792f, 1.746f, 1.815f)
                lineToRelative(-2.843f, 2.89f)
                arcTo(0.102f, 0.102f, 0.0f, false, false, 5.39f, 22.0f)
                lineTo(4.0f, 22.0f)
                lineTo(4.0f, 9.638f)
                curveTo(4.0f, 5.426f, 7.364f, 2.0f, 11.5f, 2.0f)
                reflectiveCurveTo(19.0f, 5.426f, 19.0f, 9.638f)
                close()
                moveTo(16.5f, 12.365f)
                lineTo(16.5f, 8.912f)
                curveToRelative(0.0f, -1.0f, -0.8f, -1.82f, -1.787f, -1.82f)
                lineTo(8.287f, 7.092f)
                curveToRelative(-0.983f, 0.0f, -1.787f, 0.814f, -1.787f, 1.82f)
                verticalLineToRelative(3.453f)
                horizontalLineToRelative(10.0f)
                close()
            }
        }
        .build()
        return _trainFilled!!
    }

private var _trainFilled: ImageVector? = null
