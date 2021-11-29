package com.telefonica.mistica.compose.misticaicons.o2.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.telefonica.mistica.compose.misticaicons.o2.RegularGroup

public val RegularGroup.FolderRegular: ImageVector
    get() {
        if (_folderRegular != null) {
            return _folderRegular!!
        }
        _folderRegular = Builder(name = "FolderRegular", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.996f, 21.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(5.252f)
                curveTo(2.0f, 4.012f, 3.0f, 3.0f, 4.224f, 3.0f)
                horizontalLineToRelative(3.443f)
                curveToRelative(0.592f, 0.0f, 1.148f, 0.227f, 1.556f, 0.676f)
                lineToRelative(1.74f, 1.766f)
                curveToRelative(0.147f, 0.15f, 0.331f, 0.227f, 0.52f, 0.227f)
                horizontalLineToRelative(8.293f)
                curveTo(21.0f, 5.669f, 22.0f, 6.68f, 22.0f, 7.92f)
                verticalLineTo(21.0f)
                horizontalLineToRelative(-0.004f)
                close()
                moveTo(3.48f, 19.502f)
                horizontalLineToRelative(17.036f)
                verticalLineTo(7.88f)
                arcToRelative(0.745f, 0.745f, 0.0f, false, false, -0.74f, -0.75f)
                horizontalLineToRelative(-8.258f)
                arcToRelative(2.066f, 2.066f, 0.0f, false, true, -1.556f, -0.676f)
                lineToRelative(-1.74f, -1.761f)
                arcToRelative(0.728f, 0.728f, 0.0f, false, false, -0.52f, -0.227f)
                horizontalLineTo(4.225f)
                arcToRelative(0.749f, 0.749f, 0.0f, false, false, -0.744f, 0.75f)
                verticalLineToRelative(14.286f)
                close()
            }
        }
        .build()
        return _folderRegular!!
    }

private var _folderRegular: ImageVector? = null
