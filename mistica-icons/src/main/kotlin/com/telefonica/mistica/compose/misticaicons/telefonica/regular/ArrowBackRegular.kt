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

public val RegularGroup.ArrowBackRegular: ImageVector
    get() {
        if (_arrowBackRegular != null) {
            return _arrowBackRegular!!
        }
        _arrowBackRegular = Builder(name = "ArrowBackRegular", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.315f, 11.375f)
                horizontalLineTo(6.277f)
                lineToRelative(5.885f, -6.228f)
                arcToRelative(0.688f, 0.688f, 0.0f, false, false, -0.05f, -0.97f)
                arcToRelative(0.684f, 0.684f, 0.0f, false, false, -0.948f, 0.027f)
                lineTo(4.187f, 11.59f)
                curveToRelative(-0.03f, 0.032f, -0.046f, 0.073f, -0.07f, 0.11f)
                curveToRelative(-0.024f, 0.033f, -0.051f, 0.065f, -0.067f, 0.104f)
                arcToRelative(0.71f, 0.71f, 0.0f, false, false, -0.05f, 0.257f)
                verticalLineToRelative(0.005f)
                curveToRelative(0.002f, 0.086f, 0.02f, 0.17f, 0.052f, 0.253f)
                curveToRelative(0.016f, 0.04f, 0.044f, 0.073f, 0.069f, 0.107f)
                curveToRelative(0.022f, 0.034f, 0.036f, 0.075f, 0.066f, 0.107f)
                lineToRelative(6.852f, 7.252f)
                curveToRelative(0.26f, 0.276f, 0.692f, 0.29f, 0.968f, 0.03f)
                curveToRelative(0.0f, 0.0f, 0.002f, 0.0f, 0.002f, -0.003f)
                arcToRelative(0.687f, 0.687f, 0.0f, false, false, 0.027f, -0.97f)
                lineToRelative(-5.76f, -6.095f)
                horizontalLineToRelative(13.039f)
                arcToRelative(0.687f, 0.687f, 0.0f, false, false, 0.0f, -1.371f)
            }
        }
        .build()
        return _arrowBackRegular!!
    }

private var _arrowBackRegular: ImageVector? = null
