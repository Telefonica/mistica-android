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

public val FilledGroup.ClipboardFilled: ImageVector
    get() {
        if (_clipboardFilled != null) {
            return _clipboardFilled!!
        }
        _clipboardFilled = Builder(name = "ClipboardFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.86f, 4.34f)
                curveToRelative(-0.08f, -0.25f, -0.317f, -1.004f, -1.866f, -1.004f)
                curveToRelative(-1.673f, 0.0f, -1.925f, 0.838f, -1.958f, 1.57f)
                lineToRelative(-0.006f, 0.346f)
                curveToRelative(0.011f, 0.267f, 0.023f, 0.653f, 1.964f, 0.653f)
                curveToRelative(1.94f, 0.0f, 1.952f, -0.384f, 1.96f, -0.61f)
                verticalLineToRelative(-0.323f)
                arcToRelative(2.405f, 2.405f, 0.0f, false, false, -0.095f, -0.633f)
                close()
                moveTo(17.772f, 3.591f)
                curveToRelative(0.855f, 0.0f, 1.603f, 0.611f, 1.603f, 1.306f)
                lineTo(19.375f, 20.54f)
                curveToRelative(0.0f, 0.709f, -0.734f, 1.305f, -1.603f, 1.305f)
                lineTo(6.212f, 21.845f)
                curveToRelative(-0.868f, 0.0f, -1.602f, -0.6f, -1.602f, -1.305f)
                lineTo(4.61f, 4.894f)
                curveToRelative(0.0f, -0.695f, 0.75f, -1.305f, 1.602f, -1.305f)
                horizontalLineToRelative(2.955f)
                curveToRelative(0.471f, -0.914f, 1.443f, -1.429f, 2.827f, -1.429f)
                curveToRelative(1.686f, 0.0f, 2.468f, 0.709f, 2.829f, 1.431f)
                horizontalLineToRelative(2.95f)
                close()
                moveTo(11.296f, 5.291f)
                arcToRelative(0.55f, 0.55f, 0.0f, false, true, -0.552f, -0.548f)
                arcToRelative(0.55f, 0.55f, 0.0f, false, true, 0.552f, -0.55f)
                horizontalLineToRelative(1.392f)
                curveToRelative(0.306f, 0.0f, 0.555f, 0.247f, 0.555f, 0.55f)
                curveToRelative(0.0f, 0.302f, -0.25f, 0.549f, -0.555f, 0.549f)
                horizontalLineToRelative(-1.392f)
                close()
            }
        }
        .build()
        return _clipboardFilled!!
    }

private var _clipboardFilled: ImageVector? = null
