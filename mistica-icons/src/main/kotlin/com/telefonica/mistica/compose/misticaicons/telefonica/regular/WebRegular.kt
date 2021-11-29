package com.telefonica.mistica.compose.misticaicons.telefonica.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.telefonica.RegularGroup

public val RegularGroup.WebRegular: ImageVector
    get() {
        if (_webRegular != null) {
            return _webRegular!!
        }
        _webRegular = Builder(name = "WebRegular", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.457f, 7.66f)
                lineTo(20.457f, 5.929f)
                arcToRelative(0.227f, 0.227f, 0.0f, false, false, -0.227f, -0.222f)
                lineTo(3.46f, 5.707f)
                arcToRelative(0.225f, 0.225f, 0.0f, false, false, -0.23f, 0.222f)
                verticalLineToRelative(1.73f)
                horizontalLineToRelative(17.227f)
                close()
                moveTo(20.457f, 17.884f)
                lineTo(20.457f, 8.842f)
                lineTo(3.23f, 8.842f)
                verticalLineToRelative(9.042f)
                curveToRelative(0.0f, 0.12f, 0.103f, 0.218f, 0.23f, 0.218f)
                horizontalLineToRelative(16.77f)
                arcToRelative(0.223f, 0.223f, 0.0f, false, false, 0.227f, -0.218f)
                close()
                moveTo(20.23f, 4.525f)
                curveToRelative(0.804f, 0.0f, 1.456f, 0.63f, 1.456f, 1.404f)
                verticalLineToRelative(11.955f)
                curveToRelative(0.0f, 0.776f, -0.655f, 1.403f, -1.456f, 1.403f)
                lineTo(3.46f, 19.287f)
                curveToRelative(-0.805f, 0.0f, -1.46f, -0.63f, -1.46f, -1.403f)
                lineTo(2.0f, 5.929f)
                curveToRelative(0.0f, -0.776f, 0.655f, -1.404f, 1.46f, -1.404f)
                horizontalLineToRelative(16.77f)
                close()
                moveTo(5.742f, 16.287f)
                arcToRelative(0.579f, 0.579f, 0.0f, false, true, 0.034f, -0.837f)
                lineToRelative(2.286f, -2.034f)
                lineToRelative(-2.283f, -1.994f)
                arcToRelative(0.576f, 0.576f, 0.0f, false, true, -0.042f, -0.838f)
                arcToRelative(0.628f, 0.628f, 0.0f, false, true, 0.868f, -0.04f)
                lineToRelative(2.779f, 2.43f)
                arcToRelative(0.576f, 0.576f, 0.0f, false, true, 0.003f, 0.873f)
                lineToRelative(-2.78f, 2.474f)
                arcToRelative(0.62f, 0.62f, 0.0f, false, true, -0.417f, 0.157f)
                arcToRelative(0.622f, 0.622f, 0.0f, false, true, -0.448f, -0.19f)
                close()
                moveTo(10.905f, 14.027f)
                arcToRelative(0.606f, 0.606f, 0.0f, false, true, -0.616f, -0.591f)
                curveToRelative(0.0f, -0.328f, 0.274f, -0.591f, 0.616f, -0.591f)
                horizontalLineToRelative(6.588f)
                curveToRelative(0.339f, 0.0f, 0.616f, 0.266f, 0.616f, 0.59f)
                arcToRelative(0.602f, 0.602f, 0.0f, false, true, -0.616f, 0.592f)
                horizontalLineToRelative(-6.588f)
                close()
                moveTo(6.218f, 6.105f)
                arcToRelative(0.56f, 0.56f, 0.0f, false, true, 0.57f, 0.55f)
                arcToRelative(0.56f, 0.56f, 0.0f, false, true, -0.57f, 0.548f)
                arcToRelative(0.558f, 0.558f, 0.0f, false, true, -0.568f, -0.549f)
                curveToRelative(0.0f, -0.305f, 0.252f, -0.549f, 0.568f, -0.549f)
                close()
                moveTo(7.928f, 6.105f)
                curveToRelative(0.316f, 0.0f, 0.568f, 0.247f, 0.568f, 0.55f)
                arcToRelative(0.56f, 0.56f, 0.0f, false, true, -0.569f, 0.548f)
                arcToRelative(0.56f, 0.56f, 0.0f, false, true, -0.568f, -0.549f)
                curveToRelative(0.0f, -0.305f, 0.254f, -0.549f, 0.568f, -0.549f)
                close()
                moveTo(4.507f, 6.105f)
                curveToRelative(0.317f, 0.0f, 0.569f, 0.247f, 0.569f, 0.55f)
                arcToRelative(0.56f, 0.56f, 0.0f, false, true, -0.569f, 0.548f)
                arcToRelative(0.558f, 0.558f, 0.0f, false, true, -0.569f, -0.549f)
                curveToRelative(0.0f, -0.305f, 0.255f, -0.549f, 0.569f, -0.549f)
                close()
            }
        }
        .build()
        return _webRegular!!
    }

private var _webRegular: ImageVector? = null
