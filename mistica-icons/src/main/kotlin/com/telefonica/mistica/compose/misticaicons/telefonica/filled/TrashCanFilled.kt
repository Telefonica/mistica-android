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

public val FilledGroup.TrashCanFilled: ImageVector
    get() {
        if (_trashCanFilled != null) {
            return _trashCanFilled!!
        }
        _trashCanFilled = Builder(name = "TrashCanFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.347f, 6.137f)
                horizontalLineToRelative(-7.01f)
                lineTo(8.337f, 4.325f)
                curveToRelative(0.0f, -0.423f, 0.092f, -0.728f, 0.276f, -0.9f)
                curveToRelative(0.233f, -0.212f, 0.57f, -0.193f, 0.628f, -0.19f)
                lineToRelative(5.188f, -0.003f)
                curveToRelative(0.3f, 0.0f, 0.515f, 0.073f, 0.66f, 0.227f)
                curveToRelative(0.236f, 0.25f, 0.267f, 0.69f, 0.258f, 0.877f)
                verticalLineToRelative(1.801f)
                close()
                moveTo(14.5f, 17.011f)
                arcToRelative(0.601f, 0.601f, 0.0f, true, true, -1.205f, 0.0f)
                lineTo(13.295f, 10.85f)
                arcToRelative(0.601f, 0.601f, 0.0f, true, true, 1.205f, 0.0f)
                verticalLineToRelative(6.162f)
                close()
                moveTo(10.39f, 17.011f)
                arcToRelative(0.601f, 0.601f, 0.0f, true, true, -1.204f, 0.0f)
                lineTo(9.186f, 10.85f)
                arcToRelative(0.601f, 0.601f, 0.0f, true, true, 1.204f, 0.0f)
                verticalLineToRelative(6.162f)
                close()
                moveTo(21.084f, 6.137f)
                horizontalLineToRelative(-4.535f)
                lineTo(16.549f, 4.375f)
                curveToRelative(0.008f, -0.106f, 0.053f, -1.058f, -0.577f, -1.734f)
                curveToRelative(-0.26f, -0.28f, -0.74f, -0.613f, -1.543f, -0.613f)
                lineToRelative(-5.13f, 0.006f)
                curveToRelative(-0.086f, -0.014f, -0.865f, -0.07f, -1.484f, 0.493f)
                curveToRelative(-0.45f, 0.409f, -0.68f, 1.014f, -0.68f, 1.798f)
                verticalLineToRelative(1.812f)
                lineTo(2.601f, 6.137f)
                arcToRelative(0.601f, 0.601f, 0.0f, true, false, 0.0f, 1.205f)
                lineTo(4.06f, 7.342f)
                lineToRelative(0.003f, 11.087f)
                curveToRelative(-0.003f, 0.056f, -0.084f, 1.397f, 0.815f, 2.358f)
                curveToRelative(0.574f, 0.614f, 1.392f, 0.927f, 2.428f, 0.927f)
                horizontalLineToRelative(9.042f)
                curveToRelative(0.006f, 0.0f, 0.028f, 0.003f, 0.065f, 0.003f)
                curveToRelative(0.291f, 0.0f, 1.456f, -0.053f, 2.31f, -0.871f)
                curveToRelative(0.603f, -0.577f, 0.908f, -1.381f, 0.908f, -2.39f)
                lineTo(19.631f, 7.343f)
                horizontalLineToRelative(1.457f)
                curveToRelative(0.33f, 0.0f, 0.602f, -0.27f, 0.602f, -0.603f)
                arcToRelative(0.607f, 0.607f, 0.0f, false, false, -0.605f, -0.602f)
                close()
            }
        }
        .build()
        return _trashCanFilled!!
    }

private var _trashCanFilled: ImageVector? = null
