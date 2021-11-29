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

public val LightGroup.BookmarkLight: ImageVector
    get() {
        if (_bookmarkLight != null) {
            return _bookmarkLight!!
        }
        _bookmarkLight = Builder(name = "BookmarkLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.36f, 20.554f)
                arcToRelative(0.44f, 0.44f, 0.0f, false, true, -0.255f, 0.4f)
                curveToRelative(-0.157f, 0.079f, -0.336f, 0.06f, -0.431f, -0.008f)
                lineToRelative(-3.687f, -3.636f)
                arcToRelative(1.309f, 1.309f, 0.0f, false, false, -0.918f, -0.372f)
                curveToRelative(-0.33f, 0.0f, -0.667f, 0.123f, -0.922f, 0.372f)
                lineToRelative(-3.664f, 3.603f)
                arcToRelative(0.452f, 0.452f, 0.0f, false, true, -0.473f, 0.044f)
                arcToRelative(0.437f, 0.437f, 0.0f, false, true, -0.252f, -0.4f)
                lineTo(6.758f, 3.442f)
                curveToRelative(0.0f, -0.247f, 0.201f, -0.445f, 0.45f, -0.445f)
                horizontalLineToRelative(9.704f)
                curveToRelative(0.25f, 0.0f, 0.45f, 0.198f, 0.45f, 0.445f)
                verticalLineToRelative(17.112f)
                horizontalLineToRelative(-0.002f)
                close()
                moveTo(16.91f, 2.156f)
                lineTo(7.205f, 2.156f)
                curveToRelative(-0.717f, 0.0f, -1.3f, 0.577f, -1.3f, 1.283f)
                verticalLineToRelative(17.115f)
                curveToRelative(0.0f, 0.493f, 0.278f, 0.936f, 0.726f, 1.154f)
                curveToRelative(0.448f, 0.219f, 0.972f, 0.168f, 1.409f, -0.168f)
                lineToRelative(3.703f, -3.633f)
                arcToRelative(0.464f, 0.464f, 0.0f, false, true, 0.644f, -0.006f)
                lineToRelative(3.731f, 3.673f)
                arcToRelative(1.304f, 1.304f, 0.0f, false, false, 1.37f, 0.131f)
                curveToRelative(0.448f, -0.218f, 0.725f, -0.66f, 0.725f, -1.154f)
                lineTo(18.213f, 3.436f)
                arcToRelative(1.302f, 1.302f, 0.0f, false, false, -1.305f, -1.28f)
                close()
            }
        }
        .build()
        return _bookmarkLight!!
    }

private var _bookmarkLight: ImageVector? = null
