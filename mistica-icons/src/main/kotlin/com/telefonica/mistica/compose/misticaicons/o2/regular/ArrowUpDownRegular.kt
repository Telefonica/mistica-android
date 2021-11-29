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

public val RegularGroup.ArrowUpDownRegular: ImageVector
    get() {
        if (_arrowUpDownRegular != null) {
            return _arrowUpDownRegular!!
        }
        _arrowUpDownRegular = Builder(name = "ArrowUpDownRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.432f, 22.0f)
                horizontalLineTo(19.0f)
                verticalLineToRelative(-7.036f)
                curveToRelative(0.0f, -0.572f, -0.332f, -1.108f, -0.867f, -1.356f)
                curveToRelative(-0.466f, -0.18f, -1.134f, -0.18f, -1.466f, 0.18f)
                lineToRelative(-1.0f, 1.072f)
                lineTo(8.333f, 7.0f)
                lineTo(6.466f, 9.0f)
                curveToRelative(-0.064f, 0.072f, -0.133f, 0.0f, -0.133f, -0.072f)
                verticalLineToRelative(-5.5f)
                horizontalLineToRelative(5.132f)
                curveToRelative(0.065f, 0.0f, 0.103f, 0.108f, 0.065f, 0.144f)
                curveToRelative(-0.435f, 0.5f, -1.867f, 2.0f, -1.867f, 2.0f)
                lineToRelative(5.835f, 6.248f)
                lineToRelative(1.0f, -1.072f)
                lineToRelative(-4.83f, -5.176f)
                lineToRelative(1.0f, -1.072f)
                curveToRelative(0.333f, -0.356f, 0.333f, -1.072f, 0.168f, -1.572f)
                curveTo(12.6f, 2.356f, 12.1f, 2.0f, 11.568f, 2.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(7.036f)
                curveToRelative(0.0f, 0.572f, 0.332f, 1.108f, 0.867f, 1.356f)
                curveToRelative(0.466f, 0.18f, 1.134f, 0.18f, 1.466f, -0.18f)
                lineToRelative(1.0f, -1.072f)
                lineTo(15.667f, 17.0f)
                lineToRelative(1.868f, -2.0f)
                curveToRelative(0.064f, -0.072f, 0.133f, 0.0f, 0.133f, 0.072f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(-5.132f)
                curveToRelative(-0.065f, 0.0f, -0.103f, -0.108f, -0.065f, -0.144f)
                lineToRelative(1.867f, -2.0f)
                lineToRelative(-5.835f, -6.252f)
                lineToRelative(-1.0f, 1.072f)
                lineToRelative(4.834f, 5.18f)
                lineToRelative(-1.0f, 1.072f)
                curveToRelative(-0.333f, 0.356f, -0.333f, 1.072f, -0.169f, 1.572f)
                curveToRelative(0.233f, 0.572f, 0.734f, 0.928f, 1.265f, 0.928f)
                close()
            }
        }
        .build()
        return _arrowUpDownRegular!!
    }

private var _arrowUpDownRegular: ImageVector? = null
