package com.telefonica.mistica.compose.misticaicons.telefonica.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.telefonica.RegularGroup

public val RegularGroup.ChevronDownRegular: ImageVector
    get() {
        if (_chevronDownRegular != null) {
            return _chevronDownRegular!!
        }
        _chevronDownRegular = Builder(name = "ChevronDownRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 8.839f)
                curveToRelative(0.0f, 0.208f, -0.082f, 0.41f, -0.23f, 0.564f)
                lineToRelative(-7.05f, 7.32f)
                arcToRelative(0.924f, 0.924f, 0.0f, false, true, -1.273f, 0.044f)
                curveToRelative(-0.014f, -0.01f, -0.025f, -0.024f, -0.04f, -0.037f)
                lineToRelative(-7.17f, -7.323f)
                arcToRelative(0.805f, 0.805f, 0.0f, false, true, 0.029f, -1.168f)
                lineToRelative(0.02f, -0.017f)
                arcToRelative(0.928f, 0.928f, 0.0f, false, true, 1.257f, 0.048f)
                lineToRelative(6.516f, 6.651f)
                lineToRelative(6.393f, -6.646f)
                arcToRelative(0.928f, 0.928f, 0.0f, false, true, 1.257f, -0.055f)
                curveToRelative(0.182f, 0.156f, 0.289f, 0.382f, 0.291f, 0.619f)
            }
        }
        .build()
        return _chevronDownRegular!!
    }

private var _chevronDownRegular: ImageVector? = null
