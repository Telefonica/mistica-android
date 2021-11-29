package com.telefonica.mistica.compose.misticaicons.telefonica.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.telefonica.LightGroup

public val LightGroup.WebLight: ImageVector
    get() {
        if (_webLight != null) {
            return _webLight!!
        }
        _webLight = Builder(name = "WebLight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.725f, 18.189f)
                curveToRelative(0.242f, 0.0f, 0.441f, -0.19f, 0.441f, -0.427f)
                lineTo(21.166f, 8.084f)
                lineTo(2.834f, 8.084f)
                verticalLineToRelative(9.678f)
                curveToRelative(0.0f, 0.236f, 0.196f, 0.427f, 0.44f, 0.427f)
                horizontalLineToRelative(17.451f)
                close()
                moveTo(3.275f, 4.809f)
                arcToRelative(0.437f, 0.437f, 0.0f, false, false, -0.441f, 0.426f)
                verticalLineToRelative(2.04f)
                horizontalLineToRelative(18.332f)
                verticalLineToRelative(-2.04f)
                arcToRelative(0.433f, 0.433f, 0.0f, false, false, -0.44f, -0.427f)
                lineTo(3.274f, 4.808f)
                close()
                moveTo(20.725f, 4.0f)
                curveTo(21.428f, 4.0f, 22.0f, 4.555f, 22.0f, 5.235f)
                verticalLineToRelative(12.53f)
                curveToRelative(0.0f, 0.68f, -0.572f, 1.235f, -1.275f, 1.235f)
                lineTo(3.275f, 19.0f)
                curveTo(2.572f, 19.0f, 2.0f, 18.445f, 2.0f, 17.765f)
                lineTo(2.0f, 5.235f)
                curveTo(2.0f, 4.555f, 2.572f, 4.0f, 3.275f, 4.0f)
                horizontalLineToRelative(17.45f)
                close()
                moveTo(6.48f, 10.03f)
                lineToRelative(2.829f, 2.487f)
                arcToRelative(0.404f, 0.404f, 0.0f, false, true, 0.137f, 0.3f)
                arcToRelative(0.401f, 0.401f, 0.0f, false, true, -0.134f, 0.298f)
                lineToRelative(-2.829f, 2.533f)
                arcToRelative(0.428f, 0.428f, 0.0f, false, true, -0.592f, -0.02f)
                arcToRelative(0.397f, 0.397f, 0.0f, false, true, 0.023f, -0.572f)
                lineToRelative(2.493f, -2.234f)
                lineToRelative(-2.49f, -2.191f)
                arcToRelative(0.395f, 0.395f, 0.0f, false, true, -0.029f, -0.572f)
                arcToRelative(0.432f, 0.432f, 0.0f, false, true, 0.592f, -0.029f)
                close()
                moveTo(17.698f, 12.435f)
                curveToRelative(0.23f, 0.0f, 0.419f, 0.182f, 0.419f, 0.404f)
                arcToRelative(0.413f, 0.413f, 0.0f, false, true, -0.419f, 0.404f)
                horizontalLineToRelative(-6.704f)
                arcToRelative(0.413f, 0.413f, 0.0f, false, true, -0.419f, -0.404f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, true, 0.419f, -0.404f)
                horizontalLineToRelative(6.704f)
                close()
                moveTo(6.257f, 6.664f)
                arcToRelative(0.572f, 0.572f, 0.0f, false, true, -0.58f, -0.561f)
                curveToRelative(0.0f, -0.31f, 0.259f, -0.563f, 0.58f, -0.563f)
                curveToRelative(0.322f, 0.0f, 0.58f, 0.25f, 0.58f, 0.563f)
                curveToRelative(0.0f, 0.307f, -0.258f, 0.56f, -0.58f, 0.56f)
                close()
                moveTo(7.999f, 6.664f)
                arcToRelative(0.572f, 0.572f, 0.0f, false, true, -0.58f, -0.561f)
                curveToRelative(0.0f, -0.31f, 0.258f, -0.563f, 0.58f, -0.563f)
                curveToRelative(0.321f, 0.0f, 0.578f, 0.25f, 0.578f, 0.563f)
                arcToRelative(0.57f, 0.57f, 0.0f, false, true, -0.578f, 0.56f)
                close()
                moveTo(4.519f, 6.664f)
                arcToRelative(0.572f, 0.572f, 0.0f, false, true, -0.581f, -0.561f)
                curveToRelative(0.0f, -0.31f, 0.259f, -0.563f, 0.58f, -0.563f)
                curveToRelative(0.322f, 0.0f, 0.581f, 0.25f, 0.581f, 0.563f)
                curveToRelative(0.0f, 0.307f, -0.259f, 0.56f, -0.58f, 0.56f)
                close()
            }
        }
        .build()
        return _webLight!!
    }

private var _webLight: ImageVector? = null
