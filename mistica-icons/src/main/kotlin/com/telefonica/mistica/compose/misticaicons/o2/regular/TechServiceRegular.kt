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

public val RegularGroup.TechServiceRegular: ImageVector
    get() {
        if (_techServiceRegular != null) {
            return _techServiceRegular!!
        }
        _techServiceRegular = Builder(name = "TechServiceRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.64f, 22.0f)
                arcToRelative(0.714f, 0.714f, 0.0f, false, true, -0.508f, -1.217f)
                lineToRelative(5.59f, -5.626f)
                lineToRelative(0.436f, 0.172f)
                arcToRelative(6.17f, 6.17f, 0.0f, false, false, 6.61f, -1.38f)
                arcToRelative(6.172f, 6.172f, 0.0f, false, false, 1.697f, -5.511f)
                lineToRelative(-3.461f, 3.461f)
                arcToRelative(2.091f, 2.091f, 0.0f, false, true, -2.957f, 0.0f)
                lineToRelative(-1.95f, -1.949f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, true, 0.0f, -2.957f)
                lineToRelative(3.462f, -3.457f)
                arcToRelative(6.16f, 6.16f, 0.0f, false, false, -5.51f, 1.696f)
                arcToRelative(6.17f, 6.17f, 0.0f, false, false, -1.38f, 6.611f)
                lineToRelative(0.172f, 0.437f)
                lineToRelative(-5.626f, 5.586f)
                arcToRelative(0.714f, 0.714f, 0.0f, false, true, -1.004f, -1.012f)
                lineToRelative(4.973f, -4.935f)
                arcToRelative(7.605f, 7.605f, 0.0f, false, true, 1.86f, -7.695f)
                arcToRelative(7.599f, 7.599f, 0.0f, false, true, 8.144f, -1.7f)
                lineToRelative(1.02f, 0.395f)
                lineToRelative(-5.098f, 5.087f)
                arcToRelative(0.667f, 0.667f, 0.0f, false, false, 0.0f, 0.936f)
                lineToRelative(1.949f, 1.949f)
                curveToRelative(0.26f, 0.256f, 0.68f, 0.26f, 0.936f, 0.0f)
                lineToRelative(5.086f, -5.094f)
                lineToRelative(0.396f, 1.016f)
                arcToRelative(7.602f, 7.602f, 0.0f, false, true, -1.7f, 8.144f)
                arcToRelative(7.613f, 7.613f, 0.0f, false, true, -7.695f, 1.86f)
                lineToRelative(-4.934f, 4.975f)
                arcTo(0.714f, 0.714f, 0.0f, false, true, 6.64f, 22.0f)
                close()
            }
        }
        .build()
        return _techServiceRegular!!
    }

private var _techServiceRegular: ImageVector? = null
