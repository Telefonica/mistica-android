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

public val RegularGroup.LightningRegular: ImageVector
    get() {
        if (_lightningRegular != null) {
            return _lightningRegular!!
        }
        _lightningRegular = Builder(name = "LightningRegular", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(9.875f, 18.698f)
                lineToRelative(1.893f, -4.944f)
                arcToRelative(0.639f, 0.639f, 0.0f, false, false, -0.025f, -0.507f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, false, -0.39f, -0.314f)
                lineToRelative(-3.767f, -0.932f)
                lineToRelative(6.05f, -6.496f)
                lineToRelative(-1.815f, 4.605f)
                arcToRelative(0.633f, 0.633f, 0.0f, false, false, 0.023f, 0.51f)
                curveToRelative(0.078f, 0.16f, 0.221f, 0.274f, 0.39f, 0.316f)
                lineToRelative(4.145f, 1.023f)
                lineToRelative(-6.504f, 6.739f)
                close()
                moveTo(18.121f, 11.452f)
                arcToRelative(0.605f, 0.605f, 0.0f, false, false, -0.434f, -0.429f)
                lineToRelative(-4.501f, -1.11f)
                lineToRelative(2.72f, -6.904f)
                arcToRelative(0.624f, 0.624f, 0.0f, false, false, -0.23f, -0.745f)
                arcToRelative(0.582f, 0.582f, 0.0f, false, false, -0.754f, 0.09f)
                lineToRelative(-8.916f, 9.57f)
                arcToRelative(0.626f, 0.626f, 0.0f, false, false, -0.143f, 0.598f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, false, 0.432f, 0.423f)
                lineToRelative(4.112f, 1.016f)
                lineToRelative(-2.7f, 7.05f)
                arcToRelative(0.618f, 0.618f, 0.0f, false, false, 0.23f, 0.737f)
                arcToRelative(0.584f, 0.584f, 0.0f, false, false, 0.747f, -0.078f)
                lineToRelative(9.286f, -9.619f)
                arcToRelative(0.627f, 0.627f, 0.0f, false, false, 0.151f, -0.6f)
                close()
            }
        }
        .build()
        return _lightningRegular!!
    }

private var _lightningRegular: ImageVector? = null
