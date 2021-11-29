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

public val RegularGroup.ChevronLeftRegular: ImageVector
    get() {
        if (_chevronLeftRegular != null) {
            return _chevronLeftRegular!!
        }
        _chevronLeftRegular = Builder(name = "ChevronLeftRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.161f, 20.0f)
                arcToRelative(0.814f, 0.814f, 0.0f, false, true, -0.564f, -0.23f)
                lineToRelative(-7.32f, -7.05f)
                arcToRelative(0.924f, 0.924f, 0.0f, false, true, -0.044f, -1.273f)
                curveToRelative(0.01f, -0.014f, 0.024f, -0.025f, 0.037f, -0.04f)
                lineToRelative(7.323f, -7.17f)
                arcToRelative(0.805f, 0.805f, 0.0f, false, true, 1.168f, 0.029f)
                lineToRelative(0.017f, 0.02f)
                arcToRelative(0.928f, 0.928f, 0.0f, false, true, -0.048f, 1.257f)
                lineTo(9.079f, 12.06f)
                lineToRelative(6.646f, 6.393f)
                curveToRelative(0.343f, 0.33f, 0.367f, 0.892f, 0.055f, 1.257f)
                arcToRelative(0.828f, 0.828f, 0.0f, false, true, -0.619f, 0.291f)
            }
        }
        .build()
        return _chevronLeftRegular!!
    }

private var _chevronLeftRegular: ImageVector? = null
