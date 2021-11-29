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

public val RegularGroup.FlagRegular: ImageVector
    get() {
        if (_flagRegular != null) {
            return _flagRegular!!
        }
        _flagRegular = Builder(name = "FlagRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.728f, 11.527f)
                arcToRelative(0.153f, 0.153f, 0.0f, false, true, -0.143f, 0.09f)
                lineTo(4.838f, 11.617f)
                verticalLineToRelative(-8.28f)
                curveToRelative(0.0f, -0.088f, 0.07f, -0.158f, 0.16f, -0.158f)
                horizontalLineToRelative(14.59f)
                curveToRelative(0.087f, 0.0f, 0.126f, 0.056f, 0.143f, 0.09f)
                curveToRelative(0.02f, 0.042f, 0.034f, 0.1f, 0.034f, 0.11f)
                lineToRelative(-3.101f, 3.086f)
                arcToRelative(1.317f, 1.317f, 0.0f, false, false, -0.003f, 1.852f)
                lineToRelative(3.05f, 3.044f)
                curveToRelative(0.05f, 0.065f, 0.037f, 0.126f, 0.017f, 0.166f)
                close()
                moveTo(17.488f, 7.507f)
                curveToRelative(-0.065f, -0.067f, -0.068f, -0.168f, -0.003f, -0.23f)
                lineToRelative(3.148f, -3.145f)
                curveToRelative(0.305f, -0.398f, 0.359f, -0.925f, 0.135f, -1.376f)
                arcToRelative(1.31f, 1.31f, 0.0f, false, false, -1.183f, -0.73f)
                lineTo(4.995f, 2.026f)
                curveToRelative(-0.726f, 0.0f, -1.317f, 0.587f, -1.317f, 1.307f)
                verticalLineToRelative(17.801f)
                curveToRelative(0.0f, 0.317f, 0.26f, 0.575f, 0.58f, 0.575f)
                curveToRelative(0.319f, 0.0f, 0.58f, -0.258f, 0.58f, -0.575f)
                verticalLineToRelative(-8.37f)
                horizontalLineToRelative(14.747f)
                curveToRelative(0.505f, 0.0f, 0.958f, -0.28f, 1.183f, -0.73f)
                curveToRelative(0.224f, -0.451f, 0.17f, -0.978f, -0.183f, -1.432f)
                lineToRelative(-3.098f, -3.095f)
                close()
            }
        }
        .build()
        return _flagRegular!!
    }

private var _flagRegular: ImageVector? = null
