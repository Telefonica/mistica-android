package com.telefonica.mistica.compose.misticaicons.telefonica.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.telefonica.LightGroup

public val LightGroup.PendriveLight: ImageVector
    get() {
        if (_pendriveLight != null) {
            return _pendriveLight!!
        }
        _pendriveLight = Builder(name = "PendriveLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.294f, 11.33f)
                curveToRelative(0.504f, 0.0f, 0.829f, 0.27f, 0.829f, 0.85f)
                curveToRelative(0.0f, 0.28f, -0.076f, 0.484f, -0.21f, 0.624f)
                curveToRelative(-0.146f, 0.151f, -0.359f, 0.224f, -0.622f, 0.224f)
                curveToRelative(-0.26f, 0.0f, -0.476f, -0.073f, -0.62f, -0.224f)
                curveToRelative(-0.134f, -0.14f, -0.21f, -0.347f, -0.21f, -0.624f)
                curveToRelative(0.0f, -0.58f, 0.331f, -0.85f, 0.833f, -0.85f)
                close()
                moveTo(21.022f, 14.297f)
                verticalLineToRelative(-4.72f)
                curveToRelative(-0.009f, -0.417f, -0.325f, -0.767f, -0.717f, -0.798f)
                horizontalLineToRelative(-1.762f)
                verticalLineToRelative(6.32f)
                horizontalLineToRelative(1.717f)
                curveToRelative(0.42f, 0.0f, 0.762f, -0.36f, 0.762f, -0.802f)
                close()
                moveTo(17.733f, 15.729f)
                verticalLineToRelative(-0.208f)
                horizontalLineToRelative(-0.014f)
                verticalLineToRelative(-7.33f)
                curveToRelative(0.0f, -0.622f, -0.482f, -1.124f, -1.075f, -1.124f)
                lineTo(7.397f, 7.067f)
                curveToRelative(-2.927f, 0.096f, -4.42f, 1.74f, -4.42f, 4.886f)
                curveToRelative(0.0f, 3.143f, 1.49f, 4.792f, 4.434f, 4.902f)
                horizontalLineToRelative(9.247f)
                curveToRelative(0.593f, 0.0f, 1.075f, -0.505f, 1.075f, -1.126f)
                close()
                moveTo(20.246f, 7.927f)
                curveToRelative(0.863f, 0.0f, 1.58f, 0.734f, 1.597f, 1.642f)
                verticalLineToRelative(4.728f)
                curveToRelative(0.0f, 0.908f, -0.712f, 1.65f, -1.583f, 1.65f)
                horizontalLineToRelative(-1.714f)
                curveToRelative(-0.104f, 0.986f, -0.91f, 1.756f, -1.888f, 1.756f)
                horizontalLineToRelative(-9.26f)
                curveToRelative(-3.385f, -0.126f, -5.242f, -2.168f, -5.242f, -5.75f)
                curveToRelative(0.0f, -3.589f, 1.857f, -5.625f, 5.23f, -5.734f)
                horizontalLineToRelative(9.26f)
                curveToRelative(0.961f, 0.0f, 1.757f, 0.745f, 1.88f, 1.711f)
                horizontalLineToRelative(0.952f)
                lineToRelative(-0.002f, -0.003f)
                horizontalLineToRelative(0.77f)
                close()
            }
        }
        .build()
        return _pendriveLight!!
    }

private var _pendriveLight: ImageVector? = null
