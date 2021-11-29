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

public val LightGroup.FolderLight: ImageVector
    get() {
        if (_folderLight != null) {
            return _folderLight!!
        }
        _folderLight = Builder(name = "FolderLight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.51f, 20.168f)
                horizontalLineTo(3.407f)
                arcToRelative(1.266f, 1.266f, 0.0f, false, true, -1.252f, -1.257f)
                verticalLineTo(5.07f)
                arcToRelative(1.262f, 1.262f, 0.0f, false, true, 1.252f, -1.258f)
                horizontalLineToRelative(7.289f)
                curveToRelative(0.336f, -0.006f, 0.658f, 0.126f, 0.899f, 0.361f)
                curveToRelative(0.24f, 0.235f, 0.375f, 0.56f, 0.378f, 0.896f)
                verticalLineToRelative(0.995f)
                horizontalLineToRelative(8.538f)
                curveToRelative(0.336f, -0.006f, 0.658f, 0.126f, 0.9f, 0.361f)
                curveToRelative(0.24f, 0.235f, 0.375f, 0.56f, 0.377f, 0.896f)
                verticalLineToRelative(11.586f)
                arcToRelative(1.269f, 1.269f, 0.0f, false, true, -1.28f, 1.26f)
                close()
                moveTo(3.407f, 4.633f)
                arcToRelative(0.437f, 0.437f, 0.0f, false, false, -0.434f, 0.437f)
                verticalLineToRelative(13.84f)
                curveToRelative(0.0f, 0.242f, 0.193f, 0.438f, 0.434f, 0.438f)
                horizontalLineToRelative(17.104f)
                arcToRelative(0.437f, 0.437f, 0.0f, false, false, 0.431f, -0.437f)
                verticalLineTo(7.325f)
                arcToRelative(0.437f, 0.437f, 0.0f, false, false, -0.431f, -0.437f)
                horizontalLineToRelative(-9.0f)
                arcToRelative(0.41f, 0.41f, 0.0f, false, true, -0.409f, -0.411f)
                verticalLineTo(5.07f)
                arcToRelative(0.436f, 0.436f, 0.0f, false, false, -0.409f, -0.437f)
                horizontalLineTo(3.408f)
                close()
            }
        }
        .build()
        return _folderLight!!
    }

private var _folderLight: ImageVector? = null
