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

public val RegularGroup.TvContentRegular: ImageVector
    get() {
        if (_tvContentRegular != null) {
            return _tvContentRegular!!
        }
        _tvContentRegular = Builder(name = "TvContentRegular", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 17.666f)
                lineTo(22.0f, 4.0f)
                lineTo(2.0f, 4.0f)
                verticalLineToRelative(13.661f)
                horizontalLineToRelative(7.966f)
                verticalLineToRelative(1.17f)
                lineTo(7.557f, 18.831f)
                curveToRelative(-0.308f, 0.0f, -0.555f, 0.26f, -0.555f, 0.584f)
                curveToRelative(0.0f, 0.325f, 0.247f, 0.585f, 0.555f, 0.585f)
                horizontalLineToRelative(8.891f)
                curveToRelative(0.308f, 0.0f, 0.554f, -0.26f, 0.554f, -0.585f)
                curveToRelative(0.0f, -0.324f, -0.246f, -0.584f, -0.554f, -0.584f)
                horizontalLineToRelative(-2.41f)
                verticalLineToRelative(-1.17f)
                lineTo(22.0f, 17.661f)
                verticalLineToRelative(0.005f)
                close()
                moveTo(3.48f, 16.102f)
                lineTo(3.48f, 5.564f)
                horizontalLineToRelative(17.04f)
                verticalLineToRelative(10.538f)
                lineTo(3.48f, 16.102f)
                close()
                moveTo(12.925f, 18.836f)
                lineTo(11.07f, 18.836f)
                verticalLineToRelative(-1.17f)
                horizontalLineToRelative(1.854f)
                verticalLineToRelative(1.17f)
                close()
            }
        }
        .build()
        return _tvContentRegular!!
    }

private var _tvContentRegular: ImageVector? = null
