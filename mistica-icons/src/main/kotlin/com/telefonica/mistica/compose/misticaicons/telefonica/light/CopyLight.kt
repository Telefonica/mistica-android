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

public val LightGroup.CopyLight: ImageVector
    get() {
        if (_copyLight != null) {
            return _copyLight!!
        }
        _copyLight = Builder(name = "CopyLight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.022f, 20.59f)
                arcToRelative(0.436f, 0.436f, 0.0f, false, true, -0.434f, 0.435f)
                lineTo(9.15f, 21.025f)
                arcToRelative(0.432f, 0.432f, 0.0f, false, true, -0.432f, -0.435f)
                verticalLineToRelative(-4.31f)
                arcToRelative(0.404f, 0.404f, 0.0f, false, false, -0.045f, -0.18f)
                horizontalLineToRelative(6.174f)
                curveToRelative(0.692f, 0.0f, 1.252f, -0.56f, 1.252f, -1.252f)
                lineTo(16.099f, 8.694f)
                arcToRelative(0.46f, 0.46f, 0.0f, false, false, 0.123f, 0.025f)
                horizontalLineToRelative(4.367f)
                curveToRelative(0.239f, 0.0f, 0.435f, 0.194f, 0.435f, 0.434f)
                lineTo(21.024f, 20.59f)
                horizontalLineToRelative(-0.003f)
                close()
                moveTo(2.977f, 14.848f)
                lineTo(2.977f, 3.408f)
                curveToRelative(0.0f, -0.238f, 0.193f, -0.434f, 0.431f, -0.434f)
                horizontalLineToRelative(11.44f)
                curveToRelative(0.238f, 0.0f, 0.434f, 0.193f, 0.434f, 0.434f)
                verticalLineToRelative(11.437f)
                arcToRelative(0.436f, 0.436f, 0.0f, false, true, -0.434f, 0.434f)
                lineTo(3.408f, 15.279f)
                arcToRelative(0.432f, 0.432f, 0.0f, false, true, -0.431f, -0.43f)
                close()
                moveTo(20.59f, 7.898f)
                horizontalLineToRelative(-4.367f)
                arcToRelative(0.46f, 0.46f, 0.0f, false, false, -0.123f, 0.026f)
                lineTo(16.1f, 3.408f)
                curveToRelative(0.0f, -0.692f, -0.56f, -1.252f, -1.252f, -1.252f)
                lineTo(3.408f, 2.156f)
                curveToRelative(-0.692f, 0.0f, -1.252f, 0.563f, -1.252f, 1.252f)
                verticalLineToRelative(11.437f)
                curveToRelative(0.0f, 0.692f, 0.56f, 1.252f, 1.252f, 1.252f)
                horizontalLineToRelative(4.535f)
                arcToRelative(0.404f, 0.404f, 0.0f, false, false, -0.044f, 0.18f)
                verticalLineToRelative(4.31f)
                curveToRelative(0.0f, 0.692f, 0.56f, 1.253f, 1.252f, 1.253f)
                horizontalLineToRelative(11.44f)
                curveToRelative(0.691f, 0.0f, 1.252f, -0.56f, 1.252f, -1.252f)
                lineTo(21.843f, 9.15f)
                curveToRelative(0.0f, -0.692f, -0.56f, -1.252f, -1.253f, -1.252f)
                close()
            }
        }
        .build()
        return _copyLight!!
    }

private var _copyLight: ImageVector? = null
