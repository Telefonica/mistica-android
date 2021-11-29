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

public val LightGroup.ReloadLight: ImageVector
    get() {
        if (_reloadLight != null) {
            return _reloadLight!!
        }
        _reloadLight = Builder(name = "ReloadLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.496f, 2.196f)
                arcToRelative(0.615f, 0.615f, 0.0f, false, false, -0.647f, 0.112f)
                lineToRelative(-2.818f, 2.673f)
                arcToRelative(9.88f, 9.88f, 0.0f, false, false, -6.075f, -2.017f)
                curveToRelative(-4.958f, -0.009f, -9.138f, 3.557f, -9.734f, 8.302f)
                curveToRelative(-0.597f, 4.745f, 2.585f, 9.171f, 7.4f, 10.3f)
                curveToRelative(4.815f, 1.129f, 9.748f, -1.392f, 11.482f, -5.871f)
                arcToRelative(0.552f, 0.552f, 0.0f, false, false, -0.336f, -0.714f)
                arcToRelative(0.597f, 0.597f, 0.0f, false, false, -0.445f, 0.01f)
                arcToRelative(0.568f, 0.568f, 0.0f, false, false, -0.306f, 0.315f)
                curveToRelative(-1.308f, 3.358f, -4.703f, 5.529f, -8.42f, 5.383f)
                curveToRelative(-3.717f, -0.145f, -6.919f, -2.577f, -7.935f, -6.025f)
                curveToRelative(-1.02f, -3.45f, 0.372f, -7.143f, 3.45f, -9.154f)
                curveToRelative(3.079f, -2.011f, 7.152f, -1.893f, 10.099f, 0.297f)
                lineToRelative(-2.6f, 2.473f)
                arcToRelative(0.54f, 0.54f, 0.0f, false, false, -0.134f, 0.611f)
                curveToRelative(0.09f, 0.21f, 0.302f, 0.347f, 0.537f, 0.347f)
                lineToRelative(5.916f, -0.355f)
                arcToRelative(0.569f, 0.569f, 0.0f, false, false, 0.544f, -0.524f)
                lineToRelative(0.358f, -5.569f)
                arcToRelative(0.574f, 0.574f, 0.0f, false, false, -0.336f, -0.594f)
                close()
            }
        }
        .build()
        return _reloadLight!!
    }

private var _reloadLight: ImageVector? = null
