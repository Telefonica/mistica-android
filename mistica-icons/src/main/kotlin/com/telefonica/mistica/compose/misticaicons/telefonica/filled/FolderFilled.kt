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
                moveTo(20.406f, 6.038f)
                horizontalLineToRelative(-8.563f)
                verticalLineToRelative(-0.991f)
                arcToRelative(1.264f, 1.264f, 0.0f, false, false, -1.272f, -1.255f)
                horizontalLineTo(3.255f)
                arcTo(1.262f, 1.262f, 0.0f, false, false, 2.0f, 5.047f)
                verticalLineToRelative(13.795f)
                curveToRelative(0.006f, 0.692f, 0.563f, 1.25f, 1.255f, 1.255f)
                horizontalLineToRelative(17.151f)
                arcToRelative(1.264f, 1.264f, 0.0f, false, false, 1.28f, -1.247f)
                verticalLineTo(7.293f)
                arcToRelative(1.264f, 1.264f, 0.0f, false, false, -1.272f, -1.255f)
                horizontalLineToRelative(-0.008f)
                close()
            }
        }
        .build()
        return _folderFilled!!
    }

private var _folderFilled: ImageVector? = null
