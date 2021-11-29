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

public val FilledGroup.MouseFilled: ImageVector
    get() {
        if (_mouseFilled != null) {
            return _mouseFilled!!
        }
        _mouseFilled = Builder(name = "MouseFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.489f, 2.16f)
                arcToRelative(0.55f, 0.55f, 0.0f, false, true, 0.549f, 0.549f)
                curveToRelative(0.0f, 0.888f, 1.064f, 1.204f, 2.062f, 1.204f)
                horizontalLineToRelative(1.918f)
                curveToRelative(0.869f, 0.0f, 1.544f, 0.39f, 1.9f, 1.096f)
                curveToRelative(0.254f, 0.501f, 0.26f, 0.989f, 0.26f, 1.045f)
                lineToRelative(0.001f, 0.37f)
                curveToRelative(1.502f, 0.09f, 2.693f, 0.545f, 3.545f, 1.352f)
                curveToRelative(0.995f, 0.95f, 1.502f, 2.356f, 1.502f, 4.185f)
                verticalLineToRelative(4.311f)
                curveToRelative(0.0f, 1.896f, -0.44f, 3.263f, -1.345f, 4.174f)
                curveToRelative(-0.924f, 0.93f, -2.322f, 1.38f, -4.277f, 1.38f)
                curveToRelative(-1.776f, 0.0f, -3.163f, -0.459f, -4.12f, -1.37f)
                curveToRelative(-0.998f, -0.946f, -1.502f, -2.355f, -1.502f, -4.184f)
                verticalLineToRelative(-4.31f)
                curveToRelative(0.0f, -1.83f, 0.504f, -3.239f, 1.501f, -4.186f)
                curveToRelative(0.86f, -0.816f, 2.07f, -1.272f, 3.598f, -1.356f)
                lineToRelative(0.002f, -0.364f)
                curveToRelative(0.0f, -0.02f, -0.011f, -0.308f, -0.157f, -0.577f)
                curveToRelative(-0.174f, -0.322f, -0.462f, -0.47f, -0.91f, -0.47f)
                horizontalLineToRelative(-1.92f)
                curveToRelative(-0.895f, 0.0f, -1.663f, -0.2f, -2.218f, -0.574f)
                curveToRelative(-0.605f, -0.412f, -0.938f, -1.026f, -0.938f, -1.726f)
                arcToRelative(0.55f, 0.55f, 0.0f, false, true, 0.549f, -0.549f)
                close()
                moveTo(7.993f, 12.642f)
                curveToRelative(-0.277f, -0.031f, -0.532f, 0.115f, -0.571f, 0.322f)
                curveToRelative(-0.04f, 0.207f, 0.154f, 0.4f, 0.431f, 0.428f)
                curveToRelative(1.58f, 0.163f, 3.165f, 0.244f, 4.754f, 0.241f)
                curveToRelative(1.588f, 0.0f, 3.173f, -0.078f, 4.753f, -0.24f)
                curveToRelative(0.277f, -0.029f, 0.47f, -0.222f, 0.432f, -0.43f)
                curveToRelative(-0.04f, -0.206f, -0.295f, -0.35f, -0.572f, -0.321f)
                arcToRelative(44.516f, 44.516f, 0.0f, false, true, -4.613f, 0.232f)
                arcToRelative(44.516f, 44.516f, 0.0f, false, true, -4.614f, -0.232f)
                close()
                moveTo(12.603f, 8.302f)
                arcToRelative(0.55f, 0.55f, 0.0f, false, false, -0.548f, 0.55f)
                verticalLineToRelative(2.877f)
                arcToRelative(0.552f, 0.552f, 0.0f, false, false, 0.549f, 0.549f)
                arcToRelative(0.55f, 0.55f, 0.0f, false, false, 0.549f, -0.55f)
                lineTo(13.153f, 8.853f)
                arcToRelative(0.552f, 0.552f, 0.0f, false, false, -0.55f, -0.55f)
                close()
            }
        }
        .build()
        return _mouseFilled!!
    }

private var _mouseFilled: ImageVector? = null
