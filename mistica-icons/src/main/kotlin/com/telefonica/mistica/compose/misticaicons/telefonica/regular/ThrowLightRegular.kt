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

public val RegularGroup.ThrowLightRegular: ImageVector
    get() {
        if (_throwLightRegular != null) {
            return _throwLightRegular!!
        }
        _throwLightRegular = Builder(name = "ThrowLightRegular", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.456f, 3.28f)
                arcToRelative(0.28f, 0.28f, 0.0f, false, true, 0.28f, 0.28f)
                verticalLineToRelative(7.586f)
                arcToRelative(0.28f, 0.28f, 0.0f, false, true, -0.28f, 0.28f)
                horizontalLineToRelative(-0.003f)
                arcToRelative(0.274f, 0.274f, 0.0f, false, true, -0.196f, -0.084f)
                lineToRelative(-1.292f, -1.291f)
                lineToRelative(-0.204f, -0.205f)
                curveToRelative(-0.07f, 0.062f, -0.14f, 0.124f, -0.204f, 0.194f)
                lineToRelative(-6.816f, 6.817f)
                arcToRelative(0.279f, 0.279f, 0.0f, false, true, -0.395f, 0.0f)
                lineTo(7.148f, 12.66f)
                arcToRelative(0.279f, 0.279f, 0.0f, false, true, 0.0f, -0.395f)
                lineToRelative(6.815f, -6.815f)
                arcToRelative(0.279f, 0.279f, 0.0f, false, false, 0.0f, -0.395f)
                lineTo(12.67f, 3.762f)
                arcToRelative(0.279f, 0.279f, 0.0f, false, true, 0.2f, -0.476f)
                horizontalLineToRelative(7.585f)
                moveToRelative(0.0f, -1.126f)
                lineTo(12.87f, 2.16f)
                arcToRelative(1.401f, 1.401f, 0.0f, false, false, -0.991f, 2.392f)
                lineToRelative(0.697f, 0.698f)
                lineToRelative(-6.221f, 6.22f)
                arcToRelative(1.402f, 1.402f, 0.0f, false, false, 0.0f, 1.981f)
                lineToRelative(4.196f, 4.2f)
                arcToRelative(1.402f, 1.402f, 0.0f, false, false, 1.98f, 0.0f)
                lineToRelative(6.222f, -6.225f)
                lineToRelative(0.708f, 0.712f)
                curveToRelative(0.26f, 0.263f, 0.617f, 0.411f, 0.99f, 0.411f)
                curveToRelative(0.772f, 0.0f, 1.4f, -0.627f, 1.402f, -1.4f)
                lineTo(21.853f, 3.56f)
                curveToRelative(0.0f, -0.774f, -0.624f, -1.401f, -1.397f, -1.401f)
                close()
                moveTo(2.716f, 21.849f)
                arcToRelative(0.56f, 0.56f, 0.0f, false, true, -0.395f, -0.958f)
                lineToRelative(4.633f, -4.633f)
                arcToRelative(0.561f, 0.561f, 0.0f, false, true, 0.807f, 0.779f)
                lineToRelative(-0.014f, 0.014f)
                lineToRelative(-4.636f, 4.633f)
                arcToRelative(0.55f, 0.55f, 0.0f, false, true, -0.395f, 0.165f)
                close()
                moveTo(7.753f, 21.852f)
                arcToRelative(0.562f, 0.562f, 0.0f, false, true, -0.56f, -0.56f)
                arcToRelative(0.55f, 0.55f, 0.0f, false, true, 0.165f, -0.395f)
                curveToRelative(1.042f, -1.042f, 2.271f, -2.328f, 2.285f, -2.342f)
                arcToRelative(0.562f, 0.562f, 0.0f, false, true, 0.821f, 0.765f)
                arcToRelative(164.002f, 164.002f, 0.0f, false, true, -2.31f, 2.37f)
                arcToRelative(0.583f, 0.583f, 0.0f, false, true, -0.401f, 0.162f)
                close()
                moveTo(2.767f, 16.866f)
                arcToRelative(0.562f, 0.562f, 0.0f, false, true, -0.398f, -0.955f)
                curveToRelative(1.042f, -1.042f, 2.272f, -2.328f, 2.286f, -2.342f)
                arcToRelative(0.562f, 0.562f, 0.0f, true, true, 0.812f, 0.776f)
                curveToRelative(-0.011f, 0.014f, -1.252f, 1.308f, -2.303f, 2.358f)
                arcToRelative(0.571f, 0.571f, 0.0f, false, true, -0.397f, 0.163f)
                close()
            }
        }
        .build()
        return _throwLightRegular!!
    }

private var _throwLightRegular: ImageVector? = null
