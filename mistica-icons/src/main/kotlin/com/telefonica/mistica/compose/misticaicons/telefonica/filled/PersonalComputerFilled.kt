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

public val FilledGroup.PersonalComputerFilled: ImageVector
    get() {
        if (_personalComputerFilled != null) {
            return _personalComputerFilled!!
        }
        _personalComputerFilled = Builder(name = "PersonalComputerFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.843f, 6.5f)
                curveToRelative(0.81f, 0.0f, 1.443f, 0.224f, 1.877f, 0.667f)
                curveToRelative(0.423f, 0.428f, 0.636f, 1.039f, 0.636f, 1.815f)
                verticalLineToRelative(4.28f)
                curveToRelative(0.0f, 1.59f, -0.916f, 2.501f, -2.513f, 2.501f)
                lineToRelative(-2.203f, 0.001f)
                lineToRelative(0.557f, 0.575f)
                lineToRelative(3.621f, -0.001f)
                arcToRelative(0.55f, 0.55f, 0.0f, false, true, 0.0f, 1.098f)
                lineTo(2.71f, 17.44f)
                arcToRelative(0.55f, 0.55f, 0.0f, false, true, 0.0f, -1.098f)
                lineToRelative(3.531f, -0.002f)
                lineToRelative(0.548f, -0.574f)
                lineToRelative(-2.104f, 0.002f)
                curveToRelative(-1.597f, 0.0f, -2.513f, -0.91f, -2.513f, -2.501f)
                verticalLineToRelative(-4.28f)
                curveToRelative(0.0f, -0.777f, 0.213f, -1.387f, 0.636f, -1.816f)
                curveToRelative(0.434f, -0.442f, 1.067f, -0.666f, 1.877f, -0.666f)
                lineToRelative(9.16f, -0.006f)
                close()
                moveTo(20.359f, 6.506f)
                curveToRelative(0.434f, 0.0f, 1.448f, 0.196f, 1.448f, 2.014f)
                lineToRelative(0.003f, 6.88f)
                curveToRelative(0.003f, 1.823f, -1.011f, 2.019f, -1.446f, 2.019f)
                horizontalLineToRelative(-1.997f)
                arcToRelative(1.28f, 1.28f, 0.0f, false, true, -1.12f, -0.61f)
                curveToRelative(-0.213f, -0.34f, -0.317f, -0.8f, -0.317f, -1.407f)
                lineToRelative(-0.005f, -6.88f)
                curveToRelative(0.0f, -0.607f, 0.103f, -1.067f, 0.316f, -1.406f)
                curveToRelative(0.25f, -0.392f, 0.647f, -0.61f, 1.12f, -0.61f)
                horizontalLineToRelative(1.998f)
                close()
                moveTo(10.112f, 15.765f)
                lineTo(8.306f, 15.766f)
                lineTo(7.757f, 16.341f)
                lineTo(10.669f, 16.339f)
                lineTo(10.112f, 15.765f)
                close()
            }
        }
        .build()
        return _personalComputerFilled!!
    }

private var _personalComputerFilled: ImageVector? = null
