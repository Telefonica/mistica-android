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

public val RegularGroup.OpenFileRegular: ImageVector
    get() {
        if (_openFileRegular != null) {
            return _openFileRegular!!
        }
        _openFileRegular = Builder(name = "OpenFileRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.03f, 17.82f)
                arcToRelative(0.507f, 0.507f, 0.0f, false, false, -0.01f, 0.111f)
                curveToRelative(0.0f, 0.06f, -0.048f, 0.104f, -0.11f, 0.104f)
                lineTo(4.14f, 18.035f)
                arcToRelative(0.11f, 0.11f, 0.0f, false, true, -0.104f, -0.073f)
                lineToRelative(1.463f, -7.91f)
                curveToRelative(0.005f, -0.04f, 0.01f, -0.076f, 0.01f, -0.115f)
                curveToRelative(0.0f, -0.059f, 0.048f, -0.104f, 0.11f, -0.104f)
                horizontalLineToRelative(14.75f)
                curveToRelative(0.051f, 0.0f, 0.09f, 0.031f, 0.104f, 0.073f)
                lineToRelative(-1.442f, 7.913f)
                close()
                moveTo(3.444f, 5.774f)
                lineTo(9.57f, 5.774f)
                curveToRelative(0.107f, 0.0f, 0.18f, 0.064f, 0.18f, 0.123f)
                verticalLineToRelative(1.028f)
                curveToRelative(0.0f, 0.344f, 0.277f, 0.624f, 0.619f, 0.624f)
                horizontalLineToRelative(7.722f)
                curveToRelative(0.107f, 0.0f, 0.18f, 0.065f, 0.183f, 0.174f)
                lineToRelative(0.064f, 0.86f)
                verticalLineToRelative(0.003f)
                lineTo(5.619f, 8.586f)
                curveToRelative(-0.72f, 0.0f, -1.31f, 0.571f, -1.344f, 1.288f)
                lineToRelative(-0.558f, 3.02f)
                lineToRelative(-0.451f, -6.994f)
                curveToRelative(-0.003f, -0.062f, 0.07f, -0.126f, 0.177f, -0.126f)
                close()
                moveTo(20.368f, 8.583f)
                horizontalLineToRelative(-0.807f)
                curveToRelative(0.003f, -0.034f, 0.014f, -0.064f, 0.011f, -0.098f)
                lineToRelative(-0.064f, -0.812f)
                curveToRelative(0.0f, -0.757f, -0.636f, -1.376f, -1.417f, -1.376f)
                horizontalLineToRelative(-7.104f)
                verticalLineToRelative(-0.403f)
                curveToRelative(0.0f, -0.756f, -0.636f, -1.375f, -1.417f, -1.375f)
                horizontalLineToRelative(-6.13f)
                curveToRelative(-0.78f, 0.0f, -1.414f, 0.616f, -1.414f, 1.414f)
                lineToRelative(0.77f, 11.95f)
                curveToRelative(0.0f, 0.014f, -0.005f, 0.028f, -0.005f, 0.045f)
                curveToRelative(0.0f, 0.747f, 0.605f, 1.355f, 1.347f, 1.355f)
                horizontalLineToRelative(14.77f)
                curveToRelative(0.72f, 0.0f, 1.311f, -0.574f, 1.345f, -1.288f)
                lineToRelative(1.448f, -7.947f)
                arcToRelative(0.507f, 0.507f, 0.0f, false, false, 0.011f, -0.112f)
                arcToRelative(1.348f, 1.348f, 0.0f, false, false, -1.344f, -1.353f)
                close()
            }
        }
        .build()
        return _openFileRegular!!
    }

private var _openFileRegular: ImageVector? = null
