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

public val FilledGroup.FileAviFilled: ImageVector
    get() {
        if (_fileAviFilled != null) {
            return _fileAviFilled!!
        }
        _fileAviFilled = Builder(name = "FileAviFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF313235)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.51f, 2.025f)
                arcToRelative(0.86f, 0.86f, 0.0f, false, true, 0.613f, 0.25f)
                lineTo(21.42f, 7.4f)
                curveToRelative(0.112f, 0.109f, 0.177f, 0.243f, 0.219f, 0.386f)
                curveToRelative(0.03f, 0.073f, 0.047f, 0.154f, 0.047f, 0.238f)
                lineTo(21.686f, 20.33f)
                curveToRelative(0.0f, 0.751f, -0.644f, 1.384f, -1.409f, 1.384f)
                lineTo(8.095f, 21.714f)
                curveToRelative(-0.75f, 0.0f, -1.406f, -0.647f, -1.406f, -1.384f)
                lineToRelative(0.034f, -2.77f)
                horizontalLineToRelative(-2.3f)
                arcToRelative(2.427f, 2.427f, 0.0f, false, true, -2.42f, -2.426f)
                lineTo(2.003f, 11.04f)
                arcToRelative(2.427f, 2.427f, 0.0f, false, true, 2.42f, -2.426f)
                horizontalLineToRelative(2.266f)
                lineTo(6.689f, 3.41f)
                curveToRelative(0.0f, -0.726f, 0.672f, -1.384f, 1.406f, -1.384f)
                horizontalLineToRelative(7.415f)
                close()
                moveTo(14.266f, 9.83f)
                lineTo(4.42f, 9.83f)
                arcToRelative(1.21f, 1.21f, 0.0f, false, false, -1.207f, 1.21f)
                verticalLineToRelative(4.095f)
                curveToRelative(0.0f, 0.667f, 0.54f, 1.21f, 1.207f, 1.21f)
                horizontalLineToRelative(9.846f)
                arcToRelative(1.21f, 1.21f, 0.0f, false, false, 1.207f, -1.21f)
                lineTo(15.473f, 11.04f)
                curveToRelative(0.0f, -0.666f, -0.54f, -1.21f, -1.207f, -1.21f)
                close()
                moveTo(7.134f, 11.396f)
                lineTo(8.465f, 15.079f)
                horizontalLineToRelative(-0.9f)
                lineToRelative(-0.307f, -0.927f)
                lineTo(6.062f, 14.152f)
                lineToRelative(-0.286f, 0.927f)
                horizontalLineToRelative(-0.804f)
                lineToRelative(1.235f, -3.683f)
                horizontalLineToRelative(0.927f)
                close()
                moveTo(9.23f, 11.396f)
                lineTo(10.092f, 14.068f)
                lineTo(10.896f, 11.396f)
                horizontalLineToRelative(0.818f)
                lineToRelative(-1.224f, 3.683f)
                horizontalLineToRelative(-0.877f)
                lineToRelative(-1.282f, -3.683f)
                horizontalLineToRelative(0.899f)
                close()
                moveTo(13.03f, 11.396f)
                verticalLineToRelative(3.683f)
                horizontalLineToRelative(-0.84f)
                verticalLineToRelative(-3.683f)
                horizontalLineToRelative(0.84f)
                close()
                moveTo(6.65f, 12.318f)
                horizontalLineToRelative(-0.011f)
                lineToRelative(-0.384f, 1.226f)
                horizontalLineToRelative(0.798f)
                lineToRelative(-0.403f, -1.226f)
                close()
                moveTo(15.846f, 3.696f)
                verticalLineToRelative(1.764f)
                curveToRelative(0.0f, 0.659f, 0.216f, 1.213f, 0.622f, 1.608f)
                curveToRelative(0.414f, 0.4f, 0.997f, 0.61f, 1.692f, 0.61f)
                horizontalLineToRelative(1.797f)
                lineToRelative(-4.111f, -3.982f)
                close()
            }
        }
        .build()
        return _fileAviFilled!!
    }

private var _fileAviFilled: ImageVector? = null
