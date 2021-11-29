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

public val RegularGroup.AddBoltonRegular: ImageVector
    get() {
        if (_addBoltonRegular != null) {
            return _addBoltonRegular!!
        }
        _addBoltonRegular = Builder(name = "AddBoltonRegular", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(16.182f, 19.533f)
                lineTo(7.818f, 19.533f)
                lineTo(3.632f, 12.0f)
                lineToRelative(4.182f, -7.533f)
                horizontalLineToRelative(8.368f)
                lineTo(20.368f, 12.0f)
                lineToRelative(-4.186f, 7.533f)
                close()
                moveTo(16.06f, 12.0f)
                curveToRelative(0.0f, 0.404f, -0.317f, 0.734f, -0.706f, 0.734f)
                horizontalLineToRelative(-2.649f)
                verticalLineToRelative(2.755f)
                curveToRelative(0.0f, 0.404f, -0.316f, 0.734f, -0.705f, 0.734f)
                curveToRelative(-0.389f, 0.0f, -0.705f, -0.33f, -0.705f, -0.734f)
                verticalLineToRelative(-2.755f)
                horizontalLineToRelative(-2.65f)
                curveToRelative(-0.388f, 0.0f, -0.705f, -0.33f, -0.705f, -0.734f)
                curveToRelative(0.0f, -0.404f, 0.317f, -0.734f, 0.706f, -0.734f)
                horizontalLineToRelative(2.649f)
                lineTo(11.295f, 8.511f)
                curveToRelative(0.0f, -0.404f, 0.316f, -0.734f, 0.705f, -0.734f)
                curveToRelative(0.389f, 0.0f, 0.705f, 0.33f, 0.705f, 0.734f)
                verticalLineToRelative(2.755f)
                horizontalLineToRelative(2.65f)
                curveToRelative(0.388f, 0.0f, 0.705f, 0.33f, 0.705f, 0.734f)
                close()
            }
        }
        .build()
        return _addBoltonRegular!!
    }

private var _addBoltonRegular: ImageVector? = null
