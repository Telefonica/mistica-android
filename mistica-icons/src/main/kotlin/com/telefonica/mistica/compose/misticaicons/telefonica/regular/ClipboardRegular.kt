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

public val RegularGroup.ClipboardRegular: ImageVector
    get() {
        if (_clipboardRegular != null) {
            return _clipboardRegular!!
        }
        _clipboardRegular = Builder(name = "ClipboardRegular", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.772f, 20.667f)
                curveToRelative(0.233f, 0.0f, 0.401f, -0.126f, 0.426f, -0.17f)
                lineToRelative(-0.008f, -15.6f)
                curveToRelative(0.0f, 0.014f, -0.193f, -0.13f, -0.418f, -0.13f)
                horizontalLineToRelative(-2.647f)
                curveToRelative(0.003f, 0.029f, 0.009f, 0.054f, 0.012f, 0.085f)
                lineToRelative(0.002f, 0.078f)
                lineToRelative(0.003f, 0.115f)
                lineToRelative(-0.003f, 0.107f)
                curveToRelative(-0.05f, 1.51f, -1.543f, 1.722f, -3.145f, 1.722f)
                reflectiveCurveTo(8.9f, 6.661f, 8.845f, 5.126f)
                verticalLineToRelative(-0.08f)
                lineToRelative(0.003f, -0.127f)
                lineToRelative(0.006f, -0.1f)
                curveToRelative(0.0f, -0.02f, 0.005f, -0.034f, 0.008f, -0.054f)
                horizontalLineToRelative(-2.65f)
                curveToRelative(-0.215f, 0.0f, -0.398f, 0.132f, -0.428f, 0.185f)
                lineToRelative(0.01f, 15.588f)
                curveToRelative(0.018f, 0.003f, 0.186f, 0.129f, 0.418f, 0.129f)
                horizontalLineToRelative(11.56f)
                close()
                moveTo(11.994f, 3.339f)
                curveToRelative(-1.673f, 0.0f, -1.925f, 0.838f, -1.958f, 1.569f)
                lineToRelative(-0.006f, 0.14f)
                curveToRelative(0.011f, 0.269f, 0.023f, 0.653f, 1.964f, 0.653f)
                curveToRelative(1.94f, 0.0f, 1.952f, -0.384f, 1.96f, -0.614f)
                lineTo(13.954f, 4.97f)
                arcToRelative(2.384f, 2.384f, 0.0f, false, false, -0.098f, -0.628f)
                curveToRelative(-0.078f, -0.25f, -0.313f, -1.003f, -1.862f, -1.003f)
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
        return _clipboardRegular!!
    }

private var _clipboardRegular: ImageVector? = null
