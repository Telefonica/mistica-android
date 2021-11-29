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

public val FilledGroup.HeadphonesFilled: ImageVector
    get() {
        if (_headphonesFilled != null) {
            return _headphonesFilled!!
        }
        _headphonesFilled = Builder(name = "HeadphonesFilled", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.723f, 11.0f)
                curveToRelative(-0.093f, -5.804f, -2.91f, -9.0f, -7.984f, -9.0f)
                curveToRelative(-5.098f, 0.0f, -7.924f, 3.238f, -7.974f, 9.126f)
                curveToRelative(-1.146f, 0.7f, -1.762f, 2.003f, -1.762f, 3.868f)
                curveToRelative(0.0f, 2.745f, 1.328f, 4.322f, 3.736f, 4.432f)
                lineToRelative(0.275f, 0.008f)
                horizontalLineToRelative(0.106f)
                curveToRelative(1.942f, -0.067f, 2.342f, -1.823f, 2.342f, -4.44f)
                curveToRelative(0.0f, -2.624f, -0.4f, -4.378f, -2.305f, -4.448f)
                arcToRelative(1.799f, 1.799f, 0.0f, false, false, -0.303f, 0.0f)
                curveToRelative(-0.05f, 0.0f, -0.1f, 0.0f, -0.115f, 0.009f)
                arcToRelative(5.102f, 5.102f, 0.0f, false, false, -0.711f, 0.084f)
                curveToRelative(0.185f, -4.883f, 2.431f, -7.364f, 6.711f, -7.364f)
                reflectiveCurveToRelative(6.53f, 2.473f, 6.72f, 7.338f)
                curveToRelative(-0.157f, -0.016f, -0.308f, -0.053f, -0.476f, -0.061f)
                curveToRelative(-0.05f, -0.009f, -0.1f, -0.009f, -0.134f, -0.009f)
                arcToRelative(1.522f, 1.522f, 0.0f, false, false, -0.283f, 0.0f)
                curveToRelative(-1.947f, 0.068f, -2.342f, 1.824f, -2.342f, 4.449f)
                curveToRelative(0.0f, 1.714f, 0.176f, 3.05f, 0.846f, 3.792f)
                curveToRelative(-0.868f, 0.485f, -1.913f, 0.801f, -3.134f, 0.964f)
                curveToRelative(-0.152f, -0.572f, -0.603f, -0.913f, -1.289f, -0.93f)
                curveToRelative(-0.88f, -0.025f, -1.42f, 0.468f, -1.448f, 1.39f)
                curveToRelative(-0.017f, 0.442f, 0.092f, 0.8f, 0.328f, 1.055f)
                curveToRelative(0.232f, 0.255f, 0.585f, 0.41f, 1.028f, 0.418f)
                horizontalLineToRelative(0.067f)
                curveToRelative(0.409f, 0.0f, 0.742f, -0.12f, 0.986f, -0.35f)
                curveToRelative(0.075f, -0.076f, 0.126f, -0.18f, 0.176f, -0.28f)
                curveToRelative(1.88f, -0.197f, 3.446f, -0.751f, 4.659f, -1.637f)
                curveToRelative(0.042f, 0.009f, 0.067f, 0.017f, 0.106f, 0.017f)
                horizontalLineToRelative(0.126f)
                lineToRelative(0.275f, -0.008f)
                curveToRelative(2.406f, -0.112f, 3.736f, -1.69f, 3.736f, -4.431f)
                curveToRelative(0.0f, -1.972f, -0.703f, -3.337f, -1.963f, -3.992f)
            }
        }
        .build()
        return _headphonesFilled!!
    }

private var _headphonesFilled: ImageVector? = null
