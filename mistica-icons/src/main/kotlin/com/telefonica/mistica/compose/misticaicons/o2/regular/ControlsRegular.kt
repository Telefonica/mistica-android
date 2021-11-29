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

public val RegularGroup.ControlsRegular: ImageVector
    get() {
        if (_controlsRegular != null) {
            return _controlsRegular!!
        }
        _controlsRegular = Builder(name = "ControlsRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.496f, 22.0f)
                curveToRelative(-1.169f, 0.0f, -2.125f, -0.996f, -2.125f, -2.224f)
                verticalLineToRelative(-4.443f)
                lineTo(4.085f, 3.091f)
                arcToRelative(0.76f, 0.76f, 0.0f, false, true, 0.018f, -0.73f)
                arcTo(0.702f, 0.702f, 0.0f, false, true, 4.71f, 2.0f)
                horizontalLineToRelative(15.582f)
                curveToRelative(0.249f, 0.0f, 0.48f, 0.138f, 0.607f, 0.36f)
                arcToRelative(0.772f, 0.772f, 0.0f, false, true, 0.018f, 0.73f)
                lineToRelative(-6.295f, 12.243f)
                verticalLineToRelative(4.443f)
                curveToRelative(0.0f, 1.228f, -0.956f, 2.224f, -2.126f, 2.224f)
                close()
                moveTo(5.893f, 3.48f)
                lineToRelative(5.81f, 11.318f)
                curveToRelative(0.055f, 0.109f, 0.086f, 0.227f, 0.086f, 0.35f)
                verticalLineToRelative(4.633f)
                curveToRelative(0.0f, 0.408f, 0.318f, 0.74f, 0.707f, 0.74f)
                curveToRelative(0.39f, 0.0f, 0.707f, -0.332f, 0.707f, -0.74f)
                verticalLineToRelative(-4.633f)
                arcToRelative(0.73f, 0.73f, 0.0f, false, true, 0.086f, -0.35f)
                lineTo(19.1f, 3.479f)
                horizontalLineTo(5.894f)
                close()
            }
        }
        .build()
        return _controlsRegular!!
    }

private var _controlsRegular: ImageVector? = null
