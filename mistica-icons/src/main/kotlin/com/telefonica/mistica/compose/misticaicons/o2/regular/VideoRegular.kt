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

public val RegularGroup.VideoRegular: ImageVector
    get() {
        if (_videoRegular != null) {
            return _videoRegular!!
        }
        _videoRegular = Builder(name = "VideoRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(6.488f, 22.0f, 2.0f, 17.516f, 2.0f, 12.0f)
                reflectiveCurveTo(6.488f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.488f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.488f, 10.0f, -10.0f, 10.0f)
                close()
                moveTo(12.0f, 3.43f)
                curveToRelative(-4.726f, 0.0f, -8.57f, 3.844f, -8.57f, 8.57f)
                curveToRelative(0.0f, 4.726f, 3.844f, 8.57f, 8.57f, 8.57f)
                curveToRelative(4.726f, 0.0f, 8.57f, -3.844f, 8.57f, -8.57f)
                curveToRelative(0.0f, -4.726f, -3.844f, -8.57f, -8.57f, -8.57f)
                close()
                moveTo(8.965f, 17.714f)
                arcTo(0.71f, 0.71f, 0.0f, false, true, 8.252f, 17.0f)
                lineTo(8.252f, 7.0f)
                curveToRelative(0.0f, -0.256f, 0.137f, -0.494f, 0.357f, -0.617f)
                arcToRelative(0.708f, 0.708f, 0.0f, false, true, 0.717f, 0.005f)
                lineToRelative(8.57f, 4.995f)
                arcToRelative(0.714f, 0.714f, 0.0f, false, true, 0.0f, 1.234f)
                lineToRelative(-8.57f, 5.0f)
                arcToRelative(0.737f, 0.737f, 0.0f, false, true, -0.36f, 0.096f)
                close()
                moveTo(9.678f, 8.244f)
                verticalLineToRelative(7.51f)
                lineTo(16.118f, 12.0f)
                lineToRelative(-6.44f, -3.757f)
                close()
            }
        }
        .build()
        return _videoRegular!!
    }

private var _videoRegular: ImageVector? = null
