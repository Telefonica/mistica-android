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

public val RegularGroup.ChipSimCardRegular: ImageVector
    get() {
        if (_chipSimCardRegular != null) {
            return _chipSimCardRegular!!
        }
        _chipSimCardRegular = Builder(name = "ChipSimCardRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.306f, 2.0f)
                curveToRelative(0.546f, 0.0f, 1.058f, 0.205f, 1.432f, 0.612f)
                lineToRelative(3.647f, 3.629f)
                curveToRelative(0.374f, 0.372f, 0.615f, 0.881f, 0.615f, 1.425f)
                lineTo(20.0f, 21.0f)
                lineTo(5.0f, 21.0f)
                lineTo(5.0f, 4.037f)
                curveTo(5.0f, 2.916f, 5.92f, 2.0f, 7.043f, 2.0f)
                horizontalLineToRelative(7.263f)
                close()
                moveTo(14.306f, 3.357f)
                lineTo(7.043f, 3.357f)
                arcToRelative(0.684f, 0.684f, 0.0f, false, false, -0.684f, 0.68f)
                verticalLineToRelative(15.606f)
                horizontalLineToRelative(12.278f)
                lineTo(18.637f, 7.666f)
                arcToRelative(0.665f, 0.665f, 0.0f, false, false, -0.207f, -0.475f)
                lineToRelative(-3.612f, -3.63f)
                arcToRelative(0.693f, 0.693f, 0.0f, false, false, -0.512f, -0.204f)
                close()
                moveTo(15.91f, 8.787f)
                curveToRelative(0.749f, 0.0f, 1.363f, 0.612f, 1.363f, 1.356f)
                verticalLineToRelative(8.144f)
                lineTo(7.727f, 18.287f)
                verticalLineToRelative(-8.144f)
                curveToRelative(0.0f, -0.744f, 0.614f, -1.356f, 1.363f, -1.356f)
                horizontalLineToRelative(6.82f)
                close()
                moveTo(15.91f, 10.143f)
                lineTo(9.09f, 10.143f)
                verticalLineToRelative(6.787f)
                horizontalLineToRelative(6.82f)
                verticalLineToRelative(-6.787f)
                close()
            }
        }
        .build()
        return _chipSimCardRegular!!
    }

private var _chipSimCardRegular: ImageVector? = null
