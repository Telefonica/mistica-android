package com.telefonica.mistica.compose.misticaicons.o2.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.o2.FilledGroup

public val FilledGroup.ArrowsLeftAndRightFilled: ImageVector
    get() {
        if (_arrowsLeftAndRightFilled != null) {
            return _arrowsLeftAndRightFilled!!
        }
        _arrowsLeftAndRightFilled = Builder(name = "ArrowsLeftAndRightFilled", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.747f, 9.883f)
                curveToRelative(0.324f, -0.3f, 0.752f, -0.411f, 1.18f, -0.224f)
                curveToRelative(0.396f, 0.182f, 0.68f, 0.593f, 0.68f, 1.037f)
                lineToRelative(0.004f, 1.891f)
                horizontalLineToRelative(5.715f)
                verticalLineToRelative(4.451f)
                horizontalLineTo(8.61f)
                verticalLineToRelative(1.85f)
                curveToRelative(0.0f, 0.444f, -0.252f, 0.85f, -0.68f, 1.037f)
                curveToRelative(-0.144f, 0.038f, -0.284f, 0.075f, -0.428f, 0.075f)
                arcToRelative(1.01f, 1.01f, 0.0f, false, true, -0.752f, -0.336f)
                lineTo(2.0f, 14.774f)
                close()
                moveTo(16.073f, 4.1f)
                curveToRelative(0.428f, -0.187f, 0.856f, -0.112f, 1.18f, 0.224f)
                lineTo(22.0f, 9.214f)
                lineToRelative(-4.747f, 4.879f)
                arcToRelative(0.89f, 0.89f, 0.0f, false, true, -0.716f, 0.336f)
                curveToRelative(-0.144f, 0.0f, -0.284f, 0.0f, -0.428f, -0.075f)
                arcToRelative(1.16f, 1.16f, 0.0f, false, true, -0.716f, -1.074f)
                verticalLineToRelative(-1.85f)
                horizontalLineTo(9.678f)
                verticalLineTo(6.987f)
                horizontalLineToRelative(5.715f)
                verticalLineToRelative(-1.85f)
                curveToRelative(0.0f, -0.444f, 0.252f, -0.85f, 0.68f, -1.037f)
                close()
            }
        }
        .build()
        return _arrowsLeftAndRightFilled!!
    }

private var _arrowsLeftAndRightFilled: ImageVector? = null
