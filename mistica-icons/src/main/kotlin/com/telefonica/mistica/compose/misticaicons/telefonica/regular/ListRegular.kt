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

public val RegularGroup.ListRegular: ImageVector
    get() {
        if (_listRegular != null) {
            return _listRegular!!
        }
        _listRegular = Builder(name = "ListRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.244f, 7.689f)
                curveToRelative(-0.44f, 0.0f, -0.798f, -0.33f, -0.798f, -0.74f)
                curveToRelative(0.0f, -0.409f, 0.355f, -0.74f, 0.798f, -0.74f)
                horizontalLineToRelative(14.804f)
                curveToRelative(0.44f, 0.0f, 0.798f, 0.331f, 0.798f, 0.74f)
                curveToRelative(0.0f, 0.41f, -0.355f, 0.74f, -0.798f, 0.74f)
                lineTo(6.244f, 7.689f)
                close()
                moveTo(3.314f, 5.84f)
                curveToRelative(0.636f, 0.0f, 1.151f, 0.499f, 1.151f, 1.112f)
                curveToRelative(0.0f, 0.613f, -0.515f, 1.112f, -1.15f, 1.112f)
                curveToRelative(-0.64f, -0.003f, -1.155f, -0.499f, -1.155f, -1.112f)
                curveToRelative(0.0f, -0.613f, 0.515f, -1.112f, 1.154f, -1.112f)
                close()
                moveTo(21.048f, 11.252f)
                curveToRelative(0.44f, 0.0f, 0.798f, 0.33f, 0.798f, 0.74f)
                curveToRelative(0.0f, 0.408f, -0.355f, 0.739f, -0.798f, 0.739f)
                lineTo(6.244f, 12.731f)
                curveToRelative(-0.44f, 0.0f, -0.798f, -0.33f, -0.798f, -0.74f)
                curveToRelative(0.0f, -0.409f, 0.355f, -0.74f, 0.798f, -0.74f)
                horizontalLineToRelative(14.804f)
                close()
                moveTo(3.314f, 10.879f)
                curveToRelative(0.636f, 0.0f, 1.151f, 0.499f, 1.151f, 1.112f)
                curveToRelative(0.0f, 0.614f, -0.515f, 1.112f, -1.15f, 1.112f)
                curveToRelative(-0.64f, 0.0f, -1.155f, -0.498f, -1.155f, -1.112f)
                curveToRelative(0.0f, -0.613f, 0.515f, -1.112f, 1.154f, -1.112f)
                close()
                moveTo(21.048f, 16.294f)
                curveToRelative(0.44f, 0.0f, 0.798f, 0.33f, 0.798f, 0.74f)
                curveToRelative(0.0f, 0.405f, -0.355f, 0.739f, -0.798f, 0.739f)
                lineTo(6.244f, 17.773f)
                curveToRelative(-0.44f, 0.0f, -0.798f, -0.334f, -0.798f, -0.74f)
                curveToRelative(0.0f, -0.406f, 0.355f, -0.74f, 0.798f, -0.74f)
                horizontalLineToRelative(14.804f)
                close()
                moveTo(3.314f, 15.92f)
                curveToRelative(0.636f, 0.0f, 1.151f, 0.499f, 1.151f, 1.112f)
                curveToRelative(0.0f, 0.61f, -0.515f, 1.112f, -1.15f, 1.112f)
                curveToRelative(-0.64f, -0.002f, -1.155f, -0.501f, -1.155f, -1.112f)
                curveToRelative(0.0f, -0.616f, 0.515f, -1.112f, 1.154f, -1.112f)
                close()
            }
        }
        .build()
        return _listRegular!!
    }

private var _listRegular: ImageVector? = null
