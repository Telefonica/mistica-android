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

public val FilledGroup.ClipFilled: ImageVector
    get() {
        if (_clipFilled != null) {
            return _clipFilled!!
        }
        _clipFilled = Builder(name = "ClipFilled", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.063f, 5.542f)
                arcToRelative(0.808f, 0.808f, 0.0f, false, false, -0.818f, 0.798f)
                lineToRelative(-0.011f, 11.09f)
                curveToRelative(0.0f, 1.913f, -0.913f, 2.804f, -2.868f, 2.804f)
                curveToRelative(-1.958f, 0.0f, -2.872f, -0.89f, -2.872f, -2.804f)
                verticalLineTo(5.44f)
                curveToRelative(0.0f, -1.185f, 0.516f, -1.69f, 1.729f, -1.69f)
                reflectiveCurveToRelative(1.728f, 0.505f, 1.728f, 1.692f)
                lineToRelative(0.025f, 11.356f)
                curveToRelative(0.0f, 0.373f, -0.078f, 0.448f, -0.46f, 0.448f)
                curveToRelative(-0.38f, 0.0f, -0.456f, -0.075f, -0.456f, -0.448f)
                verticalLineTo(6.394f)
                arcToRelative(0.812f, 0.812f, 0.0f, false, false, -0.818f, -0.801f)
                arcToRelative(0.81f, 0.81f, 0.0f, false, false, -0.818f, 0.798f)
                verticalLineToRelative(10.403f)
                curveToRelative(0.0f, 1.264f, 0.801f, 2.048f, 2.096f, 2.048f)
                curveToRelative(1.29f, 0.0f, 2.095f, -0.784f, 2.095f, -2.048f)
                lineTo(14.59f, 5.44f)
                curveToRelative(-0.003f, -2.06f, -1.26f, -3.289f, -3.367f, -3.289f)
                reflectiveCurveTo(7.859f, 3.38f, 7.859f, 5.439f)
                verticalLineTo(17.43f)
                curveToRelative(0.0f, 2.798f, 1.641f, 4.406f, 4.507f, 4.406f)
                curveToRelative(2.862f, 0.0f, 4.504f, -1.605f, 4.504f, -4.403f)
                lineToRelative(0.011f, -11.09f)
                arcToRelative(0.81f, 0.81f, 0.0f, false, false, -0.818f, -0.8f)
            }
        }
        .build()
        return _clipFilled!!
    }

private var _clipFilled: ImageVector? = null
