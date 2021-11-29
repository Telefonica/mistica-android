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

public val FilledGroup.PendriveFilled: ImageVector
    get() {
        if (_pendriveFilled != null) {
            return _pendriveFilled!!
        }
        _pendriveFilled = Builder(name = "PendriveFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.639f, 14.214f)
                lineTo(20.639f, 9.663f)
                arcToRelative(0.58f, 0.58f, 0.0f, false, false, -0.51f, -0.566f)
                horizontalLineToRelative(-1.515f)
                verticalLineToRelative(5.686f)
                horizontalLineToRelative(1.482f)
                arcToRelative(0.56f, 0.56f, 0.0f, false, false, 0.543f, -0.569f)
                close()
                moveTo(20.082f, 7.864f)
                curveToRelative(0.952f, 0.0f, 1.745f, 0.799f, 1.764f, 1.782f)
                verticalLineToRelative(4.566f)
                curveToRelative(0.0f, 0.988f, -0.784f, 1.795f, -1.75f, 1.795f)
                horizontalLineToRelative(-1.51f)
                curveToRelative(-0.188f, 0.964f, -1.023f, 1.695f, -2.02f, 1.695f)
                horizontalLineToRelative(-9.07f)
                curveToRelative(-3.448f, -0.126f, -5.336f, -2.168f, -5.336f, -5.748f)
                curveToRelative(0.0f, -3.588f, 1.888f, -5.625f, 5.317f, -5.734f)
                horizontalLineToRelative(9.075f)
                curveToRelative(0.983f, 0.0f, 1.807f, 0.709f, 2.011f, 1.65f)
                horizontalLineToRelative(0.678f)
                verticalLineToRelative(-0.003f)
                horizontalLineToRelative(0.84f)
                verticalLineToRelative(-0.003f)
                close()
                moveTo(6.519f, 11.136f)
                curveToRelative(-0.558f, 0.0f, -0.92f, 0.294f, -0.92f, 0.927f)
                curveToRelative(0.0f, 0.305f, 0.085f, 0.53f, 0.233f, 0.684f)
                curveToRelative(0.163f, 0.165f, 0.398f, 0.246f, 0.687f, 0.246f)
                curveToRelative(0.288f, 0.0f, 0.526f, -0.081f, 0.686f, -0.246f)
                curveToRelative(0.148f, -0.154f, 0.232f, -0.379f, 0.232f, -0.684f)
                curveToRelative(0.003f, -0.633f, -0.361f, -0.927f, -0.918f, -0.927f)
                close()
            }
        }
        .build()
        return _pendriveFilled!!
    }

private var _pendriveFilled: ImageVector? = null
