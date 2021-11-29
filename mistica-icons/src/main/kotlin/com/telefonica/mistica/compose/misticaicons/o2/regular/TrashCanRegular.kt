package com.telefonica.mistica.compose.misticaicons.o2.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.o2.RegularGroup

public val RegularGroup.TrashCanRegular: ImageVector
    get() {
        if (_trashCanRegular != null) {
            return _trashCanRegular!!
        }
        _trashCanRegular = Builder(name = "TrashCanRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.11f, 1.0f)
                curveToRelative(1.223f, 0.0f, 2.222f, 1.012f, 2.222f, 2.25f)
                verticalLineToRelative(0.374f)
                horizontalLineToRelative(5.922f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, 0.004f, 1.5f)
                horizontalLineToRelative(-1.48f)
                verticalLineToRelative(14.625f)
                curveToRelative(0.0f, 1.239f, -1.0f, 2.251f, -2.223f, 2.251f)
                lineTo(6.445f, 22.0f)
                curveToRelative(-1.223f, 0.0f, -2.222f, -1.012f, -2.222f, -2.25f)
                lineTo(4.223f, 5.127f)
                horizontalLineToRelative(-1.48f)
                arcTo(0.746f, 0.746f, 0.0f, false, true, 2.0f, 4.376f)
                curveToRelative(0.0f, -0.416f, 0.336f, -0.752f, 0.742f, -0.752f)
                horizontalLineToRelative(5.922f)
                verticalLineToRelative(-0.373f)
                curveToRelative(0.0f, -1.239f, 1.0f, -2.251f, 2.223f, -2.251f)
                close()
                moveTo(18.293f, 5.124f)
                lineTo(5.703f, 5.124f)
                verticalLineToRelative(14.621f)
                curveToRelative(0.0f, 0.416f, 0.336f, 0.752f, 0.742f, 0.752f)
                lineTo(17.55f, 20.497f)
                curveToRelative(0.411f, 0.0f, 0.743f, -0.34f, 0.743f, -0.752f)
                lineTo(18.293f, 5.124f)
                close()
                moveTo(14.59f, 6.623f)
                curveToRelative(0.41f, 0.0f, 0.742f, 0.34f, 0.742f, 0.751f)
                verticalLineToRelative(10.872f)
                arcToRelative(0.746f, 0.746f, 0.0f, false, true, -0.742f, 0.752f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, -0.743f, -0.752f)
                lineTo(13.847f, 7.374f)
                curveToRelative(0.0f, -0.411f, 0.332f, -0.751f, 0.743f, -0.751f)
                close()
                moveTo(9.406f, 6.623f)
                curveToRelative(0.407f, 0.0f, 0.742f, 0.34f, 0.742f, 0.751f)
                verticalLineToRelative(10.872f)
                arcToRelative(0.746f, 0.746f, 0.0f, false, true, -0.742f, 0.752f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, true, -0.742f, -0.752f)
                lineTo(8.664f, 7.374f)
                curveToRelative(0.0f, -0.415f, 0.336f, -0.751f, 0.742f, -0.751f)
                close()
                moveTo(13.113f, 2.499f)
                horizontalLineToRelative(-2.222f)
                curveToRelative(-0.41f, 0.0f, -0.743f, 0.34f, -0.743f, 0.752f)
                horizontalLineToRelative(0.005f)
                verticalLineToRelative(0.373f)
                horizontalLineToRelative(3.703f)
                verticalLineToRelative(-0.373f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, false, -0.743f, -0.752f)
                close()
            }
        }
        .build()
        return _trashCanRegular!!
    }

private var _trashCanRegular: ImageVector? = null
