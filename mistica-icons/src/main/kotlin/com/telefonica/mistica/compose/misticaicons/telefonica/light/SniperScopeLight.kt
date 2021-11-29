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

public val LightGroup.SniperScopeLight: ImageVector
    get() {
        if (_sniperScopeLight != null) {
            return _sniperScopeLight!!
        }
        _sniperScopeLight = Builder(name = "SniperScopeLight", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.47f, 18.907f)
                verticalLineToRelative(-2.39f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, false, -0.412f, -0.408f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, false, -0.412f, 0.409f)
                verticalLineToRelative(2.395f)
                curveToRelative(-1.574f, -0.037f, -6.184f, -0.65f, -6.546f, -6.28f)
                horizontalLineToRelative(2.412f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, false, 0.412f, -0.41f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, false, -0.412f, -0.408f)
                horizontalLineTo(5.069f)
                curveToRelative(0.065f, -6.241f, 5.014f, -6.802f, 6.577f, -6.821f)
                verticalLineTo(7.48f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, false, 0.412f, 0.41f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, false, 0.412f, -0.41f)
                verticalLineTo(5.002f)
                curveToRelative(1.664f, 0.062f, 6.485f, 0.773f, 6.574f, 6.81f)
                horizontalLineToRelative(-2.546f)
                arcToRelative(0.412f, 0.412f, 0.0f, false, false, -0.412f, 0.409f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, false, 0.412f, 0.409f)
                horizontalLineToRelative(2.521f)
                curveToRelative(-0.345f, 5.607f, -4.966f, 6.235f, -6.549f, 6.277f)
                moveToRelative(8.966f, -7.095f)
                horizontalLineToRelative(-1.571f)
                curveToRelative(-0.095f, -6.947f, -5.992f, -7.577f, -7.398f, -7.63f)
                verticalLineTo(2.564f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, false, -0.412f, -0.409f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, false, -0.411f, 0.41f)
                verticalLineToRelative(1.607f)
                curveToRelative(-1.264f, 0.011f, -7.33f, 0.462f, -7.4f, 7.639f)
                horizontalLineTo(2.567f)
                arcToRelative(0.412f, 0.412f, 0.0f, false, false, -0.412f, 0.409f)
                curveToRelative(0.0f, 0.224f, 0.185f, 0.409f, 0.412f, 0.409f)
                horizontalLineToRelative(1.706f)
                curveToRelative(0.39f, 6.535f, 6.048f, 7.067f, 7.367f, 7.1f)
                verticalLineToRelative(1.7f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, false, 0.412f, 0.41f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, false, 0.411f, -0.41f)
                verticalLineToRelative(-1.705f)
                curveToRelative(1.323f, -0.037f, 7.0f, -0.586f, 7.37f, -7.098f)
                horizontalLineToRelative(1.597f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, false, 0.412f, -0.41f)
                arcToRelative(0.403f, 0.403f, 0.0f, false, false, -0.407f, -0.405f)
            }
        }
        .build()
        return _sniperScopeLight!!
    }

private var _sniperScopeLight: ImageVector? = null
