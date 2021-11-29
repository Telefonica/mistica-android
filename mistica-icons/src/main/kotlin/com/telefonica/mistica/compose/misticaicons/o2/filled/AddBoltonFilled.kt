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

public val FilledGroup.AddBoltonFilled: ImageVector
    get() {
        if (_addBoltonFilled != null) {
            return _addBoltonFilled!!
        }
        _addBoltonFilled = Builder(name = "AddBoltonFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 3.0f)
                lineTo(7.0f, 3.0f)
                lineToRelative(-5.0f, 9.0f)
                lineToRelative(5.0f, 9.0f)
                horizontalLineToRelative(10.0f)
                lineToRelative(5.0f, -9.0f)
                lineToRelative(-5.0f, -9.0f)
                close()
                moveTo(15.53f, 12.734f)
                horizontalLineToRelative(-2.825f)
                verticalLineToRelative(2.938f)
                curveToRelative(0.0f, 0.405f, -0.316f, 0.734f, -0.705f, 0.734f)
                curveToRelative(-0.389f, 0.0f, -0.705f, -0.33f, -0.705f, -0.734f)
                verticalLineToRelative(-2.938f)
                lineTo(8.469f, 12.734f)
                curveToRelative(-0.389f, 0.0f, -0.705f, -0.33f, -0.705f, -0.734f)
                curveToRelative(0.0f, -0.404f, 0.316f, -0.734f, 0.705f, -0.734f)
                horizontalLineToRelative(2.826f)
                lineTo(11.295f, 8.328f)
                curveToRelative(0.0f, -0.405f, 0.316f, -0.734f, 0.705f, -0.734f)
                curveToRelative(0.389f, 0.0f, 0.705f, 0.33f, 0.705f, 0.734f)
                verticalLineToRelative(2.938f)
                horizontalLineToRelative(2.826f)
                curveToRelative(0.389f, 0.0f, 0.705f, 0.33f, 0.705f, 0.734f)
                arcToRelative(0.718f, 0.718f, 0.0f, false, true, -0.705f, 0.734f)
                close()
            }
        }
        .build()
        return _addBoltonFilled!!
    }

private var _addBoltonFilled: ImageVector? = null
