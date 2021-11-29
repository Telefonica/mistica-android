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

public val FilledGroup.BellFilled: ImageVector
    get() {
        if (_bellFilled != null) {
            return _bellFilled!!
        }
        _bellFilled = Builder(name = "BellFilled", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.065f, 3.665f)
                curveToRelative(1.938f, -1.76f, 4.627f, -1.678f, 4.96f, -1.658f)
                curveToRelative(0.334f, -0.02f, 3.023f, -0.104f, 4.956f, 1.655f)
                curveToRelative(1.283f, 1.166f, 1.935f, 2.86f, 1.935f, 5.037f)
                verticalLineToRelative(3.874f)
                curveToRelative(-0.003f, 0.061f, -0.199f, 3.658f, 1.975f, 5.392f)
                curveToRelative(0.137f, 0.109f, 0.188f, 0.294f, 0.129f, 0.456f)
                arcToRelative(0.42f, 0.42f, 0.0f, false, true, -0.395f, 0.272f)
                horizontalLineToRelative(-1.726f)
                lineToRelative(-1.126f, -0.003f)
                horizontalLineToRelative(-2.776f)
                curveToRelative(-0.005f, 0.51f, -0.114f, 1.415f, -0.745f, 2.101f)
                curveToRelative(-0.52f, 0.569f, -1.271f, 0.857f, -2.232f, 0.857f)
                curveToRelative(-0.964f, 0.0f, -1.714f, -0.288f, -2.235f, -0.86f)
                curveToRelative(-0.63f, -0.689f, -0.734f, -1.596f, -0.737f, -2.098f)
                lineTo(3.42f, 18.69f)
                arcToRelative(0.421f, 0.421f, 0.0f, false, true, -0.395f, -0.271f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, true, 0.13f, -0.457f)
                curveToRelative(1.762f, -1.406f, 1.966f, -4.036f, 1.98f, -5.0f)
                verticalLineToRelative(-0.17f)
                arcToRelative(4.177f, 4.177f, 0.0f, false, false, -0.006f, -0.197f)
                verticalLineToRelative(-3.9f)
                curveToRelative(0.0f, -1.223f, 0.216f, -2.29f, 0.625f, -3.2f)
                lineToRelative(0.417f, -0.774f)
                arcToRelative(5.46f, 5.46f, 0.0f, false, true, 0.894f, -1.056f)
                close()
                moveTo(13.892f, 18.788f)
                horizontalLineToRelative(-3.739f)
                curveToRelative(0.028f, 0.35f, 0.129f, 0.837f, 0.454f, 1.19f)
                curveToRelative(0.31f, 0.34f, 0.773f, 0.502f, 1.414f, 0.502f)
                curveToRelative(0.639f, 0.0f, 1.101f, -0.165f, 1.412f, -0.502f)
                curveToRelative(0.325f, -0.353f, 0.429f, -0.837f, 0.46f, -1.19f)
                close()
            }
        }
        .build()
        return _bellFilled!!
    }

private var _bellFilled: ImageVector? = null
