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

public val RegularGroup.BriefcaseRegular: ImageVector
    get() {
        if (_briefcaseRegular != null) {
            return _briefcaseRegular!!
        }
        _briefcaseRegular = Builder(name = "BriefcaseRegular", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.617f, 12.289f)
                curveToRelative(-1.664f, 1.221f, -4.306f, 1.776f, -8.538f, 1.776f)
                curveToRelative(-4.34f, 0.0f, -7.031f, -0.586f, -8.687f, -1.891f)
                lineTo(3.392f, 8.647f)
                arcToRelative(0.23f, 0.23f, 0.0f, false, true, 0.23f, -0.224f)
                horizontalLineToRelative(16.773f)
                curveToRelative(0.124f, 0.0f, 0.222f, 0.101f, 0.222f, 0.224f)
                verticalLineToRelative(3.642f)
                close()
                moveTo(11.421f, 16.435f)
                horizontalLineToRelative(1.173f)
                verticalLineToRelative(-1.132f)
                horizontalLineToRelative(-1.173f)
                verticalLineToRelative(1.132f)
                close()
                moveTo(20.617f, 20.375f)
                curveToRelative(0.0f, 0.132f, -0.098f, 0.23f, -0.222f, 0.23f)
                lineTo(3.62f, 20.605f)
                arcToRelative(0.229f, 0.229f, 0.0f, false, true, -0.23f, -0.23f)
                verticalLineToRelative(-6.7f)
                curveToRelative(1.583f, 0.942f, 3.723f, 1.446f, 6.799f, 1.586f)
                verticalLineToRelative(1.395f)
                curveToRelative(0.0f, 0.347f, 0.157f, 0.636f, 0.429f, 0.818f)
                curveToRelative(0.204f, 0.131f, 0.467f, 0.199f, 0.787f, 0.199f)
                lineTo(12.6f, 17.673f)
                curveToRelative(0.328f, 0.0f, 0.582f, -0.068f, 0.787f, -0.2f)
                arcToRelative(0.94f, 0.94f, 0.0f, false, false, 0.434f, -0.817f)
                verticalLineToRelative(-1.39f)
                curveToRelative(3.059f, -0.123f, 5.202f, -0.602f, 6.793f, -1.512f)
                verticalLineToRelative(6.622f)
                horizontalLineToRelative(0.003f)
                close()
                moveTo(8.303f, 6.828f)
                curveToRelative(0.0f, -1.883f, 1.625f, -3.429f, 3.61f, -3.429f)
                horizontalLineToRelative(0.188f)
                curveToRelative(1.986f, 0.0f, 3.602f, 1.546f, 3.602f, 3.429f)
                verticalLineToRelative(0.355f)
                horizontalLineToRelative(-7.4f)
                verticalLineToRelative(-0.355f)
                close()
                moveTo(20.393f, 7.183f)
                horizontalLineToRelative(-3.46f)
                verticalLineToRelative(-0.355f)
                curveToRelative(0.0f, -2.569f, -2.165f, -4.667f, -4.832f, -4.667f)
                horizontalLineToRelative(-0.187f)
                curveToRelative(-2.667f, 0.0f, -4.84f, 2.098f, -4.84f, 4.667f)
                verticalLineToRelative(0.355f)
                lineTo(3.618f, 7.183f)
                arcTo(1.46f, 1.46f, 0.0f, false, false, 2.16f, 8.645f)
                verticalLineToRelative(11.73f)
                curveToRelative(0.0f, 0.81f, 0.655f, 1.471f, 1.46f, 1.471f)
                horizontalLineToRelative(16.772f)
                curveToRelative(0.804f, 0.0f, 1.454f, -0.658f, 1.454f, -1.47f)
                lineTo(21.846f, 8.645f)
                curveToRelative(0.0f, -0.81f, -0.647f, -1.463f, -1.454f, -1.463f)
                close()
            }
        }
        .build()
        return _briefcaseRegular!!
    }

private var _briefcaseRegular: ImageVector? = null
