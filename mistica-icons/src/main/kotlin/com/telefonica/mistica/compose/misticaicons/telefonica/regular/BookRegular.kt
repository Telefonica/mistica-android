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

public val RegularGroup.BookRegular: ImageVector
    get() {
        if (_bookRegular != null) {
            return _bookRegular!!
        }
        _bookRegular = Builder(name = "BookRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.431f, 16.812f)
                arcToRelative(23.065f, 23.065f, 0.0f, false, false, -7.96f, 1.687f)
                lineTo(12.471f, 6.519f)
                curveToRelative(3.067f, -1.505f, 6.593f, -1.614f, 7.96f, -1.589f)
                verticalLineToRelative(11.882f)
                close()
                moveTo(3.255f, 4.93f)
                curveToRelative(1.367f, -0.017f, 4.885f, 0.081f, 7.96f, 1.588f)
                verticalLineToRelative(11.98f)
                arcToRelative(23.115f, 23.115f, 0.0f, false, false, -7.96f, -1.686f)
                lineTo(3.255f, 4.93f)
                close()
                moveTo(21.109f, 3.714f)
                curveToRelative(-0.21f, -0.017f, -5.056f, -0.361f, -9.266f, 1.734f)
                curveTo(7.636f, 3.35f, 2.79f, 3.698f, 2.58f, 3.714f)
                arcToRelative(0.62f, 0.62f, 0.0f, false, false, -0.577f, 0.62f)
                verticalLineToRelative(13.092f)
                curveToRelative(0.0f, 0.342f, 0.28f, 0.622f, 0.627f, 0.622f)
                curveToRelative(5.06f, 0.0f, 8.885f, 1.95f, 8.925f, 1.969f)
                curveToRelative(0.092f, 0.047f, 0.19f, 0.07f, 0.29f, 0.07f)
                curveToRelative(0.026f, 0.0f, 0.049f, -0.017f, 0.077f, -0.02f)
                arcToRelative(0.596f, 0.596f, 0.0f, false, false, 0.249f, -0.07f)
                curveToRelative(0.328f, -0.162f, 4.022f, -1.952f, 8.89f, -1.952f)
                arcToRelative(0.623f, 0.623f, 0.0f, false, false, 0.628f, -0.622f)
                lineTo(21.689f, 4.331f)
                arcToRelative(0.627f, 0.627f, 0.0f, false, false, -0.58f, -0.617f)
                close()
            }
        }
        .build()
        return _bookRegular!!
    }

private var _bookRegular: ImageVector? = null
