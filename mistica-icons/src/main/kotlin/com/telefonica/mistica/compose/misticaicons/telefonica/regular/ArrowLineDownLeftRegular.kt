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

public val RegularGroup.ArrowLineDownLeftRegular: ImageVector
    get() {
        if (_arrowLineDownLeftRegular != null) {
            return _arrowLineDownLeftRegular!!
        }
        _arrowLineDownLeftRegular = Builder(name = "ArrowLineDownLeftRegular", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(7.48f, 15.573f)
                lineToRelative(0.061f, -8.568f)
                arcToRelative(0.688f, 0.688f, 0.0f, false, false, -0.721f, -0.65f)
                arcToRelative(0.684f, 0.684f, 0.0f, false, false, -0.65f, 0.688f)
                lineToRelative(-0.017f, 10.16f)
                curveToRelative(0.002f, 0.043f, 0.02f, 0.083f, 0.027f, 0.127f)
                curveToRelative(0.008f, 0.04f, 0.012f, 0.082f, 0.028f, 0.12f)
                arcToRelative(0.71f, 0.71f, 0.0f, false, false, 0.146f, 0.218f)
                curveToRelative(0.066f, 0.063f, 0.139f, 0.11f, 0.22f, 0.145f)
                curveToRelative(0.04f, 0.018f, 0.082f, 0.021f, 0.123f, 0.027f)
                curveToRelative(0.04f, 0.009f, 0.08f, 0.028f, 0.123f, 0.03f)
                lineToRelative(9.973f, 0.045f)
                arcToRelative(0.684f, 0.684f, 0.0f, false, false, 0.706f, -0.663f)
                verticalLineToRelative(-0.004f)
                arcToRelative(0.687f, 0.687f, 0.0f, false, false, -0.667f, -0.705f)
                horizontalLineTo(8.449f)
                lineToRelative(9.22f, -9.22f)
                arcToRelative(0.687f, 0.687f, 0.0f, false, false, -0.97f, -0.969f)
                lineToRelative(-9.22f, 9.22f)
                close()
            }
        }
        .build()
        return _arrowLineDownLeftRegular!!
    }

private var _arrowLineDownLeftRegular: ImageVector? = null
