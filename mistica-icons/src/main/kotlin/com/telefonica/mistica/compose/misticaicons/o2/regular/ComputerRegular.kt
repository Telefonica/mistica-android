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

public val RegularGroup.ComputerRegular: ImageVector
    get() {
        if (_computerRegular != null) {
            return _computerRegular!!
        }
        _computerRegular = Builder(name = "ComputerRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.217f, 15.685f)
                reflectiveCurveToRelative(0.0f, -0.038f, 0.0f, 0.0f)
                lineTo(20.217f, 7.212f)
                curveToRelative(0.0f, -1.217f, -0.964f, -2.212f, -2.144f, -2.212f)
                lineTo(5.931f, 5.0f)
                curveToRelative(-1.179f, 0.0f, -2.144f, 0.995f, -2.144f, 2.212f)
                verticalLineToRelative(8.473f)
                lineTo(2.0f, 15.685f)
                verticalLineToRelative(0.552f)
                curveTo(2.0f, 17.746f, 3.18f, 19.0f, 4.642f, 19.0f)
                horizontalLineToRelative(14.752f)
                curveTo(20.821f, 19.0f, 22.0f, 17.746f, 22.0f, 16.237f)
                verticalLineToRelative(-0.552f)
                horizontalLineToRelative(-1.783f)
                close()
                moveTo(5.218f, 7.212f)
                curveToRelative(0.0f, -0.406f, 0.32f, -0.736f, 0.713f, -0.736f)
                horizontalLineToRelative(12.142f)
                curveToRelative(0.393f, 0.0f, 0.713f, 0.33f, 0.713f, 0.736f)
                verticalLineToRelative(8.473f)
                lineTo(5.218f, 15.685f)
                lineTo(5.218f, 7.212f)
                close()
                moveTo(19.394f, 17.897f)
                lineTo(4.647f, 17.897f)
                curveToRelative(-0.677f, 0.0f, -1.248f, -0.481f, -1.463f, -1.104f)
                horizontalLineToRelative(17.678f)
                curveToRelative(-0.252f, 0.623f, -0.823f, 1.104f, -1.468f, 1.104f)
                close()
            }
        }
        .build()
        return _computerRegular!!
    }

private var _computerRegular: ImageVector? = null
