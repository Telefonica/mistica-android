package com.telefonica.mistica.compose.misticaicons.telefonica.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.telefonica.FilledGroup

public val FilledGroup.DumbbellFilled: ImageVector
    get() {
        if (_dumbbellFilled != null) {
            return _dumbbellFilled!!
        }
        _dumbbellFilled = Builder(name = "DumbbellFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 8.126f)
                curveToRelative(0.0f, -0.74f, 0.571f, -1.336f, 1.28f, -1.336f)
                horizontalLineToRelative(0.26f)
                verticalLineToRelative(10.224f)
                horizontalLineToRelative(-0.26f)
                curveToRelative(-0.706f, 0.0f, -1.28f, -0.6f, -1.28f, -1.336f)
                lineTo(2.0f, 8.126f)
                close()
                moveTo(20.406f, 6.787f)
                curveToRelative(0.706f, 0.0f, 1.28f, 0.6f, 1.28f, 1.336f)
                verticalLineToRelative(7.55f)
                curveToRelative(0.0f, 0.739f, -0.574f, 1.335f, -1.28f, 1.335f)
                horizontalLineToRelative(-0.24f)
                lineTo(20.166f, 6.784f)
                horizontalLineToRelative(0.24f)
                verticalLineToRelative(0.003f)
                close()
                moveTo(8.045f, 6.675f)
                lineTo(8.045f, 9.49f)
                horizontalLineToRelative(0.014f)
                verticalLineToRelative(4.82f)
                horizontalLineToRelative(-0.014f)
                verticalLineToRelative(2.816f)
                curveToRelative(0.0f, 0.74f, -0.572f, 1.336f, -1.28f, 1.336f)
                lineTo(5.667f, 18.462f)
                curveToRelative(-0.692f, 0.0f, -1.255f, -0.577f, -1.275f, -1.294f)
                lineTo(4.392f, 6.636f)
                curveToRelative(0.02f, -0.72f, 0.583f, -1.297f, 1.275f, -1.297f)
                horizontalLineToRelative(1.098f)
                curveToRelative(0.706f, -0.003f, 1.28f, 0.597f, 1.28f, 1.336f)
                close()
                moveTo(8.91f, 13.919f)
                verticalLineToRelative(-4.04f)
                horizontalLineToRelative(5.894f)
                verticalLineToRelative(4.04f)
                lineTo(8.91f, 13.919f)
                close()
                moveTo(19.31f, 6.675f)
                verticalLineToRelative(0.112f)
                horizontalLineToRelative(0.004f)
                verticalLineToRelative(10.224f)
                horizontalLineToRelative(-0.003f)
                verticalLineToRelative(0.112f)
                curveToRelative(0.0f, 0.74f, -0.574f, 1.336f, -1.28f, 1.336f)
                horizontalLineToRelative(-1.098f)
                curveToRelative(-0.706f, 0.0f, -1.28f, -0.6f, -1.28f, -1.336f)
                lineTo(15.653f, 6.675f)
                curveToRelative(0.0f, -0.74f, 0.571f, -1.336f, 1.28f, -1.336f)
                horizontalLineToRelative(1.098f)
                curveToRelative(0.708f, -0.003f, 1.28f, 0.597f, 1.28f, 1.336f)
                close()
            }
        }
        .build()
        return _dumbbellFilled!!
    }

private var _dumbbellFilled: ImageVector? = null
