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

public val RegularGroup.AlertRegular: ImageVector
    get() {
        if (_alertRegular != null) {
            return _alertRegular!!
        }
        _alertRegular = Builder(name = "AlertRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.888f, 1.0f)
                curveToRelative(0.289f, 0.0f, 0.546f, 0.169f, 0.69f, 0.453f)
                lineToRelative(10.325f, 20.378f)
                reflectiveCurveToRelative(0.0f, 0.003f, 0.003f, 0.003f)
                arcToRelative(0.804f, 0.804f, 0.0f, false, true, -0.022f, 0.794f)
                arcToRelative(0.817f, 0.817f, 0.0f, false, true, -0.702f, 0.372f)
                lineTo(1.817f, 23.0f)
                arcToRelative(0.81f, 0.81f, 0.0f, false, true, -0.702f, -0.372f)
                arcToRelative(0.82f, 0.82f, 0.0f, false, true, -0.025f, -0.794f)
                lineTo(11.2f, 1.456f)
                curveToRelative(0.144f, -0.287f, 0.401f, -0.456f, 0.69f, -0.456f)
                close()
                moveTo(11.895f, 2.816f)
                lineTo(2.49f, 21.775f)
                horizontalLineToRelative(19.008f)
                lineToRelative(-9.604f, -18.96f)
                close()
                moveTo(12.014f, 18.69f)
                curveToRelative(0.395f, 0.0f, 0.62f, 0.225f, 0.62f, 0.619f)
                reflectiveCurveToRelative(-0.229f, 0.619f, -0.62f, 0.619f)
                curveToRelative(-0.392f, 0.0f, -0.62f, -0.225f, -0.62f, -0.62f)
                curveToRelative(0.0f, -0.393f, 0.225f, -0.618f, 0.62f, -0.618f)
                close()
                moveTo(12.014f, 7.726f)
                curveToRelative(0.338f, 0.0f, 0.614f, 0.275f, 0.614f, 0.613f)
                verticalLineToRelative(8.607f)
                arcToRelative(0.614f, 0.614f, 0.0f, false, true, -1.228f, 0.0f)
                lineTo(11.4f, 8.339f)
                curveToRelative(0.0f, -0.338f, 0.275f, -0.613f, 0.614f, -0.613f)
                close()
            }
        }
        .build()
        return _alertRegular!!
    }

private var _alertRegular: ImageVector? = null
