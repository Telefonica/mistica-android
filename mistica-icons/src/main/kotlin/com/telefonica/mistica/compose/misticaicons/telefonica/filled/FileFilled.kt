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

public val FilledGroup.FileFilled: ImageVector
    get() {
        if (_fileFilled != null) {
            return _fileFilled!!
        }
        _fileFilled = Builder(name = "FileFilled", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.51f, 2.025f)
                curveToRelative(0.232f, 0.0f, 0.448f, 0.09f, 0.616f, 0.25f)
                lineTo(21.423f, 7.4f)
                curveToRelative(0.11f, 0.109f, 0.174f, 0.243f, 0.216f, 0.386f)
                curveToRelative(0.03f, 0.073f, 0.047f, 0.154f, 0.047f, 0.238f)
                lineTo(21.686f, 20.33f)
                curveToRelative(0.0f, 0.751f, -0.644f, 1.384f, -1.409f, 1.384f)
                lineTo(8.095f, 21.714f)
                curveToRelative(-0.75f, 0.0f, -1.409f, -0.647f, -1.409f, -1.384f)
                lineToRelative(0.034f, -2.773f)
                horizontalLineToRelative(-2.3f)
                arcTo(2.427f, 2.427f, 0.0f, false, true, 2.0f, 15.132f)
                verticalLineToRelative(-4.093f)
                arcToRelative(2.427f, 2.427f, 0.0f, false, true, 2.42f, -2.426f)
                horizontalLineToRelative(2.266f)
                lineTo(6.686f, 3.41f)
                curveToRelative(0.0f, -0.726f, 0.673f, -1.384f, 1.41f, -1.384f)
                horizontalLineToRelative(7.414f)
                close()
                moveTo(14.266f, 9.832f)
                lineTo(4.42f, 9.832f)
                arcToRelative(1.21f, 1.21f, 0.0f, false, false, -1.207f, 1.21f)
                verticalLineToRelative(4.092f)
                curveToRelative(0.0f, 0.667f, 0.54f, 1.21f, 1.207f, 1.21f)
                horizontalLineToRelative(9.846f)
                arcToRelative(1.21f, 1.21f, 0.0f, false, false, 1.207f, -1.21f)
                verticalLineToRelative(-4.092f)
                curveToRelative(0.0f, -0.667f, -0.54f, -1.21f, -1.207f, -1.21f)
                close()
                moveTo(9.022f, 11.193f)
                lineTo(10.395f, 14.997f)
                horizontalLineToRelative(-0.93f)
                lineToRelative(-0.317f, -0.955f)
                lineTo(7.913f, 14.042f)
                lineToRelative(-0.294f, 0.955f)
                horizontalLineToRelative(-0.83f)
                lineToRelative(1.278f, -3.804f)
                horizontalLineToRelative(0.955f)
                close()
                moveTo(11.717f, 11.193f)
                verticalLineToRelative(3.804f)
                horizontalLineToRelative(-0.868f)
                verticalLineToRelative(-3.804f)
                horizontalLineToRelative(0.868f)
                close()
                moveTo(8.524f, 12.143f)
                horizontalLineToRelative(-0.011f)
                lineToRelative(-0.395f, 1.269f)
                horizontalLineToRelative(0.823f)
                lineToRelative(-0.417f, -1.27f)
                close()
                moveTo(15.849f, 3.697f)
                verticalLineToRelative(1.765f)
                curveToRelative(0.0f, 0.658f, 0.215f, 1.213f, 0.622f, 1.608f)
                curveToRelative(0.414f, 0.4f, 0.997f, 0.61f, 1.691f, 0.61f)
                horizontalLineToRelative(1.802f)
                lineToRelative(-4.115f, -3.983f)
                close()
            }
        }
        .build()
        return _fileFilled!!
    }

private var _fileFilled: ImageVector? = null
