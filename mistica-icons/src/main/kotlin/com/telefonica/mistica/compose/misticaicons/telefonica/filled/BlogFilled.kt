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

public val FilledGroup.BlogFilled: ImageVector
    get() {
        if (_blogFilled != null) {
            return _blogFilled!!
        }
        _blogFilled = Builder(name = "BlogFilled", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.19f, 10.196f)
                arcToRelative(1.985f, 1.985f, 0.0f, false, false, -1.235f, -0.566f)
                arcToRelative(1.793f, 1.793f, 0.0f, false, false, -0.837f, 0.137f)
                verticalLineToRelative(-3.96f)
                curveToRelative(0.0f, -1.14f, -0.314f, -2.107f, -0.93f, -2.76f)
                curveToRelative(-0.656f, -0.694f, -1.605f, -1.044f, -2.818f, -1.044f)
                lineTo(6.75f, 2.003f)
                curveToRelative(-1.212f, 0.0f, -2.162f, 0.35f, -2.817f, 1.045f)
                curveToRelative(-0.616f, 0.652f, -0.93f, 1.619f, -0.93f, 2.759f)
                verticalLineToRelative(12.112f)
                curveToRelative(0.0f, 1.14f, 0.314f, 2.05f, 0.93f, 2.703f)
                curveToRelative(0.655f, 0.694f, 1.602f, 1.045f, 2.818f, 1.045f)
                horizontalLineToRelative(9.619f)
                curveToRelative(1.213f, 0.0f, 2.162f, -0.35f, 2.818f, -1.045f)
                curveToRelative(0.616f, -0.653f, 0.93f, -1.563f, 0.93f, -2.703f)
                verticalLineToRelative(-3.166f)
                curveToRelative(1.044f, -0.93f, 1.932f, -1.722f, 2.067f, -1.854f)
                curveToRelative(0.375f, -0.37f, 0.574f, -0.829f, 0.577f, -1.328f)
                arcToRelative(1.99f, 1.99f, 0.0f, false, false, -0.572f, -1.375f)
                close()
                moveTo(6.807f, 6.202f)
                horizontalLineToRelative(9.563f)
                curveToRelative(0.308f, 0.0f, 0.56f, 0.252f, 0.56f, 0.56f)
                curveToRelative(0.0f, 0.308f, -0.252f, 0.56f, -0.56f, 0.56f)
                lineTo(6.807f, 7.322f)
                arcToRelative(0.562f, 0.562f, 0.0f, false, true, -0.56f, -0.56f)
                curveToRelative(0.0f, -0.308f, 0.252f, -0.56f, 0.56f, -0.56f)
                close()
                moveTo(6.807f, 9.602f)
                horizontalLineToRelative(9.563f)
                curveToRelative(0.308f, 0.0f, 0.56f, 0.252f, 0.56f, 0.56f)
                curveToRelative(0.0f, 0.309f, -0.252f, 0.56f, -0.56f, 0.56f)
                lineTo(6.807f, 10.722f)
                arcToRelative(0.562f, 0.562f, 0.0f, false, true, -0.56f, -0.56f)
                curveToRelative(0.0f, -0.308f, 0.252f, -0.56f, 0.56f, -0.56f)
                close()
                moveTo(6.807f, 13.002f)
                horizontalLineToRelative(9.535f)
                lineToRelative(-1.27f, 1.121f)
                lineTo(6.808f, 14.123f)
                arcToRelative(0.562f, 0.562f, 0.0f, false, true, -0.56f, -0.56f)
                curveToRelative(0.0f, -0.308f, 0.252f, -0.56f, 0.56f, -0.56f)
                close()
                moveTo(12.938f, 17.524f)
                lineTo(6.807f, 17.524f)
                arcToRelative(0.562f, 0.562f, 0.0f, false, true, -0.56f, -0.56f)
                curveToRelative(0.0f, -0.309f, 0.252f, -0.56f, 0.56f, -0.56f)
                horizontalLineToRelative(6.507f)
                lineToRelative(-0.376f, 1.12f)
                close()
                moveTo(21.398f, 12.101f)
                curveToRelative(-0.227f, 0.224f, -3.457f, 3.09f, -5.63f, 5.011f)
                lineToRelative(-1.698f, 0.56f)
                lineToRelative(0.557f, -1.66f)
                curveToRelative(0.914f, -0.808f, 5.342f, -4.718f, 5.65f, -5.026f)
                arcToRelative(0.747f, 0.747f, 0.0f, false, true, 0.594f, -0.24f)
                curveToRelative(0.431f, 0.03f, 0.765f, 0.386f, 0.768f, 0.817f)
                arcToRelative(0.74f, 0.74f, 0.0f, false, true, -0.241f, 0.538f)
                close()
            }
        }
        .build()
        return _blogFilled!!
    }

private var _blogFilled: ImageVector? = null
