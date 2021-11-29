package com.telefonica.mistica.compose.misticaicons.telefonica.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.telefonica.FilledGroup

public val FilledGroup.PillsFilled: ImageVector
    get() {
        if (_pillsFilled != null) {
            return _pillsFilled!!
        }
        _pillsFilled = Builder(name = "PillsFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.099f, 20.6f)
                curveToRelative(-2.852f, 0.0f, -4.275f, -1.255f, -4.465f, -3.894f)
                horizontalLineToRelative(8.933f)
                curveToRelative(-0.194f, 2.641f, -1.616f, 3.893f, -4.468f, 3.893f)
                close()
                moveTo(11.746f, 5.296f)
                curveToRelative(0.078f, -0.09f, 0.165f, -0.171f, 0.252f, -0.255f)
                lineToRelative(0.163f, -0.157f)
                curveToRelative(1.972f, -1.977f, 3.888f, -1.975f, 5.857f, 0.0f)
                curveToRelative(1.91f, 1.913f, 1.96f, 3.776f, 0.17f, 5.686f)
                arcToRelative(8.166f, 8.166f, 0.0f, false, false, -2.086f, -0.249f)
                curveToRelative(-2.19f, 0.0f, -3.729f, 0.664f, -4.658f, 1.888f)
                curveToRelative(-0.149f, -0.134f, -0.297f, -0.266f, -0.449f, -0.417f)
                curveToRelative(-1.512f, -1.516f, -2.106f, -2.84f, -1.767f, -3.933f)
                curveToRelative(0.005f, -0.014f, 0.0f, -0.028f, 0.005f, -0.042f)
                lineToRelative(2.513f, -2.521f)
                close()
                moveTo(20.566f, 15.461f)
                horizontalLineToRelative(-8.932f)
                curveToRelative(0.193f, -2.638f, 1.616f, -3.893f, 4.465f, -3.893f)
                curveToRelative(2.852f, 0.0f, 4.274f, 1.252f, 4.468f, 3.893f)
                close()
                moveTo(19.421f, 11.063f)
                curveToRelative(1.913f, -2.302f, 1.737f, -4.79f, -0.527f, -7.058f)
                curveToRelative(-2.453f, -2.46f, -5.16f, -2.463f, -7.613f, 0.0f)
                lineToRelative(-0.143f, 0.137f)
                curveToRelative(-0.117f, 0.112f, -0.232f, 0.221f, -0.302f, 0.308f)
                lineToRelative(-6.359f, 6.378f)
                curveToRelative(-0.118f, 0.101f, -0.23f, 0.219f, -0.342f, 0.336f)
                lineToRelative(-0.137f, 0.14f)
                curveToRelative(-1.199f, 1.2f, -1.815f, 2.46f, -1.837f, 3.74f)
                curveToRelative(-0.023f, 1.33f, 0.596f, 2.638f, 1.843f, 3.888f)
                curveToRelative(1.23f, 1.235f, 2.526f, 1.851f, 3.82f, 1.851f)
                curveToRelative(1.11f, 0.0f, 2.213f, -0.46f, 3.272f, -1.367f)
                curveToRelative(0.869f, 1.563f, 2.513f, 2.426f, 5.006f, 2.426f)
                curveToRelative(3.916f, 0.0f, 5.748f, -2.126f, 5.748f, -5.762f)
                curveToRelative(-0.003f, -2.38f, -0.79f, -4.106f, -2.429f, -5.017f)
                close()
            }
        }
        .build()
        return _pillsFilled!!
    }

private var _pillsFilled: ImageVector? = null
