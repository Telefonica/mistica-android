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
                moveTo(3.465f, 5.108f)
                arcToRelative(0.184f, 0.184f, 0.0f, false, false, -0.188f, 0.188f)
                verticalLineToRelative(13.479f)
                curveToRelative(0.0f, 0.106f, 0.082f, 0.187f, 0.188f, 0.187f)
                horizontalLineToRelative(16.76f)
                arcToRelative(0.188f, 0.188f, 0.0f, false, false, 0.187f, -0.187f)
                lineTo(20.412f, 7.492f)
                arcToRelative(0.184f, 0.184f, 0.0f, false, false, -0.188f, -0.188f)
                horizontalLineToRelative(-8.793f)
                arcToRelative(0.638f, 0.638f, 0.0f, false, true, -0.638f, -0.639f)
                verticalLineToRelative(-1.37f)
                arcToRelative(0.184f, 0.184f, 0.0f, false, false, -0.188f, -0.187f)
                horizontalLineToRelative(-7.14f)
                close()
                moveTo(20.225f, 20.237f)
                lineTo(3.464f, 20.237f)
                arcTo(1.466f, 1.466f, 0.0f, false, true, 2.0f, 18.772f)
                lineTo(2.0f, 5.296f)
                curveToRelative(0.0f, -0.807f, 0.655f, -1.463f, 1.465f, -1.463f)
                horizontalLineToRelative(7.14f)
                curveToRelative(0.807f, 0.0f, 1.465f, 0.656f, 1.465f, 1.463f)
                verticalLineToRelative(0.73f)
                horizontalLineToRelative(8.154f)
                curveToRelative(0.807f, 0.0f, 1.462f, 0.656f, 1.462f, 1.463f)
                verticalLineToRelative(11.286f)
                curveToRelative(0.0f, 0.806f, -0.655f, 1.462f, -1.462f, 1.462f)
                close()
            }
        }
        .build()
        return _folderRegular!!
    }

private var _folderRegular: ImageVector? = null
