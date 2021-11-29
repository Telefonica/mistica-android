package com.telefonica.mistica.compose.misticaicons.o2.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.o2.FilledGroup

public val FilledGroup.FolderFilled: ImageVector
    get() {
        if (_folderFilled != null) {
            return _folderFilled!!
        }
        _folderFilled = Builder(name = "FolderFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.776f, 5.625f)
                horizontalLineTo(11.52f)
                arcToRelative(0.735f, 0.735f, 0.0f, false, true, -0.52f, -0.227f)
                lineTo(9.26f, 3.636f)
                curveTo(8.852f, 3.223f, 8.26f, 3.0f, 7.668f, 3.0f)
                horizontalLineTo(4.224f)
                curveTo(3.0f, 3.0f, 2.0f, 4.013f, 2.0f, 5.248f)
                verticalLineTo(21.0f)
                horizontalLineToRelative(20.0f)
                verticalLineTo(7.873f)
                curveToRelative(0.0f, -1.236f, -1.0f, -2.248f, -2.224f, -2.248f)
                close()
            }
        }
        .build()
        return _folderFilled!!
    }

private var _folderFilled: ImageVector? = null
